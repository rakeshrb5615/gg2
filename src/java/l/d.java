package l;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import j6.s;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class d extends a implements m.k {

    /* renamed from: c  reason: collision with root package name */
    public Context f3480c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarContextView f3481d;

    /* renamed from: e  reason: collision with root package name */
    public k2.c f3482e;

    /* renamed from: f  reason: collision with root package name */
    public WeakReference f3483f;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3484m;

    /* renamed from: n  reason: collision with root package name */
    public m.m f3485n;

    @Override // l.a
    public final void a() {
        if (this.f3484m) {
            return;
        }
        this.f3484m = true;
        this.f3482e.w(this);
    }

    @Override // m.k
    public final boolean b(m.m mVar, MenuItem menuItem) {
        return ((s) this.f3482e.f3363b).m(this, menuItem);
    }

    @Override // l.a
    public final View c() {
        WeakReference weakReference = this.f3483f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // l.a
    public final m.m d() {
        return this.f3485n;
    }

    @Override // l.a
    public final MenuInflater e() {
        return new h(this.f3481d.getContext());
    }

    @Override // m.k
    public final void f(m.m mVar) {
        i();
        n.k kVar = this.f3481d.d;
        if (kVar != null) {
            kVar.l();
        }
    }

    @Override // l.a
    public final CharSequence g() {
        return this.f3481d.getSubtitle();
    }

    @Override // l.a
    public final CharSequence h() {
        return this.f3481d.getTitle();
    }

    @Override // l.a
    public final void i() {
        this.f3482e.y(this, this.f3485n);
    }

    @Override // l.a
    public final boolean j() {
        return this.f3481d.y;
    }

    @Override // l.a
    public final void k(View view) {
        this.f3481d.setCustomView(view);
        this.f3483f = view != null ? new WeakReference(view) : null;
    }

    @Override // l.a
    public final void l(int i) {
        m(this.f3480c.getString(i));
    }

    @Override // l.a
    public final void m(CharSequence charSequence) {
        this.f3481d.setSubtitle(charSequence);
    }

    @Override // l.a
    public final void n(int i) {
        o(this.f3480c.getString(i));
    }

    @Override // l.a
    public final void o(CharSequence charSequence) {
        this.f3481d.setTitle(charSequence);
    }

    @Override // l.a
    public final void p(boolean z9) {
        this.f3473b = z9;
        this.f3481d.setTitleOptional(z9);
    }
}
