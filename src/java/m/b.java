package m;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import n.w1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class b extends w1 {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ int f3811p = 0;
    public final /* synthetic */ View q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.q = actionMenuItemView;
    }

    @Override // n.w1
    public final c0 b() {
        n.g gVar;
        switch (this.f3811p) {
            case 0:
                c cVar = this.q.s;
                if (cVar == null || (gVar = ((n.h) cVar).f4163a.f4194z) == null) {
                    return null;
                }
                return gVar.a();
            default:
                n.g gVar2 = ((n.j) this.q).f4175d.f4193y;
                if (gVar2 == null) {
                    return null;
                }
                return gVar2.a();
        }
    }

    @Override // n.w1
    public final boolean c() {
        c0 b10;
        switch (this.f3811p) {
            case 0:
                ActionMenuItemView actionMenuItemView = this.q;
                l lVar = actionMenuItemView.q;
                return lVar != null && lVar.c(actionMenuItemView.n) && (b10 = b()) != null && b10.b();
            default:
                ((n.j) this.q).f4175d.l();
                return true;
        }
    }

    @Override // n.w1
    public boolean d() {
        switch (this.f3811p) {
            case 1:
                n.k kVar = ((n.j) this.q).f4175d;
                if (kVar.A != null) {
                    return false;
                }
                kVar.c();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n.j jVar, n.j jVar2) {
        super(jVar2);
        this.q = jVar;
    }
}
