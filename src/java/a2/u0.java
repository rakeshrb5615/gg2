package a2;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public class u0 extends ViewGroup.MarginLayoutParams {

    /* renamed from: a  reason: collision with root package name */
    public k1 f507a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f508b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f509c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f510d;

    public u0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f508b = new Rect();
        this.f509c = true;
        this.f510d = false;
    }

    public u0(int i, int i9) {
        super(i, i9);
        this.f508b = new Rect();
        this.f509c = true;
        this.f510d = false;
    }

    public u0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f508b = new Rect();
        this.f509c = true;
        this.f510d = false;
    }

    public u0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f508b = new Rect();
        this.f509c = true;
        this.f510d = false;
    }

    public u0(u0 u0Var) {
        super((ViewGroup.LayoutParams) u0Var);
        this.f508b = new Rect();
        this.f509c = true;
        this.f510d = false;
    }
}
