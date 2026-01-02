package x8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f6619a;

    /* renamed from: b  reason: collision with root package name */
    public int f6620b;

    /* renamed from: c  reason: collision with root package name */
    public int f6621c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6622d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6623e;

    /* renamed from: f  reason: collision with root package name */
    public c0 f6624f;

    /* renamed from: g  reason: collision with root package name */
    public c0 f6625g;

    public c0() {
        this.f6619a = new byte[8192];
        this.f6623e = true;
        this.f6622d = false;
    }

    public final c0 a() {
        c0 c0Var = this.f6624f;
        if (c0Var == this) {
            c0Var = null;
        }
        c0 c0Var2 = this.f6625g;
        kotlin.jvm.internal.j.b(c0Var2);
        c0Var2.f6624f = this.f6624f;
        c0 c0Var3 = this.f6624f;
        kotlin.jvm.internal.j.b(c0Var3);
        c0Var3.f6625g = this.f6625g;
        this.f6624f = null;
        this.f6625g = null;
        return c0Var;
    }

    public final void b(c0 c0Var) {
        kotlin.jvm.internal.j.e(c0Var, "segment");
        c0Var.f6625g = this;
        c0Var.f6624f = this.f6624f;
        c0 c0Var2 = this.f6624f;
        kotlin.jvm.internal.j.b(c0Var2);
        c0Var2.f6625g = c0Var;
        this.f6624f = c0Var;
    }

    public final c0 c() {
        this.f6622d = true;
        return new c0(this.f6619a, this.f6620b, this.f6621c, true, false);
    }

    public final void d(c0 c0Var, int i) {
        kotlin.jvm.internal.j.e(c0Var, "sink");
        byte[] bArr = c0Var.f6619a;
        if (!c0Var.f6623e) {
            throw new IllegalStateException("only owner can write");
        }
        int i9 = c0Var.f6621c;
        int i10 = i9 + i;
        if (i10 > 8192) {
            if (c0Var.f6622d) {
                throw new IllegalArgumentException();
            }
            int i11 = c0Var.f6620b;
            if (i10 - i11 > 8192) {
                throw new IllegalArgumentException();
            }
            i7.h.Y(bArr, 0, bArr, i11, i9);
            c0Var.f6621c -= c0Var.f6620b;
            c0Var.f6620b = 0;
        }
        int i12 = c0Var.f6621c;
        int i13 = this.f6620b;
        i7.h.Y(this.f6619a, i12, bArr, i13, i13 + i);
        c0Var.f6621c += i;
        this.f6620b += i;
    }

    public c0(byte[] bArr, int i, int i9, boolean z9, boolean z10) {
        kotlin.jvm.internal.j.e(bArr, "data");
        this.f6619a = bArr;
        this.f6620b = i;
        this.f6621c = i9;
        this.f6622d = z9;
        this.f6623e = z10;
    }
}
