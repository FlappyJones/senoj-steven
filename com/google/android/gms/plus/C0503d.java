package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.google.android.gms.plus.d */
public class C0503d implements OnClickListener, C0502e {
    final /* synthetic */ PlusOneButton f2175a;
    private final C0502e f2176b;

    public C0503d(PlusOneButton plusOneButton, C0502e c0502e) {
        this.f2175a = plusOneButton;
        this.f2176b = c0502e;
    }

    public void m4489a(Intent intent) {
        Context context = this.f2175a.getContext();
        if ((context instanceof Activity) && intent != null) {
            ((Activity) context).startActivityForResult(intent, this.f2175a.f2148e);
        }
    }

    public void onClick(View view) {
        Intent intent = (Intent) this.f2175a.f2144a.getTag();
        if (this.f2176b != null) {
            this.f2176b.m4488a(intent);
        } else {
            m4489a(intent);
        }
    }
}
