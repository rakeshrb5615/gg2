package z8;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class k extends e {
    @Override // z8.e
    public final f a(Type type, Annotation[] annotationArr) {
        if (z0.h(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type g3 = z0.g(0, (ParameterizedType) type);
            if (z0.h(g3) != q0.class) {
                return new i(0, g3);
            }
            if (g3 instanceof ParameterizedType) {
                return new i(1, z0.g(0, (ParameterizedType) g3));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
