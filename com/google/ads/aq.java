package com.google.ads;

import com.google.android.gms.C0338e;

public final class aq {
    private static final char[] f975a;
    private static final char[] f976b;
    private static final byte[] f977c;
    private static final byte[] f978d;

    static {
        f975a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f976b = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray();
        f977c = new byte[]{(byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -5, (byte) -5, (byte) -9, (byte) -9, (byte) -5, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -5, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) 62, (byte) -9, (byte) -9, (byte) -9, (byte) 63, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 58, (byte) 59, (byte) 60, (byte) 61, (byte) -9, (byte) -9, (byte) -9, (byte) -1, (byte) -9, (byte) -9, (byte) -9, (byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9};
        f978d = new byte[]{(byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -5, (byte) -5, (byte) -9, (byte) -9, (byte) -5, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -5, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) 62, (byte) -9, (byte) -9, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 58, (byte) 59, (byte) 60, (byte) 61, (byte) -9, (byte) -9, (byte) -9, (byte) -1, (byte) -9, (byte) -9, (byte) -9, (byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) 63, (byte) -9, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9};
    }

    private static int m1624a(char[] cArr, int i, byte[] bArr, int i2, byte[] bArr2) {
        if (cArr[i + 2] == '=') {
            bArr[i2] = (byte) ((((bArr2[cArr[i]] << 24) >>> 6) | ((bArr2[cArr[i + 1]] << 24) >>> 12)) >>> 16);
            return 1;
        } else if (cArr[i + 3] == '=') {
            r0 = (((bArr2[cArr[i]] << 24) >>> 6) | ((bArr2[cArr[i + 1]] << 24) >>> 12)) | ((bArr2[cArr[i + 2]] << 24) >>> 18);
            bArr[i2] = (byte) (r0 >>> 16);
            bArr[i2 + 1] = (byte) (r0 >>> 8);
            return 2;
        } else {
            r0 = ((((bArr2[cArr[i]] << 24) >>> 6) | ((bArr2[cArr[i + 1]] << 24) >>> 12)) | ((bArr2[cArr[i + 2]] << 24) >>> 18)) | ((bArr2[cArr[i + 3]] << 24) >>> 24);
            bArr[i2] = (byte) (r0 >> 16);
            bArr[i2 + 1] = (byte) (r0 >> 8);
            bArr[i2 + 2] = (byte) r0;
            return 3;
        }
    }

    public static String m1625a(byte[] bArr, int i, int i2, char[] cArr, boolean z) {
        char[] a = m1630a(bArr, i, i2, cArr, Integer.MAX_VALUE);
        int length = a.length;
        while (!z && length > 0 && a[length - 1] == '=') {
            length--;
        }
        return new String(a, 0, length);
    }

    public static String m1626a(byte[] bArr, boolean z) {
        return m1625a(bArr, 0, bArr.length, f976b, z);
    }

    public static byte[] m1627a(String str) {
        char[] toCharArray = str.toCharArray();
        return m1628a(toCharArray, 0, toCharArray.length);
    }

    public static byte[] m1628a(char[] cArr, int i, int i2) {
        return m1629a(cArr, i, i2, f977c);
    }

    public static byte[] m1629a(char[] cArr, int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[(((i2 * 3) / 4) + 2)];
        int i3 = 0;
        char[] cArr2 = new char[4];
        Object obj = null;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            char c = cArr[i4 + i];
            char c2 = (char) (c & 127);
            byte b = bArr[c2];
            if (c2 != c || b >= -5) {
                int i6;
                if (b < -1) {
                    i6 = i3;
                } else if (c2 == '=') {
                    if (obj != null) {
                        i6 = i3;
                    } else if (i4 < 2) {
                        throw new ap("Invalid padding char found in position " + i4);
                    } else {
                        obj = 1;
                        c = (char) (cArr[(i2 - 1) + i] & 127);
                        if (c == '=' || c == '\n') {
                            i6 = i3;
                        } else {
                            throw new ap("encoded value has invalid trailing char");
                        }
                    }
                } else if (obj != null) {
                    throw new ap("Data found after trailing padding char at index " + i4);
                } else {
                    i6 = i5 + 1;
                    cArr2[i5] = c2;
                    if (i6 == 4) {
                        i6 = i3 + m1624a(cArr2, 0, bArr2, i3, bArr);
                        i5 = 0;
                    } else {
                        i5 = i6;
                        i6 = i3;
                    }
                }
                i4++;
                i3 = i6;
            } else {
                throw new ap("Bad Base64 input character at " + i4 + ": " + cArr[i4 + i] + "(decimal)");
            }
        }
        if (i5 != 0) {
            if (i5 == 1) {
                throw new ap("single trailing character at offset " + (i2 - 1));
            }
            cArr2[i5] = '=';
            i3 += m1624a(cArr2, 0, bArr2, i3, bArr);
        }
        obj = new byte[i3];
        System.arraycopy(bArr2, 0, obj, 0, i3);
        return obj;
    }

    public static char[] m1630a(byte[] bArr, int i, int i2, char[] cArr, int i3) {
        int i4 = ((i2 + 2) / 3) * 4;
        char[] cArr2 = new char[(i4 + (i4 / i3))];
        int i5 = i2 - 2;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i8 < i5) {
            i4 = (((bArr[i8 + i] << 24) >>> 8) | ((bArr[(i8 + 1) + i] << 24) >>> 16)) | ((bArr[(i8 + 2) + i] << 24) >>> 24);
            cArr2[i7] = cArr[i4 >>> 18];
            cArr2[i7 + 1] = cArr[(i4 >>> 12) & 63];
            cArr2[i7 + 2] = cArr[(i4 >>> 6) & 63];
            cArr2[i7 + 3] = cArr[i4 & 63];
            i4 = i6 + 4;
            if (i4 == i3) {
                cArr2[i7 + 4] = '\n';
                i7++;
                i4 = 0;
            }
            i8 += 3;
            i7 += 4;
            i6 = i4;
        }
        if (i8 < i2) {
            m1631a(bArr, i8 + i, i2 - i8, cArr2, i7, cArr);
            if (i6 + 4 == i3) {
                cArr2[i7 + 4] = '\n';
                i7++;
            }
            i4 = i7 + 4;
        }
        return cArr2;
    }

    private static char[] m1631a(byte[] bArr, int i, int i2, char[] cArr, int i3, char[] cArr2) {
        int i4 = 0;
        int i5 = (i2 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0) | (i2 > 0 ? (bArr[i] << 24) >>> 8 : 0);
        if (i2 > 2) {
            i4 = (bArr[i + 2] << 24) >>> 24;
        }
        i4 |= i5;
        switch (i2) {
            case C0338e.MapAttrs_cameraBearing /*1*/:
                cArr[i3] = cArr2[i4 >>> 18];
                cArr[i3 + 1] = cArr2[(i4 >>> 12) & 63];
                cArr[i3 + 2] = '=';
                cArr[i3 + 3] = '=';
                break;
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                cArr[i3] = cArr2[i4 >>> 18];
                cArr[i3 + 1] = cArr2[(i4 >>> 12) & 63];
                cArr[i3 + 2] = cArr2[(i4 >>> 6) & 63];
                cArr[i3 + 3] = '=';
                break;
            case C0338e.MapAttrs_cameraTargetLng /*3*/:
                cArr[i3] = cArr2[i4 >>> 18];
                cArr[i3 + 1] = cArr2[(i4 >>> 12) & 63];
                cArr[i3 + 2] = cArr2[(i4 >>> 6) & 63];
                cArr[i3 + 3] = cArr2[i4 & 63];
                break;
        }
        return cArr;
    }
}
