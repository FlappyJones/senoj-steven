package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

public class bv implements SafeParcelable {
    public static final bg CREATOR;
    private final int f1742a;
    private final String f1743b;
    private final ArrayList f1744c;
    private final ArrayList f1745d;
    private final boolean f1746e;

    static {
        CREATOR = new bg();
    }

    public bv(int i, String str, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        this.f1742a = i;
        this.f1743b = str;
        this.f1744c = arrayList;
        this.f1745d = arrayList2;
        this.f1746e = z;
    }

    public int m3327a() {
        return this.f1742a;
    }

    public String m3328b() {
        return this.f1743b;
    }

    public ArrayList m3329c() {
        return this.f1744c;
    }

    public ArrayList m3330d() {
        return this.f1745d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean m3331e() {
        return this.f1746e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        bg.m3269a(this, parcel, i);
    }
}
