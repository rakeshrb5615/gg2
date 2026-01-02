package g1;

import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class u {

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadLocal f1680d = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    public final int f1681a;

    /* renamed from: b  reason: collision with root package name */
    public final j6.s f1682b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f1683c = 0;

    public u(j6.s sVar, int i) {
        this.f1682b = sVar;
        this.f1681a = i;
    }

    public final int a(int i) {
        h1.a b10 = b();
        int b11 = b10.b(16);
        if (b11 != 0) {
            ByteBuffer byteBuffer = (ByteBuffer) b10.f2147d;
            int i9 = b11 + b10.f2144a;
            return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i9) + i9 + 4);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, h1.c] */
    public final h1.a b() {
        ThreadLocal threadLocal = f1680d;
        h1.a aVar = (h1.a) threadLocal.get();
        h1.a aVar2 = aVar;
        if (aVar == null) {
            ?? cVar = new h1.c();
            threadLocal.set(cVar);
            aVar2 = cVar;
        }
        h1.b bVar = (h1.b) this.f1682b.f3282b;
        int b10 = bVar.b(6);
        if (b10 != 0) {
            int i = b10 + bVar.f2144a;
            int i9 = (this.f1681a * 4) + ((ByteBuffer) bVar.f2147d).getInt(i) + i + 4;
            int i10 = ((ByteBuffer) bVar.f2147d).getInt(i9) + i9;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f2147d;
            aVar2.f2147d = byteBuffer;
            if (byteBuffer != null) {
                aVar2.f2144a = i10;
                int i11 = i10 - byteBuffer.getInt(i10);
                aVar2.f2145b = i11;
                aVar2.f2146c = ((ByteBuffer) aVar2.f2147d).getShort(i11);
                return aVar2;
            }
            aVar2.f2144a = 0;
            aVar2.f2145b = 0;
            aVar2.f2146c = 0;
        }
        return aVar2;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        h1.a b10 = b();
        int b11 = b10.b(4);
        sb.append(Integer.toHexString(b11 != 0 ? ((ByteBuffer) b10.f2147d).getInt(b11 + b10.f2144a) : 0));
        sb.append(", codepoints:");
        h1.a b12 = b();
        int b13 = b12.b(16);
        if (b13 != 0) {
            int i9 = b13 + b12.f2144a;
            i = ((ByteBuffer) b12.f2147d).getInt(((ByteBuffer) b12.f2147d).getInt(i9) + i9);
        } else {
            i = 0;
        }
        for (int i10 = 0; i10 < i; i10++) {
            sb.append(Integer.toHexString(a(i10)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
