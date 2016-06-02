package org.andengine.p027a.p030c;

import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.util.SparseArray;
import org.andengine.p027a.C0564b;
import org.andengine.p027a.p030c.p031a.C0566a;

/* renamed from: org.andengine.a.c.c */
public class C0570c extends C0564b implements OnLoadCompleteListener {
    private final SoundPool f2428c;
    private final SparseArray f2429d;

    public C0570c() {
        this(5);
    }

    public C0570c(int i) {
        this.f2429d = new SparseArray();
        this.f2428c = new SoundPool(i, 3, 0);
        this.f2428c.setOnLoadCompleteListener(this);
    }

    public void m4884a(C0568a c0568a) {
        super.m4869a(c0568a);
        this.f2429d.put(c0568a.m4879h(), c0568a);
    }

    public void m4886b() {
        super.m4870b();
        this.f2428c.release();
    }

    public boolean m4887b(C0568a c0568a) {
        boolean b = super.m4871b(c0568a);
        if (b) {
            this.f2429d.remove(c0568a.m4879h());
        }
        return b;
    }

    SoundPool m4889c() {
        return this.f2428c;
    }

    public synchronized void onLoadComplete(SoundPool soundPool, int i, int i2) {
        if (i2 == 0) {
            C0568a c0568a = (C0568a) this.f2429d.get(i);
            if (c0568a == null) {
                throw new C0566a("Unexpected soundID: '" + i + "'.");
            }
            c0568a.m4874a(true);
        }
    }
}
