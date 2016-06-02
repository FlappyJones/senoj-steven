package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;

/* renamed from: com.google.android.gms.games.i */
public class C0350i implements Creator {
    static void m2644a(PlayerEntity playerEntity, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2528a(parcel, 1, playerEntity.m2598b(), false);
        C0336c.m2522a(parcel, 1000, playerEntity.m2603g());
        C0336c.m2528a(parcel, 2, playerEntity.m2599c(), false);
        C0336c.m2527a(parcel, 3, playerEntity.m2600d(), i, false);
        C0336c.m2527a(parcel, 4, playerEntity.m2601e(), i, false);
        C0336c.m2523a(parcel, 5, playerEntity.m2602f());
        C0336c.m2518a(parcel, a);
    }

    public PlayerEntity m2645a(Parcel parcel) {
        Uri uri = null;
        int b = C0334a.m2489b(parcel);
        int i = 0;
        long j = 0;
        Uri uri2 = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    str2 = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    str = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    uri2 = (Uri) C0334a.m2486a(parcel, a, Uri.CREATOR);
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    uri = (Uri) C0334a.m2486a(parcel, a, Uri.CREATOR);
                    break;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    j = C0334a.m2497g(parcel, a);
                    break;
                case 1000:
                    i = C0334a.m2496f(parcel, a);
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PlayerEntity(i, str2, str, uri2, uri, j);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public PlayerEntity[] m2646a(int i) {
        return new PlayerEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2645a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2646a(i);
    }
}
