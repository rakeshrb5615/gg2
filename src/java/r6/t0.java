package r6;

import java.util.Locale;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    public final g1 f5737a;

    /* renamed from: b  reason: collision with root package name */
    public final h1 f5738b;

    public t0(g1 g1Var, h1 h1Var) {
        kotlin.jvm.internal.j.e(g1Var, "timeProvider");
        kotlin.jvm.internal.j.e(h1Var, "uuidGenerator");
        this.f5737a = g1Var;
        this.f5738b = h1Var;
    }

    public final m0 a(m0 m0Var) {
        String str;
        this.f5738b.getClass();
        UUID randomUUID = UUID.randomUUID();
        kotlin.jvm.internal.j.d(randomUUID, "randomUUID(...)");
        String uuid = randomUUID.toString();
        kotlin.jvm.internal.j.d(uuid, "toString(...)");
        String lowerCase = b8.p.n0(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.j.d(lowerCase, "toLowerCase(...)");
        return new m0(m0Var != null ? m0Var.f5698c + 1 : 0, lowerCase, (m0Var == null || (str = m0Var.f5697b) == null) ? lowerCase : str, this.f5737a.a().f5647b);
    }
}
