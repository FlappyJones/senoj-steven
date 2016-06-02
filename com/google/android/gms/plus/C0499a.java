package com.google.android.gms.plus;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.dl;

/* renamed from: com.google.android.gms.plus.a */
public class C0499a implements SafeParcelable {
    public static final C0510l CREATOR;
    private final int f2156a;
    private final String f2157b;
    private final String[] f2158c;
    private final String[] f2159d;
    private final String[] f2160e;
    private final String f2161f;
    private final String f2162g;
    private final String f2163h;

    static {
        CREATOR = new C0510l();
    }

    public C0499a(int i, String str, String[] strArr, String[] strArr2, String[] strArr3, String str2, String str3, String str4) {
        this.f2156a = i;
        this.f2157b = str;
        this.f2158c = strArr;
        this.f2159d = strArr2;
        this.f2160e = strArr3;
        this.f2161f = str2;
        this.f2162g = str3;
        this.f2163h = str4;
    }

    public C0499a(String str, String[] strArr, String[] strArr2, String[] strArr3, String str2, String str3, String str4) {
        this.f2156a = 1;
        this.f2157b = str;
        this.f2158c = strArr;
        this.f2159d = strArr2;
        this.f2160e = strArr3;
        this.f2161f = str2;
        this.f2162g = str3;
        this.f2163h = str4;
    }

    public int m4475a() {
        return this.f2156a;
    }

    public String m4476b() {
        return this.f2157b;
    }

    public String[] m4477c() {
        return this.f2158c;
    }

    public String[] m4478d() {
        return this.f2159d;
    }

    public int describeContents() {
        return 0;
    }

    public String[] m4479e() {
        return this.f2160e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0499a)) {
            return false;
        }
        C0499a c0499a = (C0499a) obj;
        return this.f2156a == c0499a.f2156a && dl.m3685a(this.f2157b, c0499a.f2157b) && dl.m3685a(this.f2158c, c0499a.f2158c) && dl.m3685a(this.f2159d, c0499a.f2159d) && dl.m3685a(this.f2160e, c0499a.f2160e) && dl.m3685a(this.f2161f, c0499a.f2161f) && dl.m3685a(this.f2162g, c0499a.f2162g) && dl.m3685a(this.f2163h, c0499a.f2163h);
    }

    public String m4480f() {
        return this.f2161f;
    }

    public String m4481g() {
        return this.f2162g;
    }

    public String m4482h() {
        return this.f2163h;
    }

    public int hashCode() {
        return dl.m3683a(Integer.valueOf(this.f2156a), this.f2157b, this.f2158c, this.f2159d, this.f2160e, this.f2161f, this.f2162g, this.f2163h);
    }

    public String toString() {
        return dl.m3684a((Object) this).m3686a("versionCode", Integer.valueOf(this.f2156a)).m3686a("accountName", this.f2157b).m3686a("requestedScopes", this.f2158c).m3686a("visibleActivities", this.f2159d).m3686a("requiredFeatures", this.f2160e).m3686a("packageNameForAuth", this.f2161f).m3686a("callingPackageName", this.f2162g).m3686a("applicationName", this.f2163h).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0510l.m4500a(this, parcel, i);
    }
}
