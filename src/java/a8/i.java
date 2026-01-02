package a8;

import java.util.Iterator;
import u7.p;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class i implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f667a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f668b;

    public /* synthetic */ i(Object obj, int i) {
        this.f667a = i;
        this.f668b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l7.c, java.util.Iterator, java.lang.Object, a8.g] */
    @Override // a8.f
    public final Iterator iterator() {
        switch (this.f667a) {
            case 0:
                ?? obj = new Object();
                obj.f666d = q4.b.k(obj, obj, (n7.h) this.f668b);
                return obj;
            case 1:
                return (Iterator) this.f668b;
            case 2:
                return new b8.c((CharSequence) this.f668b);
            default:
                return ((Iterable) this.f668b).iterator();
        }
    }

    public i(p pVar) {
        this.f667a = 0;
        this.f668b = (n7.h) pVar;
    }
}
