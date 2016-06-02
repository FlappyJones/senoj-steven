package org.andengine.opengl.p067c.p068a.p070a.p071a;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import java.io.Closeable;
import java.io.IOException;
import org.andengine.opengl.p067c.p068a.p069b.C0684a;
import org.andengine.p005d.C0636d;
import org.andengine.p005d.p057e.C0637a;

/* renamed from: org.andengine.opengl.c.a.a.a.a */
public class C0686a extends C0684a implements C0685b {
    private final AssetManager f2733e;
    private final String f2734f;

    C0686a(AssetManager assetManager, String str, int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.f2733e = assetManager;
        this.f2734f = str;
    }

    public static C0686a m5292a(AssetManager assetManager, String str) {
        return C0686a.m5293a(assetManager, str, 0, 0);
    }

    public static C0686a m5293a(AssetManager assetManager, String str, int i, int i2) {
        Closeable closeable = null;
        Options options = new Options();
        options.inJustDecodeBounds = true;
        try {
            closeable = assetManager.open(str);
            BitmapFactory.decodeStream(closeable, null, options);
        } catch (Throwable e) {
            C0637a.m5156b("Failed loading Bitmap in AssetBitmapTextureAtlasSource. AssetPath: " + str, e);
        } finally {
            C0636d.m5149a(closeable);
        }
        return new C0686a(assetManager, str, i, i2, options.outWidth, options.outHeight);
    }

    public Bitmap m5294a(Config config) {
        Closeable open;
        Throwable e;
        Throwable th;
        Bitmap bitmap = null;
        try {
            Options options = new Options();
            options.inPreferredConfig = config;
            open = this.f2733e.open(this.f2734f);
            try {
                bitmap = BitmapFactory.decodeStream(open, null, options);
                C0636d.m5149a(open);
            } catch (IOException e2) {
                e = e2;
                try {
                    C0637a.m5156b("Failed loading Bitmap in " + getClass().getSimpleName() + ". AssetPath: " + this.f2734f, e);
                    C0636d.m5149a(open);
                    return bitmap;
                } catch (Throwable th2) {
                    th = th2;
                    C0636d.m5149a(open);
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            open = bitmap;
            C0637a.m5156b("Failed loading Bitmap in " + getClass().getSimpleName() + ". AssetPath: " + this.f2734f, e);
            C0636d.m5149a(open);
            return bitmap;
        } catch (Throwable e4) {
            open = bitmap;
            th = e4;
            C0636d.m5149a(open);
            throw th;
        }
        return bitmap;
    }

    public String toString() {
        return new StringBuilder(String.valueOf(getClass().getSimpleName())).append("(").append(this.f2734f).append(")").toString();
    }
}
