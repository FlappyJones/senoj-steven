package com.google.tagmanager;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.google.analytics.tracking.android.CampaignTrackingService;

public final class InstallReferrerService extends IntentService {
    CampaignTrackingService f2206a;
    Context f2207b;

    public InstallReferrerService() {
        super("InstallReferrerService");
    }

    private void m4539a(Context context, Intent intent) {
        if (this.f2206a == null) {
            this.f2206a = new CampaignTrackingService();
        }
        this.f2206a.m2376a(context, intent);
    }

    protected void onHandleIntent(Intent intent) {
        String stringExtra = intent.getStringExtra("referrer");
        Context applicationContext = this.f2207b != null ? this.f2207b : getApplicationContext();
        C0541h.m4824a(applicationContext, stringExtra);
        m4539a(applicationContext, intent);
    }
}
