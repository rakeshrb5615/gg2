package z3;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.g0;
import com.google.android.material.internal.CheckableImageButton;
import j5.t1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class d extends p {

    /* renamed from: e  reason: collision with root package name */
    public final int f7194e;

    /* renamed from: f  reason: collision with root package name */
    public final int f7195f;

    /* renamed from: g  reason: collision with root package name */
    public final TimeInterpolator f7196g;

    /* renamed from: h  reason: collision with root package name */
    public final TimeInterpolator f7197h;
    public EditText i;
    public final com.google.android.material.datepicker.o j;

    /* renamed from: k  reason: collision with root package name */
    public final a f7198k;

    /* renamed from: l  reason: collision with root package name */
    public AnimatorSet f7199l;

    /* renamed from: m  reason: collision with root package name */
    public ValueAnimator f7200m;

    public d(o oVar) {
        super(oVar);
        this.j = new com.google.android.material.datepicker.o(this, 2);
        this.f7198k = new a(this, 0);
        this.f7194e = t1.P(oVar.getContext(), 2130969532, 100);
        this.f7195f = t1.P(oVar.getContext(), 2130969532, 150);
        this.f7196g = t1.Q(oVar.getContext(), 2130969541, d3.a.f1073a);
        this.f7197h = t1.Q(oVar.getContext(), 2130969539, d3.a.f1076d);
    }

    @Override // z3.p
    public final void a() {
        if (this.f7243b.f7237v != null) {
            return;
        }
        s(t());
    }

    @Override // z3.p
    public final int c() {
        return 2131951744;
    }

    @Override // z3.p
    public final int d() {
        return 2131231322;
    }

    @Override // z3.p
    public final View.OnFocusChangeListener e() {
        return this.f7198k;
    }

    @Override // z3.p
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // z3.p
    public final View.OnFocusChangeListener g() {
        return this.f7198k;
    }

    @Override // z3.p
    public final void l(EditText editText) {
        this.i = editText;
        this.f7242a.setEndIconVisible(t());
    }

    @Override // z3.p
    public final void o(boolean z9) {
        if (this.f7243b.f7237v == null) {
            return;
        }
        s(z9);
    }

    @Override // z3.p
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f7197h);
        ofFloat.setDuration(this.f7195f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: z3.b

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ d f7191b;

            {
                this.f7191b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        d dVar = this.f7191b;
                        dVar.getClass();
                        dVar.f7245d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        d dVar2 = this.f7191b;
                        dVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f7245d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f7196g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i = this.f7194e;
        ofFloat2.setDuration(i);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: z3.b

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ d f7191b;

            {
                this.f7191b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        d dVar = this.f7191b;
                        dVar.getClass();
                        dVar.f7245d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        d dVar2 = this.f7191b;
                        dVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f7245d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f7199l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f7199l.addListener(new c(this, 0));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: z3.b

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ d f7191b;

            {
                this.f7191b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        d dVar = this.f7191b;
                        dVar.getClass();
                        dVar.f7245d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        d dVar2 = this.f7191b;
                        dVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f7245d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        this.f7200m = ofFloat3;
        ofFloat3.addListener(new c(this, 1));
    }

    @Override // z3.p
    public final void r() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new g0(this, 16));
        }
    }

    public final void s(boolean z9) {
        boolean z10 = this.f7243b.d() == z9;
        if (z9 && !this.f7199l.isRunning()) {
            this.f7200m.cancel();
            this.f7199l.start();
            if (z10) {
                this.f7199l.end();
            }
        } else if (z9) {
        } else {
            this.f7199l.cancel();
            this.f7200m.start();
            if (z10) {
                this.f7200m.end();
            }
        }
    }

    public final boolean t() {
        EditText editText = this.i;
        if (editText != null) {
            return (editText.hasFocus() || this.f7245d.hasFocus()) && this.i.getText().length() > 0;
        }
        return false;
    }
}
