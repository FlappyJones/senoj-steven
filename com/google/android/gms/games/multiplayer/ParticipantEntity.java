package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.av;
import com.google.android.gms.internal.dl;

public final class ParticipantEntity extends av implements Participant {
    public static final Creator CREATOR;
    private final int f1633a;
    private final String f1634b;
    private final String f1635c;
    private final Uri f1636d;
    private final Uri f1637e;
    private final int f1638f;
    private final String f1639g;
    private final boolean f1640h;
    private final PlayerEntity f1641i;
    private final int f1642j;

    static {
        CREATOR = new C0357c();
    }

    ParticipantEntity(int i, String str, String str2, Uri uri, Uri uri2, int i2, String str3, boolean z, PlayerEntity playerEntity, int i3) {
        this.f1633a = i;
        this.f1634b = str;
        this.f1635c = str2;
        this.f1636d = uri;
        this.f1637e = uri2;
        this.f1638f = i2;
        this.f1639g = str3;
        this.f1640h = z;
        this.f1641i = playerEntity;
        this.f1642j = i3;
    }

    public ParticipantEntity(Participant participant) {
        this.f1633a = 1;
        this.f1634b = participant.m2678i();
        this.f1635c = participant.m2675f();
        this.f1636d = participant.m2676g();
        this.f1637e = participant.m2677h();
        this.f1638f = participant.m2671b();
        this.f1639g = participant.m2672c();
        this.f1640h = participant.m2674e();
        Player j = participant.m2679j();
        this.f1641i = j == null ? null : new PlayerEntity(j);
        this.f1642j = participant.m2673d();
    }

    static int m2680a(Participant participant) {
        return dl.m3683a(participant.m2679j(), Integer.valueOf(participant.m2671b()), participant.m2672c(), Boolean.valueOf(participant.m2674e()), participant.m2675f(), participant.m2676g(), participant.m2677h(), Integer.valueOf(participant.m2673d()));
    }

    static boolean m2681a(Participant participant, Object obj) {
        if (!(obj instanceof Participant)) {
            return false;
        }
        if (participant == obj) {
            return true;
        }
        Participant participant2 = (Participant) obj;
        return dl.m3685a(participant2.m2679j(), participant.m2679j()) && dl.m3685a(Integer.valueOf(participant2.m2671b()), Integer.valueOf(participant.m2671b())) && dl.m3685a(participant2.m2672c(), participant.m2672c()) && dl.m3685a(Boolean.valueOf(participant2.m2674e()), Boolean.valueOf(participant.m2674e())) && dl.m3685a(participant2.m2675f(), participant.m2675f()) && dl.m3685a(participant2.m2676g(), participant.m2676g()) && dl.m3685a(participant2.m2677h(), participant.m2677h()) && dl.m3685a(Integer.valueOf(participant2.m2673d()), Integer.valueOf(participant.m2673d()));
    }

    static String m2684b(Participant participant) {
        return dl.m3684a((Object) participant).m3686a("Player", participant.m2679j()).m3686a("Status", Integer.valueOf(participant.m2671b())).m3686a("ClientAddress", participant.m2672c()).m3686a("ConnectedToRoom", Boolean.valueOf(participant.m2674e())).m3686a("DisplayName", participant.m2675f()).m3686a("IconImage", participant.m2676g()).m3686a("HiResImage", participant.m2677h()).m3686a("Capabilities", Integer.valueOf(participant.m2673d())).toString();
    }

    public /* synthetic */ Object m2686a() {
        return m2697l();
    }

    public int m2687b() {
        return this.f1638f;
    }

    public String m2688c() {
        return this.f1639g;
    }

    public int m2689d() {
        return this.f1642j;
    }

    public int describeContents() {
        return 0;
    }

    public boolean m2690e() {
        return this.f1640h;
    }

    public boolean equals(Object obj) {
        return m2681a(this, obj);
    }

    public String m2691f() {
        return this.f1641i == null ? this.f1635c : this.f1641i.m2599c();
    }

    public Uri m2692g() {
        return this.f1641i == null ? this.f1636d : this.f1641i.m2600d();
    }

    public Uri m2693h() {
        return this.f1641i == null ? this.f1637e : this.f1641i.m2601e();
    }

    public int hashCode() {
        return m2680a((Participant) this);
    }

    public String m2694i() {
        return this.f1634b;
    }

    public Player m2695j() {
        return this.f1641i;
    }

    public int m2696k() {
        return this.f1633a;
    }

    public Participant m2697l() {
        return this;
    }

    public String toString() {
        return m2684b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str = null;
        int i2 = 0;
        if (m2560v()) {
            parcel.writeString(this.f1634b);
            parcel.writeString(this.f1635c);
            parcel.writeString(this.f1636d == null ? null : this.f1636d.toString());
            if (this.f1637e != null) {
                str = this.f1637e.toString();
            }
            parcel.writeString(str);
            parcel.writeInt(this.f1638f);
            parcel.writeString(this.f1639g);
            parcel.writeInt(this.f1640h ? 1 : 0);
            if (this.f1641i != null) {
                i2 = 1;
            }
            parcel.writeInt(i2);
            if (this.f1641i != null) {
                this.f1641i.writeToParcel(parcel, i);
                return;
            }
            return;
        }
        C0356g.m2711a(this, parcel, i);
    }
}
