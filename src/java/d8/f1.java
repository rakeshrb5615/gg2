package d8;

import java.util.concurrent.CancellationException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class f1 extends CancellationException {

    /* renamed from: a  reason: collision with root package name */
    public final transient e1 f1193a;

    public f1(String str, Throwable th, e1 e1Var) {
        super(str);
        this.f1193a = e1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof f1) {
                f1 f1Var = (f1) obj;
                return kotlin.jvm.internal.j.a(f1Var.getMessage(), getMessage()) && kotlin.jvm.internal.j.a(f1Var.f1193a, this.f1193a) && kotlin.jvm.internal.j.a(f1Var.getCause(), getCause());
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.j.b(message);
        int hashCode = (this.f1193a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f1193a;
    }
}
