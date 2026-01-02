package y8;

import java.io.IOException;
import x8.h0;
import x8.o;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class g extends o {

    /* renamed from: b  reason: collision with root package name */
    public final long f6988b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f6989c;

    /* renamed from: d  reason: collision with root package name */
    public long f6990d;

    public g(h0 h0Var, long j, boolean z9) {
        super(h0Var);
        this.f6988b = j;
        this.f6989c = z9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, x8.g] */
    @Override // x8.o, x8.h0
    public final long t(x8.g gVar, long j) {
        kotlin.jvm.internal.j.e(gVar, "sink");
        long j8 = this.f6990d;
        long j9 = this.f6988b;
        if (j8 > j9) {
            j = 0;
        } else if (this.f6989c) {
            long j10 = j9 - j8;
            if (j10 == 0) {
                return -1L;
            }
            j = Math.min(j, j10);
        }
        long t7 = super.t(gVar, j);
        int i = (t7 > (-1L) ? 1 : (t7 == (-1L) ? 0 : -1));
        if (i != 0) {
            this.f6990d += t7;
        }
        long j11 = this.f6990d;
        int i9 = (j11 > j9 ? 1 : (j11 == j9 ? 0 : -1));
        if ((i9 >= 0 || i != 0) && i9 <= 0) {
            return t7;
        }
        if (t7 > 0 && i9 > 0) {
            ?? obj = new Object();
            obj.L(gVar);
            gVar.k(obj, gVar.f6642b - (j11 - j9));
            obj.s();
        }
        throw new IOException("expected " + j9 + " bytes but got " + this.f6990d);
    }
}
