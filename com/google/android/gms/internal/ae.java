package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class ae {

    /* renamed from: com.google.android.gms.internal.ae.a */
    public class C0368a implements SafeParcelable {
        public static final C0395e CREATOR;
        protected final int f1669a;
        protected final boolean f1670b;
        protected final int f1671c;
        protected final boolean f1672d;
        protected final String f1673e;
        protected final int f1674f;
        protected final Class f1675g;
        protected final String f1676h;
        private final int f1677i;
        private ah f1678j;
        private C0367d f1679k;

        static {
            CREATOR = new C0395e();
        }

        C0368a(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, C0414z c0414z) {
            this.f1677i = i;
            this.f1669a = i2;
            this.f1670b = z;
            this.f1671c = i3;
            this.f1672d = z2;
            this.f1673e = str;
            this.f1674f = i4;
            if (str2 == null) {
                this.f1675g = null;
                this.f1676h = null;
            } else {
                this.f1675g = ak.class;
                this.f1676h = str2;
            }
            if (c0414z == null) {
                this.f1679k = null;
            } else {
                this.f1679k = c0414z.m3821c();
            }
        }

        protected C0368a(int i, boolean z, int i2, boolean z2, String str, int i3, Class cls, C0367d c0367d) {
            this.f1677i = 1;
            this.f1669a = i;
            this.f1670b = z;
            this.f1671c = i2;
            this.f1672d = z2;
            this.f1673e = str;
            this.f1674f = i3;
            this.f1675g = cls;
            if (cls == null) {
                this.f1676h = null;
            } else {
                this.f1676h = cls.getCanonicalName();
            }
            this.f1679k = c0367d;
        }

        public static C0368a m2950a(String str, int i) {
            return new C0368a(0, false, 0, false, str, i, null, null);
        }

        public static C0368a m2951a(String str, int i, C0367d c0367d, boolean z) {
            return new C0368a(c0367d.m2817c(), z, c0367d.m2818d(), false, str, i, null, c0367d);
        }

        public static C0368a m2952a(String str, int i, Class cls) {
            return new C0368a(11, false, 11, false, str, i, cls, null);
        }

        public static C0368a m2954b(String str, int i) {
            return new C0368a(4, false, 4, false, str, i, null, null);
        }

        public static C0368a m2955b(String str, int i, Class cls) {
            return new C0368a(11, true, 11, true, str, i, cls, null);
        }

        public static C0368a m2956c(String str, int i) {
            return new C0368a(6, false, 6, false, str, i, null, null);
        }

        public static C0368a m2957d(String str, int i) {
            return new C0368a(7, false, 7, false, str, i, null, null);
        }

        public static C0368a m2958e(String str, int i) {
            return new C0368a(7, true, 7, true, str, i, null, null);
        }

        public int m2959a() {
            return this.f1677i;
        }

        public Object m2960a(Object obj) {
            return this.f1679k.m2816a(obj);
        }

        public void m2961a(ah ahVar) {
            this.f1678j = ahVar;
        }

        public int m2962b() {
            return this.f1669a;
        }

        public boolean m2963c() {
            return this.f1670b;
        }

        public int m2964d() {
            return this.f1671c;
        }

        public int describeContents() {
            C0395e c0395e = CREATOR;
            return 0;
        }

        public boolean m2965e() {
            return this.f1672d;
        }

        public String m2966f() {
            return this.f1673e;
        }

        public int m2967g() {
            return this.f1674f;
        }

        public Class m2968h() {
            return this.f1675g;
        }

        String m2969i() {
            return this.f1676h == null ? null : this.f1676h;
        }

        public boolean m2970j() {
            return this.f1679k != null;
        }

        C0414z m2971k() {
            return this.f1679k == null ? null : C0414z.m3818a(this.f1679k);
        }

        public HashMap m2972l() {
            C0394do.m3687a(this.f1676h);
            C0394do.m3687a(this.f1678j);
            return this.f1678j.m3070a(this.f1676h);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Field\n");
            stringBuilder.append("            versionCode=").append(this.f1677i).append('\n');
            stringBuilder.append("                 typeIn=").append(this.f1669a).append('\n');
            stringBuilder.append("            typeInArray=").append(this.f1670b).append('\n');
            stringBuilder.append("                typeOut=").append(this.f1671c).append('\n');
            stringBuilder.append("           typeOutArray=").append(this.f1672d).append('\n');
            stringBuilder.append("        outputFieldName=").append(this.f1673e).append('\n');
            stringBuilder.append("      safeParcelFieldId=").append(this.f1674f).append('\n');
            stringBuilder.append("       concreteTypeName=").append(m2969i()).append('\n');
            if (m2968h() != null) {
                stringBuilder.append("     concreteType.class=").append(m2968h().getCanonicalName()).append('\n');
            }
            stringBuilder.append("          converterName=").append(this.f1679k == null ? "null" : this.f1679k.getClass().getCanonicalName()).append('\n');
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            C0395e c0395e = CREATOR;
            C0395e.m3702a(this, parcel, i);
        }
    }

    private void m2973a(StringBuilder stringBuilder, C0368a c0368a, Object obj) {
        if (c0368a.m2962b() == 11) {
            stringBuilder.append(((ae) c0368a.m2968h().cast(obj)).toString());
        } else if (c0368a.m2962b() == 7) {
            stringBuilder.append("\"");
            stringBuilder.append(C0403n.m3727a((String) obj));
            stringBuilder.append("\"");
        } else {
            stringBuilder.append(obj);
        }
    }

    private void m2974a(StringBuilder stringBuilder, C0368a c0368a, ArrayList arrayList) {
        stringBuilder.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                stringBuilder.append(",");
            }
            Object obj = arrayList.get(i);
            if (obj != null) {
                m2973a(stringBuilder, c0368a, obj);
            }
        }
        stringBuilder.append("]");
    }

    protected Object m2975a(C0368a c0368a, Object obj) {
        return c0368a.f1679k != null ? c0368a.m2960a(obj) : obj;
    }

    protected abstract Object m2976a(String str);

    protected boolean m2977a(C0368a c0368a) {
        return c0368a.m2964d() == 11 ? c0368a.m2965e() ? m2984d(c0368a.m2966f()) : m2982c(c0368a.m2966f()) : m2980b(c0368a.m2966f());
    }

    protected Object m2978b(C0368a c0368a) {
        boolean z = true;
        String f = c0368a.m2966f();
        if (c0368a.m2968h() == null) {
            return m2976a(c0368a.m2966f());
        }
        if (m2976a(c0368a.m2966f()) != null) {
            z = false;
        }
        C0394do.m3690a(z, "Concrete field shouldn't be value object: " + c0368a.m2966f());
        Map d = c0368a.m2965e() ? m2983d() : m2981c();
        if (d != null) {
            return d.get(f);
        }
        try {
            return getClass().getMethod("get" + Character.toUpperCase(f.charAt(0)) + f.substring(1), new Class[0]).invoke(this, new Object[0]);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public abstract HashMap m2979b();

    protected abstract boolean m2980b(String str);

    public HashMap m2981c() {
        return null;
    }

    protected boolean m2982c(String str) {
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public HashMap m2983d() {
        return null;
    }

    protected boolean m2984d(String str) {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
    }

    public String toString() {
        HashMap b = m2979b();
        StringBuilder stringBuilder = new StringBuilder(100);
        for (String str : b.keySet()) {
            C0368a c0368a = (C0368a) b.get(str);
            if (m2977a(c0368a)) {
                Object a = m2975a(c0368a, m2978b(c0368a));
                if (stringBuilder.length() == 0) {
                    stringBuilder.append("{");
                } else {
                    stringBuilder.append(",");
                }
                stringBuilder.append("\"").append(str).append("\":");
                if (a != null) {
                    switch (c0368a.m2964d()) {
                        case C0338e.MapAttrs_uiScrollGestures /*8*/:
                            stringBuilder.append("\"").append(C0401l.m3724a((byte[]) a)).append("\"");
                            break;
                        case C0338e.MapAttrs_uiTiltGestures /*9*/:
                            stringBuilder.append("\"").append(C0401l.m3725b((byte[]) a)).append("\"");
                            break;
                        case C0338e.MapAttrs_uiZoomControls /*10*/:
                            C0404o.m3728a(stringBuilder, (HashMap) a);
                            break;
                        default:
                            if (!c0368a.m2963c()) {
                                m2973a(stringBuilder, c0368a, a);
                                break;
                            }
                            m2974a(stringBuilder, c0368a, (ArrayList) a);
                            break;
                    }
                }
                stringBuilder.append("null");
            }
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.append("}");
        } else {
            stringBuilder.append("{}");
        }
        return stringBuilder.toString();
    }
}
