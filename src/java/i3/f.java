package i3;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import f1.h;
import j5.t1;
import v3.a0;
import v3.d0;
import v3.k;
import v3.p;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final MaterialButton f2652a;

    /* renamed from: b  reason: collision with root package name */
    public p f2653b;

    /* renamed from: c  reason: collision with root package name */
    public d0 f2654c;

    /* renamed from: d  reason: collision with root package name */
    public h f2655d;

    /* renamed from: e  reason: collision with root package name */
    public a5.a f2656e;

    /* renamed from: f  reason: collision with root package name */
    public int f2657f;

    /* renamed from: g  reason: collision with root package name */
    public int f2658g;

    /* renamed from: h  reason: collision with root package name */
    public int f2659h;
    public int i;
    public int j;

    /* renamed from: k  reason: collision with root package name */
    public int f2660k;

    /* renamed from: l  reason: collision with root package name */
    public PorterDuff.Mode f2661l;

    /* renamed from: m  reason: collision with root package name */
    public ColorStateList f2662m;

    /* renamed from: n  reason: collision with root package name */
    public ColorStateList f2663n;

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f2664o;

    /* renamed from: p  reason: collision with root package name */
    public k f2665p;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2668t;

    /* renamed from: v  reason: collision with root package name */
    public RippleDrawable f2670v;

    /* renamed from: w  reason: collision with root package name */
    public int f2671w;
    public boolean q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2666r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2667s = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2669u = true;

    public f(MaterialButton materialButton, p pVar) {
        this.f2652a = materialButton;
        this.f2653b = pVar;
    }

    public final k a(boolean z9) {
        RippleDrawable rippleDrawable = this.f2670v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (k) ((LayerDrawable) ((InsetDrawable) this.f2670v.getDrawable(0)).getDrawable()).getDrawable(!z9 ? 1 : 0);
    }

    public final void b(int i, int i9) {
        MaterialButton materialButton = this.f2652a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i10 = this.f2659h;
        int i11 = this.i;
        this.i = i9;
        this.f2659h = i;
        if (!this.f2666r) {
            c();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i10, paddingEnd, (paddingBottom + i9) - i11);
    }

    public final void c() {
        k kVar = new k(this.f2653b);
        d0 d0Var = this.f2654c;
        if (d0Var != null) {
            kVar.q(d0Var);
        }
        h hVar = this.f2655d;
        if (hVar != null) {
            kVar.m(hVar);
        }
        a5.a aVar = this.f2656e;
        if (aVar != null) {
            kVar.J = aVar;
        }
        MaterialButton materialButton = this.f2652a;
        kVar.l(materialButton.getContext());
        kVar.setTintList(this.f2662m);
        PorterDuff.Mode mode = this.f2661l;
        if (mode != null) {
            kVar.setTintMode(mode);
        }
        ColorStateList colorStateList = this.f2663n;
        kVar.f6213b.f6204k = this.f2660k;
        kVar.invalidateSelf();
        kVar.r(colorStateList);
        k kVar2 = new k(this.f2653b);
        d0 d0Var2 = this.f2654c;
        if (d0Var2 != null) {
            kVar2.q(d0Var2);
        }
        h hVar2 = this.f2655d;
        if (hVar2 != null) {
            kVar2.m(hVar2);
        }
        kVar2.setTint(0);
        float f9 = this.f2660k;
        int u9 = this.q ? t1.u(materialButton, 2130968890) : 0;
        kVar2.f6213b.f6204k = f9;
        kVar2.invalidateSelf();
        kVar2.r(ColorStateList.valueOf(u9));
        k kVar3 = new k(this.f2653b);
        this.f2665p = kVar3;
        d0 d0Var3 = this.f2654c;
        if (d0Var3 != null) {
            kVar3.q(d0Var3);
        }
        h hVar3 = this.f2655d;
        if (hVar3 != null) {
            this.f2665p.m(hVar3);
        }
        this.f2665p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(t3.a.a(this.f2664o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{kVar2, kVar}), this.f2657f, this.f2659h, this.f2658g, this.i), this.f2665p);
        this.f2670v = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        k a10 = a(false);
        if (a10 != null) {
            a10.n(this.f2671w);
            a10.setState(materialButton.getDrawableState());
        }
    }

    public final void d() {
        k a10 = a(false);
        if (a10 != null) {
            d0 d0Var = this.f2654c;
            if (d0Var != null) {
                a10.q(d0Var);
            } else {
                a10.setShapeAppearanceModel(this.f2653b);
            }
            h hVar = this.f2655d;
            if (hVar != null) {
                a10.m(hVar);
            }
        }
        k a11 = a(true);
        if (a11 != null) {
            d0 d0Var2 = this.f2654c;
            if (d0Var2 != null) {
                a11.q(d0Var2);
            } else {
                a11.setShapeAppearanceModel(this.f2653b);
            }
            h hVar2 = this.f2655d;
            if (hVar2 != null) {
                a11.m(hVar2);
            }
        }
        RippleDrawable rippleDrawable = this.f2670v;
        a0 a0Var = (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) ? null : this.f2670v.getNumberOfLayers() > 2 ? (a0) this.f2670v.getDrawable(2) : (a0) this.f2670v.getDrawable(1);
        if (a0Var != null) {
            a0Var.setShapeAppearanceModel(this.f2653b);
            if (a0Var instanceof k) {
                k kVar = (k) a0Var;
                d0 d0Var3 = this.f2654c;
                if (d0Var3 != null) {
                    kVar.q(d0Var3);
                }
                h hVar3 = this.f2655d;
                if (hVar3 != null) {
                    kVar.m(hVar3);
                }
            }
        }
    }

    public final void e() {
        k a10 = a(false);
        k a11 = a(true);
        if (a10 != null) {
            ColorStateList colorStateList = this.f2663n;
            a10.f6213b.f6204k = this.f2660k;
            a10.invalidateSelf();
            a10.r(colorStateList);
            if (a11 != null) {
                float f9 = this.f2660k;
                int u9 = this.q ? t1.u(this.f2652a, 2130968890) : 0;
                a11.f6213b.f6204k = f9;
                a11.invalidateSelf();
                a11.r(ColorStateList.valueOf(u9));
            }
        }
    }
}
