package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public class r extends CheckBox implements t0.j {

    /* renamed from: a  reason: collision with root package name */
    public final t f4261a;

    /* renamed from: b  reason: collision with root package name */
    public final p f4262b;

    /* renamed from: c  reason: collision with root package name */
    public final x0 f4263c;

    /* renamed from: d  reason: collision with root package name */
    public x f4264d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        u2.a(context);
        t2.a(this, getContext());
        t tVar = new t(this);
        this.f4261a = tVar;
        tVar.c(attributeSet, i);
        p pVar = new p(this);
        this.f4262b = pVar;
        pVar.q(attributeSet, i);
        x0 x0Var = new x0(this);
        this.f4263c = x0Var;
        x0Var.f(attributeSet, i);
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private x getEmojiTextViewHelper() {
        if (this.f4264d == null) {
            this.f4264d = new x(this);
        }
        return this.f4264d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.f4262b;
        if (pVar != null) {
            pVar.a();
        }
        x0 x0Var = this.f4263c;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        p pVar = this.f4262b;
        if (pVar != null) {
            return pVar.o();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        p pVar = this.f4262b;
        if (pVar != null) {
            return pVar.p();
        }
        return null;
    }

    @Override // t0.j
    public ColorStateList getSupportButtonTintList() {
        t tVar = this.f4261a;
        if (tVar != null) {
            return tVar.f4282a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        t tVar = this.f4261a;
        if (tVar != null) {
            return tVar.f4283b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4263c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4263c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().c(z9);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p pVar = this.f4262b;
        if (pVar != null) {
            pVar.r();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        p pVar = this.f4262b;
        if (pVar != null) {
            pVar.s(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        t tVar = this.f4261a;
        if (tVar != null) {
            if (tVar.f4286e) {
                tVar.f4286e = false;
                return;
            }
            tVar.f4286e = true;
            tVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f4263c;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f4263c;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().d(z9);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        p pVar = this.f4262b;
        if (pVar != null) {
            pVar.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        p pVar = this.f4262b;
        if (pVar != null) {
            pVar.v(mode);
        }
    }

    @Override // t0.j
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        t tVar = this.f4261a;
        if (tVar != null) {
            tVar.f4282a = colorStateList;
            tVar.f4284c = true;
            tVar.a();
        }
    }

    @Override // t0.j
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        t tVar = this.f4261a;
        if (tVar != null) {
            tVar.f4283b = mode;
            tVar.f4285d = true;
            tVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f4263c;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f4263c;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(j5.t1.A(getContext(), i));
    }
}
