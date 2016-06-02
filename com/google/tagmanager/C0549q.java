package com.google.tagmanager;

import android.content.SharedPreferences.Editor;

/* renamed from: com.google.tagmanager.q */
final class C0549q implements Runnable {
    final /* synthetic */ Editor f2391a;

    C0549q(Editor editor) {
        this.f2391a = editor;
    }

    public void run() {
        this.f2391a.commit();
    }
}
