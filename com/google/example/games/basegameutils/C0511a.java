package com.google.example.games.basegameutils;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.C0317a;
import com.google.android.gms.common.C0318c;
import com.google.android.gms.common.C0319d;
import com.google.android.gms.common.C0327f;
import com.google.android.gms.games.C0346c;
import com.google.android.gms.games.C0349f;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.p018a.C0299a;
import com.google.android.gms.p018a.C0301c;
import com.google.android.gms.plus.C0500b;
import com.google.android.gms.plus.C0501c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Vector;

/* renamed from: com.google.example.games.basegameutils.a */
public class C0511a implements C0318c, C0319d {
    public static final String[] f2185a;
    int f2186b;
    boolean f2187c;
    Activity f2188d;
    String[] f2189e;
    C0346c f2190f;
    C0500b f2191g;
    C0299a f2192h;
    int f2193i;
    int f2194j;
    int f2195k;
    boolean f2196l;
    boolean f2197m;
    C0317a f2198n;
    C0512c f2199o;
    boolean f2200p;
    String f2201q;
    String f2202r;
    C0128b f2203s;

    static {
        f2185a = new String[]{"UNCONFIGURED", "DISCONNECTED", "CONNECTING", "CONNECTED"};
    }

    public C0511a(Activity activity) {
        this.f2186b = 0;
        this.f2187c = false;
        this.f2188d = null;
        this.f2190f = null;
        this.f2191g = null;
        this.f2192h = null;
        this.f2193i = 0;
        this.f2194j = 0;
        this.f2195k = 0;
        this.f2196l = true;
        this.f2197m = false;
        this.f2198n = null;
        this.f2199o = null;
        this.f2200p = false;
        this.f2201q = "GameHelper";
        this.f2203s = null;
        this.f2188d = activity;
    }

    static String m4503b(int i) {
        switch (i) {
            case -1:
                return "RESULT_OK";
            case C0338e.MapAttrs_mapType /*0*/:
                return "RESULT_CANCELED";
            case 10001:
                return "RESULT_RECONNECT_REQUIRED";
            case 10002:
                return "SIGN_IN_FAILED";
            case 10003:
                return "RESULT_LICENSE_FAILED";
            case 10004:
                return "RESULT_APP_MISCONFIGURED";
            case 10005:
                return "RESULT_LEFT_ROOM";
            default:
                return String.valueOf(i);
        }
    }

    static String m4504c(int i) {
        switch (i) {
            case C0338e.MapAttrs_mapType /*0*/:
                return "SUCCESS(" + i + ")";
            case C0338e.MapAttrs_cameraBearing /*1*/:
                return "SERVICE_MISSING(" + i + ")";
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                return "SERVICE_VERSION_UPDATE_REQUIRED(" + i + ")";
            case C0338e.MapAttrs_cameraTargetLng /*3*/:
                return "SERVICE_DISABLED(" + i + ")";
            case C0338e.MapAttrs_cameraTilt /*4*/:
                return "SIGN_IN_REQUIRED(" + i + ")";
            case C0338e.MapAttrs_cameraZoom /*5*/:
                return "INVALID_ACCOUNT(" + i + ")";
            case C0338e.MapAttrs_uiCompass /*6*/:
                return "RESOLUTION_REQUIRED(" + i + ")";
            case C0338e.MapAttrs_uiRotateGestures /*7*/:
                return "NETWORK_ERROR(" + i + ")";
            case C0338e.MapAttrs_uiScrollGestures /*8*/:
                return "INTERNAL_ERROR(" + i + ")";
            case C0338e.MapAttrs_uiTiltGestures /*9*/:
                return "SERVICE_INVALID(" + i + ")";
            case C0338e.MapAttrs_uiZoomControls /*10*/:
                return "DEVELOPER_ERROR(" + i + ")";
            case C0338e.MapAttrs_uiZoomGestures /*11*/:
                return "LICENSE_CHECK_FAILED(" + i + ")";
            default:
                return "Unknown error code " + i;
        }
    }

