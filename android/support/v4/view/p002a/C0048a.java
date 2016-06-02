package android.support.v4.view.p002a;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import com.google.android.gms.C0338e;

/* renamed from: android.support.v4.view.a.a */
public class C0048a {
    private static final C0051c f325a;
    private final Object f326b;

    static {
        if (VERSION.SDK_INT >= 19) {
            f325a = new C0056f();
        } else if (VERSION.SDK_INT >= 18) {
            f325a = new C0055e();
        } else if (VERSION.SDK_INT >= 16) {
            f325a = new C0054d();
        } else if (VERSION.SDK_INT >= 14) {
            f325a = new C0053b();
        } else {
            f325a = new C0052g();
        }
    }

    public C0048a(Object obj) {
        this.f326b = obj;
    }

    public static C0048a m313a(C0048a c0048a) {
        return C0048a.m314a(f325a.m378a(c0048a.f326b));
    }

    static C0048a m314a(Object obj) {
        return obj != null ? new C0048a(obj) : null;
    }

    private static String m315c(int i) {
        switch (i) {
            case C0338e.MapAttrs_cameraBearing /*1*/:
                return "ACTION_FOCUS";
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                return "ACTION_CLEAR_FOCUS";
            case C0338e.MapAttrs_cameraTilt /*4*/:
                return "ACTION_SELECT";
            case C0338e.MapAttrs_uiScrollGestures /*8*/:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    public Object m316a() {
        return this.f326b;
    }

    public void m317a(int i) {
        f325a.m379a(this.f326b, i);
    }

    public void m318a(Rect rect) {
        f325a.m380a(this.f326b, rect);
    }

    public void m319a(View view) {
        f325a.m392c(this.f326b, view);
    }

    public void m320a(CharSequence charSequence) {
        f325a.m393c(this.f326b, charSequence);
    }

    public void m321a(boolean z) {
        f325a.m394c(this.f326b, z);
    }

    public int m322b() {
        return f325a.m384b(this.f326b);
    }

    public void m323b(int i) {
        f325a.m385b(this.f326b, i);
    }

    public void m324b(Rect rect) {
        f325a.m391c(this.f326b, rect);
    }

    public void m325b(View view) {
        f325a.m381a(this.f326b, view);
    }

    public void m326b(CharSequence charSequence) {
        f325a.m382a(this.f326b, charSequence);
    }

    public void m327b(boolean z) {
        f325a.m397d(this.f326b, z);
    }

    public int m328c() {
        return f325a.m416r(this.f326b);
    }

    public void m329c(Rect rect) {
        f325a.m386b(this.f326b, rect);
    }

    public void m330c(View view) {
        f325a.m387b(this.f326b, view);
    }

    public void m331c(CharSequence charSequence) {
        f325a.m388b(this.f326b, charSequence);
    }

    public void m332c(boolean z) {
        f325a.m404h(this.f326b, z);
    }

    public void m333d(Rect rect) {
        f325a.m396d(this.f326b, rect);
    }

    public void m334d(boolean z) {
        f325a.m406i(this.f326b, z);
    }

    public boolean m335d() {
        return f325a.m403g(this.f326b);
    }

    public void m336e(boolean z) {
        f325a.m402g(this.f326b, z);
    }

    public boolean m337e() {
        return f325a.m405h(this.f326b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        C0048a c0048a = (C0048a) obj;
        return this.f326b == null ? c0048a.f326b == null : this.f326b.equals(c0048a.f326b);
    }

    public void m338f(boolean z) {
        f325a.m383a(this.f326b, z);
    }

    public boolean m339f() {
        return f325a.m409k(this.f326b);
    }

    public void m340g(boolean z) {
        f325a.m399e(this.f326b, z);
    }

    public boolean m341g() {
        return f325a.m410l(this.f326b);
    }

    public void m342h(boolean z) {
        f325a.m389b(this.f326b, z);
    }

    public boolean m343h() {
        return f325a.m417s(this.f326b);
    }

    public int hashCode() {
        return this.f326b == null ? 0 : this.f326b.hashCode();
    }

    public void m344i(boolean z) {
        f325a.m401f(this.f326b, z);
    }

    public boolean m345i() {
        return f325a.m418t(this.f326b);
    }

    public boolean m346j() {
        return f325a.m414p(this.f326b);
    }

    public boolean m347k() {
        return f325a.m407i(this.f326b);
    }

    public boolean m348l() {
        return f325a.m411m(this.f326b);
    }

    public boolean m349m() {
        return f325a.m408j(this.f326b);
    }

    public boolean m350n() {
        return f325a.m412n(this.f326b);
    }

    public boolean m351o() {
        return f325a.m413o(this.f326b);
    }

    public CharSequence m352p() {
        return f325a.m398e(this.f326b);
    }

    public CharSequence m353q() {
        return f325a.m390c(this.f326b);
    }

    public CharSequence m354r() {
        return f325a.m400f(this.f326b);
    }

    public CharSequence m355s() {
        return f325a.m395d(this.f326b);
    }

    public void m356t() {
        f325a.m415q(this.f326b);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        Rect rect = new Rect();
        m318a(rect);
        stringBuilder.append("; boundsInParent: " + rect);
        m329c(rect);
        stringBuilder.append("; boundsInScreen: " + rect);
        stringBuilder.append("; packageName: ").append(m352p());
        stringBuilder.append("; className: ").append(m353q());
        stringBuilder.append("; text: ").append(m354r());
        stringBuilder.append("; contentDescription: ").append(m355s());
        stringBuilder.append("; viewId: ").append(m357u());
        stringBuilder.append("; checkable: ").append(m335d());
        stringBuilder.append("; checked: ").append(m337e());
        stringBuilder.append("; focusable: ").append(m339f());
        stringBuilder.append("; focused: ").append(m341g());
        stringBuilder.append("; selected: ").append(m346j());
        stringBuilder.append("; clickable: ").append(m347k());
        stringBuilder.append("; longClickable: ").append(m348l());
        stringBuilder.append("; enabled: ").append(m349m());
        stringBuilder.append("; password: ").append(m350n());
        stringBuilder.append("; scrollable: " + m351o());
        stringBuilder.append("; [");
        int b = m322b();
        while (b != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(b);
            b &= numberOfTrailingZeros ^ -1;
            stringBuilder.append(C0048a.m315c(numberOfTrailingZeros));
            if (b != 0) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public String m357u() {
        return f325a.m419u(this.f326b);
    }
}
