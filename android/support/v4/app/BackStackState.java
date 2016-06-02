package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

final class BackStackState implements Parcelable {
    public static final Creator CREATOR;
    final int[] f2a;
    final int f3b;
    final int f4c;
    final String f5d;
    final int f6e;
    final int f7f;
    final CharSequence f8g;
    final int f9h;
    final CharSequence f10i;

    static {
        CREATOR = new C0010d();
    }

    public BackStackState(Parcel parcel) {
        this.f2a = parcel.createIntArray();
        this.f3b = parcel.readInt();
        this.f4c = parcel.readInt();
        this.f5d = parcel.readString();
        this.f6e = parcel.readInt();
        this.f7f = parcel.readInt();
        this.f8g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f9h = parcel.readInt();
        this.f10i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
    }

    public BackStackState(C0021o c0021o, C0008b c0008b) {
        int i = 0;
        for (C0009c c0009c = c0008b.f105b; c0009c != null; c0009c = c0009c.f123a) {
            if (c0009c.f131i != null) {
                i += c0009c.f131i.size();
            }
        }
        this.f2a = new int[(i + (c0008b.f107d * 7))];
        if (c0008b.f114k) {
            i = 0;
            for (C0009c c0009c2 = c0008b.f105b; c0009c2 != null; c0009c2 = c0009c2.f123a) {
                int i2 = i + 1;
                this.f2a[i] = c0009c2.f125c;
                int i3 = i2 + 1;
                this.f2a[i2] = c0009c2.f126d != null ? c0009c2.f126d.f33f : -1;
                int i4 = i3 + 1;
                this.f2a[i3] = c0009c2.f127e;
                i2 = i4 + 1;
                this.f2a[i4] = c0009c2.f128f;
                i4 = i2 + 1;
                this.f2a[i2] = c0009c2.f129g;
                i2 = i4 + 1;
                this.f2a[i4] = c0009c2.f130h;
                if (c0009c2.f131i != null) {
                    int size = c0009c2.f131i.size();
                    i4 = i2 + 1;
                    this.f2a[i2] = size;
                    i2 = 0;
                    while (i2 < size) {
                        i3 = i4 + 1;
                        this.f2a[i4] = ((Fragment) c0009c2.f131i.get(i2)).f33f;
                        i2++;
                        i4 = i3;
                    }
                    i = i4;
                } else {
                    i = i2 + 1;
                    this.f2a[i2] = 0;
                }
            }
            this.f3b = c0008b.f112i;
            this.f4c = c0008b.f113j;
            this.f5d = c0008b.f116m;
            this.f6e = c0008b.f118o;
            this.f7f = c0008b.f119p;
            this.f8g = c0008b.f120q;
            this.f9h = c0008b.f121r;
            this.f10i = c0008b.f122s;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public C0008b m4a(C0021o c0021o) {
        C0008b c0008b = new C0008b(c0021o);
        int i = 0;
        int i2 = 0;
        while (i2 < this.f2a.length) {
            C0009c c0009c = new C0009c();
            int i3 = i2 + 1;
            c0009c.f125c = this.f2a[i2];
            if (C0021o.f144a) {
                Log.v("FragmentManager", "Instantiate " + c0008b + " op #" + i + " base fragment #" + this.f2a[i3]);
            }
            int i4 = i3 + 1;
            i2 = this.f2a[i3];
            if (i2 >= 0) {
                c0009c.f126d = (Fragment) c0021o.f150f.get(i2);
            } else {
                c0009c.f126d = null;
            }
            i3 = i4 + 1;
            c0009c.f127e = this.f2a[i4];
            i4 = i3 + 1;
            c0009c.f128f = this.f2a[i3];
            i3 = i4 + 1;
            c0009c.f129g = this.f2a[i4];
            int i5 = i3 + 1;
            c0009c.f130h = this.f2a[i3];
            i4 = i5 + 1;
            int i6 = this.f2a[i5];
            if (i6 > 0) {
                c0009c.f131i = new ArrayList(i6);
                i3 = 0;
                while (i3 < i6) {
                    if (C0021o.f144a) {
                        Log.v("FragmentManager", "Instantiate " + c0008b + " set remove fragment #" + this.f2a[i4]);
                    }
                    i5 = i4 + 1;
                    c0009c.f131i.add((Fragment) c0021o.f150f.get(this.f2a[i4]));
                    i3++;
                    i4 = i5;
                }
            }
            c0008b.m94a(c0009c);
            i++;
            i2 = i4;
        }
        c0008b.f112i = this.f3b;
        c0008b.f113j = this.f4c;
        c0008b.f116m = this.f5d;
        c0008b.f118o = this.f6e;
        c0008b.f114k = true;
        c0008b.f119p = this.f7f;
        c0008b.f120q = this.f8g;
        c0008b.f121r = this.f9h;
        c0008b.f122s = this.f10i;
        c0008b.m93a(1);
        return c0008b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f2a);
        parcel.writeInt(this.f3b);
        parcel.writeInt(this.f4c);
        parcel.writeString(this.f5d);
        parcel.writeInt(this.f6e);
        parcel.writeInt(this.f7f);
        TextUtils.writeToParcel(this.f8g, parcel, 0);
        parcel.writeInt(this.f9h);
        TextUtils.writeToParcel(this.f10i, parcel, 0);
    }
}
