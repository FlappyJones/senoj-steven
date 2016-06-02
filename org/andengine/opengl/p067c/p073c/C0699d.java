package org.andengine.opengl.p067c.p073c;

import org.andengine.opengl.p067c.p068a.C0689a;
import org.andengine.opengl.p067c.p068a.p069b.C0683b;

/* renamed from: org.andengine.opengl.c.c.d */
public class C0699d {
    public static C0698c m5360a(C0689a c0689a, C0683b c0683b, int i, int i2) {
        return C0699d.m5361a(c0689a, c0683b, i, i2, false);
    }

    public static C0698c m5361a(C0689a c0689a, C0683b c0683b, int i, int i2, boolean z) {
        C0698c c0698c = new C0698c(c0689a, (float) i, (float) i2, (float) c0683b.m5283c(), (float) c0683b.m5284d(), z);
        c0689a.m5318a(c0683b, i, i2);
        return c0698c;
    }
}
