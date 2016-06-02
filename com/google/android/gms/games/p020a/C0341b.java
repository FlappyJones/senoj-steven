package com.google.android.gms.games.p020a;

import com.google.android.gms.common.data.C0324d;
import com.google.android.gms.internal.C0394do;
import com.google.android.gms.internal.ao;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dn;
import java.util.HashMap;

/* renamed from: com.google.android.gms.games.a.b */
public final class C0341b {
    private static final String[] f1608a;
    private String f1609b;
    private String f1610c;
    private int f1611d;
    private HashMap f1612e;

    static {
        f1608a = new String[]{"leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest"};
    }

    public C0341b(C0324d c0324d) {
        int i = 0;
        this.f1611d = c0324d.m2430e();
        this.f1612e = new HashMap();
        int g = c0324d.m2434g();
        C0394do.m3692b(g == 3);
        while (i < g) {
            int a = c0324d.m2421a(i);
            if (i == 0) {
                this.f1609b = c0324d.m2426c("leaderboardId", i, a);
                this.f1610c = c0324d.m2426c("playerId", i, a);
            }
            if (c0324d.m2428d("hasResult", i, a)) {
                m2606a(new C0342c(c0324d.m2422a("rawScore", i, a), c0324d.m2426c("formattedScore", i, a), c0324d.m2428d("newBest", i, a)), c0324d.m2425b("timeSpan", i, a));
            }
            i++;
        }
    }

    private void m2606a(C0342c c0342c, int i) {
        this.f1612e.put(Integer.valueOf(i), c0342c);
    }

    public int m2607a() {
        return this.f1611d;
    }

    public String toString() {
        dn a = dl.m3684a((Object) this).m3686a("PlayerId", this.f1610c).m3686a("StatusCode", Integer.valueOf(this.f1611d));
        for (int i = 0; i < 3; i++) {
            C0342c c0342c = (C0342c) this.f1612e.get(Integer.valueOf(i));
            a.m3686a("TimesSpan", ao.m3101a(i));
            a.m3686a("Result", c0342c == null ? "null" : c0342c.toString());
        }
        return a.toString();
    }
}
