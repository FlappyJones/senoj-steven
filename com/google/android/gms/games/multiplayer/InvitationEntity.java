package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.C0394do;
import com.google.android.gms.internal.av;
import com.google.android.gms.internal.dl;
import java.util.ArrayList;

public final class InvitationEntity extends av implements Invitation {
    public static final Creator CREATOR;
    private final int f1625a;
    private final GameEntity f1626b;
    private final String f1627c;
    private final long f1628d;
    private final int f1629e;
    private final ParticipantEntity f1630f;
    private final ArrayList f1631g;
    private final int f1632h;

    static {
        CREATOR = new C0354a();
    }

    InvitationEntity(int i, GameEntity gameEntity, String str, long j, int i2, ParticipantEntity participantEntity, ArrayList arrayList, int i3) {
        this.f1625a = i;
        this.f1626b = gameEntity;
        this.f1627c = str;
        this.f1628d = j;
        this.f1629e = i2;
        this.f1630f = participantEntity;
        this.f1631g = arrayList;
        this.f1632h = i3;
    }

    InvitationEntity(Invitation invitation) {
        this.f1625a = 1;
        this.f1626b = new GameEntity(invitation.m2649b());
        this.f1627c = invitation.m2650c();
        this.f1628d = invitation.m2652e();
        this.f1629e = invitation.m2653f();
        this.f1632h = invitation.m2654g();
        String i = invitation.m2651d().m2678i();
        Object obj = null;
        ArrayList i2 = invitation.m2648i();
        int size = i2.size();
        this.f1631g = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            Participant participant = (Participant) i2.get(i3);
            if (participant.m2678i().equals(i)) {
                obj = participant;
            }
            this.f1631g.add((ParticipantEntity) participant.m2413a());
        }
        C0394do.m3688a(obj, (Object) "Must have a valid inviter!");
        this.f1630f = (ParticipantEntity) obj.m2413a();
    }

    static int m2655a(Invitation invitation) {
        return dl.m3683a(invitation.m2649b(), invitation.m2650c(), Long.valueOf(invitation.m2652e()), Integer.valueOf(invitation.m2653f()), invitation.m2651d(), invitation.m2648i(), Integer.valueOf(invitation.m2654g()));
    }

    static boolean m2656a(Invitation invitation, Object obj) {
        if (!(obj instanceof Invitation)) {
            return false;
        }
        if (invitation == obj) {
            return true;
        }
        Invitation invitation2 = (Invitation) obj;
        return dl.m3685a(invitation2.m2649b(), invitation.m2649b()) && dl.m3685a(invitation2.m2650c(), invitation.m2650c()) && dl.m3685a(Long.valueOf(invitation2.m2652e()), Long.valueOf(invitation.m2652e())) && dl.m3685a(Integer.valueOf(invitation2.m2653f()), Integer.valueOf(invitation.m2653f())) && dl.m3685a(invitation2.m2651d(), invitation.m2651d()) && dl.m3685a(invitation2.m2648i(), invitation.m2648i()) && dl.m3685a(Integer.valueOf(invitation2.m2654g()), Integer.valueOf(invitation.m2654g()));
    }

    static String m2659b(Invitation invitation) {
        return dl.m3684a((Object) invitation).m3686a("Game", invitation.m2649b()).m3686a("InvitationId", invitation.m2650c()).m3686a("CreationTimestamp", Long.valueOf(invitation.m2652e())).m3686a("InvitationType", Integer.valueOf(invitation.m2653f())).m3686a("Inviter", invitation.m2651d()).m3686a("Participants", invitation.m2648i()).m3686a("Variant", Integer.valueOf(invitation.m2654g())).toString();
    }

    public /* synthetic */ Object m2661a() {
        return m2670j();
    }

    public Game m2662b() {
        return this.f1626b;
    }

    public String m2663c() {
        return this.f1627c;
    }

    public Participant m2664d() {
        return this.f1630f;
    }

    public int describeContents() {
        return 0;
    }

    public long m2665e() {
        return this.f1628d;
    }

    public boolean equals(Object obj) {
        return m2656a(this, obj);
    }

    public int m2666f() {
        return this.f1629e;
    }

    public int m2667g() {
        return this.f1632h;
    }

    public int m2668h() {
        return this.f1625a;
    }

    public int hashCode() {
        return m2655a((Invitation) this);
    }

    public ArrayList m2669i() {
        return new ArrayList(this.f1631g);
    }

    public Invitation m2670j() {
        return this;
    }

    public String toString() {
        return m2659b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (m2560v()) {
            this.f1626b.writeToParcel(parcel, i);
            parcel.writeString(this.f1627c);
            parcel.writeLong(this.f1628d);
            parcel.writeInt(this.f1629e);
            this.f1630f.writeToParcel(parcel, i);
            int size = this.f1631g.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                ((ParticipantEntity) this.f1631g.get(i2)).writeToParcel(parcel, i);
            }
            return;
        }
        C0353f.m2698a(this, parcel, i);
    }
}
