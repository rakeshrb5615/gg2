package n7;

import kotlin.jvm.internal.j;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class i extends c implements kotlin.jvm.internal.g {
    private final int arity;

    public i(int i, l7.c cVar) {
        super(cVar);
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    @Override // n7.a
    public String toString() {
        if (getCompletion() == null) {
            s.a.getClass();
            String a10 = t.a(this);
            j.d(a10, "renderLambdaToString(...)");
            return a10;
        }
        return super.toString();
    }
}
