package l7;

import java.io.Serializable;
import kotlin.jvm.internal.j;
import u7.p;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class i implements h, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final i f3796a = new Object();

    @Override // l7.h
    public final Object fold(Object obj, p pVar) {
        return obj;
    }

    @Override // l7.h
    public final f get(g gVar) {
        j.e(gVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // l7.h
    public final h minusKey(g gVar) {
        j.e(gVar, "key");
        return this;
    }

    @Override // l7.h
    public final h plus(h hVar) {
        j.e(hVar, "context");
        return hVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
