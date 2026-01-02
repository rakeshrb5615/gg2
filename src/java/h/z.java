package h;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    public Object f2121a;

    /* renamed from: b  reason: collision with root package name */
    public Object f2122b;

    public z(Context context) {
        this.f2121a = context;
    }

    public void c() {
        d4.k kVar = (d4.k) this.f2121a;
        if (kVar != null) {
            try {
                ((c0) this.f2122b).q.unregisterReceiver(kVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f2121a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int e();

    public MenuItem f(MenuItem menuItem) {
        if (menuItem instanceof j0.a) {
            j0.a aVar = (j0.a) menuItem;
            if (((r.j) this.f2122b) == null) {
                this.f2122b = new r.j(0);
            }
            MenuItem menuItem2 = (MenuItem) ((r.j) this.f2122b).get(aVar);
            if (menuItem2 == null) {
                m.t tVar = new m.t((Context) this.f2121a, aVar);
                ((r.j) this.f2122b).put(aVar, tVar);
                return tVar;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public abstract void g();

    public void h() {
        c();
        IntentFilter d9 = d();
        if (d9.countActions() == 0) {
            return;
        }
        if (((d4.k) this.f2121a) == null) {
            this.f2121a = new d4.k(this, 1);
        }
        ((c0) this.f2122b).q.registerReceiver((d4.k) this.f2121a, d9);
    }

    public z(c0 c0Var) {
        this.f2122b = c0Var;
    }
}
