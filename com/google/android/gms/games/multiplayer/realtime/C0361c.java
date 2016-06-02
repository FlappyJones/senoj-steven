package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.C0321b;
import com.google.android.gms.games.multiplayer.C0358d;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.games.multiplayer.realtime.c */
public final class C0361c extends C0321b implements Room {
    private final int f1660c;

    public /* synthetic */ Object m2755a() {
        return m2765k();
    }

    public String m2756b() {
        return m2417d("external_match_id");
    }

    public String m2757c() {
        return m2417d("creator_external");
    }

    public long m2758d() {
        return m2414a("creation_timestamp");
    }

    public int describeContents() {
        return 0;
    }

    public int m2759e() {
        return m2415b("status");
    }

    public boolean equals(Object obj) {
        return RoomEntity.m2735a(this, obj);
    }

    public String m2760f() {
        return m2417d("description");
    }

    public int m2761g() {
        return m2415b("variant");
    }

    public Bundle m2762h() {
        return !m2416c("has_automatch_criteria") ? null : C0360b.m2754a(m2415b("automatch_min_players"), m2415b("automatch_max_players"), m2414a("automatch_bit_mask"));
    }

    public int hashCode() {
        return RoomEntity.m2734a((Room) this);
    }

    public ArrayList m2763i() {
        ArrayList arrayList = new ArrayList(this.f1660c);
        for (int i = 0; i < this.f1660c; i++) {
            arrayList.add(new C0358d(this.a, this.b + i));
        }
        return arrayList;
    }

    public int m2764j() {
        return m2415b("automatch_wait_estimate_sec");
    }

    public Room m2765k() {
        return new RoomEntity(this);
    }

    public String toString() {
        return RoomEntity.m2738b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((RoomEntity) m2765k()).writeToParcel(parcel, i);
    }
}
