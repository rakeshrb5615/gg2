package l4;

import java.io.Serializable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class g implements f, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final f f3777a;

    /* renamed from: b  reason: collision with root package name */
    public volatile transient boolean f3778b;

    /* renamed from: c  reason: collision with root package name */
    public transient Object f3779c;

    public g(f fVar) {
        this.f3777a = fVar;
    }

    @Override // l4.f
    public final Object get() {
        if (!this.f3778b) {
            synchronized (this) {
                try {
                    if (!this.f3778b) {
                        Object obj = this.f3777a.get();
                        this.f3779c = obj;
                        this.f3778b = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f3779c;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.f3778b) {
            obj = "<supplier that returned " + this.f3779c + ">";
        } else {
            obj = this.f3777a;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
