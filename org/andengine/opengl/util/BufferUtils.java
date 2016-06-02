package org.andengine.opengl.util;

import java.nio.ByteBuffer;
import org.andengine.p005d.p057e.C0637a;
import org.andengine.p005d.p059i.C0643a;

public class BufferUtils {
    private static final boolean f2818a;
    private static final boolean f2819b;
    private static final boolean f2820c;

    static {
        boolean z;
        try {
            System.loadLibrary("andengine");
            z = true;
        } catch (UnsatisfiedLinkError e) {
            z = false;
        }
        f2818a = z;
        if (f2818a) {
            if (C0643a.m5172a(11, 13)) {
                f2820c = true;
            } else {
                f2820c = false;
            }
            if (C0643a.m5171a(8)) {
                f2819b = true;
                return;
            } else {
                f2819b = false;
                return;
            }
        }
        f2820c = false;
        if (C0643a.m5172a(11, 13)) {
            C0637a.m5157c("Creating a " + ByteBuffer.class.getSimpleName() + " will actually allocate 4x the memory than requested!");
        }
        f2819b = false;
    }

    public static ByteBuffer m5385a(int i) {
        return f2820c ? jniAllocateDirect(i) : ByteBuffer.allocateDirect(i);
    }

    public static void m5386a(ByteBuffer byteBuffer) {
        if (f2820c) {
            jniFreeDirect(byteBuffer);
        }
    }

    public static void m5387a(ByteBuffer byteBuffer, float[] fArr, int i, int i2) {
        if (f2819b) {
            jniPut(byteBuffer, fArr, i, i2);
        } else {
            for (int i3 = i2; i3 < i2 + i; i3++) {
                byteBuffer.putFloat(fArr[i3]);
            }
        }
        byteBuffer.position(0);
        byteBuffer.limit(i << 2);
    }

    private static native ByteBuffer jniAllocateDirect(int i);

    private static native void jniFreeDirect(ByteBuffer byteBuffer);

    private static native void jniPut(ByteBuffer byteBuffer, float[] fArr, int i, int i2);
}
