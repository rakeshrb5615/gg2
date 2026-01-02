package x2;

import java.util.HashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final a3.a f6542a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f6543b;

    public b(a3.a aVar, HashMap hashMap) {
        this.f6542a = aVar;
        this.f6543b = hashMap;
    }

    public final long a(o2.d dVar, long j, int i) {
        int i9;
        long b10 = j - this.f6542a.b();
        c cVar = (c) this.f6543b.get(dVar);
        long j8 = cVar.f6544a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j8 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j8 > 1 ? j8 : 2L) * i9))), b10), cVar.f6545b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f6542a.equals(bVar.f6542a) && this.f6543b.equals(bVar.f6543b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f6542a.hashCode() ^ 1000003) * 1000003) ^ this.f6543b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f6542a + ", values=" + this.f6543b + "}";
    }
}
