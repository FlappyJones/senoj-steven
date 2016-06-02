package org.andengine.p003b;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.google.android.gms.C0338e;
import org.andengine.input.p034a.C0650a;
import org.andengine.input.p034a.p035a.C0574e;
import org.andengine.input.p034a.p035a.C0644d;
import org.andengine.input.p034a.p035a.C0648f;
import org.andengine.input.p034a.p035a.C0649g;
import org.andengine.input.sensor.C0662b;
import org.andengine.input.sensor.location.C0663a;
import org.andengine.input.sensor.location.C0664b;
import org.andengine.input.sensor.p060a.C0653a;
import org.andengine.input.sensor.p060a.C0659g;
import org.andengine.input.sensor.p061b.C0660a;
import org.andengine.input.sensor.p061b.C0661b;
import org.andengine.opengl.p046d.C0709e;
import org.andengine.opengl.p062a.C0667b;
import org.andengine.opengl.p062a.C0668c;
import org.andengine.opengl.p064b.C0682h;
import org.andengine.opengl.p067c.C0701e;
import org.andengine.opengl.p067c.p068a.p070a.C0692b;
import org.andengine.opengl.util.C0714e;
import org.andengine.p003b.p004b.C0578a;
import org.andengine.p003b.p004b.C0579d;
import org.andengine.p003b.p004b.p036a.C0576a;
import org.andengine.p003b.p032a.C0573a;
import org.andengine.p003b.p039c.C0585b;
import org.andengine.p005d.p057e.C0637a;
import org.andengine.p006c.p007b.C0136e;
import org.andengine.p027a.p029b.C0562a;
import org.andengine.p027a.p029b.C0565b;
import org.andengine.p027a.p030c.C0569b;
import org.andengine.p027a.p030c.C0570c;

/* renamed from: org.andengine.b.a */
public class C0575a implements SensorEventListener, LocationListener, OnTouchListener, C0574e {
    private static final C0662b f2448e;
    private final C0579d f2449A;
    private final C0578a f2450B;
    protected final C0573a f2451a;
    protected C0136e f2452b;
    protected int f2453c;
    protected int f2454d;
    private boolean f2455f;
    private boolean f2456g;
    private long f2457h;
    private float f2458i;
    private final C0592c f2459j;
    private final C0593d f2460k;
    private final C0576a f2461l;
    private final C0585b f2462m;
    private C0644d f2463n;
    private final C0709e f2464o;
    private final C0701e f2465p;
    private final C0668c f2466q;
    private final C0682h f2467r;
    private final C0570c f2468s;
    private final C0565b f2469t;
    private C0663a f2470u;
    private Location f2471v;
    private C0659g f2472w;
    private C0653a f2473x;
    private C0660a f2474y;
    private C0661b f2475z;

    static {
        f2448e = C0662b.GAME;
    }

    public C0575a(C0585b c0585b) {
        this.f2461l = new C0576a();
        this.f2464o = new C0709e();
        this.f2465p = new C0701e();
        this.f2466q = new C0668c();
        this.f2467r = new C0682h();
        this.f2449A = new C0579d(8);
        this.f2450B = new C0578a(4);
        this.f2453c = 1;
        this.f2454d = 1;
        C0692b.m5330a();
        C0569b.m4882a();
        C0562a.m4865a();
        C0667b.m5233a();
        this.f2464o.m5379a();
        this.f2465p.m5365a();
        this.f2466q.m5235a();
        this.f2467r.m5275a();
        this.f2462m = c0585b;
        if (this.f2462m.m4966a()) {
            this.f2459j = c0585b.m4967b();
        } else {
            this.f2459j = new C0592c(false);
        }
        this.f2451a = c0585b.m4974i();
        if (this.f2462m.m4968c().m4988a()) {
            m4933a(new C0648f());
        } else {
            m4933a(new C0649g());
        }
        if (this.f2462m.m4969d().m4963b()) {
            this.f2468s = new C0570c(this.f2462m.m4969d().m4961a().m4986b());
        } else {
            this.f2468s = null;
        }
        if (this.f2462m.m4969d().m4964c()) {
            this.f2469t = new C0565b();
        } else {
            this.f2469t = null;
        }
        if (this.f2462m.m4975j()) {
            this.f2460k = this.f2462m.m4976k();
        } else {
            this.f2460k = new C0593d();
        }
        this.f2460k.m4995a(this);
    }

