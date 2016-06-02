package com.dotgears.flappy;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import com.jam.flappyjones.R;

public class SplashScreen extends Activity {
    private static int f594a;

    static {
        f594a = 2000;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new C0149d(this), (long) f594a);
    }
}
