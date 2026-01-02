package j5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class l implements t5.d {

    /* renamed from: a  reason: collision with root package name */
    public static final l f3044a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final t5.c f3045b = t5.c.a("baseAddress");

    /* renamed from: c  reason: collision with root package name */
    public static final t5.c f3046c = t5.c.a("size");

    /* renamed from: d  reason: collision with root package name */
    public static final t5.c f3047d = t5.c.a("name");

    /* renamed from: e  reason: collision with root package name */
    public static final t5.c f3048e = t5.c.a("uuid");

    @Override // t5.a
    public final void a(Object obj, Object obj2) {
        t5.e eVar = (t5.e) obj2;
        s0 s0Var = (s0) ((w1) obj);
        eVar.c(f3045b, s0Var.f3142a);
        eVar.c(f3046c, s0Var.f3143b);
        eVar.f(f3047d, s0Var.f3144c);
        String str = s0Var.f3145d;
        eVar.f(f3048e, str != null ? str.getBytes(n2.f3090a) : null);
    }
}
