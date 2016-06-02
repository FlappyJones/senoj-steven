package com.google.android.gms.maps.model;

/* renamed from: com.google.android.gms.maps.model.b */
public final class C0474b {
    private LatLng f2137a;
    private float f2138b;
    private float f2139c;
    private float f2140d;

    public CameraPosition m4419a() {
        return new CameraPosition(this.f2137a, this.f2138b, this.f2139c, this.f2140d);
    }

    public C0474b m4420a(float f) {
        this.f2138b = f;
        return this;
    }

    public C0474b m4421a(LatLng latLng) {
        this.f2137a = latLng;
        return this;
    }

    public C0474b m4422b(float f) {
        this.f2139c = f;
        return this;
    }

    public C0474b m4423c(float f) {
        this.f2140d = f;
        return this;
    }
}
