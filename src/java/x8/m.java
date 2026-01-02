package x8;

import java.io.Closeable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public abstract class m implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public static final v f6661a;

    /* renamed from: b  reason: collision with root package name */
    public static final y8.h f6662b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [x8.v] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    static {
        ?? r02;
        try {
            Class.forName("java.nio.file.Files");
            r02 = new Object();
        } catch (ClassNotFoundException unused) {
            r02 = new Object();
        }
        f6661a = r02;
        String str = y.f6688b;
        String property = System.getProperty("java.io.tmpdir");
        kotlin.jvm.internal.j.d(property, "getProperty(...)");
        a6.e.d(property);
        ClassLoader classLoader = y8.h.class.getClassLoader();
        kotlin.jvm.internal.j.d(classLoader, "getClassLoader(...)");
        f6662b = new y8.h(classLoader);
    }

    public abstract u c(y yVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public abstract h0 f(y yVar);
}
