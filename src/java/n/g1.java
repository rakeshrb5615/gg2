package n;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class g1 {

    /* renamed from: l  reason: collision with root package name */
    public static final RectF f4133l = new RectF();

    /* renamed from: m  reason: collision with root package name */
    public static final ConcurrentHashMap f4134m = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public int f4135a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4136b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f4137c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f4138d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f4139e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f4140f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f4141g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f4142h;
    public final TextView i;
    public final Context j;

    /* renamed from: k  reason: collision with root package name */
    public final d1 f4143k;

    public g1(TextView textView) {
        this.i = textView;
        this.j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f4143k = new e1();
        } else {
            this.f4143k = new d1();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i9 = 0; i9 < size; i9++) {
                    iArr2[i9] = ((Integer) arrayList.get(i9)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f4134m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method != null || (method = TextView.class.getDeclaredMethod(str, null)) == null) {
                return method;
            }
            method.setAccessible(true);
            concurrentHashMap.put(str, method);
            return method;
        } catch (Exception e9) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e9);
            return null;
        }
    }

    public static Object e(String str, Object obj, Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e9) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e9);
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f4136b) {
                if (this.i.getMeasuredHeight() <= 0 || this.i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f4143k.b(this.i) ? 1048576 : (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f4133l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c9 = c(rectF);
                        if (c9 != this.i.getTextSize()) {
                            g(0, c9);
                        }
                    } finally {
                    }
                }
            }
            this.f4136b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f4140f.length;
        if (length != 0) {
            int i = length - 1;
            int i9 = 0;
            int i10 = 1;
            while (i10 <= i) {
                int i11 = (i10 + i) / 2;
                int i12 = this.f4140f[i11];
                TextView textView = this.i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
                int maxLines = textView.getMaxLines();
                TextPaint textPaint = this.f4142h;
                if (textPaint == null) {
                    this.f4142h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f4142h.set(textView.getPaint());
                this.f4142h.setTextSize(i12);
                StaticLayout a10 = c1.a(charSequence, (Layout.Alignment) e("getLayoutAlignment", textView, Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, this.i, this.f4142h, this.f4143k);
                if ((maxLines == -1 || (a10.getLineCount() <= maxLines && a10.getLineEnd(a10.getLineCount() - 1) == charSequence.length())) && a10.getHeight() <= rectF.bottom) {
                    int i13 = i11 + 1;
                    i9 = i10;
                    i10 = i13;
                } else {
                    i9 = i11 - 1;
                    i = i9;
                }
            }
            return this.f4140f[i9];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final boolean f() {
        return j() && this.f4135a != 0;
    }

    public final void g(int i, float f9) {
        Context context = this.j;
        float applyDimension = TypedValue.applyDimension(i, f9, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f4136b = false;
                try {
                    Method d9 = d("nullLayouts");
                    if (d9 != null) {
                        d9.invoke(textView, null);
                    }
                } catch (Exception e9) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e9);
                }
                if (isInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f4135a == 1) {
            if (!this.f4141g || this.f4140f.length == 0) {
                int floor = ((int) Math.floor((this.f4139e - this.f4138d) / this.f4137c)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round((i * this.f4137c) + this.f4138d);
                }
                this.f4140f = b(iArr);
            }
            this.f4136b = true;
        } else {
            this.f4136b = false;
        }
        return this.f4136b;
    }

    public final boolean i() {
        int[] iArr = this.f4140f;
        int length = iArr.length;
        boolean z9 = length > 0;
        this.f4141g = z9;
        if (z9) {
            this.f4135a = 1;
            this.f4138d = iArr[0];
            this.f4139e = iArr[length - 1];
            this.f4137c = -1.0f;
        }
        return z9;
    }

    public final boolean j() {
        return !(this.i instanceof w);
    }

    public final void k(float f9, float f10, float f11) {
        if (f9 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f9 + "px) is less or equal to (0px)");
        } else if (f10 <= f9) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f10 + "px) is less or equal to minimum auto-size text size (" + f9 + "px)");
        } else if (f11 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f11 + "px) is less or equal to (0px)");
        } else {
            this.f4135a = 1;
            this.f4138d = f9;
            this.f4139e = f10;
            this.f4137c = f11;
            this.f4141g = false;
        }
    }
}
