package org.andengine.p005d.p057e;

/* renamed from: org.andengine.d.e.b */
public enum C0638b {
    NONE,
    ERROR,
    WARNING,
    INFO,
    DEBUG,
    VERBOSE;
    
    public static C0638b f2625g;

    static {
        f2625g = VERBOSE;
    }

    public boolean m5161a(C0638b c0638b) {
        return compareTo(c0638b) >= 0;
    }
}
