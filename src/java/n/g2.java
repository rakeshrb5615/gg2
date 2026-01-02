package n;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public class g2 implements m.c0 {
    public static final Method G;
    public static final Method H;
    public final Handler B;
    public Rect D;
    public boolean E;
    public final b0 F;

    /* renamed from: a  reason: collision with root package name */
    public final Context f4144a;

    /* renamed from: b  reason: collision with root package name */
    public ListAdapter f4145b;

    /* renamed from: c  reason: collision with root package name */
    public t1 f4146c;

    /* renamed from: f  reason: collision with root package name */
    public int f4149f;

    /* renamed from: m  reason: collision with root package name */
    public int f4150m;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4152o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4153p;
    public boolean q;

    /* renamed from: t  reason: collision with root package name */
    public d2 f4156t;

    /* renamed from: u  reason: collision with root package name */
    public View f4157u;

    /* renamed from: v  reason: collision with root package name */
    public AdapterView.OnItemClickListener f4158v;

    /* renamed from: w  reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f4159w;

    /* renamed from: d  reason: collision with root package name */
    public final int f4147d = -2;

    /* renamed from: e  reason: collision with root package name */
    public int f4148e = -2;

    /* renamed from: n  reason: collision with root package name */
    public final int f4151n = 1002;

    /* renamed from: r  reason: collision with root package name */
    public int f4154r = 0;

    /* renamed from: s  reason: collision with root package name */
    public final int f4155s = Integer.MAX_VALUE;

    /* renamed from: x  reason: collision with root package name */
    public final c2 f4160x = new c2(this, 1);

    /* renamed from: y  reason: collision with root package name */
    public final f2 f4161y = new f2(this);

    /* renamed from: z  reason: collision with root package name */
    public final e2 f4162z = new e2(this);
    public final c2 A = new c2(this, 0);
    public final Rect C = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                H = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [android.widget.PopupWindow, n.b0] */
    public g2(Context context, AttributeSet attributeSet, int i, int i9) {
        int resourceId;
        this.f4144a = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.a.f1582o, i, 0);
        this.f4149f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f4150m = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f4152o = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, g.a.f1585s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            popupWindow.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        popupWindow.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : j5.t1.A(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.F = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    public final int a() {
        return this.f4149f;
    }

    @Override // m.c0
    public final boolean b() {
        return this.F.isShowing();
    }

    @Override // m.c0
    public final void c() {
        int i;
        int paddingBottom;
        t1 t1Var;
        t1 t1Var2 = this.f4146c;
        Context context = this.f4144a;
        b0 b0Var = this.F;
        if (t1Var2 == null) {
            t1 q = q(context, !this.E);
            this.f4146c = q;
            q.setAdapter(this.f4145b);
            this.f4146c.setOnItemClickListener(this.f4158v);
            this.f4146c.setFocusable(true);
            this.f4146c.setFocusableInTouchMode(true);
            this.f4146c.setOnItemSelectedListener(new z1(this));
            this.f4146c.setOnScrollListener(this.f4162z);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f4159w;
            if (onItemSelectedListener != null) {
                this.f4146c.setOnItemSelectedListener(onItemSelectedListener);
            }
            b0Var.setContentView(this.f4146c);
        } else {
            ViewGroup viewGroup = (ViewGroup) b0Var.getContentView();
        }
        Drawable background = b0Var.getBackground();
        Rect rect = this.C;
        if (background != null) {
            background.getPadding(rect);
            int i9 = rect.top;
            i = rect.bottom + i9;
            if (!this.f4152o) {
                this.f4150m = -i9;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a10 = a2.a(b0Var, this.f4157u, this.f4150m, b0Var.getInputMethodMode() == 2);
        int i10 = this.f4147d;
        if (i10 == -1) {
            paddingBottom = a10 + i;
        } else {
            int i11 = this.f4148e;
            int a11 = this.f4146c.a(i11 != -2 ? i11 != -1 ? View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a10);
            paddingBottom = a11 + (a11 > 0 ? this.f4146c.getPaddingBottom() + this.f4146c.getPaddingTop() + i : 0);
        }
        boolean z9 = b0Var.getInputMethodMode() == 2;
        b0Var.setWindowLayoutType(this.f4151n);
        if (b0Var.isShowing()) {
            if (this.f4157u.isAttachedToWindow()) {
                int i12 = this.f4148e;
                if (i12 == -1) {
                    i12 = -1;
                } else if (i12 == -2) {
                    i12 = this.f4157u.getWidth();
                }
                if (i10 == -1) {
                    i10 = z9 ? paddingBottom : -1;
                    if (z9) {
                        b0Var.setWidth(this.f4148e == -1 ? -1 : 0);
                        b0Var.setHeight(0);
                    } else {
                        b0Var.setWidth(this.f4148e == -1 ? -1 : 0);
                        b0Var.setHeight(-1);
                    }
                } else if (i10 == -2) {
                    i10 = paddingBottom;
                }
                b0Var.setOutsideTouchable(true);
                int i13 = i12;
                View view = this.f4157u;
                int i14 = this.f4149f;
                int i15 = this.f4150m;
                int i16 = i13 < 0 ? -1 : i13;
                if (i10 < 0) {
                    i10 = -1;
                }
                b0Var.update(view, i14, i15, i16, i10);
                return;
            }
            return;
        }
        int i17 = this.f4148e;
        if (i17 == -1) {
            i17 = -1;
        } else if (i17 == -2) {
            i17 = this.f4157u.getWidth();
        }
        if (i10 == -1) {
            i10 = -1;
        } else if (i10 == -2) {
            i10 = paddingBottom;
        }
        b0Var.setWidth(i17);
        b0Var.setHeight(i10);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = G;
            if (method != null) {
                try {
                    method.invoke(b0Var, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            b2.b(b0Var, true);
        }
        b0Var.setOutsideTouchable(true);
        b0Var.setTouchInterceptor(this.f4161y);
        if (this.q) {
            b0Var.setOverlapAnchor(this.f4153p);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = H;
            if (method2 != null) {
                try {
                    method2.invoke(b0Var, this.D);
                } catch (Exception e9) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e9);
                }
            }
        } else {
            b2.a(b0Var, this.D);
        }
        b0Var.showAsDropDown(this.f4157u, this.f4149f, this.f4150m, this.f4154r);
        this.f4146c.setSelection(-1);
        if ((!this.E || this.f4146c.isInTouchMode()) && (t1Var = this.f4146c) != null) {
            t1Var.setListSelectionHidden(true);
            t1Var.requestLayout();
        }
        if (this.E) {
            return;
        }
        this.B.post(this.A);
    }

    @Override // m.c0
    public final void dismiss() {
        b0 b0Var = this.F;
        b0Var.dismiss();
        b0Var.setContentView(null);
        this.f4146c = null;
        this.B.removeCallbacks(this.f4160x);
    }

    public final Drawable e() {
        return this.F.getBackground();
    }

    @Override // m.c0
    public final t1 f() {
        return this.f4146c;
    }

    public final void h(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    public final void i(int i) {
        this.f4150m = i;
        this.f4152o = true;
    }

    public final void k(int i) {
        this.f4149f = i;
    }

    public final int m() {
        if (this.f4152o) {
            return this.f4150m;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        d2 d2Var = this.f4156t;
        if (d2Var == null) {
            this.f4156t = new d2(this);
        } else {
            ListAdapter listAdapter2 = this.f4145b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(d2Var);
            }
        }
        this.f4145b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f4156t);
        }
        t1 t1Var = this.f4146c;
        if (t1Var != null) {
            t1Var.setAdapter(this.f4145b);
        }
    }

    public t1 q(Context context, boolean z9) {
        return new t1(context, z9);
    }

    public final void r(int i) {
        Drawable background = this.F.getBackground();
        if (background == null) {
            this.f4148e = i;
            return;
        }
        Rect rect = this.C;
        background.getPadding(rect);
        this.f4148e = rect.left + rect.right + i;
    }
}
