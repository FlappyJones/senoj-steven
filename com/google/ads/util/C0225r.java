package com.google.ads.util;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.ads.br;
import com.google.ads.bs;
import com.google.ads.bt;
import com.google.ads.p008a.C0161e;
import com.google.android.gms.C0338e;

/* renamed from: com.google.ads.util.r */
public class C0225r extends WebChromeClient {
    private final bt f1257a;

    public C0225r(bt btVar) {
        this.f1257a = btVar;
    }

    private static void m1820a(Builder builder, Context context, String str, String str2, JsPromptResult jsPromptResult) {
        View linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        View textView = new TextView(context);
        textView.setText(str);
        View editText = new EditText(context);
        editText.setText(str2);
        linearLayout.addView(textView);
        linearLayout.addView(editText);
        builder.setView(linearLayout).setPositiveButton(17039370, new C0244x(jsPromptResult, editText)).setNegativeButton(17039360, new C0243w(jsPromptResult)).setOnCancelListener(new C0242v(jsPromptResult)).create().show();
    }

    private static void m1821a(Builder builder, String str, JsResult jsResult) {
        builder.setMessage(str).setPositiveButton(17039370, new C0241u(jsResult)).setNegativeButton(17039360, new C0240t(jsResult)).setOnCancelListener(new C0239s(jsResult)).create().show();
    }

    private static boolean m1822a(WebView webView, String str, String str2, String str3, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        if (webView instanceof C0161e) {
            Context i = ((C0161e) webView).m1374i();
            if (i != null) {
                Builder builder = new Builder(i);
                builder.setTitle(str);
                if (z) {
                    C0225r.m1820a(builder, i, str2, str3, jsPromptResult);
                } else {
                    C0225r.m1821a(builder, str2, jsResult);
                }
                return true;
            }
        }
        return false;
    }

    public void onCloseWindow(WebView webView) {
        if (webView instanceof C0161e) {
            ((C0161e) webView).m1371f();
        }
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")";
        switch (C0238q.f1282a[consoleMessage.messageLevel().ordinal()]) {
            case C0338e.MapAttrs_cameraBearing /*1*/:
                C0229g.m1836b(str);
                break;
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                C0229g.m1842e(str);
                break;
            case C0338e.MapAttrs_cameraTargetLng /*3*/:
            case C0338e.MapAttrs_cameraTilt /*4*/:
                C0229g.m1838c(str);
                break;
            case C0338e.MapAttrs_cameraZoom /*5*/:
                C0229g.m1832a(str);
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, QuotaUpdater quotaUpdater) {
        bs bsVar = (bs) ((br) this.f1257a.f1097d.m1816a()).f1077b.m1816a();
        long longValue = ((Long) bsVar.f1090l.m1817a()).longValue() - j3;
        if (longValue <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > longValue || j2 > ((Long) bsVar.f1091m.m1817a()).longValue()) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(Math.min(((Long) bsVar.f1092n.m1817a()).longValue(), longValue) + j, ((Long) bsVar.f1091m.m1817a()).longValue());
        } else {
            if (j2 <= Math.min(((Long) bsVar.f1091m.m1817a()).longValue() - j, longValue)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return C0225r.m1822a(webView, str, str2, null, jsResult, null, false);
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return C0225r.m1822a(webView, str, str2, null, jsResult, null, false);
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return C0225r.m1822a(webView, str, str2, null, jsResult, null, false);
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return C0225r.m1822a(webView, str, str2, str3, null, jsPromptResult, true);
    }

    public void onReachedMaxAppCacheSize(long j, long j2, QuotaUpdater quotaUpdater) {
        bs bsVar = (bs) ((br) this.f1257a.f1097d.m1816a()).f1077b.m1816a();
        long longValue = ((Long) bsVar.f1088j.m1817a()).longValue() + j;
        if (((Long) bsVar.f1089k.m1817a()).longValue() - j2 < longValue) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(longValue);
        }
    }

    public void onShowCustomView(View view, CustomViewCallback customViewCallback) {
        customViewCallback.onCustomViewHidden();
    }
}
