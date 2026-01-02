package d7;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Objects;
import y6.i;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Class f1153a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f1154b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1155c;

    public a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == a.class) {
                Type a10 = i.a(parameterizedType.getActualTypeArguments()[0]);
                if (!Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true")) {
                    a(a10);
                }
                this.f1154b = a10;
                this.f1153a = i.g(a10);
                this.f1155c = a10.hashCode();
                return;
            }
        } else if (genericSuperclass == a.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("type-token-raw"));
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public static void a(Type type) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            throw new IllegalArgumentException("TypeToken type argument must not contain a type variable; captured type variable " + typeVariable.getName() + " declared by " + typeVariable.getGenericDeclaration() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("typetoken-type-variable"));
        } else if (type instanceof GenericArrayType) {
            a(((GenericArrayType) type).getGenericComponentType());
        } else {
            int i = 0;
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType != null) {
                    a(ownerType);
                }
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                int length = actualTypeArguments.length;
                while (i < length) {
                    a(actualTypeArguments[i]);
                    i++;
                }
            } else if (!(type instanceof WildcardType)) {
                if (type == null) {
                    throw new IllegalArgumentException("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
                }
            } else {
                WildcardType wildcardType = (WildcardType) type;
                for (Type type2 : wildcardType.getLowerBounds()) {
                    a(type2);
                }
                Type[] upperBounds = wildcardType.getUpperBounds();
                int length2 = upperBounds.length;
                while (i < length2) {
                    a(upperBounds[i]);
                    i++;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return i.d(this.f1154b, ((a) obj).f1154b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1155c;
    }

    public final String toString() {
        return i.k(this.f1154b);
    }

    public a(Type type) {
        Objects.requireNonNull(type);
        Type a10 = i.a(type);
        this.f1154b = a10;
        this.f1153a = i.g(a10);
        this.f1155c = a10.hashCode();
    }
}
