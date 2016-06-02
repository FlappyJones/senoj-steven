package com.google.ads;

import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.p008a.C0161e;
import com.google.ads.p008a.C0162a;
import com.google.ads.p008a.C0184w;
import com.google.ads.p008a.ac;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0229g;
import com.google.ads.util.C0237p;
import com.google.ads.util.ae;
import java.util.HashMap;

public class cd implements bu {
    private void m1749a(HashMap hashMap, String str, ae aeVar) {
        try {
            String str2 = (String) hashMap.get(str);
            if (!TextUtils.isEmpty(str2)) {
                aeVar.m1818a(Integer.valueOf(str2));
            }
        } catch (NumberFormatException e) {
            C0229g.m1832a("Could not parse \"" + str + "\" constant.");
        }
    }

    private void m1750b(HashMap hashMap, String str, ae aeVar) {
        try {
            String str2 = (String) hashMap.get(str);
            if (!TextUtils.isEmpty(str2)) {
                aeVar.m1818a(Long.valueOf(str2));
            }
        } catch (NumberFormatException e) {
            C0229g.m1832a("Could not parse \"" + str + "\" constant.");
        }
    }

    private void m1751c(HashMap hashMap, String str, ae aeVar) {
        String str2 = (String) hashMap.get(str);
        if (!TextUtils.isEmpty(str2)) {
            aeVar.m1818a(str2);
        }
    }

    public void m1752a(C0184w c0184w, HashMap hashMap, WebView webView) {
        bt h = c0184w.m1527h();
        bs bsVar = (bs) ((br) h.f1097d.m1816a()).f1077b.m1816a();
        m1751c(hashMap, "as_domains", bsVar.f1079a);
        m1751c(hashMap, "bad_ad_report_path", bsVar.f1086h);
        m1749a(hashMap, "min_hwa_banner", bsVar.f1080b);
        m1749a(hashMap, "min_hwa_activation_overlay", bsVar.f1081c);
        m1749a(hashMap, "min_hwa_overlay", bsVar.f1082d);
        m1751c(hashMap, "mraid_banner_path", bsVar.f1083e);
        m1751c(hashMap, "mraid_expanded_banner_path", bsVar.f1084f);
        m1751c(hashMap, "mraid_interstitial_path", bsVar.f1085g);
        m1750b(hashMap, "ac_max_size", bsVar.f1087i);
        m1750b(hashMap, "ac_padding", bsVar.f1088j);
        m1750b(hashMap, "ac_total_quota", bsVar.f1089k);
        m1750b(hashMap, "db_total_quota", bsVar.f1090l);
        m1750b(hashMap, "db_quota_per_origin", bsVar.f1091m);
        m1750b(hashMap, "db_quota_step_size", bsVar.f1092n);
        C0161e k = c0184w.m1530k();
        if (AdUtil.f1234a >= 11) {
            C0237p.m1855a(k.getSettings(), h);
            C0237p.m1855a(webView.getSettings(), h);
        }
        if (!((ac) h.f1100g.m1816a()).m1419a()) {
            boolean k2 = k.m1376k();
            boolean z = AdUtil.f1234a < ((Integer) bsVar.f1080b.m1817a()).intValue();
            if (!z && k2) {
                C0229g.m1832a("Re-enabling hardware acceleration for a banner after reading constants.");
                k.m1373h();
            } else if (z && !k2) {
                C0229g.m1832a("Disabling hardware acceleration for a banner after reading constants.");
                k.m1372g();
            }
        }
        C0162a c0162a = (C0162a) h.f1098e.m1816a();
        if (!(((ac) h.f1100g.m1816a()).m1421b() || c0162a == null)) {
            k2 = c0162a.m1376k();
            boolean z2 = AdUtil.f1234a < ((Integer) bsVar.f1081c.m1817a()).intValue();
            if (!z2 && k2) {
                C0229g.m1832a("Re-enabling hardware acceleration for an activation overlay after reading constants.");
                c0162a.m1373h();
            } else if (z2 && !k2) {
                C0229g.m1832a("Disabling hardware acceleration for an activation overlay after reading constants.");
                c0162a.m1372g();
            }
        }
        String str = (String) bsVar.f1079a.m1817a();
        ak akVar = (ak) h.f1112s.m1817a();
        if (!(akVar == null || TextUtils.isEmpty(str))) {
            akVar.m1607a(str);
        }
        bsVar.f1093o.m1818a(Boolean.valueOf(true));
    }
}
