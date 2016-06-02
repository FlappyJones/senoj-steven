package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.C0318c;
import com.google.android.gms.common.C0319d;
import com.google.android.gms.plus.C0499a;
import com.google.android.gms.plus.p021a.p023b.C0393a;

public class bd extends cr {
    private C0393a f1729f;
    private C0499a f1730g;

    public bd(Context context, C0499a c0499a, C0318c c0318c, C0319d c0319d) {
        super(context, c0318c, c0319d, c0499a.m4477c());
        this.f1730g = c0499a;
    }

    protected ba m3260a(IBinder iBinder) {
        return bb.m3193a(iBinder);
    }

    protected void m3261a(int i, IBinder iBinder, Bundle bundle) {
        if (i == 0 && bundle != null && bundle.containsKey("loaded_person")) {
            this.f1729f = cc.m3528a(bundle.getByteArray("loaded_person"));
        }
        super.m3241a(i, iBinder, bundle);
    }

    protected void m3262a(df dfVar, cu cuVar) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("skip_oob", false);
        bundle.putStringArray("request_visible_actions", this.f1730g.m4478d());
        if (this.f1730g.m4479e() != null) {
            bundle.putStringArray("required_features", this.f1730g.m4479e());
        }
        if (this.f1730g.m4482h() != null) {
            bundle.putString("application_name", this.f1730g.m4482h());
        }
        dfVar.m3657a(cuVar, 3265100, this.f1730g.m4481g(), this.f1730g.m4480f(), m3256k(), this.f1730g.m4476b(), bundle);
    }

    protected /* synthetic */ IInterface m3263b(IBinder iBinder) {
        return m3260a(iBinder);
    }

    protected String m3264c() {
        return "com.google.android.gms.plus.service.START";
    }

    protected String m3265d() {
        return "com.google.android.gms.plus.internal.IPlusService";
    }
}
