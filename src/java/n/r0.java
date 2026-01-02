package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class r0 extends Spinner {

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f4265o = {16843505};

    /* renamed from: a  reason: collision with root package name */
    public final p f4266a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f4267b;

    /* renamed from: c  reason: collision with root package name */
    public final i0 f4268c;

    /* renamed from: d  reason: collision with root package name */
    public SpinnerAdapter f4269d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f4270e;

    /* renamed from: f  reason: collision with root package name */
    public final q0 f4271f;

    /* renamed from: m  reason: collision with root package name */
    public int f4272m;

    /* renamed from: n  reason: collision with root package name */
    public final Rect f4273n;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r7 == null) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r0(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r12 = this;
            r0 = 2130969761(0x7f0404a1, float:1.7548213E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.f4273n = r1
            android.content.Context r1 = r12.getContext()
            n.t2.a(r12, r1)
            int[] r1 = g.a.f1587u
            b8.g r2 = b8.g.p(r13, r14, r1, r0)
            java.lang.Object r3 = r2.f790c
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            n.p r4 = new n.p
            r4.<init>(r12)
            r12.f4266a = r4
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L35
            l.c r6 = new l.c
            r6.<init>(r13, r4)
            r12.f4267b = r6
            goto L37
        L35:
            r12.f4267b = r13
        L37:
            r4 = -1
            r6 = 0
            int[] r7 = n.r0.f4265o     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r5)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            boolean r8 = r7.hasValue(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            if (r8 == 0) goto L50
            int r4 = r7.getInt(r5, r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            goto L50
        L4a:
            r13 = move-exception
            r6 = r7
            goto Ld5
        L4e:
            r8 = move-exception
            goto L59
        L50:
            r7.recycle()
            goto L63
        L54:
            r13 = move-exception
            goto Ld5
        L57:
            r8 = move-exception
            r7 = r6
        L59:
            java.lang.String r9 = "AppCompatSpinner"
            java.lang.String r10 = "Could not read android:spinnerMode"
            android.util.Log.i(r9, r10, r8)     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L63
            goto L50
        L63:
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L9d
            if (r4 == r8) goto L6a
            goto Laa
        L6a:
            n.o0 r4 = new n.o0
            android.content.Context r9 = r12.f4267b
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.f4267b
            b8.g r1 = b8.g.p(r9, r14, r1, r0)
            java.lang.Object r9 = r1.f790c
            android.content.res.TypedArray r9 = (android.content.res.TypedArray) r9
            r10 = 3
            r11 = -2
            int r9 = r9.getLayoutDimension(r10, r11)
            r12.f4272m = r9
            android.graphics.drawable.Drawable r9 = r1.i(r8)
            r4.h(r9)
            java.lang.String r7 = r3.getString(r7)
            r4.I = r7
            r1.r()
            r12.f4271f = r4
            n.i0 r1 = new n.i0
            r1.<init>(r12, r12, r4)
            r12.f4268c = r1
            goto Laa
        L9d:
            n.k0 r1 = new n.k0
            r1.<init>(r12)
            r12.f4271f = r1
            java.lang.String r4 = r3.getString(r7)
            r1.f4197c = r4
        Laa:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto Lc1
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 2131558550(0x7f0d0096, float:1.8742419E38)
            r3.setDropDownViewResource(r13)
            r12.setAdapter(r3)
        Lc1:
            r2.r()
            r12.f4270e = r8
            android.widget.SpinnerAdapter r13 = r12.f4269d
            if (r13 == 0) goto Lcf
            r12.setAdapter(r13)
            r12.f4269d = r6
        Lcf:
            n.p r13 = r12.f4266a
            r13.q(r14, r0)
            return
        Ld5:
            if (r6 == 0) goto Lda
            r6.recycle()
        Lda:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: n.r0.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i9 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i9 = Math.max(i9, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.f4273n;
            drawable.getPadding(rect);
            return rect.left + rect.right + i9;
        }
        return i9;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.f4266a;
        if (pVar != null) {
            pVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        q0 q0Var = this.f4271f;
        return q0Var != null ? q0Var.a() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        q0 q0Var = this.f4271f;
        return q0Var != null ? q0Var.m() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f4271f != null ? this.f4272m : super.getDropDownWidth();
    }

    public final q0 getInternalPopup() {
        return this.f4271f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        q0 q0Var = this.f4271f;
        return q0Var != null ? q0Var.e() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f4267b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        q0 q0Var = this.f4271f;
        return q0Var != null ? q0Var.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        p pVar = this.f4266a;
        if (pVar != null) {
            return pVar.o();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        p pVar = this.f4266a;
        if (pVar != null) {
            return pVar.p();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q0 q0Var = this.f4271f;
        if (q0Var == null || !q0Var.b()) {
            return;
        }
        q0Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i9) {
        super.onMeasure(i, i9);
        if (this.f4271f == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        p0 p0Var = (p0) parcelable;
        super.onRestoreInstanceState(p0Var.getSuperState());
        if (!p0Var.f4245a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new m.d(this, 2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, n.p0, android.os.Parcelable] */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        q0 q0Var = this.f4271f;
        baseSavedState.f4245a = q0Var != null && q0Var.b();
        return baseSavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        i0 i0Var = this.f4268c;
        if (i0Var == null || !i0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        q0 q0Var = this.f4271f;
        if (q0Var != null) {
            if (q0Var.b()) {
                return true;
            }
            q0Var.l(getTextDirection(), getTextAlignment());
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p pVar = this.f4266a;
        if (pVar != null) {
            pVar.r();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        p pVar = this.f4266a;
        if (pVar != null) {
            pVar.s(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        q0 q0Var = this.f4271f;
        if (q0Var == null) {
            super.setDropDownHorizontalOffset(i);
            return;
        }
        q0Var.j(i);
        q0Var.k(i);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        q0 q0Var = this.f4271f;
        if (q0Var != null) {
            q0Var.i(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f4271f != null) {
            this.f4272m = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        q0 q0Var = this.f4271f;
        if (q0Var != null) {
            q0Var.h(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(j5.t1.A(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        q0 q0Var = this.f4271f;
        if (q0Var != null) {
            q0Var.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        p pVar = this.f4266a;
        if (pVar != null) {
            pVar.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        p pVar = this.f4266a;
        if (pVar != null) {
            pVar.v(mode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.widget.ListAdapter, n.l0, java.lang.Object] */
    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f4270e) {
            this.f4269d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        q0 q0Var = this.f4271f;
        if (q0Var != 0) {
            Context context = this.f4267b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ?? obj = new Object();
            obj.f4206a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                obj.f4207b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                j0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            q0Var.p(obj);
        }
    }
}
