package s1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f5776a;

    /* renamed from: b  reason: collision with root package name */
    public final float f5777b;

    /* renamed from: c  reason: collision with root package name */
    public final float f5778c;

    /* renamed from: d  reason: collision with root package name */
    public final float f5779d;

    /* renamed from: e  reason: collision with root package name */
    public final long f5780e;

    public b(int i, float f9, float f10, float f11, long j) {
        this.f5776a = i;
        this.f5777b = f9;
        this.f5778c = f10;
        this.f5779d = f11;
        this.f5780e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            return this.f5778c == bVar.f5778c && this.f5779d == bVar.f5779d && this.f5777b == bVar.f5777b && this.f5776a == bVar.f5776a && this.f5780e == bVar.f5780e;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.f5779d);
        int hashCode2 = Float.hashCode(this.f5777b);
        int hashCode3 = Integer.hashCode(this.f5776a);
        return Long.hashCode(this.f5780e) + ((hashCode3 + ((hashCode2 + ((hashCode + (Float.hashCode(this.f5778c) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.f5778c + ", touchY=" + this.f5779d + ", progress=" + this.f5777b + ", swipeEdge=" + this.f5776a + ", frameTimeMillis=" + this.f5780e + ')';
    }
}
