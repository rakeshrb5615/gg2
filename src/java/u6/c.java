package u6;

import j5.t1;
import r6.g1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class c implements p {

    /* renamed from: g  reason: collision with root package name */
    public static final int f6093g;

    /* renamed from: h  reason: collision with root package name */
    public static final b8.h f6094h;

    /* renamed from: a  reason: collision with root package name */
    public final g1 f6095a;

    /* renamed from: b  reason: collision with root package name */
    public final d6.d f6096b;

    /* renamed from: c  reason: collision with root package name */
    public final r6.b f6097c;

    /* renamed from: d  reason: collision with root package name */
    public final e f6098d;

    /* renamed from: e  reason: collision with root package name */
    public final o f6099e;

    /* renamed from: f  reason: collision with root package name */
    public final m8.c f6100f;

    static {
        int i = c8.a.f947d;
        f6093g = (int) c8.a.d(t1.U(24, c8.c.f954f), c8.c.f952d);
        f6094h = new b8.h("/");
    }

    public c(g1 g1Var, d6.d dVar, r6.b bVar, e eVar, o oVar) {
        kotlin.jvm.internal.j.e(g1Var, "timeProvider");
        kotlin.jvm.internal.j.e(dVar, "firebaseInstallationsApi");
        kotlin.jvm.internal.j.e(bVar, "appInfo");
        kotlin.jvm.internal.j.e(eVar, "configsFetcher");
        kotlin.jvm.internal.j.e(oVar, "settingsCache");
        this.f6095a = g1Var;
        this.f6096b = dVar;
        this.f6097c = bVar;
        this.f6098d = eVar;
        this.f6099e = oVar;
        this.f6100f = m8.d.a();
    }

    @Override // u6.p
    public final Boolean a() {
        return this.f6099e.a().f6109a;
    }

    @Override // u6.p
    public final Double b() {
        return this.f6099e.a().f6110b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:21:0x0050, B:43:0x00ab, B:45:0x00b5, B:48:0x00c0, B:35:0x0086, B:37:0x008e, B:40:0x0099), top: B:59:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099 A[Catch: all -> 0x0054, TRY_ENTER, TryCatch #0 {all -> 0x0054, blocks: (B:21:0x0050, B:43:0x00ab, B:45:0x00b5, B:48:0x00c0, B:35:0x0086, B:37:0x008e, B:40:0x0099), top: B:59:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:21:0x0050, B:43:0x00ab, B:45:0x00b5, B:48:0x00c0, B:35:0x0086, B:37:0x008e, B:40:0x0099), top: B:59:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0 A[Catch: all -> 0x0054, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:21:0x0050, B:43:0x00ab, B:45:0x00b5, B:48:0x00c0, B:35:0x0086, B:37:0x008e, B:40:0x0099), top: B:59:0x002e }] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    @Override // u6.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(l7.c r19) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.c.c(l7.c):java.lang.Object");
    }

    @Override // u6.p
    public final c8.a d() {
        Integer num = this.f6099e.a().f6111c;
        if (num != null) {
            int i = c8.a.f947d;
            return new c8.a(t1.U(num.intValue(), c8.c.f952d));
        }
        return null;
    }
}
