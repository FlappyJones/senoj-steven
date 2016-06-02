package android.support.v4.widget;

/* renamed from: android.support.v4.widget.a */
class C0100a implements Runnable {
    final /* synthetic */ ContentLoadingProgressBar f427a;

    C0100a(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.f427a = contentLoadingProgressBar;
    }

    public void run() {
        this.f427a.f368b = false;
        this.f427a.f367a = -1;
        this.f427a.setVisibility(8);
    }
}
