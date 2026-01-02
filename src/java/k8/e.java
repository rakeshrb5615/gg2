package k8;

import d8.a0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class e extends h {

    /* renamed from: d  reason: collision with root package name */
    public static final e f3454d;

    /* JADX WARN: Type inference failed for: r0v0, types: [d8.a0, k8.e, k8.h] */
    static {
        int i = k.f3462c;
        int i9 = k.f3463d;
        long j = k.f3464e;
        String str = k.f3460a;
        ?? a0Var = new a0();
        a0Var.f3456c = new c(i, i9, j, str);
        f3454d = a0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // d8.a0
    public final String toString() {
        return "Dispatchers.Default";
    }
}
