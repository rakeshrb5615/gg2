package y6;

import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class r extends v {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f6953b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f6954c;

    public r(Method method, Object obj) {
        this.f6953b = method;
        this.f6954c = obj;
    }

    @Override // y6.v
    public final Object a(Class cls) {
        String a10 = c.a(cls);
        if (a10 == null) {
            return this.f6953b.invoke(this.f6954c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(a10));
    }
}
