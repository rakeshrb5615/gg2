package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public class q extends Button {

    /* renamed from: a  reason: collision with root package name */
    public final p f4258a;

    /* renamed from: b  reason: collision with root package name */
    public final x0 f4259b;

    /* renamed from: c  reason: collision with root package name */
    public x f4260c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        u2.a(context);
        t2.a(this, getContext());
        p pVar = new p(this);
        this.f4258a = pVar;
        pVar.q(attributeSet, i);
        x0 x0Var = new x0(this);
        this.f4259b = x0Var;
        x0Var.f(attributeSet, i);
        x0Var.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private x getEmojiTextViewHelper() {
        if (this.f4260c == null) {
            this.f4260c = new x(this);
        }
        return this.f4260c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.f4258a;
        if (pVar != null) {
            pVar.a();
        }
        x0 x0Var = this.f4259b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (k3.f4205c) {
            return super.getAutoSizeMaxTextSize();
        }
        x0 x0Var = this.f4259b;
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
        x0 x0Var = this.f4259b;
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
        x0 x0Var = this.f4259b;
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
        x0 x0Var = this.f4259b;
        return x0Var != null ? x0Var.i.f4140f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (k3.f4205c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        x0 x0Var = this.f4259b;
        if (x0Var != null) {
            return x0Var.i.f4135a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return c4.b.h0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        p pVar = this.f4258a;
        if (pVar != null) {
            return pVar.o();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        p pVar = this.f4258a;
        if (pVar != null) {
            return pVar.p();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4259b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4259b.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z9, int i, int i9, int i10, int i11) {
        super.onLayout(z9, i, i9, i10, i11);
        x0 x0Var = this.f4259b;
        if (x0Var == null || k3.f4205c) {
            return;
        }
        x0Var.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        super.onTextChanged(charSequence, i, i9, i10);
        x0 x0Var = this.f4259b;
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
        x0 x0Var = this.f4259b;
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
        x0 x0Var = this.f4259b;
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
        x0 x0Var = this.f4259b;
        if (x0Var != null) {
            x0Var.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p pVar = this.f4258a;
        if (pVar != null) {
            pVar.r();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        p pVar = this.f4258a;
        if (pVar != null) {
            pVar.s(i);
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

    public void setSupportAllCaps(boolean z9) {
        x0 x0Var = this.f4259b;
        if (x0Var != null) {
            x0Var.f4336a.setAllCaps(z9);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        p pVar = this.f4258a;
        if (pVar != null) {
            pVar.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        p pVar = this.f4258a;
        if (pVar != null) {
            pVar.v(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f4259b;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f4259b;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        x0 x0Var = this.f4259b;
        if (x0Var != null) {
            x0Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f9) {
        boolean z9 = k3.f4205c;
        if (z9) {
            super.setTextSize(i, f9);
            return;
        }
        x0 x0Var = this.f4259b;
        if (x0Var != null) {
            g1 g1Var = x0Var.i;
            if (z9 || g1Var.f()) {
                return;
            }
            g1Var.g(i, f9);
        }
    }
}
