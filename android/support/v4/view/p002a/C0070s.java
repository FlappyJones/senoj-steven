package android.support.v4.view.p002a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: android.support.v4.view.a.s */
final class C0070s extends AccessibilityNodeProvider {
    final /* synthetic */ C0064t f333a;

    C0070s(C0064t c0064t) {
        this.f333a = c0064t;
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        return (AccessibilityNodeInfo) this.f333a.m554a(i);
    }

    public List findAccessibilityNodeInfosByText(String str, int i) {
        return this.f333a.m555a(str, i);
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        return this.f333a.m556a(i, i2, bundle);
    }
}
