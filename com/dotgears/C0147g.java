package com.dotgears;

import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* renamed from: com.dotgears.g */
public class C0147g extends C0140m {
    public static C0147g f620D;
    public int f621A;
    public C0155l f622B;
    public C0158p f623C;
    public final float f624E;
    public C0152i[] f625a;
    public int[] f626b;
    public int[] f627c;
    public C0140m[] f628d;
    public int f629e;
    public C0159r f630f;
    public int f631g;
    public C0159r f632h;
    public int f633i;
    public int f634j;
    public int f635k;
    public int f636l;
    public C0156n f637m;
    public C0156n f638n;
    protected C0152i f639o;
    protected C0152i f640p;
    public int f641q;
    public boolean f642r;
    protected int[] f643s;
    protected int[] f644t;
    protected int f645u;
    int f646v;
    int[] f647w;
    double[] f648x;
    public int f649y;
    public int f650z;

    public C0147g(int i, int i2, InputStream inputStream) {
        this.f626b = new int[50];
        this.f627c = new int[50];
        this.f628d = new C0140m[50];
        this.f641q = 1;
        this.f643s = new int[10];
        this.f644t = new int[10];
        this.f647w = new int[50];
        this.f648x = new double[50];
        this.f624E = 0.015f;
        this.f650z = i;
        this.f621A = i2;
        this.f625a = new C0152i[512];
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    if (readLine.length() > 1) {
                        String[] split = readLine.split("\\s+");
                        C0152i c0152i = new C0152i(split[0], Integer.parseInt(split[1]), Integer.parseInt(split[2]), Float.parseFloat(split[3]), Float.parseFloat(split[4]), Float.parseFloat(split[5]), Float.parseFloat(split[6]));
                        c0152i.f687f = c0152i.f685d + c0152i.f687f;
                        c0152i.f688g = c0152i.f686e + c0152i.f688g;
                        this.f625a[c0152i.f689i] = c0152i;
                        Log.i("FlappyBird", c0152i.f682a + " " + c0152i.f683b + " " + c0152i.f684c + " " + c0152i.f685d + " " + c0152i.f686e + " " + c0152i.f687f + " " + c0152i.f688g);
                    }
                } else {
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void m1231a() {
        int i;
        C0153j.f715x = new C0153j();
        this.f630f = new C0159r();
        this.f632h = new C0159r();
        this.f639o = m1247b("black");
        this.f640p = m1247b("white");
        this.f645u = 0;
        this.f637m = new C0156n();
        for (i = 0; i < 20; i++) {
            this.f637m.m1324a(new C0157o());
        }
        this.f638n = new C0156n();
        for (i = 0; i < 10; i++) {
            this.f638n.m1324a(new C0142e());
        }
        this.f622B = new C0155l("number_score");
        this.f623C = new C0158p();
        this.f636l = 0;
        this.f642r = false;
        this.f646v = 0;
        m1254d();
        m1251c();
        m1244a(false, 0, 0.5f);
    }

    public void m1232a(int i) {
        m1253c(0, i);
        if (i > this.f650z) {
            this.f650z = i;
        }
    }

    public void m1233a(int i, float f) {
    }

    public void m1234a(int i, int i2) {
    }

    public void m1235a(int i, int i2, int i3, float f, float f2, float f3) {
        C0152i c0152i = this.f625a[i];
        m1237a(i2, i3, (int) (((float) i2) + (((float) c0152i.f683b) * f)), (int) (((float) i3) + (((float) c0152i.f684c) * f2)), c0152i.f685d, c0152i.f686e, c0152i.f687f, c0152i.f688g, f3);
    }

    public void m1236a(int i, int i2, int i3, int i4) {
    }

    public void m1237a(int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, float f5) {
        C0138c.m1201a(i, i2, i3, i4, f, f2, f3, f4, f5);
    }

    public void m1238a(int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, float f5, int i5) {
        C0138c.m1202a(i, i2, i3, i4, f, f2, f3, f4, f5, (float) i5);
    }

    public void m1239a(int i, int i2, int i3, int i4, int i5, float f) {
        C0152i c0152i = this.f625a[i];
        m1237a(i2, i3, i2 + i4, i3 + i5, c0152i.f685d, c0152i.f686e, c0152i.f687f, c0152i.f688g, f);
    }

    public void m1240a(int i, C0140m c0140m) {
    }

    public void m1241a(int i, C0140m c0140m, int i2) {
        this.f627c[this.f629e] = i;
        this.f628d[this.f629e] = c0140m;
        this.f626b[this.f629e] = i2;
        this.f629e++;
        if (this.f629e >= 50) {
            this.f629e = 0;
        }
    }

    public void m1242a(C0152i c0152i, int i, int i2, float f) {
        m1237a(i, i2, i + c0152i.f683b, i2 + c0152i.f684c, c0152i.f685d, c0152i.f686e, c0152i.f687f, c0152i.f688g, f);
    }

    public void m1243a(C0152i c0152i, int i, int i2, float f, int i3) {
        m1238a(i, i2, i + c0152i.f683b, i2 + c0152i.f684c, c0152i.f685d, c0152i.f686e, c0152i.f687f, c0152i.f688g, f, i3);
    }

    public void m1244a(boolean z, int i, float f) {
        if (this.f630f.f769g) {
            if (z) {
                this.f630f.m1334a(0.0f, 1.0f, 5, f);
            } else {
                this.f630f.m1334a(1.0f, 0.0f, 5, f);
            }
            this.f630f.m1333a(0.0f);
            this.f631g = i;
        }
    }

    public void m1245a(float[] fArr, float[] fArr2) {
        for (int i = 0; i < 10; i++) {
            this.f643s[i] = (int) fArr[i];
            this.f644t[i] = (int) fArr2[i];
        }
        this.f645u = 10;
    }

    public C0152i[] m1246a(String str) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < 512) {
            if (this.f625a[i2] != null && this.f625a[i2].f682a.startsWith(str)) {
                i3++;
            }
            i2++;
        }
        if (i3 <= 0) {
            return null;
        }
        C0152i[] c0152iArr = new C0152i[i3];
        i3 = 0;
        while (i < 512) {
            if (this.f625a[i] != null && this.f625a[i].f682a.startsWith(str)) {
                c0152iArr[i3] = this.f625a[i];
                i3++;
            }
            i++;
        }
        return c0152iArr;
    }

    public C0152i m1247b(String str) {
        int i = 0;
        while (i < 512) {
            if (this.f625a[i] != null && this.f625a[i].f682a.startsWith(str)) {
                return this.f625a[i];
            }
            i++;
        }
        return null;
    }

    public void m1248b() {
        this.f646v = 0;
        if (!this.f642r) {
            for (int i = 0; i < 50; i++) {
                if (this.f626b[i] > 0) {
                    int[] iArr = this.f626b;
                    iArr[i] = iArr[i] - 30;
                    if (this.f626b[i] <= 0) {
                        m1240a(this.f627c[i], this.f628d[i]);
                    }
                }
            }
        }
        m1249b(0.015f);
        if (!this.f642r) {
            this.f623C.m1330a(0.015f);
            this.f638n.m1322a(0.015f);
            if (!(this.f630f.f769g && this.f630f.f763a == 0.0f)) {
                this.f630f.m1333a(0.015f);
                if (this.f630f.f769g) {
                    m1240a(this.f631g, (C0140m) this);
                }
            }
            if (!(this.f632h.f769g && this.f632h.f763a == 0.0f)) {
                this.f632h.m1333a(0.015f);
            }
            if (this.f636l > 0) {
                this.f636l--;
                this.f633i = C0153j.m1270a(-this.f635k, this.f635k);
                this.f634j = C0153j.m1270a(-this.f635k, this.f635k);
            } else {
                this.f633i = 0;
                this.f634j = 0;
            }
        }
        this.f623C.m1332a(this);
        this.f638n.m1323a(this);
        if (!(this.f630f.f769g && this.f630f.f763a == 0.0f)) {
            m1239a(this.f639o.f689i, -144, -256, 864, 1536, this.f630f.f763a);
        }
        if (!this.f632h.f769g || this.f632h.f763a != 0.0f) {
            m1239a(this.f640p.f689i, -144, -256, 864, 1536, this.f632h.f763a);
        }
    }

    public void m1249b(float f) {
    }

    public void m1250b(int i, int i2) {
        ((C0142e) this.f638n.m1326c()).m1218a(i, i2);
    }

    public void m1251c() {
    }

    public void m1252c(float f) {
        if (this.f632h.f769g) {
            this.f632h.m1334a(1.0f, 0.0f, 11, f);
            this.f632h.m1333a(0.0f);
        }
    }

    public void m1253c(int i, int i2) {
        this.f647w[this.f646v] = i;
        this.f648x[this.f646v] = (double) i2;
        this.f646v++;
    }

    public void m1254d() {
        this.f629e = 0;
        for (int i = 0; i < 50; i++) {
            this.f626b[i] = 0;
        }
    }
}
