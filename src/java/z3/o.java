package z3;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import j5.t1;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n.b1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class o extends LinearLayout {
    public AccessibilityManager.TouchExplorationStateChangeListener A;
    public final l B;

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f7223a;

    /* renamed from: b  reason: collision with root package name */
    public final FrameLayout f7224b;

    /* renamed from: c  reason: collision with root package name */
    public final CheckableImageButton f7225c;

    /* renamed from: d  reason: collision with root package name */
    public ColorStateList f7226d;

    /* renamed from: e  reason: collision with root package name */
    public PorterDuff.Mode f7227e;

    /* renamed from: f  reason: collision with root package name */
    public View.OnLongClickListener f7228f;

    /* renamed from: m  reason: collision with root package name */
    public final CheckableImageButton f7229m;

    /* renamed from: n  reason: collision with root package name */
    public final n f7230n;

    /* renamed from: o  reason: collision with root package name */
    public int f7231o;

    /* renamed from: p  reason: collision with root package name */
    public final LinkedHashSet f7232p;
    public ColorStateList q;

    /* renamed from: r  reason: collision with root package name */
    public PorterDuff.Mode f7233r;

    /* renamed from: s  reason: collision with root package name */
    public int f7234s;

    /* renamed from: t  reason: collision with root package name */
    public ImageView.ScaleType f7235t;

    /* renamed from: u  reason: collision with root package name */
    public View.OnLongClickListener f7236u;

    /* renamed from: v  reason: collision with root package name */
    public CharSequence f7237v;

    /* renamed from: w  reason: collision with root package name */
    public final b1 f7238w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f7239x;

    /* renamed from: y  reason: collision with root package name */
    public EditText f7240y;

    /* renamed from: z  reason: collision with root package name */
    public final AccessibilityManager f7241z;

    public o(TextInputLayout textInputLayout, b8.g gVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f7231o = 0;
        this.f7232p = new LinkedHashSet();
        this.B = new l(this);
        m mVar = new m(this);
        this.f7241z = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f7223a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f7224b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a10 = a(this, from, 2131362501);
        this.f7225c = a10;
        CheckableImageButton a11 = a(frameLayout, from, 2131362500);
        this.f7229m = a11;
        this.f7230n = new n(this, gVar);
        b1 b1Var = new b1(getContext(), null);
        this.f7238w = b1Var;
        TypedArray typedArray = (TypedArray) gVar.f790c;
        if (typedArray.hasValue(38)) {
            this.f7226d = t1.w(getContext(), gVar, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f7227e = q3.k.g(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(gVar.i(37));
        }
        a10.setContentDescription(getResources().getText(2131951834));
        a10.setImportantForAccessibility(2);
        a10.setClickable(false);
        a10.setPressable(false);
        a10.setCheckable(false);
        a10.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.q = t1.w(getContext(), gVar, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f7233r = q3.k.g(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && a11.getContentDescription() != (text = typedArray.getText(27))) {
                a11.setContentDescription(text);
            }
            a11.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.q = t1.w(getContext(), gVar, 55);
            }
            if (typedArray.hasValue(56)) {
                this.f7233r = q3.k.g(typedArray.getInt(56, -1), null);
            }
            g(typedArray.getBoolean(54, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(52);
            if (a11.getContentDescription() != text2) {
                a11.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(2131166140));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f7234s) {
            this.f7234s = dimensionPixelSize;
            a11.setMinimumWidth(dimensionPixelSize);
            a11.setMinimumHeight(dimensionPixelSize);
            a10.setMinimumWidth(dimensionPixelSize);
            a10.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType d9 = y0.d.d(typedArray.getInt(31, -1));
            this.f7235t = d9;
            a11.setScaleType(d9);
            a10.setScaleType(d9);
        }
        b1Var.setVisibility(8);
        b1Var.setId(2131362508);
        b1Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        b1Var.setAccessibilityLiveRegion(1);
        b1Var.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            b1Var.setTextColor(gVar.h(74));
        }
        CharSequence text3 = typedArray.getText(72);
        this.f7237v = TextUtils.isEmpty(text3) ? null : text3;
        b1Var.setText(text3);
        n();
        frameLayout.addView(a11);
        addView(b1Var);
        addView(frameLayout);
        addView(a10);
        textInputLayout.l0.add(mVar);
        if (textInputLayout.e != null) {
            mVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new f3.b(this, 4));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton inflate = layoutInflater.inflate(2131558448, viewGroup, false);
        inflate.setId(i);
        if (t1.J(getContext())) {
            ((ViewGroup.MarginLayoutParams) inflate.getLayoutParams()).setMarginStart(0);
        }
        return inflate;
    }

    public final p b() {
        p eVar;
        int i = this.f7231o;
        n nVar = this.f7230n;
        SparseArray sparseArray = nVar.f7219a;
        p pVar = (p) sparseArray.get(i);
        if (pVar == null) {
            o oVar = nVar.f7220b;
            if (i == -1) {
                eVar = new e(oVar, 0);
            } else if (i == 0) {
                eVar = new e(oVar, 1);
            } else if (i == 1) {
                eVar = new v(oVar, nVar.f7222d);
            } else if (i == 2) {
                eVar = new d(oVar);
            } else if (i != 3) {
                throw new IllegalArgumentException(g2.g.c(i, "Invalid end icon mode: "));
            } else {
                eVar = new k(oVar);
            }
            sparseArray.append(i, eVar);
            return eVar;
        }
        return pVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f7229m;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.f7238w.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f7224b.getVisibility() == 0 && this.f7229m.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f7225c.getVisibility() == 0;
    }

    public final void f(boolean z9) {
        boolean z10;
        boolean isActivated;
        boolean z11;
        p b10 = b();
        boolean j = b10.j();
        CheckableImageButton checkableImageButton = this.f7229m;
        boolean z12 = true;
        if (!j || (z11 = checkableImageButton.d) == b10.k()) {
            z10 = false;
        } else {
            checkableImageButton.setChecked(!z11);
            z10 = true;
        }
        if (!(b10 instanceof k) || (isActivated = checkableImageButton.isActivated()) == ((k) b10).f7211l) {
            z12 = z10;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z9 || z12) {
            y0.d.h(this.f7223a, checkableImageButton, this.q);
        }
    }

    public final void g(int i) {
        if (this.f7231o == i) {
            return;
        }
        p b10 = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.A;
        AccessibilityManager accessibilityManager = this.f7241z;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.A = null;
        b10.r();
        this.f7231o = i;
        Iterator it = this.f7232p.iterator();
        if (it.hasNext()) {
            throw v1.a.e(it);
        }
        h(i != 0);
        p b11 = b();
        int i9 = this.f7230n.f7221c;
        if (i9 == 0) {
            i9 = b11.d();
        }
        Drawable A = i9 != 0 ? t1.A(getContext(), i9) : null;
        CheckableImageButton checkableImageButton = this.f7229m;
        checkableImageButton.setImageDrawable(A);
        TextInputLayout textInputLayout = this.f7223a;
        if (A != null) {
            y0.d.a(textInputLayout, checkableImageButton, this.q, this.f7233r);
            y0.d.h(textInputLayout, checkableImageButton, this.q);
        }
        int c9 = b11.c();
        CharSequence text = c9 != 0 ? getResources().getText(c9) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(b11.j());
        if (!b11.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        b11.q();
        AccessibilityManager.TouchExplorationStateChangeListener h9 = b11.h();
        this.A = h9;
        if (h9 != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.A);
        }
        View.OnClickListener f9 = b11.f();
        View.OnLongClickListener onLongClickListener = this.f7236u;
        checkableImageButton.setOnClickListener(f9);
        y0.d.i(checkableImageButton, onLongClickListener);
        EditText editText = this.f7240y;
        if (editText != null) {
            b11.l(editText);
            j(b11);
        }
        y0.d.a(textInputLayout, checkableImageButton, this.q, this.f7233r);
        f(true);
    }

    public final void h(boolean z9) {
        if (d() != z9) {
            this.f7229m.setVisibility(z9 ? 0 : 8);
            k();
            m();
            this.f7223a.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f7225c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        y0.d.a(this.f7223a, checkableImageButton, this.f7226d, this.f7227e);
    }

    public final void j(p pVar) {
        if (this.f7240y == null) {
            return;
        }
        if (pVar.e() != null) {
            this.f7240y.setOnFocusChangeListener(pVar.e());
        }
        if (pVar.g() != null) {
            this.f7229m.setOnFocusChangeListener(pVar.g());
        }
    }

    public final void k() {
        int i = 8;
        this.f7224b.setVisibility((this.f7229m.getVisibility() != 0 || e()) ? 8 : 0);
        boolean z9 = (this.f7237v == null || this.f7239x) ? true : false;
        if (d() || e() || !z9) {
            i = 0;
        }
        setVisibility(i);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f7225c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f7223a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.q.q && textInputLayout.o()) ? 0 : 8);
        k();
        m();
        if (this.f7231o != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void m() {
        TextInputLayout textInputLayout = this.f7223a;
        if (textInputLayout.e == null) {
            return;
        }
        this.f7238w.setPaddingRelative(getContext().getResources().getDimensionPixelSize(2131166009), textInputLayout.e.getPaddingTop(), (d() || e()) ? 0 : textInputLayout.e.getPaddingEnd(), textInputLayout.e.getPaddingBottom());
    }

    public final void n() {
        b1 b1Var = this.f7238w;
        int visibility = b1Var.getVisibility();
        int i = (this.f7237v == null || this.f7239x) ? 8 : 0;
        if (visibility != i) {
            b().o(i == 0);
        }
        k();
        b1Var.setVisibility(i);
        this.f7223a.s();
    }
}
