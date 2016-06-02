package com.dotgears.flappy;

import android.content.Intent;
import com.dotgears.GameActivity;

/* renamed from: com.dotgears.flappy.d */
class C0149d implements Runnable {
    final /* synthetic */ SplashScreen f670a;

    C0149d(SplashScreen splashScreen) {
        this.f670a = splashScreen;
    }

    public void run() {
        this.f670a.startActivity(new Intent(this.f670a, GameActivity.class));
        this.f670a.finish();
    }
}
