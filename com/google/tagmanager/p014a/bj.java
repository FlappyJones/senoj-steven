package com.google.tagmanager.p014a;

import com.google.android.gms.C0338e;

/* renamed from: com.google.tagmanager.a.bj */
final class bj {
    private static int m4686a(int i) {
        return i > -12 ? -1 : i;
    }

    private static int m4687a(int i, int i2) {
        return (i > -12 || i2 > -65) ? -1 : (i2 << 8) ^ i;
    }

    private static int m4688a(int i, int i2, int i3) {
        return (i > -12 || i2 > -65 || i3 > -65) ? -1 : ((i2 << 8) ^ i) ^ (i3 << 16);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m4689a(int r7, byte[] r8, int r9, int r10) {
        /*
        r3 = -32;
        r4 = -96;
        r1 = -1;
        r6 = -65;
        if (r7 == 0) goto L_0x0082;
    L_0x0009:
        if (r9 < r10) goto L_0x000c;
    L_0x000b:
        return r7;
    L_0x000c:
        r5 = (byte) r7;
        if (r5 >= r3) goto L_0x001b;
    L_0x000f:
        r0 = -62;
        if (r5 < r0) goto L_0x0019;
    L_0x0013:
        r0 = r9 + 1;
        r2 = r8[r9];
        if (r2 <= r6) goto L_0x0081;
    L_0x0019:
        r7 = r1;
        goto L_0x000b;
    L_0x001b:
        r0 = -16;
        if (r5 >= r0) goto L_0x0046;
    L_0x001f:
        r0 = r7 >> 8;
        r0 = r0 ^ -1;
        r0 = (byte) r0;
        if (r0 != 0) goto L_0x0031;
    L_0x0026:
        r2 = r9 + 1;
        r0 = r8[r9];
        if (r2 < r10) goto L_0x0032;
    L_0x002c:
        r7 = com.google.tagmanager.p014a.bj.m4687a(r5, r0);
        goto L_0x000b;
    L_0x0031:
        r2 = r9;
    L_0x0032:
        if (r0 > r6) goto L_0x0044;
    L_0x0034:
        if (r5 != r3) goto L_0x0038;
    L_0x0036:
        if (r0 < r4) goto L_0x0044;
    L_0x0038:
        r3 = -19;
        if (r5 != r3) goto L_0x003e;
    L_0x003c:
        if (r0 >= r4) goto L_0x0044;
    L_0x003e:
        r9 = r2 + 1;
        r0 = r8[r2];
        if (r0 <= r6) goto L_0x0082;
    L_0x0044:
        r7 = r1;
        goto L_0x000b;
    L_0x0046:
        r0 = r7 >> 8;
        r0 = r0 ^ -1;
        r2 = (byte) r0;
        r0 = 0;
        if (r2 != 0) goto L_0x0059;
    L_0x004e:
        r3 = r9 + 1;
        r2 = r8[r9];
        if (r3 < r10) goto L_0x0087;
    L_0x0054:
        r7 = com.google.tagmanager.p014a.bj.m4687a(r5, r2);
        goto L_0x000b;
    L_0x0059:
        r0 = r7 >> 16;
        r0 = (byte) r0;
        r4 = r2;
        r3 = r9;
    L_0x005e:
        if (r0 != 0) goto L_0x006b;
    L_0x0060:
        r2 = r3 + 1;
        r0 = r8[r3];
        if (r2 < r10) goto L_0x006c;
    L_0x0066:
        r7 = com.google.tagmanager.p014a.bj.m4688a(r5, r4, r0);
        goto L_0x000b;
    L_0x006b:
        r2 = r3;
    L_0x006c:
        if (r4 > r6) goto L_0x007f;
    L_0x006e:
        r3 = r5 << 28;
        r4 = r4 + 112;
        r3 = r3 + r4;
        r3 = r3 >> 30;
        if (r3 != 0) goto L_0x007f;
    L_0x0077:
        if (r0 > r6) goto L_0x007f;
    L_0x0079:
        r9 = r2 + 1;
        r0 = r8[r2];
        if (r0 <= r6) goto L_0x0082;
    L_0x007f:
        r7 = r1;
        goto L_0x000b;
    L_0x0081:
        r9 = r0;
    L_0x0082:
        r7 = com.google.tagmanager.p014a.bj.m4692b(r8, r9, r10);
        goto L_0x000b;
    L_0x0087:
        r4 = r2;
        goto L_0x005e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.tagmanager.a.bj.a(int, byte[], int, int):int");
    }

    public static boolean m4690a(byte[] bArr) {
        return bj.m4691a(bArr, 0, bArr.length);
    }

    public static boolean m4691a(byte[] bArr, int i, int i2) {
        return bj.m4692b(bArr, i, i2) == 0;
    }

    public static int m4692b(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= null) {
            i++;
        }
        return i >= i2 ? 0 : bj.m4693c(bArr, i, i2);
    }

    private static int m4693c(byte[] bArr, int i, int i2) {
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < null) {
                int i4;
                if (b < (byte) -32) {
                    if (i3 >= i2) {
                        return b;
                    }
                    if (b >= -62) {
                        i4 = i3 + 1;
                        if (bArr[i3] > (byte) -65) {
                        }
                    }
                    return -1;
                } else if (b < -16) {
                    if (i3 >= i2 - 1) {
                        return bj.m4694d(bArr, i3, i2);
                    }
                    r3 = i3 + 1;
                    r2 = bArr[i3];
                    if (r2 <= (byte) -65 && ((b != (byte) -32 || r2 >= (byte) -96) && (b != -19 || r2 < (byte) -96))) {
                        i4 = r3 + 1;
                        if (bArr[r3] > (byte) -65) {
                        }
                    }
                    return -1;
                } else if (i3 >= i2 - 2) {
                    return bj.m4694d(bArr, i3, i2);
                } else {
                    r3 = i3 + 1;
                    r2 = bArr[i3];
                    if (r2 <= (byte) -65 && (((b << 28) + (r2 + 112)) >> 30) == 0) {
                        i3 = r3 + 1;
                        if (bArr[r3] <= (byte) -65) {
                            i4 = i3 + 1;
                            if (bArr[i3] > (byte) -65) {
                            }
                        }
                    }
                    return -1;
                }
                i = i4;
            } else {
                i = i3;
            }
        }
        return 0;
    }

    private static int m4694d(byte[] bArr, int i, int i2) {
        int i3 = bArr[i - 1];
        switch (i2 - i) {
            case C0338e.MapAttrs_mapType /*0*/:
                return bj.m4686a(i3);
            case C0338e.MapAttrs_cameraBearing /*1*/:
                return bj.m4687a(i3, bArr[i]);
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                return bj.m4688a(i3, bArr[i], bArr[i + 1]);
            default:
                throw new AssertionError();
        }
    }
}
