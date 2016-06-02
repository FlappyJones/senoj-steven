package com.google.analytics.p012a.p013a;

import com.google.android.gms.C0338e;
import com.google.tagmanager.p014a.ad;
import com.google.tagmanager.p014a.ae;

/* renamed from: com.google.analytics.a.a.f */
public enum C0263f implements ad {
    NO_CACHE(0, 1),
    PRIVATE(1, 2),
    PUBLIC(2, 3);
    
    private static ae f1315d;
    private final int f1317e;

    static {
        f1315d = new C0264g();
    }

    private C0263f(int i, int i2) {
        this.f1317e = i2;
    }

    public static C0263f m1942a(int i) {
        switch (i) {
            case C0338e.MapAttrs_cameraBearing /*1*/:
                return NO_CACHE;
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                return PRIVATE;
            case C0338e.MapAttrs_cameraTargetLng /*3*/:
                return PUBLIC;
            default:
                return null;
        }
    }

    public final int m1943a() {
        return this.f1317e;
    }
}
