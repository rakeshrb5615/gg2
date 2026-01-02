package y6;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class h implements WildcardType, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Type f6921a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f6922b;

    public h(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException("At most one lower bound is supported");
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException("Exactly one upper bound must be specified");
        }
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            i.b(typeArr[0]);
            this.f6922b = null;
            this.f6921a = i.a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        i.b(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException("When lower bound is specified, upper bound must be Object");
        }
        this.f6922b = i.a(typeArr2[0]);
        this.f6921a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && i.d(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f6922b;
        return type != null ? new Type[]{type} : i.f6923a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f6921a};
    }

    public final int hashCode() {
        Type type = this.f6922b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f6921a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f6922b;
        if (type != null) {
            return "? super " + i.k(type);
        }
        Type type2 = this.f6921a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + i.k(type2);
    }
}
