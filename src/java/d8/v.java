package d8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1249a;

    /* renamed from: b  reason: collision with root package name */
    public final k f1250b;

    /* renamed from: c  reason: collision with root package name */
    public final u7.q f1251c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f1252d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f1253e;

    public v(Object obj, k kVar, u7.q qVar, Object obj2, Throwable th) {
        this.f1249a = obj;
        this.f1250b = kVar;
        this.f1251c = qVar;
        this.f1252d = obj2;
        this.f1253e = th;
    }

    public static v a(v vVar, k kVar, Throwable th, int i) {
        Object obj = vVar.f1249a;
        if ((i & 2) != 0) {
            kVar = vVar.f1250b;
        }
        k kVar2 = kVar;
        u7.q qVar = vVar.f1251c;
        Object obj2 = vVar.f1252d;
        if ((i & 16) != 0) {
            th = vVar.f1253e;
        }
        return new v(obj, kVar2, qVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            return kotlin.jvm.internal.j.a(this.f1249a, vVar.f1249a) && kotlin.jvm.internal.j.a(this.f1250b, vVar.f1250b) && kotlin.jvm.internal.j.a(this.f1251c, vVar.f1251c) && kotlin.jvm.internal.j.a(this.f1252d, vVar.f1252d) && kotlin.jvm.internal.j.a(this.f1253e, vVar.f1253e);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f1249a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        k kVar = this.f1250b;
        int hashCode2 = (hashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        u7.q qVar = this.f1251c;
        int hashCode3 = (hashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Object obj2 = this.f1252d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f1253e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f1249a + ", cancelHandler=" + this.f1250b + ", onCancellation=" + this.f1251c + ", idempotentResume=" + this.f1252d + ", cancelCause=" + this.f1253e + ')';
    }

    public /* synthetic */ v(Object obj, k kVar, u7.q qVar, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : kVar, (i & 4) != 0 ? null : qVar, (Object) null, (i & 16) != 0 ? null : th);
    }
}
