package h;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class m0 extends l.a implements m.k {

    /* renamed from: c  reason: collision with root package name */
    public final Context f2067c;

    /* renamed from: d  reason: collision with root package name */
    public final m.m f2068d;

    /* renamed from: e  reason: collision with root package name */
    public k2.c f2069e;

    /* renamed from: f  reason: collision with root package name */
    public WeakReference f2070f;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ n0 f2071m;

    public m0(n0 n0Var, Context context, k2.c cVar) {
        this.f2071m = n0Var;
        this.f2067c = context;
        this.f2069e = cVar;
        m.m mVar = new m.m(context);
        mVar.f3883l = 1;
        this.f2068d = mVar;
        mVar.f3878e = this;
    }

    @Override // l.a
    public final void a() {
        n0 n0Var = this.f2071m;
        if (n0Var.f2082n != this) {
            return;
        }
        if (n0Var.f2088u) {
            n0Var.f2083o = this;
            n0Var.f2084p = this.f2069e;
        } else {
            this.f2069e.w(this);
        }
        this.f2069e = null;
        n0Var.W(false);
        ActionBarContextView actionBarContextView = n0Var.f2079k;
        if (actionBarContextView.q == null) {
            actionBarContextView.e();
        }
        n0Var.f2078h.setHideOnContentScrollEnabled(n0Var.f2093z);
        n0Var.f2082n = null;
    }

    @Override // m.k
    public final boolean b(m.m mVar, MenuItem menuItem) {
        k2.c cVar = this.f2069e;
        if (cVar != null) {
            return ((j6.s) cVar.f3363b).m(this, menuItem);
        }
        return false;
    }

    @Override // l.a
    public final View c() {
        WeakReference weakReference = this.f2070f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // l.a
    public final m.m d() {
        return this.f2068d;
    }

    @Override // l.a
    public final MenuInflater e() {
        return new l.h(this.f2067c);
    }

    @Override // m.k
    public final void f(m.m mVar) {
        if (this.f2069e == null) {
            return;
        }
        i();
        n.k kVar = this.f2071m.f2079k.d;
        if (kVar != null) {
            kVar.l();
        }
    }

    @Override // l.a
    public final CharSequence g() {
        return this.f2071m.f2079k.getSubtitle();
    }

    @Override // l.a
    public final CharSequence h() {
        return this.f2071m.f2079k.getTitle();
    }

    @Override // l.a
    public final void i() {
        if (this.f2071m.f2082n != this) {
            return;
        }
        m.m mVar = this.f2068d;
        mVar.w();
        try {
            this.f2069e.y(this, mVar);
        } finally {
            mVar.v();
        }
    }

    @Override // l.a
    public final boolean j() {
        return this.f2071m.f2079k.y;
    }

    @Override // l.a
    public final void k(View view) {
        this.f2071m.f2079k.setCustomView(view);
        this.f2070f = new WeakReference(view);
    }

    @Override // l.a
    public final void l(int i) {
        m(this.f2071m.f2076f.getResources().getString(i));
    }

    @Override // l.a
    public final void m(CharSequence charSequence) {
        this.f2071m.f2079k.setSubtitle(charSequence);
    }

    @Override // l.a
    public final void n(int i) {
        o(this.f2071m.f2076f.getResources().getString(i));
    }

    @Override // l.a
    public final void o(CharSequence charSequence) {
        this.f2071m.f2079k.setTitle(charSequence);
    }

    @Override // l.a
    public final void p(boolean z9) {
        this.f3473b = z9;
        this.f2071m.f2079k.setTitleOptional(z9);
    }
}
