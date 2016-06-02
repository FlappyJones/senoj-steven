package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ae.C0368a;
import java.util.ArrayList;
import java.util.HashMap;

public class ah implements SafeParcelable {
    public static final C0397g CREATOR;
    private final int f1687a;
    private final HashMap f1688b;
    private final ArrayList f1689c;
    private final String f1690d;

    /* renamed from: com.google.android.gms.internal.ah.a */
    public class C0369a implements SafeParcelable {
        public static final C0398h CREATOR;
        final int f1681a;
        final String f1682b;
        final ArrayList f1683c;

        static {
            CREATOR = new C0398h();
        }

        C0369a(int i, String str, ArrayList arrayList) {
            this.f1681a = i;
            this.f1682b = str;
            this.f1683c = arrayList;
        }

        C0369a(String str, HashMap hashMap) {
            this.f1681a = 1;
            this.f1682b = str;
            this.f1683c = C0369a.m3067a(hashMap);
        }

        private static ArrayList m3067a(HashMap hashMap) {
            if (hashMap == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : hashMap.keySet()) {
                arrayList.add(new C0370b(str, (C0368a) hashMap.get(str)));
            }
            return arrayList;
        }

        HashMap m3068a() {
            HashMap hashMap = new HashMap();
            int size = this.f1683c.size();
            for (int i = 0; i < size; i++) {
                C0370b c0370b = (C0370b) this.f1683c.get(i);
                hashMap.put(c0370b.f1685b, c0370b.f1686c);
            }
            return hashMap;
        }

        public int describeContents() {
            C0398h c0398h = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C0398h c0398h = CREATOR;
            C0398h.m3711a(this, parcel, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.ah.b */
    public class C0370b implements SafeParcelable {
        public static final C0396f CREATOR;
        final int f1684a;
        final String f1685b;
        final C0368a f1686c;

        static {
            CREATOR = new C0396f();
        }

        C0370b(int i, String str, C0368a c0368a) {
            this.f1684a = i;
            this.f1685b = str;
            this.f1686c = c0368a;
        }

        C0370b(String str, C0368a c0368a) {
            this.f1684a = 1;
            this.f1685b = str;
            this.f1686c = c0368a;
        }

        public int describeContents() {
            C0396f c0396f = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C0396f c0396f = CREATOR;
            C0396f.m3705a(this, parcel, i);
        }
    }

    static {
        CREATOR = new C0397g();
    }

    ah(int i, ArrayList arrayList, String str) {
        this.f1687a = i;
        this.f1689c = null;
        this.f1688b = m3069a(arrayList);
        this.f1690d = (String) C0394do.m3687a((Object) str);
        m3071a();
    }

    private static HashMap m3069a(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0369a c0369a = (C0369a) arrayList.get(i);
            hashMap.put(c0369a.f1682b, c0369a.m3068a());
        }
        return hashMap;
    }

    public HashMap m3070a(String str) {
        return (HashMap) this.f1688b.get(str);
    }

    public void m3071a() {
        for (String str : this.f1688b.keySet()) {
            HashMap hashMap = (HashMap) this.f1688b.get(str);
            for (String str2 : hashMap.keySet()) {
                ((C0368a) hashMap.get(str2)).m2961a(this);
            }
        }
    }

    int m3072b() {
        return this.f1687a;
    }

    ArrayList m3073c() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f1688b.keySet()) {
            arrayList.add(new C0369a(str, (HashMap) this.f1688b.get(str)));
        }
        return arrayList;
    }

    public String m3074d() {
        return this.f1690d;
    }

    public int describeContents() {
        C0397g c0397g = CREATOR;
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : this.f1688b.keySet()) {
            stringBuilder.append(str).append(":\n");
            HashMap hashMap = (HashMap) this.f1688b.get(str);
            for (String str2 : hashMap.keySet()) {
                stringBuilder.append("  ").append(str2).append(": ");
                stringBuilder.append(hashMap.get(str2));
            }
        }
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0397g c0397g = CREATOR;
        C0397g.m3708a(this, parcel, i);
    }
}
