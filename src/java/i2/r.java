package i2;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2509a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2510b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ float f2511c;

    public /* synthetic */ r(View view, float f9, int i) {
        this.f2509a = i;
        this.f2510b = view;
        this.f2511c = f9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2509a) {
            case 0:
                View view = this.f2510b;
                ViewPropertyAnimator animate = view.animate();
                float f9 = this.f2511c;
                animate.scaleX(f9).scaleY(f9).setDuration(50).withEndAction(new v(view, 0)).start();
                return;
            default:
                ViewPropertyAnimator animate2 = this.f2510b.animate();
                float f10 = this.f2511c;
                animate2.scaleX(f10).scaleY(f10).setDuration(80).start();
                return;
        }
    }
}
