package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class co implements SafeParcelable {
    public static final bw CREATOR;
    private final int f1917a;
    private final String f1918b;
    private final List f1919c;
    private final List f1920d;
    private final Uri f1921e;
    private final String f1922f;
    private final String f1923g;
    private final String f1924h;
    private final Bundle f1925i;
    private final Bundle f1926j;
    private final int f1927k;

    static {
        CREATOR = new bw();
    }

    public co(int i, String str, List list, List list2, Uri uri, String str2, String str3, String str4, Bundle bundle, Bundle bundle2, int i2) {
        this.f1917a = i;
        this.f1918b = str;
        this.f1919c = list;
        this.f1920d = list2;
        this.f1921e = uri;
        this.f1922f = str2;
        this.f1923g = str3;
        this.f1924h = str4;
        this.f1925i = bundle;
        this.f1926j = bundle2;
        this.f1927k = i2;
    }

    public List m3597a() {
        return this.f1919c;
    }

    public List m3598b() {
        return this.f1920d;
    }

    public Uri m3599c() {
        return this.f1921e;
    }

    public String m3600d() {
        return this.f1922f;
    }

    public int describeContents() {
        return 0;
    }

    public String m3601e() {
        return this.f1923g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof co)) {
            return false;
        }
        co coVar = (co) obj;
        return this.f1917a == coVar.f1917a && dl.m3685a(this.f1919c, coVar.f1919c) && dl.m3685a(this.f1920d, coVar.f1920d) && dl.m3685a(this.f1921e, coVar.f1921e) && dl.m3685a(this.f1922f, coVar.f1922f) && dl.m3685a(this.f1923g, coVar.f1923g) && dl.m3685a(this.f1924h, coVar.f1924h);
    }

    public String m3602f() {
        return this.f1924h;
    }

    public String m3603g() {
        return this.f1918b;
    }

    public Bundle m3604h() {
        return this.f1925i;
    }

    public int hashCode() {
        return dl.m3683a(Integer.valueOf(this.f1917a), this.f1919c, this.f1920d, this.f1921e, this.f1922f, this.f1923g, this.f1924h);
    }

    public Bundle m3605i() {
        return this.f1926j;
    }

    public int m3606j() {
        return this.f1927k;
    }

    public int m3607k() {
        return this.f1917a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        bw.m3332a(this, parcel, i);
    }
}
