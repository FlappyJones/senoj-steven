package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;

public final class al {
    public IBinder f1700a;
    public int f1701b;
    public int f1702c;
    public int f1703d;
    public int f1704e;
    public int f1705f;
    public int f1706g;

    private al(int i, IBinder iBinder) {
        this.f1702c = -1;
        this.f1703d = 0;
        this.f1704e = 0;
        this.f1705f = 0;
        this.f1706g = 0;
        this.f1701b = i;
        this.f1700a = iBinder;
    }

    public Bundle m3095a() {
        Bundle bundle = new Bundle();
        bundle.putInt("popupLocationInfo.gravity", this.f1701b);
        bundle.putInt("popupLocationInfo.displayId", this.f1702c);
        bundle.putInt("popupLocationInfo.left", this.f1703d);
        bundle.putInt("popupLocationInfo.top", this.f1704e);
        bundle.putInt("popupLocationInfo.right", this.f1705f);
        bundle.putInt("popupLocationInfo.bottom", this.f1706g);
        return bundle;
    }
}
