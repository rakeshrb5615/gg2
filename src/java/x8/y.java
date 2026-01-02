package x8;

import java.io.File;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class y implements Comparable {

    /* renamed from: b  reason: collision with root package name */
    public static final String f6688b;

    /* renamed from: a  reason: collision with root package name */
    public final j f6689a;

    static {
        String str = File.separator;
        kotlin.jvm.internal.j.d(str, "separator");
        f6688b = str;
    }

    public y(j jVar) {
        kotlin.jvm.internal.j.e(jVar, "bytes");
        this.f6689a = jVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a10 = y8.c.a(this);
        j jVar = this.f6689a;
        if (a10 == -1) {
            a10 = 0;
        } else if (a10 < jVar.d() && jVar.i(a10) == 92) {
            a10++;
        }
        int d9 = jVar.d();
        int i = a10;
        while (a10 < d9) {
            if (jVar.i(a10) == 47 || jVar.i(a10) == 92) {
                arrayList.add(jVar.o(i, a10));
                i = a10 + 1;
            }
            a10++;
        }
        if (i < jVar.d()) {
            arrayList.add(jVar.o(i, jVar.d()));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, x8.g] */
    public final y b(y yVar) {
        kotlin.jvm.internal.j.e(yVar, "other");
        j jVar = yVar.f6689a;
        int a10 = y8.c.a(this);
        j jVar2 = this.f6689a;
        y yVar2 = a10 == -1 ? null : new y(jVar2.o(0, a10));
        int a11 = y8.c.a(yVar);
        if (!kotlin.jvm.internal.j.a(yVar2, a11 != -1 ? new y(jVar.o(0, a11)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + yVar).toString());
        }
        ArrayList a12 = a();
        ArrayList a13 = yVar.a();
        int min = Math.min(a12.size(), a13.size());
        int i = 0;
        while (i < min && kotlin.jvm.internal.j.a(a12.get(i), a13.get(i))) {
            i++;
        }
        if (i == min && jVar2.d() == jVar.d()) {
            return a6.e.d(".");
        }
        if (a13.subList(i, a13.size()).indexOf(y8.c.f6979e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + yVar).toString());
        } else if (kotlin.jvm.internal.j.a(jVar, y8.c.f6978d)) {
            return this;
        } else {
            ?? obj = new Object();
            j c9 = y8.c.c(yVar);
            if (c9 == null && (c9 = y8.c.c(this)) == null) {
                c9 = y8.c.f(f6688b);
            }
            int size = a13.size();
            for (int i9 = i; i9 < size; i9++) {
                obj.K(y8.c.f6979e);
                obj.K(c9);
            }
            int size2 = a12.size();
            while (i < size2) {
                obj.K((j) a12.get(i));
                obj.K(c9);
                i++;
            }
            return y8.c.d(obj, false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, x8.g] */
    public final y c(String str) {
        kotlin.jvm.internal.j.e(str, "child");
        ?? obj = new Object();
        obj.S(str);
        return y8.c.b(this, y8.c.d(obj, false), false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        y yVar = (y) obj;
        kotlin.jvm.internal.j.e(yVar, "other");
        return this.f6689a.compareTo(yVar.f6689a);
    }

    public final Character d() {
        j jVar = y8.c.f6975a;
        j jVar2 = this.f6689a;
        if (j.g(jVar2, jVar) == -1 && jVar2.d() >= 2 && jVar2.i(1) == 58) {
            char i = (char) jVar2.i(0);
            if (('a' > i || i >= '{') && ('A' > i || i >= '[')) {
                return null;
            }
            return Character.valueOf(i);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y) && kotlin.jvm.internal.j.a(((y) obj).f6689a, this.f6689a);
    }

    public final int hashCode() {
        return this.f6689a.hashCode();
    }

    public final File toFile() {
        return new File(this.f6689a.r());
    }

    public final String toString() {
        return this.f6689a.r();
    }
}
