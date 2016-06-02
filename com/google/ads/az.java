package com.google.ads;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class az {
    private static az f997c;
    private final BigInteger f998a;
    private BigInteger f999b;

    static {
        f997c = null;
    }

    private az() {
        this.f999b = BigInteger.ONE;
        this.f998a = m1655d();
    }

    public static synchronized az m1653a() {
        az azVar;
        synchronized (az.class) {
            if (f997c == null) {
                f997c = new az();
            }
            azVar = f997c;
        }
        return azVar;
    }

    private static byte[] m1654a(long j) {
        return BigInteger.valueOf(j).toByteArray();
    }

    private static BigInteger m1655d() {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            UUID randomUUID = UUID.randomUUID();
            instance.update(m1654a(randomUUID.getLeastSignificantBits()));
            instance.update(m1654a(randomUUID.getMostSignificantBits()));
            Object obj = new byte[9];
            obj[0] = (byte) 0;
            System.arraycopy(instance.digest(), 0, obj, 1, 8);
            return new BigInteger(obj);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Cannot find MD5 message digest algorithm.");
        }
    }

    public synchronized BigInteger m1656b() {
        return this.f998a;
    }

    public synchronized BigInteger m1657c() {
        BigInteger bigInteger;
        bigInteger = this.f999b;
        this.f999b = this.f999b.add(BigInteger.ONE);
        return bigInteger;
    }
}
