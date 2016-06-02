package android.support.v4.view.p002a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.view.a.p */
class C0068p implements C0067w {
    final /* synthetic */ C0060k f331a;
    final /* synthetic */ C0066o f332b;

    C0068p(C0066o c0066o, C0060k c0060k) {
        this.f332b = c0066o;
        this.f331a = c0060k;
    }

    public Object m565a(int i) {
        C0048a a = this.f331a.m546a(i);
        return a == null ? null : a.m316a();
    }

    public List m566a(String str, int i) {
        List a = this.f331a.m548a(str, i);
        List arrayList = new ArrayList();
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((C0048a) a.get(i2)).m316a());
        }
        return arrayList;
    }

    public boolean m567a(int i, int i2, Bundle bundle) {
        return this.f331a.m549a(i, i2, bundle);
    }

    public Object m568b(int i) {
        C0048a b = this.f331a.m550b(i);
        return b == null ? null : b.m316a();
    }
}
