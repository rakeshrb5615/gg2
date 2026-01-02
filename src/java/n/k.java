package n;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class k implements m.y {
    public i A;
    public h B;

    /* renamed from: a  reason: collision with root package name */
    public final Context f4176a;

    /* renamed from: b  reason: collision with root package name */
    public Context f4177b;

    /* renamed from: c  reason: collision with root package name */
    public m.m f4178c;

    /* renamed from: d  reason: collision with root package name */
    public final LayoutInflater f4179d;

    /* renamed from: e  reason: collision with root package name */
    public m.x f4180e;

    /* renamed from: n  reason: collision with root package name */
    public m.a0 f4183n;

    /* renamed from: o  reason: collision with root package name */
    public j f4184o;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f4185p;
    public boolean q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f4186r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f4187s;

    /* renamed from: t  reason: collision with root package name */
    public int f4188t;

    /* renamed from: u  reason: collision with root package name */
    public int f4189u;

    /* renamed from: v  reason: collision with root package name */
    public int f4190v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f4191w;

    /* renamed from: y  reason: collision with root package name */
    public g f4193y;

    /* renamed from: z  reason: collision with root package name */
    public g f4194z;

    /* renamed from: f  reason: collision with root package name */
    public final int f4181f = 2131558403;

    /* renamed from: m  reason: collision with root package name */
    public final int f4182m = 2131558402;

    /* renamed from: x  reason: collision with root package name */
    public final SparseBooleanArray f4192x = new SparseBooleanArray();
    public final j6.o C = new j6.o(this, 4);

    public k(Context context) {
        this.f4176a = context;
        this.f4179d = LayoutInflater.from(context);
    }

    @Override // m.y
    public final void a(m.m mVar, boolean z9) {
        c();
        g gVar = this.f4194z;
        if (gVar != null && gVar.b()) {
            gVar.i.dismiss();
        }
        m.x xVar = this.f4180e;
        if (xVar != null) {
            xVar.a(mVar, z9);
        }
    }

    public final View b(m.o oVar, View view, ViewGroup viewGroup) {
        View actionView = oVar.getActionView();
        if (actionView == null || oVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof m.z ? (m.z) view : (m.z) this.f4179d.inflate(this.f4182m, viewGroup, false);
            actionMenuItemView.a(oVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker(this.f4183n);
            if (this.B == null) {
                this.B = new h(this);
            }
            actionMenuItemView2.setPopupCallback(this.B);
            actionView = (View) actionMenuItemView;
        }
        actionView.setVisibility(oVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof m)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    public final boolean c() {
        m.a0 a0Var;
        i iVar = this.A;
        if (iVar != null && (a0Var = this.f4183n) != null) {
            ((View) a0Var).removeCallbacks(iVar);
            this.A = null;
            return true;
        }
        g gVar = this.f4193y;
        if (gVar != null) {
            if (gVar.b()) {
                gVar.i.dismiss();
            }
            return true;
        }
        return false;
    }

    @Override // m.y
    public final void d() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f4183n;
        ArrayList arrayList = null;
        boolean z9 = false;
        if (viewGroup != null) {
            m.m mVar = this.f4178c;
            if (mVar != null) {
                mVar.i();
                ArrayList l5 = this.f4178c.l();
                int size = l5.size();
                i = 0;
                for (int i9 = 0; i9 < size; i9++) {
                    m.o oVar = (m.o) l5.get(i9);
                    if ((oVar.f3918x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        m.o itemData = childAt instanceof m.z ? ((m.z) childAt).getItemData() : null;
                        View b10 = b(oVar, childAt, viewGroup);
                        if (oVar != itemData) {
                            b10.setPressed(false);
                            b10.jumpDrawablesToCurrentState();
                        }
                        if (b10 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b10.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b10);
                            }
                            ((ViewGroup) this.f4183n).addView(b10, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f4184o) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f4183n).requestLayout();
        m.m mVar2 = this.f4178c;
        if (mVar2 != null) {
            mVar2.i();
            ArrayList arrayList2 = mVar2.i;
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                m.p pVar = ((m.o) arrayList2.get(i10)).A;
            }
        }
        m.m mVar3 = this.f4178c;
        if (mVar3 != null) {
            mVar3.i();
            arrayList = mVar3.j;
        }
        if (this.f4186r && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z9 = !((m.o) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z9 = true;
            }
        }
        if (z9) {
            if (this.f4184o == null) {
                this.f4184o = new j(this, this.f4176a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f4184o.getParent();
            if (viewGroup3 != this.f4183n) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f4184o);
                }
                ActionMenuView actionMenuView = this.f4183n;
                j jVar = this.f4184o;
                actionMenuView.getClass();
                m j = ActionMenuView.j();
                j.f4214a = true;
                actionMenuView.addView(jVar, j);
            }
        } else {
            j jVar2 = this.f4184o;
            if (jVar2 != null) {
                ViewParent parent = jVar2.getParent();
                m.a0 a0Var = this.f4183n;
                if (parent == a0Var) {
                    ((ViewGroup) a0Var).removeView(this.f4184o);
                }
            }
        }
        this.f4183n.setOverflowReserved(this.f4186r);
    }

    @Override // m.y
    public final boolean e(m.o oVar) {
        return false;
    }

    public final boolean f() {
        g gVar = this.f4193y;
        return gVar != null && gVar.b();
    }

    @Override // m.y
    public final void g(Context context, m.m mVar) {
        this.f4177b = context;
        LayoutInflater.from(context);
        this.f4178c = mVar;
        Resources resources = context.getResources();
        if (!this.f4187s) {
            this.f4186r = true;
        }
        int i = 2;
        this.f4188t = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i9 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i9 > 600 || ((i9 > 960 && i10 > 720) || (i9 > 720 && i10 > 960))) {
            i = 5;
        } else if (i9 >= 500 || ((i9 > 640 && i10 > 480) || (i9 > 480 && i10 > 640))) {
            i = 4;
        } else if (i9 >= 360) {
            i = 3;
        }
        this.f4190v = i;
        int i11 = this.f4188t;
        if (this.f4186r) {
            if (this.f4184o == null) {
                j jVar = new j(this, this.f4176a);
                this.f4184o = jVar;
                if (this.q) {
                    jVar.setImageDrawable(this.f4185p);
                    this.f4185p = null;
                    this.q = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f4184o.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i11 -= this.f4184o.getMeasuredWidth();
        } else {
            this.f4184o = null;
        }
        this.f4189u = i11;
        float f9 = resources.getDisplayMetrics().density;
    }

    @Override // m.y
    public final boolean h() {
        int i;
        ArrayList arrayList;
        int i9;
        boolean z9;
        k kVar = this;
        m.m mVar = kVar.f4178c;
        if (mVar != null) {
            arrayList = mVar.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i10 = kVar.f4190v;
        int i11 = kVar.f4189u;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) kVar.f4183n;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i9 = 2;
            z9 = true;
            if (i12 >= i) {
                break;
            }
            m.o oVar = (m.o) arrayList.get(i12);
            int i15 = oVar.f3919y;
            if ((i15 & 2) == 2) {
                i13++;
            } else if ((i15 & 1) == 1) {
                i14++;
            } else {
                z10 = true;
            }
            if (kVar.f4191w && oVar.C) {
                i10 = 0;
            }
            i12++;
        }
        if (kVar.f4186r && (z10 || i14 + i13 > i10)) {
            i10--;
        }
        int i16 = i10 - i13;
        SparseBooleanArray sparseBooleanArray = kVar.f4192x;
        sparseBooleanArray.clear();
        int i17 = 0;
        int i18 = 0;
        while (i17 < i) {
            m.o oVar2 = (m.o) arrayList.get(i17);
            int i19 = oVar2.f3919y;
            boolean z11 = (i19 & 2) == i9 ? z9 : false;
            int i20 = oVar2.f3899b;
            if (z11) {
                View b10 = kVar.b(oVar2, null, viewGroup);
                b10.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b10.getMeasuredWidth();
                i11 -= measuredWidth;
                if (i18 == 0) {
                    i18 = measuredWidth;
                }
                if (i20 != 0) {
                    sparseBooleanArray.put(i20, z9);
                }
                oVar2.f(z9);
            } else if ((i19 & 1) == z9) {
                boolean z12 = sparseBooleanArray.get(i20);
                boolean z13 = ((i16 > 0 || z12) && i11 > 0) ? z9 : false;
                if (z13) {
                    View b11 = kVar.b(oVar2, null, viewGroup);
                    b11.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b11.getMeasuredWidth();
                    i11 -= measuredWidth2;
                    if (i18 == 0) {
                        i18 = measuredWidth2;
                    }
                    z13 &= i11 + i18 > 0;
                }
                if (z13 && i20 != 0) {
                    sparseBooleanArray.put(i20, true);
                } else if (z12) {
                    sparseBooleanArray.put(i20, false);
                    for (int i21 = 0; i21 < i17; i21++) {
                        m.o oVar3 = (m.o) arrayList.get(i21);
                        if (oVar3.f3899b == i20) {
                            if ((oVar3.f3918x & 32) == 32) {
                                i16++;
                            }
                            oVar3.f(false);
                        }
                    }
                }
                if (z13) {
                    i16--;
                }
                oVar2.f(z13);
            } else {
                oVar2.f(false);
                i17++;
                i9 = 2;
                kVar = this;
                z9 = true;
            }
            i17++;
            i9 = 2;
            kVar = this;
            z9 = true;
        }
        return z9;
    }

    @Override // m.y
    public final boolean i(m.e0 e0Var) {
        boolean z9;
        if (e0Var.hasVisibleItems()) {
            m.e0 e0Var2 = e0Var;
            while (true) {
                m.m mVar = e0Var2.f3837z;
                if (mVar == this.f4178c) {
                    break;
                }
                e0Var2 = (m.e0) mVar;
            }
            m.o oVar = e0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.f4183n;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof m.z) && ((m.z) childAt).getItemData() == oVar) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                e0Var.A.getClass();
                int size = e0Var.f3879f.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size) {
                        z9 = false;
                        break;
                    }
                    MenuItem item = e0Var.getItem(i9);
                    if (item.isVisible() && item.getIcon() != null) {
                        z9 = true;
                        break;
                    }
                    i9++;
                }
                g gVar = new g(this, this.f4177b, e0Var, view);
                this.f4194z = gVar;
                gVar.f3938g = z9;
                m.u uVar = gVar.i;
                if (uVar != null) {
                    uVar.o(z9);
                }
                g gVar2 = this.f4194z;
                if (!gVar2.b()) {
                    if (gVar2.f3936e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    gVar2.d(0, 0, false, false);
                }
                m.x xVar = this.f4180e;
                if (xVar != null) {
                    xVar.h(e0Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // m.y
    public final void j(m.x xVar) {
        throw null;
    }

    @Override // m.y
    public final boolean k(m.o oVar) {
        return false;
    }

    public final boolean l() {
        m.m mVar;
        if (!this.f4186r || f() || (mVar = this.f4178c) == null || this.f4183n == null || this.A != null) {
            return false;
        }
        mVar.i();
        if (mVar.j.isEmpty()) {
            return false;
        }
        i iVar = new i(this, new g(this, this.f4177b, this.f4178c, this.f4184o));
        this.A = iVar;
        ((View) this.f4183n).post(iVar);
        return true;
    }
}
