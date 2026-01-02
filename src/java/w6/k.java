package w6;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class k extends z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6465a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z f6466b;

    public /* synthetic */ k(z zVar, int i) {
        this.f6465a = i;
        this.f6466b = zVar;
    }

    @Override // w6.z
    public final Object b(e7.a aVar) {
        switch (this.f6465a) {
            case 0:
                return new AtomicLong(((Number) this.f6466b.b(aVar)).longValue());
            default:
                ArrayList arrayList = new ArrayList();
                aVar.c();
                while (aVar.B()) {
                    arrayList.add(Long.valueOf(((Number) this.f6466b.b(aVar)).longValue()));
                }
                aVar.x();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
        }
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        switch (this.f6465a) {
            case 0:
                this.f6466b.c(bVar, Long.valueOf(((AtomicLong) obj).get()));
                return;
            default:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                bVar.f();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    this.f6466b.c(bVar, Long.valueOf(atomicLongArray.get(i)));
                }
                bVar.x();
                return;
        }
    }
}
