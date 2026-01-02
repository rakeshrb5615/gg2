package c4;

import android.content.Context;
import j6.o;
import j6.s;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r2.n;
import r6.j0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class f implements g1.h {

    /* renamed from: a  reason: collision with root package name */
    public Context f911a;

    public f(Context context, int i) {
        switch (i) {
            case 1:
                this.f911a = context.getApplicationContext();
                return;
            default:
                this.f911a = context;
                return;
        }
    }

    @Override // g1.h
    public void a(q4.b bVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new g1.a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new androidx.fragment.app.l(this, bVar, threadPoolExecutor, 1));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [r2.k, java.lang.Object] */
    public r2.k b() {
        Context context = this.f911a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        ?? obj = new Object();
        obj.f5539a = t2.a.a(n.f5547a);
        k4.i iVar = new k4.i(context, 3);
        obj.f5540b = iVar;
        obj.f5541c = t2.a.a(new n0.a(9, iVar, new o(iVar, 15)));
        k4.i iVar2 = obj.f5540b;
        obj.f5542d = new j0(iVar2, 2);
        g7.a a10 = t2.a.a(new n0.a(11, obj.f5542d, t2.a.a(new j0(iVar2, 1))));
        obj.f5543e = a10;
        Object obj2 = new Object();
        k4.i iVar3 = obj.f5540b;
        b8.g gVar = new b8.g(iVar3, a10, obj2, 18);
        g7.a aVar = obj.f5539a;
        g7.a aVar2 = obj.f5541c;
        obj.f5544f = t2.a.a(new b8.g(new a2.b(aVar, aVar2, gVar, a10, a10, 6), new m5.c(iVar3, aVar2, a10, gVar, aVar, a10, a10, 3), new s(aVar, a10, gVar, a10, 14), 12));
        return obj;
    }
}