    public void m4505a() {
        m4520c("onDisconnected.");
        if (this.f2186b == 1) {
            m4520c("onDisconnected is expected, so no action taken.");
            return;
        }
        m4523d("Unexpectedly disconnected. Severing remaining connections.");
        m4524e();
        this.f2199o = null;
        m4520c("Making extraordinary call to onSignInFailed callback");
        m4515a(false);
    }

    void m4506a(int i) {
        String str = f2185a[this.f2186b];
        String str2 = f2185a[i];
        this.f2186b = i;
        m4520c("State change " + str + " -> " + str2);
    }

    public void m4507a(int i, int i2, Intent intent) {
        m4520c("onActivityResult: req=" + (i == 9001 ? "RC_RESOLVE" : String.valueOf(i)) + ", resp=" + C0511a.m4503b(i2));
        if (i != 9001) {
            m4520c("onActivityResult: request code not meant for us. Ignoring.");
            return;
        }
        this.f2187c = false;
        if (this.f2186b != 2) {
            m4520c("onActivityResult: ignoring because state isn't STATE_CONNECTING (it's " + f2185a[this.f2186b] + ")");
        } else if (i2 == -1) {
            m4520c("onAR: Resolution was RESULT_OK, so connecting current client again.");
            m4530j();
        } else if (i2 == 10001) {
            m4520c("onAR: Resolution was RECONNECT_REQUIRED, so reconnecting.");
            m4530j();
        } else if (i2 == 0) {
            m4520c("onAR: Got a cancellation result, so disconnecting.");
            this.f2196l = false;
            this.f2197m = false;
            this.f2199o = null;
            m4524e();
            m4515a(false);
        } else {
            m4520c("onAR: responseCode=" + C0511a.m4503b(i2) + ", so giving up.");
            m4512a(new C0512c(this.f2198n.m2409b(), i2));
        }
    }

    public void m4508a(Activity activity) {
        this.f2188d = activity;
        m4520c("onStart, state = " + f2185a[this.f2186b]);
        m4513a("onStart");
        switch (this.f2186b) {
            case C0338e.MapAttrs_cameraBearing /*1*/:
                if (this.f2196l) {
                    m4520c("onStart: Now connecting clients.");
                    m4528h();
                    return;
                }
                m4520c("onStart: Not connecting (user specifically signed out).");
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                m4520c("onStart: connection process in progress, no action taken.");
            case C0338e.MapAttrs_cameraTargetLng /*3*/:
                m4520c("onStart: already connected (unusual, but ok).");
            default:
                String str = "onStart: BUG: unexpected state " + f2185a[this.f2186b];
                m4525e(str);
                throw new IllegalStateException(str);
        }
    }

    public void m4509a(Bundle bundle) {
        m4520c("onConnected: connected! client=" + this.f2195k);
        this.f2194j |= this.f2195k;
        m4520c("Connected clients updated to: " + this.f2194j);
        if (this.f2195k == 1 && bundle != null) {
            m4520c("onConnected: connection hint provided. Checking for invite.");
            Invitation invitation = (Invitation) bundle.getParcelable("invitation");
            if (!(invitation == null || invitation.m2650c() == null)) {
                m4520c("onConnected: connection hint has a room invite!");
                this.f2202r = invitation.m2650c();
                m4520c("Invitation ID: " + this.f2202r);
            }
            m4520c("onConnected: connection hint provided. Checking for TBMP game.");
        }
        m4529i();
    }

