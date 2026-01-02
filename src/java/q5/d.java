package q5;

import a1.g0;
import a1.j0;
import a1.k0;
import a1.l0;
import a1.p;
import android.content.Context;
import android.os.Process;
import android.util.Log;
import c1.e;
import d8.f0;
import d8.g1;
import d8.n0;
import e1.h;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.s;
import n7.i;
import u7.l;
import z7.g;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ g[] f5414d;

    /* renamed from: a  reason: collision with root package name */
    public final String f5415a;

    /* renamed from: b  reason: collision with root package name */
    public final ThreadLocal f5416b;

    /* renamed from: c  reason: collision with root package name */
    public final e1.d f5417c;

    static {
        g nVar = new n(kotlin.jvm.internal.c.NO_RECEIVER, d.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
        s.a.getClass();
        f5414d = new g[]{nVar};
    }

    public d(Context context, String str) {
        e1.d dVar;
        j.e(context, "context");
        j.e(str, "name");
        this.f5415a = str;
        this.f5416b = new ThreadLocal();
        l6.c cVar = new l6.c(new l(this) { // from class: q5.a

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ d f5407b;

            {
                this.f5407b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [n7.i, d1.i] */
            @Override // u7.l
            public final Object invoke(Object obj) {
                switch (r2) {
                    case 0:
                        a1.b bVar = (a1.b) obj;
                        j.e(bVar, "ex");
                        String b10 = s.a(d.class).b();
                        Log.w(b10, "CorruptionException in " + this.f5407b.f5415a + " DataStore running in process " + Process.myPid(), bVar);
                        return new e1.b(true);
                    default:
                        Context context2 = (Context) obj;
                        j.e(context2, "it");
                        String str2 = this.f5407b.f5415a;
                        LinkedHashSet linkedHashSet = d1.j.f1067a;
                        j.e(str2, "sharedPreferencesName");
                        j.e(linkedHashSet, "keysToMigrate");
                        return a.a.G(new c1.d(context2, str2, e.f862a, new p(linkedHashSet, null, 1), new i(3, null)));
                }
            }
        }, 7);
        l lVar = new l(this) { // from class: q5.a

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ d f5407b;

            {
                this.f5407b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [n7.i, d1.i] */
            @Override // u7.l
            public final Object invoke(Object obj) {
                switch (r2) {
                    case 0:
                        a1.b bVar = (a1.b) obj;
                        j.e(bVar, "ex");
                        String b10 = s.a(d.class).b();
                        Log.w(b10, "CorruptionException in " + this.f5407b.f5415a + " DataStore running in process " + Process.myPid(), bVar);
                        return new e1.b(true);
                    default:
                        Context context2 = (Context) obj;
                        j.e(context2, "it");
                        String str2 = this.f5407b.f5415a;
                        LinkedHashSet linkedHashSet = d1.j.f1067a;
                        j.e(str2, "sharedPreferencesName");
                        j.e(linkedHashSet, "keysToMigrate");
                        return a.a.G(new c1.d(context2, str2, e.f862a, new p(linkedHashSet, null, 1), new i(3, null)));
                }
            }
        };
        k8.e eVar = n0.f1224a;
        k8.d dVar2 = k8.d.f3452c;
        g1 g1Var = new g1();
        dVar2.getClass();
        i8.c b10 = f0.b(q4.b.L(dVar2, g1Var));
        d1.a aVar = new d1.a(str, cVar, lVar, b10);
        j.e(f5414d[0], "property");
        e1.d dVar3 = aVar.f1063c;
        if (dVar3 == null) {
            synchronized (aVar.f1062b) {
                try {
                    if (aVar.f1063c == null) {
                        Context applicationContext = context.getApplicationContext();
                        j.d(applicationContext, "applicationContext");
                        c1.a aVar2 = new c1.a(applicationContext, aVar, 1);
                        aVar.f1063c = new e1.d(new e1.d(new g0(new l0(h.f1306a, j0.f114a, new k0(aVar2, 2)), a.a.G(new a1.d((List) lVar.invoke(applicationContext), (l7.c) null, 0)), cVar, b10)));
                    }
                    dVar = aVar.f1063c;
                    j.b(dVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            dVar3 = dVar;
        }
        this.f5417c = dVar3;
    }

    public final void a(l lVar) {
        e1.b bVar = (e1.b) f0.t(new a1.d(this, lVar, null, 8));
    }
}
