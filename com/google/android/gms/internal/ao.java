package com.google.android.gms.internal;

import com.google.android.gms.C0338e;

public final class ao {
    public static String m3101a(int i) {
        switch (i) {
            case C0338e.MapAttrs_mapType /*0*/:
                return "DAILY";
            case C0338e.MapAttrs_cameraBearing /*1*/:
                return "WEEKLY";
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                return "ALL_TIME";
            default:
                throw new IllegalArgumentException("Unknown time span " + i);
        }
    }
}
