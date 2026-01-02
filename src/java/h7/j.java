package h7;

import java.io.Serializable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class j implements d, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public u7.a f2232a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f2233b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f2234c;

    public j(u7.a aVar) {
        kotlin.jvm.internal.j.e(aVar, "initializer");
        this.f2232a = aVar;
        this.f2233b = k.f2235a;
        this.f2234c = this;
    }

    @Override // h7.d
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f2233b;
        k kVar = k.f2235a;
        if (obj2 != kVar) {
            return obj2;
        }
        synchronized (this.f2234c) {
            obj = this.f2233b;
            if (obj == kVar) {
                u7.a aVar = this.f2232a;
                kotlin.jvm.internal.j.b(aVar);
                obj = aVar.invoke();
                this.f2233b = obj;
                this.f2232a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f2233b != k.f2235a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
