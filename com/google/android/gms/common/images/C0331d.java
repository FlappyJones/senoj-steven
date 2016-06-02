package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.internal.cn;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.common.images.d */
final class C0331d implements Runnable {
    final /* synthetic */ ImageManager f1566a;
    private final Uri f1567b;
    private final Bitmap f1568c;
    private final CountDownLatch f1569d;
    private boolean f1570e;

    public C0331d(ImageManager imageManager, Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
        this.f1566a = imageManager;
        this.f1567b = uri;
        this.f1568c = bitmap;
        this.f1570e = z;
        this.f1569d = countDownLatch;
    }

    private void m2475a(ImageReceiver imageReceiver, boolean z) {
        imageReceiver.f1544a = true;
        ArrayList a = imageReceiver.f1547d;
        int size = a.size();
        for (int i = 0; i < size; i++) {
            C0332e c0332e = (C0332e) a.get(i);
            if (z) {
                c0332e.m2481a(this.f1566a.f1550c, this.f1568c, false);
            } else {
                c0332e.m2482a(this.f1566a.f1550c, false);
            }
            if (c0332e.f1572b != 1) {
                this.f1566a.f1554g.remove(c0332e);
            }
        }
        imageReceiver.f1544a = false;
    }

    public void run() {
        cn.m3594a("OnBitmapLoadedRunnable must be executed in the main thread");
        boolean z = this.f1568c != null;
        if (this.f1566a.f1553f != null) {
            if (this.f1570e) {
                this.f1566a.f1553f.m2467a();
                System.gc();
                this.f1570e = false;
                this.f1566a.f1551d.post(this);
                return;
            } else if (z) {
                this.f1566a.f1553f.m2470b(new C0333f(this.f1567b), this.f1568c);
            }
        }
        ImageReceiver imageReceiver = (ImageReceiver) this.f1566a.f1555h.remove(this.f1567b);
        if (imageReceiver != null) {
            m2475a(imageReceiver, z);
        }
        this.f1569d.countDown();
        synchronized (ImageManager.f1548a) {
            ImageManager.f1549b.remove(this.f1567b);
        }
    }
}
