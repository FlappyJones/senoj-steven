package android.support.v4.p001b;

import android.util.Log;
import java.io.Writer;

/* renamed from: android.support.v4.b.e */
public class C0038e extends Writer {
    private final String f199a;
    private StringBuilder f200b;

    public C0038e(String str) {
        this.f200b = new StringBuilder(128);
        this.f199a = str;
    }

    private void m239a() {
        if (this.f200b.length() > 0) {
            Log.d(this.f199a, this.f200b.toString());
            this.f200b.delete(0, this.f200b.length());
        }
    }

    public void close() {
        m239a();
    }

    public void flush() {
        m239a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m239a();
            } else {
                this.f200b.append(c);
            }
        }
    }
}
