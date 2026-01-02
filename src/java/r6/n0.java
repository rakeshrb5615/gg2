package r6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    public final v0 f5703a;

    /* renamed from: b  reason: collision with root package name */
    public final b f5704b;

    public n0(v0 v0Var, b bVar) {
        n nVar = n.f5700b;
        this.f5703a = v0Var;
        this.f5704b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n0) {
            n0 n0Var = (n0) obj;
            n nVar = n.f5700b;
            return this.f5703a.equals(n0Var.f5703a) && this.f5704b.equals(n0Var.f5704b);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f5703a.hashCode();
        return this.f5704b.hashCode() + ((hashCode + (n.f5700b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + n.f5700b + ", sessionData=" + this.f5703a + ", applicationInfo=" + this.f5704b + ')';
    }
}
