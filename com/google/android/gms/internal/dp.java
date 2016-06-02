package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.p019b.C0312h;
import com.google.android.gms.p019b.C0313j;
import com.google.android.gms.p019b.C0314k;

public final class dp extends C0313j {
    private static final dp f1969a;

    static {
        f1969a = new dp();
    }

    private dp() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View m3694a(Context context, int i, int i2) {
        return f1969a.m3695b(context, i, i2);
    }

    private View m3695b(Context context, int i, int i2) {
        try {
            return (View) C0312h.m2400a(((di) m2401a(context)).m3680a(C0312h.m2399a((Object) context), i, i2));
        } catch (Throwable e) {
            throw new C0314k("Could not get button with size " + i + " and color " + i2, e);
        }
    }

    public /* synthetic */ Object m3696a(IBinder iBinder) {
        return m3697b(iBinder);
    }

    public di m3697b(IBinder iBinder) {
        return dj.m3681a(iBinder);
    }
}
