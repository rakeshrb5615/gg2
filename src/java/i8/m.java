package i8;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class m {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2788e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_next$volatile");

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2789f = AtomicLongFieldUpdater.newUpdater(m.class, "_state$volatile");

    /* renamed from: g  reason: collision with root package name */
    public static final d4.l f2790g = new d4.l("REMOVE_FROZEN", 4, false);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a  reason: collision with root package name */
    public final int f2791a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2792b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2793c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f2794d;

    public m(int i, boolean z9) {
        this.f2791a = i;
        this.f2792b = z9;
        int i9 = i - 1;
        this.f2793c = i9;
        this.f2794d = new AtomicReferenceArray(i);
        if (i9 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i9) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2789f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i9 = (int) ((1152921503533105152L & j) >> 30);
            int i10 = this.f2793c;
            if (((i9 + 2) & i10) == (i & i10)) {
                return 1;
            }
            boolean z9 = this.f2792b;
            AtomicReferenceArray atomicReferenceArray = this.f2794d;
            if (z9 || atomicReferenceArray.get(i9 & i10) == null) {
                if (f2789f.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((i9 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i9 & i10, obj);
                    m mVar = this;
                    while ((atomicLongFieldUpdater.get(mVar) & 1152921504606846976L) != 0) {
                        mVar = mVar.c();
                        AtomicReferenceArray atomicReferenceArray2 = mVar.f2794d;
                        int i11 = mVar.f2793c & i9;
                        Object obj2 = atomicReferenceArray2.get(i11);
                        if ((obj2 instanceof l) && ((l) obj2).f2787a == i9) {
                            atomicReferenceArray2.set(i11, obj);
                            continue;
                        } else {
                            mVar = null;
                            continue;
                        }
                        if (mVar == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i12 = this.f2791a;
                if (i12 < 1024 || ((i9 - i) & 1073741823) > (i12 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f2789f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    public final m c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        m mVar;
        while (true) {
            atomicLongFieldUpdater = f2789f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) == 0) {
                long j8 = 1152921504606846976L | j;
                mVar = this;
                if (atomicLongFieldUpdater.compareAndSet(mVar, j, j8)) {
                    j = j8;
                    break;
                }
            } else {
                mVar = this;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2788e;
            m mVar2 = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar2 != null) {
                return mVar2;
            }
            m mVar3 = new m(mVar.f2791a * 2, mVar.f2792b);
            int i = (int) (1073741823 & j);
            int i9 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i10 = mVar.f2793c;
                int i11 = i & i10;
                if (i11 == (i10 & i9)) {
                    break;
                }
                Object obj = mVar.f2794d.get(i11);
                if (obj == null) {
                    obj = new l(i);
                }
                mVar3.f2794d.set(mVar3.f2793c & i, obj);
                i++;
            }
            atomicLongFieldUpdater.set(mVar3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, mVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        m mVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2789f;
            long j = atomicLongFieldUpdater.get(mVar);
            if ((j & 1152921504606846976L) != 0) {
                return f2790g;
            }
            int i = (int) (j & 1073741823);
            int i9 = mVar.f2793c;
            int i10 = i & i9;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i9) == i10) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = mVar.f2794d;
            Object obj = atomicReferenceArray.get(i10);
            boolean z9 = mVar.f2792b;
            if (obj == null) {
                if (z9) {
                    break;
                }
            } else if (obj instanceof l) {
                break;
            } else {
                long j8 = (i + 1) & 1073741823;
                if (f2789f.compareAndSet(mVar, j, (j & (-1073741824)) | j8)) {
                    atomicReferenceArray.set(i10, null);
                    return obj;
                }
                mVar = this;
                if (z9) {
                    while (true) {
                        long j9 = atomicLongFieldUpdater.get(mVar);
                        int i11 = (int) (j9 & 1073741823);
                        if ((j9 & 1152921504606846976L) != 0) {
                            mVar = mVar.c();
                        } else {
                            m mVar2 = mVar;
                            if (f2789f.compareAndSet(mVar2, j9, (j9 & (-1073741824)) | j8)) {
                                mVar2.f2794d.set(i11 & mVar2.f2793c, null);
                                mVar = null;
                            } else {
                                mVar = mVar2;
                            }
                        }
                        if (mVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
