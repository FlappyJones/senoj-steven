package com.dotgears;

import com.google.android.gms.C0338e;

/* renamed from: com.dotgears.r */
public class C0159r {
    public float f763a;
    public float f764b;
    public float f765c;
    public float f766d;
    public float f767e;
    public int f768f;
    public boolean f769g;
    private int f770h;
    private int f771i;
    private float f772j;

    public C0159r() {
        this.f769g = true;
        this.f763a = 0.0f;
    }

    public void m1333a(float f) {
        if (!this.f769g) {
            this.f771i++;
            this.f764b = ((float) this.f771i) * this.f772j;
            switch (this.f768f) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    this.f764b = C0153j.m1274b((int) (this.f764b * 100.0f));
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    this.f764b = C0153j.m1277c((int) (this.f764b * 100.0f));
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    this.f764b = C0153j.m1279d((int) (this.f764b * 100.0f));
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    this.f764b = C0153j.m1281e((int) (this.f764b * 100.0f));
                    break;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    this.f764b = C0153j.m1283f((int) (this.f764b * 100.0f));
                    break;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    this.f764b = C0153j.m1285g((int) (this.f764b * 100.0f));
                    break;
                case C0338e.MapAttrs_uiRotateGestures /*7*/:
                    this.f764b = C0153j.m1287h((int) (this.f764b * 100.0f));
                    break;
                case C0338e.MapAttrs_uiScrollGestures /*8*/:
                    this.f764b = C0153j.m1289i((int) (this.f764b * 100.0f));
                    break;
                case C0338e.MapAttrs_uiTiltGestures /*9*/:
                    this.f764b = C0153j.m1291j((int) (this.f764b * 100.0f));
                    break;
                case C0338e.MapAttrs_uiZoomControls /*10*/:
                    this.f764b = C0153j.m1293k((int) (this.f764b * 100.0f));
                    break;
                case C0338e.MapAttrs_uiZoomGestures /*11*/:
                    this.f764b = C0153j.m1295l((int) (this.f764b * 100.0f));
                    break;
                case C0338e.MapAttrs_useViewLifecycle /*12*/:
                    this.f764b = C0153j.m1296m((int) (this.f764b * 100.0f));
                    break;
                case C0338e.MapAttrs_zOrderOnTop /*13*/:
                    this.f764b = C0153j.m1297n((int) (this.f764b * 100.0f));
                    break;
                case 14:
                    this.f764b = C0153j.m1298o((int) (this.f764b * 100.0f));
                    break;
                case 15:
                    this.f764b = C0153j.m1299p((int) (this.f764b * 100.0f));
                    break;
                case 16:
                    this.f764b = C0153j.m1300q((int) (this.f764b * 100.0f));
                    break;
                case 17:
                    this.f764b = C0153j.m1301r((int) (this.f764b * 100.0f));
                    break;
                case 18:
                    this.f764b = C0153j.m1302s((int) (this.f764b * 100.0f));
                    break;
                case 19:
                    this.f764b = C0153j.m1303t((int) (this.f764b * 100.0f));
                    break;
                case 20:
                    this.f764b = C0153j.m1304u((int) (this.f764b * 100.0f));
                    break;
                case 21:
                    this.f764b = C0153j.m1305v((int) (this.f764b * 100.0f));
                    break;
            }
            this.f763a = (this.f764b * this.f767e) + this.f765c;
            if (this.f771i == this.f770h) {
                this.f769g = true;
                this.f763a = this.f766d;
                this.f764b = 1.0f;
            }
        }
    }

    public void m1334a(float f, float f2, int i, float f3) {
        this.f765c = f;
        this.f766d = f2;
        this.f767e = this.f766d - this.f765c;
        this.f770h = (int) (60.0f * f3);
        this.f772j = 1.0f / ((float) this.f770h);
        this.f771i = 0;
        this.f768f = i;
        this.f769g = false;
        this.f763a = this.f765c;
    }
}
