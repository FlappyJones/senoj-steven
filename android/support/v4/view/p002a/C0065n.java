package android.support.v4.view.p002a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.view.a.n */
class C0065n implements C0064t {
    final /* synthetic */ C0060k f329a;
    final /* synthetic */ C0063m f330b;

    C0065n(C0063m c0063m, C0060k c0060k) {
        this.f330b = c0063m;
        this.f329a = c0060k;
    }

    public Object m557a(int i) {
        C0048a a = this.f329a.m546a(i);
        return a == null ? null : a.m316a();
    }

    public List m558a(String str, int i) {
        List a = this.f329a.m548a(str, i);
        List arrayList = new ArrayList();
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((C0048a) a.get(i2)).m316a());
        }
        return arrayList;
    }

    public boolean m559a(int i, int i2, Bundle bundle) {
        return this.f329a.m549a(i, i2, bundle);
    }
}
