package s8;

import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class n implements q8.d {

    /* renamed from: a  reason: collision with root package name */
    public final String f5888a;

    /* renamed from: b  reason: collision with root package name */
    public final q8.c f5889b;

    public n(String str, q8.c cVar) {
        kotlin.jvm.internal.j.e(cVar, "kind");
        this.f5888a = str;
        this.f5889b = cVar;
    }

    @Override // q8.d
    public final int a(String str) {
        kotlin.jvm.internal.j.e(str, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // q8.d
    public final String b() {
        return this.f5888a;
    }

    @Override // q8.d
    public final q4.b c() {
        return this.f5889b;
    }

    @Override // q8.d
    public final int d() {
        return 0;
    }

    @Override // q8.d
    public final String e(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return kotlin.jvm.internal.j.a(this.f5888a, nVar.f5888a) && kotlin.jvm.internal.j.a(this.f5889b, nVar.f5889b);
        }
        return false;
    }

    @Override // q8.d
    public final boolean g() {
        return false;
    }

    @Override // q8.d
    public final List getAnnotations() {
        return i7.n.f2745a;
    }

    @Override // q8.d
    public final List h(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.f5889b.hashCode() * 31) + this.f5888a.hashCode();
    }

    @Override // q8.d
    public final q8.d i(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // q8.d
    public final boolean isInline() {
        return false;
    }

    @Override // q8.d
    public final boolean j(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return "PrimitiveDescriptor(" + this.f5888a + ')';
    }
}
