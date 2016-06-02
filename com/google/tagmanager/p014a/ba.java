package com.google.tagmanager.p014a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.tagmanager.a.ba */
final class ba implements Iterator {
    ba() {
    }

    public boolean hasNext() {
        return false;
    }

    public Object next() {
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
