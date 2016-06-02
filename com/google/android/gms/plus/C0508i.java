package com.google.android.gms.plus;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.google.android.gms.C0338e;

/* renamed from: com.google.android.gms.plus.i */
class C0508i implements C0506k {
    private Context f2178a;

    private C0508i(Context context) {
        this.f2178a = context;
    }

    public Drawable m4496a(int i) {
        try {
            String str;
            Resources resources = this.f2178a.createPackageContext("com.google.android.gms", 4).getResources();
            String str2 = "com.google.android.gms";
            switch (i) {
                case C0338e.MapAttrs_mapType /*0*/:
                    str = "ic_plusone_small";
                    break;
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    str = "ic_plusone_medium";
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    str = "ic_plusone_tall";
                    break;
                default:
                    str = "ic_plusone_standard";
                    break;
            }
            return resources.getDrawable(resources.getIdentifier(str, "drawable", str2));
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    public boolean m4497a() {
        try {
            this.f2178a.createPackageContext("com.google.android.gms", 4).getResources();
            return true;
        } catch (NameNotFoundException e) {
            return false;
        }
    }
}
