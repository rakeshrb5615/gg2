package r6;

import android.content.Context;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class s implements t6.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5725a;

    /* renamed from: b  reason: collision with root package name */
    public final k4.i f5726b;

    /* renamed from: c  reason: collision with root package name */
    public final g7.a f5727c;

    public /* synthetic */ s(k4.i iVar, t6.c cVar, int i) {
        this.f5725a = i;
        this.f5726b = iVar;
        this.f5727c = cVar;
    }

    @Override // g7.a
    public final Object get() {
        switch (this.f5725a) {
            case 0:
                Context context = (Context) this.f5726b.f3396b;
                l7.h hVar = (l7.h) this.f5727c.get();
                kotlin.jvm.internal.j.e(context, "appContext");
                kotlin.jvm.internal.j.e(hVar, "blockingDispatcher");
                return q.b(u6.i.f6114a, new l6.c(new d8.y(1), 7), d8.f0.b(hVar), new p(context, 0));
            case 1:
                return new c0((Context) this.f5726b.f3396b, (h1) this.f5727c.get());
            default:
                return new u6.e((b) this.f5727c.get(), (l7.h) this.f5726b.f3396b);
        }
    }

    public s(t6.c cVar, k4.i iVar) {
        this.f5725a = 2;
        this.f5727c = cVar;
        this.f5726b = iVar;
    }
}
