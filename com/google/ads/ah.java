package com.google.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public abstract class ah implements ag {
    protected MotionEvent f958a;
    protected DisplayMetrics f959b;
    private aw f960c;
    private ByteArrayOutputStream f961d;

    protected ah(Context context) {
        this.f960c = null;
        this.f961d = null;
        this.f958a = null;
        this.f959b = null;
        try {
            this.f959b = context.getResources().getDisplayMetrics();
        } catch (UnsupportedOperationException e) {
            this.f959b = new DisplayMetrics();
            this.f959b.density = 1.0f;
        }
    }

    private String m1579a(Context context, String str, boolean z) {
        try {
            m1580a();
            if (z) {
                m1591c(context);
            } else {
                m1590b(context);
            }
            byte[] b = m1581b();
            return b.length == 0 ? Integer.toString(5) : m1584a(b, str);
        } catch (NoSuchAlgorithmException e) {
            return Integer.toString(7);
        } catch (UnsupportedEncodingException e2) {
            return Integer.toString(7);
        } catch (IOException e3) {
            return Integer.toString(3);
        }
    }

    private void m1580a() {
        this.f961d = new ByteArrayOutputStream();
        this.f960c = aw.m1637a(this.f961d);
    }

    private byte[] m1581b() {
        this.f960c.m1640a();
        return this.f961d.toByteArray();
    }

    public String m1582a(Context context) {
        return m1579a(context, null, false);
    }

    public String m1583a(Context context, String str) {
        return m1579a(context, str, true);
    }

    String m1584a(byte[] bArr, String str) {
        byte[] bArr2;
        if (bArr.length > 239) {
            m1580a();
            m1586a(20, 1);
            bArr = m1581b();
        }
        if (bArr.length < 239) {
            bArr2 = new byte[(239 - bArr.length)];
            new SecureRandom().nextBytes(bArr2);
            bArr2 = ByteBuffer.allocate(240).put((byte) bArr.length).put(bArr).put(bArr2).array();
        } else {
            bArr2 = ByteBuffer.allocate(240).put((byte) bArr.length).put(bArr).array();
        }
        MessageDigest instance = MessageDigest.getInstance("MD5");
        instance.update(bArr2);
        bArr2 = ByteBuffer.allocate(256).put(instance.digest()).put(bArr2).array();
        byte[] bArr3 = new byte[256];
        new C0218q().m1780a(bArr2, bArr3);
        if (str != null && str.length() > 0) {
            m1589a(str, bArr3);
        }
        return aq.m1626a(bArr3, false);
    }

    public void m1585a(int i, int i2, int i3) {
        if (this.f958a != null) {
            this.f958a.recycle();
        }
        this.f958a = MotionEvent.obtain(0, (long) i3, 1, ((float) i) * this.f959b.density, ((float) i2) * this.f959b.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
    }

    protected void m1586a(int i, long j) {
        this.f960c.m1644a(i, j);
    }

    protected void m1587a(int i, String str) {
        this.f960c.m1645a(i, str);
    }

    public void m1588a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f958a != null) {
                this.f958a.recycle();
            }
            this.f958a = MotionEvent.obtain(motionEvent);
        }
    }

    void m1589a(String str, byte[] bArr) {
        if (str.length() > 32) {
            str = str.substring(0, 32);
        }
        new ar(str.getBytes("UTF-8")).m1632a(bArr);
    }

    protected abstract void m1590b(Context context);

    protected abstract void m1591c(Context context);
}
