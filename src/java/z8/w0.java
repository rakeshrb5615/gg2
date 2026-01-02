package z8;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class w0 implements GenericArrayType {

    /* renamed from: a  reason: collision with root package name */
    public final Type f7579a;

    public w0(Type type) {
        this.f7579a = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && z0.e(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f7579a;
    }

    public final int hashCode() {
        return this.f7579a.hashCode();
    }

    public final String toString() {
        return z0.s(this.f7579a) + "[]";
    }
}
