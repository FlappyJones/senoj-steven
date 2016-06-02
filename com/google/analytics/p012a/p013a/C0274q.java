package com.google.analytics.p012a.p013a;

import com.google.analytics.p015b.p016a.p017a.C0286c;
import com.google.tagmanager.p014a.C0255t;
import com.google.tagmanager.p014a.C0261v;
import com.google.tagmanager.p014a.C0516h;
import com.google.tagmanager.p014a.ac;
import com.google.tagmanager.p014a.ah;
import com.google.tagmanager.p014a.ai;
import com.google.tagmanager.p014a.am;
import com.google.tagmanager.p014a.an;
import com.google.tagmanager.p014a.ap;
import com.google.tagmanager.p014a.aq;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.analytics.a.a.q */
public final class C0274q extends C0255t implements C0273t {
    public static aq f1348a;
    private static final C0274q f1349c;
    private static volatile ap f1350x;
    private final C0516h f1351d;
    private int f1352e;
    private ai f1353f;
    private List f1354g;
    private List f1355h;
    private List f1356i;
    private List f1357j;
    private List f1358k;
    private List f1359l;
    private Object f1360m;
    private Object f1361n;
    private Object f1362o;
    private Object f1363p;
    private C0257c f1364q;
    private float f1365r;
    private boolean f1366s;
    private ai f1367t;
    private int f1368u;
    private byte f1369v;
    private int f1370w;

