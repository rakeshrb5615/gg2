package m4;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class b extends s implements ListIterator {

    /* renamed from: a  reason: collision with root package name */
    public final int f3961a;

    /* renamed from: b  reason: collision with root package name */
    public int f3962b;

    /* renamed from: c  reason: collision with root package name */
    public final d f3963c;

    public b(d dVar, int i) {
        int size = dVar.size();
        a.a.h(i, size);
        this.f3961a = size;
        this.f3962b = i;
        this.f3963c = dVar;
    }

    public final Object a(int i) {
        return this.f3963c.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f3962b < this.f3961a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3962b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f3962b;
            this.f3962b = i + 1;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3962b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f3962b - 1;
            this.f3962b = i;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3962b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
