package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.C0321b;
import com.google.android.gms.common.data.C0324d;
import com.google.android.gms.games.C0347d;
import com.google.android.gms.games.Player;

/* renamed from: com.google.android.gms.games.multiplayer.d */
public final class C0358d extends C0321b implements Participant {
    private final C0347d f1646c;

    public C0358d(C0324d c0324d, int i) {
        super(c0324d, i);
        this.f1646c = new C0347d(c0324d, i);
    }

    public /* synthetic */ Object m2715a() {
        return m2725k();
    }

    public int m2716b() {
        return m2415b("player_status");
    }

    public String m2717c() {
        return m2417d("client_address");
    }

    public int m2718d() {
        return m2415b("capabilities");
    }

    public int describeContents() {
        return 0;
    }

    public boolean m2719e() {
        return m2415b("connected") > 0;
    }

    public boolean equals(Object obj) {
        return ParticipantEntity.m2681a(this, obj);
    }

    public String m2720f() {
        return m2419f("external_player_id") ? m2417d("default_display_name") : this.f1646c.m2636c();
    }

    public Uri m2721g() {
        return m2419f("external_player_id") ? m2418e("default_display_image_uri") : this.f1646c.m2637d();
    }

    public Uri m2722h() {
        return m2419f("external_player_id") ? null : this.f1646c.m2638e();
    }

    public int hashCode() {
        return ParticipantEntity.m2680a((Participant) this);
    }

    public String m2723i() {
        return m2417d("external_participant_id");
    }

    public Player m2724j() {
        return m2419f("external_player_id") ? null : this.f1646c;
    }

    public Participant m2725k() {
        return new ParticipantEntity(this);
    }

    public String toString() {
        return ParticipantEntity.m2684b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((ParticipantEntity) m2725k()).writeToParcel(parcel, i);
    }
}
