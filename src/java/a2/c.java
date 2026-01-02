package a2;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public long f283a = 0;

    /* renamed from: b  reason: collision with root package name */
    public c f284b;

    public final void a(int i) {
        if (i < 64) {
            this.f283a &= ~(1 << i);
            return;
        }
        c cVar = this.f284b;
        if (cVar != null) {
            cVar.a(i - 64);
        }
    }

    public final int b(int i) {
        c cVar = this.f284b;
        if (cVar == null) {
            return i >= 64 ? Long.bitCount(this.f283a) : Long.bitCount(this.f283a & ((1 << i) - 1));
        } else if (i < 64) {
            return Long.bitCount(this.f283a & ((1 << i) - 1));
        } else {
            return Long.bitCount(this.f283a) + cVar.b(i - 64);
        }
    }

    public final void c() {
        if (this.f284b == null) {
            this.f284b = new c();
        }
    }

    public final boolean d(int i) {
        if (i < 64) {
            return (this.f283a & (1 << i)) != 0;
        }
        c();
        return this.f284b.d(i - 64);
    }

    public final void e(int i, boolean z9) {
        if (i >= 64) {
            c();
            this.f284b.e(i - 64, z9);
            return;
        }
        long j = this.f283a;
        boolean z10 = (Long.MIN_VALUE & j) != 0;
        long j8 = (1 << i) - 1;
        this.f283a = ((j & (~j8)) << 1) | (j & j8);
        if (z9) {
            h(i);
        } else {
            a(i);
        }
        if (z10 || this.f284b != null) {
            c();
            this.f284b.e(0, z10);
        }
    }

    public final boolean f(int i) {
        if (i >= 64) {
            c();
            return this.f284b.f(i - 64);
        }
        long j = 1 << i;
        long j8 = this.f283a;
        boolean z9 = (j8 & j) != 0;
        long j9 = j8 & (~j);
        this.f283a = j9;
        long j10 = j - 1;
        this.f283a = (j9 & j10) | Long.rotateRight((~j10) & j9, 1);
        c cVar = this.f284b;
        if (cVar != null) {
            if (cVar.d(0)) {
                h(63);
            }
            this.f284b.f(0);
        }
        return z9;
    }

    public final void g() {
        this.f283a = 0L;
        c cVar = this.f284b;
        if (cVar != null) {
            cVar.g();
        }
    }

    public final void h(int i) {
        if (i < 64) {
            this.f283a |= 1 << i;
            return;
        }
        c();
        this.f284b.h(i - 64);
    }

    public final String toString() {
        if (this.f284b == null) {
            return Long.toBinaryString(this.f283a);
        }
        return this.f284b.toString() + "xx" + Long.toBinaryString(this.f283a);
    }
}
