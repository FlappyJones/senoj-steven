package com.google.android.gms.common.images;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class ImageManager {
    private static final Object f1548a;
    private static HashSet f1549b;
    private final Context f1550c;
    private final Handler f1551d;
    private final ExecutorService f1552e;
    private final C0329b f1553f;
    private final Map f1554g;
    private final Map f1555h;

    final class ImageReceiver extends ResultReceiver {
        boolean f1544a;
        final /* synthetic */ ImageManager f1545b;
        private final Uri f1546c;
        private final ArrayList f1547d;

        public void onReceiveResult(int i, Bundle bundle) {
            this.f1545b.f1552e.execute(new C0330c(this.f1545b, this.f1546c, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }

    static {
        f1548a = new Object();
        f1549b = new HashSet();
    }
}
