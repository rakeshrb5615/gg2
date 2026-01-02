package i2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class x extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2636a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2637b;

    public /* synthetic */ x(View view, int i) {
        this.f2636a = i;
        this.f2637b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2636a) {
            case 0:
                View view = this.f2637b;
                view.setVisibility(8);
                view.getLayoutParams().height = -2;
                return;
            default:
                View view2 = this.f2637b;
                view2.setVisibility(8);
                view2.getLayoutParams().height = -2;
                return;
        }
    }
}
