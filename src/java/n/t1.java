package n;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public class t1 extends ListView {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f4290a;

    /* renamed from: b  reason: collision with root package name */
    public int f4291b;

    /* renamed from: c  reason: collision with root package name */
    public int f4292c;

    /* renamed from: d  reason: collision with root package name */
    public int f4293d;

    /* renamed from: e  reason: collision with root package name */
    public int f4294e;

    /* renamed from: f  reason: collision with root package name */
    public int f4295f;

    /* renamed from: m  reason: collision with root package name */
    public r1 f4296m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4297n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f4298o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4299p;
    public t0.d q;

    /* renamed from: r  reason: collision with root package name */
    public a2.l f4300r;

    public t1(Context context, boolean z9) {
        super(context, null, 2130969042);
        this.f4290a = new Rect();
        this.f4291b = 0;
        this.f4292c = 0;
        this.f4293d = 0;
        this.f4294e = 0;
        this.f4298o = z9;
        setCacheColorHint(0);
    }

    public final int a(int i, int i9) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i10 = listPaddingTop + listPaddingBottom;
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        int i11 = 0;
        View view = null;
        for (int i12 = 0; i12 < count; i12++) {
            int itemViewType = adapter.getItemViewType(i12);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            view = adapter.getView(i12, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i13 = layoutParams.height;
            view.measure(i, i13 > 0 ? View.MeasureSpec.makeMeasureSpec(i13, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i12 > 0) {
                i10 += dividerHeight;
            }
            i10 += view.getMeasuredHeight();
            if (i10 >= i9) {
                return i9;
            }
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x014a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.view.MotionEvent r18, int r19) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n.t1.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f4290a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f4300r != null) {
            return;
        }
        super.drawableStateChanged();
        r1 r1Var = this.f4296m;
        if (r1Var != null) {
            r1Var.f4275b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f4299p && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f4298o || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f4298o || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f4298o || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f4298o && this.f4297n) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f4300r = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f4300r == null) {
            a2.l lVar = new a2.l(this, 4);
            this.f4300r = lVar;
            post(lVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return onHoverEvent;
        }
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i < 30 || !p1.f4249d) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        p1.f4246a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        p1.f4247b.invoke(this, Integer.valueOf(pointToPosition));
                        p1.f4248c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e9) {
                        e9.printStackTrace();
                    } catch (InvocationTargetException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f4299p && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f4295f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        a2.l lVar = this.f4300r;
        if (lVar != null) {
            t1 t1Var = (t1) lVar.f393b;
            t1Var.f4300r = null;
            t1Var.removeCallbacks(lVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z9) {
        this.f4297n = z9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$Callback, android.graphics.drawable.Drawable, n.r1] */
    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        r1 r1Var;
        if (drawable != 0) {
            ?? drawable2 = new Drawable();
            Drawable drawable3 = drawable2.f4274a;
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            drawable2.f4274a = drawable;
            if (drawable != 0) {
                drawable.setCallback(drawable2);
            }
            drawable2.f4275b = true;
            r1Var = drawable2;
        } else {
            r1Var = null;
        }
        this.f4296m = r1Var;
        super.setSelector(r1Var);
        Rect rect = new Rect();
        if (drawable != 0) {
            drawable.getPadding(rect);
        }
        this.f4291b = rect.left;
        this.f4292c = rect.top;
        this.f4293d = rect.right;
        this.f4294e = rect.bottom;
    }
}
