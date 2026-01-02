package s1;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import c.r;
import g8.y;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class k implements OnBackAnimationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f5803a;

    public k(l lVar) {
        this.f5803a = lVar;
    }

    public final void onBackCancelled() {
        l lVar = this.f5803a;
        c cVar = lVar.f5787a;
        if (cVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!lVar.f5788b) {
            cVar.c(lVar, null);
        }
        f fVar = cVar.f5782b;
        fVar.getClass();
        if (lVar.equals(fVar.f5796h) && -1 == fVar.f5795g) {
            r rVar = fVar.f5794f;
            if (rVar == null) {
                rVar = fVar.c(-1);
            }
            fVar.f5794f = null;
            fVar.f5795g = 0;
            fVar.f5796h = null;
            if (rVar != null) {
                rVar.f835d.getClass();
            }
            y yVar = fVar.f5789a;
            yVar.getClass();
            yVar.e(null, g.f5801b);
        }
        lVar.f5788b = false;
    }

    public final void onBackInvoked() {
        this.f5803a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        kotlin.jvm.internal.j.e(backEvent, "backEvent");
        b a10 = i.a(backEvent);
        l lVar = this.f5803a;
        c cVar = lVar.f5787a;
        if (cVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (lVar.f5788b) {
            f fVar = cVar.f5782b;
            fVar.getClass();
            if (lVar.equals(fVar.f5796h) && -1 == fVar.f5795g) {
                r rVar = fVar.f5794f;
                if (rVar == null) {
                    rVar = fVar.c(-1);
                }
                if (rVar != null) {
                    rVar.f835d.getClass();
                }
                y yVar = fVar.f5789a;
                h hVar = new h(a10);
                yVar.getClass();
                yVar.e(null, hVar);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        kotlin.jvm.internal.j.e(backEvent, "backEvent");
        b a10 = i.a(backEvent);
        l lVar = this.f5803a;
        c cVar = lVar.f5787a;
        if (cVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (lVar.f5788b) {
            return;
        }
        cVar.c(lVar, a10);
        lVar.f5788b = true;
    }
}
