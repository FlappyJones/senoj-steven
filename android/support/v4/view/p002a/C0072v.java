package android.support.v4.view.p002a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: android.support.v4.view.a.v */
final class C0072v extends AccessibilityNodeProvider {
    final /* synthetic */ C0067w f334a;

    C0072v(C0067w c0067w) {
        this.f334a = c0067w;
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        return (AccessibilityNodeInfo) this.f334a.m561a(i);
    }

    public List findAccessibilityNodeInfosByText(String str, int i) {
        return this.f334a.m562a(str, i);
    }

    public AccessibilityNodeInfo findFocus(int i) {
        return (AccessibilityNodeInfo) this.f334a.m564b(i);
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        return this.f334a.m563a(i, i2, bundle);
    }
}
