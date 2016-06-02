package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.C0483k;

public class MapView extends FrameLayout {
    private final C0447d f2021a;
    private C0444a f2022b;

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2021a = new C0447d(this, context, GoogleMapOptions.m3837a(context, attributeSet));
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2021a = new C0447d(this, context, GoogleMapOptions.m3837a(context, attributeSet));
    }

    public final C0444a getMap() {
        if (this.f2022b != null) {
            return this.f2022b;
        }
        this.f2021a.m4116b();
        if (this.f2021a.m2394a() == null) {
            return null;
        }
        try {
            this.f2022b = new C0444a(((C0446c) this.f2021a.m2394a()).m4115a().m4050a());
            return this.f2022b;
        } catch (RemoteException e) {
            throw new C0483k(e);
        }
    }
}
