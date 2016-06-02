package com.google.android.gms.plus;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.gms.C0338e;

/* renamed from: com.google.android.gms.plus.j */
class C0509j implements C0506k {
    private Context f2179a;

    private C0509j(Context context) {
        this.f2179a = context;
    }

    public Drawable m4498a(int i) {
        String str;
        switch (i) {
            case C0338e.MapAttrs_mapType /*0*/:
                str = "ic_plusone_small_off_client";
                break;
            case C0338e.MapAttrs_cameraBearing /*1*/:
                str = "ic_plusone_medium_off_client";
                break;
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                str = "ic_plusone_tall_off_client";
                break;
            default:
                str = "ic_plusone_standard_off_client";
                break;
        }
        return this.f2179a.getResources().getDrawable(this.f2179a.getResources().getIdentifier(str, "drawable", this.f2179a.getPackageName()));
    }

    public boolean m4499a() {
        return (this.f2179a.getResources().getIdentifier("ic_plusone_small_off_client", "drawable", this.f2179a.getPackageName()) == 0 || this.f2179a.getResources().getIdentifier("ic_plusone_medium_off_client", "drawable", this.f2179a.getPackageName()) == 0 || this.f2179a.getResources().getIdentifier("ic_plusone_tall_off_client", "drawable", this.f2179a.getPackageName()) == 0 || this.f2179a.getResources().getIdentifier("ic_plusone_standard_off_client", "drawable", this.f2179a.getPackageName()) == 0) ? false : true;
    }
}
