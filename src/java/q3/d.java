package q3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import n.y1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class d extends y1 {
    public boolean A;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f5344v;

    /* renamed from: w  reason: collision with root package name */
    public final Rect f5345w;

    /* renamed from: x  reason: collision with root package name */
    public final Rect f5346x;

    /* renamed from: y  reason: collision with root package name */
    public int f5347y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f5348z;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f5345w = new Rect();
        this.f5346x = new Rect();
        this.f5347y = 119;
        this.f5348z = true;
        this.A = false;
        k.a(context, attributeSet, 0, 0);
        int[] iArr = c3.a.f880h;
        k.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f5347y = obtainStyledAttributes.getInt(1, this.f5347y);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f5348z = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f5344v;
        if (drawable != null) {
            if (this.A) {
                this.A = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z9 = this.f5348z;
                Rect rect = this.f5345w;
                if (z9) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f5347y;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f5346x;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f9, float f10) {
        super.drawableHotspotChanged(f9, f10);
        Drawable drawable = this.f5344v;
        if (drawable != null) {
            drawable.setHotspot(f9, f10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f5344v;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f5344v.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f5344v;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f5347y;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f5344v;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // n.y1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i, int i9, int i10, int i11) {
        super.onLayout(z9, i, i9, i10, i11);
        this.A = z9 | this.A;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i9, int i10, int i11) {
        super.onSizeChanged(i, i9, i10, i11);
        this.A = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f5344v;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f5344v);
            }
            this.f5344v = drawable;
            this.A = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f5347y == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f5347y != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f5347y = i;
            if (i == 119 && this.f5344v != null) {
                this.f5344v.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5344v;
    }
}
