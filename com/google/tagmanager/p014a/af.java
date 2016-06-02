package com.google.tagmanager.p014a;

import java.io.IOException;

/* renamed from: com.google.tagmanager.a.af */
public class af extends IOException {
    private am f2215a;

    public af(String str) {
        super(str);
        this.f2215a = null;
    }

    static af m4557b() {
        return new af("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static af m4558c() {
        return new af("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static af m4559d() {
        return new af("CodedInputStream encountered a malformed varint.");
    }

    static af m4560e() {
        return new af("Protocol message contained an invalid tag (zero).");
    }

    static af m4561f() {
        return new af("Protocol message end-group tag did not match expected tag.");
    }

    static af m4562g() {
        return new af("Protocol message tag had invalid wire type.");
    }

    static af m4563h() {
        return new af("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static af m4564i() {
        return new af("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static af m4565j() {
        return new af("Protocol message had invalid UTF-8.");
    }

    public af m4566a(am amVar) {
        this.f2215a = amVar;
        return this;
    }

    public am m4567a() {
        return this.f2215a;
    }
}
