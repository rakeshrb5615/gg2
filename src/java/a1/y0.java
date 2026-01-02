package a1;

import java.io.FileInputStream;
import java.nio.channels.FileLock;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class y0 extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public m8.c f238a;

    /* renamed from: b  reason: collision with root package name */
    public FileInputStream f239b;

    /* renamed from: c  reason: collision with root package name */
    public FileLock f240c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f241d;

    /* renamed from: e  reason: collision with root package name */
    public /* synthetic */ Object f242e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ z0 f243f;

    /* renamed from: m  reason: collision with root package name */
    public int f244m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(z0 z0Var, n7.c cVar) {
        super(cVar);
        this.f243f = z0Var;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f242e = obj;
        this.f244m |= Integer.MIN_VALUE;
        return this.f243f.b(null, this);
    }
}
