package org.andengine.opengl;

import org.andengine.p005d.p026f.C0558a;
import org.andengine.p005d.p059i.C0643a;

public class GLES20Fix {
    private static boolean f2666a;
    private static final boolean f2667b;

    static {
        boolean z;
        try {
            System.loadLibrary("andengine");
            z = true;
        } catch (UnsatisfiedLinkError e) {
            z = false;
        }
        f2666a = z;
        if (!C0643a.m5171a(8)) {
            f2667b = false;
        } else if (z) {
            f2667b = true;
        } else {
            throw new C0558a("Inherently incompatible device detected.");
        }
    }

    public static native void glVertexAttribPointer(int i, int i2, int i3, boolean z, int i4, int i5);
}
