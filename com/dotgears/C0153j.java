package com.dotgears;

import android.util.Log;

/* renamed from: com.dotgears.j */
public class C0153j {
    public static float f690A;
    public static float f691B;
    public static float[] f692a;
    public static float[] f693b;
    public static float[] f694c;
    public static float[] f695d;
    public static float[] f696e;
    public static float[] f697f;
    public static float[] f698g;
    public static float[] f699h;
    public static float[] f700i;
    public static float[] f701j;
    public static float[] f702k;
    public static float[] f703l;
    public static float[] f704m;
    public static float[] f705n;
    public static float[] f706o;
    public static float[] f707p;
    public static float[] f708q;
    public static float[] f709r;
    public static float[] f710s;
    public static float[] f711t;
    public static float[] f712u;
    public static float[] f713v;
    public static float[] f714w;
    public static C0153j f715x;
    public static int f716y;
    public static int f717z;

    C0153j() {
        int i = 0;
        f692a = new float[360];
        f693b = new float[360];
        for (int i2 = 0; i2 < 360; i2++) {
            float f = (((float) i2) * 3.1415925f) / 180.0f;
            f692a[i2] = (float) Math.sin((double) f);
            f693b[i2] = (float) Math.cos((double) f);
        }
        f694c = new float[101];
        f695d = new float[101];
        f696e = new float[101];
        f697f = new float[101];
        f698g = new float[101];
        f699h = new float[101];
        f700i = new float[101];
        f701j = new float[101];
        f702k = new float[101];
        f703l = new float[101];
        f704m = new float[101];
        f705n = new float[101];
        f706o = new float[101];
        f707p = new float[101];
        f708q = new float[101];
        f709r = new float[101];
        f710s = new float[101];
        f711t = new float[101];
        f712u = new float[101];
        f713v = new float[101];
        f714w = new float[101];
        while (i <= 100) {
            double d = ((double) i) / 100.0d;
            f694c[i] = (float) m1306a(d);
            f695d[i] = (float) m1307b(d);
            f696e[i] = (float) C0153j.m1275c(d);
            f697f[i] = (float) C0153j.m1278d(d);
            f698g[i] = (float) C0153j.m1280e(d);
            f699h[i] = (float) C0153j.m1282f(d);
            f700i[i] = (float) C0153j.m1284g(d);
            f701j[i] = (float) C0153j.m1286h(d);
            f702k[i] = (float) C0153j.m1288i(d);
            f703l[i] = (float) C0153j.m1290j(d);
            f704m[i] = (float) C0153j.m1292k(d);
            f705n[i] = (float) C0153j.m1294l(d);
            f706o[i] = (float) m1308m(d);
            f707p[i] = (float) m1309n(d);
            f708q[i] = (float) m1310o(d);
            f709r[i] = (float) m1311p(d);
            f710s[i] = (float) m1312q(d);
            f711t[i] = (float) m1313r(d);
            f712u[i] = (float) m1314s(d);
            f713v[i] = (float) m1315t(d);
            f714w[i] = (float) m1316u(d);
            i++;
        }
    }

    public static float m1268a(float f) {
        float f2 = f;
        while (f2 > 360.0f) {
            f2 -= 360.0f;
        }
        while (f2 < 0.0f) {
            f2 += 360.0f;
        }
        return f2;
    }

    public static int m1269a() {
        f717z = (36969 * (f717z & 65535)) + (f717z >> 16);
        f716y = ((f716y & 65535) * 18000) + (f716y >> 16);
        return Math.abs((f717z << 16) + f716y);
    }

    public static int m1270a(int i, int i2) {
        return (C0153j.m1269a() % (i2 - i)) + i;
    }

    public static void m1271a(float f, float f2, float f3, float f4, float f5) {
        float f6 = f - f3;
        float f7 = f2 - f4;
        float a = C0153j.m1268a(f5);
        f690A = ((C0153j.m1276c(a) * f6) - (C0153j.m1273b(a) * f7)) + f3;
        f691B = ((f6 * C0153j.m1273b(a)) + (f7 * C0153j.m1276c(a))) + f4;
    }

    public static void m1272a(int i) {
        Log.i("FlappyBird", "Engine: Randomize " + i);
        f716y = i % 32000;
        f717z = i % 65535;
    }

    public static float m1273b(float f) {
        return f692a[(int) f];
    }

    public static float m1274b(int i) {
        return f700i[i];
    }

    static double m1275c(double d) {
        return d < 0.5d ? (2.0d * d) * d : (((-2.0d * d) * d) + (4.0d * d)) - 1.0d;
    }

    public static float m1276c(float f) {
        return f693b[(int) f];
    }

    public static float m1277c(int i) {
        return f695d[i];
    }

    static double m1278d(double d) {
        return (d * d) * d;
    }

    public static float m1279d(int i) {
        return f696e[i];
    }

    static double m1280e(double d) {
        double d2 = d - 1.0d;
        return (d2 * (d2 * d2)) + 1.0d;
    }

