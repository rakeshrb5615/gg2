package r2;

import android.content.Context;
import androidx.lifecycle.g0;
import j6.s;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class r {

    /* renamed from: e  reason: collision with root package name */
    public static volatile k f5553e;

    /* renamed from: a  reason: collision with root package name */
    public final a3.a f5554a;

    /* renamed from: b  reason: collision with root package name */
    public final a3.a f5555b;

    /* renamed from: c  reason: collision with root package name */
    public final w2.b f5556c;

    /* renamed from: d  reason: collision with root package name */
    public final o5.d f5557d;

    public r(a3.a aVar, a3.a aVar2, w2.b bVar, o5.d dVar, s sVar) {
        this.f5554a = aVar;
        this.f5555b = aVar2;
        this.f5556c = bVar;
        this.f5557d = dVar;
        ((Executor) sVar.f3282b).execute(new g0(sVar, 14));
    }

    public static r a() {
        k kVar = f5553e;
        if (kVar != null) {
            return (r) kVar.f5544f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [c4.f, java.lang.Object] */
    public static void b(Context context) {
        if (f5553e == null) {
            synchronized (r.class) {
                try {
                    if (f5553e == null) {
                        ?? obj = new Object();
                        context.getClass();
                        obj.f911a = context;
                        f5553e = obj.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final p c(l lVar) {
        byte[] bytes;
        Set unmodifiableSet = lVar != null ? Collections.unmodifiableSet(p2.a.f5069d) : Collections.singleton(new o2.c("proto"));
        b8.g a10 = j.a();
        lVar.getClass();
        a10.f789b = "cct";
        p2.a aVar = (p2.a) lVar;
        String str = aVar.f5072a;
        String str2 = aVar.f5073b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = g2.g.f("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a10.f790c = bytes;
        return new p(unmodifiableSet, a10.a(), this);
    }
}
