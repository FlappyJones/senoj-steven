package com.google.ads;

public class ar {
    private final byte[] f979a;
    private int f980b;
    private int f981c;

    public ar(byte[] bArr) {
        int i;
        this.f979a = new byte[256];
        for (i = 0; i < 256; i++) {
            this.f979a[i] = (byte) i;
        }
        i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            i = ((i + this.f979a[i2]) + bArr[i2 % bArr.length]) & 255;
            byte b = this.f979a[i2];
            this.f979a[i2] = this.f979a[i];
            this.f979a[i] = b;
        }
        this.f980b = 0;
        this.f981c = 0;
    }

    public void m1632a(byte[] bArr) {
        int i = this.f980b;
        int i2 = this.f981c;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & 255;
            i2 = (i2 + this.f979a[i]) & 255;
            byte b = this.f979a[i];
            this.f979a[i] = this.f979a[i2];
            this.f979a[i2] = b;
            bArr[i3] = (byte) (bArr[i3] ^ this.f979a[(this.f979a[i] + this.f979a[i2]) & 255]);
        }
        this.f980b = i;
        this.f981c = i2;
    }
}
