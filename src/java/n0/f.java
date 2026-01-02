package n0;

import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class f implements p0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4390a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4391b;

    public /* synthetic */ f(Object obj, int i) {
        this.f4390a = i;
        this.f4391b = obj;
    }

    @Override // p0.a
    public final void accept(Object obj) {
        switch (this.f4390a) {
            case 0:
                g gVar = (g) obj;
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((a) this.f4391b).k(gVar);
                return;
            default:
                g gVar2 = (g) obj;
                synchronized (h.f4396c) {
                    try {
                        r.j jVar = h.f4397d;
                        ArrayList arrayList = (ArrayList) jVar.get((String) this.f4391b);
                        if (arrayList == null) {
                            return;
                        }
                        jVar.remove((String) this.f4391b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((p0.a) arrayList.get(i)).accept(gVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
