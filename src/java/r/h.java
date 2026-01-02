package r;

import java.util.ConcurrentModificationException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f5467a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f5468b = new Object();

    public static final void a(f fVar, int i) {
        fVar.f5460a = new int[i];
        fVar.f5461b = new Object[i];
    }

    public static final int b(f fVar, Object obj, int i) {
        int i9 = fVar.f5462c;
        if (i9 == 0) {
            return -1;
        }
        try {
            int a10 = s.a.a(i9, i, fVar.f5460a);
            if (a10 >= 0 && !kotlin.jvm.internal.j.a(obj, fVar.f5461b[a10])) {
                int i10 = a10 + 1;
                while (i10 < i9 && fVar.f5460a[i10] == i) {
                    if (kotlin.jvm.internal.j.a(obj, fVar.f5461b[i10])) {
                        return i10;
                    }
                    i10++;
                }
                for (int i11 = a10 - 1; i11 >= 0 && fVar.f5460a[i11] == i; i11--) {
                    if (kotlin.jvm.internal.j.a(obj, fVar.f5461b[i11])) {
                        return i11;
                    }
                }
                return ~i10;
            }
            return a10;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
