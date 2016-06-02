package com.google.ads;

import java.nio.ByteBuffer;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class am {
    static void m1609a(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] ^ 68);
        }
    }

    public static byte[] m1610a(String str) {
        byte[] a = aq.m1627a(str);
        if (a.length != 32) {
            throw new an();
        }
        byte[] bArr = new byte[16];
        ByteBuffer.wrap(a, 4, 16).get(bArr);
        m1609a(bArr);
        return bArr;
    }

    public static byte[] m1611a(byte[] bArr, String str) {
        if (bArr.length != 16) {
            throw new an();
        }
        try {
            byte[] a = aq.m1627a(str);
            if (a.length <= 16) {
                throw new an();
            }
            ByteBuffer allocate = ByteBuffer.allocate(a.length);
            allocate.put(a);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            a = new byte[(a.length - 16)];
            allocate.get(bArr2);
            allocate.get(a);
            Key secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, secretKeySpec, new IvParameterSpec(bArr2));
            return instance.doFinal(a);
        } catch (Throwable e) {
            throw new an(e);
        } catch (Throwable e2) {
            throw new an(e2);
        } catch (Throwable e22) {
            throw new an(e22);
        } catch (Throwable e222) {
            throw new an(e222);
        } catch (Throwable e2222) {
            throw new an(e2222);
        } catch (Throwable e22222) {
            throw new an(e22222);
        }
    }
}
