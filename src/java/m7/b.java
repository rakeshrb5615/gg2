package m7;

import kotlin.jvm.internal.j;
import kotlin.jvm.internal.u;
import n7.g;
import u7.p;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    public int f4051a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f4052b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l7.c f4053c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l7.c cVar, l7.c cVar2, p pVar) {
        super(cVar);
        this.f4052b = pVar;
        this.f4053c = cVar2;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f4051a;
        if (i != 0) {
            if (i == 1) {
                this.f4051a = 2;
                c4.b.e0(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f4051a = 1;
        c4.b.e0(obj);
        p pVar = this.f4052b;
        j.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        u.a(2, pVar);
        return pVar.invoke(this.f4053c, this);
    }
}
