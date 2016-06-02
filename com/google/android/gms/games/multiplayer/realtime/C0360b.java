package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;

/* renamed from: com.google.android.gms.games.multiplayer.realtime.b */
public final class C0360b {
    public static Bundle m2754a(int i, int i2, long j) {
        Bundle bundle = new Bundle();
        bundle.putInt("min_automatch_players", i);
        bundle.putInt("max_automatch_players", i2);
        bundle.putLong("exclusive_bit_mask", j);
        return bundle;
    }
}
