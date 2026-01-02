package q0;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class s0 extends n7.h implements u7.p {

    /* renamed from: b  reason: collision with root package name */
    public int f5179b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f5180c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ View f5181d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(View view, l7.c cVar) {
        super(2, cVar);
        this.f5181d = view;
    }

    @Override // n7.a
    public final l7.c create(Object obj, l7.c cVar) {
        s0 s0Var = new s0(this.f5181d, cVar);
        s0Var.f5180c = obj;
        return s0Var;
    }

    @Override // u7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((s0) create((a8.g) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3 = m7.a.f4049a;
        int i = this.f5179b;
        View view = this.f5181d;
        if (i == 0) {
            c4.b.e0(obj);
            a8.g gVar = (a8.g) this.f5180c;
            this.f5180c = gVar;
            this.f5179b = 1;
            gVar.d(view, this);
            return obj3;
        }
        Object obj4 = h7.l.f2236a;
        if (i != 1) {
            if (i == 2) {
                c4.b.e0(obj);
                return obj4;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a8.g gVar2 = (a8.g) this.f5180c;
        c4.b.e0(obj);
        if (view instanceof ViewGroup) {
            this.f5180c = null;
            this.f5179b = 2;
            gVar2.getClass();
            a8.l lVar = new a8.l(new a8.b((ViewGroup) view, 3));
            if (lVar.f673b.hasNext()) {
                gVar2.f665c = lVar;
                gVar2.f663a = 2;
                gVar2.f666d = this;
                obj2 = obj3;
            } else {
                obj2 = obj4;
            }
            if (obj2 != obj3) {
                obj2 = obj4;
            }
            if (obj2 == obj3) {
                return obj3;
            }
        }
        return obj4;
    }
}
