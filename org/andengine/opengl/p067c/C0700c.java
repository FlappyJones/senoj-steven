package org.andengine.opengl.p067c;

/* renamed from: org.andengine.opengl.c.c */
public enum C0700c {
    UNDEFINED(-1, -1, -1, -1),
    RGBA_4444(6408, 6408, 32819, 16),
    RGBA_5551(6407, 6408, 32820, 16),
    RGBA_8888(6408, 6408, 5121, 32),
    RGB_565(6407, 6407, 33635, 16),
    A_8(6406, 6406, 5121, 8),
    I_8(6409, 6409, 5121, 8),
    AI_88(6410, 6410, 5121, 16);
    
    private final int f2773i;
    private final int f2774j;
    private final int f2775k;
    private final int f2776l;

    private C0700c(int i, int i2, int i3, int i4) {
        this.f2773i = i;
        this.f2774j = i2;
        this.f2775k = i3;
        this.f2776l = i4;
    }

    public int m5362a() {
        return this.f2773i;
    }

    public int m5363b() {
        return this.f2774j;
    }

    public int m5364c() {
        return this.f2775k;
    }
}
