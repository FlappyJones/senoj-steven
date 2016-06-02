package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.av;
import com.google.android.gms.internal.cn;
import com.google.android.gms.internal.dl;

public final class PlayerEntity extends av implements Player {
    public static final Creator CREATOR;
    private final int f1602a;
    private final String f1603b;
    private final String f1604c;
    private final Uri f1605d;
    private final Uri f1606e;
    private final long f1607f;

    static {
        CREATOR = new C0351g();
    }

    PlayerEntity(int i, String str, String str2, Uri uri, Uri uri2, long j) {
        this.f1602a = i;
        this.f1603b = str;
        this.f1604c = str2;
        this.f1605d = uri;
        this.f1606e = uri2;
        this.f1607f = j;
    }

    public PlayerEntity(Player player) {
        boolean z = true;
        this.f1602a = 1;
        this.f1603b = player.m2586b();
        this.f1604c = player.m2587c();
        this.f1605d = player.m2588d();
        this.f1606e = player.m2589e();
        this.f1607f = player.m2590f();
        cn.m3593a(this.f1603b);
        cn.m3593a(this.f1604c);
        if (this.f1607f <= 0) {
            z = false;
        }
        cn.m3595a(z);
    }

    static int m2591a(Player player) {
        return dl.m3683a(player.m2586b(), player.m2587c(), player.m2588d(), player.m2589e(), Long.valueOf(player.m2590f()));
    }

    static boolean m2592a(Player player, Object obj) {
        if (!(obj instanceof Player)) {
            return false;
        }
        if (player == obj) {
            return true;
        }
        Player player2 = (Player) obj;
        return dl.m3685a(player2.m2586b(), player.m2586b()) && dl.m3685a(player2.m2587c(), player.m2587c()) && dl.m3685a(player2.m2588d(), player.m2588d()) && dl.m3685a(player2.m2589e(), player.m2589e()) && dl.m3685a(Long.valueOf(player2.m2590f()), Long.valueOf(player.m2590f()));
    }

    static String m2595b(Player player) {
        return dl.m3684a((Object) player).m3686a("PlayerId", player.m2586b()).m3686a("DisplayName", player.m2587c()).m3686a("IconImageUri", player.m2588d()).m3686a("HiResImageUri", player.m2589e()).m3686a("RetrievedTimestamp", Long.valueOf(player.m2590f())).toString();
    }

    public /* synthetic */ Object m2597a() {
        return m2604h();
    }

    public String m2598b() {
        return this.f1603b;
    }

    public String m2599c() {
        return this.f1604c;
    }

    public Uri m2600d() {
        return this.f1605d;
    }

    public int describeContents() {
        return 0;
    }

    public Uri m2601e() {
        return this.f1606e;
    }

    public boolean equals(Object obj) {
        return m2592a(this, obj);
    }

    public long m2602f() {
        return this.f1607f;
    }

    public int m2603g() {
        return this.f1602a;
    }

    public Player m2604h() {
        return this;
    }

    public int hashCode() {
        return m2591a((Player) this);
    }

    public String toString() {
        return m2595b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str = null;
        if (m2560v()) {
            parcel.writeString(this.f1603b);
            parcel.writeString(this.f1604c);
            parcel.writeString(this.f1605d == null ? null : this.f1605d.toString());
            if (this.f1606e != null) {
                str = this.f1606e.toString();
            }
            parcel.writeString(str);
            parcel.writeLong(this.f1607f);
            return;
        }
        C0350i.m2644a(this, parcel, i);
    }
}
