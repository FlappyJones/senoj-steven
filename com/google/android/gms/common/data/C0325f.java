package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;

/* renamed from: com.google.android.gms.common.data.f */
public class C0325f implements Creator {
    static void m2436a(C0324d c0324d, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2534a(parcel, 1, c0324d.m2427c(), false);
        C0336c.m2522a(parcel, 1000, c0324d.m2424b());
        C0336c.m2533a(parcel, 2, c0324d.m2429d(), i, false);
        C0336c.m2522a(parcel, 3, c0324d.m2430e());
        C0336c.m2524a(parcel, 4, c0324d.m2432f(), false);
        C0336c.m2518a(parcel, a);
    }

    public C0324d m2437a(Parcel parcel) {
        int i = 0;
        Bundle bundle = null;
        int b = C0334a.m2489b(parcel);
        CursorWindow[] cursorWindowArr = null;
        String[] strArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    strArr = C0334a.m2513w(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    cursorWindowArr = (CursorWindow[]) C0334a.m2491b(parcel, a, CursorWindow.CREATOR);
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    i = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    bundle = C0334a.m2504n(parcel, a);
                    break;
                case 1000:
                    i2 = C0334a.m2496f(parcel, a);
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() != b) {
            throw new C0335b("Overread allowed size end=" + b, parcel);
        }
        C0324d c0324d = new C0324d(i2, strArr, cursorWindowArr, i, bundle);
        c0324d.m2423a();
        return c0324d;
    }

    public C0324d[] m2438a(int i) {
        return new C0324d[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2437a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2438a(i);
    }
}
