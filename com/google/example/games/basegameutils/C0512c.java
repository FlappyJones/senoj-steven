package com.google.example.games.basegameutils;

/* renamed from: com.google.example.games.basegameutils.c */
public class C0512c {
    int f2204a;
    int f2205b;

    public C0512c(int i) {
        this(i, -100);
    }

    public C0512c(int i, int i2) {
        this.f2204a = 0;
        this.f2205b = -100;
        this.f2204a = i;
        this.f2205b = i2;
    }

    public int m4537a() {
        return this.f2204a;
    }

    public int m4538b() {
        return this.f2205b;
    }

    public String toString() {
        return "SignInFailureReason(serviceErrorCode:" + C0511a.m4504c(this.f2204a) + (this.f2205b == -100 ? ")" : ",activityResultCode:" + C0511a.m4503b(this.f2205b) + ")");
    }
}
