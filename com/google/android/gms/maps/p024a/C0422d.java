package com.google.android.gms.maps.p024a;

import android.location.Location;
import android.os.IInterface;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.p025a.C0449a;
import com.google.android.gms.maps.model.p025a.C0455g;
import com.google.android.gms.maps.model.p025a.C0458j;
import com.google.android.gms.maps.model.p025a.C0461m;
import com.google.android.gms.maps.model.p025a.C0464p;
import com.google.android.gms.maps.model.p025a.C0467s;
import com.google.android.gms.p019b.C0309e;

/* renamed from: com.google.android.gms.maps.a.d */
public interface C0422d extends IInterface {
    CameraPosition m3943a();

    C0449a m3944a(PolylineOptions polylineOptions);

    C0455g m3945a(CircleOptions circleOptions);

    C0458j m3946a(GroundOverlayOptions groundOverlayOptions);

    C0461m m3947a(MarkerOptions markerOptions);

    C0464p m3948a(PolygonOptions polygonOptions);

    C0467s m3949a(TileOverlayOptions tileOverlayOptions);

    void m3950a(int i);

    void m3951a(int i, int i2, int i3, int i4);

    void m3952a(C0309e c0309e);

    void m3953a(C0309e c0309e, int i, C0441w c0441w);

    void m3954a(C0309e c0309e, C0441w c0441w);

    void m3955a(ac acVar);

    void m3956a(af afVar);

    void m3957a(ai aiVar);

    void m3958a(ao aoVar);

    void m3959a(ar arVar);

    void m3960a(au auVar);

    void m3961a(ax axVar);

    void m3962a(ba baVar);

    void m3963a(bd bdVar);

    void m3964a(bg bgVar, C0309e c0309e);

    void m3965a(C0425g c0425g);

    void m3966a(boolean z);

    float m3967b();

    void m3968b(C0309e c0309e);

    boolean m3969b(boolean z);

    float m3970c();

    void m3971c(boolean z);

    void m3972d();

    void m3973e();

    int m3974f();

    boolean m3975g();

    boolean m3976h();

    boolean m3977i();

    Location m3978j();

    C0437s m3979k();

    C0434p m3980l();

    C0309e m3981m();
}
