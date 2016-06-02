package com.google.tagmanager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;

/* renamed from: com.google.tagmanager.p */
class C0548p {
    @SuppressLint({"CommitPrefEdits"})
    static void m4839a(Context context, String str, String str2, String str3) {
        Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putString(str2, str3);
        C0548p.m4840a(edit);
    }

    static void m4840a(Editor editor) {
        if (VERSION.SDK_INT >= 9) {
            editor.apply();
        } else {
            new Thread(new C0549q(editor)).start();
        }
    }
}