    private void m4926n() {
        if (this.f2456g) {
            throw new C0580b(this);
        }
    }

    private long m4927o() {
        return System.nanoTime() - this.f2457h;
    }

    public void m4928a() {
        this.f2460k.start();
    }

    protected void m4929a(float f) {
        if (this.f2452b != null) {
            this.f2452b.a_(f);
        }
    }

    public void m4930a(int i, int i2) {
        this.f2453c = i;
        this.f2454d = i2;
        m4948f();
    }

    public void m4931a(long j) {
        float f = ((float) j) * 1.0E-9f;
        this.f2458i += f;
        this.f2457h += j;
        this.f2463n.a_(f);
        m4941b(f);
        m4929a(f);
    }

    public void m4932a(C0136e c0136e) {
        this.f2452b = c0136e;
    }

    public void m4933a(C0644d c0644d) {
        this.f2463n = c0644d;
        this.f2463n.m5174a((C0574e) this);
    }

    public void m4934a(C0714e c0714e) {
        C0592c c0592c = this.f2459j;
        c0592c.lock();
        try {
            c0592c.m4993c();
            this.f2464o.m5381a(c0714e);
            this.f2465p.m5366a(c0714e);
            this.f2466q.m5236a(c0714e);
            m4935a(c0714e, this.f2451a);
            m4943b(c0714e, this.f2451a);
            c0592c.m4992b();
        } finally {
            c0592c.unlock();
        }
    }

    protected void m4935a(C0714e c0714e, C0573a c0573a) {
        this.f2450B.m4956a(c0714e, c0573a);
    }

    protected boolean m4936a(C0573a c0573a, C0650a c0650a) {
        return c0573a.m4922j() ? c0573a.m4921i().m4890a(c0650a) : false;
    }

    protected boolean m4937a(C0136e c0136e, C0650a c0650a) {
        return c0136e != null ? c0136e.m1196a(c0650a) : false;
    }

    public boolean m4938a(C0650a c0650a) {
        C0136e c = m4944c(c0650a);
        C0573a b = m4939b(c0650a);
        m4942b(b, c0650a);
        return m4936a(b, c0650a) ? true : m4937a(c, c0650a);
    }

    protected C0573a m4939b(C0650a c0650a) {
        return m4947e();
    }

    public synchronized void m4940b() {
        if (!this.f2455f) {
            this.f2457h = System.nanoTime();
            this.f2455f = true;
        }
    }

    protected void m4941b(float f) {
        this.f2461l.a_(f);
        this.f2449A.a_(f);
        m4947e().a_(f);
    }

    protected void m4942b(C0573a c0573a, C0650a c0650a) {
        c0573a.m4905a(c0650a, this.f2453c, this.f2454d);
    }

    protected void m4943b(C0714e c0714e, C0573a c0573a) {
        if (this.f2452b != null) {
            this.f2452b.m1163a(c0714e, c0573a);
        }
        c0573a.m4906a(c0714e);
    }

    protected C0136e m4944c(C0650a c0650a) {
        return this.f2452b;
    }

    public synchronized void m4945c() {
        if (this.f2455f) {
            this.f2455f = false;
        }
    }

    public C0585b m4946d() {
        return this.f2462m;
    }

    public C0573a m4947e() {
        return this.f2451a;
    }

    protected void m4948f() {
        this.f2451a.m4902a(0, 0, this.f2453c, this.f2454d);
    }

    public C0709e m4949g() {
        return this.f2464o;
    }

