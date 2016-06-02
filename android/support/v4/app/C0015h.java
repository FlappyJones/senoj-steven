package android.support.v4.app;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.C0338e;

/* renamed from: android.support.v4.app.h */
class C0015h extends Handler {
    final /* synthetic */ FragmentActivity f133a;

    C0015h(FragmentActivity fragmentActivity) {
        this.f133a = fragmentActivity;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case C0338e.MapAttrs_cameraBearing /*1*/:
                if (this.f133a.f59f) {
                    this.f133a.m66a(false);
                }
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                this.f133a.m63a();
                this.f133a.f55b.m155e();
            default:
                super.handleMessage(message);
        }
    }
}
