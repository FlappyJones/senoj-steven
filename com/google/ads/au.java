package com.google.ads;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

final class au implements Runnable {
    final /* synthetic */ Context f985a;

    au(Context context) {
        this.f985a = context;
    }

    public void run() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(this.f985a.getApplicationContext()).edit();
        edit.putString("drt", "");
        edit.putLong("drt_ts", 0);
        edit.commit();
    }
}
