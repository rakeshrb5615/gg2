package g1;

import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public int f1659a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final r f1660b;

    /* renamed from: c  reason: collision with root package name */
    public r f1661c;

    /* renamed from: d  reason: collision with root package name */
    public r f1662d;

    /* renamed from: e  reason: collision with root package name */
    public int f1663e;

    /* renamed from: f  reason: collision with root package name */
    public int f1664f;

    public o(r rVar) {
        this.f1660b = rVar;
        this.f1661c = rVar;
    }

    public final void a() {
        this.f1659a = 1;
        this.f1661c = this.f1660b;
        this.f1664f = 0;
    }

    public final boolean b() {
        h1.a b10 = this.f1661c.f1675b.b();
        int b11 = b10.b(6);
        return !(b11 == 0 || ((ByteBuffer) b10.f2147d).get(b11 + b10.f2144a) == 0) || this.f1663e == 65039;
    }
}
