package com.google.tagmanager;

/* renamed from: com.google.tagmanager.x */
class C0556x extends Number implements Comparable {
    private double f2403a;
    private long f2404b;
    private boolean f2405c;

    private C0556x(long j) {
        this.f2404b = j;
        this.f2405c = true;
    }

    public static C0556x m4844a(long j) {
        return new C0556x(j);
    }

    public int m4845a(C0556x c0556x) {
        return (m4847b() && c0556x.m4847b()) ? new Long(this.f2404b).compareTo(Long.valueOf(c0556x.f2404b)) : Double.compare(doubleValue(), c0556x.doubleValue());
    }

    public boolean m4846a() {
        return !m4847b();
    }

    public boolean m4847b() {
        return this.f2405c;
    }

    public byte byteValue() {
        return (byte) ((int) longValue());
    }

    public long m4848c() {
        return m4847b() ? this.f2404b : (long) this.f2403a;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return m4845a((C0556x) obj);
    }

    public int m4849d() {
        return (int) longValue();
    }

    public double doubleValue() {
        return m4847b() ? (double) this.f2404b : this.f2403a;
    }

    public short m4850e() {
        return (short) ((int) longValue());
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0556x) && m4845a((C0556x) obj) == 0;
    }

    public float floatValue() {
        return (float) doubleValue();
    }

    public int hashCode() {
        return new Long(longValue()).hashCode();
    }

    public int intValue() {
        return m4849d();
    }

    public long longValue() {
        return m4848c();
    }

    public short shortValue() {
        return m4850e();
    }

    public String toString() {
        return m4847b() ? Long.toString(this.f2404b) : Double.toString(this.f2403a);
    }
}
