package com.google.tagmanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class PreviewActivity extends Activity {
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            C0542i.m4829c("Preview activity");
            Uri data = getIntent().getData();
            if (C0550r.m4841a((Context) this).m4843a(data)) {
                Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
                if (launchIntentForPackage != null) {
                    C0542i.m4829c("Invoke the launch activity for package name: " + getPackageName());
                    startActivity(launchIntentForPackage);
                    return;
                }
                C0542i.m4829c("No launch activity found for package name: " + getPackageName());
                return;
            }
            C0542i.m4828b("Cannot preview the app with the uri: " + data);
        } catch (Exception e) {
            C0542i.m4827a("Calling preview threw an exception: " + e.getMessage());
        }
    }
}
