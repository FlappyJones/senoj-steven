package com.google.ads;

import android.content.Context;
import android.net.Uri;

public class ak {
    private String f970a;
    private String f971b;
    private String[] f972c;
    private ag f973d;
    private af f974e;

    public ak(ag agVar) {
        this.f970a = "googleads.g.doubleclick.net";
        this.f971b = "/pagead/ads";
        this.f972c = new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
        this.f974e = new af();
        this.f973d = agVar;
    }

    private Uri m1604a(Uri uri, Context context, String str, boolean z) {
        try {
            if (uri.getQueryParameter("ms") != null) {
                throw new al("Query parameter already exists: ms");
            }
            return m1605a(uri, "ms", z ? this.f973d.m1578a(context, str) : this.f973d.m1577a(context));
        } catch (UnsupportedOperationException e) {
            throw new al("Provided Uri is not in a valid state");
        }
    }

    private Uri m1605a(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl");
        }
        return indexOf != -1 ? Uri.parse(new StringBuilder(uri2.substring(0, indexOf + 1)).append(str).append("=").append(str2).append("&").append(uri2.substring(indexOf + 1)).toString()) : uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    public Uri m1606a(Uri uri, Context context) {
        try {
            return m1604a(uri, context, uri.getQueryParameter("ai"), true);
        } catch (UnsupportedOperationException e) {
            throw new al("Provided Uri is not in a valid state");
        }
    }

    public void m1607a(String str) {
        this.f972c = str.split(",");
    }

    public boolean m1608a(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            String host = uri.getHost();
            for (String endsWith : this.f972c) {
                if (host.endsWith(endsWith)) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }
}
