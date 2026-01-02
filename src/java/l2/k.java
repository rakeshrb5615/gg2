package l2;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3702a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f3703b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ float f3704c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ float f3705d;

    public /* synthetic */ k(View view, float f9, float f10, int i) {
        this.f3702a = i;
        this.f3703b = view;
        this.f3704c = f9;
        this.f3705d = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3702a) {
            case 0:
                View view = this.f3703b;
                ViewPropertyAnimator duration = view.animate().setDuration(100L);
                float f9 = this.f3704c;
                ViewPropertyAnimator translationXBy = duration.translationXBy((-f9) * 2.0f);
                float f10 = this.f3705d;
                translationXBy.translationYBy((-f10) * 2.0f).withEndAction(new k(view, f9, f10, 1)).start();
                return;
            default:
                this.f3703b.animate().setDuration(50L).translationXBy(this.f3704c).translationYBy(this.f3705d).start();
                return;
        }
    }
}
