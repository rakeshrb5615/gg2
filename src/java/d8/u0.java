package d8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class u0 implements Runnable, Comparable, p0 {
    private volatile Object _heap;

    /* renamed from: a  reason: collision with root package name */
    public long f1247a;

    /* renamed from: b  reason: collision with root package name */
    public int f1248b = -1;

    public u0(long j) {
        this.f1247a = j;
    }

    @Override // d8.p0
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                d4.l lVar = f0.f1186b;
                if (obj == lVar) {
                    return;
                }
                v0 v0Var = obj instanceof v0 ? (v0) obj : null;
                if (v0Var != null) {
                    synchronized (v0Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof i8.u ? (i8.u) obj2 : null) != null) {
                            v0Var.b(this.f1248b);
                        }
                    }
                }
                this._heap = lVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int c(long j, v0 v0Var, w0 w0Var) {
        synchronized (this) {
            if (this._heap == f0.f1186b) {
                return 2;
            }
            synchronized (v0Var) {
                u0[] u0VarArr = v0Var.f2803a;
                u0 u0Var = u0VarArr != null ? u0VarArr[0] : null;
                if (w0.f1259o.get(w0Var) != 0) {
                    return 1;
                }
                if (u0Var == null) {
                    v0Var.f1254c = j;
                } else {
                    long j8 = u0Var.f1247a;
                    if (j8 - j < 0) {
                        j = j8;
                    }
                    if (j - v0Var.f1254c > 0) {
                        v0Var.f1254c = j;
                    }
                }
                long j9 = this.f1247a;
                long j10 = v0Var.f1254c;
                if (j9 - j10 < 0) {
                    this.f1247a = j10;
                }
                v0Var.a(this);
                return 0;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i = ((this.f1247a - ((u0) obj).f1247a) > 0L ? 1 : ((this.f1247a - ((u0) obj).f1247a) == 0L ? 0 : -1));
        if (i > 0) {
            return 1;
        }
        return i < 0 ? -1 : 0;
    }

    public final void d(v0 v0Var) {
        if (this._heap == f0.f1186b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = v0Var;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f1247a + ']';
    }
}
