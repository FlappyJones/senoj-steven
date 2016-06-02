package com.google.example.games.basegameutils;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public abstract class BaseGameActivity extends FragmentActivity implements C0128b {
    protected C0511a f2180n;
    protected int f2181o;
    protected String f2182p;
    protected boolean f2183q;
    private String[] f2184r;

    protected BaseGameActivity() {
        this.f2181o = 1;
        this.f2182p = "BaseGameActivity";
        this.f2183q = false;
        this.f2180n = new C0511a(this);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f2180n.m4507a(i, i2, intent);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2180n = new C0511a(this);
        if (this.f2183q) {
            this.f2180n.m4516a(this.f2183q, this.f2182p);
        }
        this.f2180n.m4511a((C0128b) this, this.f2181o, this.f2184r);
    }

    protected void onStart() {
        super.onStart();
        this.f2180n.m4508a((Activity) this);
    }

    protected void onStop() {
        super.onStop();
        this.f2180n.m4522d();
    }
}
