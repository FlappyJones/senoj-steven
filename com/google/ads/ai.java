package com.google.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class ai extends ah {
    static boolean f962c;
    private static Method f963d;
    private static Method f964e;
    private static Method f965f;
    private static Method f966g;
    private static Method f967h;
    private static String f968i;
    private static long f969j;

    static {
        f963d = null;
        f964e = null;
        f965f = null;
        f966g = null;
        f967h = null;
        f968i = null;
        f969j = 0;
        f962c = false;
    }

    protected ai(Context context) {
        super(context);
    }

    public static ai m1592a(String str, Context context) {
        m1597b(str, context);
        return new ai(context);
    }

    static String m1593a() {
        if (f968i != null) {
            return f968i;
        }
        throw new aj();
    }

    static ArrayList m1594a(MotionEvent motionEvent, DisplayMetrics displayMetrics) {
        if (f966g == null || motionEvent == null) {
            throw new aj();
        }
        try {
            return (ArrayList) f966g.invoke(null, new Object[]{motionEvent, displayMetrics});
        } catch (Throwable e) {
            throw new aj(e);
        } catch (Throwable e2) {
            throw new aj(e2);
        }
    }

    static Long m1595b() {
        if (f963d == null) {
            throw new aj();
        }
        try {
            return (Long) f963d.invoke(null, new Object[0]);
        } catch (Throwable e) {
            throw new aj(e);
        } catch (Throwable e2) {
            throw new aj(e2);
        }
    }

    private static String m1596b(byte[] bArr, String str) {
        try {
            return new String(am.m1611a(bArr, str), "UTF-8");
        } catch (Throwable e) {
            throw new aj(e);
        } catch (Throwable e2) {
            throw new aj(e2);
        } catch (Throwable e22) {
            throw new aj(e22);
        }
    }

    protected static synchronized void m1597b(String str, Context context) {
        synchronized (ai.class) {
            if (!f962c) {
                try {
                    f968i = str;
                    m1601f(context);
                    f969j = m1595b().longValue();
                    f962c = true;
                } catch (aj e) {
                } catch (UnsupportedOperationException e2) {
                }
            }
        }
    }

    static String m1598c() {
        if (f964e == null) {
            throw new aj();
        }
        try {
            return (String) f964e.invoke(null, new Object[0]);
        } catch (Throwable e) {
            throw new aj(e);
        } catch (Throwable e2) {
            throw new aj(e2);
        }
    }

    static String m1599d(Context context) {
        if (f967h == null) {
            throw new aj();
        }
        try {
            String str = (String) f967h.invoke(null, new Object[]{context});
            if (str != null) {
                return str;
            }
            throw new aj();
        } catch (Throwable e) {
            throw new aj(e);
        } catch (Throwable e2) {
            throw new aj(e2);
        }
    }

    static String m1600e(Context context) {
        if (f965f == null) {
            throw new aj();
        }
        try {
            ByteBuffer byteBuffer = (ByteBuffer) f965f.invoke(null, new Object[]{context});
            if (byteBuffer != null) {
                return aq.m1626a(byteBuffer.array(), false);
            }
            throw new aj();
        } catch (Throwable e) {
            throw new aj(e);
        } catch (Throwable e2) {
            throw new aj(e2);
        }
    }

    private static void m1601f(Context context) {
        try {
            byte[] a = am.m1610a(ao.m1612a());
            byte[] a2 = am.m1611a(a, ao.m1613b());
            File cacheDir = context.getCacheDir();
            if (cacheDir == null) {
                cacheDir = context.getDir("dex", 0);
                if (cacheDir == null) {
                    throw new aj();
                }
            }
            File createTempFile = File.createTempFile("ads", ".jar", cacheDir);
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(a2, 0, a2.length);
            fileOutputStream.close();
            DexClassLoader dexClassLoader = new DexClassLoader(createTempFile.getAbsolutePath(), cacheDir.getAbsolutePath(), null, context.getClassLoader());
            Class loadClass = dexClassLoader.loadClass(m1596b(a, ao.m1614c()));
            Class loadClass2 = dexClassLoader.loadClass(m1596b(a, ao.m1620i()));
            Class loadClass3 = dexClassLoader.loadClass(m1596b(a, ao.m1618g()));
            Class loadClass4 = dexClassLoader.loadClass(m1596b(a, ao.m1622k()));
            Class loadClass5 = dexClassLoader.loadClass(m1596b(a, ao.m1616e()));
            f963d = loadClass.getMethod(m1596b(a, ao.m1615d()), new Class[0]);
            f964e = loadClass2.getMethod(m1596b(a, ao.m1621j()), new Class[0]);
            f965f = loadClass3.getMethod(m1596b(a, ao.m1619h()), new Class[]{Context.class});
            f966g = loadClass4.getMethod(m1596b(a, ao.m1623l()), new Class[]{MotionEvent.class, DisplayMetrics.class});
            f967h = loadClass5.getMethod(m1596b(a, ao.m1617f()), new Class[]{Context.class});
            String name = createTempFile.getName();
            createTempFile.delete();
            new File(cacheDir, name.replace(".jar", ".dex")).delete();
        } catch (Throwable e) {
            throw new aj(e);
        } catch (Throwable e2) {
            throw new aj(e2);
        } catch (Throwable e22) {
            throw new aj(e22);
        } catch (Throwable e222) {
            throw new aj(e222);
        } catch (Throwable e2222) {
            throw new aj(e2222);
        } catch (Throwable e22222) {
            throw new aj(e22222);
        } catch (Throwable e222222) {
            throw new aj(e222222);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void m1602b(android.content.Context r4) {
        /*
        r3 = this;
        r0 = 1;
        r1 = m1598c();	 Catch:{ aj -> 0x002f, IOException -> 0x0027 }
        r3.m1587a(r0, r1);	 Catch:{ aj -> 0x002f, IOException -> 0x0027 }
    L_0x0008:
        r0 = 2;
        r1 = m1593a();	 Catch:{ aj -> 0x002d, IOException -> 0x0027 }
        r3.m1587a(r0, r1);	 Catch:{ aj -> 0x002d, IOException -> 0x0027 }
    L_0x0010:
        r0 = 25;
        r1 = m1595b();	 Catch:{ aj -> 0x002b, IOException -> 0x0027 }
        r1 = r1.longValue();	 Catch:{ aj -> 0x002b, IOException -> 0x0027 }
        r3.m1586a(r0, r1);	 Catch:{ aj -> 0x002b, IOException -> 0x0027 }
    L_0x001d:
        r0 = 24;
        r1 = m1599d(r4);	 Catch:{ aj -> 0x0029, IOException -> 0x0027 }
        r3.m1587a(r0, r1);	 Catch:{ aj -> 0x0029, IOException -> 0x0027 }
    L_0x0026:
        return;
    L_0x0027:
        r0 = move-exception;
        goto L_0x0026;
    L_0x0029:
        r0 = move-exception;
        goto L_0x0026;
    L_0x002b:
        r0 = move-exception;
        goto L_0x001d;
    L_0x002d:
        r0 = move-exception;
        goto L_0x0010;
    L_0x002f:
        r0 = move-exception;
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.ai.b(android.content.Context):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void m1603c(android.content.Context r7) {
        /*
        r6 = this;
        r0 = 2;
        r1 = m1593a();	 Catch:{ aj -> 0x0087, IOException -> 0x007d }
        r6.m1587a(r0, r1);	 Catch:{ aj -> 0x0087, IOException -> 0x007d }
    L_0x0008:
        r0 = 1;
        r1 = m1598c();	 Catch:{ aj -> 0x0085, IOException -> 0x007d }
        r6.m1587a(r0, r1);	 Catch:{ aj -> 0x0085, IOException -> 0x007d }
    L_0x0010:
        r0 = m1595b();	 Catch:{ aj -> 0x0083, IOException -> 0x007d }
        r0 = r0.longValue();	 Catch:{ aj -> 0x0083, IOException -> 0x007d }
        r2 = 25;
        r6.m1586a(r2, r0);	 Catch:{ aj -> 0x0083, IOException -> 0x007d }
        r2 = f969j;	 Catch:{ aj -> 0x0083, IOException -> 0x007d }
        r4 = 0;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 == 0) goto L_0x0034;
    L_0x0025:
        r2 = 17;
        r3 = f969j;	 Catch:{ aj -> 0x0083, IOException -> 0x007d }
        r0 = r0 - r3;
        r6.m1586a(r2, r0);	 Catch:{ aj -> 0x0083, IOException -> 0x007d }
        r0 = 23;
        r1 = f969j;	 Catch:{ aj -> 0x0083, IOException -> 0x007d }
        r6.m1586a(r0, r1);	 Catch:{ aj -> 0x0083, IOException -> 0x007d }
    L_0x0034:
        r0 = r6.a;	 Catch:{ aj -> 0x0081, IOException -> 0x007d }
        r1 = r6.b;	 Catch:{ aj -> 0x0081, IOException -> 0x007d }
        r1 = m1594a(r0, r1);	 Catch:{ aj -> 0x0081, IOException -> 0x007d }
        r2 = 14;
        r0 = 0;
        r0 = r1.get(r0);	 Catch:{ aj -> 0x0081, IOException -> 0x007d }
        r0 = (java.lang.Long) r0;	 Catch:{ aj -> 0x0081, IOException -> 0x007d }
        r3 = r0.longValue();	 Catch:{ aj -> 0x0081, IOException -> 0x007d }
        r6.m1586a(r2, r3);	 Catch:{ aj -> 0x0081, IOException -> 0x007d }
        r2 = 15;
        r0 = 1;
        r0 = r1.get(r0);	 Catch:{ aj -> 0x0081, IOException -> 0x007d }
        r0 = (java.lang.Long) r0;	 Catch:{ aj -> 0x0081, IOException -> 0x007d }
        r3 = r0.longValue();	 Catch:{ aj -> 0x0081, IOException -> 0x007d }
        r6.m1586a(r2, r3);	 Catch:{ aj -> 0x0081, IOException -> 0x007d }
        r0 = r1.size();	 Catch:{ aj -> 0x0081, IOException -> 0x007d }
        r2 = 3;
        if (r0 < r2) goto L_0x0073;
    L_0x0063:
        r2 = 16;
        r0 = 2;
        r0 = r1.get(r0);	 Catch:{ aj -> 0x0081, IOException -> 0x007d }
        r0 = (java.lang.Long) r0;	 Catch:{ aj -> 0x0081, IOException -> 0x007d }
        r0 = r0.longValue();	 Catch:{ aj -> 0x0081, IOException -> 0x007d }
        r6.m1586a(r2, r0);	 Catch:{ aj -> 0x0081, IOException -> 0x007d }
    L_0x0073:
        r0 = 27;
        r1 = m1600e(r7);	 Catch:{ aj -> 0x007f, IOException -> 0x007d }
        r6.m1587a(r0, r1);	 Catch:{ aj -> 0x007f, IOException -> 0x007d }
    L_0x007c:
        return;
    L_0x007d:
        r0 = move-exception;
        goto L_0x007c;
    L_0x007f:
        r0 = move-exception;
        goto L_0x007c;
    L_0x0081:
        r0 = move-exception;
        goto L_0x0073;
    L_0x0083:
        r0 = move-exception;
        goto L_0x0034;
    L_0x0085:
        r0 = move-exception;
        goto L_0x0010;
    L_0x0087:
        r0 = move-exception;
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.ai.c(android.content.Context):void");
    }
}
