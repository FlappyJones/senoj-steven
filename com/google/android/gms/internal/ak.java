package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ae.C0368a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ak extends ae implements SafeParcelable {
    public static final C0399i CREATOR;
    private final int f1693a;
    private final Parcel f1694b;
    private final int f1695c;
    private final ah f1696d;
    private final String f1697e;
    private int f1698f;
    private int f1699g;

    static {
        CREATOR = new C0399i();
    }

    ak(int i, Parcel parcel, ah ahVar) {
        this.f1693a = i;
        this.f1694b = (Parcel) C0394do.m3687a((Object) parcel);
        this.f1695c = 2;
        this.f1696d = ahVar;
        if (this.f1696d == null) {
            this.f1697e = null;
        } else {
            this.f1697e = this.f1696d.m3074d();
        }
        this.f1698f = 2;
    }

    public static HashMap m3080a(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    private static HashMap m3081a(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        for (Entry entry : hashMap.entrySet()) {
            hashMap2.put(Integer.valueOf(((C0368a) entry.getValue()).m2967g()), entry);
        }
        return hashMap2;
    }

    private void m3082a(StringBuilder stringBuilder, int i, Object obj) {
        switch (i) {
            case C0338e.MapAttrs_mapType /*0*/:
            case C0338e.MapAttrs_cameraBearing /*1*/:
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
            case C0338e.MapAttrs_cameraTargetLng /*3*/:
            case C0338e.MapAttrs_cameraTilt /*4*/:
            case C0338e.MapAttrs_cameraZoom /*5*/:
            case C0338e.MapAttrs_uiCompass /*6*/:
                stringBuilder.append(obj);
            case C0338e.MapAttrs_uiRotateGestures /*7*/:
                stringBuilder.append("\"").append(C0403n.m3727a(obj.toString())).append("\"");
            case C0338e.MapAttrs_uiScrollGestures /*8*/:
                stringBuilder.append("\"").append(C0401l.m3724a((byte[]) obj)).append("\"");
            case C0338e.MapAttrs_uiTiltGestures /*9*/:
                stringBuilder.append("\"").append(C0401l.m3725b((byte[]) obj));
                stringBuilder.append("\"");
            case C0338e.MapAttrs_uiZoomControls /*10*/:
                C0404o.m3728a(stringBuilder, (HashMap) obj);
            case C0338e.MapAttrs_uiZoomGestures /*11*/:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i);
        }
    }

    private void m3083a(StringBuilder stringBuilder, C0368a c0368a, Parcel parcel, int i) {
        switch (c0368a.m2964d()) {
            case C0338e.MapAttrs_mapType /*0*/:
                m3084a(stringBuilder, c0368a, m2975a(c0368a, Integer.valueOf(C0334a.m2496f(parcel, i))));
            case C0338e.MapAttrs_cameraBearing /*1*/:
                m3084a(stringBuilder, c0368a, m2975a(c0368a, C0334a.m2498h(parcel, i)));
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                m3084a(stringBuilder, c0368a, m2975a(c0368a, Long.valueOf(C0334a.m2497g(parcel, i))));
            case C0338e.MapAttrs_cameraTargetLng /*3*/:
                m3084a(stringBuilder, c0368a, m2975a(c0368a, Float.valueOf(C0334a.m2499i(parcel, i))));
            case C0338e.MapAttrs_cameraTilt /*4*/:
                m3084a(stringBuilder, c0368a, m2975a(c0368a, Double.valueOf(C0334a.m2500j(parcel, i))));
            case C0338e.MapAttrs_cameraZoom /*5*/:
                m3084a(stringBuilder, c0368a, m2975a(c0368a, C0334a.m2501k(parcel, i)));
            case C0338e.MapAttrs_uiCompass /*6*/:
                m3084a(stringBuilder, c0368a, m2975a(c0368a, Boolean.valueOf(C0334a.m2493c(parcel, i))));
            case C0338e.MapAttrs_uiRotateGestures /*7*/:
                m3084a(stringBuilder, c0368a, m2975a(c0368a, C0334a.m2502l(parcel, i)));
            case C0338e.MapAttrs_uiScrollGestures /*8*/:
            case C0338e.MapAttrs_uiTiltGestures /*9*/:
                m3084a(stringBuilder, c0368a, m2975a(c0368a, C0334a.m2505o(parcel, i)));
            case C0338e.MapAttrs_uiZoomControls /*10*/:
                m3084a(stringBuilder, c0368a, m2975a(c0368a, m3080a(C0334a.m2504n(parcel, i))));
            case C0338e.MapAttrs_uiZoomGestures /*11*/:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown field out type = " + c0368a.m2964d());
        }
    }

    private void m3084a(StringBuilder stringBuilder, C0368a c0368a, Object obj) {
        if (c0368a.m2963c()) {
            m3085a(stringBuilder, c0368a, (ArrayList) obj);
        } else {
            m3082a(stringBuilder, c0368a.m2962b(), obj);
        }
    }

    private void m3085a(StringBuilder stringBuilder, C0368a c0368a, ArrayList arrayList) {
        stringBuilder.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                stringBuilder.append(",");
            }
            m3082a(stringBuilder, c0368a.m2962b(), arrayList.get(i));
        }
        stringBuilder.append("]");
    }

    private void m3086a(StringBuilder stringBuilder, String str, C0368a c0368a, Parcel parcel, int i) {
        stringBuilder.append("\"").append(str).append("\":");
        if (c0368a.m2970j()) {
            m3083a(stringBuilder, c0368a, parcel, i);
        } else {
            m3088b(stringBuilder, c0368a, parcel, i);
        }
    }

    private void m3087a(StringBuilder stringBuilder, HashMap hashMap, Parcel parcel) {
        HashMap a = m3081a(hashMap);
        stringBuilder.append('{');
        int b = C0334a.m2489b(parcel);
        Object obj = null;
        while (parcel.dataPosition() < b) {
            int a2 = C0334a.m2484a(parcel);
            Entry entry = (Entry) a.get(Integer.valueOf(C0334a.m2483a(a2)));
            if (entry != null) {
                if (obj != null) {
                    stringBuilder.append(",");
                }
                m3086a(stringBuilder, (String) entry.getKey(), (C0368a) entry.getValue(), parcel, a2);
                obj = 1;
            }
        }
        if (parcel.dataPosition() != b) {
            throw new C0335b("Overread allowed size end=" + b, parcel);
        }
        stringBuilder.append('}');
    }

    private void m3088b(StringBuilder stringBuilder, C0368a c0368a, Parcel parcel, int i) {
        if (c0368a.m2965e()) {
            stringBuilder.append("[");
            switch (c0368a.m2964d()) {
                case C0338e.MapAttrs_mapType /*0*/:
                    C0400k.m3719a(stringBuilder, C0334a.m2507q(parcel, i));
                    break;
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    C0400k.m3721a(stringBuilder, C0334a.m2509s(parcel, i));
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    C0400k.m3720a(stringBuilder, C0334a.m2508r(parcel, i));
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    C0400k.m3718a(stringBuilder, C0334a.m2510t(parcel, i));
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    C0400k.m3717a(stringBuilder, C0334a.m2511u(parcel, i));
                    break;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    C0400k.m3721a(stringBuilder, C0334a.m2512v(parcel, i));
                    break;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    C0400k.m3723a(stringBuilder, C0334a.m2506p(parcel, i));
                    break;
                case C0338e.MapAttrs_uiRotateGestures /*7*/:
                    C0400k.m3722a(stringBuilder, C0334a.m2513w(parcel, i));
                    break;
                case C0338e.MapAttrs_uiScrollGestures /*8*/:
                case C0338e.MapAttrs_uiTiltGestures /*9*/:
                case C0338e.MapAttrs_uiZoomControls /*10*/:
                    throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                case C0338e.MapAttrs_uiZoomGestures /*11*/:
                    Parcel[] z = C0334a.m2516z(parcel, i);
                    int length = z.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (i2 > 0) {
                            stringBuilder.append(",");
                        }
                        z[i2].setDataPosition(0);
                        m3087a(stringBuilder, c0368a.m2972l(), z[i2]);
                    }
                    break;
                default:
                    throw new IllegalStateException("Unknown field type out.");
            }
            stringBuilder.append("]");
            return;
        }
        switch (c0368a.m2964d()) {
            case C0338e.MapAttrs_mapType /*0*/:
                stringBuilder.append(C0334a.m2496f(parcel, i));
            case C0338e.MapAttrs_cameraBearing /*1*/:
                stringBuilder.append(C0334a.m2498h(parcel, i));
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                stringBuilder.append(C0334a.m2497g(parcel, i));
            case C0338e.MapAttrs_cameraTargetLng /*3*/:
                stringBuilder.append(C0334a.m2499i(parcel, i));
            case C0338e.MapAttrs_cameraTilt /*4*/:
                stringBuilder.append(C0334a.m2500j(parcel, i));
            case C0338e.MapAttrs_cameraZoom /*5*/:
                stringBuilder.append(C0334a.m2501k(parcel, i));
            case C0338e.MapAttrs_uiCompass /*6*/:
                stringBuilder.append(C0334a.m2493c(parcel, i));
            case C0338e.MapAttrs_uiRotateGestures /*7*/:
                stringBuilder.append("\"").append(C0403n.m3727a(C0334a.m2502l(parcel, i))).append("\"");
            case C0338e.MapAttrs_uiScrollGestures /*8*/:
                stringBuilder.append("\"").append(C0401l.m3724a(C0334a.m2505o(parcel, i))).append("\"");
            case C0338e.MapAttrs_uiTiltGestures /*9*/:
                stringBuilder.append("\"").append(C0401l.m3725b(C0334a.m2505o(parcel, i)));
                stringBuilder.append("\"");
            case C0338e.MapAttrs_uiZoomControls /*10*/:
                Bundle n = C0334a.m2504n(parcel, i);
                Set<String> keySet = n.keySet();
                keySet.size();
                stringBuilder.append("{");
                int i3 = 1;
                for (String str : keySet) {
                    if (i3 == 0) {
                        stringBuilder.append(",");
                    }
                    stringBuilder.append("\"").append(str).append("\"");
                    stringBuilder.append(":");
                    stringBuilder.append("\"").append(C0403n.m3727a(n.getString(str))).append("\"");
                    i3 = 0;
                }
                stringBuilder.append("}");
            case C0338e.MapAttrs_uiZoomGestures /*11*/:
                Parcel y = C0334a.m2515y(parcel, i);
                y.setDataPosition(0);
                m3087a(stringBuilder, c0368a.m2972l(), y);
            default:
                throw new IllegalStateException("Unknown field type out");
        }
    }

    public int m3089a() {
        return this.f1693a;
    }

    protected Object m3090a(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public HashMap m3091b() {
        return this.f1696d == null ? null : this.f1696d.m3070a(this.f1697e);
    }

    protected boolean m3092b(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public int describeContents() {
        C0399i c0399i = CREATOR;
        return 0;
    }

    public Parcel m3093e() {
        switch (this.f1698f) {
            case C0338e.MapAttrs_mapType /*0*/:
                this.f1699g = C0336c.m2517a(this.f1694b);
                C0336c.m2518a(this.f1694b, this.f1699g);
                this.f1698f = 2;
                break;
            case C0338e.MapAttrs_cameraBearing /*1*/:
                C0336c.m2518a(this.f1694b, this.f1699g);
                this.f1698f = 2;
                break;
        }
        return this.f1694b;
    }

    ah m3094f() {
        switch (this.f1695c) {
            case C0338e.MapAttrs_mapType /*0*/:
                return null;
            case C0338e.MapAttrs_cameraBearing /*1*/:
                return this.f1696d;
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                return this.f1696d;
            default:
                throw new IllegalStateException("Invalid creation type: " + this.f1695c);
        }
    }

    public String toString() {
        C0394do.m3688a(this.f1696d, (Object) "Cannot convert to JSON on client side.");
        Parcel e = m3093e();
        e.setDataPosition(0);
        StringBuilder stringBuilder = new StringBuilder(100);
        m3087a(stringBuilder, this.f1696d.m3070a(this.f1697e), e);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0399i c0399i = CREATOR;
        C0399i.m3714a(this, parcel, i);
    }
}
