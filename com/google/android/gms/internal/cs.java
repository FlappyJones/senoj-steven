package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.C0317a;
import com.google.android.gms.common.C0318c;

final class cs extends Handler {
    final /* synthetic */ cr f1937a;

    public cs(cr crVar, Looper looper) {
        this.f1937a = crVar;
        super(looper);
    }

    public void handleMessage(Message message) {
        if (message.what != 1 || this.f1937a.m3254i()) {
            synchronized (this.f1937a.f1728o) {
                this.f1937a.f1718d = false;
            }
            if (message.what == 3) {
                this.f1937a.m3242a(new C0317a(((Integer) message.obj).intValue(), null));
                return;
            } else if (message.what == 4) {
                synchronized (this.f1937a.f1721h) {
                    if (this.f1937a.f1717c && this.f1937a.m3253h() && this.f1937a.f1721h.contains(message.obj)) {
                        ((C0318c) message.obj).m2411a(this.f1937a.m3251e());
                    }
                }
                return;
            } else if (message.what == 2 && !this.f1937a.m3253h()) {
                ct ctVar = (ct) message.obj;
                ctVar.m3614a();
                ctVar.m3617c();
                return;
            } else if (message.what == 2 || message.what == 1) {
                ((ct) message.obj).m3616b();
                return;
            } else {
                Log.wtf("GmsClient", "Don't know how to handle this message.");
                return;
            }
        }
        ctVar = (ct) message.obj;
        ctVar.m3614a();
        ctVar.m3617c();
    }
}
