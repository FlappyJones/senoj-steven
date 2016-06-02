package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.av;
import com.google.android.gms.internal.dl;

public final class GameEntity extends av implements Game {
    public static final Creator CREATOR;
    private final int f1586a;
    private final String f1587b;
    private final String f1588c;
    private final String f1589d;
    private final String f1590e;
    private final String f1591f;
    private final String f1592g;
    private final Uri f1593h;
    private final Uri f1594i;
    private final Uri f1595j;
    private final boolean f1596k;
    private final boolean f1597l;
    private final String f1598m;
    private final int f1599n;
    private final int f1600o;
    private final int f1601p;

    static {
        CREATOR = new C0344a();
    }

    GameEntity(int i, String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Uri uri2, Uri uri3, boolean z, boolean z2, String str7, int i2, int i3, int i4) {
        this.f1586a = i;
        this.f1587b = str;
        this.f1588c = str2;
        this.f1589d = str3;
        this.f1590e = str4;
        this.f1591f = str5;
        this.f1592g = str6;
        this.f1593h = uri;
        this.f1594i = uri2;
        this.f1595j = uri3;
        this.f1596k = z;
        this.f1597l = z2;
        this.f1598m = str7;
        this.f1599n = i2;
        this.f1600o = i3;
        this.f1601p = i4;
    }

    public GameEntity(Game game) {
        this.f1586a = 1;
        this.f1587b = game.m2541b();
        this.f1589d = game.m2543d();
        this.f1590e = game.m2544e();
        this.f1591f = game.m2545f();
        this.f1592g = game.m2546g();
        this.f1588c = game.m2542c();
        this.f1593h = game.m2547h();
        this.f1594i = game.m2548i();
        this.f1595j = game.m2549j();
        this.f1596k = game.m2550k();
        this.f1597l = game.m2551l();
        this.f1598m = game.m2552m();
        this.f1599n = game.m2553n();
        this.f1600o = game.m2554o();
        this.f1601p = game.m2555p();
    }

    static int m2562a(Game game) {
        return dl.m3683a(game.m2541b(), game.m2542c(), game.m2543d(), game.m2544e(), game.m2545f(), game.m2546g(), game.m2547h(), game.m2548i(), game.m2549j(), Boolean.valueOf(game.m2550k()), Boolean.valueOf(game.m2551l()), game.m2552m(), Integer.valueOf(game.m2553n()), Integer.valueOf(game.m2554o()), Integer.valueOf(game.m2555p()));
    }

    static boolean m2563a(Game game, Object obj) {
        if (!(obj instanceof Game)) {
            return false;
        }
        if (game == obj) {
            return true;
        }
        Game game2 = (Game) obj;
        return dl.m3685a(game2.m2541b(), game.m2541b()) && dl.m3685a(game2.m2542c(), game.m2542c()) && dl.m3685a(game2.m2543d(), game.m2543d()) && dl.m3685a(game2.m2544e(), game.m2544e()) && dl.m3685a(game2.m2545f(), game.m2545f()) && dl.m3685a(game2.m2546g(), game.m2546g()) && dl.m3685a(game2.m2547h(), game.m2547h()) && dl.m3685a(game2.m2548i(), game.m2548i()) && dl.m3685a(game2.m2549j(), game.m2549j()) && dl.m3685a(Boolean.valueOf(game2.m2550k()), Boolean.valueOf(game.m2550k())) && dl.m3685a(Boolean.valueOf(game2.m2551l()), Boolean.valueOf(game.m2551l())) && dl.m3685a(game2.m2552m(), game.m2552m()) && dl.m3685a(Integer.valueOf(game2.m2553n()), Integer.valueOf(game.m2553n())) && dl.m3685a(Integer.valueOf(game2.m2554o()), Integer.valueOf(game.m2554o())) && dl.m3685a(Integer.valueOf(game2.m2555p()), Integer.valueOf(game.m2555p()));
    }

    static String m2566b(Game game) {
        return dl.m3684a((Object) game).m3686a("ApplicationId", game.m2541b()).m3686a("DisplayName", game.m2542c()).m3686a("PrimaryCategory", game.m2543d()).m3686a("SecondaryCategory", game.m2544e()).m3686a("Description", game.m2545f()).m3686a("DeveloperName", game.m2546g()).m3686a("IconImageUri", game.m2547h()).m3686a("HiResImageUri", game.m2548i()).m3686a("FeaturedImageUri", game.m2549j()).m3686a("PlayEnabledGame", Boolean.valueOf(game.m2550k())).m3686a("InstanceInstalled", Boolean.valueOf(game.m2551l())).m3686a("InstancePackageName", game.m2552m()).m3686a("GameplayAclStatus", Integer.valueOf(game.m2553n())).m3686a("AchievementTotalCount", Integer.valueOf(game.m2554o())).m3686a("LeaderboardCount", Integer.valueOf(game.m2555p())).toString();
    }

    public /* synthetic */ Object m2568a() {
        return m2585r();
    }

    public String m2569b() {
        return this.f1587b;
    }

    public String m2570c() {
        return this.f1588c;
    }

    public String m2571d() {
        return this.f1589d;
    }

    public int describeContents() {
        return 0;
    }

    public String m2572e() {
        return this.f1590e;
    }

    public boolean equals(Object obj) {
        return m2563a(this, obj);
    }

    public String m2573f() {
        return this.f1591f;
    }

    public String m2574g() {
        return this.f1592g;
    }

    public Uri m2575h() {
        return this.f1593h;
    }

    public int hashCode() {
        return m2562a((Game) this);
    }

    public Uri m2576i() {
        return this.f1594i;
    }

    public Uri m2577j() {
        return this.f1595j;
    }

    public boolean m2578k() {
        return this.f1596k;
    }

    public boolean m2579l() {
        return this.f1597l;
    }

    public String m2580m() {
        return this.f1598m;
    }

    public int m2581n() {
        return this.f1599n;
    }

    public int m2582o() {
        return this.f1600o;
    }

    public int m2583p() {
        return this.f1601p;
    }

    public int m2584q() {
        return this.f1586a;
    }

    public Game m2585r() {
        return this;
    }

    public String toString() {
        return m2566b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 1;
        String str = null;
        if (m2560v()) {
            parcel.writeString(this.f1587b);
            parcel.writeString(this.f1588c);
            parcel.writeString(this.f1589d);
            parcel.writeString(this.f1590e);
            parcel.writeString(this.f1591f);
            parcel.writeString(this.f1592g);
            parcel.writeString(this.f1593h == null ? null : this.f1593h.toString());
            parcel.writeString(this.f1594i == null ? null : this.f1594i.toString());
            if (this.f1595j != null) {
                str = this.f1595j.toString();
            }
            parcel.writeString(str);
            parcel.writeInt(this.f1596k ? 1 : 0);
            if (!this.f1597l) {
                i2 = 0;
            }
            parcel.writeInt(i2);
            parcel.writeString(this.f1598m);
            parcel.writeInt(this.f1599n);
            parcel.writeInt(this.f1600o);
            parcel.writeInt(this.f1601p);
            return;
        }
        C0343h.m2608a(this, parcel, i);
    }
}
