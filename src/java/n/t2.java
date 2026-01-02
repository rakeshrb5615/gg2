package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public abstract class t2 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f4301a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f4302b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f4303c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f4304d = {16842919};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f4305e = {16842912};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f4306f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f4307g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(g.a.j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i) {
        ColorStateList d9 = d(context, i);
        if (d9 == null || !d9.isStateful()) {
            ThreadLocal threadLocal = f4301a;
            TypedValue typedValue = (TypedValue) threadLocal.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                threadLocal.set(typedValue);
            }
            context.getTheme().resolveAttribute(16842803, typedValue, true);
            float f9 = typedValue.getFloat();
            int c9 = c(context, i);
            return h0.a.h(c9, Math.round(Color.alpha(c9) * f9));
        }
        return d9.getColorForState(f4302b, d9.getDefaultColor());
    }

    public static int c(Context context, int i) {
        int[] iArr = f4307g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f4307g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = e0.c.getColorStateList(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
