package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.maps.model.i */
public class C0481i implements Creator {
    static void m4442a(PolygonOptions polygonOptions, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1, polygonOptions.m4156a());
        C0336c.m2538b(parcel, 2, polygonOptions.m4158c(), false);
        C0336c.m2540c(parcel, 3, polygonOptions.m4157b(), false);
        C0336c.m2521a(parcel, 4, polygonOptions.m4159d());
        C0336c.m2522a(parcel, 5, polygonOptions.m4160e());
        C0336c.m2522a(parcel, 6, polygonOptions.m4161f());
        C0336c.m2521a(parcel, 7, polygonOptions.m4162g());
        C0336c.m2531a(parcel, 8, polygonOptions.m4163h());
        C0336c.m2531a(parcel, 9, polygonOptions.m4164i());
        C0336c.m2518a(parcel, a);
    }

    public PolygonOptions m4443a(Parcel parcel) {
        float f = 0.0f;
        boolean z = false;
        int b = C0334a.m2489b(parcel);
        List list = null;
        List arrayList = new ArrayList();
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    i3 = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    list = C0334a.m2492c(parcel, a, LatLng.CREATOR);
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    C0334a.m2488a(parcel, a, arrayList, getClass().getClassLoader());
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    f2 = C0334a.m2499i(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    i2 = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    i = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_uiRotateGestures /*7*/:
                    f = C0334a.m2499i(parcel, a);
                    break;
                case C0338e.MapAttrs_uiScrollGestures /*8*/:
                    z2 = C0334a.m2493c(parcel, a);
                    break;
                case C0338e.MapAttrs_uiTiltGestures /*9*/:
                    z = C0334a.m2493c(parcel, a);
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PolygonOptions(i3, list, arrayList, f2, i2, i, f, z2, z);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public PolygonOptions[] m4444a(int i) {
        return new PolygonOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4443a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m4444a(i);
    }
}
