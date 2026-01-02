package a1;

import java.io.Serializable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class b0 extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public Object f12a;

    /* renamed from: b  reason: collision with root package name */
    public Object f13b;

    /* renamed from: c  reason: collision with root package name */
    public Serializable f14c;

    /* renamed from: d  reason: collision with root package name */
    public kotlin.jvm.internal.r f15d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16e;

    /* renamed from: f  reason: collision with root package name */
    public int f17f;

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f18m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ g0 f19n;

    /* renamed from: o  reason: collision with root package name */
    public int f20o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(g0 g0Var, n7.c cVar) {
        super(cVar);
        this.f19n = g0Var;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f18m = obj;
        this.f20o |= Integer.MIN_VALUE;
        return g0.g(this.f19n, false, this);
    }
}
