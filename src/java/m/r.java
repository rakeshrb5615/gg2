package m;

import android.view.MenuItem;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class r implements MenuItem.OnActionExpandListener {

    /* renamed from: a  reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f3924a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t f3925b;

    public r(t tVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3925b = tVar;
        this.f3924a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f3924a.onMenuItemActionCollapse(this.f3925b.f(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f3924a.onMenuItemActionExpand(this.f3925b.f(menuItem));
    }
}
