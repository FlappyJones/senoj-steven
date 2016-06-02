package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class ab implements SafeParcelable, C0367d {
    public static final C0371b CREATOR;
    private final int f1664a;
    private final HashMap f1665b;
    private final HashMap f1666c;
    private final ArrayList f1667d;

    /* renamed from: com.google.android.gms.internal.ab.a */
    public final class C0366a implements SafeParcelable {
        public static final C0374c CREATOR;
        final int f1661a;
        final String f1662b;
        final int f1663c;

        static {
            CREATOR = new C0374c();
        }

        C0366a(int i, String str, int i2) {
            this.f1661a = i;
            this.f1662b = str;
            this.f1663c = i2;
        }

        C0366a(String str, int i) {
            this.f1661a = 1;
            this.f1662b = str;
            this.f1663c = i;
        }

        public int describeContents() {
            C0374c c0374c = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C0374c c0374c = CREATOR;
            C0374c.m3406a(this, parcel, i);
        }
    }

    static {
        CREATOR = new C0371b();
    }

    public ab() {
        this.f1664a = 1;
        this.f1665b = new HashMap();
        this.f1666c = new HashMap();
        this.f1667d = null;
    }

    ab(int i, ArrayList arrayList) {
        this.f1664a = i;
        this.f1665b = new HashMap();
        this.f1666c = new HashMap();
        this.f1667d = null;
        m2819a(arrayList);
    }

    private void m2819a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0366a c0366a = (C0366a) it.next();
            m2821a(c0366a.f1662b, c0366a.f1663c);
        }
    }

    int m2820a() {
        return this.f1664a;
    }

    public ab m2821a(String str, int i) {
        this.f1665b.put(str, Integer.valueOf(i));
        this.f1666c.put(Integer.valueOf(i), str);
        return this;
    }

    public /* synthetic */ Object m2822a(Object obj) {
        return m2823a((Integer) obj);
    }

    public String m2823a(Integer num) {
        String str = (String) this.f1666c.get(num);
        return (str == null && this.f1665b.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    ArrayList m2824b() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f1665b.keySet()) {
            arrayList.add(new C0366a(str, ((Integer) this.f1665b.get(str)).intValue()));
        }
        return arrayList;
    }

    public int m2825c() {
        return 7;
    }

    public int m2826d() {
        return 0;
    }

    public int describeContents() {
        C0371b c0371b = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0371b c0371b = CREATOR;
        C0371b.m3152a(this, parcel, i);
    }
}
