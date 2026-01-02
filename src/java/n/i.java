package n;

import android.view.View;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final g f4172a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f4173b;

    public i(k kVar, g gVar) {
        this.f4173b = kVar;
        this.f4172a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m.k kVar;
        k kVar2 = this.f4173b;
        m.m mVar = kVar2.f4178c;
        if (mVar != null && (kVar = mVar.f3878e) != null) {
            kVar.f(mVar);
        }
        View view = (View) kVar2.f4183n;
        if (view != null && view.getWindowToken() != null) {
            g gVar = this.f4172a;
            if (!gVar.b()) {
                if (gVar.f3936e != null) {
                    gVar.d(0, 0, false, false);
                }
            }
            kVar2.f4193y = gVar;
        }
        kVar2.A = null;
    }
}
