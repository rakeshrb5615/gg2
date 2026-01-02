package z3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import n.b1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class q extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7246a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextView f7247b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f7248c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TextView f7249d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ s f7250e;

    public q(s sVar, int i, TextView textView, int i9, TextView textView2) {
        this.f7250e = sVar;
        this.f7246a = i;
        this.f7247b = textView;
        this.f7248c = i9;
        this.f7249d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        b1 b1Var;
        int i = this.f7246a;
        s sVar = this.f7250e;
        sVar.f7263n = i;
        sVar.f7261l = null;
        TextView textView = this.f7247b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f7248c == 1 && (b1Var = sVar.f7266r) != null) {
                b1Var.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f7249d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f7249d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
