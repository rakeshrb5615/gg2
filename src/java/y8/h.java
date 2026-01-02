package y8;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import x8.h0;
import x8.t;
import x8.u;
import x8.v;
import x8.y;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class h extends x8.m {

    /* renamed from: f  reason: collision with root package name */
    public static final y f6991f;

    /* renamed from: c  reason: collision with root package name */
    public final ClassLoader f6992c;

    /* renamed from: d  reason: collision with root package name */
    public final x8.m f6993d;

    /* renamed from: e  reason: collision with root package name */
    public final h7.j f6994e;

    static {
        String str = y.f6688b;
        f6991f = a6.e.d("/");
    }

    public h(ClassLoader classLoader) {
        v vVar = x8.m.f6661a;
        kotlin.jvm.internal.j.e(vVar, "systemFileSystem");
        this.f6992c = classLoader;
        this.f6993d = vVar;
        this.f6994e = a.a.F(new a8.j(this, 7));
    }

    @Override // x8.m
    public final u c(y yVar) {
        if (!c5.c.k(yVar)) {
            throw new FileNotFoundException("file not found: " + yVar);
        }
        y yVar2 = f6991f;
        yVar2.getClass();
        String r8 = c.b(yVar2, yVar, true).b(yVar2).f6689a.r();
        for (h7.f fVar : (List) this.f6994e.getValue()) {
            try {
                return ((x8.m) fVar.f2225a).c(((y) fVar.f2226b).c(r8));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + yVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [x8.j0, java.lang.Object] */
    @Override // x8.m
    public final h0 f(y yVar) {
        kotlin.jvm.internal.j.e(yVar, "file");
        if (!c5.c.k(yVar)) {
            throw new FileNotFoundException("file not found: " + yVar);
        }
        y yVar2 = f6991f;
        yVar2.getClass();
        URL resource = this.f6992c.getResource(c.b(yVar2, yVar, false).b(yVar2).f6689a.r());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + yVar);
        }
        URLConnection openConnection = resource.openConnection();
        if (openConnection instanceof JarURLConnection) {
            ((JarURLConnection) openConnection).setUseCaches(false);
        }
        InputStream inputStream = openConnection.getInputStream();
        kotlin.jvm.internal.j.d(inputStream, "getInputStream(...)");
        return new t(inputStream, new Object());
    }
}
