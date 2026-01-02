package m;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.util.ArrayList;
import n.i2;
import n.l2;
import n.t1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class g extends u implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean B;
    public x C;
    public ViewTreeObserver D;
    public PopupWindow.OnDismissListener E;
    public boolean F;

    /* renamed from: b  reason: collision with root package name */
    public final Context f3841b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3842c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3843d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3844e;

    /* renamed from: f  reason: collision with root package name */
    public final Handler f3845f;

    /* renamed from: t  reason: collision with root package name */
    public View f3852t;

    /* renamed from: u  reason: collision with root package name */
    public View f3853u;

    /* renamed from: v  reason: collision with root package name */
    public int f3854v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f3855w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f3856x;

    /* renamed from: y  reason: collision with root package name */
    public int f3857y;

    /* renamed from: z  reason: collision with root package name */
    public int f3858z;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f3846m = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f3847n = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    public final d f3848o = new d(this, 0);

    /* renamed from: p  reason: collision with root package name */
    public final f3.b f3849p = new f3.b(this, 2);
    public final j6.o q = new j6.o(this, 2);

    /* renamed from: r  reason: collision with root package name */
    public int f3850r = 0;

    /* renamed from: s  reason: collision with root package name */
    public int f3851s = 0;
    public boolean A = false;

    public g(Context context, View view, int i, boolean z9) {
        this.f3841b = context;
        this.f3852t = view;
        this.f3843d = i;
        this.f3844e = z9;
        this.f3854v = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f3842c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f3845f = new Handler();
    }

    @Override // m.y
    public final void a(m mVar, boolean z9) {
        ArrayList arrayList = this.f3847n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (mVar == ((f) arrayList.get(i)).f3839b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i9 = i + 1;
        if (i9 < arrayList.size()) {
            ((f) arrayList.get(i9)).f3839b.c(false);
        }
        f fVar = (f) arrayList.remove(i);
        m mVar2 = fVar.f3839b;
        l2 l2Var = fVar.f3838a;
        n.b0 b0Var = l2Var.F;
        mVar2.r(this);
        if (this.F) {
            i2.b(b0Var, null);
            b0Var.setAnimationStyle(0);
        }
        l2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f3854v = ((f) arrayList.get(size2 - 1)).f3840c;
        } else {
            this.f3854v = this.f3852t.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z9) {
                ((f) arrayList.get(0)).f3839b.c(false);
                return;
            }
            return;
        }
        dismiss();
        x xVar = this.C;
        if (xVar != null) {
            xVar.a(mVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.D;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.D.removeGlobalOnLayoutListener(this.f3848o);
            }
            this.D = null;
        }
        this.f3853u.removeOnAttachStateChangeListener(this.f3849p);
        this.E.onDismiss();
    }

    @Override // m.c0
    public final boolean b() {
        ArrayList arrayList = this.f3847n;
        return arrayList.size() > 0 && ((f) arrayList.get(0)).f3838a.F.isShowing();
    }

    @Override // m.c0
    public final void c() {
        if (b()) {
            return;
        }
        ArrayList arrayList = this.f3846m;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u((m) obj);
        }
        arrayList.clear();
        View view = this.f3852t;
        this.f3853u = view;
        if (view != null) {
            boolean z9 = this.D == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.D = viewTreeObserver;
            if (z9) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f3848o);
            }
            this.f3853u.addOnAttachStateChangeListener(this.f3849p);
        }
    }

    @Override // m.y
    public final void d() {
        ArrayList arrayList = this.f3847n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((f) obj).f3838a.f4146c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((j) adapter).notifyDataSetChanged();
        }
    }

    @Override // m.c0
    public final void dismiss() {
        ArrayList arrayList = this.f3847n;
        int size = arrayList.size();
        if (size > 0) {
            f[] fVarArr = (f[]) arrayList.toArray(new f[size]);
            for (int i = size - 1; i >= 0; i--) {
                f fVar = fVarArr[i];
                if (fVar.f3838a.F.isShowing()) {
                    fVar.f3838a.dismiss();
                }
            }
        }
    }

    @Override // m.c0
    public final t1 f() {
        ArrayList arrayList = this.f3847n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((f) arrayList.get(arrayList.size() - 1)).f3838a.f4146c;
    }

    @Override // m.y
    public final boolean h() {
        return false;
    }

    @Override // m.y
    public final boolean i(e0 e0Var) {
        ArrayList arrayList = this.f3847n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            f fVar = (f) obj;
            if (e0Var == fVar.f3839b) {
                fVar.f3838a.f4146c.requestFocus();
                return true;
            }
        }
        if (e0Var.hasVisibleItems()) {
            l(e0Var);
            x xVar = this.C;
            if (xVar != null) {
                xVar.h(e0Var);
            }
            return true;
        }
        return false;
    }

    @Override // m.y
    public final void j(x xVar) {
        this.C = xVar;
    }

    @Override // m.u
    public final void l(m mVar) {
        mVar.b(this, this.f3841b);
        if (b()) {
            u(mVar);
        } else {
            this.f3846m.add(mVar);
        }
    }

    @Override // m.u
    public final void n(View view) {
        if (this.f3852t != view) {
            this.f3852t = view;
            this.f3851s = Gravity.getAbsoluteGravity(this.f3850r, view.getLayoutDirection());
        }
    }

    @Override // m.u
    public final void o(boolean z9) {
        this.A = z9;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        f fVar;
        ArrayList arrayList = this.f3847n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                fVar = null;
                break;
            }
            fVar = (f) arrayList.get(i);
            if (!fVar.f3838a.F.isShowing()) {
                break;
            }
            i++;
        }
        if (fVar != null) {
            fVar.f3839b.c(false);
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
        if (this.f3850r != i) {
            this.f3850r = i;
            this.f3851s = Gravity.getAbsoluteGravity(i, this.f3852t.getLayoutDirection());
        }
    }

    @Override // m.u
    public final void q(int i) {
        this.f3855w = true;
        this.f3857y = i;
    }

    @Override // m.u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.E = onDismissListener;
    }

    @Override // m.u
    public final void s(boolean z9) {
        this.B = z9;
    }

    @Override // m.u
    public final void t(int i) {
        this.f3856x = true;
        this.f3858z = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0161, code lost:
        if (((r9.getWidth() + r10[0]) + r5) > r11.right) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0163, code lost:
        r13 = 0;
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0166, code lost:
        r9 = 1;
        r13 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016c, code lost:
        if ((r10[0] - r5) < 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019c  */
    /* JADX WARN: Type inference failed for: r8v3, types: [n.l2, n.g2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(m.m r18) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.g.u(m.m):void");
    }
}
