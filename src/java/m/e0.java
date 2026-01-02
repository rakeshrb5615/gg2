package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class e0 extends m implements SubMenu {
    public final o A;

    /* renamed from: z  reason: collision with root package name */
    public final m f3837z;

    public e0(Context context, m mVar, o oVar) {
        super(context);
        this.f3837z = mVar;
        this.A = oVar;
    }

    @Override // m.m
    public final boolean d(o oVar) {
        return this.f3837z.d(oVar);
    }

    @Override // m.m
    public final boolean e(m mVar, MenuItem menuItem) {
        return super.e(mVar, menuItem) || this.f3837z.e(mVar, menuItem);
    }

    @Override // m.m
    public final boolean f(o oVar) {
        return this.f3837z.f(oVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // m.m
    public final String j() {
        o oVar = this.A;
        int i = oVar != null ? oVar.f3898a : 0;
        if (i == 0) {
            return null;
        }
        return g2.g.c(i, "android:menu:actionviewstates:");
    }

    @Override // m.m
    public final m k() {
        return this.f3837z.k();
    }

    @Override // m.m
    public final boolean m() {
        return this.f3837z.m();
    }

    @Override // m.m
    public final boolean n() {
        return this.f3837z.n();
    }

    @Override // m.m
    public final boolean o() {
        return this.f3837z.o();
    }

    @Override // m.m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z9) {
        this.f3837z.setGroupDividerEnabled(z9);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // m.m, android.view.Menu
    public final void setQwertyMode(boolean z9) {
        this.f3837z.setQwertyMode(z9);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }
}
