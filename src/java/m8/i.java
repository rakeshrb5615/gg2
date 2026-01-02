package m8;

import i8.r;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class i extends r {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f4075e;

    public i(long j, i iVar, int i) {
        super(j, iVar, i);
        this.f4075e = new AtomicReferenceArray(h.f4074f);
    }

    @Override // i8.r
    public final int g() {
        return h.f4074f;
    }

    @Override // i8.r
    public final void h(int i, l7.h hVar) {
        this.f4075e.set(i, h.f4073e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f2799c + ", hashCode=" + hashCode() + ']';
    }
}
