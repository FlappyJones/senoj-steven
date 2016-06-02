package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.util.Log;

public class cp implements OnClickListener {
    private final Activity f1928a;
    private final Intent f1929b;
    private final int f1930c;

    public cp(Activity activity, Intent intent, int i) {
        this.f1928a = activity;
        this.f1929b = intent;
        this.f1930c = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            if (this.f1929b != null) {
                this.f1928a.startActivityForResult(this.f1929b, this.f1930c);
            }
            dialogInterface.dismiss();
        } catch (ActivityNotFoundException e) {
            Log.e("SettingsRedirect", "Can't redirect to app settings for Google Play services");
        }
    }
}
