package com.dotgears;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.ads.AdView;
import com.google.ads.C0201d;
import com.google.ads.C0208g;
import com.google.android.gms.games.C0346c;
import com.google.example.games.basegameutils.C0128b;
import com.google.example.games.basegameutils.C0511a;
import java.io.IOException;
import org.andengine.opengl.p067c.C0702f;
import org.andengine.opengl.p067c.p068a.p070a.C0691a;
import org.andengine.opengl.p067c.p068a.p070a.C0692b;
import org.andengine.opengl.p067c.p073c.C0698c;
import org.andengine.opengl.view.C0126h;
import org.andengine.opengl.view.RenderSurfaceView;
import org.andengine.p003b.C0575a;
import org.andengine.p003b.C0594e;
import org.andengine.p003b.p032a.C0573a;
import org.andengine.p003b.p039c.C0585b;
import org.andengine.p003b.p039c.C0588e;
import org.andengine.p003b.p039c.C0591h;
import org.andengine.p003b.p039c.p040a.C0583b;
import org.andengine.p006c.p007b.C0136e;
import org.andengine.p027a.p030c.C0568a;
import org.andengine.p027a.p030c.C0569b;
import org.andengine.ui.activity.BaseGameActivity;
import org.andengine.ui.activity.SimpleBaseGameActivity;

public class GameActivity extends SimpleBaseGameActivity implements C0128b {
    public AdView f479a;
    public C0568a f480b;
    public C0568a f481c;
    public C0568a f482d;
    public C0568a f483e;
    public C0568a f484f;
    protected C0511a f485g;
    protected int f486h;
    protected String f487i;
    protected boolean f488j;
    private C0573a f489m;
    private C0698c f490n;
    private String[] f491o;

    public GameActivity() {
        this.f486h = 1;
        this.f487i = "BaseGameActivity";
        this.f488j = false;
    }

    public C0575a m1128a(C0585b c0585b) {
        return new C0594e(c0585b, 60);
    }

    public C0585b m1129a() {
        this.f489m = new C0573a(0.0f, 0.0f, 288.0f, 512.0f);
        C0585b c0585b = new C0585b(true, C0588e.PORTRAIT_FIXED, new C0583b(288.0f, 512.0f), this.f489m);
        c0585b.m4969d().m4962b(true).m4960a(true);
        c0585b.m4970e().m4981a(true);
        c0585b.m4968c().m4987a(true);
        c0585b.m4965a(C0591h.SCREEN_ON);
        return c0585b;
    }

    protected void m1130b() {
        View relativeLayout = new RelativeLayout(this);
        LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.l = new RenderSurfaceView(this);
        this.l.m5440a(this.k, (C0126h) this);
        LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(BaseGameActivity.m1098B());
        layoutParams2.addRule(13);
        relativeLayout.addView(this.l, layoutParams2);
        View frameLayout = new FrameLayout(this);
        this.f479a = new AdView((Activity) this, C0208g.f1159a, "a152df006159b75");
        this.f479a.refreshDrawableState();
        frameLayout.addView(this.f479a, new FrameLayout.LayoutParams(-2, -2, 49));
        relativeLayout.addView(frameLayout);
        this.f479a.m1367a(new C0201d());
        setContentView(relativeLayout, layoutParams);
    }

    public void m1131c() {
        runOnUiThread(new C0129a(this));
    }

    public void m1132d() {
        runOnUiThread(new C0130b(this));
    }

    public void m1133e() {
        this.f480b.m4876d();
    }

    public void m1134f() {
        this.f481c.m4876d();
    }

    public void m1135g() {
        this.f482d.m4876d();
    }

    public void m1136h() {
        this.f483e.m4876d();
    }

    public void m1137i() {
        this.f484f.m4876d();
    }

    public void m1138j() {
    }

    public void m1139k() {
    }

    protected void m1140l() {
        C0692b.m5331a("gfx/");
        C0691a c0691a = new C0691a(m1119y(), 1024, 1024, C0702f.f2791i);
        this.f490n = C0692b.m5327a(c0691a, (Context) this, "atlas.png", 0, 0);
        c0691a.m5317i();
        C0569b.m4883a("sounds/");
        try {
            this.f480b = C0569b.m4881a(this.k.m4951i(), this, "sfx_point.ogg");
            this.f481c = C0569b.m4881a(this.k.m4951i(), this, "sfx_die.ogg");
            this.f482d = C0569b.m4881a(this.k.m4951i(), this, "sfx_hit.ogg");
            this.f483e = C0569b.m4881a(this.k.m4951i(), this, "sfx_swooshing.ogg");
            this.f484f = C0569b.m4881a(this.k.m4951i(), this, "sfx_wing.ogg");
        } catch (IOException e) {
        }
    }

    protected C0136e m1141m() {
        return new C0138c(this, this.f490n);
    }

    protected C0346c m1142n() {
        return this.f485g.m4519b();
    }

    public boolean m1143o() {
        return this.f485g.m4521c();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f485g.m4507a(i, i2, intent);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f485g = new C0511a(this);
        if (this.f488j) {
            this.f485g.m4516a(this.f488j, this.f487i);
        }
        this.f485g.m4511a((C0128b) this, this.f486h, this.f491o);
    }

    protected void onDestroy() {
        super.onDestroy();
        System.exit(0);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            Log.i("FlappyBird", "Back key pressed.");
        }
        return false;
    }

    protected void onStart() {
        super.onStart();
        this.f485g.m4508a((Activity) this);
    }

    protected void onStop() {
        super.onStop();
        this.f485g.m4522d();
    }

    public void m1144p() {
        this.f485g.m4526f();
    }
}
