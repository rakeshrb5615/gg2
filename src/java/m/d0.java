package m;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import n.g2;
import n.l2;
import n.t1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class d0 extends u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b  reason: collision with root package name */
    public final Context f3815b;

    /* renamed from: c  reason: collision with root package name */
    public final m f3816c;

    /* renamed from: d  reason: collision with root package name */
    public final j f3817d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3818e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3819f;

    /* renamed from: m  reason: collision with root package name */
    public final int f3820m;

    /* renamed from: n  reason: collision with root package name */
    public final l2 f3821n;
    public PopupWindow.OnDismissListener q;

    /* renamed from: r  reason: collision with root package name */
    public View f3824r;

    /* renamed from: s  reason: collision with root package name */
    public View f3825s;

    /* renamed from: t  reason: collision with root package name */
    public x f3826t;

    /* renamed from: u  reason: collision with root package name */
    public ViewTreeObserver f3827u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f3828v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f3829w;

    /* renamed from: x  reason: collision with root package name */
    public int f3830x;

    /* renamed from: z  reason: collision with root package name */
    public boolean f3832z;

    /* renamed from: o  reason: collision with root package name */
    public final d f3822o = new d(this, 1);

    /* renamed from: p  reason: collision with root package name */
    public final f3.b f3823p = new f3.b(this, 3);

    /* renamed from: y  reason: collision with root package name */
    public int f3831y = 0;

    /* JADX WARN: Type inference failed for: r7v1, types: [n.l2, n.g2] */
    public d0(Context context, m mVar, View view, int i, boolean z9) {
        this.f3815b = context;
        this.f3816c = mVar;
        this.f3818e = z9;
        this.f3817d = new j(mVar, LayoutInflater.from(context), z9, 2131558419);
        this.f3820m = i;
        Resources resources = context.getResources();
        this.f3819f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f3824r = view;
        this.f3821n = new g2(context, null, i, 0);
        mVar.b(this, context);
    }

    @Override // m.y
    public final void a(m mVar, boolean z9) {
        if (mVar != this.f3816c) {
            return;
        }
        dismiss();
        x xVar = this.f3826t;
        if (xVar != null) {
            xVar.a(mVar, z9);
        }
    }

    @Override // m.c0
    public final boolean b() {
        return !this.f3828v && this.f3821n.F.isShowing();
    }

    @Override // m.c0
    public final void c() {
        View view;
        if (b()) {
            return;
        }
        if (this.f3828v || (view = this.f3824r) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f3825s = view;
        l2 l2Var = this.f3821n;
        n.b0 b0Var = l2Var.F;
        n.b0 b0Var2 = l2Var.F;
        b0Var.setOnDismissListener(this);
        l2Var.f4158v = this;
        l2Var.E = true;
        b0Var2.setFocusable(true);
        View view2 = this.f3825s;
        boolean z9 = this.f3827u == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f3827u = viewTreeObserver;
        if (z9) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f3822o);
        }
        view2.addOnAttachStateChangeListener(this.f3823p);
        l2Var.f4157u = view2;
        l2Var.f4154r = this.f3831y;
        boolean z10 = this.f3829w;
        Context context = this.f3815b;
        j jVar = this.f3817d;
        if (!z10) {
            this.f3830x = u.m(jVar, context, this.f3819f);
            this.f3829w = true;
        }
        l2Var.r(this.f3830x);
        b0Var2.setInputMethodMode(2);
        Rect rect = this.f3930a;
        l2Var.D = rect != null ? new Rect(rect) : null;
        l2Var.c();
        t1 t1Var = l2Var.f4146c;
        t1Var.setOnKeyListener(this);
        if (this.f3832z) {
            m mVar = this.f3816c;
            if (mVar.f3884m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131558418, (ViewGroup) t1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(16908310);
                if (textView != null) {
                    textView.setText(mVar.f3884m);
                }
                frameLayout.setEnabled(false);
                t1Var.addHeaderView(frameLayout, null, false);
            }
        }
        l2Var.p(jVar);
        l2Var.c();
    }

    @Override // m.y
    public final void d() {
        this.f3829w = false;
        j jVar = this.f3817d;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // m.c0
    public final void dismiss() {
        if (b()) {
            this.f3821n.dismiss();
        }
    }

    @Override // m.c0
    public final t1 f() {
        return this.f3821n.f4146c;
    }

    @Override // m.y
    public final boolean h() {
        return false;
    }

    @Override // m.y
    public final boolean i(e0 e0Var) {
        boolean z9;
        if (e0Var.hasVisibleItems()) {
            w wVar = new w(this.f3815b, e0Var, this.f3825s, this.f3818e, this.f3820m, 0);
            x xVar = this.f3826t;
            wVar.f3939h = xVar;
            u uVar = wVar.i;
            if (uVar != null) {
                uVar.j(xVar);
            }
            int size = e0Var.f3879f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z9 = false;
                    break;
                }
                MenuItem item = e0Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z9 = true;
                    break;
                }
                i++;
            }
            wVar.f3938g = z9;
            u uVar2 = wVar.i;
            if (uVar2 != null) {
                uVar2.o(z9);
            }
            wVar.j = this.q;
            this.q = null;
            this.f3816c.c(false);
            l2 l2Var = this.f3821n;
            int i9 = l2Var.f4149f;
            int m9 = l2Var.m();
            if ((Gravity.getAbsoluteGravity(this.f3831y, this.f3824r.getLayoutDirection()) & 7) == 5) {
                i9 += this.f3824r.getWidth();
            }
            if (!wVar.b()) {
                if (wVar.f3936e != null) {
                    wVar.d(i9, m9, true, true);
                }
            }
            x xVar2 = this.f3826t;
            if (xVar2 != null) {
                xVar2.h(e0Var);
            }
            return true;
        }
        return false;
    }

    @Override // m.y
    public final void j(x xVar) {
        this.f3826t = xVar;
    }

    @Override // m.u
    public final void l(m mVar) {
    }

    @Override // m.u
    public final void n(View view) {
        this.f3824r = view;
    }

    @Override // m.u
    public final void o(boolean z9) {
        this.f3817d.f3869c = z9;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f3828v = true;
        this.f3816c.c(true);
        ViewTreeObserver viewTreeObserver = this.f3827u;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f3827u = this.f3825s.getViewTreeObserver();
            }
            this.f3827u.removeGlobalOnLayoutListener(this.f3822o);
            this.f3827u = null;
        }
        this.f3825s.removeOnAttachStateChangeListener(this.f3823p);
        PopupWindow.OnDismissListener onDismissListener = this.q;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // m.u
    public final void p(int i) {
        this.f3831y = i;
    }

    @Override // m.u
    public final void q(int i) {
        this.f3821n.f4149f = i;
    }

    @Override // m.u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.q = onDismissListener;
    }

    @Override // m.u
    public final void s(boolean z9) {
        this.f3832z = z9;
    }

    @Override // m.u
    public final void t(int i) {
        this.f3821n.i(i);
    }
}
