package android.support.v4.view;

class bx implements Runnable {
    final /* synthetic */ ViewPager f350a;

    bx(ViewPager viewPager) {
        this.f350a = viewPager;
    }

    public void run() {
        this.f350a.setScrollState(0);
        this.f350a.m309c();
    }
}
