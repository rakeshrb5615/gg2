package w3;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SideSheetBehavior f6436a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup.MarginLayoutParams f6437b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f6438c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ View f6439d;

    public /* synthetic */ c(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int i, View view) {
        this.f6436a = sideSheetBehavior;
        this.f6437b = marginLayoutParams;
        this.f6438c = i;
        this.f6439d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6436a.a.g(this.f6437b, d3.a.c(this.f6438c, 0, valueAnimator.getAnimatedFraction()));
        this.f6439d.requestLayout();
    }
}
