package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;
import java.util.List;

public class bw implements Creator {
    static void m3332a(co coVar, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2528a(parcel, 1, coVar.m3603g(), false);
        C0336c.m2522a(parcel, 1000, coVar.m3607k());
        C0336c.m2538b(parcel, 2, coVar.m3597a(), false);
        C0336c.m2538b(parcel, 3, coVar.m3598b(), false);
        C0336c.m2527a(parcel, 4, coVar.m3599c(), i, false);
        C0336c.m2528a(parcel, 5, coVar.m3600d(), false);
        C0336c.m2528a(parcel, 6, coVar.m3601e(), false);
        C0336c.m2528a(parcel, 7, coVar.m3602f(), false);
        C0336c.m2524a(parcel, 8, coVar.m3604h(), false);
        C0336c.m2524a(parcel, 9, coVar.m3605i(), false);
        C0336c.m2522a(parcel, 10, coVar.m3606j());
        C0336c.m2518a(parcel, a);
    }

    public co m3333a(Parcel parcel) {
        int i = 0;
        Bundle bundle = null;
        int b = C0334a.m2489b(parcel);
        Bundle bundle2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Uri uri = null;
        List list = null;
        List list2 = null;
        String str4 = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    str4 = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    list2 = C0334a.m2492c(parcel, a, C0413x.CREATOR);
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    list = C0334a.m2492c(parcel, a, Uri.CREATOR);
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    uri = (Uri) C0334a.m2486a(parcel, a, Uri.CREATOR);
                    break;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    str3 = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    str2 = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_uiRotateGestures /*7*/:
                    str = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_uiScrollGestures /*8*/:
                    bundle2 = C0334a.m2504n(parcel, a);
                    break;
                case C0338e.MapAttrs_uiTiltGestures /*9*/:
                    bundle = C0334a.m2504n(parcel, a);
                    break;
                case C0338e.MapAttrs_uiZoomControls /*10*/:
                    i = C0334a.m2496f(parcel, a);
                    break;
                case 1000:
                    i2 = C0334a.m2496f(parcel, a);
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new co(i2, str4, list2, list, uri, str3, str2, str, bundle2, bundle, i);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public co[] m3334a(int i) {
        return new co[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3333a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3334a(i);
    }
}
