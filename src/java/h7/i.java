package h7;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class i implements d, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2229c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "b");

    /* renamed from: a  reason: collision with root package name */
    public volatile u7.a f2230a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f2231b;

    @Override // h7.d
    public final Object getValue() {
        Object obj = this.f2231b;
        k kVar = k.f2235a;
        if (obj != kVar) {
            return obj;
        }
        u7.a aVar = this.f2230a;
        if (aVar != null) {
            Object invoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2229c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, kVar, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != kVar) {
                    return this.f2231b;
                }
            }
            this.f2230a = null;
            return invoke;
        }
        return this.f2231b;
    }

    public final String toString() {
        return this.f2231b != k.f2235a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
