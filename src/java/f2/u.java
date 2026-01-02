package f2;

import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class u extends t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r.e f1477a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v f1478b;

    public u(v vVar, r.e eVar) {
        this.f1478b = vVar;
        this.f1477a = eVar;
    }

    @Override // f2.q
    public final void f(s sVar) {
        ((ArrayList) this.f1477a.get(this.f1478b.f1480b)).remove(sVar);
        sVar.A(this);
    }
}
