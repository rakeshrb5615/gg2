package q0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class v0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c1 f5191a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s1 f5192b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ s1 f5193c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5194d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ View f5195e;

    public v0(c1 c1Var, s1 s1Var, s1 s1Var2, int i, View view) {
        this.f5191a = c1Var;
        this.f5192b = s1Var;
        this.f5193c = s1Var2;
        this.f5194d = i;
        this.f5195e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        c1 c1Var = this.f5191a;
        b1 b1Var = c1Var.f5108a;
        b1Var.d(animatedFraction);
        s1 s1Var = this.f5192b;
        p1 p1Var = s1Var.f5183a;
        float b10 = b1Var.b();
        PathInterpolator pathInterpolator = x0.f5199e;
        int i = Build.VERSION.SDK_INT;
        i1 h1Var = i >= 34 ? new h1(s1Var) : i >= 30 ? new g1(s1Var) : i >= 29 ? new f1(s1Var) : new d1(s1Var);
        for (int i9 = 1; i9 <= 512; i9 <<= 1) {
            if ((this.f5194d & i9) == 0) {
                h1Var.c(i9, p1Var.f(i9));
            } else {
                h0.b f9 = p1Var.f(i9);
                h0.b f10 = this.f5193c.f5183a.f(i9);
                float f11 = 1.0f - b10;
                h1Var.c(i9, s1.e(f9, (int) (((f9.f2125a - f10.f2125a) * f11) + 0.5d), (int) (((f9.f2126b - f10.f2126b) * f11) + 0.5d), (int) (((f9.f2127c - f10.f2127c) * f11) + 0.5d), (int) (((f9.f2128d - f10.f2128d) * f11) + 0.5d)));
            }
        }
        x0.g(this.f5195e, h1Var.b(), Collections.singletonList(c1Var));
    }
}
