package com.google.tagmanager.p014a;

/* renamed from: com.google.tagmanager.a.bm */
public enum bm {
    DOUBLE(br.DOUBLE, 1),
    FLOAT(br.FLOAT, 5),
    INT64(br.LONG, 0),
    UINT64(br.LONG, 0),
    INT32(br.INT, 0),
    FIXED64(br.LONG, 1),
    FIXED32(br.INT, 5),
    BOOL(br.BOOLEAN, 0),
    STRING(br.STRING, 2),
    GROUP(br.MESSAGE, 3),
    MESSAGE(br.MESSAGE, 2),
    BYTES(br.BYTE_STRING, 2),
    UINT32(br.INT, 0),
    ENUM(br.ENUM, 0),
    SFIXED32(br.INT, 5),
    SFIXED64(br.LONG, 1),
    SINT32(br.INT, 0),
    SINT64(br.LONG, 0);
    
    private final br f2295s;
    private final int f2296t;

    private bm(br brVar, int i) {
        this.f2295s = brVar;
        this.f2296t = i;
    }

    public br m4698a() {
        return this.f2295s;
    }

    public int m4699b() {
        return this.f2296t;
    }

    public boolean m4700c() {
        return true;
    }
}
