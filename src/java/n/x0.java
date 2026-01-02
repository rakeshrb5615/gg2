package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f4336a;

    /* renamed from: b  reason: collision with root package name */
    public v2 f4337b;

    /* renamed from: c  reason: collision with root package name */
    public v2 f4338c;

    /* renamed from: d  reason: collision with root package name */
    public v2 f4339d;

    /* renamed from: e  reason: collision with root package name */
    public v2 f4340e;

    /* renamed from: f  reason: collision with root package name */
    public v2 f4341f;

    /* renamed from: g  reason: collision with root package name */
    public v2 f4342g;

    /* renamed from: h  reason: collision with root package name */
    public v2 f4343h;
    public final g1 i;
    public int j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f4344k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f4345l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4346m;

    public x0(TextView textView) {
        this.f4336a = textView;
        this.i = new g1(textView);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, n.v2] */
    public static v2 c(Context context, u uVar, int i) {
        ColorStateList f9;
        synchronized (uVar) {
            f9 = uVar.f4310a.f(context, i);
        }
        if (f9 != null) {
            ?? obj = new Object();
            obj.f4318d = true;
            obj.f4315a = f9;
            return obj;
        }
        return null;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            e0.b.i(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            e0.b.i(editorInfo, text);
            return;
        }
        int i9 = editorInfo.initialSelStart;
        int i10 = editorInfo.initialSelEnd;
        int i11 = i9 > i10 ? i10 : i9;
        if (i9 <= i10) {
            i9 = i10;
        }
        int length = text.length();
        if (i11 < 0 || i9 > length) {
            q4.b.P(editorInfo, null, 0, 0);
            return;
        }
        int i12 = editorInfo.inputType & 4095;
        if (i12 == 129 || i12 == 225 || i12 == 18) {
            q4.b.P(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            q4.b.P(editorInfo, text, i11, i9);
        } else {
            int i13 = i9 - i11;
            int i14 = i13 > 1024 ? 0 : i13;
            int i15 = 2048 - i14;
            int min = Math.min(text.length() - i9, i15 - Math.min(i11, (int) (i15 * 0.8d)));
            int min2 = Math.min(i11, i15 - min);
            int i16 = i11 - min2;
            if (Character.isLowSurrogate(text.charAt(i16))) {
                i16++;
                min2--;
            }
            if (Character.isHighSurrogate(text.charAt((i9 + min) - 1))) {
                min--;
            }
            int i17 = min2 + i14;
            q4.b.P(editorInfo, i14 != i13 ? TextUtils.concat(text.subSequence(i16, i16 + min2), text.subSequence(i9, min + i9)) : text.subSequence(i16, i17 + min + i16), min2, i17);
        }
    }

    public final void a(Drawable drawable, v2 v2Var) {
        if (drawable == null || v2Var == null) {
            return;
        }
        u.e(drawable, v2Var, this.f4336a.getDrawableState());
    }

    public final void b() {
        v2 v2Var = this.f4337b;
        TextView textView = this.f4336a;
        if (v2Var != null || this.f4338c != null || this.f4339d != null || this.f4340e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f4337b);
            a(compoundDrawables[1], this.f4338c);
            a(compoundDrawables[2], this.f4339d);
            a(compoundDrawables[3], this.f4340e);
        }
        if (this.f4341f == null && this.f4342g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f4341f);
        a(compoundDrawablesRelative[2], this.f4342g);
    }

    public final ColorStateList d() {
        v2 v2Var = this.f4343h;
        if (v2Var != null) {
            return v2Var.f4315a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        v2 v2Var = this.f4343h;
        if (v2Var != null) {
            return v2Var.f4316b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:226:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(android.util.AttributeSet r27, int r28) {
        /*
            Method dump skipped, instructions count: 961
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n.x0.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, g.a.f1589w);
        b8.g gVar = new b8.g(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f4336a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, gVar);
        if (obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            v0.d(textView, string);
        }
        gVar.r();
        Typeface typeface = this.f4345l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void i(int i, int i9, int i10, int i11) {
        g1 g1Var = this.i;
        if (g1Var.j()) {
            DisplayMetrics displayMetrics = g1Var.j.getResources().getDisplayMetrics();
            g1Var.k(TypedValue.applyDimension(i11, i, displayMetrics), TypedValue.applyDimension(i11, i9, displayMetrics), TypedValue.applyDimension(i11, i10, displayMetrics));
            if (g1Var.h()) {
                g1Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i) {
        g1 g1Var = this.i;
        if (g1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = g1Var.j.getResources().getDisplayMetrics();
                    for (int i9 = 0; i9 < length; i9++) {
                        iArr2[i9] = Math.round(TypedValue.applyDimension(i, iArr[i9], displayMetrics));
                    }
                }
                g1Var.f4140f = g1.b(iArr2);
                if (!g1Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                g1Var.f4141g = false;
            }
            if (g1Var.h()) {
                g1Var.a();
            }
        }
    }

    public final void k(int i) {
        g1 g1Var = this.i;
        if (g1Var.j()) {
            if (i == 0) {
                g1Var.f4135a = 0;
                g1Var.f4138d = -1.0f;
                g1Var.f4139e = -1.0f;
                g1Var.f4137c = -1.0f;
                g1Var.f4140f = new int[0];
                g1Var.f4136b = false;
            } else if (i != 1) {
                throw new IllegalArgumentException(g2.g.c(i, "Unknown auto-size text type: "));
            } else {
                DisplayMetrics displayMetrics = g1Var.j.getResources().getDisplayMetrics();
                g1Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (g1Var.h()) {
                    g1Var.a();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, n.v2] */
    public final void l(ColorStateList colorStateList) {
        if (this.f4343h == null) {
            this.f4343h = new Object();
        }
        v2 v2Var = this.f4343h;
        v2Var.f4315a = colorStateList;
        v2Var.f4318d = colorStateList != null;
        this.f4337b = v2Var;
        this.f4338c = v2Var;
        this.f4339d = v2Var;
        this.f4340e = v2Var;
        this.f4341f = v2Var;
        this.f4342g = v2Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, n.v2] */
    public final void m(PorterDuff.Mode mode) {
        if (this.f4343h == null) {
            this.f4343h = new Object();
        }
        v2 v2Var = this.f4343h;
        v2Var.f4316b = mode;
        v2Var.f4317c = mode != null;
        this.f4337b = v2Var;
        this.f4338c = v2Var;
        this.f4339d = v2Var;
        this.f4340e = v2Var;
        this.f4341f = v2Var;
        this.f4342g = v2Var;
    }

    public final void n(Context context, b8.g gVar) {
        String string;
        int i = this.j;
        TypedArray typedArray = (TypedArray) gVar.f790c;
        this.j = typedArray.getInt(2, i);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 28) {
            int i10 = typedArray.getInt(11, -1);
            this.f4344k = i10;
            if (i10 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f4346m = false;
                int i11 = typedArray.getInt(1, 1);
                if (i11 == 1) {
                    this.f4345l = Typeface.SANS_SERIF;
                    return;
                } else if (i11 == 2) {
                    this.f4345l = Typeface.SERIF;
                    return;
                } else if (i11 != 3) {
                    return;
                } else {
                    this.f4345l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f4345l = null;
        int i12 = typedArray.hasValue(12) ? 12 : 10;
        int i13 = this.f4344k;
        int i14 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface k9 = gVar.k(i12, this.j, new t0(this, i13, i14, new WeakReference(this.f4336a)));
                if (k9 != null) {
                    if (i9 < 28 || this.f4344k == -1) {
                        this.f4345l = k9;
                    } else {
                        this.f4345l = w0.a(Typeface.create(k9, 0), this.f4344k, (this.j & 2) != 0);
                    }
                }
                this.f4346m = this.f4345l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f4345l != null || (string = typedArray.getString(i12)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f4344k == -1) {
            this.f4345l = Typeface.create(string, this.j);
        } else {
            this.f4345l = w0.a(Typeface.create(string, 0), this.f4344k, (this.j & 2) != 0);
        }
    }
}
