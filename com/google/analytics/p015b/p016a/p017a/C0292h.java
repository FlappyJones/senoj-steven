package com.google.analytics.p015b.p016a.p017a;

import com.google.android.gms.C0338e;
import com.google.tagmanager.p014a.ad;
import com.google.tagmanager.p014a.ae;

/* renamed from: com.google.analytics.b.a.a.h */
public enum C0292h implements ad {
    STRING(0, 1),
    LIST(1, 2),
    MAP(2, 3),
    MACRO_REFERENCE(3, 4),
    FUNCTION_ID(4, 5),
    INTEGER(5, 6),
    TEMPLATE(6, 7),
    BOOLEAN(7, 8);
    
    private static ae f1478i;
    private final int f1480j;

    static {
        f1478i = new C0293i();
    }

    private C0292h(int i, int i2) {
        this.f1480j = i2;
    }

    public static C0292h m2372a(int i) {
        switch (i) {
            case C0338e.MapAttrs_cameraBearing /*1*/:
                return STRING;
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                return LIST;
            case C0338e.MapAttrs_cameraTargetLng /*3*/:
                return MAP;
            case C0338e.MapAttrs_cameraTilt /*4*/:
                return MACRO_REFERENCE;
            case C0338e.MapAttrs_cameraZoom /*5*/:
                return FUNCTION_ID;
            case C0338e.MapAttrs_uiCompass /*6*/:
                return INTEGER;
            case C0338e.MapAttrs_uiRotateGestures /*7*/:
                return TEMPLATE;
            case C0338e.MapAttrs_uiScrollGestures /*8*/:
                return BOOLEAN;
            default:
                return null;
        }
    }

    public final int m2373a() {
        return this.f1480j;
    }
}
