package x3;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import androidx.lifecycle.g0;
import com.google.android.material.slider.Slider;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import q0.n0;
import q0.q0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class c extends y0.b {
    public final Slider q;

    /* renamed from: r  reason: collision with root package name */
    public final Rect f6563r;

    public c(Slider slider) {
        super(slider);
        this.f6563r = new Rect();
        this.q = slider;
    }

    @Override // y0.b
    public final int n(float f9, float f10) {
        int i = 0;
        while (true) {
            Slider slider = this.q;
            if (i >= slider.getValues().size()) {
                return -1;
            }
            Rect rect = this.f6563r;
            slider.B(i, rect);
            if (rect.contains((int) f9, (int) f10)) {
                return i;
            }
            i++;
        }
    }

    @Override // y0.b
    public final void o(ArrayList arrayList) {
        for (int i = 0; i < this.q.getValues().size(); i++) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    @Override // y0.b
    public final boolean s(int i, int i9, Bundle bundle) {
        float f9;
        float f10;
        Slider slider = this.q;
        if (slider.isEnabled()) {
            if (i9 != 4096 && i9 != 8192) {
                if (i9 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") && slider.z(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                    slider.C();
                    slider.postInvalidate();
                    p(i);
                    return true;
                }
                return false;
            }
            float f11 = slider.f6604v0;
            if (f11 == 0.0f) {
                f11 = 1.0f;
            }
            if ((slider.f6596r0 - slider.f6594q0) / f11 > 20) {
                f11 *= Math.round(f9 / f10);
            }
            if (i9 == 8192) {
                f11 = -f11;
            }
            if (slider.r()) {
                f11 = -f11;
            }
            if (slider.z(i, c4.b.g(slider.getValues().get(i).floatValue() + f11, slider.getValueFrom(), slider.getValueTo()))) {
                slider.setActiveThumbIndex(i);
                g0 g0Var = slider.Z0;
                slider.removeCallbacks(g0Var);
                slider.postDelayed(g0Var, slider.W0);
                slider.C();
                slider.postInvalidate();
                p(i);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // y0.b
    public final void u(int i, r0.c cVar) {
        Object tag;
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f5491a;
        cVar.b(r0.b.f5485n);
        Slider slider = this.q;
        List<Float> values = slider.getValues();
        Float f9 = values.get(i);
        float floatValue = f9.floatValue();
        float valueFrom = slider.getValueFrom();
        float valueTo = slider.getValueTo();
        if (slider.isEnabled()) {
            if (floatValue > valueFrom) {
                cVar.a(8192);
            }
            if (floatValue < valueTo) {
                cVar.a(4096);
            }
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        try {
            valueFrom = numberInstance.parse(numberInstance.format(valueFrom)).floatValue();
            valueTo = numberInstance.parse(numberInstance.format(valueTo)).floatValue();
            floatValue = numberInstance.parse(numberInstance.format(floatValue)).floatValue();
        } catch (ParseException unused) {
            int i9 = e.b1;
            Log.w("e", "Error parsing value(" + f9 + "), valueFrom(" + valueFrom + "), and valueTo(" + valueTo + ") into a float.");
        }
        accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, floatValue));
        cVar.i(SeekBar.class.getName());
        StringBuilder sb = new StringBuilder();
        if (slider.getContentDescription() != null) {
            sb.append(slider.getContentDescription());
            sb.append(",");
        }
        String l5 = slider.l(floatValue);
        String string = slider.getContext().getString(2131952074);
        if (values.size() > 1) {
            string = i == slider.getValues().size() - 1 ? slider.getContext().getString(2131952072) : i == 0 ? slider.getContext().getString(2131952073) : "";
        }
        WeakHashMap weakHashMap = q0.f5172a;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            tag = n0.b(slider);
        } else {
            tag = slider.getTag(2131362484);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag;
        if (TextUtils.isEmpty(charSequence)) {
            Locale.getDefault();
            sb.append(string + ", " + l5);
        } else if (i10 >= 30) {
            e0.b.j(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        accessibilityNodeInfo.setContentDescription(sb.toString());
        Rect rect = this.f6563r;
        slider.B(i, rect);
        accessibilityNodeInfo.setBoundsInParent(rect);
    }
}
