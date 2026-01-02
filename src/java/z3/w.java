package z3;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import j5.t1;
import n.b1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class w extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f7288a;

    /* renamed from: b  reason: collision with root package name */
    public final b1 f7289b;

    /* renamed from: c  reason: collision with root package name */
    public CharSequence f7290c;

    /* renamed from: d  reason: collision with root package name */
    public final CheckableImageButton f7291d;

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f7292e;

    /* renamed from: f  reason: collision with root package name */
    public PorterDuff.Mode f7293f;

    /* renamed from: m  reason: collision with root package name */
    public int f7294m;

    /* renamed from: n  reason: collision with root package name */
    public ImageView.ScaleType f7295n;

    /* renamed from: o  reason: collision with root package name */
    public View.OnLongClickListener f7296o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f7297p;

    public w(TextInputLayout textInputLayout, b8.g gVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f7288a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton inflate = LayoutInflater.from(getContext()).inflate(2131558449, (ViewGroup) this, false);
        this.f7291d = inflate;
        b1 b1Var = new b1(getContext(), null);
        this.f7289b = b1Var;
        if (t1.J(getContext())) {
            ((ViewGroup.MarginLayoutParams) inflate.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f7296o;
        inflate.setOnClickListener(null);
        y0.d.i(inflate, onLongClickListener);
        this.f7296o = null;
        inflate.setOnLongClickListener(null);
        y0.d.i(inflate, null);
        TypedArray typedArray = (TypedArray) gVar.f790c;
        if (typedArray.hasValue(70)) {
            this.f7292e = t1.w(getContext(), gVar, 70);
        }
        if (typedArray.hasValue(71)) {
            this.f7293f = q3.k.g(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            b(gVar.i(67));
            if (typedArray.hasValue(66) && inflate.getContentDescription() != (text = typedArray.getText(66))) {
                inflate.setContentDescription(text);
            }
            inflate.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(2131166140));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f7294m) {
            this.f7294m = dimensionPixelSize;
            inflate.setMinimumWidth(dimensionPixelSize);
            inflate.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType d9 = y0.d.d(typedArray.getInt(69, -1));
            this.f7295n = d9;
            inflate.setScaleType(d9);
        }
        b1Var.setVisibility(8);
        b1Var.setId(2131362507);
        b1Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        b1Var.setAccessibilityLiveRegion(1);
        b1Var.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            b1Var.setTextColor(gVar.h(62));
        }
        CharSequence text2 = typedArray.getText(60);
        this.f7290c = TextUtils.isEmpty(text2) ? null : text2;
        b1Var.setText(text2);
        e();
        addView(inflate);
        addView(b1Var);
    }

    public final int a() {
        int i;
        CheckableImageButton checkableImageButton = this.f7291d;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        return this.f7289b.getPaddingStart() + getPaddingStart() + i;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f7291d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f7292e;
            PorterDuff.Mode mode = this.f7293f;
            TextInputLayout textInputLayout = this.f7288a;
            y0.d.a(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            y0.d.h(textInputLayout, checkableImageButton, this.f7292e);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f7296o;
        checkableImageButton.setOnClickListener(null);
        y0.d.i(checkableImageButton, onLongClickListener);
        this.f7296o = null;
        checkableImageButton.setOnLongClickListener(null);
        y0.d.i(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z9) {
        CheckableImageButton checkableImageButton = this.f7291d;
        if ((checkableImageButton.getVisibility() == 0) != z9) {
            checkableImageButton.setVisibility(z9 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        EditText editText = this.f7288a.e;
        if (editText == null) {
            return;
        }
        this.f7289b.setPaddingRelative(this.f7291d.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(2131166009), editText.getCompoundPaddingBottom());
    }

    public final void e() {
        int i = 8;
        int i9 = (this.f7290c == null || this.f7297p) ? 8 : 0;
        if (this.f7291d.getVisibility() == 0 || i9 == 0) {
            i = 0;
        }
        setVisibility(i);
        this.f7289b.setVisibility(i9);
        this.f7288a.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i9) {
        super.onMeasure(i, i9);
        d();
    }
}
