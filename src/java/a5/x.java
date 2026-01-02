package a5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final Class f617a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f618b;

    public x(Class cls, Class cls2) {
        this.f617a = cls;
        this.f618b = cls2;
    }

    public static x a(Class cls) {
        return new x(w.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f618b.equals(xVar.f618b)) {
            return this.f617a.equals(xVar.f617a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f617a.hashCode() + (this.f618b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f618b;
        Class cls2 = this.f617a;
        if (cls2 == w.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
