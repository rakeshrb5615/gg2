package n;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class y1 extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4352a;

    /* renamed from: b  reason: collision with root package name */
    public int f4353b;

    /* renamed from: c  reason: collision with root package name */
    public int f4354c;

    /* renamed from: d  reason: collision with root package name */
    public int f4355d;

    /* renamed from: e  reason: collision with root package name */
    public int f4356e;

    /* renamed from: f  reason: collision with root package name */
    public int f4357f;

    /* renamed from: m  reason: collision with root package name */
    public float f4358m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4359n;

    /* renamed from: o  reason: collision with root package name */
    public int[] f4360o;

    /* renamed from: p  reason: collision with root package name */
    public int[] f4361p;
    public Drawable q;

    /* renamed from: r  reason: collision with root package name */
    public int f4362r;

    /* renamed from: s  reason: collision with root package name */
    public int f4363s;

    /* renamed from: t  reason: collision with root package name */
    public int f4364t;

    /* renamed from: u  reason: collision with root package name */
    public int f4365u;

    public y1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.f4352a = true;
        this.f4353b = -1;
        this.f4354c = 0;
        this.f4356e = 8388659;
        int[] iArr = g.a.f1581n;
        b8.g p8 = b8.g.p(context, attributeSet, iArr, 0);
        q0.q0.m(this, context, iArr, attributeSet, (TypedArray) p8.f790c, 0);
        TypedArray typedArray = (TypedArray) p8.f790c;
        int i9 = typedArray.getInt(1, -1);
        if (i9 >= 0) {
            setOrientation(i9);
        }
        int i10 = typedArray.getInt(0, -1);
        if (i10 >= 0) {
            setGravity(i10);
        }
        boolean z9 = typedArray.getBoolean(2, true);
        if (!z9) {
            setBaselineAligned(z9);
        }
        this.f4358m = typedArray.getFloat(4, -1.0f);
        this.f4353b = typedArray.getInt(3, -1);
        this.f4359n = typedArray.getBoolean(7, false);
        setDividerDrawable(p8.i(5));
        this.f4364t = typedArray.getInt(8, 0);
        this.f4365u = typedArray.getDimensionPixelSize(6, 0);
        p8.r();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof x1;
    }

    public final void d(Canvas canvas, int i) {
        this.q.setBounds(getPaddingLeft() + this.f4365u, i, (getWidth() - getPaddingRight()) - this.f4365u, this.f4363s + i);
        this.q.draw(canvas);
    }

    public final void e(Canvas canvas, int i) {
        this.q.setBounds(i, getPaddingTop() + this.f4365u, this.f4362r + i, (getHeight() - getPaddingBottom()) - this.f4365u);
        this.q.draw(canvas);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.LinearLayout$LayoutParams, n.x1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, n.x1] */
    @Override // android.view.ViewGroup
    /* renamed from: f */
    public x1 generateDefaultLayoutParams() {
        int i = this.f4355d;
        if (i == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, n.x1] */
    @Override // android.view.ViewGroup
    /* renamed from: g */
    public x1 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f4353b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i9 = this.f4353b;
        if (childCount > i9) {
            View childAt = getChildAt(i9);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f4353b == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i10 = this.f4354c;
            if (this.f4355d == 1 && (i = this.f4356e & 112) != 48) {
                if (i == 16) {
                    i10 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f4357f) / 2;
                } else if (i == 80) {
                    i10 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f4357f;
                }
            }
            return i10 + ((LinearLayout.LayoutParams) ((x1) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f4353b;
    }

    public Drawable getDividerDrawable() {
        return this.q;
    }

    public int getDividerPadding() {
        return this.f4365u;
    }

    public int getDividerWidth() {
        return this.f4362r;
    }

    public int getGravity() {
        return this.f4356e;
    }

    public int getOrientation() {
        return this.f4355d;
    }

    public int getShowDividers() {
        return this.f4364t;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f4358m;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.LinearLayout$LayoutParams, n.x1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, n.x1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.LinearLayout$LayoutParams, n.x1] */
    @Override // android.view.ViewGroup
    /* renamed from: h */
    public x1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof x1 ? new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) ((x1) layoutParams)) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LinearLayout.LayoutParams(layoutParams);
    }

    public final boolean i(int i) {
        if (i == 0) {
            return (this.f4364t & 1) != 0;
        } else if (i == getChildCount()) {
            return (this.f4364t & 4) != 0;
        } else {
            if ((this.f4364t & 2) != 0) {
                for (int i9 = i - 1; i9 >= 0; i9--) {
                    if (getChildAt(i9).getVisibility() != 8) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.q == null) {
            return;
        }
        int i9 = 0;
        if (this.f4355d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i9 < virtualChildCount) {
                View childAt = getChildAt(i9);
                if (childAt != null && childAt.getVisibility() != 8 && i(i9)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((x1) childAt.getLayoutParams())).topMargin) - this.f4363s);
                }
                i9++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f4363s : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((x1) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z9 = k3.f4203a;
        boolean z10 = getLayoutDirection() == 1;
        while (i9 < virtualChildCount2) {
            View childAt3 = getChildAt(i9);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i9)) {
                x1 x1Var = (x1) childAt3.getLayoutParams();
                e(canvas, z10 ? childAt3.getRight() + ((LinearLayout.LayoutParams) x1Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) x1Var).leftMargin) - this.f4362r);
            }
            i9++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                x1 x1Var2 = (x1) childAt4.getLayoutParams();
                if (z10) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) x1Var2).leftMargin;
                    i = this.f4362r;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) x1Var2).rightMargin;
                }
            } else if (z10) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f4362r;
                right = left - i;
            }
            e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a9  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n.y1.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:231:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2150
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n.y1.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z9) {
        this.f4352a = z9;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f4353b = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.q) {
            return;
        }
        this.q = drawable;
        if (drawable != null) {
            this.f4362r = drawable.getIntrinsicWidth();
            this.f4363s = drawable.getIntrinsicHeight();
        } else {
            this.f4362r = 0;
            this.f4363s = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f4365u = i;
    }

    public void setGravity(int i) {
        if (this.f4356e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f4356e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i9 = i & 8388615;
        int i10 = this.f4356e;
        if ((8388615 & i10) != i9) {
            this.f4356e = i9 | ((-8388616) & i10);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z9) {
        this.f4359n = z9;
    }

    public void setOrientation(int i) {
        if (this.f4355d != i) {
            this.f4355d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f4364t) {
            requestLayout();
        }
        this.f4364t = i;
    }

    public void setVerticalGravity(int i) {
        int i9 = i & 112;
        int i10 = this.f4356e;
        if ((i10 & 112) != i9) {
            this.f4356e = i9 | (i10 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f9) {
        this.f4358m = Math.max(0.0f, f9);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
