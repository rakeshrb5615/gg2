package y6;

import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class s extends v {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f6955b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f6956c;

    public s(Method method, int i) {
        this.f6955b = method;
        this.f6956c = i;
    }

    @Override // y6.v
    public final Object a(Class cls) {
        String a10 = c.a(cls);
        if (a10 == null) {
            return this.f6955b.invoke(null, cls, Integer.valueOf(this.f6956c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(a10));
    }
}
