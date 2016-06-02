package com.google.ads.p008a;

import android.content.Context;
import com.google.ads.br;
import com.google.ads.bs;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0229g;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.google.ads.a.ae */
public class ae implements Runnable {
    private String f835a;
    private Context f836b;

    public ae(String str, Context context) {
        this.f835a = str;
        this.f836b = context;
    }

    protected BufferedOutputStream m1429a(HttpURLConnection httpURLConnection) {
        return new BufferedOutputStream(httpURLConnection.getOutputStream());
    }

    protected HttpURLConnection m1430a(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(true);
        AdUtil.m1794a(httpURLConnection, this.f836b);
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        return httpURLConnection;
    }

    public void run() {
        HttpURLConnection a;
        try {
            a = m1430a(new URL((String) ((bs) br.m1724a().f1077b.m1816a()).f1086h.m1817a()));
            byte[] bytes = new af(this.f835a).m1431a().toString().getBytes();
            a.setFixedLengthStreamingMode(bytes.length);
            OutputStream a2 = m1429a(a);
            a2.write(bytes);
            a2.close();
            if (a.getResponseCode() != 200) {
                C0229g.m1836b("Got error response from BadAd backend: " + a.getResponseMessage());
            }
            a.disconnect();
        } catch (Throwable e) {
            C0229g.m1837b("Error reporting bad ad.", e);
        } catch (Throwable th) {
            a.disconnect();
        }
    }
}
