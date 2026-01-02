package i7;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class b extends a8.b implements ListIterator {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f2734d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i) {
        super(dVar, 1);
        this.f2734d = dVar;
        int b10 = dVar.b();
        if (i < 0 || i > b10) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", i, b10, ", size: "));
        }
        this.f653b = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f653b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f653b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f653b - 1;
            this.f653b = i;
            return this.f2734d.get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f653b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
