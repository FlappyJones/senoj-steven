package com.google.ads;

import com.google.ads.util.aa;
import com.google.ads.util.ae;

public final class bs extends aa {
    public final ae f1079a;
    public final ae f1080b;
    public final ae f1081c;
    public final ae f1082d;
    public final ae f1083e;
    public final ae f1084f;
    public final ae f1085g;
    public final ae f1086h;
    public final ae f1087i;
    public final ae f1088j;
    public final ae f1089k;
    public final ae f1090l;
    public final ae f1091m;
    public final ae f1092n;
    public final ae f1093o;

    public bs() {
        this.f1079a = new ae(this, "ASDomains", null);
        this.f1080b = new ae(this, "minHwAccelerationVersionBanner", Integer.valueOf(18));
        this.f1081c = new ae(this, "minHwAccelerationVersionOverlay", Integer.valueOf(18));
        this.f1082d = new ae(this, "minHwAccelerationVersionOverlay", Integer.valueOf(14));
        this.f1083e = new ae(this, "mraidBannerPath", "http://media.admob.com/mraid/v1/mraid_app_banner.js");
        this.f1084f = new ae(this, "mraidExpandedBannerPath", "http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js");
        this.f1085g = new ae(this, "mraidInterstitialPath", "http://media.admob.com/mraid/v1/mraid_app_interstitial.js");
        this.f1086h = new ae(this, "badAdReportPath", "https://badad.googleplex.com/s/reportAd");
        this.f1087i = new ae(this, "appCacheMaxSize", Long.valueOf(0));
        this.f1088j = new ae(this, "appCacheMaxSizePaddingInBytes", Long.valueOf(131072));
        this.f1089k = new ae(this, "maxTotalAppCacheQuotaInBytes", Long.valueOf(5242880));
        this.f1090l = new ae(this, "maxTotalDatabaseQuotaInBytes", Long.valueOf(5242880));
        this.f1091m = new ae(this, "maxDatabaseQuotaPerOriginInBytes", Long.valueOf(1048576));
        this.f1092n = new ae(this, "databaseQuotaIncreaseStepInBytes", Long.valueOf(131072));
        this.f1093o = new ae(this, "isInitialized", Boolean.valueOf(false));
    }
}
