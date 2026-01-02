package s8;

import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class g implements q8.d {

    /* renamed from: a  reason: collision with root package name */
    public final q8.d f5868a;

    /* renamed from: b  reason: collision with root package name */
    public final q8.d f5869b;

    public g(q8.d dVar, q8.d dVar2) {
        kotlin.jvm.internal.j.e(dVar, "keyDesc");
        kotlin.jvm.internal.j.e(dVar2, "valueDesc");
        this.f5868a = dVar;
        this.f5869b = dVar2;
    }

    @Override // q8.d
    public final int a(String str) {
        kotlin.jvm.internal.j.e(str, "name");
        Integer q02 = b8.p.q0(str);
        if (q02 != null) {
            return q02.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid map index"));
    }

    @Override // q8.d
    public final String b() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // q8.d
    public final q4.b c() {
        return q8.f.f5445h;
    }

    @Override // q8.d
    public final int d() {
        return 2;
    }

    @Override // q8.d
    public final String e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return kotlin.jvm.internal.j.a(this.f5868a, gVar.f5868a) && kotlin.jvm.internal.j.a(this.f5869b, gVar.f5869b);
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
        if (i >= 0) {
            return i7.n.f2745a;
        }
        throw new IllegalArgumentException(v1.a.j("Illegal index ", i, ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final int hashCode() {
        return this.f5869b.hashCode() + ((this.f5868a.hashCode() + 710441009) * 31);
    }

    @Override // q8.d
    public final q8.d i(int i) {
        if (i >= 0) {
            int i9 = i % 2;
            if (i9 != 0) {
                if (i9 == 1) {
                    return this.f5869b;
                }
                throw new IllegalStateException("Unreached");
            }
            return this.f5868a;
        }
        throw new IllegalArgumentException(v1.a.j("Illegal index ", i, ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // q8.d
    public final boolean isInline() {
        return false;
    }

    @Override // q8.d
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(v1.a.j("Illegal index ", i, ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f5868a + ", " + this.f5869b + ')';
    }
}
