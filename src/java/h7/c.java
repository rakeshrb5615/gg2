package h7;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class c implements Comparable {

    /* renamed from: b  reason: collision with root package name */
    public static final c f2222b = new c();

    /* renamed from: a  reason: collision with root package name */
    public final int f2223a = 131605;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        kotlin.jvm.internal.j.e(cVar, "other");
        return this.f2223a - cVar.f2223a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        c cVar = obj instanceof c ? (c) obj : null;
        return cVar != null && this.f2223a == cVar.f2223a;
    }

    public final int hashCode() {
        return this.f2223a;
    }

    public final String toString() {
        return "2.2.21";
    }
}
