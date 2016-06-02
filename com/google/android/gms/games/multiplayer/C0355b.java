package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.data.C0321b;
import com.google.android.gms.games.Game;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.games.multiplayer.b */
public final class C0355b extends C0321b implements Invitation {
    private final Game f1643c;
    private final C0358d f1644d;
    private final ArrayList f1645e;

    public /* synthetic */ Object m2702a() {
        return m2709h();
    }

    public Game m2703b() {
        return this.f1643c;
    }

    public String m2704c() {
        return m2417d("external_invitation_id");
    }

    public Participant m2705d() {
        return this.f1644d;
    }

    public int describeContents() {
        return 0;
    }

    public long m2706e() {
        return m2414a("creation_timestamp");
    }

    public boolean equals(Object obj) {
        return InvitationEntity.m2656a(this, obj);
    }

    public int m2707f() {
        return m2415b("type");
    }

    public int m2708g() {
        return m2415b("variant");
    }

    public Invitation m2709h() {
        return new InvitationEntity(this);
    }

    public int hashCode() {
        return InvitationEntity.m2655a((Invitation) this);
    }

    public ArrayList m2710i() {
        return this.f1645e;
    }

    public String toString() {
        return InvitationEntity.m2659b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((InvitationEntity) m2709h()).writeToParcel(parcel, i);
    }
}
