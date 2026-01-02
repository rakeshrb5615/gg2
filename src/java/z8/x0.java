package z8;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class x0 implements ParameterizedType {

    /* renamed from: a  reason: collision with root package name */
    public final Type f7583a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f7584b;

    /* renamed from: c  reason: collision with root package name */
    public final Type[] f7585c;

    public x0(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            z0.d(type3);
        }
        this.f7583a = type;
        this.f7584b = type2;
        this.f7585c = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && z0.e(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f7585c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f7583a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f7584b;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f7585c) ^ this.f7584b.hashCode();
        Type type = this.f7583a;
        return hashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f7585c;
        int length = typeArr.length;
        Type type = this.f7584b;
        if (length == 0) {
            return z0.s(type);
        }
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(z0.s(type));
        sb.append("<");
        sb.append(z0.s(typeArr[0]));
        for (int i = 1; i < typeArr.length; i++) {
            sb.append(", ");
            sb.append(z0.s(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
