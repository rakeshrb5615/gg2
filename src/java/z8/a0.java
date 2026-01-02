package z8;

import java.lang.reflect.Array;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class a0 extends z0 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f7467d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ z0 f7468e;

    public /* synthetic */ a0(z0 z0Var, int i) {
        this.f7467d = i;
        this.f7468e = z0Var;
    }

    @Override // z8.z0
    public final void a(n0 n0Var, Object obj) {
        switch (this.f7467d) {
            case 0:
                Iterable<Object> iterable = (Iterable) obj;
                if (iterable == null) {
                    return;
                }
                for (Object obj2 : iterable) {
                    this.f7468e.a(n0Var, obj2);
                }
                return;
            default:
                if (obj == null) {
                    return;
                }
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    this.f7468e.a(n0Var, Array.get(obj, i));
                }
                return;
        }
    }
}
