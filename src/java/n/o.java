package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public class o extends AutoCompleteTextView {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f4235d = {16843126};

    /* renamed from: a  reason: collision with root package name */
    public final p f4236a;

    /* renamed from: b  reason: collision with root package name */
    public final x0 f4237b;

    /* renamed from: c  reason: collision with root package name */
    public final c0 f4238c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968648);
        u2.a(context);
        t2.a(this, getContext());
        b8.g p8 = b8.g.p(getContext(), attributeSet, f4235d, 2130968648);
        if (((TypedArray) p8.f790c).hasValue(0)) {
            setDropDownBackgroundDrawable(p8.i(0));
        }
        p8.r();
        p pVar = new p(this);
        this.f4236a = pVar;
        pVar.q(attributeSet, 2130968648);
        x0 x0Var = new x0(this);
        this.f4237b = x0Var;
        x0Var.f(attributeSet, 2130968648);
        x0Var.b();
        c0 c0Var = new c0(this);
        this.f4238c = c0Var;
        c0Var.b(attributeSet, 2130968648);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a10 = c0Var.a(keyListener);
        if (a10 == keyListener) {
            return;
        }
        super.setKeyListener(a10);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.f4236a;
        if (pVar != null) {
            pVar.a();
        }
        x0 x0Var = this.f4237b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return c4.b.h0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        p pVar = this.f4236a;
        if (pVar != null) {
            return pVar.o();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        p pVar = this.f4236a;
        if (pVar != null) {
            return pVar.p();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4237b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4237b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.a.M(editorInfo, onCreateInputConnection, this);
        return this.f4238c.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p pVar = this.f4236a;
        if (pVar != null) {
            pVar.r();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        p pVar = this.f4236a;
        if (pVar != null) {
            pVar.s(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f4237b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f4237b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c4.b.i0(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(j5.t1.A(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        this.f4238c.d(z9);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f4238c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        p pVar = this.f4236a;
        if (pVar != null) {
            pVar.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        p pVar = this.f4236a;
        if (pVar != null) {
            pVar.v(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f4237b;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f4237b;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        x0 x0Var = this.f4237b;
        if (x0Var != null) {
            x0Var.g(context, i);
        }
    }
}
