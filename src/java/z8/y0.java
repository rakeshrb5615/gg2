package z8;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class y0 implements WildcardType {

    /* renamed from: a  reason: collision with root package name */
    public final Type f7588a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f7589b;

    public y0(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            z0.d(typeArr[0]);
            this.f7589b = null;
            this.f7588a = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        z0.d(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.f7589b = typeArr2[0];
        this.f7588a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && z0.e(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f7589b;
        return type != null ? new Type[]{type} : z0.f7599a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f7588a};
    }

    public final int hashCode() {
        Type type = this.f7589b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f7588a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f7589b;
        if (type != null) {
            return "? super " + z0.s(type);
        }
        Type type2 = this.f7588a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + z0.s(type2);
    }
}
