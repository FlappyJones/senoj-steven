package com.google.ads.p008a;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.MediaController;
import android.widget.VideoView;
import com.google.ads.util.C0229g;
import java.lang.ref.WeakReference;

/* renamed from: com.google.ads.a.c */
public class C0164c extends FrameLayout implements OnCompletionListener, OnErrorListener, OnPreparedListener {
    private static final C0168h f848b;
    public MediaController f849a;
    private final WeakReference f850c;
    private final C0161e f851d;
    private long f852e;
    private final VideoView f853f;
    private String f854g;

    static {
        f848b = (C0168h) C0168h.f858a.m1455b();
    }

    public C0164c(Activity activity, C0161e c0161e) {
        super(activity);
        this.f850c = new WeakReference(activity);
        this.f851d = c0161e;
        this.f853f = new VideoView(activity);
        addView(this.f853f, new LayoutParams(-1, -1, 17));
        this.f849a = null;
        this.f854g = null;
        this.f852e = 0;
        m1435a();
        this.f853f.setOnCompletionListener(this);
        this.f853f.setOnPreparedListener(this);
        this.f853f.setOnErrorListener(this);
    }

    protected void m1435a() {
        new C0165d(this).m1443a();
    }

    public void m1436a(int i) {
        this.f853f.seekTo(i);
    }

    public void m1437a(MotionEvent motionEvent) {
        this.f853f.onTouchEvent(motionEvent);
    }

    public void m1438b() {
        if (TextUtils.isEmpty(this.f854g)) {
            f848b.m1448a(this.f851d, "onVideoEvent", "{'event': 'error', 'what': 'no_src'}");
        } else {
            this.f853f.setVideoPath(this.f854g);
        }
    }

    public void m1439c() {
        this.f853f.pause();
    }

    public void m1440d() {
        this.f853f.start();
    }

    public void m1441e() {
        this.f853f.stopPlayback();
    }

    void m1442f() {
        long currentPosition = (long) this.f853f.getCurrentPosition();
        if (this.f852e != currentPosition) {
            f848b.m1448a(this.f851d, "onVideoEvent", "{'event': 'timeupdate', 'time': " + (((float) currentPosition) / 1000.0f) + "}");
            this.f852e = currentPosition;
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        f848b.m1448a(this.f851d, "onVideoEvent", "{'event': 'ended'}");
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        C0229g.m1842e("Video threw error! <what:" + i + ", extra:" + i2 + ">");
        f848b.m1448a(this.f851d, "onVideoEvent", "{'event': 'error', 'what': '" + i + "', 'extra': '" + i2 + "'}");
        return true;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        f848b.m1448a(this.f851d, "onVideoEvent", "{'event': 'canplaythrough', 'duration': '" + (((float) this.f853f.getDuration()) / 1000.0f) + "'}");
    }

    public void setMediaControllerEnabled(boolean z) {
        Activity activity = (Activity) this.f850c.get();
        if (activity == null) {
            C0229g.m1842e("adActivity was null while trying to enable controls on a video.");
        } else if (z) {
            if (this.f849a == null) {
                this.f849a = new MediaController(activity);
            }
            this.f853f.setMediaController(this.f849a);
        } else {
            if (this.f849a != null) {
                this.f849a.hide();
            }
            this.f853f.setMediaController(null);
        }
    }

    public void setSrc(String str) {
        this.f854g = str;
    }
}
