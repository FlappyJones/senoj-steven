package com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.ads.util.C0229g;
import java.lang.ref.WeakReference;
import java.util.Date;

class av implements Runnable {
    private final WeakReference f986a;
    private final Editor f987b;

    public av(Activity activity) {
        this(activity, null);
    }

    av(Activity activity, Editor editor) {
        this.f986a = new WeakReference(activity);
        this.f987b = editor;
    }

    private Editor m1636a(Context context) {
        return this.f987b == null ? PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext()).edit() : this.f987b;
    }

    public void run() {
        try {
            Context context = (Activity) this.f986a.get();
            if (context == null) {
                C0229g.m1832a("Activity was null while making a doritos cookie request.");
                return;
            }
            Object obj;
            Cursor query = context.getContentResolver().query(as.f982a, as.f983b, null, null, null);
            if (query == null || !query.moveToFirst() || query.getColumnNames().length <= 0) {
                C0229g.m1832a("Google+ app not installed, not storing doritos cookie");
                obj = null;
            } else {
                obj = query.getString(query.getColumnIndex(query.getColumnName(0)));
            }
            Editor a = m1636a(context);
            if (TextUtils.isEmpty(obj)) {
                a.putString("drt", "");
                a.putLong("drt_ts", 0);
            } else {
                a.putString("drt", obj);
                a.putLong("drt_ts", new Date().getTime());
            }
            a.commit();
        } catch (Throwable th) {
            C0229g.m1841d("An unknown error occurred while sending a doritos request.", th);
        }
    }
}
