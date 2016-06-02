package com.google.android.gms.internal;

import android.content.Intent;
import android.net.Uri;

public class da {
    private static final Uri f1961a;
    private static final Uri f1962b;

    static {
        f1961a = Uri.parse("http://plus.google.com/");
        f1962b = f1961a.buildUpon().appendPath("circles").appendPath("find").build();
    }

    public static Intent m3644a(String str) {
        Uri fromParts = Uri.fromParts("package", str, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }

    public static Intent m3645b(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(m3647d(str));
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    public static Intent m3646c(String str) {
        Uri parse = Uri.parse("bazaar://search?q=pname:" + str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        intent.setFlags(524288);
        return intent;
    }

    private static Uri m3647d(String str) {
        return Uri.parse("market://details").buildUpon().appendQueryParameter("id", str).build();
    }
}
