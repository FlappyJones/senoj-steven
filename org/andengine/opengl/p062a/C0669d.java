package org.andengine.opengl.p062a;

import android.util.SparseIntArray;

/* renamed from: org.andengine.opengl.a.d */
public class C0669d {
    public final char f2678a;
    public final int f2679b;
    public final int f2680c;
    public final int f2681d;
    public final int f2682e;
    public final float f2683f;
    public final float f2684g;
    public final float f2685h;
    public final float f2686i;
    public final float f2687j;
    public final float f2688k;
    public final float f2689l;
    private final boolean f2690m;
    private SparseIntArray f2691n;

    public boolean m5239a() {
        return this.f2690m;
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
        return this.f2678a == ((C0669d) obj).f2678a;
    }

    public int hashCode() {
        return this.f2678a + 31;
    }

    public String toString() {
        return new StringBuilder(String.valueOf(getClass().getSimpleName())).append("[Character=").append(this.f2678a).append(", Whitespace=").append(this.f2690m).append(", TextureX=").append(this.f2679b).append(", TextureY=").append(this.f2680c).append(", Width=").append(this.f2681d).append(", Height=").append(this.f2682e).append(", OffsetX=").append(this.f2683f).append(", OffsetY=").append(this.f2684g).append(", Advance=").append(this.f2685h).append(", U=").append(this.f2686i).append(", V=").append(this.f2687j).append(", U2=").append(this.f2688k).append(", V2=").append(this.f2689l).append(", Kernings=").append(this.f2691n).append("]").toString();
    }
}