    public void m4510a(C0317a c0317a) {
        m4520c("onConnectionFailed");
        this.f2198n = c0317a;
        m4520c("Connection failure:");
        m4520c("   - code: " + C0511a.m4504c(this.f2198n.m2409b()));
        m4520c("   - resolvable: " + this.f2198n.m2408a());
        m4520c("   - details: " + this.f2198n.toString());
        if (this.f2197m) {
            m4520c("onConnectionFailed: since user initiated sign-in, resolving problem.");
            m4532l();
            return;
        }
        m4520c("onConnectionFailed: since user didn't initiate sign-in, failing now.");
        this.f2198n = c0317a;
        m4506a(1);
        m4515a(false);
    }

    public void m4511a(C0128b c0128b, int i, String... strArr) {
        int i2 = 0;
        if (this.f2186b != 0) {
            String str = "GameHelper: you called GameHelper.setup() twice. You can only call it once.";
            m4525e(str);
            throw new IllegalStateException(str);
        }
        this.f2203s = c0128b;
        this.f2193i = i;
        m4520c("Setup: requested clients: " + this.f2193i);
        Vector vector = new Vector();
        if ((i & 1) != 0) {
            vector.add("https://www.googleapis.com/auth/games");
        }
        if ((i & 2) != 0) {
            vector.add("https://www.googleapis.com/auth/plus.login");
        }
        if ((i & 4) != 0) {
            vector.add("https://www.googleapis.com/auth/appstate");
        }
        if (strArr != null) {
            for (Object add : strArr) {
                vector.add(add);
            }
        }
        this.f2189e = new String[vector.size()];
        vector.copyInto(this.f2189e);
        m4520c("setup: scopes:");
        String[] strArr2 = this.f2189e;
        int length = strArr2.length;
        while (i2 < length) {
            m4520c("  - " + strArr2[i2]);
            i2++;
        }
        if ((i & 1) != 0) {
            m4520c("setup: creating GamesClient");
            this.f2190f = new C0349f(m4527g(), this, this).m2642a(49).m2643a(this.f2189e).m2641a();
        }
        if ((i & 2) != 0) {
            m4520c("setup: creating GamesPlusClient");
            this.f2191g = new C0501c(m4527g(), this, this).m4487a(this.f2189e).m4486a();
        }
        if ((i & 4) != 0) {
            m4520c("setup: creating AppStateClient");
            this.f2192h = new C0301c(m4527g(), this, this).m2386a(this.f2189e).m2385a();
        }
        m4506a(1);
    }

    void m4512a(C0512c c0512c) {
        m4517a(1002, "giveUp", "giveUp should only be called when connecting. Proceeding anyway.", 2);
        this.f2196l = false;
        m4524e();
        this.f2199o = c0512c;
        m4533m();
        m4515a(false);
    }

    void m4513a(String str) {
        if (this.f2186b == 0) {
            String str2 = "GameHelper error: Operation attempted without setup: " + str + ". The setup() method must be called before attempting any other operation.";
            m4525e(str2);
            throw new IllegalStateException(str2);
        }
    }

    void m4514a(StringBuilder stringBuilder, byte b) {
        int i;
        if (b < null) {
            i = b + 256;
        }
        int i2 = i / 16;
        int i3 = i % 16;
        stringBuilder.append("0123456789ABCDEF".substring(i2, i2 + 1));
        stringBuilder.append("0123456789ABCDEF".substring(i3, i3 + 1));
    }

    void m4515a(boolean z) {
        StringBuilder stringBuilder = new StringBuilder("Notifying LISTENER of sign-in ");
        String str = z ? "SUCCESS" : this.f2199o != null ? "FAILURE (error)" : "FAILURE (no error)";
        m4520c(stringBuilder.append(str).toString());
        if (this.f2203s == null) {
            return;
        }
        if (z) {
            this.f2203s.m1127k();
        } else {
            this.f2203s.m1126j();
        }
    }

    public void m4516a(boolean z, String str) {
        this.f2200p = z;
        this.f2201q = str;
        if (z) {
            m4520c("Debug log enabled, tag: " + str);
        }
    }

