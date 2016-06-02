package com.google.ads;

/* renamed from: com.google.ads.e */
public enum C0206e {
    INVALID_REQUEST("Invalid Ad request."),
    NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
    NETWORK_ERROR("A network error occurred."),
    INTERNAL_ERROR("There was an internal error.");
    
    private final String f1154e;

    private C0206e(String str) {
        this.f1154e = str;
    }

    public String toString() {
        return this.f1154e;
    }
}
