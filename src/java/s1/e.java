package s1;

import android.view.View;
import androidx.fragment.app.a1;
import androidx.fragment.app.b1;
import androidx.fragment.app.t0;
import c.r;
import c.v;
import com.chilllive.chillwallpaperproject.MainActivity;
import g8.y;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public c f5787a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5788b;

    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.fragment.app.j0, h.i, com.chilllive.chillwallpaperproject.MainActivity, android.app.Activity] */
    public final void a() {
        c cVar = this.f5787a;
        if (cVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!this.f5788b) {
            cVar.c(this, null);
        }
        f fVar = cVar.f5782b;
        a5.a aVar = cVar.f5781a;
        fVar.getClass();
        if (equals(fVar.f5796h) && -1 == fVar.f5795g) {
            r rVar = fVar.f5794f;
            if (rVar == null) {
                rVar = fVar.c(-1);
            }
            fVar.f5794f = null;
            fVar.f5795g = 0;
            fVar.f5796h = null;
            if (rVar != null) {
                t0 t0Var = rVar.f835d;
                switch (t0Var.d) {
                    case 0:
                        b1 b1Var = (b1) t0Var.e;
                        b1Var.x(true);
                        if (!b1Var.h.b) {
                            b1Var.g.f843c.a();
                            break;
                        } else {
                            b1Var.N();
                            break;
                        }
                    default:
                        ?? r32 = (MainActivity) t0Var.e;
                        b1 supportFragmentManager = r32.getSupportFragmentManager();
                        ArrayList arrayList = supportFragmentManager.d;
                        int size = arrayList != null ? arrayList.size() : 0;
                        if (size <= 0) {
                            t0Var.a(false);
                            r32.finish();
                            break;
                        } else {
                            if (size == 1) {
                                r32.X = true;
                                View findViewById = r32.findViewById(2131362494);
                                findViewById.setVisibility(0);
                                findViewById.animate().alpha(1.0f).setDuration(400L).start();
                            }
                            supportFragmentManager.v(new a1(supportFragmentManager, -1, 0), false);
                            break;
                        }
                }
            } else {
                ((v) aVar.f561b).f841a.run();
            }
            y yVar = fVar.f5789a;
            yVar.getClass();
            yVar.e(null, g.f5801b);
        }
        this.f5788b = false;
    }

    public void b(boolean z9) {
    }
}
