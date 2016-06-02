package com.google.ads.p011c;

import android.content.Context;
import android.graphics.Color;
import com.google.ads.C0201d;
import com.google.ads.p009b.C0189j;
import com.google.ads.p009b.p010a.C0190a;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.ads.c.a */
public class C0202a extends C0201d {
    private String f1128b;
    private int f1129c;
    private int f1130d;
    private int f1131e;
    private int f1132f;
    private int f1133g;
    private int f1134h;
    private String f1135i;
    private int f1136j;
    private int f1137k;
    private C0203b f1138l;
    private int f1139m;
    private String f1140n;

    private String m1739a(int i) {
        return String.format(Locale.US, "#%06x", new Object[]{Integer.valueOf(16777215 & i)});
    }

    public Map m1740a(Context context) {
        C0190a c0190a = (C0190a) m1735a(C0190a.class);
        if (c0190a == null) {
            c0190a = new C0190a();
            m1733a((C0189j) c0190a);
        }
        if (this.f1128b != null) {
            c0190a.m1659d().put("q", this.f1128b);
        }
        if (Color.alpha(this.f1129c) != 0) {
            c0190a.m1659d().put("bgcolor", m1739a(this.f1129c));
        }
        if (Color.alpha(this.f1130d) == 255 && Color.alpha(this.f1131e) == 255) {
            c0190a.m1659d().put("gradientfrom", m1739a(this.f1130d));
            c0190a.m1659d().put("gradientto", m1739a(this.f1131e));
        }
        if (Color.alpha(this.f1132f) != 0) {
            c0190a.m1659d().put("hcolor", m1739a(this.f1132f));
        }
        if (Color.alpha(this.f1133g) != 0) {
            c0190a.m1659d().put("dcolor", m1739a(this.f1133g));
        }
        if (Color.alpha(this.f1134h) != 0) {
            c0190a.m1659d().put("acolor", m1739a(this.f1134h));
        }
        if (this.f1135i != null) {
            c0190a.m1659d().put("font", this.f1135i);
        }
        c0190a.m1659d().put("headersize", Integer.toString(this.f1136j));
        if (Color.alpha(this.f1137k) != 0) {
            c0190a.m1659d().put("bcolor", m1739a(this.f1137k));
        }
        if (this.f1138l != null) {
            c0190a.m1659d().put("btype", this.f1138l.toString());
        }
        c0190a.m1659d().put("bthick", Integer.toString(this.f1139m));
        if (this.f1140n != null) {
            c0190a.m1659d().put("channel", this.f1140n);
        }
        return super.m1736a(context);
    }
}
