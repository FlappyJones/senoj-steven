package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.C0317a;
import com.google.android.gms.common.C0318c;
import com.google.android.gms.common.C0319d;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.p020a.C0340a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.r */
public final class C0407r extends cr {
    private final String f1972f;
    private final String f1973g;
    private final Map f1974h;
    private PlayerEntity f1975i;
    private final ai f1976j;
    private boolean f1977k;
    private final Binder f1978l;
    private final long f1979m;
    private final boolean f1980n;

    public C0407r(Context context, String str, String str2, C0318c c0318c, C0319d c0319d, String[] strArr, int i, View view, boolean z) {
        super(context, c0318c, c0319d, strArr);
        this.f1977k = false;
        this.f1972f = str;
        this.f1973g = (String) C0394do.m3687a((Object) str2);
        this.f1978l = new Binder();
        this.f1974h = new HashMap();
        this.f1976j = ai.m3075a(this, i);
        m3784a(view);
        this.f1979m = (long) hashCode();
        this.f1980n = z;
    }

    private void m3777o() {
        this.f1975i = null;
    }

    private void m3778p() {
        for (an a : this.f1974h.values()) {
            try {
                a.m3100a();
            } catch (Throwable e) {
                C0412w.m3807a("GamesClient", "IOException:", e);
            }
        }
        this.f1974h.clear();
    }

    public Intent m3779a(String str) {
        m3258m();
        Intent intent = new Intent("com.google.android.gms.games.VIEW_LEADERBOARD_SCORES");
        intent.putExtra("com.google.android.gms.games.LEADERBOARD_ID", str);
        intent.addFlags(67108864);
        return C0411v.m3805a(intent);
    }

    protected ad m3780a(IBinder iBinder) {
        return af.m2985a(iBinder);
    }

    public void m3781a() {
        m3777o();
        super.m3240a();
    }

    protected void m3782a(int i, IBinder iBinder, Bundle bundle) {
        if (i == 0 && bundle != null) {
            this.f1977k = bundle.getBoolean("show_welcome_popup");
        }
        super.m3241a(i, iBinder, bundle);
    }

    public void m3783a(IBinder iBinder, Bundle bundle) {
        if (m3253h()) {
            try {
                ((ad) m3259n()).m2876a(iBinder, bundle);
            } catch (RemoteException e) {
                C0412w.m3806a("GamesClient", "service died");
            }
        }
    }

    public void m3784a(View view) {
        this.f1976j.m3078a(view);
    }

    protected void m3785a(C0317a c0317a) {
        super.m3242a(c0317a);
        this.f1977k = false;
    }

    public void m3786a(C0340a c0340a, String str, long j) {
        if (c0340a == null) {
            C0365y c0365y = null;
        } else {
            Object c0408s = new C0408s(this, c0340a);
        }
        try {
            ((ad) m3259n()).m2889a(c0365y, str, j);
        } catch (RemoteException e) {
            C0412w.m3806a("GamesClient", "service died");
        }
    }

    protected void m3787a(df dfVar, cu cuVar) {
        String locale = m3255j().getResources().getConfiguration().locale.toString();
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.games.key.isHeadless", this.f1980n);
        dfVar.m3658a(cuVar, 3265100, m3255j().getPackageName(), this.f1973g, m3256k(), this.f1972f, this.f1976j.m3079b(), locale, bundle);
    }

    protected void m3788a(String... strArr) {
        int i = 0;
        boolean z = false;
        for (String str : strArr) {
            if (str.equals("https://www.googleapis.com/auth/games")) {
                z = true;
            } else if (str.equals("https://www.googleapis.com/auth/games.firstparty")) {
                i = 1;
            }
        }
        if (i != 0) {
            C0394do.m3690a(!z, String.format("Cannot have both %s and %s!", new Object[]{"https://www.googleapis.com/auth/games", "https://www.googleapis.com/auth/games.firstparty"}));
            return;
        }
        C0394do.m3690a(z, String.format("GamesClient requires %s to function.", new Object[]{"https://www.googleapis.com/auth/games"}));
    }

    protected /* synthetic */ IInterface m3789b(IBinder iBinder) {
        return m3780a(iBinder);
    }

    public void m3790b() {
        this.f1977k = false;
        if (m3253h()) {
            try {
                ad adVar = (ad) m3259n();
                adVar.m2916c();
                adVar.m2903b(this.f1979m);
                adVar.m2875a(this.f1979m);
            } catch (RemoteException e) {
                C0412w.m3806a("GamesClient", "Failed to notify client disconnect.");
            }
        }
        m3778p();
        super.m3247b();
    }

    protected String m3791c() {
        return "com.google.android.gms.games.service.START";
    }

    protected String m3792d() {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    protected Bundle m3793e() {
        try {
            Bundle b = ((ad) m3259n()).m2901b();
            if (b == null) {
                return b;
            }
            b.setClassLoader(C0407r.class.getClassLoader());
            return b;
        } catch (RemoteException e) {
            C0412w.m3806a("GamesClient", "service died");
            return null;
        }
    }

    protected void m3794f() {
        super.m3252f();
        if (this.f1977k) {
            this.f1976j.m3076a();
            this.f1977k = false;
        }
    }

    public void m3795g() {
        if (m3253h()) {
            try {
                ((ad) m3259n()).m2916c();
            } catch (RemoteException e) {
                C0412w.m3806a("GamesClient", "service died");
            }
        }
    }
}
