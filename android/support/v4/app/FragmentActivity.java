package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.p001b.C0032l;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.C0338e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FragmentActivity extends Activity {
    final Handler f54a;
    final C0021o f55b;
    final C0011l f56c;
    boolean f57d;
    boolean f58e;
    boolean f59f;
    boolean f60g;
    boolean f61h;
    boolean f62i;
    boolean f63j;
    boolean f64k;
    C0032l f65l;
    C0031z f66m;

    public FragmentActivity() {
        this.f54a = new C0015h(this);
        this.f55b = new C0021o();
        this.f56c = new C0016i(this);
    }

    private static String m60a(View view) {
        char c = 'F';
        char c2 = '.';
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append(view.getClass().getName());
        stringBuilder.append('{');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(view)));
        stringBuilder.append(' ');
        switch (view.getVisibility()) {
            case C0338e.MapAttrs_mapType /*0*/:
                stringBuilder.append('V');
                break;
            case C0338e.MapAttrs_cameraTilt /*4*/:
                stringBuilder.append('I');
                break;
            case C0338e.MapAttrs_uiScrollGestures /*8*/:
                stringBuilder.append('G');
                break;
            default:
                stringBuilder.append('.');
                break;
        }
        stringBuilder.append(view.isFocusable() ? 'F' : '.');
        stringBuilder.append(view.isEnabled() ? 'E' : '.');
        stringBuilder.append(view.willNotDraw() ? '.' : 'D');
        stringBuilder.append(view.isHorizontalScrollBarEnabled() ? 'H' : '.');
        stringBuilder.append(view.isVerticalScrollBarEnabled() ? 'V' : '.');
        stringBuilder.append(view.isClickable() ? 'C' : '.');
        stringBuilder.append(view.isLongClickable() ? 'L' : '.');
        stringBuilder.append(' ');
        if (!view.isFocused()) {
            c = '.';
        }
        stringBuilder.append(c);
        stringBuilder.append(view.isSelected() ? 'S' : '.');
        if (view.isPressed()) {
            c2 = 'P';
        }
        stringBuilder.append(c2);
        stringBuilder.append(' ');
        stringBuilder.append(view.getLeft());
        stringBuilder.append(',');
        stringBuilder.append(view.getTop());
        stringBuilder.append('-');
        stringBuilder.append(view.getRight());
        stringBuilder.append(',');
        stringBuilder.append(view.getBottom());
        int id = view.getId();
        if (id != -1) {
            stringBuilder.append(" #");
            stringBuilder.append(Integer.toHexString(id));
            Resources resources = view.getResources();
            if (!(id == 0 || resources == null)) {
                String str;
                switch (-16777216 & id) {
                    case 16777216:
                        str = "android";
                        break;
                    case 2130706432:
                        str = "app";
                        break;
                    default:
                        try {
                            str = resources.getResourcePackageName(id);
                            break;
                        } catch (NotFoundException e) {
                            break;
                        }
                }
                String resourceTypeName = resources.getResourceTypeName(id);
                String resourceEntryName = resources.getResourceEntryName(id);
                stringBuilder.append(" ");
                stringBuilder.append(str);
                stringBuilder.append(":");
                stringBuilder.append(resourceTypeName);
                stringBuilder.append("/");
                stringBuilder.append(resourceEntryName);
            }
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    private void m61a(String str, PrintWriter printWriter, View view) {
        printWriter.print(str);
        if (view == null) {
            printWriter.println("null");
            return;
        }
        printWriter.println(m60a(view));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount > 0) {
                String str2 = str + "  ";
                for (int i = 0; i < childCount; i++) {
                    m61a(str2, printWriter, viewGroup.getChildAt(i));
                }
            }
        }
    }

    C0031z m62a(String str, boolean z, boolean z2) {
        if (this.f65l == null) {
            this.f65l = new C0032l();
        }
        C0031z c0031z = (C0031z) this.f65l.get(str);
        if (c0031z != null) {
            c0031z.m186a(this);
            return c0031z;
        } else if (!z2) {
            return c0031z;
        } else {
            c0031z = new C0031z(str, this, z);
            this.f65l.put(str, c0031z);
            return c0031z;
        }
    }

    protected void m63a() {
        this.f55b.m164m();
    }

    public void m64a(Fragment fragment) {
    }

    void m65a(String str) {
        if (this.f65l != null) {
            C0031z c0031z = (C0031z) this.f65l.get(str);
            if (c0031z != null && !c0031z.f183g) {
                c0031z.m195h();
                this.f65l.remove(str);
            }
        }
    }

    void m66a(boolean z) {
        if (!this.f60g) {
            this.f60g = true;
            this.f61h = z;
            this.f54a.removeMessages(1);
            m70d();
        }
    }

    protected boolean m67a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public Object m68b() {
        return null;
    }

    public void m69c() {
        if (VERSION.SDK_INT >= 11) {
            C0005a.m74a(this);
        } else {
            this.f62i = true;
        }
    }

    void m70d() {
        if (this.f64k) {
            this.f64k = false;
            if (this.f66m != null) {
                if (this.f61h) {
                    this.f66m.m191d();
                } else {
                    this.f66m.m190c();
                }
            }
        }
        this.f55b.m167p();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        if (VERSION.SDK_INT >= 11) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f57d);
            printWriter.print("mResumed=");
            printWriter.print(this.f58e);
            printWriter.print(" mStopped=");
            printWriter.print(this.f59f);
            printWriter.print(" mReallyStopped=");
            printWriter.println(this.f60g);
            printWriter.print(str2);
            printWriter.print("mLoadersStarted=");
            printWriter.println(this.f64k);
        } else {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f57d);
            printWriter.print("mResumed=");
            printWriter.print(this.f58e);
            printWriter.print(" mStopped=");
            printWriter.print(this.f59f);
            printWriter.print(" mReallyStopped=");
            printWriter.println(this.f60g);
            printWriter.print(str2);
            printWriter.print("mLoadersStarted=");
            printWriter.println(this.f64k);
        }
        if (this.f66m != null) {
            printWriter.print(str);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this.f66m)));
            printWriter.println(":");
            this.f66m.m187a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        this.f55b.m135a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.println("View Hierarchy:");
        m61a(str + "  ", printWriter, getWindow().getDecorView());
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        this.f55b.m160i();
        int i3 = i >> 16;
        if (i3 != 0) {
            i3--;
            if (this.f55b.f150f == null || i3 < 0 || i3 >= this.f55b.f150f.size()) {
                Log.w("FragmentActivity", "Activity result fragment index out of range: 0x" + Integer.toHexString(i));
                return;
            }
            Fragment fragment = (Fragment) this.f55b.f150f.get(i3);
            if (fragment == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for index: 0x" + Integer.toHexString(i));
                return;
            } else {
                fragment.m10a(65535 & i, i2, intent);
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        if (!this.f55b.m149c()) {
            finish();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f55b.m126a(configuration);
    }

    protected void onCreate(Bundle bundle) {
        this.f55b.m133a(this, this.f56c, null);
        if (getLayoutInflater().getFactory() == null) {
            getLayoutInflater().setFactory(this);
        }
        super.onCreate(bundle);
        C0018k c0018k = (C0018k) getLastNonConfigurationInstance();
        if (c0018k != null) {
            this.f65l = c0018k.f140e;
        }
        if (bundle != null) {
            this.f55b.m128a(bundle.getParcelable("android:support:fragments"), c0018k != null ? c0018k.f139d : null);
        }
        this.f55b.m161j();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        return VERSION.SDK_INT >= 11 ? super.onCreatePanelMenu(i, menu) | this.f55b.m138a(menu, getMenuInflater()) : true;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        int i = 0;
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return super.onCreateView(str, context, attributeSet);
        }
        String attributeValue = attributeSet.getAttributeValue(fragment, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0017j.f135a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!Fragment.m7b((Context) this, attributeValue)) {
            return super.onCreateView(str, context, attributeSet);
        }
        if (fragment != null) {
            i = fragment.getId();
        }
        if (i == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = this.f55b.m118a(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.f55b.m120a(string);
        }
        if (fragment == null && i != -1) {
            fragment = this.f55b.m118a(i);
        }
        if (C0021o.f144a) {
            Log.v("FragmentActivity", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + attributeValue + " existing=" + fragment);
        }
        if (fragment == null) {
            Fragment a = Fragment.m5a((Context) this, attributeValue);
            a.f42o = true;
            a.f50w = resourceId != 0 ? resourceId : i;
            a.f51x = i;
            a.f52y = string;
            a.f43p = true;
            a.f46s = this.f55b;
            a.m13a((Activity) this, attributeSet, a.f31d);
            this.f55b.m132a(a, true);
            fragment = a;
        } else if (fragment.f43p) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i) + " with another fragment for " + attributeValue);
        } else {
            fragment.f43p = true;
            if (!fragment.f15C) {
                fragment.m13a((Activity) this, attributeSet, fragment.f31d);
            }
            this.f55b.m141b(fragment);
        }
        if (fragment.f21I == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            fragment.f21I.setId(resourceId);
        }
        if (fragment.f21I.getTag() == null) {
            fragment.f21I.setTag(string);
        }
        return fragment.f21I;
    }

    protected void onDestroy() {
        super.onDestroy();
        m66a(false);
        this.f55b.m169r();
        if (this.f66m != null) {
            this.f66m.m195h();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 5 || i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        onBackPressed();
        return true;
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f55b.m170s();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        switch (i) {
            case C0338e.MapAttrs_mapType /*0*/:
                return this.f55b.m139a(menuItem);
            case C0338e.MapAttrs_uiCompass /*6*/:
                return this.f55b.m146b(menuItem);
            default:
                return false;
        }
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f55b.m160i();
    }

    public void onPanelClosed(int i, Menu menu) {
        switch (i) {
            case C0338e.MapAttrs_mapType /*0*/:
                this.f55b.m144b(menu);
                break;
        }
        super.onPanelClosed(i, menu);
    }

    protected void onPause() {
        super.onPause();
        this.f58e = false;
        if (this.f54a.hasMessages(2)) {
            this.f54a.removeMessages(2);
            m63a();
        }
        this.f55b.m165n();
    }

    protected void onPostResume() {
        super.onPostResume();
        this.f54a.removeMessages(2);
        m63a();
        this.f55b.m155e();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0 || menu == null) {
            return super.onPreparePanel(i, view, menu);
        }
        if (this.f62i) {
            this.f62i = false;
            menu.clear();
            onCreatePanelMenu(i, menu);
        }
        return m67a(view, menu) | this.f55b.m137a(menu);
    }

    protected void onResume() {
        super.onResume();
        this.f54a.sendEmptyMessage(2);
        this.f58e = true;
        this.f55b.m155e();
    }

    public final Object onRetainNonConfigurationInstance() {
        int i = 0;
        if (this.f59f) {
            m66a(true);
        }
        Object b = m68b();
        ArrayList g = this.f55b.m158g();
        int i2;
        if (this.f65l != null) {
            int size = this.f65l.size();
            C0031z[] c0031zArr = new C0031z[size];
            for (int i3 = size - 1; i3 >= 0; i3--) {
                c0031zArr[i3] = (C0031z) this.f65l.m204c(i3);
            }
            i2 = 0;
            while (i < size) {
                C0031z c0031z = c0031zArr[i];
                if (c0031z.f183g) {
                    i2 = true;
                } else {
                    c0031z.m195h();
                    this.f65l.remove(c0031z.f180d);
                }
                i++;
            }
        } else {
            i2 = 0;
        }
        if (g == null && r0 == 0 && b == null) {
            return null;
        }
        C0018k c0018k = new C0018k();
        c0018k.f136a = null;
        c0018k.f137b = b;
        c0018k.f138c = null;
        c0018k.f139d = g;
        c0018k.f140e = this.f65l;
        return c0018k;
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Parcelable h = this.f55b.m159h();
        if (h != null) {
            bundle.putParcelable("android:support:fragments", h);
        }
    }

    protected void onStart() {
        super.onStart();
        this.f59f = false;
        this.f60g = false;
        this.f54a.removeMessages(1);
        if (!this.f57d) {
            this.f57d = true;
            this.f55b.m162k();
        }
        this.f55b.m160i();
        this.f55b.m155e();
        if (!this.f64k) {
            this.f64k = true;
            if (this.f66m != null) {
                this.f66m.m189b();
            } else if (!this.f63j) {
                this.f66m = m62a("(root)", this.f64k, false);
                if (!(this.f66m == null || this.f66m.f182f)) {
                    this.f66m.m189b();
                }
            }
            this.f63j = true;
        }
        this.f55b.m163l();
        if (this.f65l != null) {
            int size = this.f65l.size();
            C0031z[] c0031zArr = new C0031z[size];
            for (int i = size - 1; i >= 0; i--) {
                c0031zArr[i] = (C0031z) this.f65l.m204c(i);
            }
            for (int i2 = 0; i2 < size; i2++) {
                C0031z c0031z = c0031zArr[i2];
                c0031z.m192e();
                c0031z.m194g();
            }
        }
    }

    protected void onStop() {
        super.onStop();
        this.f59f = true;
        this.f54a.sendEmptyMessage(1);
        this.f55b.m166o();
    }

    public void startActivityForResult(Intent intent, int i) {
        if (i == -1 || (-65536 & i) == 0) {
            super.startActivityForResult(intent, i);
            return;
        }
        throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }
}
