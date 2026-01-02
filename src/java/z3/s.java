package z3;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import j5.t1;
import java.util.ArrayList;
import n.b1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class s {
    public ColorStateList A;
    public Typeface B;

    /* renamed from: a  reason: collision with root package name */
    public final int f7252a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7253b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7254c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeInterpolator f7255d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeInterpolator f7256e;

    /* renamed from: f  reason: collision with root package name */
    public final TimeInterpolator f7257f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f7258g;

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout f7259h;
    public LinearLayout i;
    public int j;

    /* renamed from: k  reason: collision with root package name */
    public FrameLayout f7260k;

    /* renamed from: l  reason: collision with root package name */
    public AnimatorSet f7261l;

    /* renamed from: m  reason: collision with root package name */
    public final float f7262m;

    /* renamed from: n  reason: collision with root package name */
    public int f7263n;

    /* renamed from: o  reason: collision with root package name */
    public int f7264o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f7265p;
    public boolean q;

    /* renamed from: r  reason: collision with root package name */
    public b1 f7266r;

    /* renamed from: s  reason: collision with root package name */
    public CharSequence f7267s;

    /* renamed from: t  reason: collision with root package name */
    public int f7268t;

    /* renamed from: u  reason: collision with root package name */
    public int f7269u;

    /* renamed from: v  reason: collision with root package name */
    public ColorStateList f7270v;

    /* renamed from: w  reason: collision with root package name */
    public CharSequence f7271w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f7272x;

    /* renamed from: y  reason: collision with root package name */
    public b1 f7273y;

    /* renamed from: z  reason: collision with root package name */
    public int f7274z;

    public s(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f7258g = context;
        this.f7259h = textInputLayout;
        this.f7262m = context.getResources().getDimensionPixelSize(2131165331);
        this.f7252a = t1.P(context, 2130969533, 217);
        this.f7253b = t1.P(context, 2130969529, 167);
        this.f7254c = t1.P(context, 2130969533, 167);
        this.f7255d = t1.Q(context, 2130969538, d3.a.f1076d);
        LinearInterpolator linearInterpolator = d3.a.f1073a;
        this.f7256e = t1.Q(context, 2130969538, linearInterpolator);
        this.f7257f = t1.Q(context, 2130969541, linearInterpolator);
    }

    public final void a(b1 b1Var, int i) {
        if (this.i == null && this.f7260k == null) {
            Context context = this.f7258g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.f7259h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f7260k = new FrameLayout(context);
            this.i.addView(this.f7260k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f7260k.setVisibility(0);
            this.f7260k.addView(b1Var);
        } else {
            this.i.addView(b1Var, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.f7259h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f7258g;
                boolean J = t1.J(context);
                LinearLayout linearLayout = this.i;
                int paddingStart = editText.getPaddingStart();
                if (J) {
                    paddingStart = context.getResources().getDimensionPixelSize(2131166007);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166006);
                if (J) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166008);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (J) {
                    paddingEnd = context.getResources().getDimensionPixelSize(2131166007);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f7261l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z9, b1 b1Var, int i, int i9, int i10) {
        if (b1Var == null || !z9) {
            return;
        }
        if (i == i10 || i == i9) {
            boolean z10 = i10 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b1Var, View.ALPHA, z10 ? 1.0f : 0.0f);
            int i11 = this.f7254c;
            ofFloat.setDuration(z10 ? this.f7253b : i11);
            ofFloat.setInterpolator(z10 ? this.f7256e : this.f7257f);
            if (i == i10 && i9 != 0) {
                ofFloat.setStartDelay(i11);
            }
            arrayList.add(ofFloat);
            if (i10 != i || i9 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(b1Var, View.TRANSLATION_Y, -this.f7262m, 0.0f);
            ofFloat2.setDuration(this.f7252a);
            ofFloat2.setInterpolator(this.f7255d);
            ofFloat2.setStartDelay(i11);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return this.f7273y;
        }
        return this.f7266r;
    }

    public final void f() {
        this.f7265p = null;
        c();
        if (this.f7263n == 1) {
            if (!this.f7272x || TextUtils.isEmpty(this.f7271w)) {
                this.f7264o = 0;
            } else {
                this.f7264o = 2;
            }
        }
        i(this.f7263n, h(this.f7266r, ""), this.f7264o);
    }

    public final void g(b1 b1Var, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f7260k) != null) {
            frameLayout.removeView(b1Var);
        } else {
            linearLayout.removeView(b1Var);
        }
        int i9 = this.j - 1;
        this.j = i9;
        LinearLayout linearLayout2 = this.i;
        if (i9 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(b1 b1Var, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f7259h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f7264o == this.f7263n && b1Var != null && TextUtils.equals(b1Var.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(int i, boolean z9, int i9) {
        TextView e9;
        TextView e10;
        s sVar = this;
        if (i == i9) {
            return;
        }
        if (z9) {
            AnimatorSet animatorSet = new AnimatorSet();
            sVar.f7261l = animatorSet;
            ArrayList arrayList = new ArrayList();
            sVar.d(arrayList, sVar.f7272x, sVar.f7273y, 2, i, i9);
            sVar.d(arrayList, sVar.q, sVar.f7266r, 1, i, i9);
            int size = arrayList.size();
            long j = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Animator animator = (Animator) arrayList.get(i10);
                j = Math.max(j, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
            ofInt.setDuration(j);
            arrayList.add(0, ofInt);
            animatorSet.playTogether(arrayList);
            sVar = this;
            animatorSet.addListener(new q(this, i9, e(i), i, sVar.e(i9)));
            animatorSet.start();
        } else if (i != i9) {
            if (i9 != 0 && (e10 = sVar.e(i9)) != null) {
                e10.setVisibility(0);
                e10.setAlpha(1.0f);
            }
            if (i != 0 && (e9 = e(i)) != null) {
                e9.setVisibility(4);
                if (i == 1) {
                    e9.setText((CharSequence) null);
                }
            }
            sVar.f7263n = i9;
        }
        TextInputLayout textInputLayout = sVar.f7259h;
        textInputLayout.t();
        textInputLayout.w(z9, false);
        textInputLayout.z();
    }
}
