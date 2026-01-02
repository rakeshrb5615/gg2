package i3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import j6.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;
import q3.k;
import v3.b0;
import v3.c0;
import v3.d0;
import v3.e0;
import v3.f0;
import v3.p;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class e extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2642a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f2643b;

    /* renamed from: c  reason: collision with root package name */
    public final l6.c f2644c;

    /* renamed from: d  reason: collision with root package name */
    public final d f2645d;

    /* renamed from: e  reason: collision with root package name */
    public Integer[] f2646e;

    /* renamed from: f  reason: collision with root package name */
    public b0 f2647f;

    /* renamed from: m  reason: collision with root package name */
    public d0 f2648m;

    /* renamed from: n  reason: collision with root package name */
    public int f2649n;

    /* renamed from: o  reason: collision with root package name */
    public f0 f2650o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2651p;

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, v3.f0] */
    /* JADX WARN: Type inference failed for: r13v5, types: [i3.d] */
    public e(Context context, AttributeSet attributeSet) {
        super(a4.a.a(context, attributeSet, 2130969442, 2132018251), attributeSet, 2130969442);
        b0 b10;
        int next;
        XmlResourceParser xml;
        ?? obj;
        AttributeSet asAttributeSet;
        int next2;
        f0 f0Var;
        this.f2642a = new ArrayList();
        this.f2643b = new ArrayList();
        final MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.f2644c = new l6.c(materialButtonToggleGroup, 28);
        this.f2645d = new Comparator() { // from class: i3.d
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                View view = (MaterialButton) obj2;
                View view2 = (MaterialButton) obj3;
                int compareTo = Boolean.valueOf(((MaterialButton) view).u).compareTo(Boolean.valueOf(((MaterialButton) view2).u));
                if (compareTo != 0) {
                    return compareTo;
                }
                int compareTo2 = Boolean.valueOf(view.isPressed()).compareTo(Boolean.valueOf(view2.isPressed()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                MaterialButtonToggleGroup materialButtonToggleGroup2 = materialButtonToggleGroup;
                return Integer.compare(materialButtonToggleGroup2.indexOfChild(view), materialButtonToggleGroup2.indexOfChild(view2));
            }
        };
        this.f2651p = true;
        Context context2 = getContext();
        TypedArray f9 = k.f(context2, attributeSet, c3.a.f881k, 2130969442, 2132018251, new int[0]);
        if (f9.hasValue(2)) {
            int resourceId = f9.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    obj = new Object();
                    obj.f6192c = new int[10];
                    obj.f6193d = new o[10];
                    asAttributeSet = Xml.asAttributeSet(xml);
                    while (true) {
                        next2 = xml.next();
                        if (next2 == 2 || next2 == 1) {
                            break;
                        }
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                }
                if (next2 != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    obj.a(context2, xml, asAttributeSet, context2.getTheme());
                }
                xml.close();
                f0Var = obj;
                this.f2650o = f0Var;
            }
            f0Var = null;
            this.f2650o = f0Var;
        }
        if (f9.hasValue(4)) {
            d0 b11 = d0.b(context2, f9, 4);
            this.f2648m = b11;
            if (b11 == null) {
                c0 c0Var = new c0(p.a(context2, f9.getResourceId(4, 0), f9.getResourceId(5, 0), new v3.a(0)).a());
                this.f2648m = c0Var.f6168a != 0 ? new d0(c0Var) : null;
            }
        }
        if (f9.hasValue(3)) {
            v3.a aVar = new v3.a(0.0f);
            int resourceId2 = f9.getResourceId(3, 0);
            if (resourceId2 == 0) {
                b10 = b0.b(p.c(f9, 3, aVar));
            } else if (context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                try {
                    XmlResourceParser xml2 = context2.getResources().getXml(resourceId2);
                    b10 = new b0();
                    AttributeSet asAttributeSet2 = Xml.asAttributeSet(xml2);
                    while (true) {
                        next = xml2.next();
                        if (next == 2 || next == 1) {
                            break;
                        }
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    if (xml2.getName().equals("selector")) {
                        b10.d(context2, xml2, asAttributeSet2, context2.getTheme());
                    }
                    xml2.close();
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    b10 = b0.b(aVar);
                }
            } else {
                b10 = b0.b(p.c(f9, 3, aVar));
            }
            this.f2647f = b10;
        }
        this.f2649n = f9.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(f9.getBoolean(0, true));
        f9.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    public final void a() {
        int i;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i9 = firstVisibleChildIndex + 1; i9 < getChildCount(); i9++) {
            MaterialButton childAt = getChildAt(i9);
            MaterialButton childAt2 = getChildAt(i9 - 1);
            if (this.f2649n <= 0) {
                i = Math.min(childAt.getStrokeWidth(), childAt2.getStrokeWidth());
                childAt.setShouldDrawSurfaceColorStroke(true);
                childAt2.setShouldDrawSurfaceColorStroke(true);
            } else {
                childAt.setShouldDrawSurfaceColorStroke(false);
                childAt2.setShouldDrawSurfaceColorStroke(false);
                i = 0;
            }
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(this.f2649n - i);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = this.f2649n - i;
                layoutParams2.setMarginStart(0);
            }
            childAt.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) getChildAt(firstVisibleChildIndex).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
            return;
        }
        layoutParams3.setMarginEnd(0);
        layoutParams3.setMarginStart(0);
        layoutParams3.leftMargin = 0;
        layoutParams3.rightMargin = 0;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        d();
        this.f2651p = true;
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.f2644c);
        this.f2642a.add(materialButton.getShapeAppearanceModel());
        this.f2643b.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        float max;
        if (this.f2650o == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int i = Integer.MAX_VALUE;
        for (int i9 = firstVisibleChildIndex; i9 <= lastVisibleChildIndex; i9++) {
            if (c(i9)) {
                if (c(i9) && this.f2650o != null) {
                    f0 f0Var = this.f2650o;
                    int width = getChildAt(i9).getWidth();
                    int i10 = -width;
                    for (int i11 = 0; i11 < f0Var.f6190a; i11++) {
                        e0 e0Var = (e0) f0Var.f6193d[i11].f3275b;
                        int i12 = e0Var.f6184a;
                        float f9 = e0Var.f6185b;
                        if (i12 == 2) {
                            max = Math.max(i10, f9);
                        } else if (i12 == 1) {
                            max = Math.max(i10, width * f9);
                        }
                        i10 = (int) max;
                    }
                    int max2 = Math.max(0, i10);
                    int i13 = i9 - 1;
                    while (true) {
                        materialButton = null;
                        if (i13 < 0) {
                            materialButton2 = null;
                            break;
                        } else if (c(i13)) {
                            materialButton2 = (MaterialButton) getChildAt(i13);
                            break;
                        } else {
                            i13--;
                        }
                    }
                    int allowedWidthDecrease = materialButton2 == null ? 0 : materialButton2.getAllowedWidthDecrease();
                    int childCount = getChildCount();
                    int i14 = i9 + 1;
                    while (true) {
                        if (i14 >= childCount) {
                            break;
                        } else if (c(i14)) {
                            materialButton = (MaterialButton) getChildAt(i14);
                            break;
                        } else {
                            i14++;
                        }
                    }
                    r5 = Math.min(max2, allowedWidthDecrease + (materialButton != null ? materialButton.getAllowedWidthDecrease() : 0));
                }
                if (i9 != firstVisibleChildIndex && i9 != lastVisibleChildIndex) {
                    r5 /= 2;
                }
                i = Math.min(i, r5);
            }
        }
        int i15 = firstVisibleChildIndex;
        while (i15 <= lastVisibleChildIndex) {
            if (c(i15)) {
                getChildAt(i15).setSizeChange(this.f2650o);
                getChildAt(i15).setWidthChangeMax((i15 == firstVisibleChildIndex || i15 == lastVisibleChildIndex) ? i : i * 2);
            }
            i15++;
        }
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void d() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton childAt = getChildAt(i);
            LinearLayout.LayoutParams layoutParams = childAt.B;
            if (layoutParams != null) {
                childAt.setLayoutParams(layoutParams);
                childAt.B = null;
                childAt.y = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f2645d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(getChildAt(i), Integer.valueOf(i));
        }
        this.f2646e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [v3.c0, java.lang.Object] */
    public final void e() {
        c0 c0Var;
        int i;
        if (!(this.f2647f == null && this.f2648m == null) && this.f2651p) {
            this.f2651p = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i9 = 0;
            while (i9 < childCount) {
                MaterialButton childAt = getChildAt(i9);
                if (childAt.getVisibility() != 8) {
                    boolean z9 = i9 == firstVisibleChildIndex;
                    boolean z10 = i9 == lastVisibleChildIndex;
                    d0 d0Var = this.f2648m;
                    if (d0Var == null || (!z9 && !z10)) {
                        d0Var = (d0) this.f2643b.get(i9);
                    }
                    if (d0Var == null) {
                        c0Var = new c0((p) this.f2642a.get(i9));
                    } else {
                        ?? obj = new Object();
                        int i10 = d0Var.f6176a;
                        obj.f6168a = i10;
                        obj.f6169b = d0Var.f6177b;
                        int[][] iArr = d0Var.f6178c;
                        int[][] iArr2 = new int[iArr.length];
                        obj.f6170c = iArr2;
                        p[] pVarArr = d0Var.f6179d;
                        obj.f6171d = new p[pVarArr.length];
                        System.arraycopy(iArr, 0, iArr2, 0, i10);
                        System.arraycopy(pVarArr, 0, obj.f6171d, 0, obj.f6168a);
                        obj.f6172e = d0Var.f6180e;
                        obj.f6173f = d0Var.f6181f;
                        obj.f6174g = d0Var.f6182g;
                        obj.f6175h = d0Var.f6183h;
                        c0Var = obj;
                    }
                    boolean z11 = getOrientation() == 0;
                    boolean z12 = getLayoutDirection() == 1;
                    if (z11) {
                        i = z9 ? 5 : 0;
                        if (z10) {
                            i |= 10;
                        }
                        if (z12) {
                            i = ((i & 10) >> 1) | ((i & 5) << 1);
                        }
                    } else {
                        i = z9 ? 3 : 0;
                        if (z10) {
                            i |= 12;
                        }
                    }
                    int i11 = ~i;
                    b0 b0Var = this.f2647f;
                    if ((i11 | 1) == i11) {
                        c0Var.f6172e = b0Var;
                    }
                    if ((i11 | 2) == i11) {
                        c0Var.f6173f = b0Var;
                    }
                    if ((i11 | 4) == i11) {
                        c0Var.f6174g = b0Var;
                    }
                    if ((i11 | 8) == i11) {
                        c0Var.f6175h = b0Var;
                    }
                    d0 d0Var2 = c0Var.f6168a == 0 ? null : new d0(c0Var);
                    if (d0Var2.d()) {
                        childAt.setStateListShapeAppearanceModel(d0Var2);
                    } else {
                        childAt.setShapeAppearanceModel(d0Var2.c());
                    }
                }
                i9++;
            }
        }
    }

    public f0 getButtonSizeChange() {
        return this.f2650o;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i9) {
        Integer[] numArr = this.f2646e;
        if (numArr == null || i9 >= numArr.length) {
            Log.w("MButtonGroup", "Child order wasn't updated");
            return i9;
        }
        return numArr[i9].intValue();
    }

    public v3.d getInnerCornerSize() {
        return this.f2647f.f6164b;
    }

    public b0 getInnerCornerSizeStateList() {
        return this.f2647f;
    }

    public p getShapeAppearance() {
        d0 d0Var = this.f2648m;
        if (d0Var == null) {
            return null;
        }
        return d0Var.c();
    }

    public int getSpacing() {
        return this.f2649n;
    }

    public d0 getStateListShapeAppearance() {
        return this.f2648m;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i, int i9, int i10, int i11) {
        super.onLayout(z9, i, i9, i10, i11);
        if (z9) {
            d();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i9) {
        e();
        a();
        super.onMeasure(i, i9);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal((b) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f2642a.remove(indexOfChild);
            this.f2643b.remove(indexOfChild);
        }
        this.f2651p = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(f0 f0Var) {
        if (this.f2650o != f0Var) {
            this.f2650o = f0Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).setEnabled(z9);
        }
    }

    public void setInnerCornerSize(v3.d dVar) {
        this.f2647f = b0.b(dVar);
        this.f2651p = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(b0 b0Var) {
        this.f2647f = b0Var;
        this.f2651p = true;
        e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.f2651p = true;
        }
        super.setOrientation(i);
    }

    public void setShapeAppearance(p pVar) {
        c0 c0Var = new c0(pVar);
        this.f2648m = c0Var.f6168a == 0 ? null : new d0(c0Var);
        this.f2651p = true;
        e();
        invalidate();
    }

    public void setSpacing(int i) {
        this.f2649n = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(d0 d0Var) {
        this.f2648m = d0Var;
        this.f2651p = true;
        e();
        invalidate();
    }
}
