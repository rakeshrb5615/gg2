package y6;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class g implements ParameterizedType, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Type f6918a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f6919b;

    /* renamed from: c  reason: collision with root package name */
    public final Type[] f6920c;

    public g(Type type, Class cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            throw new IllegalArgumentException("Must specify owner type for " + cls);
        }
        this.f6918a = type == null ? null : i.a(type);
        this.f6919b = i.a(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f6920c = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.f6920c[i]);
            i.b(this.f6920c[i]);
            Type[] typeArr3 = this.f6920c;
            typeArr3[i] = i.a(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && i.d(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f6920c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f6918a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f6919b;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f6920c) ^ this.f6919b.hashCode();
        Type type = this.f6918a;
        return hashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f6920c;
        int length = typeArr.length;
        Type type = this.f6919b;
        if (length == 0) {
            return i.k(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(i.k(type));
        sb.append("<");
        sb.append(i.k(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(i.k(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
