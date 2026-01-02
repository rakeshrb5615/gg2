package q0;

import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f5157a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f5158b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f5159c = new HashMap();

    public o(Runnable runnable) {
        this.f5157a = runnable;
    }

    public final boolean a(MenuItem menuItem) {
        Iterator it = this.f5158b.iterator();
        while (it.hasNext()) {
            if (((p) it.next()).a.o(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void b(p pVar) {
        this.f5158b.remove(pVar);
        n nVar = (n) this.f5159c.remove(pVar);
        if (nVar != null) {
            nVar.f5154a.b(nVar.f5155b);
            nVar.f5155b = null;
        }
        this.f5157a.run();
    }
}
