package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.C0321b;
import com.google.android.gms.common.data.C0324d;

/* renamed from: com.google.android.gms.games.d */
public final class C0347d extends C0321b implements Player {
    public C0347d(C0324d c0324d, int i) {
        super(c0324d, i);
    }

    public /* synthetic */ Object m2634a() {
        return m2640g();
    }

    public String m2635b() {
        return m2417d("external_player_id");
    }

    public String m2636c() {
        return m2417d("profile_name");
    }

    public Uri m2637d() {
        return m2418e("profile_icon_image_uri");
    }

    public int describeContents() {
        return 0;
    }

    public Uri m2638e() {
        return m2418e("profile_hi_res_image_uri");
    }

    public boolean equals(Object obj) {
        return PlayerEntity.m2592a(this, obj);
    }

    public long m2639f() {
        return m2414a("last_updated");
    }

    public Player m2640g() {
        return new PlayerEntity(this);
    }

    public int hashCode() {
        return PlayerEntity.m2591a((Player) this);
    }

    public String toString() {
        return PlayerEntity.m2595b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((PlayerEntity) m2640g()).writeToParcel(parcel, i);
    }
}
