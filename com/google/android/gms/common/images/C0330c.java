package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.internal.cn;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.common.images.c */
final class C0330c implements Runnable {
    final /* synthetic */ ImageManager f1563a;
    private final Uri f1564b;
    private final ParcelFileDescriptor f1565c;

    public C0330c(ImageManager imageManager, Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
        this.f1563a = imageManager;
        this.f1564b = uri;
        this.f1565c = parcelFileDescriptor;
    }

    public void run() {
        cn.m3596b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        boolean z = false;
        Bitmap bitmap = null;
        if (this.f1565c != null) {
            try {
                bitmap = BitmapFactory.decodeFileDescriptor(this.f1565c.getFileDescriptor());
            } catch (Throwable e) {
                Log.e("ImageManager", "OOM while loading bitmap for uri: " + this.f1564b, e);
                z = true;
            }
            try {
                this.f1565c.close();
            } catch (Throwable e2) {
                Log.e("ImageManager", "closed failed", e2);
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f1563a.f1551d.post(new C0331d(this.f1563a, this.f1564b, bitmap, z, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException e3) {
            Log.w("ImageManager", "Latch interrupted while posting " + this.f1564b);
        }
    }
}
