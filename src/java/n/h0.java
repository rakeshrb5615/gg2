package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class h0 extends c0 {

    /* renamed from: e  reason: collision with root package name */
    public final g0 f4164e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f4165f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f4166g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f4167h;
    public boolean i;
    public boolean j;

    public h0(g0 g0Var) {
        super(g0Var);
        this.f4166g = null;
        this.f4167h = null;
        this.i = false;
        this.j = false;
        this.f4164e = g0Var;
    }

    @Override // n.c0
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, 2130969700);
        g0 g0Var = this.f4164e;
        Context context = g0Var.getContext();
        int[] iArr = g.a.f1576g;
        b8.g p8 = b8.g.p(context, attributeSet, iArr, 2130969700);
        TypedArray typedArray = (TypedArray) p8.f790c;
        q0.q0.m(g0Var, g0Var.getContext(), iArr, attributeSet, (TypedArray) p8.f790c, 2130969700);
        Drawable j = p8.j(0);
        if (j != null) {
            g0Var.setThumb(j);
        }
        Drawable i9 = p8.i(1);
        Drawable drawable = this.f4165f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f4165f = i9;
        if (i9 != null) {
            i9.setCallback(g0Var);
            i9.setLayoutDirection(g0Var.getLayoutDirection());
            if (i9.isStateful()) {
                i9.setState(g0Var.getDrawableState());
            }
            f();
        }
        g0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.f4167h = n1.c(typedArray.getInt(3, -1), this.f4167h);
            this.j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f4166g = p8.h(2);
            this.i = true;
        }
        p8.r();
        f();
    }

    public final void f() {
        Drawable drawable = this.f4165f;
        if (drawable != null) {
            if (this.i || this.j) {
                Drawable mutate = drawable.mutate();
                this.f4165f = mutate;
                if (this.i) {
                    mutate.setTintList(this.f4166g);
                }
                if (this.j) {
                    this.f4165f.setTintMode(this.f4167h);
                }
                if (this.f4165f.isStateful()) {
                    this.f4165f.setState(this.f4164e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f4165f != null) {
            g0 g0Var = this.f4164e;
            int max = g0Var.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f4165f.getIntrinsicWidth();
                int intrinsicHeight = this.f4165f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i9 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f4165f.setBounds(-i, -i9, i, i9);
                float width = ((g0Var.getWidth() - g0Var.getPaddingLeft()) - g0Var.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(g0Var.getPaddingLeft(), g0Var.getHeight() / 2);
                for (int i10 = 0; i10 <= max; i10++) {
                    this.f4165f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
