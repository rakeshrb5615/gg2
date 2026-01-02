package g8;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class y extends h8.b implements u, c, h8.d {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1960e = AtomicReferenceFieldUpdater.newUpdater(y.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d  reason: collision with root package name */
    public int f1961d;

    public y(Object obj) {
        this._state$volatile = obj;
    }

    @Override // g8.d
    public final Object a(Object obj, l7.c cVar) {
        d(obj);
        return h7.l.f2236a;
    }

    public final Object b() {
        Object obj = f1960e.get(this);
        if (obj == h8.f.f2244a) {
            return null;
        }
        return obj;
    }

    @Override // h8.d
    public final c c(l7.h hVar, int i, f8.a aVar) {
        return z.f(this, hVar, i, aVar);
    }

    public final void d(Object obj) {
        if (obj == null) {
            obj = h8.f.f2244a;
        }
        e(null, obj);
    }

    public final boolean e(Object obj, Object obj2) {
        int i;
        a0[] a0VarArr;
        d4.l lVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1960e;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.j.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.j.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i9 = this.f1961d;
            if ((i9 & 1) != 0) {
                this.f1961d = i9 + 2;
                return true;
            }
            int i10 = i9 + 1;
            this.f1961d = i10;
            a0[] a0VarArr2 = this.f2238a;
            while (true) {
                a0[] a0VarArr3 = a0VarArr2;
                if (a0VarArr3 != null) {
                    for (a0 a0Var : a0VarArr3) {
                        if (a0Var != null) {
                            AtomicReference atomicReference = a0Var.f1879a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (lVar = z.f1963b)) {
                                    d4.l lVar2 = z.f1962a;
                                    if (obj4 != lVar2) {
                                        while (!atomicReference.compareAndSet(obj4, lVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((d8.n) obj4).resumeWith(h7.l.f2236a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, lVar)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f1961d;
                    if (i == i10) {
                        this.f1961d = i10 + 1;
                        return true;
                    }
                    a0VarArr = this.f2238a;
                }
                a0VarArr2 = a0VarArr;
                i10 = i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e0, code lost:
        if (r0.equals(r4) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0142, code lost:
        if (r4 == r3) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:14:0x0039, B:50:0x00c6, B:52:0x00ce, B:55:0x00d5, B:56:0x00d9, B:58:0x00dc, B:68:0x00fd, B:71:0x010d, B:72:0x0129, B:78:0x0139, B:75:0x0130, B:77:0x0136, B:60:0x00e2, B:64:0x00e9, B:21:0x0054, B:24:0x005f, B:49:0x00b7), top: B:102:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010d A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:14:0x0039, B:50:0x00c6, B:52:0x00ce, B:55:0x00d5, B:56:0x00d9, B:58:0x00dc, B:68:0x00fd, B:71:0x010d, B:72:0x0129, B:78:0x0139, B:75:0x0130, B:77:0x0136, B:60:0x00e2, B:64:0x00e9, B:21:0x0054, B:24:0x005f, B:49:0x00b7), top: B:102:0x0027 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x010c -> B:50:0x00c6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0142 -> B:83:0x0145). Please submit an issue!!! */
    @Override // g8.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(g8.d r18, n7.c r19) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.y.f(g8.d, n7.c):java.lang.Object");
    }
}
