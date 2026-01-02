package d8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final /* synthetic */ class o1 extends kotlin.jvm.internal.i implements u7.q {

    /* renamed from: a  reason: collision with root package name */
    public static final o1 f1232a = new kotlin.jvm.internal.i(3, r1.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // u7.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        Object obj4;
        r1 r1Var = (r1) obj;
        if (obj2 == null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r1.f1241a;
            r1Var.getClass();
            do {
                obj4 = r1.f1241a.get(r1Var);
                if (!(obj4 instanceof b1)) {
                    throw null;
                }
            } while (r1Var.J(obj4) < 0);
            f0.m(r1Var, true, new q0(r1Var));
            throw null;
        }
        throw new ClassCastException();
    }
}
