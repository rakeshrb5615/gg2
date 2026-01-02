package m;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3932a;

    /* renamed from: b  reason: collision with root package name */
    public final m f3933b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3934c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3935d;

    /* renamed from: e  reason: collision with root package name */
    public View f3936e;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3938g;

    /* renamed from: h  reason: collision with root package name */
    public x f3939h;
    public u i;
    public PopupWindow.OnDismissListener j;

    /* renamed from: f  reason: collision with root package name */
    public int f3937f = 8388611;

    /* renamed from: k  reason: collision with root package name */
    public final v f3940k = new v(this);

    public w(Context context, m mVar, View view, boolean z9, int i, int i9) {
        this.f3932a = context;
        this.f3933b = mVar;
        this.f3936e = view;
        this.f3934c = z9;
        this.f3935d = i;
    }

    public final u a() {
        u d0Var;
        if (this.i == null) {
            Context context = this.f3932a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                d0Var = new g(context, this.f3936e, this.f3935d, this.f3934c);
            } else {
                d0Var = new d0(this.f3932a, this.f3933b, this.f3936e, this.f3935d, this.f3934c);
            }
            d0Var.l(this.f3933b);
            d0Var.r(this.f3940k);
            d0Var.n(this.f3936e);
            d0Var.j(this.f3939h);
            d0Var.o(this.f3938g);
            d0Var.p(this.f3937f);
            this.i = d0Var;
        }
        return this.i;
    }

    public final boolean b() {
        u uVar = this.i;
        return uVar != null && uVar.b();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i9, boolean z9, boolean z10) {
        u a10 = a();
        a10.s(z10);
        if (z9) {
            if ((Gravity.getAbsoluteGravity(this.f3937f, this.f3936e.getLayoutDirection()) & 7) == 5) {
                i -= this.f3936e.getWidth();
            }
            a10.q(i);
            a10.t(i9);
            int i10 = (int) ((this.f3932a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a10.f3930a = new Rect(i - i10, i9 - i10, i + i10, i9 + i10);
        }
        a10.c();
    }
}
