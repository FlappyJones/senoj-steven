package org.andengine.opengl.p067c.p072b;

import android.graphics.Bitmap.Config;
import org.andengine.opengl.p067c.C0700c;

/* renamed from: org.andengine.opengl.c.b.a */
public enum C0695a {
    RGBA_8888(Config.ARGB_8888, C0700c.RGBA_8888),
    RGB_565(Config.RGB_565, C0700c.RGB_565),
    RGBA_4444(Config.ARGB_4444, C0700c.RGBA_4444),
    A_8(Config.ALPHA_8, C0700c.A_8);
    
    private final Config f2751e;
    private final C0700c f2752f;

    private C0695a(Config config, C0700c c0700c) {
        this.f2751e = config;
        this.f2752f = c0700c;
    }

    public Config m5336a() {
        return this.f2751e;
    }

    public C0700c m5337b() {
        return this.f2752f;
    }
}
