package i2;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsController;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.slider.Slider;
import j5.t1;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class l {

    /* renamed from: r  reason: collision with root package name */
    public static l f2393r;

    /* renamed from: a  reason: collision with root package name */
    public final Context f2394a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2395b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2396c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2397d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2398e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2399f;

    /* renamed from: g  reason: collision with root package name */
    public final String f2400g;

    /* renamed from: h  reason: collision with root package name */
    public final String f2401h;
    public final String i;
    public final String j;

    /* renamed from: k  reason: collision with root package name */
    public final String f2402k;

    /* renamed from: l  reason: collision with root package name */
    public final String f2403l;

    /* renamed from: m  reason: collision with root package name */
    public final String f2404m;

    /* renamed from: n  reason: collision with root package name */
    public final String f2405n;

    /* renamed from: o  reason: collision with root package name */
    public final String f2406o;

    /* renamed from: p  reason: collision with root package name */
    public final String f2407p;
    public final SharedPreferences q;

    public l(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f2394a = applicationContext;
        this.q = t1.z(context);
        Resources resources = context.getResources();
        this.f2395b = e0.c.getColor(context, 2131099794);
        this.f2396c = e0.c.getColor(context, 2131100822);
        this.f2397d = e0.c.getColor(context, 2131100819);
        this.f2398e = e0.c.getColor(context, 2131100820);
        this.f2399f = resources.getString(2131952366);
        this.f2400g = resources.getString(2131952372);
        this.f2401h = resources.getString(2131952478);
        this.i = resources.getString(2131952383);
        this.j = resources.getString(2131952363);
        this.f2402k = context.getResources().getString(2131952216);
        this.f2403l = context.getResources().getString(2131951755);
        context.getResources().getString(2131952347);
        resources.getString(2131952205);
        resources.getString(2131952359);
        this.f2404m = context.getResources().getString(2131952087);
        resources.getString(2131951892);
        resources.getString(2131952297);
        this.f2405n = context.getString(2131951815);
        this.f2406o = context.getString(2131951749);
        this.f2407p = context.getString(2131952299);
        e0.c.getColor(applicationContext, 2131099794);
        e0.c.getColor(applicationContext, 2131099794);
        e0.c.getColor(applicationContext, 2131099782);
        e0.c.getColor(applicationContext, 2131100830);
        e0.c.getColor(applicationContext, 2131099806);
        e0.c.getColor(applicationContext, 2131099783);
    }

    public static int a(int i, float f9) {
        ThreadLocal threadLocal = h0.a.f2123a;
        h0.a.b(Color.red(i), Color.green(i), Color.blue(i), r0);
        float[] fArr = {0.0f, 0.0f, Math.max(0.0f, Math.min(1.0f, fArr[2] * f9))};
        return h0.a.a(fArr);
    }

    public static int b(int i, float f9) {
        Color.colorToHSV(i, r0);
        float f10 = r0[1] * f9;
        float[] fArr = {0.0f, f10};
        fArr[1] = Math.max(0.0f, Math.min(1.0f, f10));
        return Color.HSVToColor(Color.alpha(i), fArr);
    }

    public static int d(int i, int i9, double d9) {
        double d10 = 1.0d - d9;
        return Color.rgb(Math.min((int) ((Color.red(i9) * d9) + (Color.red(i) * d10)), 255), Math.min((int) ((Color.green(i9) * d9) + (Color.green(i) * d10)), 255), Math.min((int) ((d9 * Color.blue(i9)) + (d10 * Color.blue(i))), 255));
    }

    public static int e(int i) {
        return Color.rgb(Math.min(255, Math.max(0, Color.red(i))), Math.min(255, Math.max(0, Color.green(i))), Math.min(255, Math.max(0, Color.blue(i))));
    }

    public static int f(int i, int i9, float f9, float f10, float f11, float f12) {
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        int red2 = Color.red(i9);
        int green2 = Color.green(i9);
        int blue2 = Color.blue(i9);
        if (red == red2 && green == green2 && blue == blue2) {
            return i9;
        }
        float f13 = (1.0f / (f11 - f10)) * (f9 - f10) * f12;
        float f14 = 1.0f - f13;
        int i10 = (int) ((red2 * f13) + (red * f14));
        int i11 = (int) ((green2 * f13) + (green * f14));
        int i12 = (int) ((blue2 * f13) + (blue * f14));
        return Color.rgb(red > red2 ? Math.max(i10, red2) : Math.min(i10, red2), green > green2 ? Math.max(i11, green2) : Math.min(i11, green2), blue > blue2 ? Math.max(i12, blue2) : Math.min(i12, blue2));
    }

    public static void g(int[] iArr, int i) {
        iArr[0] = (i >> 24) & 255;
        iArr[1] = (i >> 16) & 255;
        iArr[2] = (i >> 8) & 255;
        iArr[3] = i & 255;
    }

    public static int[] h(int i) {
        return new int[]{(i >> 24) & 255, (i >> 16) & 255, (i >> 8) & 255, i & 255};
    }

    public static void i(View view, int i, int i9) {
        Drawable drawable;
        Drawable[] compoundDrawables;
        ArrayList arrayList = new ArrayList();
        if (view instanceof TextView) {
            for (Drawable drawable2 : ((TextView) view).getCompoundDrawables()) {
                if (drawable2 != null) {
                    arrayList.add(drawable2.mutate());
                }
            }
        } else if ((view instanceof ImageView) && (drawable = ((ImageView) view).getDrawable()) != null) {
            arrayList.add(drawable.mutate());
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(i, i9);
        ofArgb.setDuration(300L);
        ofArgb.addUpdateListener(new j(arrayList, 0));
        ofArgb.start();
    }

    public static void j(l lVar, View view, boolean z9, int i, int i9, int i10) {
        if (view == null || lVar == null) {
            return;
        }
        view.setSelected(z9);
        boolean o9 = lVar.o();
        if (z9) {
            i9 = i10;
        } else if (o9) {
            i9 = i;
        }
        int t7 = a.a.t(view, i);
        view.setTag(2131361998, Integer.valueOf(i9));
        i(view, t7, i9);
    }

    public static int[][] k(Context context, int i, int i9, int i10, int i11) {
        Resources resources = context.getResources();
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        TypedArray obtainTypedArray2 = resources.obtainTypedArray(i9);
        TypedArray obtainTypedArray3 = resources.obtainTypedArray(i10);
        TypedArray obtainTypedArray4 = resources.obtainTypedArray(i11);
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, 7, 3);
        for (int i12 = 0; i12 < 3; i12++) {
            iArr[0][i12] = obtainTypedArray4.getColor(i12, 0);
            iArr[1][i12] = obtainTypedArray.getColor(i12, 0);
            iArr[2][i12] = obtainTypedArray2.getColor(i12, 0);
            iArr[3][i12] = obtainTypedArray2.getColor(i12, 0);
            iArr[4][i12] = obtainTypedArray3.getColor(i12, 0);
            iArr[5][i12] = obtainTypedArray4.getColor(i12, 0);
            iArr[6][i12] = obtainTypedArray.getColor(i12, 0);
        }
        obtainTypedArray.recycle();
        obtainTypedArray2.recycle();
        obtainTypedArray3.recycle();
        obtainTypedArray4.recycle();
        return iArr;
    }

    public static synchronized l l(Context context) {
        l lVar;
        synchronized (l.class) {
            try {
                if (f2393r == null) {
                    f2393r = new l(context);
                }
                lVar = f2393r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    public static float m(float f9, float f10, float f11) {
        return (1.0f / (f11 - f10)) * (f9 - f10);
    }

    public static boolean n(int i) {
        return 1.0d - (((((double) Color.blue(i)) * 0.114d) + ((((double) Color.green(i)) * 0.587d) + (((double) Color.red(i)) * 0.299d))) / 255.0d) >= 0.5d;
    }

    public static void p(ViewGroup viewGroup, boolean z9, l lVar, int i, int i9, boolean z10) {
        l lVar2;
        int i10;
        boolean z11;
        int i11;
        int i12;
        int i13 = 0;
        while (i13 < viewGroup.getChildCount()) {
            View childAt = viewGroup.getChildAt(i13);
            if (childAt instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) childAt;
                if (z9) {
                    i11 = i9;
                    i12 = i11;
                } else {
                    i11 = i;
                    i12 = i9;
                }
                boolean z12 = z9;
                l lVar3 = lVar;
                z11 = z10;
                p(viewGroup2, z12, lVar3, i11, i12, z11);
                z9 = z12;
                lVar2 = lVar3;
                i10 = i12;
            } else {
                lVar2 = lVar;
                i10 = i9;
                z11 = z10;
                j(lVar2, childAt, childAt.isSelected(), z9 ? i10 : i, i10, (!z11 || z9) ? i10 : i);
            }
            i13++;
            lVar = lVar2;
            i9 = i10;
            z10 = z11;
        }
    }

    public static void s(Context context, Slider slider, int i, int i9) {
        int color = e0.c.getColor(context, 2131100819);
        int color2 = e0.c.getColor(context, 2131100820);
        if (slider.isEnabled()) {
            slider.setTrackActiveTintList(ColorStateList.valueOf(i));
            slider.setTrackInactiveTintList(ColorStateList.valueOf(i9));
            slider.setThumbTintList(ColorStateList.valueOf(i));
            return;
        }
        slider.setTrackActiveTintList(ColorStateList.valueOf(color));
        slider.setTrackInactiveTintList(ColorStateList.valueOf(color2));
        slider.setThumbTintList(ColorStateList.valueOf(color));
    }

    public static void t(Activity activity, boolean z9) {
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 34) {
            View decorView = activity.getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z9) {
                decorView.setSystemUiVisibility(systemUiVisibility | 8192);
                return;
            } else {
                decorView.setSystemUiVisibility(systemUiVisibility & (-8193));
                return;
            }
        }
        WindowInsetsController windowInsetsController = activity.getWindow().getDecorView().getWindowInsetsController();
        if (windowInsetsController != null) {
            if (z9) {
                windowInsetsController.setSystemBarsAppearance(8, 8);
            } else {
                windowInsetsController.setSystemBarsAppearance(0, 8);
            }
        }
    }

    public final void c(Activity activity, ViewGroup viewGroup, boolean z9) {
        int i = this.q.getInt(this.f2407p, 0);
        boolean o9 = o();
        int i9 = this.f2396c;
        if ((i != 8 || !z9) && o9) {
            i9 = this.f2395b;
        }
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                int currentTextColor = textView.getCurrentTextColor();
                int i11 = textView.isEnabled() ? i9 : o9 ? this.f2397d : this.f2398e;
                if (currentTextColor != i9) {
                    ValueAnimator ofArgb = ValueAnimator.ofArgb(currentTextColor, i11);
                    ofArgb.setDuration(300L);
                    ofArgb.addUpdateListener(new k(1, textView));
                    ofArgb.start();
                }
            } else if (childAt instanceof ViewGroup) {
                c(activity, (ViewGroup) childAt, z9);
            }
        }
        t(activity, o9);
    }

    public final boolean o() {
        SharedPreferences z9 = t1.z(this.f2394a);
        String str = this.f2401h;
        String str2 = this.j;
        String string = z9.getString(str, str2);
        int i = z9.getInt(this.f2405n, 0);
        float f9 = z9.getInt(this.f2406o, 0) * 0.01f;
        float f10 = z9.getFloat(this.i, 6.0f);
        float f11 = z9.getFloat(this.f2399f, 6.0f);
        float f12 = z9.getFloat(this.f2400g, 18.0f);
        float f13 = (float) (0.3d - (((string.contains(str2) || string.contains(this.f2402k) || string.equals(this.f2403l) || string.contains(this.f2404m)) ? 0.0f : 0.0f) * 0.65f));
        return f10 > f11 - f13 && f10 < f12 + f13 && i < 25;
    }

    public final void q(Activity activity, ViewGroup viewGroup) {
        boolean o9 = o();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (o9) {
                    textView.setTextColor(this.f2395b);
                } else {
                    textView.setTextColor(this.f2396c);
                }
            } else if (childAt instanceof ViewGroup) {
                q(activity, (ViewGroup) childAt);
            }
            t(activity, o9);
        }
    }

    public final void r(ViewGroup viewGroup, int i) {
        int i9 = i == 0 ? o() ? this.f2395b : this.f2396c : i;
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (!(childAt instanceof RecyclerView)) {
                if (childAt instanceof TextView) {
                    TextView textView = (TextView) childAt;
                    Drawable[] compoundDrawables = textView.getCompoundDrawables();
                    Drawable[] drawableArr = new Drawable[4];
                    for (int i11 = 0; i11 < 4; i11++) {
                        Drawable drawable = compoundDrawables[i11];
                        if (drawable != null) {
                            Drawable mutate = drawable.mutate();
                            mutate.setTint(i9);
                            drawableArr[i11] = mutate;
                        } else {
                            drawableArr[i11] = null;
                        }
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawableArr[0], drawableArr[1], drawableArr[2], drawableArr[3]);
                } else if (childAt instanceof ImageView) {
                    ImageView imageView = (ImageView) childAt;
                    Drawable drawable2 = imageView.getDrawable();
                    if (drawable2 != null) {
                        Drawable mutate2 = drawable2.mutate();
                        mutate2.setTint(i9);
                        imageView.setImageDrawable(mutate2);
                    }
                } else if (childAt instanceof ViewGroup) {
                    r((ViewGroup) childAt, i);
                }
            }
        }
    }

    public final void u(MaterialSwitch materialSwitch, int i) {
        int i9 = this.f2396c;
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{i, i9});
        int i10 = this.f2395b;
        ColorStateList colorStateList2 = new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{i9, i10});
        ColorStateList colorStateList3 = new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{0, i10});
        if (materialSwitch == null) {
            return;
        }
        materialSwitch.setTrackTintList(colorStateList);
        materialSwitch.setThumbTintList(colorStateList2);
        materialSwitch.setTrackDecorationTintList(colorStateList3);
    }
}
