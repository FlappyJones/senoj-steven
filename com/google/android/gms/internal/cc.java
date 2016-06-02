package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ae.C0368a;
import com.google.android.gms.plus.p021a.p023b.C0375b;
import com.google.android.gms.plus.p021a.p023b.C0377d;
import com.google.android.gms.plus.p021a.p023b.C0379e;
import com.google.android.gms.plus.p021a.p023b.C0381c;
import com.google.android.gms.plus.p021a.p023b.C0383f;
import com.google.android.gms.plus.p021a.p023b.C0385g;
import com.google.android.gms.plus.p021a.p023b.C0387h;
import com.google.android.gms.plus.p021a.p023b.C0389i;
import com.google.android.gms.plus.p021a.p023b.C0391j;
import com.google.android.gms.plus.p021a.p023b.C0393a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class cc extends ae implements SafeParcelable, C0393a {
    public static final bl CREATOR;
    private static final HashMap f1866a;
    private boolean f1867A;
    private final Set f1868b;
    private final int f1869c;
    private String f1870d;
    private C0376a f1871e;
    private String f1872f;
    private String f1873g;
    private int f1874h;
    private C0382b f1875i;
    private String f1876j;
    private String f1877k;
    private int f1878l;
    private String f1879m;
    private C0384c f1880n;
    private boolean f1881o;
    private String f1882p;
    private C0386d f1883q;
    private String f1884r;
    private int f1885s;
    private List f1886t;
    private List f1887u;
    private int f1888v;
    private int f1889w;
    private String f1890x;
    private String f1891y;
    private List f1892z;

    /* renamed from: com.google.android.gms.internal.cc.a */
    public final class C0376a extends ae implements SafeParcelable, C0375b {
        public static final bm CREATOR;
        private static final HashMap f1807a;
        private final Set f1808b;
        private final int f1809c;
        private int f1810d;
        private int f1811e;

        static {
            CREATOR = new bm();
            f1807a = new HashMap();
            f1807a.put("max", C0368a.m2950a("max", 2));
            f1807a.put("min", C0368a.m2950a("min", 3));
        }

        public C0376a() {
            this.f1809c = 1;
            this.f1808b = new HashSet();
        }

        C0376a(Set set, int i, int i2, int i3) {
            this.f1808b = set;
            this.f1809c = i;
            this.f1810d = i2;
            this.f1811e = i3;
        }

        public /* synthetic */ Object m3415a() {
            return m3425i();
        }

        protected Object m3416a(String str) {
            return null;
        }

        protected boolean m3417a(C0368a c0368a) {
            return this.f1808b.contains(Integer.valueOf(c0368a.m2967g()));
        }

        protected Object m3418b(C0368a c0368a) {
            switch (c0368a.m2967g()) {
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    return Integer.valueOf(this.f1810d);
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    return Integer.valueOf(this.f1811e);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + c0368a.m2967g());
            }
        }

        public HashMap m3419b() {
            return f1807a;
        }

        protected boolean m3420b(String str) {
            return false;
        }

        public int describeContents() {
            bm bmVar = CREATOR;
            return 0;
        }

        Set m3421e() {
            return this.f1808b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0376a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C0376a c0376a = (C0376a) obj;
            for (C0368a c0368a : f1807a.values()) {
                if (m3417a(c0368a)) {
                    if (!c0376a.m3417a(c0368a)) {
                        return false;
                    }
                    if (!m3418b(c0368a).equals(c0376a.m3418b(c0368a))) {
                        return false;
                    }
                } else if (c0376a.m3417a(c0368a)) {
                    return false;
                }
            }
            return true;
        }

        int m3422f() {
            return this.f1809c;
        }

        public int m3423g() {
            return this.f1810d;
        }

        public int m3424h() {
            return this.f1811e;
        }

        public int hashCode() {
            int i = 0;
            for (C0368a c0368a : f1807a.values()) {
                int hashCode;
                if (m3417a(c0368a)) {
                    hashCode = m3418b(c0368a).hashCode() + (i + c0368a.m2967g());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public C0376a m3425i() {
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            bm bmVar = CREATOR;
            bm.m3300a(this, parcel, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.cc.b */
    public final class C0382b extends ae implements SafeParcelable, C0381c {
        public static final bn CREATOR;
        private static final HashMap f1823a;
        private final Set f1824b;
        private final int f1825c;
        private C0378a f1826d;
        private C0380b f1827e;
        private int f1828f;

        /* renamed from: com.google.android.gms.internal.cc.b.a */
        public final class C0378a extends ae implements SafeParcelable, C0377d {
            public static final bo CREATOR;
            private static final HashMap f1812a;
            private final Set f1813b;
            private final int f1814c;
            private int f1815d;
            private int f1816e;

            static {
                CREATOR = new bo();
                f1812a = new HashMap();
                f1812a.put("leftImageOffset", C0368a.m2950a("leftImageOffset", 2));
                f1812a.put("topImageOffset", C0368a.m2950a("topImageOffset", 3));
            }

            public C0378a() {
                this.f1814c = 1;
                this.f1813b = new HashSet();
            }

            C0378a(Set set, int i, int i2, int i3) {
                this.f1813b = set;
                this.f1814c = i;
                this.f1815d = i2;
                this.f1816e = i3;
            }

            public /* synthetic */ Object m3426a() {
                return m3436i();
            }

            protected Object m3427a(String str) {
                return null;
            }

            protected boolean m3428a(C0368a c0368a) {
                return this.f1813b.contains(Integer.valueOf(c0368a.m2967g()));
            }

            protected Object m3429b(C0368a c0368a) {
                switch (c0368a.m2967g()) {
                    case C0338e.MapAttrs_cameraTargetLat /*2*/:
                        return Integer.valueOf(this.f1815d);
                    case C0338e.MapAttrs_cameraTargetLng /*3*/:
                        return Integer.valueOf(this.f1816e);
                    default:
                        throw new IllegalStateException("Unknown safe parcelable id=" + c0368a.m2967g());
                }
            }

            public HashMap m3430b() {
                return f1812a;
            }

            protected boolean m3431b(String str) {
                return false;
            }

            public int describeContents() {
                bo boVar = CREATOR;
                return 0;
            }

            Set m3432e() {
                return this.f1813b;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof C0378a)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                C0378a c0378a = (C0378a) obj;
                for (C0368a c0368a : f1812a.values()) {
                    if (m3428a(c0368a)) {
                        if (!c0378a.m3428a(c0368a)) {
                            return false;
                        }
                        if (!m3429b(c0368a).equals(c0378a.m3429b(c0368a))) {
                            return false;
                        }
                    } else if (c0378a.m3428a(c0368a)) {
                        return false;
                    }
                }
                return true;
            }

            int m3433f() {
                return this.f1814c;
            }

            public int m3434g() {
                return this.f1815d;
            }

            public int m3435h() {
                return this.f1816e;
            }

            public int hashCode() {
                int i = 0;
                for (C0368a c0368a : f1812a.values()) {
                    int hashCode;
                    if (m3428a(c0368a)) {
                        hashCode = m3429b(c0368a).hashCode() + (i + c0368a.m2967g());
                    } else {
                        hashCode = i;
                    }
                    i = hashCode;
                }
                return i;
            }

            public C0378a m3436i() {
                return this;
            }

            public void writeToParcel(Parcel parcel, int i) {
                bo boVar = CREATOR;
                bo.m3306a(this, parcel, i);
            }
        }

        /* renamed from: com.google.android.gms.internal.cc.b.b */
        public final class C0380b extends ae implements SafeParcelable, C0379e {
            public static final bp CREATOR;
            private static final HashMap f1817a;
            private final Set f1818b;
            private final int f1819c;
            private int f1820d;
            private String f1821e;
            private int f1822f;

            static {
                CREATOR = new bp();
                f1817a = new HashMap();
                f1817a.put("height", C0368a.m2950a("height", 2));
                f1817a.put("url", C0368a.m2957d("url", 3));
                f1817a.put("width", C0368a.m2950a("width", 4));
            }

            public C0380b() {
                this.f1819c = 1;
                this.f1818b = new HashSet();
            }

            C0380b(Set set, int i, int i2, String str, int i3) {
                this.f1818b = set;
                this.f1819c = i;
                this.f1820d = i2;
                this.f1821e = str;
                this.f1822f = i3;
            }

            public /* synthetic */ Object m3437a() {
                return m3448j();
            }

            protected Object m3438a(String str) {
                return null;
            }

            protected boolean m3439a(C0368a c0368a) {
                return this.f1818b.contains(Integer.valueOf(c0368a.m2967g()));
            }

            protected Object m3440b(C0368a c0368a) {
                switch (c0368a.m2967g()) {
                    case C0338e.MapAttrs_cameraTargetLat /*2*/:
                        return Integer.valueOf(this.f1820d);
                    case C0338e.MapAttrs_cameraTargetLng /*3*/:
                        return this.f1821e;
                    case C0338e.MapAttrs_cameraTilt /*4*/:
                        return Integer.valueOf(this.f1822f);
                    default:
                        throw new IllegalStateException("Unknown safe parcelable id=" + c0368a.m2967g());
                }
            }

            public HashMap m3441b() {
                return f1817a;
            }

            protected boolean m3442b(String str) {
                return false;
            }

            public int describeContents() {
                bp bpVar = CREATOR;
                return 0;
            }

            Set m3443e() {
                return this.f1818b;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof C0380b)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                C0380b c0380b = (C0380b) obj;
                for (C0368a c0368a : f1817a.values()) {
                    if (m3439a(c0368a)) {
                        if (!c0380b.m3439a(c0368a)) {
                            return false;
                        }
                        if (!m3440b(c0368a).equals(c0380b.m3440b(c0368a))) {
                            return false;
                        }
                    } else if (c0380b.m3439a(c0368a)) {
                        return false;
                    }
                }
                return true;
            }

            int m3444f() {
                return this.f1819c;
            }

            public int m3445g() {
                return this.f1820d;
            }

            public String m3446h() {
                return this.f1821e;
            }

            public int hashCode() {
                int i = 0;
                for (C0368a c0368a : f1817a.values()) {
                    int hashCode;
                    if (m3439a(c0368a)) {
                        hashCode = m3440b(c0368a).hashCode() + (i + c0368a.m2967g());
                    } else {
                        hashCode = i;
                    }
                    i = hashCode;
                }
                return i;
            }

            public int m3447i() {
                return this.f1822f;
            }

            public C0380b m3448j() {
                return this;
            }

            public void writeToParcel(Parcel parcel, int i) {
                bp bpVar = CREATOR;
                bp.m3309a(this, parcel, i);
            }
        }

        static {
            CREATOR = new bn();
            f1823a = new HashMap();
            f1823a.put("coverInfo", C0368a.m2952a("coverInfo", 2, C0378a.class));
            f1823a.put("coverPhoto", C0368a.m2952a("coverPhoto", 3, C0380b.class));
            f1823a.put("layout", C0368a.m2951a("layout", 4, new ab().m2821a("banner", 0), false));
        }

        public C0382b() {
            this.f1825c = 1;
            this.f1824b = new HashSet();
        }

        C0382b(Set set, int i, C0378a c0378a, C0380b c0380b, int i2) {
            this.f1824b = set;
            this.f1825c = i;
            this.f1826d = c0378a;
            this.f1827e = c0380b;
            this.f1828f = i2;
        }

        public /* synthetic */ Object m3449a() {
            return m3460j();
        }

        protected Object m3450a(String str) {
            return null;
        }

        protected boolean m3451a(C0368a c0368a) {
            return this.f1824b.contains(Integer.valueOf(c0368a.m2967g()));
        }

        protected Object m3452b(C0368a c0368a) {
            switch (c0368a.m2967g()) {
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    return this.f1826d;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    return this.f1827e;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    return Integer.valueOf(this.f1828f);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + c0368a.m2967g());
            }
        }

        public HashMap m3453b() {
            return f1823a;
        }

        protected boolean m3454b(String str) {
            return false;
        }

        public int describeContents() {
            bn bnVar = CREATOR;
            return 0;
        }

        Set m3455e() {
            return this.f1824b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0382b)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C0382b c0382b = (C0382b) obj;
            for (C0368a c0368a : f1823a.values()) {
                if (m3451a(c0368a)) {
                    if (!c0382b.m3451a(c0368a)) {
                        return false;
                    }
                    if (!m3452b(c0368a).equals(c0382b.m3452b(c0368a))) {
                        return false;
                    }
                } else if (c0382b.m3451a(c0368a)) {
                    return false;
                }
            }
            return true;
        }

        int m3456f() {
            return this.f1825c;
        }

        C0378a m3457g() {
            return this.f1826d;
        }

        C0380b m3458h() {
            return this.f1827e;
        }

        public int hashCode() {
            int i = 0;
            for (C0368a c0368a : f1823a.values()) {
                int hashCode;
                if (m3451a(c0368a)) {
                    hashCode = m3452b(c0368a).hashCode() + (i + c0368a.m2967g());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public int m3459i() {
            return this.f1828f;
        }

        public C0382b m3460j() {
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            bn bnVar = CREATOR;
            bn.m3303a(this, parcel, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.cc.c */
    public final class C0384c extends ae implements SafeParcelable, C0383f {
        public static final bq CREATOR;
        private static final HashMap f1829a;
        private final Set f1830b;
        private final int f1831c;
        private String f1832d;

        static {
            CREATOR = new bq();
            f1829a = new HashMap();
            f1829a.put("url", C0368a.m2957d("url", 2));
        }

        public C0384c() {
            this.f1831c = 1;
            this.f1830b = new HashSet();
        }

        C0384c(Set set, int i, String str) {
            this.f1830b = set;
            this.f1831c = i;
            this.f1832d = str;
        }

        public /* synthetic */ Object m3461a() {
            return m3470h();
        }

        protected Object m3462a(String str) {
            return null;
        }

        protected boolean m3463a(C0368a c0368a) {
            return this.f1830b.contains(Integer.valueOf(c0368a.m2967g()));
        }

        protected Object m3464b(C0368a c0368a) {
            switch (c0368a.m2967g()) {
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    return this.f1832d;
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + c0368a.m2967g());
            }
        }

        public HashMap m3465b() {
            return f1829a;
        }

        protected boolean m3466b(String str) {
            return false;
        }

        public int describeContents() {
            bq bqVar = CREATOR;
            return 0;
        }

        Set m3467e() {
            return this.f1830b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0384c)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C0384c c0384c = (C0384c) obj;
            for (C0368a c0368a : f1829a.values()) {
                if (m3463a(c0368a)) {
                    if (!c0384c.m3463a(c0368a)) {
                        return false;
                    }
                    if (!m3464b(c0368a).equals(c0384c.m3464b(c0368a))) {
                        return false;
                    }
                } else if (c0384c.m3463a(c0368a)) {
                    return false;
                }
            }
            return true;
        }

        int m3468f() {
            return this.f1831c;
        }

        public String m3469g() {
            return this.f1832d;
        }

        public C0384c m3470h() {
            return this;
        }

        public int hashCode() {
            int i = 0;
            for (C0368a c0368a : f1829a.values()) {
                int hashCode;
                if (m3463a(c0368a)) {
                    hashCode = m3464b(c0368a).hashCode() + (i + c0368a.m2967g());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            bq bqVar = CREATOR;
            bq.m3312a(this, parcel, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.cc.d */
    public final class C0386d extends ae implements SafeParcelable, C0385g {
        public static final br CREATOR;
        private static final HashMap f1833a;
        private final Set f1834b;
        private final int f1835c;
        private String f1836d;
        private String f1837e;
        private String f1838f;
        private String f1839g;
        private String f1840h;
        private String f1841i;

        static {
            CREATOR = new br();
            f1833a = new HashMap();
            f1833a.put("familyName", C0368a.m2957d("familyName", 2));
            f1833a.put("formatted", C0368a.m2957d("formatted", 3));
            f1833a.put("givenName", C0368a.m2957d("givenName", 4));
            f1833a.put("honorificPrefix", C0368a.m2957d("honorificPrefix", 5));
            f1833a.put("honorificSuffix", C0368a.m2957d("honorificSuffix", 6));
            f1833a.put("middleName", C0368a.m2957d("middleName", 7));
        }

        public C0386d() {
            this.f1835c = 1;
            this.f1834b = new HashSet();
        }

        C0386d(Set set, int i, String str, String str2, String str3, String str4, String str5, String str6) {
            this.f1834b = set;
            this.f1835c = i;
            this.f1836d = str;
            this.f1837e = str2;
            this.f1838f = str3;
            this.f1839g = str4;
            this.f1840h = str5;
            this.f1841i = str6;
        }

        public /* synthetic */ Object m3471a() {
            return m3485m();
        }

        protected Object m3472a(String str) {
            return null;
        }

        protected boolean m3473a(C0368a c0368a) {
            return this.f1834b.contains(Integer.valueOf(c0368a.m2967g()));
        }

        protected Object m3474b(C0368a c0368a) {
            switch (c0368a.m2967g()) {
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    return this.f1836d;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    return this.f1837e;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    return this.f1838f;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    return this.f1839g;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    return this.f1840h;
                case C0338e.MapAttrs_uiRotateGestures /*7*/:
                    return this.f1841i;
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + c0368a.m2967g());
            }
        }

        public HashMap m3475b() {
            return f1833a;
        }

        protected boolean m3476b(String str) {
            return false;
        }

        public int describeContents() {
            br brVar = CREATOR;
            return 0;
        }

        Set m3477e() {
            return this.f1834b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0386d)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C0386d c0386d = (C0386d) obj;
            for (C0368a c0368a : f1833a.values()) {
                if (m3473a(c0368a)) {
                    if (!c0386d.m3473a(c0368a)) {
                        return false;
                    }
                    if (!m3474b(c0368a).equals(c0386d.m3474b(c0368a))) {
                        return false;
                    }
                } else if (c0386d.m3473a(c0368a)) {
                    return false;
                }
            }
            return true;
        }

        int m3478f() {
            return this.f1835c;
        }

        public String m3479g() {
            return this.f1836d;
        }

        public String m3480h() {
            return this.f1837e;
        }

        public int hashCode() {
            int i = 0;
            for (C0368a c0368a : f1833a.values()) {
                int hashCode;
                if (m3473a(c0368a)) {
                    hashCode = m3474b(c0368a).hashCode() + (i + c0368a.m2967g());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public String m3481i() {
            return this.f1838f;
        }

        public String m3482j() {
            return this.f1839g;
        }

        public String m3483k() {
            return this.f1840h;
        }

        public String m3484l() {
            return this.f1841i;
        }

        public C0386d m3485m() {
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            br brVar = CREATOR;
            br.m3315a(this, parcel, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.cc.f */
    public final class C0388f extends ae implements SafeParcelable, C0387h {
        public static final bs CREATOR;
        private static final HashMap f1842a;
        private final Set f1843b;
        private final int f1844c;
        private String f1845d;
        private String f1846e;
        private String f1847f;
        private String f1848g;
        private String f1849h;
        private boolean f1850i;
        private String f1851j;
        private String f1852k;
        private int f1853l;

        static {
            CREATOR = new bs();
            f1842a = new HashMap();
            f1842a.put("department", C0368a.m2957d("department", 2));
            f1842a.put("description", C0368a.m2957d("description", 3));
            f1842a.put("endDate", C0368a.m2957d("endDate", 4));
            f1842a.put("location", C0368a.m2957d("location", 5));
            f1842a.put("name", C0368a.m2957d("name", 6));
            f1842a.put("primary", C0368a.m2956c("primary", 7));
            f1842a.put("startDate", C0368a.m2957d("startDate", 8));
            f1842a.put("title", C0368a.m2957d("title", 9));
            f1842a.put("type", C0368a.m2951a("type", 10, new ab().m2821a("work", 0).m2821a("school", 1), false));
        }

        public C0388f() {
            this.f1844c = 1;
            this.f1843b = new HashSet();
        }

        C0388f(Set set, int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, int i2) {
            this.f1843b = set;
            this.f1844c = i;
            this.f1845d = str;
            this.f1846e = str2;
            this.f1847f = str3;
            this.f1848g = str4;
            this.f1849h = str5;
            this.f1850i = z;
            this.f1851j = str6;
            this.f1852k = str7;
            this.f1853l = i2;
        }

        public /* synthetic */ Object m3486a() {
            return m3503p();
        }

        protected Object m3487a(String str) {
            return null;
        }

        protected boolean m3488a(C0368a c0368a) {
            return this.f1843b.contains(Integer.valueOf(c0368a.m2967g()));
        }

        protected Object m3489b(C0368a c0368a) {
            switch (c0368a.m2967g()) {
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    return this.f1845d;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    return this.f1846e;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    return this.f1847f;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    return this.f1848g;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    return this.f1849h;
                case C0338e.MapAttrs_uiRotateGestures /*7*/:
                    return Boolean.valueOf(this.f1850i);
                case C0338e.MapAttrs_uiScrollGestures /*8*/:
                    return this.f1851j;
                case C0338e.MapAttrs_uiTiltGestures /*9*/:
                    return this.f1852k;
                case C0338e.MapAttrs_uiZoomControls /*10*/:
                    return Integer.valueOf(this.f1853l);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + c0368a.m2967g());
            }
        }

        public HashMap m3490b() {
            return f1842a;
        }

        protected boolean m3491b(String str) {
            return false;
        }

        public int describeContents() {
            bs bsVar = CREATOR;
            return 0;
        }

        Set m3492e() {
            return this.f1843b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0388f)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C0388f c0388f = (C0388f) obj;
            for (C0368a c0368a : f1842a.values()) {
                if (m3488a(c0368a)) {
                    if (!c0388f.m3488a(c0368a)) {
                        return false;
                    }
                    if (!m3489b(c0368a).equals(c0388f.m3489b(c0368a))) {
                        return false;
                    }
                } else if (c0388f.m3488a(c0368a)) {
                    return false;
                }
            }
            return true;
        }

        int m3493f() {
            return this.f1844c;
        }

        public String m3494g() {
            return this.f1845d;
        }

        public String m3495h() {
            return this.f1846e;
        }

        public int hashCode() {
            int i = 0;
            for (C0368a c0368a : f1842a.values()) {
                int hashCode;
                if (m3488a(c0368a)) {
                    hashCode = m3489b(c0368a).hashCode() + (i + c0368a.m2967g());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public String m3496i() {
            return this.f1847f;
        }

        public String m3497j() {
            return this.f1848g;
        }

        public String m3498k() {
            return this.f1849h;
        }

        public boolean m3499l() {
            return this.f1850i;
        }

        public String m3500m() {
            return this.f1851j;
        }

        public String m3501n() {
            return this.f1852k;
        }

        public int m3502o() {
            return this.f1853l;
        }

        public C0388f m3503p() {
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            bs bsVar = CREATOR;
            bs.m3318a(this, parcel, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.cc.g */
    public final class C0390g extends ae implements SafeParcelable, C0389i {
        public static final bt CREATOR;
        private static final HashMap f1854a;
        private final Set f1855b;
        private final int f1856c;
        private boolean f1857d;
        private String f1858e;

        static {
            CREATOR = new bt();
            f1854a = new HashMap();
            f1854a.put("primary", C0368a.m2956c("primary", 2));
            f1854a.put("value", C0368a.m2957d("value", 3));
        }

        public C0390g() {
            this.f1856c = 1;
            this.f1855b = new HashSet();
        }

        C0390g(Set set, int i, boolean z, String str) {
            this.f1855b = set;
            this.f1856c = i;
            this.f1857d = z;
            this.f1858e = str;
        }

        public /* synthetic */ Object m3504a() {
            return m3514i();
        }

        protected Object m3505a(String str) {
            return null;
        }

        protected boolean m3506a(C0368a c0368a) {
            return this.f1855b.contains(Integer.valueOf(c0368a.m2967g()));
        }

        protected Object m3507b(C0368a c0368a) {
            switch (c0368a.m2967g()) {
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    return Boolean.valueOf(this.f1857d);
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    return this.f1858e;
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + c0368a.m2967g());
            }
        }

        public HashMap m3508b() {
            return f1854a;
        }

        protected boolean m3509b(String str) {
            return false;
        }

        public int describeContents() {
            bt btVar = CREATOR;
            return 0;
        }

        Set m3510e() {
            return this.f1855b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0390g)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C0390g c0390g = (C0390g) obj;
            for (C0368a c0368a : f1854a.values()) {
                if (m3506a(c0368a)) {
                    if (!c0390g.m3506a(c0368a)) {
                        return false;
                    }
                    if (!m3507b(c0368a).equals(c0390g.m3507b(c0368a))) {
                        return false;
                    }
                } else if (c0390g.m3506a(c0368a)) {
                    return false;
                }
            }
            return true;
        }

        int m3511f() {
            return this.f1856c;
        }

        public boolean m3512g() {
            return this.f1857d;
        }

        public String m3513h() {
            return this.f1858e;
        }

        public int hashCode() {
            int i = 0;
            for (C0368a c0368a : f1854a.values()) {
                int hashCode;
                if (m3506a(c0368a)) {
                    hashCode = m3507b(c0368a).hashCode() + (i + c0368a.m2967g());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public C0390g m3514i() {
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            bt btVar = CREATOR;
            bt.m3321a(this, parcel, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.cc.h */
    public final class C0392h extends ae implements SafeParcelable, C0391j {
        public static final bu CREATOR;
        private static final HashMap f1859a;
        private final Set f1860b;
        private final int f1861c;
        private String f1862d;
        private final int f1863e;
        private int f1864f;
        private String f1865g;

        static {
            CREATOR = new bu();
            f1859a = new HashMap();
            f1859a.put("label", C0368a.m2957d("label", 5));
            f1859a.put("type", C0368a.m2951a("type", 6, new ab().m2821a("home", 0).m2821a("work", 1).m2821a("blog", 2).m2821a("profile", 3).m2821a("other", 4).m2821a("otherProfile", 5).m2821a("contributor", 6).m2821a("website", 7), false));
            f1859a.put("value", C0368a.m2957d("value", 4));
        }

        public C0392h() {
            this.f1863e = 4;
            this.f1861c = 2;
            this.f1860b = new HashSet();
        }

        C0392h(Set set, int i, String str, int i2, String str2, int i3) {
            this.f1863e = 4;
            this.f1860b = set;
            this.f1861c = i;
            this.f1862d = str;
            this.f1864f = i2;
            this.f1865g = str2;
        }

        public /* synthetic */ Object m3515a() {
            return m3527k();
        }

        protected Object m3516a(String str) {
            return null;
        }

        protected boolean m3517a(C0368a c0368a) {
            return this.f1860b.contains(Integer.valueOf(c0368a.m2967g()));
        }

        protected Object m3518b(C0368a c0368a) {
            switch (c0368a.m2967g()) {
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    return this.f1865g;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    return this.f1862d;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    return Integer.valueOf(this.f1864f);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + c0368a.m2967g());
            }
        }

        public HashMap m3519b() {
            return f1859a;
        }

        protected boolean m3520b(String str) {
            return false;
        }

        public int describeContents() {
            bu buVar = CREATOR;
            return 0;
        }

        Set m3521e() {
            return this.f1860b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0392h)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C0392h c0392h = (C0392h) obj;
            for (C0368a c0368a : f1859a.values()) {
                if (m3517a(c0368a)) {
                    if (!c0392h.m3517a(c0368a)) {
                        return false;
                    }
                    if (!m3518b(c0368a).equals(c0392h.m3518b(c0368a))) {
                        return false;
                    }
                } else if (c0392h.m3517a(c0368a)) {
                    return false;
                }
            }
            return true;
        }

        int m3522f() {
            return this.f1861c;
        }

        public String m3523g() {
            return this.f1862d;
        }

        @Deprecated
        public int m3524h() {
            return 4;
        }

        public int hashCode() {
            int i = 0;
            for (C0368a c0368a : f1859a.values()) {
                int hashCode;
                if (m3517a(c0368a)) {
                    hashCode = m3518b(c0368a).hashCode() + (i + c0368a.m2967g());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public int m3525i() {
            return this.f1864f;
        }

        public String m3526j() {
            return this.f1865g;
        }

        public C0392h m3527k() {
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            bu buVar = CREATOR;
            bu.m3324a(this, parcel, i);
        }
    }

    static {
        CREATOR = new bl();
        f1866a = new HashMap();
        f1866a.put("aboutMe", C0368a.m2957d("aboutMe", 2));
        f1866a.put("ageRange", C0368a.m2952a("ageRange", 3, C0376a.class));
        f1866a.put("birthday", C0368a.m2957d("birthday", 4));
        f1866a.put("braggingRights", C0368a.m2957d("braggingRights", 5));
        f1866a.put("circledByCount", C0368a.m2950a("circledByCount", 6));
        f1866a.put("cover", C0368a.m2952a("cover", 7, C0382b.class));
        f1866a.put("currentLocation", C0368a.m2957d("currentLocation", 8));
        f1866a.put("displayName", C0368a.m2957d("displayName", 9));
        f1866a.put("gender", C0368a.m2951a("gender", 12, new ab().m2821a("male", 0).m2821a("female", 1).m2821a("other", 2), false));
        f1866a.put("id", C0368a.m2957d("id", 14));
        f1866a.put("image", C0368a.m2952a("image", 15, C0384c.class));
        f1866a.put("isPlusUser", C0368a.m2956c("isPlusUser", 16));
        f1866a.put("language", C0368a.m2957d("language", 18));
        f1866a.put("name", C0368a.m2952a("name", 19, C0386d.class));
        f1866a.put("nickname", C0368a.m2957d("nickname", 20));
        f1866a.put("objectType", C0368a.m2951a("objectType", 21, new ab().m2821a("person", 0).m2821a("page", 1), false));
        f1866a.put("organizations", C0368a.m2955b("organizations", 22, C0388f.class));
        f1866a.put("placesLived", C0368a.m2955b("placesLived", 23, C0390g.class));
        f1866a.put("plusOneCount", C0368a.m2950a("plusOneCount", 24));
        f1866a.put("relationshipStatus", C0368a.m2951a("relationshipStatus", 25, new ab().m2821a("single", 0).m2821a("in_a_relationship", 1).m2821a("engaged", 2).m2821a("married", 3).m2821a("its_complicated", 4).m2821a("open_relationship", 5).m2821a("widowed", 6).m2821a("in_domestic_partnership", 7).m2821a("in_civil_union", 8), false));
        f1866a.put("tagline", C0368a.m2957d("tagline", 26));
        f1866a.put("url", C0368a.m2957d("url", 27));
        f1866a.put("urls", C0368a.m2955b("urls", 28, C0392h.class));
        f1866a.put("verified", C0368a.m2956c("verified", 29));
    }

    public cc() {
        this.f1869c = 2;
        this.f1868b = new HashSet();
    }

    cc(Set set, int i, String str, C0376a c0376a, String str2, String str3, int i2, C0382b c0382b, String str4, String str5, int i3, String str6, C0384c c0384c, boolean z, String str7, C0386d c0386d, String str8, int i4, List list, List list2, int i5, int i6, String str9, String str10, List list3, boolean z2) {
        this.f1868b = set;
        this.f1869c = i;
        this.f1870d = str;
        this.f1871e = c0376a;
        this.f1872f = str2;
        this.f1873g = str3;
        this.f1874h = i2;
        this.f1875i = c0382b;
        this.f1876j = str4;
        this.f1877k = str5;
        this.f1878l = i3;
        this.f1879m = str6;
        this.f1880n = c0384c;
        this.f1881o = z;
        this.f1882p = str7;
        this.f1883q = c0386d;
        this.f1884r = str8;
        this.f1885s = i4;
        this.f1886t = list;
        this.f1887u = list2;
        this.f1888v = i5;
        this.f1889w = i6;
        this.f1890x = str9;
        this.f1891y = str10;
        this.f1892z = list3;
        this.f1867A = z2;
    }

    public static cc m3528a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        cc a = CREATOR.m3298a(obtain);
        obtain.recycle();
        return a;
    }

    public String m3529A() {
        return this.f1890x;
    }

    public String m3530B() {
        return this.f1891y;
    }

    List m3531C() {
        return this.f1892z;
    }

    public boolean m3532D() {
        return this.f1867A;
    }

    public cc m3533E() {
        return this;
    }

    public /* synthetic */ Object m3534a() {
        return m3533E();
    }

    protected Object m3535a(String str) {
        return null;
    }

    protected boolean m3536a(C0368a c0368a) {
        return this.f1868b.contains(Integer.valueOf(c0368a.m2967g()));
    }

    protected Object m3537b(C0368a c0368a) {
        switch (c0368a.m2967g()) {
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                return this.f1870d;
            case C0338e.MapAttrs_cameraTargetLng /*3*/:
                return this.f1871e;
            case C0338e.MapAttrs_cameraTilt /*4*/:
                return this.f1872f;
            case C0338e.MapAttrs_cameraZoom /*5*/:
                return this.f1873g;
            case C0338e.MapAttrs_uiCompass /*6*/:
                return Integer.valueOf(this.f1874h);
            case C0338e.MapAttrs_uiRotateGestures /*7*/:
                return this.f1875i;
            case C0338e.MapAttrs_uiScrollGestures /*8*/:
                return this.f1876j;
            case C0338e.MapAttrs_uiTiltGestures /*9*/:
                return this.f1877k;
            case C0338e.MapAttrs_useViewLifecycle /*12*/:
                return Integer.valueOf(this.f1878l);
            case 14:
                return this.f1879m;
            case 15:
                return this.f1880n;
            case 16:
                return Boolean.valueOf(this.f1881o);
            case 18:
                return this.f1882p;
            case 19:
                return this.f1883q;
            case 20:
                return this.f1884r;
            case 21:
                return Integer.valueOf(this.f1885s);
            case 22:
                return this.f1886t;
            case 23:
                return this.f1887u;
            case 24:
                return Integer.valueOf(this.f1888v);
            case 25:
                return Integer.valueOf(this.f1889w);
            case 26:
                return this.f1890x;
            case 27:
                return this.f1891y;
            case 28:
                return this.f1892z;
            case 29:
                return Boolean.valueOf(this.f1867A);
            default:
                throw new IllegalStateException("Unknown safe parcelable id=" + c0368a.m2967g());
        }
    }

    public HashMap m3538b() {
        return f1866a;
    }

    protected boolean m3539b(String str) {
        return false;
    }

    public int describeContents() {
        bl blVar = CREATOR;
        return 0;
    }

    Set m3540e() {
        return this.f1868b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof cc)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        cc ccVar = (cc) obj;
        for (C0368a c0368a : f1866a.values()) {
            if (m3536a(c0368a)) {
                if (!ccVar.m3536a(c0368a)) {
                    return false;
                }
                if (!m3537b(c0368a).equals(ccVar.m3537b(c0368a))) {
                    return false;
                }
            } else if (ccVar.m3536a(c0368a)) {
                return false;
            }
        }
        return true;
    }

    int m3541f() {
        return this.f1869c;
    }

    public String m3542g() {
        return this.f1870d;
    }

    C0376a m3543h() {
        return this.f1871e;
    }

    public int hashCode() {
        int i = 0;
        for (C0368a c0368a : f1866a.values()) {
            int hashCode;
            if (m3536a(c0368a)) {
                hashCode = m3537b(c0368a).hashCode() + (i + c0368a.m2967g());
            } else {
                hashCode = i;
            }
            i = hashCode;
        }
        return i;
    }

    public String m3544i() {
        return this.f1872f;
    }

    public String m3545j() {
        return this.f1873g;
    }

    public int m3546k() {
        return this.f1874h;
    }

    C0382b m3547l() {
        return this.f1875i;
    }

    public String m3548m() {
        return this.f1876j;
    }

    public String m3549n() {
        return this.f1877k;
    }

    public int m3550o() {
        return this.f1878l;
    }

    public String m3551p() {
        return this.f1879m;
    }

    C0384c m3552q() {
        return this.f1880n;
    }

    public boolean m3553r() {
        return this.f1881o;
    }

    public String m3554s() {
        return this.f1882p;
    }

    C0386d m3555t() {
        return this.f1883q;
    }

    public String m3556u() {
        return this.f1884r;
    }

    public int m3557v() {
        return this.f1885s;
    }

    List m3558w() {
        return this.f1886t;
    }

    public void writeToParcel(Parcel parcel, int i) {
        bl blVar = CREATOR;
        bl.m3297a(this, parcel, i);
    }

    List m3559x() {
        return this.f1887u;
    }

    public int m3560y() {
        return this.f1888v;
    }

    public int m3561z() {
        return this.f1889w;
    }
}
