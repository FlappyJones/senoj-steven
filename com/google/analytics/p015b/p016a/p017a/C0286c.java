package com.google.analytics.p015b.p016a.p017a;

import com.google.tagmanager.p014a.C0284x;
import com.google.tagmanager.p014a.C0288w;
import com.google.tagmanager.p014a.C0516h;
import com.google.tagmanager.p014a.ac;
import com.google.tagmanager.p014a.am;
import com.google.tagmanager.p014a.an;
import com.google.tagmanager.p014a.ap;
import com.google.tagmanager.p014a.aq;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.analytics.b.a.a.c */
public final class C0286c extends C0284x implements C0285j {
    public static aq f1416a;
    private static final C0286c f1417c;
    private static volatile ap f1418t;
    private final C0516h f1419d;
    private int f1420e;
    private C0292h f1421f;
    private Object f1422g;
    private List f1423h;
    private List f1424i;
    private List f1425j;
    private Object f1426k;
    private Object f1427l;
    private long f1428m;
    private boolean f1429n;
    private List f1430o;
    private List f1431p;
    private boolean f1432q;
    private byte f1433r;
    private int f1434s;

    static {
        f1416a = new C0287d();
        f1418t = null;
        f1417c = new C0286c(true);
        f1417c.m2256J();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C0286c(com.google.tagmanager.p014a.C0522k r11, com.google.tagmanager.p014a.C0526o r12) {
        /*
        r10 = this;
        r10.<init>();
        r0 = -1;
        r10.f1433r = r0;
        r0 = -1;
        r10.f1434s = r0;
        r10.m2256J();
        r2 = 0;
        r3 = com.google.tagmanager.p014a.C0516h.m4582i();
        r4 = com.google.tagmanager.p014a.C0524m.m4758a(r3);
        r1 = 0;
    L_0x0016:
        if (r1 != 0) goto L_0x01fa;
    L_0x0018:
        r5 = r11.m4722a();	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        switch(r5) {
            case 0: goto L_0x002a;
            case 8: goto L_0x002d;
            case 18: goto L_0x004b;
            case 26: goto L_0x005a;
            case 34: goto L_0x0077;
            case 42: goto L_0x0095;
            case 50: goto L_0x00b4;
            case 58: goto L_0x00c4;
            case 64: goto L_0x00d4;
            case 72: goto L_0x00e4;
            case 80: goto L_0x00f4;
            case 82: goto L_0x0121;
            case 90: goto L_0x01cb;
            case 96: goto L_0x01ea;
            default: goto L_0x001f;
        };	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
    L_0x001f:
        r0 = r10.m2254a(r11, r4, r12, r5);	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        if (r0 != 0) goto L_0x01f6;
    L_0x0025:
        r0 = 1;
        r1 = r2;
    L_0x0027:
        r2 = r1;
        r1 = r0;
        goto L_0x0016;
    L_0x002a:
        r0 = 1;
        r1 = r2;
        goto L_0x0027;
    L_0x002d:
        r0 = r11.m4745n();	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r6 = com.google.analytics.p015b.p016a.p017a.C0292h.m2372a(r0);	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        if (r6 != 0) goto L_0x0040;
    L_0x0037:
        r4.m4772d(r5);	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r4.m4772d(r0);	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r0 = r1;
        r1 = r2;
        goto L_0x0027;
    L_0x0040:
        r0 = r10.f1420e;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r0 = r0 | 1;
        r10.f1420e = r0;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r10.f1421f = r6;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r0 = r1;
        r1 = r2;
        goto L_0x0027;
    L_0x004b:
        r0 = r11.m4743l();	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r5 = r10.f1420e;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r5 = r5 | 2;
        r10.f1420e = r5;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r10.f1422g = r0;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r0 = r1;
        r1 = r2;
        goto L_0x0027;
    L_0x005a:
        r0 = r2 & 4;
        r5 = 4;
        if (r0 == r5) goto L_0x0284;
    L_0x005f:
        r0 = new java.util.ArrayList;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r0.<init>();	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r10.f1423h = r0;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r0 = r2 | 4;
    L_0x0068:
        r2 = r10.f1423h;	 Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
        r5 = f1416a;	 Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
        r5 = r11.m4723a(r5, r12);	 Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
        r2.add(r5);	 Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
        r9 = r1;
        r1 = r0;
        r0 = r9;
        goto L_0x0027;
    L_0x0077:
        r0 = r2 & 8;
        r5 = 8;
        if (r0 == r5) goto L_0x0281;
    L_0x007d:
        r0 = new java.util.ArrayList;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r0.<init>();	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r10.f1424i = r0;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r0 = r2 | 8;
    L_0x0086:
        r2 = r10.f1424i;	 Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
        r5 = f1416a;	 Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
        r5 = r11.m4723a(r5, r12);	 Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
        r2.add(r5);	 Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
        r9 = r1;
        r1 = r0;
        r0 = r9;
        goto L_0x0027;
    L_0x0095:
        r0 = r2 & 16;
        r5 = 16;
        if (r0 == r5) goto L_0x027e;
    L_0x009b:
        r0 = new java.util.ArrayList;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r0.<init>();	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r10.f1425j = r0;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r0 = r2 | 16;
    L_0x00a4:
        r2 = r10.f1425j;	 Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
        r5 = f1416a;	 Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
        r5 = r11.m4723a(r5, r12);	 Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
        r2.add(r5);	 Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
        r9 = r1;
        r1 = r0;
        r0 = r9;
        goto L_0x0027;
    L_0x00b4:
        r0 = r11.m4743l();	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r5 = r10.f1420e;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r5 = r5 | 4;
        r10.f1420e = r5;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r10.f1426k = r0;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r0 = r1;
        r1 = r2;
        goto L_0x0027;
    L_0x00c4:
        r0 = r11.m4743l();	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r5 = r10.f1420e;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r5 = r5 | 8;
        r10.f1420e = r5;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r10.f1427l = r0;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r0 = r1;
        r1 = r2;
        goto L_0x0027;
    L_0x00d4:
        r0 = r10.f1420e;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r0 = r0 | 16;
        r10.f1420e = r0;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r5 = r11.m4734e();	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r10.f1428m = r5;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r0 = r1;
        r1 = r2;
        goto L_0x0027;
    L_0x00e4:
        r0 = r10.f1420e;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r0 = r0 | 64;
        r10.f1420e = r0;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r0 = r11.m4740i();	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r10.f1432q = r0;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r0 = r1;
        r1 = r2;
        goto L_0x0027;
    L_0x00f4:
        r0 = r11.m4745n();	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r6 = com.google.analytics.p015b.p016a.p017a.C0290f.m2368a(r0);	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        if (r6 != 0) goto L_0x0108;
    L_0x00fe:
        r4.m4772d(r5);	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r4.m4772d(r0);	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r0 = r1;
        r1 = r2;
        goto L_0x0027;
    L_0x0108:
        r0 = r2 & 1024;
        r5 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        if (r0 == r5) goto L_0x027b;
    L_0x010e:
        r0 = new java.util.ArrayList;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r0.<init>();	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r10.f1431p = r0;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r0 = r2 | 1024;
    L_0x0117:
        r2 = r10.f1431p;	 Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
        r2.add(r6);	 Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
        r9 = r1;
        r1 = r0;
        r0 = r9;
        goto L_0x0027;
    L_0x0121:
        r0 = r11.m4750s();	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r6 = r11.m4731c(r0);	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r0 = r2;
    L_0x012a:
        r2 = r11.m4754w();	 Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
        if (r2 <= 0) goto L_0x01c3;
    L_0x0130:
        r2 = r11.m4745n();	 Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
        r7 = com.google.analytics.p015b.p016a.p017a.C0290f.m2368a(r2);	 Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
        if (r7 != 0) goto L_0x019c;
    L_0x013a:
        r4.m4772d(r5);	 Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
        r4.m4772d(r2);	 Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
        goto L_0x012a;
    L_0x0141:
        r1 = move-exception;
        r2 = r0;
        r0 = r1;
    L_0x0144:
        r0 = r0.m4566a(r10);	 Catch:{ all -> 0x0149 }
        throw r0;	 Catch:{ all -> 0x0149 }
    L_0x0149:
        r0 = move-exception;
    L_0x014a:
        r1 = r2 & 4;
        r5 = 4;
        if (r1 != r5) goto L_0x0157;
    L_0x014f:
        r1 = r10.f1423h;
        r1 = java.util.Collections.unmodifiableList(r1);
        r10.f1423h = r1;
    L_0x0157:
        r1 = r2 & 8;
        r5 = 8;
        if (r1 != r5) goto L_0x0165;
    L_0x015d:
        r1 = r10.f1424i;
        r1 = java.util.Collections.unmodifiableList(r1);
        r10.f1424i = r1;
    L_0x0165:
        r1 = r2 & 16;
        r5 = 16;
        if (r1 != r5) goto L_0x0173;
    L_0x016b:
        r1 = r10.f1425j;
        r1 = java.util.Collections.unmodifiableList(r1);
        r10.f1425j = r1;
    L_0x0173:
        r1 = r2 & 1024;
        r5 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        if (r1 != r5) goto L_0x0181;
    L_0x0179:
        r1 = r10.f1431p;
        r1 = java.util.Collections.unmodifiableList(r1);
        r10.f1431p = r1;
    L_0x0181:
        r1 = r2 & 512;
        r2 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        if (r1 != r2) goto L_0x018f;
    L_0x0187:
        r1 = r10.f1430o;
        r1 = java.util.Collections.unmodifiableList(r1);
        r10.f1430o = r1;
    L_0x018f:
        r4.m4761a();	 Catch:{ IOException -> 0x025c, all -> 0x0265 }
        r1 = r3.m4714a();
        r10.f1419d = r1;
    L_0x0198:
        r10.m2253R();
        throw r0;
    L_0x019c:
        r2 = r0 & 1024;
        r8 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        if (r2 == r8) goto L_0x01ab;
    L_0x01a2:
        r2 = new java.util.ArrayList;	 Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
        r2.<init>();	 Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
        r10.f1431p = r2;	 Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
        r0 = r0 | 1024;
    L_0x01ab:
        r2 = r10.f1431p;	 Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
        r2.add(r7);	 Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
        goto L_0x012a;
    L_0x01b2:
        r1 = move-exception;
        r2 = r0;
        r0 = r1;
    L_0x01b5:
        r1 = new com.google.tagmanager.a.af;	 Catch:{ all -> 0x0149 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0149 }
        r1.<init>(r0);	 Catch:{ all -> 0x0149 }
        r0 = r1.m4566a(r10);	 Catch:{ all -> 0x0149 }
        throw r0;	 Catch:{ all -> 0x0149 }
    L_0x01c3:
        r11.m4733d(r6);	 Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
        r9 = r1;
        r1 = r0;
        r0 = r9;
        goto L_0x0027;
    L_0x01cb:
        r0 = r2 & 512;
        r5 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        if (r0 == r5) goto L_0x0278;
    L_0x01d1:
        r0 = new java.util.ArrayList;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r0.<init>();	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r10.f1430o = r0;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r0 = r2 | 512;
    L_0x01da:
        r2 = r10.f1430o;	 Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
        r5 = f1416a;	 Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
        r5 = r11.m4723a(r5, r12);	 Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
        r2.add(r5);	 Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
        r9 = r1;
        r1 = r0;
        r0 = r9;
        goto L_0x0027;
    L_0x01ea:
        r0 = r10.f1420e;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r0 = r0 | 32;
        r10.f1420e = r0;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r0 = r11.m4740i();	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
        r10.f1429n = r0;	 Catch:{ af -> 0x0275, IOException -> 0x0272 }
    L_0x01f6:
        r0 = r1;
        r1 = r2;
        goto L_0x0027;
    L_0x01fa:
        r0 = r2 & 4;
        r1 = 4;
        if (r0 != r1) goto L_0x0207;
    L_0x01ff:
        r0 = r10.f1423h;
        r0 = java.util.Collections.unmodifiableList(r0);
        r10.f1423h = r0;
    L_0x0207:
        r0 = r2 & 8;
        r1 = 8;
        if (r0 != r1) goto L_0x0215;
    L_0x020d:
        r0 = r10.f1424i;
        r0 = java.util.Collections.unmodifiableList(r0);
        r10.f1424i = r0;
    L_0x0215:
        r0 = r2 & 16;
        r1 = 16;
        if (r0 != r1) goto L_0x0223;
    L_0x021b:
        r0 = r10.f1425j;
        r0 = java.util.Collections.unmodifiableList(r0);
        r10.f1425j = r0;
    L_0x0223:
        r0 = r2 & 1024;
        r1 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        if (r0 != r1) goto L_0x0231;
    L_0x0229:
        r0 = r10.f1431p;
        r0 = java.util.Collections.unmodifiableList(r0);
        r10.f1431p = r0;
    L_0x0231:
        r0 = r2 & 512;
        r1 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        if (r0 != r1) goto L_0x023f;
    L_0x0237:
        r0 = r10.f1430o;
        r0 = java.util.Collections.unmodifiableList(r0);
        r10.f1430o = r0;
    L_0x023f:
        r4.m4761a();	 Catch:{ IOException -> 0x024c, all -> 0x0254 }
        r0 = r3.m4714a();
        r10.f1419d = r0;
    L_0x0248:
        r10.m2253R();
        return;
    L_0x024c:
        r0 = move-exception;
        r0 = r3.m4714a();
        r10.f1419d = r0;
        goto L_0x0248;
    L_0x0254:
        r0 = move-exception;
        r1 = r3.m4714a();
        r10.f1419d = r1;
        throw r0;
    L_0x025c:
        r1 = move-exception;
        r1 = r3.m4714a();
        r10.f1419d = r1;
        goto L_0x0198;
    L_0x0265:
        r0 = move-exception;
        r1 = r3.m4714a();
        r10.f1419d = r1;
        throw r0;
    L_0x026d:
        r1 = move-exception;
        r2 = r0;
        r0 = r1;
        goto L_0x014a;
    L_0x0272:
        r0 = move-exception;
        goto L_0x01b5;
    L_0x0275:
        r0 = move-exception;
        goto L_0x0144;
    L_0x0278:
        r0 = r2;
        goto L_0x01da;
    L_0x027b:
        r0 = r2;
        goto L_0x0117;
    L_0x027e:
        r0 = r2;
        goto L_0x00a4;
    L_0x0281:
        r0 = r2;
        goto L_0x0086;
    L_0x0284:
        r0 = r2;
        goto L_0x0068;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.analytics.b.a.a.c.<init>(com.google.tagmanager.a.k, com.google.tagmanager.a.o):void");
    }

    private C0286c(C0288w c0288w) {
        super(c0288w);
        this.f1433r = (byte) -1;
        this.f1434s = -1;
        this.f1419d = c0288w.m1919r();
    }

    private C0286c(boolean z) {
        this.f1433r = (byte) -1;
        this.f1434s = -1;
        this.f1419d = C0516h.f2222a;
    }

    public static C0289e m2255F() {
        return C0289e.m2329u();
    }

    private void m2256J() {
        this.f1421f = C0292h.STRING;
        this.f1422g = "";
        this.f1423h = Collections.emptyList();
        this.f1424i = Collections.emptyList();
        this.f1425j = Collections.emptyList();
        this.f1426k = "";
        this.f1427l = "";
        this.f1428m = 0;
        this.f1429n = false;
        this.f1430o = Collections.emptyList();
        this.f1431p = Collections.emptyList();
        this.f1432q = false;
    }

    public static C0286c m2259a() {
        return f1417c;
    }

    public static C0289e m2260a(C0286c c0286c) {
        return C0286c.m2255F().m2338a(c0286c);
    }

    public int m2281A() {
        return this.f1430o.size();
    }

    public List m2282B() {
        return this.f1431p;
    }

    public int m2283C() {
        return this.f1431p.size();
    }

    public boolean m2284D() {
        return (this.f1420e & 64) == 64;
    }

    public boolean m2285E() {
        return this.f1432q;
    }

    public C0289e m2286G() {
        return C0286c.m2255F();
    }

    public C0289e m2287H() {
        return C0286c.m2260a(this);
    }

    public C0286c m2288a(int i) {
        return (C0286c) this.f1423h.get(i);
    }

    public C0286c m2289b() {
        return f1417c;
    }

    public C0286c m2290b(int i) {
        return (C0286c) this.f1424i.get(i);
    }

    public C0286c m2291c(int i) {
        return (C0286c) this.f1425j.get(i);
    }

    public aq m2292c() {
        return f1416a;
    }

    public C0286c m2293d(int i) {
        return (C0286c) this.f1430o.get(i);
    }

    public boolean m2294d() {
        return (this.f1420e & 1) == 1;
    }

    public C0292h m2295e() {
        return this.f1421f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0286c)) {
            return super.equals(obj);
        }
        C0286c c0286c = (C0286c) obj;
        boolean z = m2294d() == c0286c.m2294d();
        if (m2294d()) {
            z = z && m2295e() == c0286c.m2295e();
        }
        z = z && m2296f() == c0286c.m2296f();
        if (m2296f()) {
            z = z && m2297g().equals(c0286c.m2297g());
        }
        z = z && m2298h().equals(c0286c.m2298h());
        z = z && m2301k().equals(c0286c.m2301k());
        z = z && m2303m().equals(c0286c.m2303m());
        z = z && m2308r() == c0286c.m2308r();
        if (m2308r()) {
            z = z && m2309s().equals(c0286c.m2309s());
        }
        z = z && m2310t() == c0286c.m2310t();
        if (m2310t()) {
            z = z && m2311u().equals(c0286c.m2311u());
        }
        z = z && m2312v() == c0286c.m2312v();
        if (m2312v()) {
            z = z && m2313w() == c0286c.m2313w();
        }
        z = z && m2314x() == c0286c.m2314x();
        if (m2314x()) {
            z = z && m2315y() == c0286c.m2315y();
        }
        z = z && m2316z().equals(c0286c.m2316z());
        z = z && m2282B().equals(c0286c.m2282B());
        z = z && m2284D() == c0286c.m2284D();
        return m2284D() ? z && m2285E() == c0286c.m2285E() : z;
    }

    public boolean m2296f() {
        return (this.f1420e & 2) == 2;
    }

    public String m2297g() {
        Object obj = this.f1422g;
        if (obj instanceof String) {
            return (String) obj;
        }
        C0516h c0516h = (C0516h) obj;
        String f = c0516h.m4595f();
        if (c0516h.m4596g()) {
            this.f1422g = f;
        }
        return f;
    }

    public List m2298h() {
        return this.f1423h;
    }

    public int hashCode() {
        if (this.b != 0) {
            return this.b;
        }
        int hashCode = C0286c.class.hashCode() + 779;
        if (m2294d()) {
            hashCode = (((hashCode * 37) + 1) * 53) + ac.m4552a(m2295e());
        }
        if (m2296f()) {
            hashCode = (((hashCode * 37) + 2) * 53) + m2297g().hashCode();
        }
        if (m2299i() > 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + m2298h().hashCode();
        }
        if (m2302l() > 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + m2301k().hashCode();
        }
        if (m2307q() > 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + m2303m().hashCode();
        }
        if (m2308r()) {
            hashCode = (((hashCode * 37) + 6) * 53) + m2309s().hashCode();
        }
        if (m2310t()) {
            hashCode = (((hashCode * 37) + 7) * 53) + m2311u().hashCode();
        }
        if (m2312v()) {
            hashCode = (((hashCode * 37) + 8) * 53) + ac.m4551a(m2313w());
        }
        if (m2314x()) {
            hashCode = (((hashCode * 37) + 12) * 53) + ac.m4554a(m2315y());
        }
        if (m2281A() > 0) {
            hashCode = (((hashCode * 37) + 11) * 53) + m2316z().hashCode();
        }
        if (m2283C() > 0) {
            hashCode = (((hashCode * 37) + 10) * 53) + ac.m4553a(m2282B());
        }
        if (m2284D()) {
            hashCode = (((hashCode * 37) + 9) * 53) + ac.m4554a(m2285E());
        }
        hashCode = (hashCode * 29) + this.f1419d.hashCode();
        this.b = hashCode;
        return hashCode;
    }

    public int m2299i() {
        return this.f1423h.size();
    }

    public final boolean m2300j() {
        boolean z = true;
        byte b = this.f1433r;
        if (b != -1) {
            if (b != (byte) 1) {
                z = false;
            }
            return z;
        } else if (m2294d()) {
            int i = 0;
            while (i < m2299i()) {
                if (m2288a(i).m2300j()) {
                    i++;
                } else {
                    this.f1433r = (byte) 0;
                    return false;
                }
            }
            i = 0;
            while (i < m2302l()) {
                if (m2290b(i).m2300j()) {
                    i++;
                } else {
                    this.f1433r = (byte) 0;
                    return false;
                }
            }
            i = 0;
            while (i < m2307q()) {
                if (m2291c(i).m2300j()) {
                    i++;
                } else {
                    this.f1433r = (byte) 0;
                    return false;
                }
            }
            i = 0;
            while (i < m2281A()) {
                if (m2293d(i).m2300j()) {
                    i++;
                } else {
                    this.f1433r = (byte) 0;
                    return false;
                }
            }
            if (m2252I()) {
                this.f1433r = (byte) 1;
                return true;
            }
            this.f1433r = (byte) 0;
            return false;
        } else {
            this.f1433r = (byte) 0;
            return false;
        }
    }

    public List m2301k() {
        return this.f1424i;
    }

    public int m2302l() {
        return this.f1424i.size();
    }

    public List m2303m() {
        return this.f1425j;
    }

    public /* synthetic */ an m2304n() {
        return m2287H();
    }

    public /* synthetic */ an m2305o() {
        return m2286G();
    }

    public /* synthetic */ am m2306p() {
        return m2289b();
    }

    public int m2307q() {
        return this.f1425j.size();
    }

    public boolean m2308r() {
        return (this.f1420e & 4) == 4;
    }

    public String m2309s() {
        Object obj = this.f1426k;
        if (obj instanceof String) {
            return (String) obj;
        }
        C0516h c0516h = (C0516h) obj;
        String f = c0516h.m4595f();
        if (c0516h.m4596g()) {
            this.f1426k = f;
        }
        return f;
    }

    public boolean m2310t() {
        return (this.f1420e & 8) == 8;
    }

    public String m2311u() {
        Object obj = this.f1427l;
        if (obj instanceof String) {
            return (String) obj;
        }
        C0516h c0516h = (C0516h) obj;
        String f = c0516h.m4595f();
        if (c0516h.m4596g()) {
            this.f1427l = f;
        }
        return f;
    }

    public boolean m2312v() {
        return (this.f1420e & 16) == 16;
    }

    public long m2313w() {
        return this.f1428m;
    }

    public boolean m2314x() {
        return (this.f1420e & 32) == 32;
    }

    public boolean m2315y() {
        return this.f1429n;
    }

    public List m2316z() {
        return this.f1430o;
    }
}