    boolean m4517a(int i, String str, String str2, int... iArr) {
        for (int i2 : iArr) {
            if (this.f2186b == i2) {
                return true;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (i == 1001) {
            stringBuilder.append("GameHelper: you attempted an operation at an invalid. ");
        } else {
            stringBuilder.append("GameHelper: bug detected. Please report it at our bug tracker ");
            stringBuilder.append("https://github.com/playgameservices/android-samples/issues. ");
            stringBuilder.append("Please include the last couple hundred lines of logcat output ");
            stringBuilder.append("and describe the operation that caused this. ");
        }
        stringBuilder.append("Explanation: ").append(str2);
        stringBuilder.append("Operation: ").append(str).append(". ");
        stringBuilder.append("State: ").append(f2185a[this.f2186b]).append(". ");
        if (iArr.length == 1) {
            stringBuilder.append("Expected state: ").append(f2185a[iArr[0]]).append(".");
        } else {
            stringBuilder.append("Expected states:");
            for (int i22 : iArr) {
                stringBuilder.append(" ").append(f2185a[i22]);
            }
            stringBuilder.append(".");
        }
        m4523d(stringBuilder.toString());
        return false;
    }

    Dialog m4518b(String str) {
        return new Builder(m4527g()).setMessage(str).setNeutralButton(17039370, null).create();
    }

    public C0346c m4519b() {
        if (this.f2190f != null) {
            return this.f2190f;
        }
        throw new IllegalStateException("No GamesClient. Did you request it at setup?");
    }

    void m4520c(String str) {
        if (this.f2200p) {
            Log.d(this.f2201q, "GameHelper: " + str);
        }
    }

    public boolean m4521c() {
        return this.f2186b == 3;
    }

    public void m4522d() {
        m4520c("onStop, state = " + f2185a[this.f2186b]);
        m4513a("onStop");
        switch (this.f2186b) {
            case C0338e.MapAttrs_cameraBearing /*1*/:
                m4520c("onStop: not connected, so no action taken.");
                break;
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
            case C0338e.MapAttrs_cameraTargetLng /*3*/:
                m4520c("onStop: Killing connections");
                m4524e();
                break;
            default:
                String str = "onStop: BUG: unexpected state " + f2185a[this.f2186b];
                m4525e(str);
                throw new IllegalStateException(str);
        }
        this.f2188d = null;
    }

    void m4523d(String str) {
        Log.w(this.f2201q, "!!! GameHelper WARNING: " + str);
    }

    void m4524e() {
        if (m4517a(1002, "killConnections", "killConnections() should only get called while connected or connecting.", 3, 2)) {
            m4520c("killConnections: killing connections.");
            this.f2198n = null;
            this.f2199o = null;
            if (this.f2190f != null && this.f2190f.m2632b()) {
                m4520c("Disconnecting GamesClient.");
                this.f2190f.m2633c();
            }
            if (this.f2191g != null && this.f2191g.m4484b()) {
                m4520c("Disconnecting PlusClient.");
                this.f2191g.m4485c();
            }
            if (this.f2192h != null && this.f2192h.m2383b()) {
                m4520c("Disconnecting AppStateClient.");
                this.f2192h.m2384c();
            }
            this.f2194j = 0;
            m4520c("killConnections: all clients disconnected.");
            m4506a(1);
        }
    }

    void m4525e(String str) {
        Log.e(this.f2201q, "*** GameHelper ERROR: " + str);
    }

    public void m4526f() {
        if (this.f2186b == 3) {
            m4523d("beginUserInitiatedSignIn() called when already connected. Calling listener directly to notify of success.");
            m4515a(true);
        } else if (this.f2186b == 2) {
            m4523d("beginUserInitiatedSignIn() called when already connecting. Be patient! You can only call this method after you get an onSignInSucceeded() or onSignInFailed() callback. Suggestion: disable the sign-in button on startup and also when it's clicked, and re-enable when you get the callback.");
        } else {
            m4520c("Starting USER-INITIATED sign-in flow.");
            this.f2196l = true;
            int a = C0327f.m2439a(m4527g());
            m4520c("isGooglePlayServicesAvailable returned " + a);
            if (a != 0) {
                m4520c("Google Play services not available. Show error dialog.");
                this.f2199o = new C0512c(a, 0);
                m4533m();
                m4515a(false);
                return;
            }
            this.f2197m = true;
            if (this.f2198n != null) {
                m4520c("beginUserInitiatedSignIn: continuing pending sign-in flow.");
                m4506a(2);
                m4532l();
                return;
            }
            m4520c("beginUserInitiatedSignIn: starting new sign-in flow.");
            m4528h();
        }
    }

    Context m4527g() {
        return this.f2188d;
    }

    void m4528h() {
        if (m4517a(1002, "startConnections", "startConnections should only get called when disconnected.", 1)) {
            m4520c("Starting connections.");
            m4506a(2);
            this.f2202r = null;
            m4529i();
        }
    }

    void m4529i() {
        m4520c("connectNextClient: requested clients: " + this.f2193i + ", connected clients: " + this.f2194j);
        if (this.f2190f != null && this.f2190f.m2632b() && (this.f2194j & 1) == 0) {
            m4523d("GamesClient was already connected. Fixing.");
            this.f2194j |= 1;
        }
        if (this.f2191g != null && this.f2191g.m4484b() && (this.f2194j & 2) == 0) {
            m4523d("PlusClient was already connected. Fixing.");
            this.f2194j |= 2;
        }
        if (this.f2192h != null && this.f2192h.m2383b() && (this.f2194j & 4) == 0) {
            m4523d("AppStateClient was already connected. Fixing");
            this.f2194j |= 4;
        }
        int i = this.f2193i & (this.f2194j ^ -1);
        m4520c("Pending clients: " + i);
        if (i == 0) {
            m4520c("All clients now connected. Sign-in successful!");
            m4531k();
            return;
        }
        if (this.f2190f != null && (i & 1) != 0) {
            m4520c("Connecting GamesClient.");
            this.f2195k = 1;
        } else if (this.f2191g != null && (i & 2) != 0) {
            m4520c("Connecting PlusClient.");
            this.f2195k = 2;
        } else if (this.f2192h == null || (i & 4) == 0) {
            throw new AssertionError("Not all clients connected, yet no one is next. R=" + this.f2193i + ", C=" + this.f2194j);
        } else {
            m4520c("Connecting AppStateClient.");
            this.f2195k = 4;
        }
        m4530j();
    }

    void m4530j() {
        if (this.f2186b == 1) {
            m4523d("GameHelper got disconnected during connection process. Aborting.");
            return;
        }
        if (m4517a(1002, "connectCurrentClient", "connectCurrentClient should only get called when connecting.", 2)) {
            switch (this.f2195k) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    this.f2190f.m2630a();
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    this.f2191g.m4483a();
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    this.f2192h.m2382a();
                default:
            }
        }
    }

    void m4531k() {
        m4517a(1002, "succeedSignIn", "succeedSignIn should only get called in the connecting or connected state. Proceeding anyway.", 2, 3);
        m4520c("All requested clients connected. Sign-in succeeded!");
        m4506a(3);
        this.f2199o = null;
        this.f2196l = true;
        this.f2197m = false;
        m4515a(true);
    }

    void m4532l() {
        m4517a(1002, "resolveConnectionResult", "resolveConnectionResult should only be called when connecting. Proceeding anyway.", 2);
        if (this.f2187c) {
            m4520c("We're already expecting the result of a previous resolution.");
            return;
        }
        m4520c("resolveConnectionResult: trying to resolve result: " + this.f2198n);
        if (this.f2198n.m2408a()) {
            m4520c("Result has resolution. Starting it.");
            try {
                this.f2187c = true;
                this.f2198n.m2407a(this.f2188d, 9001);
                return;
            } catch (SendIntentException e) {
                m4520c("SendIntentException, so connecting again.");
                m4530j();
                return;
            }
        }
        m4520c("resolveConnectionResult: result has no resolution. Giving up.");
        m4512a(new C0512c(this.f2198n.m2409b()));
    }

    void m4533m() {
        Context g = m4527g();
        if (g == null) {
            m4520c("*** No context. Can't show failure dialog.");
            return;
        }
        Dialog b;
        m4520c("Making error dialog for failure: " + this.f2199o);
        int a = this.f2199o.m4537a();
        switch (this.f2199o.m4538b()) {
            case 10002:
                b = m4518b(g.getString(C0514e.gamehelper_sign_in_failed));
                break;
            case 10003:
                b = m4518b(g.getString(C0514e.gamehelper_license_failed));
                break;
            case 10004:
                b = m4518b(g.getString(C0514e.gamehelper_app_misconfigured));
                m4534n();
                break;
            default:
                b = C0327f.m2440a(a, this.f2188d, 9002, null);
                if (b == null) {
                    m4520c("No standard error dialog available. Making fallback dialog.");
                    b = m4518b(g.getString(C0514e.gamehelper_unknown_error) + " " + C0511a.m4504c(a));
                    break;
                }
                break;
        }
        m4520c("Showing error dialog.");
        b.show();
    }

    void m4534n() {
        m4520c("****");
        m4520c("****");
        m4520c("**** APP NOT CORRECTLY CONFIGURED TO USE GOOGLE PLAY GAME SERVICES");
        m4520c("**** This is usually caused by one of these reasons:");
        m4520c("**** (1) Your package name and certificate fingerprint do not match");
        m4520c("****     the client ID you registered in Developer Console.");
        m4520c("**** (2) Your App ID was incorrectly entered.");
        m4520c("**** (3) Your game settings have not been published and you are ");
        m4520c("****     trying to log in with an account that is not listed as");
        m4520c("****     a test account.");
        m4520c("****");
        if (m4527g() == null) {
            m4520c("*** (no Context, so can't print more debug info)");
            return;
        }
        m4520c("**** To help you debug, here is the information about this app");
        m4520c("**** Package name         : " + m4527g().getPackageName());
        m4520c("**** Cert SHA1 fingerprint: " + m4536p());
        m4520c("**** App ID from          : " + m4535o());
        m4520c("****");
        m4520c("**** Check that the above information matches your setup in ");
        m4520c("**** Developer Console. Also, check that you're logging in with the");
        m4520c("**** right account (it should be listed in the Testers section if");
        m4520c("**** your project is not yet published).");
        m4520c("****");
        m4520c("**** For more information, refer to the troubleshooting guide:");
        m4520c("****   http://developers.google.com/games/services/android/troubleshooting");
    }

    String m4535o() {
        try {
            Resources resources = m4527g().getResources();
            return resources.getString(resources.getIdentifier("app_id", "string", m4527g().getPackageName()));
        } catch (Exception e) {
            e.printStackTrace();
            return "??? (failed to retrieve APP ID)";
        }
    }

    String m4536p() {
        try {
            Signature[] signatureArr = m4527g().getPackageManager().getPackageInfo(m4527g().getPackageName(), 64).signatures;
            if (signatureArr.length == 0) {
                return "ERROR: NO SIGNATURE.";
            }
            if (signatureArr.length > 1) {
                return "ERROR: MULTIPLE SIGNATURES";
            }
            byte[] digest = MessageDigest.getInstance("SHA1").digest(signatureArr[0].toByteArray());
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < digest.length; i++) {
                if (i > 0) {
                    stringBuilder.append(":");
                }
                m4514a(stringBuilder, digest[i]);
            }
            return stringBuilder.toString();
        } catch (NameNotFoundException e) {
            e.printStackTrace();
            return "(ERROR: package not found)";
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return "(ERROR: SHA1 algorithm not found)";
        }
    }
}
