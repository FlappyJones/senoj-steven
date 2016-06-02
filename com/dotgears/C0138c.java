package com.dotgears;

import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import com.dotgears.flappy.C0148c;
import com.google.android.gms.C0338e;
import com.jam.flappyjones.R;
import org.andengine.input.p034a.C0650a;
import org.andengine.opengl.p067c.p073c.C0698c;
import org.andengine.p006c.p007b.C0136e;
import org.andengine.p006c.p007b.C0137c;
import org.andengine.p006c.p047d.C0612a;

/* renamed from: com.dotgears.c */
public class C0138c extends C0136e implements C0137c {
    public static C0612a[] f547a;
    static int f548c;
    public final int f549b;
    public GameActivity f550d;
    public int f551e;
    float[] f552f;
    float[] f553g;
    boolean f554h;
    int f555i;
    int f556j;

    public C0138c(GameActivity gameActivity, C0698c c0698c) {
        this.f549b = 50;
        this.f552f = new float[10];
        this.f553g = new float[10];
        this.f554h = false;
        this.f555i = 0;
        this.f556j = 0;
        this.f550d = gameActivity;
        this.f551e = gameActivity.getSharedPreferences("FlappyJones", 0).getInt("score", 0);
        C0147g.f620D = new C0148c(this.f551e, 0, gameActivity.getApplication().getResources().openRawResource(R.raw.atlas));
        C0147g.f620D.m1231a();
        C0153j.m1272a((int) System.currentTimeMillis());
        f547a = new C0612a[50];
        for (int i = 0; i < 50; i++) {
            f547a[i] = new C0612a(0.0f, 0.0f, c0698c.m5356i(), gameActivity.m1118x().m4949g());
            f547a[i].m1164a(false);
            m1169b(f547a[i]);
        }
        m1194a((C0137c) this);
    }

    public static void m1201a(int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, float f5) {
        C0612a c0612a = f547a[f548c];
        c0612a.m5054b((float) i, (float) i2, (float) i3, (float) i4, f, f2, f3, f4);
        c0612a.m1168b(f5);
        c0612a.m1164a(true);
        f548c++;
    }

    public static void m1202a(int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, float f5, float f6) {
        C0612a c0612a = f547a[f548c];
        C0153j.m1271a((float) i, (float) i2, ((float) (i + i3)) * 0.5f, ((float) (i2 + i4)) * 0.5f, f6);
        float f7 = C0153j.f690A - ((float) i);
        float f8 = C0153j.f691B - ((float) i2);
        C0153j.m1271a((float) i, (float) i4, ((float) (i + i3)) * 0.5f, ((float) (i2 + i4)) * 0.5f, f6);
        float f9 = C0153j.f690A - ((float) i);
        float f10 = C0153j.f691B - ((float) i2);
        C0153j.m1271a((float) i3, (float) i2, ((float) (i + i3)) * 0.5f, ((float) (i2 + i4)) * 0.5f, f6);
        float f11 = C0153j.f690A - ((float) i);
        float f12 = C0153j.f691B - ((float) i2);
        C0153j.m1271a((float) i3, (float) i4, ((float) (i + i3)) * 0.5f, ((float) (i2 + i4)) * 0.5f, f6);
        c0612a.m5052a((float) i, (float) i2, (float) i3, (float) i4, f, f2, f3, f4, f7, f8, f9, f10, f11, f12, C0153j.f690A - ((float) i), C0153j.f691B - ((float) i2));
        c0612a.m1168b(f5);
        c0612a.m1164a(true);
        f548c++;
    }

    public void m1203a() {
        for (int i = 0; i < 50; i++) {
            f547a[i].m1164a(false);
        }
        f548c = 0;
    }

    protected void m1204a(float f) {
        super.m1193a(f);
        m1203a();
        C0147g.f620D.m1245a(this.f552f, this.f553g);
        if (this.f554h) {
            C0147g.f620D.m1234a(this.f555i, this.f556j);
            C0147g.f620D.m1236a(this.f555i, this.f556j, this.f555i, this.f556j);
            this.f554h = false;
        }
        C0147g.f620D.m1248b();
        for (int i = 0; i < C0147g.f620D.f646v; i++) {
            switch (C0147g.f620D.f647w[i]) {
                case C0338e.MapAttrs_mapType /*0*/:
                    int i2 = (int) C0147g.f620D.f648x[i];
                    if (this.f550d.m1143o()) {
                        this.f550d.f485g.m4519b().m2631a("CgkI5J2sk6QXEAIQAA", (long) i2);
                    }
                    if (i2 <= this.f551e) {
                        break;
                    }
                    Editor edit = this.f550d.getSharedPreferences("FlappyJones", 0).edit();
                    edit.clear();
                    edit.putInt("score", (int) C0147g.f620D.f648x[i]);
                    edit.commit();
                    this.f551e = i2;
                    break;
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    if (!this.f550d.m1143o()) {
                        this.f550d.m1144p();
                        break;
                    } else {
                        this.f550d.startActivityForResult(this.f550d.m1142n().m2629a("CgkI5J2sk6QXEAIQAA"), 1);
                        break;
                    }
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse("http://flappyjones.com:70/"));
                    this.f550d.startActivity(intent);
                    break;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    this.f550d.m1132d();
                    break;
                case C0338e.MapAttrs_uiRotateGestures /*7*/:
                    this.f550d.m1131c();
                    break;
                case C0338e.MapAttrs_uiScrollGestures /*8*/:
                    this.f550d.m1132d();
                    break;
                case C0338e.MapAttrs_uiTiltGestures /*9*/:
                    this.f550d.m1133e();
                    break;
                case C0338e.MapAttrs_uiZoomControls /*10*/:
                    this.f550d.m1136h();
                    break;
                case C0338e.MapAttrs_uiZoomGestures /*11*/:
                    this.f550d.m1134f();
                    break;
                case C0338e.MapAttrs_useViewLifecycle /*12*/:
                    this.f550d.m1135g();
                    break;
                case C0338e.MapAttrs_zOrderOnTop /*13*/:
                    this.f550d.m1137i();
                    break;
                default:
                    break;
            }
        }
    }

    public boolean m1205a(C0136e c0136e, C0650a c0650a) {
        if (c0650a.m5196f()) {
            if (C0147g.f620D != null) {
                this.f554h = true;
                this.f555i = (int) c0650a.m5191b();
                this.f556j = (int) c0650a.m5193c();
            }
            this.f552f[c0650a.m5194d() % 10] = c0650a.m5191b();
            this.f553g[c0650a.m5194d() % 10] = c0650a.m5193c();
        } else if (c0650a.m5197g() || c0650a.m5200j() || c0650a.m5199i()) {
            C0147g c0147g = C0147g.f620D;
            this.f552f[c0650a.m5194d() % 10] = -100.0f;
            this.f553g[c0650a.m5194d() % 10] = -100.0f;
        }
        return true;
    }
}
