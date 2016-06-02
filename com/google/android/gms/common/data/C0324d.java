package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C0394do;
import java.util.HashMap;

/* renamed from: com.google.android.gms.common.data.d */
public final class C0324d implements SafeParcelable {
    public static final C0325f CREATOR;
    private static final HashMap f1519e;
    private static final Object f1520f;
    private static final C0322e f1521l;
    Bundle f1522a;
    int[] f1523b;
    int f1524c;
    boolean f1525d;
    private final int f1526g;
    private final String[] f1527h;
    private final CursorWindow[] f1528i;
    private final int f1529j;
    private final Bundle f1530k;

    static {
        CREATOR = new C0325f();
        f1519e = (HashMap) null;
        f1520f = new Object();
        f1521l = new C0323c(new String[0], null);
    }

    C0324d(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f1525d = false;
        this.f1526g = i;
        this.f1527h = strArr;
        this.f1528i = cursorWindowArr;
        this.f1529j = i2;
        this.f1530k = bundle;
    }

    private void m2420a(String str, int i) {
        if (this.f1522a == null || !this.f1522a.containsKey(str)) {
            throw new IllegalArgumentException("No such column: " + str);
        } else if (m2435h()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i < 0 || i >= this.f1524c) {
            throw new CursorIndexOutOfBoundsException(i, this.f1524c);
        }
    }

    public int m2421a(int i) {
        int i2 = 0;
        boolean z = i >= 0 && i < this.f1524c;
        C0394do.m3689a(z);
        while (i2 < this.f1523b.length) {
            if (i < this.f1523b[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == this.f1523b.length ? i2 - 1 : i2;
    }

    public long m2422a(String str, int i, int i2) {
        m2420a(str, i);
        return this.f1528i[i2].getLong(i - this.f1523b[i2], this.f1522a.getInt(str));
    }

    public void m2423a() {
        int i;
        int i2 = 0;
        this.f1522a = new Bundle();
        for (i = 0; i < this.f1527h.length; i++) {
            this.f1522a.putInt(this.f1527h[i], i);
        }
        this.f1523b = new int[this.f1528i.length];
        i = 0;
        while (i2 < this.f1528i.length) {
            this.f1523b[i2] = i;
            i += this.f1528i[i2].getNumRows();
            i2++;
        }
        this.f1524c = i;
    }

    int m2424b() {
        return this.f1526g;
    }

    public int m2425b(String str, int i, int i2) {
        m2420a(str, i);
        return this.f1528i[i2].getInt(i - this.f1523b[i2], this.f1522a.getInt(str));
    }

    public String m2426c(String str, int i, int i2) {
        m2420a(str, i);
        return this.f1528i[i2].getString(i - this.f1523b[i2], this.f1522a.getInt(str));
    }

    String[] m2427c() {
        return this.f1527h;
    }

    public boolean m2428d(String str, int i, int i2) {
        m2420a(str, i);
        return Long.valueOf(this.f1528i[i2].getLong(i - this.f1523b[i2], this.f1522a.getInt(str))).longValue() == 1;
    }

    CursorWindow[] m2429d() {
        return this.f1528i;
    }

    public int describeContents() {
        return 0;
    }

    public int m2430e() {
        return this.f1529j;
    }

    public Uri m2431e(String str, int i, int i2) {
        String c = m2426c(str, i, i2);
        return c == null ? null : Uri.parse(c);
    }

    public Bundle m2432f() {
        return this.f1530k;
    }

    public boolean m2433f(String str, int i, int i2) {
        m2420a(str, i);
        return this.f1528i[i2].isNull(i - this.f1523b[i2], this.f1522a.getInt(str));
    }

    public int m2434g() {
        return this.f1524c;
    }

    public boolean m2435h() {
        boolean z;
        synchronized (this) {
            z = this.f1525d;
        }
        return z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0325f.m2436a(this, parcel, i);
    }
}
