package c;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.g0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class k implements j, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final long f814a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b  reason: collision with root package name */
    public Runnable f815b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f816c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ n f817d;

    public k(n nVar) {
        this.f817d = nVar;
    }

    public final void a(View view) {
        if (this.f816c) {
            return;
        }
        this.f816c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        kotlin.jvm.internal.j.e(runnable, "runnable");
        this.f815b = runnable;
        View decorView = this.f817d.getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "getDecorView(...)");
        if (!this.f816c) {
            decorView.postOnAnimation(new g0(this, 1));
        } else if (kotlin.jvm.internal.j.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z9;
        Runnable runnable = this.f815b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f814a) {
                this.f816c = false;
                this.f817d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f815b = null;
        q fullyDrawnReporter = this.f817d.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.f829a) {
            z9 = fullyDrawnReporter.f830b;
        }
        if (z9) {
            this.f816c = false;
            this.f817d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f817d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
