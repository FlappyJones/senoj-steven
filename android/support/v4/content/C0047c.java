package android.support.v4.content;

import android.support.v4.p001b.C0037d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.content.c */
public class C0047c {
    int f226a;
    C0006d f227b;
    boolean f228c;
    boolean f229d;
    boolean f230e;
    boolean f231f;
    boolean f232g;

    public String m257a(Object obj) {
        StringBuilder stringBuilder = new StringBuilder(64);
        C0037d.m238a(obj, stringBuilder);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void m258a() {
        this.f228c = true;
        this.f230e = false;
        this.f229d = false;
        m262b();
    }

    public void m259a(int i, C0006d c0006d) {
        if (this.f227b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f227b = c0006d;
        this.f226a = i;
    }

    public void m260a(C0006d c0006d) {
        if (this.f227b == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.f227b != c0006d) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else {
            this.f227b = null;
        }
    }

    public void m261a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f226a);
        printWriter.print(" mListener=");
        printWriter.println(this.f227b);
        if (this.f228c || this.f231f || this.f232g) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f228c);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f231f);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f232g);
        }
        if (this.f229d || this.f230e) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f229d);
            printWriter.print(" mReset=");
            printWriter.println(this.f230e);
        }
    }

    protected void m262b() {
    }

    public void m263c() {
        this.f228c = false;
        m264d();
    }

    protected void m264d() {
    }

    public void m265e() {
        m266f();
        this.f230e = true;
        this.f228c = false;
        this.f229d = false;
        this.f231f = false;
        this.f232g = false;
    }

    protected void m266f() {
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        C0037d.m238a(this, stringBuilder);
        stringBuilder.append(" id=");
        stringBuilder.append(this.f226a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
