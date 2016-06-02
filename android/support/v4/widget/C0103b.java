package android.support.v4.widget;

/* renamed from: android.support.v4.widget.b */
class C0103b implements Runnable {
    final /* synthetic */ ContentLoadingProgressBar f454a;

    C0103b(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.f454a = contentLoadingProgressBar;
    }

    public void run() {
        this.f454a.f369c = false;
        if (!this.f454a.f370d) {
            this.f454a.f367a = System.currentTimeMillis();
            this.f454a.setVisibility(0);
        }
    }
}
