package f3;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final View f1496a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1497b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f1498c;

    public e(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z9) {
        this.f1498c = swipeDismissBehavior;
        this.f1496a = view;
        this.f1497b = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y3.e eVar;
        SwipeDismissBehavior swipeDismissBehavior = this.f1498c;
        y0.e eVar2 = swipeDismissBehavior.a;
        View view = this.f1496a;
        if (eVar2 != null && eVar2.f()) {
            view.postOnAnimation(this);
        } else if (!this.f1497b || (eVar = swipeDismissBehavior.b) == null) {
        } else {
            eVar.a(view);
        }
    }
}
