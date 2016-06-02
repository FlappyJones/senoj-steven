package com.google.tagmanager.p014a;

import java.util.List;

/* renamed from: com.google.tagmanager.a.bf */
public class bf extends RuntimeException {
    private final List f2265a;

    public bf(am amVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f2265a = null;
    }

    public af m4676a() {
        return new af(getMessage());
    }
}
