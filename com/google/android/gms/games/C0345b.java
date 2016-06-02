package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.C0321b;

/* renamed from: com.google.android.gms.games.b */
public final class C0345b extends C0321b implements Game {
    public /* synthetic */ Object m2612a() {
        return m2628q();
    }

    public String m2613b() {
        return m2417d("external_game_id");
    }

    public String m2614c() {
        return m2417d("display_name");
    }

    public String m2615d() {
        return m2417d("primary_category");
    }

    public int describeContents() {
        return 0;
    }

    public String m2616e() {
        return m2417d("secondary_category");
    }

    public boolean equals(Object obj) {
        return GameEntity.m2563a(this, obj);
    }

    public String m2617f() {
        return m2417d("game_description");
    }

    public String m2618g() {
        return m2417d("developer_name");
    }

    public Uri m2619h() {
        return m2418e("game_icon_image_uri");
    }

    public int hashCode() {
        return GameEntity.m2562a((Game) this);
    }

    public Uri m2620i() {
        return m2418e("game_hi_res_image_uri");
    }

    public Uri m2621j() {
        return m2418e("featured_image_uri");
    }

    public boolean m2622k() {
        return m2416c("play_enabled_game");
    }

    public boolean m2623l() {
        return m2415b("installed") > 0;
    }

    public String m2624m() {
        return m2417d("package_name");
    }

    public int m2625n() {
        return m2415b("gameplay_acl_status");
    }

    public int m2626o() {
        return m2415b("achievement_total_count");
    }

    public int m2627p() {
        return m2415b("leaderboard_count");
    }

    public Game m2628q() {
        return new GameEntity(this);
    }

    public String toString() {
        return GameEntity.m2566b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((GameEntity) m2628q()).writeToParcel(parcel, i);
    }
}
