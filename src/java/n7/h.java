package n7;

import kotlin.jvm.internal.j;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class h extends g implements kotlin.jvm.internal.g {

    /* renamed from: a  reason: collision with root package name */
    public final int f4972a;

    public h(int i, l7.c cVar) {
        super(cVar);
        this.f4972a = i;
    }

    public final int getArity() {
        return this.f4972a;
    }

    @Override // n7.a
    public final String toString() {
        if (getCompletion() == null) {
            s.a.getClass();
            String a10 = t.a(this);
            j.d(a10, "renderLambdaToString(...)");
            return a10;
        }
        return super.toString();
    }
}
