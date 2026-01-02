package n8;

import a5.o;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import d8.n;
import j2.h;
import java.lang.reflect.Method;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.s;
import okhttp3.Request;
import z8.d;
import z8.g;
import z8.q0;
import z8.t;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class b implements OnCompleteListener, g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4974a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n f4975b;

    public /* synthetic */ b(n nVar, int i) {
        this.f4974a = i;
        this.f4975b = nVar;
    }

    @Override // z8.g
    public void b(d dVar, Throwable th) {
        switch (this.f4974a) {
            case 1:
                this.f4975b.resumeWith(c4.b.p(th));
                return;
            case 2:
                this.f4975b.resumeWith(c4.b.p(th));
                return;
            default:
                this.f4975b.resumeWith(c4.b.p(th));
                return;
        }
    }

    @Override // z8.g
    public void d(d dVar, q0 q0Var) {
        switch (this.f4974a) {
            case 1:
                boolean z9 = q0Var.f7556a.v;
                n nVar = this.f4975b;
                if (!z9) {
                    nVar.resumeWith(c4.b.p(new o(q0Var)));
                    return;
                }
                Object obj = q0Var.f7557b;
                if (obj != null) {
                    nVar.resumeWith(obj);
                    return;
                }
                Request c9 = dVar.c();
                c9.getClass();
                e a10 = s.a(t.class);
                Object cast = q4.b.u(a10).cast(c9.e.a(a10));
                j.b(cast);
                Method method = ((t) cast).f7571b;
                nVar.resumeWith(c4.b.p(new NullPointerException("Response from " + h.class.getName() + '.' + method.getName() + " was null but response body type was declared as non-null")));
                return;
            case 2:
                boolean z10 = q0Var.f7556a.v;
                n nVar2 = this.f4975b;
                if (z10) {
                    nVar2.resumeWith(q0Var.f7557b);
                    return;
                } else {
                    nVar2.resumeWith(c4.b.p(new o(q0Var)));
                    return;
                }
            default:
                this.f4975b.resumeWith(q0Var);
                return;
        }
    }

    public void onComplete(Task task) {
        Exception exception = task.getException();
        n nVar = this.f4975b;
        if (exception != null) {
            nVar.resumeWith(c4.b.p(exception));
        } else if (task.isCanceled()) {
            nVar.m(null);
        } else {
            nVar.resumeWith(task.getResult());
        }
    }
}
