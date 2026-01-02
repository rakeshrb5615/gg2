package j5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class p0 extends j2 {

    /* renamed from: a  reason: collision with root package name */
    public final long f3106a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3107b;

    /* renamed from: c  reason: collision with root package name */
    public final d2 f3108c;

    /* renamed from: d  reason: collision with root package name */
    public final e2 f3109d;

    /* renamed from: e  reason: collision with root package name */
    public final f2 f3110e;

    /* renamed from: f  reason: collision with root package name */
    public final i2 f3111f;

    public p0(long j, String str, d2 d2Var, e2 e2Var, f2 f2Var, i2 i2Var) {
        this.f3106a = j;
        this.f3107b = str;
        this.f3108c = d2Var;
        this.f3109d = e2Var;
        this.f3110e = f2Var;
        this.f3111f = i2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, j5.o0] */
    public final o0 a() {
        ?? obj = new Object();
        obj.f3095a = this.f3106a;
        obj.f3096b = this.f3107b;
        obj.f3097c = this.f3108c;
        obj.f3098d = this.f3109d;
        obj.f3099e = this.f3110e;
        obj.f3100f = this.f3111f;
        obj.f3101g = (byte) 1;
        return obj;
    }

    public final boolean equals(Object obj) {
        f2 f2Var;
        i2 i2Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof j2) {
            p0 p0Var = (p0) ((j2) obj);
            i2 i2Var2 = p0Var.f3111f;
            f2 f2Var2 = p0Var.f3110e;
            if (this.f3106a == p0Var.f3106a && this.f3107b.equals(p0Var.f3107b) && this.f3108c.equals(p0Var.f3108c) && this.f3109d.equals(p0Var.f3109d) && ((f2Var = this.f3110e) != null ? f2Var.equals(f2Var2) : f2Var2 == null) && ((i2Var = this.f3111f) != null ? i2Var.equals(i2Var2) : i2Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f3106a;
        int hashCode = (((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f3107b.hashCode()) * 1000003) ^ this.f3108c.hashCode()) * 1000003) ^ this.f3109d.hashCode()) * 1000003;
        f2 f2Var = this.f3110e;
        int hashCode2 = (hashCode ^ (f2Var == null ? 0 : f2Var.hashCode())) * 1000003;
        i2 i2Var = this.f3111f;
        return hashCode2 ^ (i2Var != null ? i2Var.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.f3106a + ", type=" + this.f3107b + ", app=" + this.f3108c + ", device=" + this.f3109d + ", log=" + this.f3110e + ", rollouts=" + this.f3111f + "}";
    }
}
