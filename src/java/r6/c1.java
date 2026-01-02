package r6;

import android.util.Log;
import java.util.Map;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class c1 {

    /* renamed from: a  reason: collision with root package name */
    public final u6.k f5616a;

    /* renamed from: b  reason: collision with root package name */
    public final t0 f5617b;

    /* renamed from: c  reason: collision with root package name */
    public final p0 f5618c;

    /* renamed from: d  reason: collision with root package name */
    public final g1 f5619d;

    /* renamed from: e  reason: collision with root package name */
    public final a1.h f5620e;

    /* renamed from: f  reason: collision with root package name */
    public final c0 f5621f;

    /* renamed from: g  reason: collision with root package name */
    public final l7.h f5622g;

    /* renamed from: h  reason: collision with root package name */
    public h0 f5623h;
    public boolean i;
    public String j;

    public c1(u6.k kVar, t0 t0Var, p0 p0Var, g1 g1Var, a1.h hVar, c0 c0Var, l7.h hVar2) {
        kotlin.jvm.internal.j.e(kVar, "sessionsSettings");
        kotlin.jvm.internal.j.e(t0Var, "sessionGenerator");
        kotlin.jvm.internal.j.e(p0Var, "sessionFirelogPublisher");
        kotlin.jvm.internal.j.e(g1Var, "timeProvider");
        kotlin.jvm.internal.j.e(hVar, "sessionDataStore");
        kotlin.jvm.internal.j.e(c0Var, "processDataManager");
        kotlin.jvm.internal.j.e(hVar2, "backgroundDispatcher");
        this.f5616a = kVar;
        this.f5617b = t0Var;
        this.f5618c = p0Var;
        this.f5619d = g1Var;
        this.f5620e = hVar;
        this.f5621f = c0Var;
        this.f5622g = hVar2;
        z0 z0Var = z0.f5768a;
        this.j = "";
        d8.f0.p(d8.f0.b(hVar2), new y0(this, null, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(r6.c1 r4, java.lang.String r5, r6.z0 r6, l7.c r7) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.c1.a(r6.c1, java.lang.String, r6.z0, l7.c):java.lang.Object");
    }

    public final void b() {
        this.i = false;
        if (this.f5623h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f5621f.a());
        d8.f0.p(d8.f0.b(this.f5622g), new y0(this, null, 1));
    }

    public final boolean c(h0 h0Var) {
        Map map = h0Var.f5665c;
        boolean z9 = true;
        c0 c0Var = this.f5621f;
        if (map == null) {
            Log.d("FirebaseSessions", "No process data for " + c0Var.a());
            return true;
        }
        c0Var.getClass();
        a0 a0Var = (a0) map.get(c0Var.a());
        if (a0Var != null && a0Var.f5589a == c0Var.f5612c && kotlin.jvm.internal.j.a(a0Var.f5590b, (String) c0Var.f5613d.getValue())) {
            z9 = false;
        }
        if (z9) {
            Log.d("FirebaseSessions", "Process " + c0Var.a() + " is stale");
        }
        return z9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (c8.a.c(r9) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
        if (c8.a.c(r9) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(r6.h0 r12) {
        /*
            r11 = this;
            r6.f1 r0 = r12.f5664b
            r6.m0 r12 = r12.f5663a
            java.lang.String r1 = "Session "
            java.lang.String r2 = "FirebaseSessions"
            r3 = 0
            if (r0 == 0) goto L74
            r6.g1 r4 = r11.f5619d
            r6.f1 r4 = r4.a()
            int r5 = c8.a.f947d
            long r4 = r4.f5646a
            long r6 = r0.f5646a
            long r4 = r4 - r6
            c8.c r0 = c8.c.f951c
            long r4 = j5.t1.V(r4, r0)
            u6.k r0 = r11.f5616a
            u6.p r6 = r0.f6120a
            c8.a r6 = r6.d()
            r7 = 0
            if (r6 == 0) goto L37
            long r9 = r6.f948a
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 <= 0) goto L37
            boolean r6 = c8.a.c(r9)
            if (r6 != 0) goto L37
            goto L54
        L37:
            u6.p r0 = r0.f6121b
            c8.a r0 = r0.d()
            if (r0 == 0) goto L4c
            long r9 = r0.f948a
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 <= 0) goto L4c
            boolean r0 = c8.a.c(r9)
            if (r0 != 0) goto L4c
            goto L54
        L4c:
            r0 = 30
            c8.c r6 = c8.c.f953e
            long r9 = j5.t1.U(r0, r6)
        L54:
            int r0 = c8.a.b(r4, r9)
            if (r0 <= 0) goto L5b
            r3 = 1
        L5b:
            if (r3 == 0) goto L73
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r12 = r12.f5696a
            r0.append(r12)
            java.lang.String r12 = " is expired"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            android.util.Log.d(r2, r12)
        L73:
            return r3
        L74:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r12 = r12.f5696a
            r0.append(r12)
            java.lang.String r12 = " has not backgrounded yet"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            android.util.Log.d(r2, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.c1.d(r6.h0):boolean");
    }
}
