package s8;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class o implements q8.d, b {

    /* renamed from: a  reason: collision with root package name */
    public final q8.d f5890a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5891b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f5892c;

    public o(q8.d dVar) {
        Set set;
        kotlin.jvm.internal.j.e(dVar, "original");
        this.f5890a = dVar;
        this.f5891b = dVar.b() + '?';
        kotlin.jvm.internal.j.e(dVar, "<this>");
        if (dVar instanceof b) {
            set = ((b) dVar).f();
        } else {
            HashSet hashSet = new HashSet(dVar.d());
            int d9 = dVar.d();
            for (int i = 0; i < d9; i++) {
                hashSet.add(dVar.e(i));
            }
            set = hashSet;
        }
        this.f5892c = set;
    }

    @Override // q8.d
    public final int a(String str) {
        kotlin.jvm.internal.j.e(str, "name");
        return this.f5890a.a(str);
    }

    @Override // q8.d
    public final String b() {
        return this.f5891b;
    }

    @Override // q8.d
    public final q4.b c() {
        return this.f5890a.c();
    }

    @Override // q8.d
    public final int d() {
        return this.f5890a.d();
    }

    @Override // q8.d
    public final String e(int i) {
        return this.f5890a.e(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return kotlin.jvm.internal.j.a(this.f5890a, ((o) obj).f5890a);
        }
        return false;
    }

    @Override // s8.b
    public final Set f() {
        return this.f5892c;
    }

    @Override // q8.d
    public final boolean g() {
        return true;
    }

    @Override // q8.d
    public final List getAnnotations() {
        return this.f5890a.getAnnotations();
    }

    @Override // q8.d
    public final List h(int i) {
        return this.f5890a.h(i);
    }

    public final int hashCode() {
        return this.f5890a.hashCode() * 31;
    }

    @Override // q8.d
    public final q8.d i(int i) {
        return this.f5890a.i(i);
    }

    @Override // q8.d
    public final boolean isInline() {
        return this.f5890a.isInline();
    }

    @Override // q8.d
    public final boolean j(int i) {
        return this.f5890a.j(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5890a);
        sb.append('?');
        return sb.toString();
    }
}