    public static float m1281e(int i) {
        return f697f[i];
    }

    static double m1282f(double d) {
        if (d < 0.5d) {
            return ((4.0d * d) * d) * d;
        }
        double d2 = (2.0d * d) - 2.0d;
        return (d2 * ((0.5d * d2) * d2)) + 1.0d;
    }

    public static float m1283f(int i) {
        return f698g[i];
    }

    static double m1284g(double d) {
        return ((d * d) * d) * d;
    }

    public static float m1285g(int i) {
        return f699h[i];
    }

    static double m1286h(double d) {
        double d2 = d - 1.0d;
        return ((d2 * (d2 * d2)) * (1.0d - d)) + 1.0d;
    }

    public static float m1287h(int i) {
        return f700i[i];
    }

    static double m1288i(double d) {
        if (d < 0.5d) {
            return (((8.0d * d) * d) * d) * d;
        }
        double d2 = d - 1.0d;
        return (d2 * (((-8.0d * d2) * d2) * d2)) + 1.0d;
    }

    public static float m1289i(int i) {
        return f701j[i];
    }

    static double m1290j(double d) {
        return (((d * d) * d) * d) * d;
    }

    public static float m1291j(int i) {
        return f702k[i];
    }

    static double m1292k(double d) {
        double d2 = d - 1.0d;
        return (d2 * (((d2 * d2) * d2) * d2)) + 1.0d;
    }

    public static float m1293k(int i) {
        return f703l[i];
    }

    static double m1294l(double d) {
        if (d < 0.5d) {
            return ((((16.0d * d) * d) * d) * d) * d;
        }
        double d2 = (2.0d * d) - 2.0d;
        return (d2 * ((((0.5d * d2) * d2) * d2) * d2)) + 1.0d;
    }

    public static float m1295l(int i) {
        return f704m[i];
    }

    public static float m1296m(int i) {
        return f705n[i];
    }

    public static float m1297n(int i) {
        return f706o[i];
    }

    public static float m1298o(int i) {
        return f707p[i];
    }

    public static float m1299p(int i) {
        return f708q[i];
    }

    public static float m1300q(int i) {
        return f706o[i];
    }

    public static float m1301r(int i) {
        return f707p[i];
    }

    public static float m1302s(int i) {
        return f708q[i];
    }

    public static float m1303t(int i) {
        return f712u[i];
    }

    public static float m1304u(int i) {
        return f713v[i];
    }

    public static float m1305v(int i) {
        return f714w[i];
    }

    double m1306a(double d) {
        return d * d;
    }

    double m1307b(double d) {
        return -((d - 2.0d) * d);
    }

    double m1308m(double d) {
        return Math.sin(20.420352248333657d * d) * Math.pow(2.0d, 10.0d * (d - 1.0d));
    }

    double m1309n(double d) {
        return (Math.sin(-20.420352248333657d * (d + 1.0d)) * Math.pow(2.0d, -10.0d * d)) + 1.0d;
    }

    double m1310o(double d) {
        return d < 0.5d ? (Math.sin(20.420352248333657d * (2.0d * d)) * 0.5d) * Math.pow(2.0d, 10.0d * ((2.0d * d) - 1.0d)) : ((Math.sin(-20.420352248333657d * (((2.0d * d) - 1.0d) + 1.0d)) * Math.pow(2.0d, -10.0d * ((2.0d * d) - 1.0d))) + 2.0d) * 0.5d;
    }

    double m1311p(double d) {
        return ((d * d) * d) - (Math.sin(3.141592653589793d * d) * d);
    }

    double m1312q(double d) {
        double d2 = 1.0d - d;
        return 1.0d - (((d2 * d2) * d2) - (d2 * Math.sin(3.141592653589793d * d2)));
    }

    double m1313r(double d) {
        if (d < 0.5d) {
            double d2 = 2.0d * d;
            return (((d2 * d2) * d2) - (d2 * Math.sin(3.141592653589793d * d2))) * 0.5d;
        }
        d2 = 1.0d - ((2.0d * d) - 1.0d);
        return ((1.0d - (((d2 * d2) * d2) - (d2 * Math.sin(3.141592653589793d * d2)))) * 0.5d) + 0.5d;
    }

    double m1314s(double d) {
        return 1.0d - m1315t(1.0d - d);
    }

    double m1315t(double d) {
        return d < 0.36363636363636365d ? ((121.0d * d) * d) / 16.0d : d < 0.7272727272727273d ? (((9.075d * d) * d) - (9.9d * d)) + 3.4d : d < 0.9d ? (((12.066481994459833d * d) * d) - (19.63545706371191d * d)) + 8.898060941828255d : (((10.8d * d) * d) - (20.52d * d)) + 10.72d;
    }

    double m1316u(double d) {
        return d < 0.5d ? m1314s(d * 2.0d) * 0.5d : (m1315t((d * 2.0d) - 1.0d) * 0.5d) + 0.5d;
    }
}