    static {
        f1348a = new C0275r();
        f1350x = null;
        f1349c = new C0274q(true);
        f1349c.m2048S();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C0274q(com.google.tagmanager.p014a.C0522k r14, com.google.tagmanager.p014a.C0526o r15) {
        /*
        r13 = this;
        r11 = 8;
        r10 = 4;
        r9 = 2;
        r8 = 16;
        r1 = 1;
        r13.<init>();
        r0 = -1;
        r13.f1369v = r0;
        r0 = -1;
        r13.f1370w = r0;
        r13.m2048S();
        r3 = 0;
        r5 = com.google.tagmanager.p014a.C0516h.m4582i();
        r6 = com.google.tagmanager.p014a.C0524m.m4758a(r5);
        r2 = 0;
    L_0x001d:
        if (r2 != 0) goto L_0x01b9;
    L_0x001f:
        r0 = r14.m4722a();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        switch(r0) {
            case 0: goto L_0x0031;
            case 10: goto L_0x0034;
            case 18: goto L_0x004e;
            case 26: goto L_0x006a;
            case 34: goto L_0x0086;
            case 42: goto L_0x00a2;
            case 50: goto L_0x00bf;
            case 58: goto L_0x00de;
            case 74: goto L_0x00fd;
            case 82: goto L_0x010d;
            case 98: goto L_0x011d;
            case 106: goto L_0x012d;
            case 114: goto L_0x013d;
            case 125: goto L_0x016c;
            case 130: goto L_0x017c;
            case 136: goto L_0x0199;
            case 144: goto L_0x01a9;
            default: goto L_0x0026;
        };	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
    L_0x0026:
        r0 = r13.m1873a(r14, r6, r15, r0);	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        if (r0 != 0) goto L_0x01b5;
    L_0x002c:
        r0 = r1;
        r2 = r3;
    L_0x002e:
        r3 = r2;
        r2 = r0;
        goto L_0x001d;
    L_0x0031:
        r0 = r1;
        r2 = r3;
        goto L_0x002e;
    L_0x0034:
        r4 = r14.m4743l();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r3 & 1;
        if (r0 == r1) goto L_0x02ff;
    L_0x003c:
        r0 = new com.google.tagmanager.a.ah;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0.<init>();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.f1353f = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r3 | 1;
    L_0x0045:
        r3 = r13.f1353f;	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r3.m4571a(r4);	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r12 = r2;
        r2 = r0;
        r0 = r12;
        goto L_0x002e;
    L_0x004e:
        r0 = r3 & 2;
        if (r0 == r9) goto L_0x02fc;
    L_0x0052:
        r0 = new java.util.ArrayList;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0.<init>();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.f1354g = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r3 | 2;
    L_0x005b:
        r3 = r13.f1354g;	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r4 = com.google.analytics.p015b.p016a.p017a.C0286c.f1416a;	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r4 = r14.m4723a(r4, r15);	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r3.add(r4);	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r12 = r2;
        r2 = r0;
        r0 = r12;
        goto L_0x002e;
    L_0x006a:
        r0 = r3 & 4;
        if (r0 == r10) goto L_0x02f9;
    L_0x006e:
        r0 = new java.util.ArrayList;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0.<init>();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.f1355h = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r3 | 4;
    L_0x0077:
        r3 = r13.f1355h;	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r4 = com.google.analytics.p012a.p013a.C0270m.f1336a;	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r4 = r14.m4723a(r4, r15);	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r3.add(r4);	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r12 = r2;
        r2 = r0;
        r0 = r12;
        goto L_0x002e;
    L_0x0086:
        r0 = r3 & 8;
        if (r0 == r11) goto L_0x02f6;
    L_0x008a:
        r0 = new java.util.ArrayList;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0.<init>();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.f1356i = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r3 | 8;
    L_0x0093:
        r3 = r13.f1356i;	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r4 = com.google.analytics.p012a.p013a.C0266i.f1318a;	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r4 = r14.m4723a(r4, r15);	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r3.add(r4);	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r12 = r2;
        r2 = r0;
        r0 = r12;
        goto L_0x002e;
    L_0x00a2:
        r0 = r3 & 16;
        if (r0 == r8) goto L_0x02f3;
    L_0x00a6:
        r0 = new java.util.ArrayList;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0.<init>();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.f1357j = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r3 | 16;
    L_0x00af:
        r3 = r13.f1357j;	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r4 = com.google.analytics.p012a.p013a.C0266i.f1318a;	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r4 = r14.m4723a(r4, r15);	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r3.add(r4);	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r12 = r2;
        r2 = r0;
        r0 = r12;
        goto L_0x002e;
    L_0x00bf:
        r0 = r3 & 32;
        r4 = 32;
        if (r0 == r4) goto L_0x02f0;
    L_0x00c5:
        r0 = new java.util.ArrayList;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0.<init>();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.f1358k = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r3 | 32;
    L_0x00ce:
        r3 = r13.f1358k;	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r4 = com.google.analytics.p012a.p013a.C0266i.f1318a;	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r4 = r14.m4723a(r4, r15);	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r3.add(r4);	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r12 = r2;
        r2 = r0;
        r0 = r12;
        goto L_0x002e;
    L_0x00de:
        r0 = r3 & 64;
        r4 = 64;
        if (r0 == r4) goto L_0x02ed;
    L_0x00e4:
        r0 = new java.util.ArrayList;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0.<init>();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.f1359l = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r3 | 64;
    L_0x00ed:
        r3 = r13.f1359l;	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r4 = com.google.analytics.p012a.p013a.C0278u.f1388a;	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r4 = r14.m4723a(r4, r15);	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r3.add(r4);	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r12 = r2;
        r2 = r0;
        r0 = r12;
        goto L_0x002e;
    L_0x00fd:
        r0 = r14.m4743l();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r4 = r13.f1352e;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r4 = r4 | 1;
        r13.f1352e = r4;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.f1360m = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r2;
        r2 = r3;
        goto L_0x002e;
    L_0x010d:
        r0 = r14.m4743l();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r4 = r13.f1352e;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r4 = r4 | 2;
        r13.f1352e = r4;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.f1361n = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r2;
        r2 = r3;
        goto L_0x002e;
    L_0x011d:
        r0 = r14.m4743l();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r4 = r13.f1352e;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r4 = r4 | 4;
        r13.f1352e = r4;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.f1362o = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r2;
        r2 = r3;
        goto L_0x002e;
    L_0x012d:
        r0 = r14.m4743l();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r4 = r13.f1352e;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r4 = r4 | 8;
        r13.f1352e = r4;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.f1363p = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r2;
        r2 = r3;
        goto L_0x002e;
    L_0x013d:
        r0 = 0;
        r4 = r13.f1352e;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r4 = r4 & 16;
        if (r4 != r8) goto L_0x02ea;
    L_0x0144:
        r0 = r13.f1364q;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r0.m1894m();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r4 = r0;
    L_0x014b:
        r0 = com.google.analytics.p012a.p013a.C0257c.f1296a;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r14.m4723a(r0, r15);	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = (com.google.analytics.p012a.p013a.C0257c) r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.f1364q = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        if (r4 == 0) goto L_0x0162;
    L_0x0157:
        r0 = r13.f1364q;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r4.m1925a(r0);	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r4.m1934d();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.f1364q = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
    L_0x0162:
        r0 = r13.f1352e;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r0 | 16;
        r13.f1352e = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r2;
        r2 = r3;
        goto L_0x002e;
    L_0x016c:
        r0 = r13.f1352e;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r0 | 32;
        r13.f1352e = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r14.m4730c();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.f1365r = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r2;
        r2 = r3;
        goto L_0x002e;
    L_0x017c:
        r4 = r14.m4743l();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r3 & 16384;
        r7 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
        if (r0 == r7) goto L_0x02e7;
    L_0x0186:
        r0 = new com.google.tagmanager.a.ah;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0.<init>();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.f1367t = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r3 | 16384;
    L_0x018f:
        r3 = r13.f1367t;	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r3.m4571a(r4);	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r12 = r2;
        r2 = r0;
        r0 = r12;
        goto L_0x002e;
    L_0x0199:
        r0 = r13.f1352e;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r0 | 128;
        r13.f1352e = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r14.m4736f();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.f1368u = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r2;
        r2 = r3;
        goto L_0x002e;
    L_0x01a9:
        r0 = r13.f1352e;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r0 | 64;
        r13.f1352e = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r14.m4740i();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.f1366s = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
    L_0x01b5:
        r0 = r2;
        r2 = r3;
        goto L_0x002e;
    L_0x01b9:
        r0 = r3 & 1;
        if (r0 != r1) goto L_0x01c6;
    L_0x01bd:
        r0 = new com.google.tagmanager.a.bg;
        r1 = r13.f1353f;
        r0.<init>(r1);
        r13.f1353f = r0;
    L_0x01c6:
        r0 = r3 & 2;
        if (r0 != r9) goto L_0x01d2;
    L_0x01ca:
        r0 = r13.f1354g;
        r0 = java.util.Collections.unmodifiableList(r0);
        r13.f1354g = r0;
    L_0x01d2:
        r0 = r3 & 4;
        if (r0 != r10) goto L_0x01de;
    L_0x01d6:
        r0 = r13.f1355h;
        r0 = java.util.Collections.unmodifiableList(r0);
        r13.f1355h = r0;
    L_0x01de:
        r0 = r3 & 8;
        if (r0 != r11) goto L_0x01ea;
    L_0x01e2:
        r0 = r13.f1356i;
        r0 = java.util.Collections.unmodifiableList(r0);
        r13.f1356i = r0;
    L_0x01ea:
        r0 = r3 & 16;
        if (r0 != r8) goto L_0x01f6;
    L_0x01ee:
        r0 = r13.f1357j;
        r0 = java.util.Collections.unmodifiableList(r0);
        r13.f1357j = r0;
    L_0x01f6:
        r0 = r3 & 32;
        r1 = 32;
        if (r0 != r1) goto L_0x0204;
    L_0x01fc:
        r0 = r13.f1358k;
        r0 = java.util.Collections.unmodifiableList(r0);
        r13.f1358k = r0;
    L_0x0204:
        r0 = r3 & 64;
        r1 = 64;
        if (r0 != r1) goto L_0x0212;
    L_0x020a:
        r0 = r13.f1359l;
        r0 = java.util.Collections.unmodifiableList(r0);
        r13.f1359l = r0;
    L_0x0212:
        r0 = r3 & 16384;
        r1 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
        if (r0 != r1) goto L_0x0221;
    L_0x0218:
        r0 = new com.google.tagmanager.a.bg;
        r1 = r13.f1367t;
        r0.<init>(r1);
        r13.f1367t = r0;
    L_0x0221:
        r6.m4761a();	 Catch:{ IOException -> 0x022e, all -> 0x0236 }
        r0 = r5.m4714a();
        r13.f1351d = r0;
    L_0x022a:
        r13.m1872R();
        return;
    L_0x022e:
        r0 = move-exception;
        r0 = r5.m4714a();
        r13.f1351d = r0;
        goto L_0x022a;
    L_0x0236:
        r0 = move-exception;
        r1 = r5.m4714a();
        r13.f1351d = r1;
        throw r0;
    L_0x023e:
        r0 = move-exception;
    L_0x023f:
        r0 = r0.m4566a(r13);	 Catch:{ all -> 0x0244 }
        throw r0;	 Catch:{ all -> 0x0244 }
    L_0x0244:
        r0 = move-exception;
    L_0x0245:
        r2 = r3 & 1;
        if (r2 != r1) goto L_0x0252;
    L_0x0249:
        r1 = new com.google.tagmanager.a.bg;
        r2 = r13.f1353f;
        r1.<init>(r2);
        r13.f1353f = r1;
    L_0x0252:
        r1 = r3 & 2;
        if (r1 != r9) goto L_0x025e;
    L_0x0256:
        r1 = r13.f1354g;
        r1 = java.util.Collections.unmodifiableList(r1);
        r13.f1354g = r1;
    L_0x025e:
        r1 = r3 & 4;
        if (r1 != r10) goto L_0x026a;
    L_0x0262:
        r1 = r13.f1355h;
        r1 = java.util.Collections.unmodifiableList(r1);
        r13.f1355h = r1;
    L_0x026a:
        r1 = r3 & 8;
        if (r1 != r11) goto L_0x0276;
    L_0x026e:
        r1 = r13.f1356i;
        r1 = java.util.Collections.unmodifiableList(r1);
        r13.f1356i = r1;
    L_0x0276:
        r1 = r3 & 16;
        if (r1 != r8) goto L_0x0282;
    L_0x027a:
        r1 = r13.f1357j;
        r1 = java.util.Collections.unmodifiableList(r1);
        r13.f1357j = r1;
    L_0x0282:
        r1 = r3 & 32;
        r2 = 32;
        if (r1 != r2) goto L_0x0290;
    L_0x0288:
        r1 = r13.f1358k;
        r1 = java.util.Collections.unmodifiableList(r1);
        r13.f1358k = r1;
    L_0x0290:
        r1 = r3 & 64;
        r2 = 64;
        if (r1 != r2) goto L_0x029e;
    L_0x0296:
        r1 = r13.f1359l;
        r1 = java.util.Collections.unmodifiableList(r1);
        r13.f1359l = r1;
    L_0x029e:
        r1 = r3 & 16384;
        r2 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
        if (r1 != r2) goto L_0x02ad;
    L_0x02a4:
        r1 = new com.google.tagmanager.a.bg;
        r2 = r13.f1367t;
        r1.<init>(r2);
        r13.f1367t = r1;
    L_0x02ad:
        r6.m4761a();	 Catch:{ IOException -> 0x02c9, all -> 0x02d1 }
        r1 = r5.m4714a();
        r13.f1351d = r1;
    L_0x02b6:
        r13.m1872R();
        throw r0;
    L_0x02ba:
        r0 = move-exception;
    L_0x02bb:
        r2 = new com.google.tagmanager.a.af;	 Catch:{ all -> 0x0244 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0244 }
        r2.<init>(r0);	 Catch:{ all -> 0x0244 }
        r0 = r2.m4566a(r13);	 Catch:{ all -> 0x0244 }
        throw r0;	 Catch:{ all -> 0x0244 }
    L_0x02c9:
        r1 = move-exception;
        r1 = r5.m4714a();
        r13.f1351d = r1;
        goto L_0x02b6;
    L_0x02d1:
        r0 = move-exception;
        r1 = r5.m4714a();
        r13.f1351d = r1;
        throw r0;
    L_0x02d9:
        r2 = move-exception;
        r3 = r0;
        r0 = r2;
        goto L_0x0245;
    L_0x02de:
        r2 = move-exception;
        r3 = r0;
        r0 = r2;
        goto L_0x02bb;
    L_0x02e2:
        r2 = move-exception;
        r3 = r0;
        r0 = r2;
        goto L_0x023f;
    L_0x02e7:
        r0 = r3;
        goto L_0x018f;
    L_0x02ea:
        r4 = r0;
        goto L_0x014b;
    L_0x02ed:
        r0 = r3;
        goto L_0x00ed;
    L_0x02f0:
        r0 = r3;
        goto L_0x00ce;
    L_0x02f3:
        r0 = r3;
        goto L_0x00af;
    L_0x02f6:
        r0 = r3;
        goto L_0x0093;
    L_0x02f9:
        r0 = r3;
        goto L_0x0077;
    L_0x02fc:
        r0 = r3;
        goto L_0x005b;
    L_0x02ff:
        r0 = r3;
        goto L_0x0045;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.analytics.a.a.q.<init>(com.google.tagmanager.a.k, com.google.tagmanager.a.o):void");
    }

    private C0274q(C0261v c0261v) {
        super(c0261v);
        this.f1369v = (byte) -1;
        this.f1370w = -1;
        this.f1351d = c0261v.m1919r();
    }

    private C0274q(boolean z) {
        this.f1369v = (byte) -1;
        this.f1370w = -1;
        this.f1351d = C0516h.f2222a;
    }

    public static C0276s m2047N() {
        return C0276s.m2131s();
    }

    private void m2048S() {
        this.f1353f = ah.f2220a;
        this.f1354g = Collections.emptyList();
        this.f1355h = Collections.emptyList();
        this.f1356i = Collections.emptyList();
        this.f1357j = Collections.emptyList();
        this.f1358k = Collections.emptyList();
        this.f1359l = Collections.emptyList();
        this.f1360m = "";
        this.f1361n = "";
        this.f1362o = "0";
        this.f1363p = "";
        this.f1364q = C0257c.m1876a();
        this.f1365r = 0.0f;
        this.f1366s = false;
        this.f1367t = ah.f2220a;
        this.f1368u = 0;
    }

    public static C0274q m2052a() {
        return f1349c;
    }

    public static C0276s m2053a(C0274q c0274q) {
        return C0274q.m2047N().m2142a(c0274q);
    }

    public String m2081A() {
        Object obj = this.f1362o;
        if (obj instanceof String) {
            return (String) obj;
        }
        C0516h c0516h = (C0516h) obj;
        String f = c0516h.m4595f();
        if (c0516h.m4596g()) {
            this.f1362o = f;
        }
        return f;
    }

    public boolean m2082B() {
        return (this.f1352e & 8) == 8;
    }

    public String m2083C() {
        Object obj = this.f1363p;
        if (obj instanceof String) {
            return (String) obj;
        }
        C0516h c0516h = (C0516h) obj;
        String f = c0516h.m4595f();
        if (c0516h.m4596g()) {
            this.f1363p = f;
        }
        return f;
    }

    public boolean m2084D() {
        return (this.f1352e & 16) == 16;
    }

    public C0257c m2085E() {
        return this.f1364q;
    }

    public boolean m2086F() {
        return (this.f1352e & 32) == 32;
    }

    public float m2087G() {
        return this.f1365r;
    }

    public boolean m2088H() {
        return (this.f1352e & 64) == 64;
    }

    public boolean m2089I() {
        return this.f1366s;
    }

    public List m2090J() {
        return this.f1367t;
    }

    public int m2091K() {
        return this.f1367t.size();
    }

    public boolean m2092L() {
        return (this.f1352e & 128) == 128;
    }

    public int m2093M() {
        return this.f1368u;
    }

    public C0276s m2094O() {
        return C0274q.m2047N();
    }

    public C0276s m2095P() {
        return C0274q.m2053a(this);
    }

    public C0286c m2096a(int i) {
        return (C0286c) this.f1354g.get(i);
    }

    public C0270m m2097b(int i) {
        return (C0270m) this.f1355h.get(i);
    }

    public C0274q m2098b() {
        return f1349c;
    }

    public C0266i m2099c(int i) {
        return (C0266i) this.f1356i.get(i);
    }

    public aq m2100c() {
        return f1348a;
    }

    public C0266i m2101d(int i) {
        return (C0266i) this.f1357j.get(i);
    }

    public List m2102d() {
        return this.f1353f;
    }

    public int m2103e() {
        return this.f1353f.size();
    }

    public C0266i m2104e(int i) {
        return (C0266i) this.f1358k.get(i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0274q)) {
            return super.equals(obj);
        }
        C0274q c0274q = (C0274q) obj;
        boolean z = (m2102d().equals(c0274q.m2102d())) && m2105f().equals(c0274q.m2105f());
        z = z && m2107h().equals(c0274q.m2107h());
        z = z && m2110k().equals(c0274q.m2110k());
        z = z && m2112m().equals(c0274q.m2112m());
        z = z && m2117r().equals(c0274q.m2117r());
        z = z && m2119t().equals(c0274q.m2119t());
        z = z && m2121v() == c0274q.m2121v();
        if (m2121v()) {
            z = z && m2122w().equals(c0274q.m2122w());
        }
        z = z && m2123x() == c0274q.m2123x();
        if (m2123x()) {
            z = z && m2124y().equals(c0274q.m2124y());
        }
        z = z && m2125z() == c0274q.m2125z();
        if (m2125z()) {
            z = z && m2081A().equals(c0274q.m2081A());
        }
        z = z && m2082B() == c0274q.m2082B();
        if (m2082B()) {
            z = z && m2083C().equals(c0274q.m2083C());
        }
        z = z && m2084D() == c0274q.m2084D();
        if (m2084D()) {
            z = z && m2085E().equals(c0274q.m2085E());
        }
        z = z && m2086F() == c0274q.m2086F();
        if (m2086F()) {
            z = z && Float.floatToIntBits(m2087G()) == Float.floatToIntBits(c0274q.m2087G());
        }
        z = z && m2088H() == c0274q.m2088H();
        if (m2088H()) {
            z = z && m2089I() == c0274q.m2089I();
        }
        z = z && m2090J().equals(c0274q.m2090J());
        z = z && m2092L() == c0274q.m2092L();
        return m2092L() ? z && m2093M() == c0274q.m2093M() : z;
    }

    public List m2105f() {
        return this.f1354g;
    }

    public int m2106g() {
        return this.f1354g.size();
    }

    public List m2107h() {
        return this.f1355h;
    }

    public int hashCode() {
        if (this.b != 0) {
            return this.b;
        }
        int hashCode = C0274q.class.hashCode() + 779;
        if (m2103e() > 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + m2102d().hashCode();
        }
        if (m2106g() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + m2105f().hashCode();
        }
        if (m2108i() > 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + m2107h().hashCode();
        }
        if (m2111l() > 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + m2110k().hashCode();
        }
        if (m2116q() > 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + m2112m().hashCode();
        }
        if (m2118s() > 0) {
            hashCode = (((hashCode * 37) + 6) * 53) + m2117r().hashCode();
        }
        if (m2120u() > 0) {
            hashCode = (((hashCode * 37) + 7) * 53) + m2119t().hashCode();
        }
        if (m2121v()) {
            hashCode = (((hashCode * 37) + 9) * 53) + m2122w().hashCode();
        }
        if (m2123x()) {
            hashCode = (((hashCode * 37) + 10) * 53) + m2124y().hashCode();
        }
        if (m2125z()) {
            hashCode = (((hashCode * 37) + 12) * 53) + m2081A().hashCode();
        }
        if (m2082B()) {
            hashCode = (((hashCode * 37) + 13) * 53) + m2083C().hashCode();
        }
        if (m2084D()) {
            hashCode = (((hashCode * 37) + 14) * 53) + m2085E().hashCode();
        }
        if (m2086F()) {
            hashCode = (((hashCode * 37) + 15) * 53) + Float.floatToIntBits(m2087G());
        }
        if (m2088H()) {
            hashCode = (((hashCode * 37) + 18) * 53) + ac.m4554a(m2089I());
        }
        if (m2091K() > 0) {
            hashCode = (((hashCode * 37) + 16) * 53) + m2090J().hashCode();
        }
        if (m2092L()) {
            hashCode = (((hashCode * 37) + 17) * 53) + m2093M();
        }
        hashCode = (hashCode * 29) + this.f1351d.hashCode();
        this.b = hashCode;
        return hashCode;
    }

    public int m2108i() {
        return this.f1355h.size();
    }

    public final boolean m2109j() {
        boolean z = true;
        byte b = this.f1369v;
        if (b != -1) {
            if (b != (byte) 1) {
                z = false;
            }
            return z;
        }
        int i = 0;
        while (i < m2106g()) {
            if (m2096a(i).m2300j()) {
                i++;
            } else {
                this.f1369v = (byte) 0;
                return false;
            }
        }
        i = 0;
        while (i < m2108i()) {
            if (m2097b(i).m2018j()) {
                i++;
            } else {
                this.f1369v = (byte) 0;
                return false;
            }
        }
        i = 0;
        while (i < m2111l()) {
            if (m2099c(i).m1967j()) {
                i++;
            } else {
                this.f1369v = (byte) 0;
                return false;
            }
        }
        i = 0;
        while (i < m2116q()) {
            if (m2101d(i).m1967j()) {
                i++;
            } else {
                this.f1369v = (byte) 0;
                return false;
            }
        }
        i = 0;
        while (i < m2118s()) {
            if (m2104e(i).m1967j()) {
                i++;
            } else {
                this.f1369v = (byte) 0;
                return false;
            }
        }
        this.f1369v = (byte) 1;
        return true;
    }

    public List m2110k() {
        return this.f1356i;
    }

    public int m2111l() {
        return this.f1356i.size();
    }

    public List m2112m() {
        return this.f1357j;
    }

    public /* synthetic */ an m2113n() {
        return m2095P();
    }

    public /* synthetic */ an m2114o() {
        return m2094O();
    }

    public /* synthetic */ am m2115p() {
        return m2098b();
    }

    public int m2116q() {
        return this.f1357j.size();
    }

    public List m2117r() {
        return this.f1358k;
    }

    public int m2118s() {
        return this.f1358k.size();
    }

    public List m2119t() {
        return this.f1359l;
    }

    public int m2120u() {
        return this.f1359l.size();
    }

    public boolean m2121v() {
        return (this.f1352e & 1) == 1;
    }

    public String m2122w() {
        Object obj = this.f1360m;
        if (obj instanceof String) {
            return (String) obj;
        }
        C0516h c0516h = (C0516h) obj;
        String f = c0516h.m4595f();
        if (c0516h.m4596g()) {
            this.f1360m = f;
        }
        return f;
    }

    public boolean m2123x() {
        return (this.f1352e & 2) == 2;
    }

    public String m2124y() {
        Object obj = this.f1361n;
        if (obj instanceof String) {
            return (String) obj;
        }
        C0516h c0516h = (C0516h) obj;
        String f = c0516h.m4595f();
        if (c0516h.m4596g()) {
            this.f1361n = f;
        }
        return f;
    }

    public boolean m2125z() {
        return (this.f1352e & 4) == 4;
    }
}
