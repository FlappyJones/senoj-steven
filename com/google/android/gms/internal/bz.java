package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ae.C0368a;
import com.google.android.gms.plus.p021a.p022a.C0373b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public final class bz extends ae implements SafeParcelable, C0373b {
    public static final bk CREATOR;
    private static final HashMap f1799a;
    private final Set f1800b;
    private final int f1801c;
    private String f1802d;
    private bx f1803e;
    private String f1804f;
    private bx f1805g;
    private String f1806h;

    static {
        CREATOR = new bk();
        f1799a = new HashMap();
        f1799a.put("id", C0368a.m2957d("id", 2));
        f1799a.put("result", C0368a.m2952a("result", 4, bx.class));
        f1799a.put("startDate", C0368a.m2957d("startDate", 5));
        f1799a.put("target", C0368a.m2952a("target", 6, bx.class));
        f1799a.put("type", C0368a.m2957d("type", 7));
    }

    public bz() {
        this.f1801c = 1;
        this.f1800b = new HashSet();
    }

    bz(Set set, int i, String str, bx bxVar, String str2, bx bxVar2, String str3) {
        this.f1800b = set;
        this.f1801c = i;
        this.f1802d = str;
        this.f1803e = bxVar;
        this.f1804f = str2;
        this.f1805g = bxVar2;
        this.f1806h = str3;
    }

    public /* synthetic */ Object m3392a() {
        return m3405l();
    }

    protected Object m3393a(String str) {
        return null;
    }

    protected boolean m3394a(C0368a c0368a) {
        return this.f1800b.contains(Integer.valueOf(c0368a.m2967g()));
    }

    protected Object m3395b(C0368a c0368a) {
        switch (c0368a.m2967g()) {
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                return this.f1802d;
            case C0338e.MapAttrs_cameraTilt /*4*/:
                return this.f1803e;
            case C0338e.MapAttrs_cameraZoom /*5*/:
                return this.f1804f;
            case C0338e.MapAttrs_uiCompass /*6*/:
                return this.f1805g;
            case C0338e.MapAttrs_uiRotateGestures /*7*/:
                return this.f1806h;
            default:
                throw new IllegalStateException("Unknown safe parcelable id=" + c0368a.m2967g());
        }
    }

    public HashMap m3396b() {
        return f1799a;
    }

    protected boolean m3397b(String str) {
        return false;
    }

    public int describeContents() {
        bk bkVar = CREATOR;
        return 0;
    }

    Set m3398e() {
        return this.f1800b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof bz)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        bz bzVar = (bz) obj;
        for (C0368a c0368a : f1799a.values()) {
            if (m3394a(c0368a)) {
                if (!bzVar.m3394a(c0368a)) {
                    return false;
                }
                if (!m3395b(c0368a).equals(bzVar.m3395b(c0368a))) {
                    return false;
                }
            } else if (bzVar.m3394a(c0368a)) {
                return false;
            }
        }
        return true;
    }

    int m3399f() {
        return this.f1801c;
    }

    public String m3400g() {
        return this.f1802d;
    }

    bx m3401h() {
        return this.f1803e;
    }

    public int hashCode() {
        int i = 0;
        for (C0368a c0368a : f1799a.values()) {
            int hashCode;
            if (m3394a(c0368a)) {
                hashCode = m3395b(c0368a).hashCode() + (i + c0368a.m2967g());
            } else {
                hashCode = i;
            }
            i = hashCode;
        }
        return i;
    }

    public String m3402i() {
        return this.f1804f;
    }

    bx m3403j() {
        return this.f1805g;
    }

    public String m3404k() {
        return this.f1806h;
    }

    public bz m3405l() {
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        bk bkVar = CREATOR;
        bk.m3294a(this, parcel, i);
    }
}
