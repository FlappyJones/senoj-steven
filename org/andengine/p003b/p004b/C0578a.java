package org.andengine.p003b.p004b;

import org.andengine.opengl.util.C0714e;
import org.andengine.p003b.p032a.C0573a;
import org.andengine.p005d.p037a.p038a.C0577b;

/* renamed from: org.andengine.b.b.a */
public class C0578a extends C0577b implements C0131b {
    public C0578a(int i) {
        super(i);
    }

    public void m4956a(C0714e c0714e, C0573a c0573a) {
        for (int size = size() - 1; size >= 0; size--) {
            ((C0131b) get(size)).m1145a(c0714e, c0573a);
        }
    }
}
