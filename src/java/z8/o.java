package z8;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class o extends e {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f7521a;

    public o(Executor executor) {
        this.f7521a = executor;
    }

    @Override // z8.e
    public final f a(Type type, Annotation[] annotationArr) {
        if (z0.h(type) != d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new n0.a(16, z0.g(0, (ParameterizedType) type), z0.l(annotationArr, u0.class) ? null : this.f7521a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
