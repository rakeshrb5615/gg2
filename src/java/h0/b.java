package h0;

import android.graphics.Insets;
import f2.b0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f2124e = new b(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f2125a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2126b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2127c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2128d;

    public b(int i, int i9, int i10, int i11) {
        this.f2125a = i;
        this.f2126b = i9;
        this.f2127c = i10;
        this.f2128d = i11;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f2125a, bVar2.f2125a), Math.max(bVar.f2126b, bVar2.f2126b), Math.max(bVar.f2127c, bVar2.f2127c), Math.max(bVar.f2128d, bVar2.f2128d));
    }

    public static b b(int i, int i9, int i10, int i11) {
        return (i == 0 && i9 == 0 && i10 == 0 && i11 == 0) ? f2124e : new b(i, i9, i10, i11);
    }

    public static b c(Insets insets) {
        return b(l4.h.a(insets), l4.h.c(insets), l4.h.d(insets), l4.h.f(insets));
    }

    public final Insets d() {
        return b0.i(this.f2125a, this.f2126b, this.f2127c, this.f2128d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2128d == bVar.f2128d && this.f2125a == bVar.f2125a && this.f2127c == bVar.f2127c && this.f2126b == bVar.f2126b;
    }

    public final int hashCode() {
        return (((((this.f2125a * 31) + this.f2126b) * 31) + this.f2127c) * 31) + this.f2128d;
    }

    public final String toString() {
        return "Insets{left=" + this.f2125a + ", top=" + this.f2126b + ", right=" + this.f2127c + ", bottom=" + this.f2128d + '}';
    }
}
