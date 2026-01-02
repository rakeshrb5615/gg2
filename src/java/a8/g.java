package a8;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class g implements Iterator, l7.c, v7.a {

    /* renamed from: a  reason: collision with root package name */
    public int f663a;

    /* renamed from: b  reason: collision with root package name */
    public Object f664b;

    /* renamed from: c  reason: collision with root package name */
    public Iterator f665c;

    /* renamed from: d  reason: collision with root package name */
    public l7.c f666d;

    public final RuntimeException b() {
        int i = this.f663a;
        if (i != 4) {
            if (i != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f663a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final void d(Object obj, n7.h hVar) {
        this.f664b = obj;
        this.f663a = 3;
        this.f666d = hVar;
        m7.a aVar = m7.a.f4049a;
    }

    @Override // l7.c
    public final l7.h getContext() {
        return l7.i.f3796a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f663a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw b();
                }
                Iterator it = this.f665c;
                kotlin.jvm.internal.j.b(it);
                if (it.hasNext()) {
                    this.f663a = 2;
                    return true;
                }
                this.f665c = null;
            }
            this.f663a = 5;
            l7.c cVar = this.f666d;
            kotlin.jvm.internal.j.b(cVar);
            this.f666d = null;
            cVar.resumeWith(h7.l.f2236a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f663a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        } else if (i == 2) {
            this.f663a = 1;
            Iterator it = this.f665c;
            kotlin.jvm.internal.j.b(it);
            return it.next();
        } else if (i == 3) {
            this.f663a = 0;
            Object obj = this.f664b;
            this.f664b = null;
            return obj;
        } else {
            throw b();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // l7.c
    public final void resumeWith(Object obj) {
        c4.b.e0(obj);
        this.f663a = 4;
    }
}
