package x8;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public abstract class d0 {

    /* renamed from: a  reason: collision with root package name */
    public static final c0 f6633a = new c0(new byte[0], 0, 0, false, false);

    /* renamed from: b  reason: collision with root package name */
    public static final int f6634b;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference[] f6635c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f6634b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f6635c = atomicReferenceArr;
    }

    public static final void a(c0 c0Var) {
        kotlin.jvm.internal.j.e(c0Var, "segment");
        if (c0Var.f6624f != null || c0Var.f6625g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (c0Var.f6622d) {
            return;
        }
        AtomicReference atomicReference = f6635c[(int) (Thread.currentThread().getId() & (f6634b - 1))];
        c0 c0Var2 = f6633a;
        c0 c0Var3 = (c0) atomicReference.getAndSet(c0Var2);
        if (c0Var3 == c0Var2) {
            return;
        }
        int i = c0Var3 != null ? c0Var3.f6621c : 0;
        if (i >= 65536) {
            atomicReference.set(c0Var3);
            return;
        }
        c0Var.f6624f = c0Var3;
        c0Var.f6620b = 0;
        c0Var.f6621c = i + 8192;
        atomicReference.set(c0Var);
    }

    public static final c0 b() {
        AtomicReference atomicReference = f6635c[(int) (Thread.currentThread().getId() & (f6634b - 1))];
        c0 c0Var = f6633a;
        c0 c0Var2 = (c0) atomicReference.getAndSet(c0Var);
        if (c0Var2 == c0Var) {
            return new c0();
        }
        if (c0Var2 == null) {
            atomicReference.set(null);
            return new c0();
        }
        atomicReference.set(c0Var2.f6624f);
        c0Var2.f6624f = null;
        c0Var2.f6621c = 0;
        return c0Var2;
    }
}
