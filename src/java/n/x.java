package n;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f4334a;

    /* renamed from: b  reason: collision with root package name */
    public final l6.c f4335b;

    public x(TextView textView) {
        this.f4334a = textView;
        this.f4335b = new l6.c(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((a.a) this.f4335b.f3791b).x(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f4334a.getContext().obtainStyledAttributes(attributeSet, g.a.i, i, 0);
        try {
            boolean z9 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            d(z9);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z9) {
        ((a.a) this.f4335b.f3791b).O(z9);
    }

    public final void d(boolean z9) {
        ((a.a) this.f4335b.f3791b).R(z9);
    }
}
