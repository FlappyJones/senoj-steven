package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.av;
import com.google.android.gms.internal.dl;
import java.util.ArrayList;

public final class RoomEntity extends av implements Room {
    public static final Creator CREATOR;
    private final int f1650a;
    private final String f1651b;
    private final String f1652c;
    private final long f1653d;
    private final int f1654e;
    private final String f1655f;
    private final int f1656g;
    private final Bundle f1657h;
    private final ArrayList f1658i;
    private final int f1659j;

    static {
        CREATOR = new C0363d();
    }

    RoomEntity(int i, String str, String str2, long j, int i2, String str3, int i3, Bundle bundle, ArrayList arrayList, int i4) {
        this.f1650a = i;
        this.f1651b = str;
        this.f1652c = str2;
        this.f1653d = j;
        this.f1654e = i2;
        this.f1655f = str3;
        this.f1656g = i3;
        this.f1657h = bundle;
        this.f1658i = arrayList;
        this.f1659j = i4;
    }

    public RoomEntity(Room room) {
        this.f1650a = 2;
        this.f1651b = room.m2726b();
        this.f1652c = room.m2727c();
        this.f1653d = room.m2728d();
        this.f1654e = room.m2729e();
        this.f1655f = room.m2730f();
        this.f1656g = room.m2731g();
        this.f1657h = room.m2732h();
        ArrayList i = room.m2648i();
        int size = i.size();
        this.f1658i = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f1658i.add((ParticipantEntity) ((Participant) i.get(i2)).m2413a());
        }
        this.f1659j = room.m2733j();
    }

    static int m2734a(Room room) {
        return dl.m3683a(room.m2726b(), room.m2727c(), Long.valueOf(room.m2728d()), Integer.valueOf(room.m2729e()), room.m2730f(), Integer.valueOf(room.m2731g()), room.m2732h(), room.m2648i(), Integer.valueOf(room.m2733j()));
    }

    static boolean m2735a(Room room, Object obj) {
        if (!(obj instanceof Room)) {
            return false;
        }
        if (room == obj) {
            return true;
        }
        Room room2 = (Room) obj;
        return dl.m3685a(room2.m2726b(), room.m2726b()) && dl.m3685a(room2.m2727c(), room.m2727c()) && dl.m3685a(Long.valueOf(room2.m2728d()), Long.valueOf(room.m2728d())) && dl.m3685a(Integer.valueOf(room2.m2729e()), Integer.valueOf(room.m2729e())) && dl.m3685a(room2.m2730f(), room.m2730f()) && dl.m3685a(Integer.valueOf(room2.m2731g()), Integer.valueOf(room.m2731g())) && dl.m3685a(room2.m2732h(), room.m2732h()) && dl.m3685a(room2.m2648i(), room.m2648i()) && dl.m3685a(Integer.valueOf(room2.m2733j()), Integer.valueOf(room.m2733j()));
    }

    static String m2738b(Room room) {
        return dl.m3684a((Object) room).m3686a("RoomId", room.m2726b()).m3686a("CreatorId", room.m2727c()).m3686a("CreationTimestamp", Long.valueOf(room.m2728d())).m3686a("RoomStatus", Integer.valueOf(room.m2729e())).m3686a("Description", room.m2730f()).m3686a("Variant", Integer.valueOf(room.m2731g())).m3686a("AutoMatchCriteria", room.m2732h()).m3686a("Participants", room.m2648i()).m3686a("AutoMatchWaitEstimateSeconds", Integer.valueOf(room.m2733j())).toString();
    }

    public /* synthetic */ Object m2740a() {
        return m2751l();
    }

    public String m2741b() {
        return this.f1651b;
    }

    public String m2742c() {
        return this.f1652c;
    }

    public long m2743d() {
        return this.f1653d;
    }

    public int describeContents() {
        return 0;
    }

    public int m2744e() {
        return this.f1654e;
    }

    public boolean equals(Object obj) {
        return m2735a(this, obj);
    }

    public String m2745f() {
        return this.f1655f;
    }

    public int m2746g() {
        return this.f1656g;
    }

    public Bundle m2747h() {
        return this.f1657h;
    }

    public int hashCode() {
        return m2734a((Room) this);
    }

    public ArrayList m2748i() {
        return new ArrayList(this.f1658i);
    }

    public int m2749j() {
        return this.f1659j;
    }

    public int m2750k() {
        return this.f1650a;
    }

    public Room m2751l() {
        return this;
    }

    public String toString() {
        return m2738b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (m2560v()) {
            parcel.writeString(this.f1651b);
            parcel.writeString(this.f1652c);
            parcel.writeLong(this.f1653d);
            parcel.writeInt(this.f1654e);
            parcel.writeString(this.f1655f);
            parcel.writeInt(this.f1656g);
            parcel.writeBundle(this.f1657h);
            int size = this.f1658i.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                ((ParticipantEntity) this.f1658i.get(i2)).writeToParcel(parcel, i);
            }
            return;
        }
        C0362e.m2766a(this, parcel, i);
    }
}
