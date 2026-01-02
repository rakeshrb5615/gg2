package x8;

import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.zip.Inflater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class k0 extends m {

    /* renamed from: f  reason: collision with root package name */
    public static final y f6654f;

    /* renamed from: c  reason: collision with root package name */
    public final y f6655c;

    /* renamed from: d  reason: collision with root package name */
    public final m f6656d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashMap f6657e;

    static {
        String str = y.f6688b;
        f6654f = a6.e.d("/");
    }

    public k0(y yVar, m mVar, LinkedHashMap linkedHashMap) {
        this.f6655c = yVar;
        this.f6656d = mVar;
        this.f6657e = linkedHashMap;
    }

    @Override // x8.m
    public final u c(y yVar) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // x8.m
    public final h0 f(y yVar) {
        Throwable th;
        b0 b0Var;
        kotlin.jvm.internal.j.e(yVar, "file");
        y yVar2 = f6654f;
        yVar2.getClass();
        y8.j jVar = (y8.j) this.f6657e.get(y8.c.b(yVar2, yVar, true));
        if (jVar == null) {
            throw new FileNotFoundException("no such file: " + yVar);
        }
        long j = jVar.f7001f;
        u c9 = this.f6656d.c(this.f6655c);
        try {
            b0Var = b.c(c9.c(jVar.f7003h));
            try {
                c9.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (c9 != null) {
                try {
                    c9.close();
                } catch (Throwable th4) {
                    q4.b.a(th3, th4);
                }
            }
            th = th3;
            b0Var = null;
        }
        if (th == null) {
            kotlin.jvm.internal.j.e(b0Var, "<this>");
            y8.b.f(b0Var, null);
            if (jVar.f7002g == 0) {
                return new y8.g(b0Var, j, true);
            }
            return new y8.g(new s(b.c(new y8.g(b0Var, jVar.f7000e, true)), new Inflater(true)), j, false);
        }
        throw th;
    }
}
