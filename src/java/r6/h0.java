package r6;

import java.util.Map;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class h0 {
    public static final g0 Companion = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final o8.a[] f5662d;

    /* renamed from: a  reason: collision with root package name */
    public final m0 f5663a;

    /* renamed from: b  reason: collision with root package name */
    public final f1 f5664b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f5665c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, r6.g0] */
    static {
        s8.p pVar = s8.p.f5893a;
        f5662d = new o8.a[]{null, null, new s8.h(y.f5764a)};
    }

    public /* synthetic */ h0(int i, m0 m0Var, f1 f1Var, Map map) {
        if (1 != (i & 1)) {
            s8.k.a(i, 1, f0.f5645a.d());
            throw null;
        }
        this.f5663a = m0Var;
        if ((i & 2) == 0) {
            this.f5664b = null;
        } else {
            this.f5664b = f1Var;
        }
        if ((i & 4) == 0) {
            this.f5665c = null;
        } else {
            this.f5665c = map;
        }
    }

    public static h0 a(h0 h0Var, m0 m0Var, f1 f1Var, Map map, int i) {
        if ((i & 1) != 0) {
            m0Var = h0Var.f5663a;
        }
        if ((i & 2) != 0) {
            f1Var = h0Var.f5664b;
        }
        if ((i & 4) != 0) {
            map = h0Var.f5665c;
        }
        h0Var.getClass();
        kotlin.jvm.internal.j.e(m0Var, "sessionDetails");
        return new h0(m0Var, f1Var, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            return kotlin.jvm.internal.j.a(this.f5663a, h0Var.f5663a) && kotlin.jvm.internal.j.a(this.f5664b, h0Var.f5664b) && kotlin.jvm.internal.j.a(this.f5665c, h0Var.f5665c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f5663a.hashCode() * 31;
        f1 f1Var = this.f5664b;
        int hashCode2 = (hashCode + (f1Var == null ? 0 : Long.hashCode(f1Var.f5646a))) * 31;
        Map map = this.f5665c;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.f5663a + ", backgroundTime=" + this.f5664b + ", processDataMap=" + this.f5665c + ')';
    }

    public h0(m0 m0Var, f1 f1Var, Map map) {
        kotlin.jvm.internal.j.e(m0Var, "sessionDetails");
        this.f5663a = m0Var;
        this.f5664b = f1Var;
        this.f5665c = map;
    }
}
