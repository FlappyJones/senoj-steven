package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Command implements Parcelable {
    public static final Creator CREATOR;
    private String f1491a;
    private String f1492b;
    private String f1493c;

    static {
        CREATOR = new C0303a();
    }

    Command(Parcel parcel) {
        m2387a(parcel);
    }

    private void m2387a(Parcel parcel) {
        this.f1491a = parcel.readString();
        this.f1492b = parcel.readString();
        this.f1493c = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1491a);
        parcel.writeString(this.f1492b);
        parcel.writeString(this.f1493c);
    }
}
