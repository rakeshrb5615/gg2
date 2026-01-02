package y3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import j5.t1;
import j6.s;
import v3.p;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class g extends FrameLayout {

    /* renamed from: r */
    public static final h3.f f6791r = new h3.f(1);

    /* renamed from: a */
    public h f6792a;

    /* renamed from: b */
    public final p f6793b;

    /* renamed from: c */
    public int f6794c;

    /* renamed from: d */
    public final float f6795d;

    /* renamed from: e */
    public final float f6796e;

    /* renamed from: f */
    public final int f6797f;

    /* renamed from: m */
    public final int f6798m;

    /* renamed from: n */
    public ColorStateList f6799n;

    /* renamed from: o */
    public PorterDuff.Mode f6800o;

    /* renamed from: p */
    public Rect f6801p;
    public boolean q;

    /* JADX WARN: Multi-variable type inference failed */
    public g(Context context, AttributeSet attributeSet) {
        super(a4.a.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, c3.a.C);
        if (obtainStyledAttributes.hasValue(6)) {
            setElevation(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.f6794c = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f6793b = p.b(context2, attributeSet, 0, 0).a();
        }
        this.f6795d = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(t1.v(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(q3.k.g(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f6796e = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f6797f = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f6798m = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f6791r);
        setFocusable(true);
        if (getBackground() == null) {
            int L = t1.L(t1.u(this, 2130968890), t1.u(this, 2130968867), getBackgroundOverlayColorAlpha());
            p pVar = this.f6793b;
            if (pVar != null) {
                l1.a aVar = h.f6802u;
                v3.k kVar = new v3.k(pVar);
                kVar.o(ColorStateList.valueOf(L));
                gradientDrawable = kVar;
            } else {
                Resources resources = getResources();
                l1.a aVar2 = h.f6802u;
                float dimension = resources.getDimension(2131166187);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(L);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f6799n;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            setBackground(gradientDrawable);
        }
    }

    public void setBaseTransientBottomBar(h hVar) {
        this.f6792a = hVar;
    }

    public float getActionTextColorAlpha() {
        return this.f6796e;
    }

    public int getAnimationMode() {
        return this.f6794c;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f6795d;
    }

    public int getMaxInlineActionWidth() {
        return this.f6798m;
    }

    public int getMaxWidth() {
        return this.f6797f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h hVar = this.f6792a;
        if (hVar != null) {
            hVar.b();
        }
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z9;
        super.onDetachedFromWindow();
        h hVar = this.f6792a;
        if (hVar != null) {
            s h9 = s.h();
            f fVar = hVar.f6824t;
            synchronized (h9.f3282b) {
                z9 = true;
                if (!h9.l(fVar)) {
                    l lVar = (l) h9.f3285e;
                    if (!(lVar != null && lVar.f6826a.get() == fVar)) {
                        z9 = false;
                    }
                }
            }
            if (z9) {
                h.f6805x.post(new d(hVar, 1));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i, int i9, int i10, int i11) {
        super.onLayout(z9, i, i9, i10, i11);
        h hVar = this.f6792a;
        if (hVar == null || !hVar.f6822r) {
            return;
        }
        hVar.e();
        hVar.f6822r = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i9) {
        super.onMeasure(i, i9);
        int i10 = this.f6797f;
        if (i10 <= 0 || getMeasuredWidth() <= i10) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), i9);
    }

    public void setAnimationMode(int i) {
        this.f6794c = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f6799n != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f6799n);
            drawable.setTintMode(this.f6800o);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f6799n = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.f6800o);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f6800o = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintMode(mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (this.q || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.f6801p = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        h hVar = this.f6792a;
        if (hVar != null) {
            l1.a aVar = h.f6802u;
            hVar.f();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f6791r);
        super.setOnClickListener(onClickListener);
    }
}
