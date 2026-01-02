package m4;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class p extends s {

    /* renamed from: a  reason: collision with root package name */
    public int f4001a = 2;

    /* renamed from: b  reason: collision with root package name */
    public Object f4002b;

    /* renamed from: c  reason: collision with root package name */
    public final Iterator f4003c;

    /* renamed from: d  reason: collision with root package name */
    public final Iterator f4004d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ q f4005e;

    public p(q qVar) {
        this.f4005e = qVar;
        this.f4003c = qVar.f4006a.iterator();
        this.f4004d = qVar.f4007b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object obj;
        int i = this.f4001a;
        if (i != 4) {
            int c9 = u.e.c(i);
            if (c9 != 0) {
                if (c9 != 2) {
                    this.f4001a = 4;
                    Iterator it = this.f4003c;
                    if (!it.hasNext()) {
                        while (true) {
                            Iterator it2 = this.f4004d;
                            if (!it2.hasNext()) {
                                this.f4001a = 3;
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            if (!this.f4005e.f4006a.contains(obj)) {
                                break;
                            }
                        }
                    } else {
                        obj = it.next();
                    }
                    this.f4002b = obj;
                    if (this.f4001a != 3) {
                        this.f4001a = 1;
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f4001a = 2;
            Object obj = this.f4002b;
            this.f4002b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
