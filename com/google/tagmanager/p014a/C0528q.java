package com.google.tagmanager.p014a;

import com.google.android.gms.C0338e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.tagmanager.a.q */
final class C0528q {
    private static final C0528q f2343d;
    private final ax f2344a;
    private boolean f2345b;
    private boolean f2346c;

    static {
        f2343d = new C0528q(true);
    }

    private C0528q() {
        this.f2346c = false;
        this.f2344a = ax.m4652a(16);
    }

    private C0528q(boolean z) {
        this.f2346c = false;
        this.f2344a = ax.m4652a(0);
        m4788c();
    }

    static int m4777a(bm bmVar, boolean z) {
        return z ? 2 : bmVar.m4699b();
    }

    public static C0528q m4778a() {
        return new C0528q();
    }

    public static Object m4779a(C0522k c0522k, bm bmVar, boolean z) {
        switch (C0529r.f2348b[bmVar.ordinal()]) {
            case C0338e.MapAttrs_cameraBearing /*1*/:
                return Double.valueOf(c0522k.m4729b());
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                return Float.valueOf(c0522k.m4730c());
            case C0338e.MapAttrs_cameraTargetLng /*3*/:
                return Long.valueOf(c0522k.m4734e());
            case C0338e.MapAttrs_cameraTilt /*4*/:
                return Long.valueOf(c0522k.m4732d());
            case C0338e.MapAttrs_cameraZoom /*5*/:
                return Integer.valueOf(c0522k.m4736f());
            case C0338e.MapAttrs_uiCompass /*6*/:
                return Long.valueOf(c0522k.m4738g());
            case C0338e.MapAttrs_uiRotateGestures /*7*/:
                return Integer.valueOf(c0522k.m4739h());
            case C0338e.MapAttrs_uiScrollGestures /*8*/:
                return Boolean.valueOf(c0522k.m4740i());
            case C0338e.MapAttrs_uiTiltGestures /*9*/:
                return z ? c0522k.m4742k() : c0522k.m4741j();
            case C0338e.MapAttrs_uiZoomControls /*10*/:
                return c0522k.m4743l();
            case C0338e.MapAttrs_uiZoomGestures /*11*/:
                return Integer.valueOf(c0522k.m4744m());
            case C0338e.MapAttrs_useViewLifecycle /*12*/:
                return Integer.valueOf(c0522k.m4746o());
            case C0338e.MapAttrs_zOrderOnTop /*13*/:
                return Long.valueOf(c0522k.m4747p());
            case 14:
                return Integer.valueOf(c0522k.m4748q());
            case 15:
                return Long.valueOf(c0522k.m4749r());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static void m4780a(bm bmVar, Object obj) {
        boolean z = false;
        if (obj == null) {
            throw new NullPointerException();
        }
        switch (C0529r.f2347a[bmVar.m4698a().ordinal()]) {
            case C0338e.MapAttrs_cameraBearing /*1*/:
                z = obj instanceof Integer;
                break;
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                z = obj instanceof Long;
                break;
            case C0338e.MapAttrs_cameraTargetLng /*3*/:
                z = obj instanceof Float;
                break;
            case C0338e.MapAttrs_cameraTilt /*4*/:
                z = obj instanceof Double;
                break;
            case C0338e.MapAttrs_cameraZoom /*5*/:
                z = obj instanceof Boolean;
                break;
            case C0338e.MapAttrs_uiCompass /*6*/:
                z = obj instanceof String;
                break;
            case C0338e.MapAttrs_uiRotateGestures /*7*/:
                if ((obj instanceof C0516h) || (obj instanceof byte[])) {
                    z = true;
                    break;
                }
            case C0338e.MapAttrs_uiScrollGestures /*8*/:
                if ((obj instanceof Integer) || (obj instanceof ad)) {
                    z = true;
                    break;
                }
            case C0338e.MapAttrs_uiTiltGestures /*9*/:
                if ((obj instanceof am) || (obj instanceof ag)) {
                    z = true;
                    break;
                }
        }
        if (!z) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    private boolean m4781a(Entry entry) {
        C0530s c0530s = (C0530s) entry.getKey();
        if (c0530s.m4794b() == br.MESSAGE) {
            if (c0530s.m4795c()) {
                for (am j : (List) entry.getValue()) {
                    if (!j.m1864j()) {
                        return false;
                    }
                }
            }
            Object value = entry.getValue();
            if (value instanceof am) {
                if (!((am) value).m1864j()) {
                    return false;
                }
            } else if (value instanceof ag) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    public static C0528q m4782b() {
        return f2343d;
    }

    private void m4783b(Entry entry) {
        Comparable comparable = (C0530s) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof ag) {
            value = ((ag) value).m4569a();
        }
        Object a;
        if (comparable.m4795c()) {
            a = m4784a((C0530s) comparable);
            if (a == null) {
                this.f2344a.m4661a(comparable, new ArrayList((List) value));
            } else {
                ((List) a).addAll((List) value);
            }
        } else if (comparable.m4794b() == br.MESSAGE) {
            a = m4784a((C0530s) comparable);
            if (a == null) {
                this.f2344a.m4661a(comparable, value);
            } else {
                this.f2344a.m4661a(comparable, a instanceof ap ? comparable.m4792a((ap) a, (ap) value) : comparable.m4791a(((am) a).m1867n(), (am) value).m1908h());
            }
        } else {
            this.f2344a.m4661a(comparable, value);
        }
    }

    public Object m4784a(C0530s c0530s) {
        Object obj = this.f2344a.get(c0530s);
        return obj instanceof ag ? ((ag) obj).m4569a() : obj;
    }

    public void m4785a(C0528q c0528q) {
        for (int i = 0; i < c0528q.f2344a.m4665c(); i++) {
            m4783b(c0528q.f2344a.m4663b(i));
        }
        for (Entry b : c0528q.f2344a.m4666d()) {
            m4783b(b);
        }
    }

    public void m4786a(C0530s c0530s, Object obj) {
        if (!c0530s.m4795c()) {
            C0528q.m4780a(c0530s.m4793a(), obj);
        } else if (obj instanceof List) {
            List<Object> arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            for (Object a : arrayList) {
                C0528q.m4780a(c0530s.m4793a(), a);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof ag) {
            this.f2346c = true;
        }
        this.f2344a.m4661a((Comparable) c0530s, obj);
    }

    public void m4787b(C0530s c0530s, Object obj) {
        if (c0530s.m4795c()) {
            List arrayList;
            C0528q.m4780a(c0530s.m4793a(), obj);
            Object a = m4784a(c0530s);
            if (a == null) {
                arrayList = new ArrayList();
                this.f2344a.m4661a((Comparable) c0530s, (Object) arrayList);
            } else {
                arrayList = (List) a;
            }
            arrayList.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public void m4788c() {
        if (!this.f2345b) {
            this.f2344a.m4662a();
            this.f2345b = true;
        }
    }

    public /* synthetic */ Object clone() {
        return m4789d();
    }

    public C0528q m4789d() {
        C0528q a = C0528q.m4778a();
        for (int i = 0; i < this.f2344a.m4665c(); i++) {
            Entry b = this.f2344a.m4663b(i);
            a.m4786a((C0530s) b.getKey(), b.getValue());
        }
        for (Entry entry : this.f2344a.m4666d()) {
            a.m4786a((C0530s) entry.getKey(), entry.getValue());
        }
        a.f2346c = this.f2346c;
        return a;
    }

    public boolean m4790e() {
        for (int i = 0; i < this.f2344a.m4665c(); i++) {
            if (!m4781a(this.f2344a.m4663b(i))) {
                return false;
            }
        }
        for (Entry a : this.f2344a.m4666d()) {
            if (!m4781a(a)) {
                return false;
            }
        }
        return true;
    }
}
