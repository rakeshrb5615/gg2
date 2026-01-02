package z8;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class w extends x8.o {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x f7578b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, x8.i iVar) {
        super(iVar);
        this.f7578b = xVar;
    }

    @Override // x8.o, x8.h0
    public final long t(x8.g gVar, long j) {
        try {
            return super.t(gVar, j);
        } catch (IOException e9) {
            this.f7578b.f7582f = e9;
            throw e9;
        }
    }
}
