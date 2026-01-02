package y6;

import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class t extends v {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f6957b;

    public t(Method method) {
        this.f6957b = method;
    }

    @Override // y6.v
    public final Object a(Class cls) {
        String a10 = c.a(cls);
        if (a10 == null) {
            return this.f6957b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(a10));
    }
}
