package com.google.analytics.p015b.p016a.p017a;

import com.google.android.gms.C0338e;
import com.google.tagmanager.p014a.ad;
import com.google.tagmanager.p014a.ae;

/* renamed from: com.google.analytics.b.a.a.f */
public enum C0290f implements ad {
    ESCAPE_HTML(0, 1),
    ESCAPE_HTML_RCDATA(1, 2),
    ESCAPE_HTML_ATTRIBUTE(2, 3),
    ESCAPE_HTML_ATTRIBUTE_NOSPACE(3, 4),
    FILTER_HTML_ELEMENT_NAME(4, 5),
    FILTER_HTML_ATTRIBUTES(5, 6),
    ESCAPE_JS_STRING(6, 7),
    ESCAPE_JS_VALUE(7, 8),
    ESCAPE_JS_REGEX(8, 9),
    ESCAPE_CSS_STRING(9, 10),
    FILTER_CSS_VALUE(10, 11),
    ESCAPE_URI(11, 12),
    NORMALIZE_URI(12, 13),
    FILTER_NORMALIZE_URI(13, 14),
    NO_AUTOESCAPE(14, 15),
    TEXT(15, 17),
    CONVERT_JS_VALUE_TO_EXPRESSION(16, 16);
    
    private static ae f1467r;
    private final int f1469s;

    static {
        f1467r = new C0291g();
    }

    private C0290f(int i, int i2) {
        this.f1469s = i2;
    }

    public static C0290f m2368a(int i) {
        switch (i) {
            case C0338e.MapAttrs_cameraBearing /*1*/:
                return ESCAPE_HTML;
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                return ESCAPE_HTML_RCDATA;
            case C0338e.MapAttrs_cameraTargetLng /*3*/:
                return ESCAPE_HTML_ATTRIBUTE;
            case C0338e.MapAttrs_cameraTilt /*4*/:
                return ESCAPE_HTML_ATTRIBUTE_NOSPACE;
            case C0338e.MapAttrs_cameraZoom /*5*/:
                return FILTER_HTML_ELEMENT_NAME;
            case C0338e.MapAttrs_uiCompass /*6*/:
                return FILTER_HTML_ATTRIBUTES;
            case C0338e.MapAttrs_uiRotateGestures /*7*/:
                return ESCAPE_JS_STRING;
            case C0338e.MapAttrs_uiScrollGestures /*8*/:
                return ESCAPE_JS_VALUE;
            case C0338e.MapAttrs_uiTiltGestures /*9*/:
                return ESCAPE_JS_REGEX;
            case C0338e.MapAttrs_uiZoomControls /*10*/:
                return ESCAPE_CSS_STRING;
            case C0338e.MapAttrs_uiZoomGestures /*11*/:
                return FILTER_CSS_VALUE;
            case C0338e.MapAttrs_useViewLifecycle /*12*/:
                return ESCAPE_URI;
            case C0338e.MapAttrs_zOrderOnTop /*13*/:
                return NORMALIZE_URI;
            case 14:
                return FILTER_NORMALIZE_URI;
            case 15:
                return NO_AUTOESCAPE;
            case 16:
                return CONVERT_JS_VALUE_TO_EXPRESSION;
            case 17:
                return TEXT;
            default:
                return null;
        }
    }

    public final int m2369a() {
        return this.f1469s;
    }
}