    public C0701e m4950h() {
        return this.f2465p;
    }

    public C0570c m4951i() {
        if (this.f2468s != null) {
            return this.f2468s;
        }
        throw new IllegalStateException("To enable the SoundManager, check the EngineOptions!");
    }

    public C0565b m4952j() {
        if (this.f2469t != null) {
            return this.f2469t;
        }
        throw new IllegalStateException("To enable the MusicManager, check the EngineOptions!");
    }

    public void m4953k() {
        this.f2459j.lock();
        try {
            this.f2456g = true;
            this.f2459j.m4992b();
            try {
                this.f2460k.join();
            } catch (Throwable e) {
                C0637a.m5156b("Could not join UpdateThread.", e);
                C0637a.m5157c("Trying to manually interrupt UpdateThread.");
                this.f2460k.interrupt();
            }
            this.f2464o.m5382b();
            this.f2465p.m5369c();
            this.f2466q.m5237b();
            this.f2467r.m5277b();
        } finally {
            this.f2459j.unlock();
        }
    }

    public void m4954l() {
        this.f2464o.m5384c();
        this.f2465p.m5368b();
        this.f2466q.m5238c();
        this.f2467r.m5278c();
    }

    void m4955m() {
        if (this.f2455f) {
            long o = m4927o();
            this.f2459j.lock();
            try {
                m4926n();
                m4931a(o);
                m4926n();
                this.f2459j.m4991a();
                this.f2459j.m4994d();
            } finally {
                this.f2459j.unlock();
            }
        } else {
            this.f2459j.lock();
            try {
                m4926n();
                this.f2459j.m4991a();
                this.f2459j.m4994d();
                Thread.sleep(16);
            } finally {
                this.f2459j.unlock();
            }
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
        if (this.f2455f) {
            switch (sensor.getType()) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    if (this.f2473x != null) {
                        this.f2473x.m5204a(i);
                        this.f2472w.m5212a(this.f2473x);
                    } else if (this.f2475z != null) {
                        this.f2475z.m5219b(i);
                        this.f2474y.m5214a(this.f2475z);
                    }
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    this.f2475z.m5221c(i);
                    this.f2474y.m5214a(this.f2475z);
                default:
            }
        }
    }

    public void onLocationChanged(Location location) {
        if (this.f2471v == null) {
            this.f2471v = location;
        } else if (location == null) {
            this.f2470u.m5226b();
        } else {
            this.f2471v = location;
            this.f2470u.m5224a(location);
        }
    }

    public void onProviderDisabled(String str) {
        this.f2470u.m5227c();
    }

    public void onProviderEnabled(String str) {
        this.f2470u.m5223a();
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (this.f2455f) {
            switch (sensorEvent.sensor.getType()) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    if (this.f2473x != null) {
                        this.f2473x.m5206a(sensorEvent.values);
                        this.f2472w.m5213b(this.f2473x);
                    } else if (this.f2475z != null) {
                        this.f2475z.m5220b(sensorEvent.values);
                        this.f2474y.m5215b(this.f2475z);
                    }
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    this.f2475z.m5222c(sensorEvent.values);
                    this.f2474y.m5215b(this.f2475z);
                default:
            }
        }
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
        switch (i) {
            case C0338e.MapAttrs_mapType /*0*/:
                this.f2470u.m5225a(C0664b.OUT_OF_SERVICE, bundle);
            case C0338e.MapAttrs_cameraBearing /*1*/:
                this.f2470u.m5225a(C0664b.TEMPORARILY_UNAVAILABLE, bundle);
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                this.f2470u.m5225a(C0664b.AVAILABLE, bundle);
            default:
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f2455f) {
            return false;
        }
        this.f2463n.m5173a(motionEvent);
        try {
            Thread.sleep(this.f2462m.m4968c().m4989b());
        } catch (Throwable e) {
            C0637a.m5153a(e);
        }
        return true;
    }
}
