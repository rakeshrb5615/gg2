package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public class b1 extends TextView {

    /* renamed from: a  reason: collision with root package name */
    public final p f4088a;

    /* renamed from: b  reason: collision with root package name */
    public final x0 f4089b;

    /* renamed from: c  reason: collision with root package name */
    public final c0 f4090c;

    /* renamed from: d  reason: collision with root package name */
    public x f4091d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4092e;

    /* renamed from: f  reason: collision with root package name */
    public j6.o f4093f;

    /* renamed from: m  reason: collision with root package name */
    public Future f4094m;

    public b1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private x getEmojiTextViewHelper() {
        if (this.f4091d == null) {
            this.f4091d = new x(this);
        }
        return this.f4091d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.f4088a;
        if (pVar != null) {
            pVar.a();
        }
        x0 x0Var = this.f4089b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (k3.f4205c) {
            return super.getAutoSizeMaxTextSize();
        }
        x0 x0Var = this.f4089b;
        if (x0Var != null) {
            return Math.round(x0Var.i.f4139e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (k3.f4205c) {
            return super.getAutoSizeMinTextSize();
        }
        x0 x0Var = this.f4089b;
        if (x0Var != null) {
            return Math.round(x0Var.i.f4138d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (k3.f4205c) {
            return super.getAutoSizeStepGranularity();
        }
        x0 x0Var = this.f4089b;
        if (x0Var != null) {
            return Math.round(x0Var.i.f4137c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (k3.f4205c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        x0 x0Var = this.f4089b;
        return x0Var != null ? x0Var.i.f4140f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (k3.f4205c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        x0 x0Var = this.f4089b;
        if (x0Var != null) {
            return x0Var.i.f4135a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return c4.b.h0(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public y0 getSuperCaller() {
        if (this.f4093f == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f4093f = new a1(this);
            } else if (i >= 28) {
                this.f4093f = new z0(this);
            } else {
                this.f4093f = new j6.o(this, 6);
            }
        }
        return this.f4093f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        p pVar = this.f4088a;
        if (pVar != null) {
            return pVar.o();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        p pVar = this.f4088a;
        if (pVar != null) {
            return pVar.p();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4089b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4089b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f4094m;
        if (future != null) {
            try {
                this.f4094m = null;
                if (future.get() == null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        throw null;
                    }
                    c4.b.E(this);
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        c0 c0Var;
        if (Build.VERSION.SDK_INT >= 28 || (c0Var = this.f4090c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0Var.f4102c;
        return textClassifier == null ? s0.a((TextView) c0Var.f4101b) : textClassifier;
    }

    public o0.c getTextMetricsParamsCompat() {
        return c4.b.E(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f4089b.getClass();
        x0.h(editorInfo, onCreateInputConnection, this);
        a.a.M(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z9, int i, int i9, int i10, int i11) {
        super.onLayout(z9, i, i9, i10, i11);
        x0 x0Var = this.f4089b;
        if (x0Var == null || k3.f4205c) {
            return;
        }
        x0Var.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i9) {
        Future future = this.f4094m;
        if (future != null) {
            try {
                this.f4094m = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                c4.b.E(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i9);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        super.onTextChanged(charSequence, i, i9, i10);
        x0 x0Var = this.f4089b;
        if (x0Var != null) {
            g1 g1Var = x0Var.i;
            if (k3.f4205c || !g1Var.f()) {
                return;
            }
            g1Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().c(z9);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i9, int i10, int i11) {
        if (k3.f4205c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i9, i10, i11);
            return;
        }
        x0 x0Var = this.f4089b;
        if (x0Var != null) {
            x0Var.i(i, i9, i10, i11);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (k3.f4205c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        x0 x0Var = this.f4089b;
        if (x0Var != null) {
            x0Var.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (k3.f4205c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        x0 x0Var = this.f4089b;
        if (x0Var != null) {
            x0Var.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p pVar = this.f4088a;
        if (pVar != null) {
            pVar.r();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        p pVar = this.f4088a;
        if (pVar != null) {
            pVar.s(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f4089b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f4089b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f4089b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f4089b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c4.b.i0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().d(z9);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().k(i);
        } else {
            c4.b.X(i, this);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().c(i);
        } else {
            c4.b.Y(i, this);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        c4.b.Z(i, this);
    }

    public void setPrecomputedText(o0.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        c4.b.E(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        p pVar = this.f4088a;
        if (pVar != null) {
            pVar.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        p pVar = this.f4088a;
        if (pVar != null) {
            pVar.v(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f4089b;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f4089b;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        x0 x0Var = this.f4089b;
        if (x0Var != null) {
            x0Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        c0 c0Var;
        if (Build.VERSION.SDK_INT >= 28 || (c0Var = this.f4090c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0Var.f4102c = textClassifier;
        }
    }

    public void setTextFuture(Future<o0.d> future) {
        this.f4094m = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(o0.c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f4991b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(cVar.f4990a);
        setBreakStrategy(cVar.f4992c);
        setHyphenationFrequency(cVar.f4993d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f9) {
        boolean z9 = k3.f4205c;
        if (z9) {
            super.setTextSize(i, f9);
            return;
        }
        x0 x0Var = this.f4089b;
        if (x0Var != null) {
            g1 g1Var = x0Var.i;
            if (z9 || g1Var.f()) {
                return;
            }
            g1Var.g(i, f9);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.f4092e) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            c4.b bVar = h0.e.f2132a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.f4092e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f4092e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        u2.a(context);
        this.f4092e = false;
        this.f4093f = null;
        t2.a(this, getContext());
        p pVar = new p(this);
        this.f4088a = pVar;
        pVar.q(attributeSet, i);
        x0 x0Var = new x0(this);
        this.f4089b = x0Var;
        x0Var.f(attributeSet, i);
        x0Var.b();
        c0 c0Var = new c0();
        c0Var.f4101b = this;
        this.f4090c = c0Var;
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    public final void setLineHeight(int i, float f9) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 34) {
            getSuperCaller().m(i, f9);
        } else if (i9 >= 34) {
            q0.a0.h(this, i, f9);
        } else {
            c4.b.Z(Math.round(TypedValue.applyDimension(i, f9, getResources().getDisplayMetrics())), this);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i9, int i10, int i11) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? j5.t1.A(context, i) : null, i9 != 0 ? j5.t1.A(context, i9) : null, i10 != 0 ? j5.t1.A(context, i10) : null, i11 != 0 ? j5.t1.A(context, i11) : null);
        x0 x0Var = this.f4089b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i9, int i10, int i11) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? j5.t1.A(context, i) : null, i9 != 0 ? j5.t1.A(context, i9) : null, i10 != 0 ? j5.t1.A(context, i10) : null, i11 != 0 ? j5.t1.A(context, i11) : null);
        x0 x0Var = this.f4089b;
        if (x0Var != null) {
            x0Var.b();
        }
    }
}
