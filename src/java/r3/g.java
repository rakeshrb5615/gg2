package r3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f5569a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f5570b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h f5571c;

    public g(h hVar, boolean z9, int i) {
        this.f5571c = hVar;
        this.f5569a = z9;
        this.f5570b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h hVar = this.f5571c;
        hVar.f5559b.setTranslationX(0.0f);
        hVar.a(0.0f, this.f5569a, this.f5570b);
    }
}
