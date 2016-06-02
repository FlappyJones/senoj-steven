package com.google.android.gms.maps.p024a;

import com.google.android.gms.C0338e;

/* renamed from: com.google.android.gms.maps.a.v */
public final class C0440v {
    public static byte m4105a(Boolean bool) {
        return bool != null ? bool.booleanValue() ? (byte) 1 : (byte) 0 : (byte) -1;
    }

    public static Boolean m4106a(byte b) {
        switch (b) {
            case C0338e.MapAttrs_mapType /*0*/:
                return Boolean.FALSE;
            case C0338e.MapAttrs_cameraBearing /*1*/:
                return Boolean.TRUE;
            default:
                return null;
        }
    }
}
