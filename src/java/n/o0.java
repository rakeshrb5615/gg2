package n;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class o0 extends g2 implements q0 {
    public CharSequence I;
    public l0 J;
    public final Rect K;
    public int L;
    public final /* synthetic */ r0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(r0 r0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969761, 0);
        this.M = r0Var;
        this.K = new Rect();
        this.f4157u = r0Var;
        this.E = true;
        this.F.setFocusable(true);
        this.f4158v = new m0(this, 0);
    }

    @Override // n.q0
    public final void g(CharSequence charSequence) {
        this.I = charSequence;
    }

    @Override // n.q0
    public final void j(int i) {
        this.L = i;
    }

    @Override // n.q0
    public final void l(int i, int i9) {
        ViewTreeObserver viewTreeObserver;
        b0 b0Var = this.F;
        boolean isShowing = b0Var.isShowing();
        s();
        b0Var.setInputMethodMode(2);
        c();
        t1 t1Var = this.f4146c;
        t1Var.setChoiceMode(1);
        t1Var.setTextDirection(i);
        t1Var.setTextAlignment(i9);
        r0 r0Var = this.M;
        int selectedItemPosition = r0Var.getSelectedItemPosition();
        t1 t1Var2 = this.f4146c;
        if (b0Var.isShowing() && t1Var2 != null) {
            t1Var2.setListSelectionHidden(false);
            t1Var2.setSelection(selectedItemPosition);
            if (t1Var2.getChoiceMode() != 0) {
                t1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = r0Var.getViewTreeObserver()) == null) {
            return;
        }
        m.d dVar = new m.d(this, 3);
        viewTreeObserver.addOnGlobalLayoutListener(dVar);
        b0Var.setOnDismissListener(new n0(this, dVar));
    }

    @Override // n.q0
    public final CharSequence o() {
        return this.I;
    }

    @Override // n.g2, n.q0
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.J = (l0) listAdapter;
    }

    public final void s() {
        int i;
        r0 r0Var = this.M;
        Rect rect = r0Var.f4273n;
        b0 b0Var = this.F;
        Drawable background = b0Var.getBackground();
        if (background != null) {
            background.getPadding(rect);
            boolean z9 = k3.f4203a;
            i = r0Var.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = r0Var.getPaddingLeft();
        int paddingRight = r0Var.getPaddingRight();
        int width = r0Var.getWidth();
        int i9 = r0Var.f4272m;
        if (i9 == -2) {
            int a10 = r0Var.a(this.J, b0Var.getBackground());
            int i10 = (r0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a10 > i10) {
                a10 = i10;
            }
            r(Math.max(a10, (width - paddingLeft) - paddingRight));
        } else if (i9 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i9);
        }
        boolean z10 = k3.f4203a;
        this.f4149f = r0Var.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f4148e) - this.L) + i : paddingLeft + this.L + i;
    }
}
