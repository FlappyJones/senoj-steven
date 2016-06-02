package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.C0338e;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.n */
public final class C0403n {
    private static final Pattern f1970a;
    private static final Pattern f1971b;

    static {
        f1970a = Pattern.compile("\\\\.");
        f1971b = Pattern.compile("[\\\\\"/\b\f\n\r\t]");
    }

    public static String m3727a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = f1971b.matcher(str);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            switch (matcher.group().charAt(0)) {
                case C0338e.MapAttrs_uiScrollGestures /*8*/:
                    matcher.appendReplacement(stringBuffer, "\\\\b");
                    break;
                case C0338e.MapAttrs_uiTiltGestures /*9*/:
                    matcher.appendReplacement(stringBuffer, "\\\\t");
                    break;
                case C0338e.MapAttrs_uiZoomControls /*10*/:
                    matcher.appendReplacement(stringBuffer, "\\\\n");
                    break;
                case C0338e.MapAttrs_useViewLifecycle /*12*/:
                    matcher.appendReplacement(stringBuffer, "\\\\f");
                    break;
                case C0338e.MapAttrs_zOrderOnTop /*13*/:
                    matcher.appendReplacement(stringBuffer, "\\\\r");
                    break;
                case '\"':
                    matcher.appendReplacement(stringBuffer, "\\\\\\\"");
                    break;
                case '/':
                    matcher.appendReplacement(stringBuffer, "\\\\/");
                    break;
                case '\\':
                    matcher.appendReplacement(stringBuffer, "\\\\\\\\");
                    break;
                default:
                    break;
            }
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
