package r6;

import android.content.Context;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class m implements t6.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5694a;

    /* renamed from: b  reason: collision with root package name */
    public final k4.i f5695b;

    public /* synthetic */ m(k4.i iVar, int i) {
        this.f5694a = i;
        this.f5695b = iVar;
    }

    @Override // g7.a
    public final Object get() {
        int i = this.f5694a;
        k4.i iVar = this.f5695b;
        switch (i) {
            case 0:
                return new l((c6.b) iVar.f3396b);
            case 1:
                q4.f fVar = (q4.f) iVar.f3396b;
                kotlin.jvm.internal.j.e(fVar, "firebaseApp");
                o0 o0Var = o0.f5707a;
                return o0.a(fVar);
            default:
                return new u6.a((Context) iVar.f3396b);
        }
    }
}
