package n;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class y2 implements n, m.k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Toolbar f4366a;

    @Override // m.k
    public boolean b(m.m mVar, MenuItem menuItem) {
        this.f4366a.getClass();
        return false;
    }

    @Override // m.k
    public void f(m.m mVar) {
        Toolbar toolbar = this.f4366a;
        k kVar = toolbar.a.z;
        if (kVar == null || !kVar.f()) {
            Iterator it = toolbar.M.f5158b.iterator();
            while (it.hasNext()) {
                ((q0.p) it.next()).a.s(mVar);
            }
        }
    }
}
