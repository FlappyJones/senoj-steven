package com.google.ads.p008a;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0229g;

/* renamed from: com.google.ads.a.f */
class C0166f implements DownloadListener {
    final /* synthetic */ C0161e f856a;

    C0166f(C0161e c0161e) {
        this.f856a = c0161e;
    }

    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            Context i = this.f856a.m1374i();
            if (i != null && AdUtil.m1798a(intent, i)) {
                i.startActivity(intent);
            }
        } catch (ActivityNotFoundException e) {
            C0229g.m1832a("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
        } catch (Throwable th) {
            C0229g.m1837b("Unknown error trying to start activity to view URL: " + str, th);
        }
    }
}
