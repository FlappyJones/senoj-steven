package com.google.ads;

import android.content.Context;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0229g;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.google.ads.o */
public class C0216o implements Runnable {
    private final Context f1177a;
    private final String f1178b;

    public C0216o(String str, Context context) {
        this.f1178b = str;
        this.f1177a = context;
    }

    protected HttpURLConnection m1779a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    public void run() {
        HttpURLConnection a;
        try {
            C0229g.m1832a("Pinging URL: " + this.f1178b);
            a = m1779a(new URL(this.f1178b));
            AdUtil.m1794a(a, this.f1177a);
            a.setInstanceFollowRedirects(true);
            a.connect();
            int responseCode = a.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                C0229g.m1842e("Did not receive 2XX (got " + responseCode + ") from pinging URL: " + this.f1178b);
            }
            a.disconnect();
        } catch (Throwable th) {
            C0229g.m1841d("Unable to ping the URL: " + this.f1178b, th);
        }
    }
}
