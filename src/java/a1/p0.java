package a1;

import java.io.FileOutputStream;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class p0 extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public FileOutputStream f172a;

    /* renamed from: b  reason: collision with root package name */
    public FileOutputStream f173b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f174c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ q0 f175d;

    /* renamed from: e  reason: collision with root package name */
    public int f176e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(q0 q0Var, n7.c cVar) {
        super(cVar);
        this.f175d = q0Var;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f174c = obj;
        this.f176e |= Integer.MIN_VALUE;
        return this.f175d.b(null, this);
    }
}
