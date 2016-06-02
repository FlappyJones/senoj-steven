package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ae.C0368a;
import com.google.android.gms.plus.p021a.p022a.C0372a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class bx extends ae implements SafeParcelable, C0372a {
    public static final bh CREATOR;
    private static final HashMap f1747a;
    private String f1748A;
    private String f1749B;
    private String f1750C;
    private String f1751D;
    private bx f1752E;
    private String f1753F;
    private String f1754G;
    private String f1755H;
    private String f1756I;
    private bx f1757J;
    private double f1758K;
    private bx f1759L;
    private double f1760M;
    private String f1761N;
    private bx f1762O;
    private List f1763P;
    private String f1764Q;
    private String f1765R;
    private String f1766S;
    private String f1767T;
    private bx f1768U;
    private String f1769V;
    private String f1770W;
    private String f1771X;
    private bx f1772Y;
    private String f1773Z;
    private String aa;
    private String ab;
    private String ac;
    private String ad;
    private String ae;
    private final Set f1774b;
    private final int f1775c;
    private bx f1776d;
    private List f1777e;
    private bx f1778f;
    private String f1779g;
    private String f1780h;
    private String f1781i;
    private List f1782j;
    private int f1783k;
    private List f1784l;
    private bx f1785m;
    private List f1786n;
    private String f1787o;
    private String f1788p;
    private bx f1789q;
    private String f1790r;
    private String f1791s;
    private String f1792t;
    private List f1793u;
    private String f1794v;
    private String f1795w;
    private String f1796x;
    private String f1797y;
    private String f1798z;

    static {
        CREATOR = new bh();
        f1747a = new HashMap();
        f1747a.put("about", C0368a.m2952a("about", 2, bx.class));
        f1747a.put("additionalName", C0368a.m2958e("additionalName", 3));
        f1747a.put("address", C0368a.m2952a("address", 4, bx.class));
        f1747a.put("addressCountry", C0368a.m2957d("addressCountry", 5));
        f1747a.put("addressLocality", C0368a.m2957d("addressLocality", 6));
        f1747a.put("addressRegion", C0368a.m2957d("addressRegion", 7));
        f1747a.put("associated_media", C0368a.m2955b("associated_media", 8, bx.class));
        f1747a.put("attendeeCount", C0368a.m2950a("attendeeCount", 9));
        f1747a.put("attendees", C0368a.m2955b("attendees", 10, bx.class));
        f1747a.put("audio", C0368a.m2952a("audio", 11, bx.class));
        f1747a.put("author", C0368a.m2955b("author", 12, bx.class));
        f1747a.put("bestRating", C0368a.m2957d("bestRating", 13));
        f1747a.put("birthDate", C0368a.m2957d("birthDate", 14));
        f1747a.put("byArtist", C0368a.m2952a("byArtist", 15, bx.class));
        f1747a.put("caption", C0368a.m2957d("caption", 16));
        f1747a.put("contentSize", C0368a.m2957d("contentSize", 17));
        f1747a.put("contentUrl", C0368a.m2957d("contentUrl", 18));
        f1747a.put("contributor", C0368a.m2955b("contributor", 19, bx.class));
        f1747a.put("dateCreated", C0368a.m2957d("dateCreated", 20));
        f1747a.put("dateModified", C0368a.m2957d("dateModified", 21));
        f1747a.put("datePublished", C0368a.m2957d("datePublished", 22));
        f1747a.put("description", C0368a.m2957d("description", 23));
        f1747a.put("duration", C0368a.m2957d("duration", 24));
        f1747a.put("embedUrl", C0368a.m2957d("embedUrl", 25));
        f1747a.put("endDate", C0368a.m2957d("endDate", 26));
        f1747a.put("familyName", C0368a.m2957d("familyName", 27));
        f1747a.put("gender", C0368a.m2957d("gender", 28));
        f1747a.put("geo", C0368a.m2952a("geo", 29, bx.class));
        f1747a.put("givenName", C0368a.m2957d("givenName", 30));
        f1747a.put("height", C0368a.m2957d("height", 31));
        f1747a.put("id", C0368a.m2957d("id", 32));
        f1747a.put("image", C0368a.m2957d("image", 33));
        f1747a.put("inAlbum", C0368a.m2952a("inAlbum", 34, bx.class));
        f1747a.put("latitude", C0368a.m2954b("latitude", 36));
        f1747a.put("location", C0368a.m2952a("location", 37, bx.class));
        f1747a.put("longitude", C0368a.m2954b("longitude", 38));
        f1747a.put("name", C0368a.m2957d("name", 39));
        f1747a.put("partOfTVSeries", C0368a.m2952a("partOfTVSeries", 40, bx.class));
        f1747a.put("performers", C0368a.m2955b("performers", 41, bx.class));
        f1747a.put("playerType", C0368a.m2957d("playerType", 42));
        f1747a.put("postOfficeBoxNumber", C0368a.m2957d("postOfficeBoxNumber", 43));
        f1747a.put("postalCode", C0368a.m2957d("postalCode", 44));
        f1747a.put("ratingValue", C0368a.m2957d("ratingValue", 45));
        f1747a.put("reviewRating", C0368a.m2952a("reviewRating", 46, bx.class));
        f1747a.put("startDate", C0368a.m2957d("startDate", 47));
        f1747a.put("streetAddress", C0368a.m2957d("streetAddress", 48));
        f1747a.put("text", C0368a.m2957d("text", 49));
        f1747a.put("thumbnail", C0368a.m2952a("thumbnail", 50, bx.class));
        f1747a.put("thumbnailUrl", C0368a.m2957d("thumbnailUrl", 51));
        f1747a.put("tickerSymbol", C0368a.m2957d("tickerSymbol", 52));
        f1747a.put("type", C0368a.m2957d("type", 53));
        f1747a.put("url", C0368a.m2957d("url", 54));
        f1747a.put("width", C0368a.m2957d("width", 55));
        f1747a.put("worstRating", C0368a.m2957d("worstRating", 56));
    }

    public bx() {
        this.f1775c = 1;
        this.f1774b = new HashSet();
    }

    bx(Set set, int i, bx bxVar, List list, bx bxVar2, String str, String str2, String str3, List list2, int i2, List list3, bx bxVar3, List list4, String str4, String str5, bx bxVar4, String str6, String str7, String str8, List list5, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, bx bxVar5, String str18, String str19, String str20, String str21, bx bxVar6, double d, bx bxVar7, double d2, String str22, bx bxVar8, List list6, String str23, String str24, String str25, String str26, bx bxVar9, String str27, String str28, String str29, bx bxVar10, String str30, String str31, String str32, String str33, String str34, String str35) {
        this.f1774b = set;
        this.f1775c = i;
        this.f1776d = bxVar;
        this.f1777e = list;
        this.f1778f = bxVar2;
        this.f1779g = str;
        this.f1780h = str2;
        this.f1781i = str3;
        this.f1782j = list2;
        this.f1783k = i2;
        this.f1784l = list3;
        this.f1785m = bxVar3;
        this.f1786n = list4;
        this.f1787o = str4;
        this.f1788p = str5;
        this.f1789q = bxVar4;
        this.f1790r = str6;
        this.f1791s = str7;
        this.f1792t = str8;
        this.f1793u = list5;
        this.f1794v = str9;
        this.f1795w = str10;
        this.f1796x = str11;
        this.f1797y = str12;
        this.f1798z = str13;
        this.f1748A = str14;
        this.f1749B = str15;
        this.f1750C = str16;
        this.f1751D = str17;
        this.f1752E = bxVar5;
        this.f1753F = str18;
        this.f1754G = str19;
        this.f1755H = str20;
        this.f1756I = str21;
        this.f1757J = bxVar6;
        this.f1758K = d;
        this.f1759L = bxVar7;
        this.f1760M = d2;
        this.f1761N = str22;
        this.f1762O = bxVar8;
        this.f1763P = list6;
        this.f1764Q = str23;
        this.f1765R = str24;
        this.f1766S = str25;
        this.f1767T = str26;
        this.f1768U = bxVar9;
        this.f1769V = str27;
        this.f1770W = str28;
        this.f1771X = str29;
        this.f1772Y = bxVar10;
        this.f1773Z = str30;
        this.aa = str31;
        this.ab = str32;
        this.ac = str33;
        this.ad = str34;
        this.ae = str35;
    }

    public String m3335A() {
        return this.f1796x;
    }

    public String m3336B() {
        return this.f1797y;
    }

    public String m3337C() {
        return this.f1798z;
    }

    public String m3338D() {
        return this.f1748A;
    }

    public String m3339E() {
        return this.f1749B;
    }

    public String m3340F() {
        return this.f1750C;
    }

    public String m3341G() {
        return this.f1751D;
    }

    bx m3342H() {
        return this.f1752E;
    }

    public String m3343I() {
        return this.f1753F;
    }

    public String m3344J() {
        return this.f1754G;
    }

    public String m3345K() {
        return this.f1755H;
    }

    public String m3346L() {
        return this.f1756I;
    }

    bx m3347M() {
        return this.f1757J;
    }

    public double m3348N() {
        return this.f1758K;
    }

    bx m3349O() {
        return this.f1759L;
    }

    public double m3350P() {
        return this.f1760M;
    }

    public String m3351Q() {
        return this.f1761N;
    }

    bx m3352R() {
        return this.f1762O;
    }

    List m3353S() {
        return this.f1763P;
    }

    public String m3354T() {
        return this.f1764Q;
    }

    public String m3355U() {
        return this.f1765R;
    }

    public String m3356V() {
        return this.f1766S;
    }

    public String m3357W() {
        return this.f1767T;
    }

    bx m3358X() {
        return this.f1768U;
    }

    public String m3359Y() {
        return this.f1769V;
    }

    public String m3360Z() {
        return this.f1770W;
    }

    public /* synthetic */ Object m3361a() {
        return ai();
    }

    protected Object m3362a(String str) {
        return null;
    }

    protected boolean m3363a(C0368a c0368a) {
        return this.f1774b.contains(Integer.valueOf(c0368a.m2967g()));
    }

    public String aa() {
        return this.f1771X;
    }

    bx ab() {
        return this.f1772Y;
    }

    public String ac() {
        return this.f1773Z;
    }

    public String ad() {
        return this.aa;
    }

    public String ae() {
        return this.ab;
    }

    public String af() {
        return this.ac;
    }

    public String ag() {
        return this.ad;
    }

    public String ah() {
        return this.ae;
    }

    public bx ai() {
        return this;
    }

    protected Object m3364b(C0368a c0368a) {
        switch (c0368a.m2967g()) {
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                return this.f1776d;
            case C0338e.MapAttrs_cameraTargetLng /*3*/:
                return this.f1777e;
            case C0338e.MapAttrs_cameraTilt /*4*/:
                return this.f1778f;
            case C0338e.MapAttrs_cameraZoom /*5*/:
                return this.f1779g;
            case C0338e.MapAttrs_uiCompass /*6*/:
                return this.f1780h;
            case C0338e.MapAttrs_uiRotateGestures /*7*/:
                return this.f1781i;
            case C0338e.MapAttrs_uiScrollGestures /*8*/:
                return this.f1782j;
            case C0338e.MapAttrs_uiTiltGestures /*9*/:
                return Integer.valueOf(this.f1783k);
            case C0338e.MapAttrs_uiZoomControls /*10*/:
                return this.f1784l;
            case C0338e.MapAttrs_uiZoomGestures /*11*/:
                return this.f1785m;
            case C0338e.MapAttrs_useViewLifecycle /*12*/:
                return this.f1786n;
            case C0338e.MapAttrs_zOrderOnTop /*13*/:
                return this.f1787o;
            case 14:
                return this.f1788p;
            case 15:
                return this.f1789q;
            case 16:
                return this.f1790r;
            case 17:
                return this.f1791s;
            case 18:
                return this.f1792t;
            case 19:
                return this.f1793u;
            case 20:
                return this.f1794v;
            case 21:
                return this.f1795w;
            case 22:
                return this.f1796x;
            case 23:
                return this.f1797y;
            case 24:
                return this.f1798z;
            case 25:
                return this.f1748A;
            case 26:
                return this.f1749B;
            case 27:
                return this.f1750C;
            case 28:
                return this.f1751D;
            case 29:
                return this.f1752E;
            case 30:
                return this.f1753F;
            case 31:
                return this.f1754G;
            case 32:
                return this.f1755H;
            case 33:
                return this.f1756I;
            case 34:
                return this.f1757J;
            case 36:
                return Double.valueOf(this.f1758K);
            case 37:
                return this.f1759L;
            case 38:
                return Double.valueOf(this.f1760M);
            case 39:
                return this.f1761N;
            case 40:
                return this.f1762O;
            case 41:
                return this.f1763P;
            case 42:
                return this.f1764Q;
            case 43:
                return this.f1765R;
            case 44:
                return this.f1766S;
            case 45:
                return this.f1767T;
            case 46:
                return this.f1768U;
            case 47:
                return this.f1769V;
            case 48:
                return this.f1770W;
            case 49:
                return this.f1771X;
            case 50:
                return this.f1772Y;
            case 51:
                return this.f1773Z;
            case 52:
                return this.aa;
            case 53:
                return this.ab;
            case 54:
                return this.ac;
            case 55:
                return this.ad;
            case 56:
                return this.ae;
            default:
                throw new IllegalStateException("Unknown safe parcelable id=" + c0368a.m2967g());
        }
    }

    public HashMap m3365b() {
        return f1747a;
    }

    protected boolean m3366b(String str) {
        return false;
    }

    public int describeContents() {
        bh bhVar = CREATOR;
        return 0;
    }

    Set m3367e() {
        return this.f1774b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof bx)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        bx bxVar = (bx) obj;
        for (C0368a c0368a : f1747a.values()) {
            if (m3363a(c0368a)) {
                if (!bxVar.m3363a(c0368a)) {
                    return false;
                }
                if (!m3364b(c0368a).equals(bxVar.m3364b(c0368a))) {
                    return false;
                }
            } else if (bxVar.m3363a(c0368a)) {
                return false;
            }
        }
        return true;
    }

    int m3368f() {
        return this.f1775c;
    }

    bx m3369g() {
        return this.f1776d;
    }

    public List m3370h() {
        return this.f1777e;
    }

    public int hashCode() {
        int i = 0;
        for (C0368a c0368a : f1747a.values()) {
            int hashCode;
            if (m3363a(c0368a)) {
                hashCode = m3364b(c0368a).hashCode() + (i + c0368a.m2967g());
            } else {
                hashCode = i;
            }
            i = hashCode;
        }
        return i;
    }

    bx m3371i() {
        return this.f1778f;
    }

    public String m3372j() {
        return this.f1779g;
    }

    public String m3373k() {
        return this.f1780h;
    }

    public String m3374l() {
        return this.f1781i;
    }

    List m3375m() {
        return this.f1782j;
    }

    public int m3376n() {
        return this.f1783k;
    }

    List m3377o() {
        return this.f1784l;
    }

    bx m3378p() {
        return this.f1785m;
    }

    List m3379q() {
        return this.f1786n;
    }

    public String m3380r() {
        return this.f1787o;
    }

    public String m3381s() {
        return this.f1788p;
    }

    bx m3382t() {
        return this.f1789q;
    }

    public String m3383u() {
        return this.f1790r;
    }

    public String m3384v() {
        return this.f1791s;
    }

    public String m3385w() {
        return this.f1792t;
    }

    public void writeToParcel(Parcel parcel, int i) {
        bh bhVar = CREATOR;
        bh.m3272a(this, parcel, i);
    }

    List m3386x() {
        return this.f1793u;
    }

    public String m3387y() {
        return this.f1794v;
    }

    public String m3388z() {
        return this.f1795w;
    }
}
