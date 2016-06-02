package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import com.google.android.gms.C0338e;
import com.google.android.gms.internal.dl;

/* renamed from: com.google.android.gms.common.a */
public final class C0317a {
    public static final C0317a f1507a;
    private final PendingIntent f1508b;
    private final int f1509c;

    static {
        f1507a = new C0317a(0, null);
    }

    public C0317a(int i, PendingIntent pendingIntent) {
        this.f1509c = i;
        this.f1508b = pendingIntent;
    }

    private String m2406c() {
        switch (this.f1509c) {
            case C0338e.MapAttrs_mapType /*0*/:
                return "SUCCESS";
            case C0338e.MapAttrs_cameraBearing /*1*/:
                return "SERVICE_MISSING";
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case C0338e.MapAttrs_cameraTargetLng /*3*/:
                return "SERVICE_DISABLED";
            case C0338e.MapAttrs_cameraTilt /*4*/:
                return "SIGN_IN_REQUIRED";
            case C0338e.MapAttrs_cameraZoom /*5*/:
                return "INVALID_ACCOUNT";
            case C0338e.MapAttrs_uiCompass /*6*/:
                return "RESOLUTION_REQUIRED";
            case C0338e.MapAttrs_uiRotateGestures /*7*/:
                return "NETWORK_ERROR";
            case C0338e.MapAttrs_uiScrollGestures /*8*/:
                return "INTERNAL_ERROR";
            case C0338e.MapAttrs_uiTiltGestures /*9*/:
                return "SERVICE_INVALID";
            case C0338e.MapAttrs_uiZoomControls /*10*/:
                return "DEVELOPER_ERROR";
            case C0338e.MapAttrs_uiZoomGestures /*11*/:
                return "LICENSE_CHECK_FAILED";
            default:
                return "unknown status code " + this.f1509c;
        }
    }

    public void m2407a(Activity activity, int i) {
        if (m2408a()) {
            activity.startIntentSenderForResult(this.f1508b.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    public boolean m2408a() {
        return (this.f1509c == 0 || this.f1508b == null) ? false : true;
    }

    public int m2409b() {
        return this.f1509c;
    }

    public String toString() {
        return dl.m3684a((Object) this).m3686a("statusCode", m2406c()).m3686a("resolution", this.f1508b).toString();
    }
}
