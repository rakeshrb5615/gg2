package q4;

import a5.x;
import a5.z;
import d8.z0;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class g implements a5.f {

    /* renamed from: b  reason: collision with root package name */
    public static final g f5394b = new g(0);

    /* renamed from: c  reason: collision with root package name */
    public static final g f5395c = new g(1);

    /* renamed from: d  reason: collision with root package name */
    public static final g f5396d = new g(2);

    /* renamed from: e  reason: collision with root package name */
    public static final g f5397e = new g(3);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5398a;

    public /* synthetic */ g(int i) {
        this.f5398a = i;
    }

    @Override // a5.f
    public final Object e(z zVar) {
        switch (this.f5398a) {
            case 0:
                Object e9 = zVar.e(new x(w4.a.class, Executor.class));
                kotlin.jvm.internal.j.d(e9, "get(...)");
                return new z0((Executor) e9);
            case 1:
                Object e10 = zVar.e(new x(w4.c.class, Executor.class));
                kotlin.jvm.internal.j.d(e10, "get(...)");
                return new z0((Executor) e10);
            case 2:
                Object e11 = zVar.e(new x(w4.b.class, Executor.class));
                kotlin.jvm.internal.j.d(e11, "get(...)");
                return new z0((Executor) e11);
            default:
                Object e12 = zVar.e(new x(w4.d.class, Executor.class));
                kotlin.jvm.internal.j.d(e12, "get(...)");
                return new z0((Executor) e12);
        }
    }
}
