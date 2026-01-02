package k8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class m {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3467b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3468c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3469d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3470e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray f3471a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final i a() {
        i iVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3469d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f3468c.get(this) == 0) {
                return null;
            }
            int i9 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (iVar = (i) this.f3471a.getAndSet(i9, null)) != null) {
                if (iVar.f3458b) {
                    f3470e.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    public final i b(int i, boolean z9) {
        int i9 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f3471a;
        i iVar = (i) atomicReferenceArray.get(i9);
        if (iVar == null || iVar.f3458b != z9) {
            return null;
        }
        while (!atomicReferenceArray.compareAndSet(i9, iVar, null)) {
            if (atomicReferenceArray.get(i9) != iVar) {
                return null;
            }
        }
        if (z9) {
            f3470e.decrementAndGet(this);
        }
        return iVar;
    }
}
