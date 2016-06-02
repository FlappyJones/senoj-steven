package com.google.android.gms.internal;

import android.util.Log;

public final class db {
    private final String f1963a;

    public db(String str) {
        this.f1963a = (String) C0394do.m3687a((Object) str);
    }

    public void m3648a(String str, String str2) {
        if (m3650a(5)) {
            Log.w(str, str2);
        }
    }

    public void m3649a(String str, String str2, Throwable th) {
        if (m3650a(6)) {
            Log.e(str, str2, th);
        }
    }

    public boolean m3650a(int i) {
        return Log.isLoggable(this.f1963a, i);
    }

    public void m3651b(String str, String str2) {
        if (m3650a(6)) {
            Log.e(str, str2);
        }
    }
}
