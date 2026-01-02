package a1;

import java.io.FileInputStream;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class h0 extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public Object f84a;

    /* renamed from: b  reason: collision with root package name */
    public FileInputStream f85b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f86c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ i0 f87d;

    /* renamed from: e  reason: collision with root package name */
    public int f88e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, n7.c cVar) {
        super(cVar);
        this.f87d = i0Var;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f86c = obj;
        this.f88e |= Integer.MIN_VALUE;
        return i0.a(this.f87d, this);
    }
}
