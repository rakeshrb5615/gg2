package z3;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import j5.t1;
import java.util.List;
import java.util.Locale;
import n.g2;
import n.m0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class u extends n.o {

    /* renamed from: e  reason: collision with root package name */
    public final g2 f7278e;

    /* renamed from: f  reason: collision with root package name */
    public final AccessibilityManager f7279f;

    /* renamed from: m  reason: collision with root package name */
    public final Rect f7280m;

    /* renamed from: n  reason: collision with root package name */
    public final int f7281n;

    /* renamed from: o  reason: collision with root package name */
    public final float f7282o;

    /* renamed from: p  reason: collision with root package name */
    public ColorStateList f7283p;
    public int q;

    /* renamed from: r  reason: collision with root package name */
    public ColorStateList f7284r;

    public u(Context context, AttributeSet attributeSet) {
        super(a4.a.a(context, attributeSet, 2130968648, 0), attributeSet);
        this.f7280m = new Rect();
        Context context2 = getContext();
        TypedArray f9 = q3.k.f(context2, attributeSet, c3.a.i, 2130968648, 2132018028, new int[0]);
        if (f9.hasValue(0) && f9.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f7281n = f9.getResourceId(3, 2131558495);
        this.f7282o = f9.getDimensionPixelOffset(1, 2131166109);
        if (f9.hasValue(2)) {
            this.f7283p = ColorStateList.valueOf(f9.getColor(2, 0));
        }
        this.q = f9.getColor(4, 0);
        this.f7284r = t1.v(context2, f9, 5);
        this.f7279f = (AccessibilityManager) context2.getSystemService("accessibility");
        g2 g2Var = new g2(context2, null, 2130969414, 0);
        this.f7278e = g2Var;
        g2Var.E = true;
        g2Var.F.setFocusable(true);
        g2Var.f4157u = this;
        g2Var.F.setInputMethodMode(2);
        g2Var.p(getAdapter());
        g2Var.f4158v = new m0(this, 1);
        if (f9.hasValue(6)) {
            setSimpleItems(f9.getResourceId(6, 0));
        }
        f9.recycle();
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f7279f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
                return false;
            }
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.f7278e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f7283p;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b10 = b();
        return (b10 == null || !b10.L) ? super.getHint() : b10.getHint();
    }

    public float getPopupElevation() {
        return this.f7282o;
    }

    public int getSimpleItemSelectedColor() {
        return this.q;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f7284r;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b10 = b();
        if (b10 != null && b10.L && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7278e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i9) {
        super.onMeasure(i, i9);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b10 = b();
            int i10 = 0;
            if (adapter != null && b10 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                g2 g2Var = this.f7278e;
                int min = Math.min(adapter.getCount(), Math.max(0, !g2Var.F.isShowing() ? -1 : g2Var.f4146c.getSelectedItemPosition()) + 15);
                View view = null;
                int i11 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i10) {
                        view = null;
                        i10 = itemViewType;
                    }
                    view = adapter.getView(max, view, b10);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i11 = Math.max(i11, view.getMeasuredWidth());
                }
                Drawable background = g2Var.F.getBackground();
                if (background != null) {
                    Rect rect = this.f7280m;
                    background.getPadding(rect);
                    i11 += rect.left + rect.right;
                }
                i10 = b10.getEndIconView().getMeasuredWidth() + i11;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i10), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z9) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z9);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t7) {
        super.setAdapter(t7);
        this.f7278e.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        g2 g2Var = this.f7278e;
        if (g2Var != null) {
            g2Var.h(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f7283p = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof v3.k) {
            ((v3.k) dropDownBackground).o(this.f7283p);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f7278e.f4159w = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout b10 = b();
        if (b10 != null) {
            b10.u();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.q = i;
        if (getAdapter() instanceof t) {
            ((t) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f7284r = colorStateList;
        if (getAdapter() instanceof t) {
            ((t) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.f7278e.c();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new t(this, getContext(), this.f7281n, strArr));
    }
}
