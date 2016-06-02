package org.andengine.p005d;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: org.andengine.d.d */
public final class C0636d {
    public static final void m5149a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
