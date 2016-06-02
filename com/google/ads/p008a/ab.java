package com.google.ads.p008a;

import android.os.SystemClock;
import com.google.ads.bj;
import com.google.ads.util.C0229g;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.google.ads.a.ab */
public class ab {
    private static long f806f;
    private static long f807g;
    private static long f808h;
    private static long f809i;
    private static long f810j;
    private final LinkedList f811a;
    private long f812b;
    private long f813c;
    private long f814d;
    private final LinkedList f815e;
    private boolean f816k;
    private boolean f817l;
    private String f818m;
    private long f819n;
    private final LinkedList f820o;
    private final LinkedList f821p;

    static {
        f806f = 0;
        f807g = 0;
        f808h = 0;
        f809i = 0;
        f810j = -1;
    }

    public ab() {
        this.f816k = false;
        this.f817l = false;
        this.f811a = new LinkedList();
        this.f815e = new LinkedList();
        this.f820o = new LinkedList();
        this.f821p = new LinkedList();
        m1388a();
    }

    public static long m1383E() {
        if (f810j != -1) {
            return SystemClock.elapsedRealtime() - f810j;
        }
        f810j = SystemClock.elapsedRealtime();
        return 0;
    }

    protected boolean m1384A() {
        return this.f817l;
    }

    protected void m1385B() {
        C0229g.m1840d("Interstitial no fill.");
        this.f817l = true;
    }

    public void m1386C() {
        C0229g.m1840d("Landing page dismissed.");
        this.f815e.add(Long.valueOf(SystemClock.elapsedRealtime()));
    }

    protected String m1387D() {
        return this.f818m;
    }

    protected synchronized void m1388a() {
        this.f811a.clear();
        this.f812b = 0;
        this.f813c = 0;
        this.f814d = 0;
        this.f815e.clear();
        this.f819n = -1;
        this.f820o.clear();
        this.f821p.clear();
        this.f816k = false;
        this.f817l = false;
    }

    public synchronized void m1389a(bj bjVar) {
        this.f820o.add(Long.valueOf(SystemClock.elapsedRealtime() - this.f819n));
        this.f821p.add(bjVar);
    }

    public void m1390a(String str) {
        C0229g.m1840d("Prior impression ticket = " + str);
        this.f818m = str;
    }

    public synchronized void m1391b() {
        this.f820o.clear();
        this.f821p.clear();
    }

    public synchronized void m1392c() {
        this.f819n = SystemClock.elapsedRealtime();
    }

    public synchronized String m1393d() {
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder();
        Iterator it = this.f820o.iterator();
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            if (stringBuilder.length() > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(longValue);
        }
        return stringBuilder.toString();
    }

    public synchronized String m1394e() {
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder();
        Iterator it = this.f821p.iterator();
        while (it.hasNext()) {
            bj bjVar = (bj) it.next();
            if (stringBuilder.length() > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(bjVar.ordinal());
        }
        return stringBuilder.toString();
    }

    protected void m1395f() {
        C0229g.m1840d("Ad clicked.");
        this.f811a.add(Long.valueOf(SystemClock.elapsedRealtime()));
    }

    protected void m1396g() {
        C0229g.m1840d("Ad request loaded.");
        this.f812b = SystemClock.elapsedRealtime();
    }

    protected synchronized void m1397h() {
        C0229g.m1840d("Ad request before rendering.");
        this.f813c = SystemClock.elapsedRealtime();
    }

    protected void m1398i() {
        C0229g.m1840d("Ad request started.");
        this.f814d = SystemClock.elapsedRealtime();
        f806f++;
    }

    protected long m1399j() {
        return this.f811a.size() != this.f815e.size() ? -1 : (long) this.f811a.size();
    }

    protected String m1400k() {
        if (this.f811a.isEmpty() || this.f811a.size() != this.f815e.size()) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.f811a.size(); i++) {
            if (i != 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(Long.toString(((Long) this.f815e.get(i)).longValue() - ((Long) this.f811a.get(i)).longValue()));
        }
        return stringBuilder.toString();
    }

    protected String m1401l() {
        if (this.f811a.isEmpty()) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.f811a.size(); i++) {
            if (i != 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(Long.toString(((Long) this.f811a.get(i)).longValue() - this.f812b));
        }
        return stringBuilder.toString();
    }

    protected long m1402m() {
        return this.f812b - this.f814d;
    }

    protected synchronized long m1403n() {
        return this.f813c - this.f814d;
    }

    protected long m1404o() {
        return f806f;
    }

    protected synchronized long m1405p() {
        return f807g;
    }

    protected synchronized void m1406q() {
        C0229g.m1840d("Ad request network error");
        f807g++;
    }

    protected synchronized void m1407r() {
        f807g = 0;
    }

    protected synchronized long m1408s() {
        return f808h;
    }

    protected synchronized void m1409t() {
        f808h++;
    }

    protected synchronized void m1410u() {
        f808h = 0;
    }

    protected synchronized long m1411v() {
        return f809i;
    }

    protected synchronized void m1412w() {
        f809i++;
    }

    protected synchronized void m1413x() {
        f809i = 0;
    }

    protected boolean m1414y() {
        return this.f816k;
    }

    protected void m1415z() {
        C0229g.m1840d("Interstitial network error.");
        this.f816k = true;
    }
}
