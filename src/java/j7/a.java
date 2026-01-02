package j7;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class a implements ListIterator, v7.a {

    /* renamed from: b  reason: collision with root package name */
    public int f3315b;

    /* renamed from: d  reason: collision with root package name */
    public int f3317d;

    /* renamed from: e  reason: collision with root package name */
    public final i7.e f3318e;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3314a = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f3316c = -1;

    public a(c cVar, int i) {
        int i9;
        this.f3318e = cVar;
        this.f3315b = i;
        i9 = ((AbstractList) cVar).modCount;
        this.f3317d = i9;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i9;
        switch (this.f3314a) {
            case 0:
                b();
                b bVar = (b) this.f3318e;
                int i10 = this.f3315b;
                this.f3315b = i10 + 1;
                bVar.add(i10, obj);
                this.f3316c = -1;
                i = ((AbstractList) bVar).modCount;
                this.f3317d = i;
                return;
            default:
                c();
                c cVar = (c) this.f3318e;
                int i11 = this.f3315b;
                this.f3315b = i11 + 1;
                cVar.add(i11, obj);
                this.f3316c = -1;
                i9 = ((AbstractList) cVar).modCount;
                this.f3317d = i9;
                return;
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((b) this.f3318e).f3323e).modCount;
        if (i != this.f3317d) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        int i;
        i = ((AbstractList) ((c) this.f3318e)).modCount;
        if (i != this.f3317d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3314a) {
            case 0:
                return this.f3315b < ((b) this.f3318e).f3321c;
            default:
                return this.f3315b < ((c) this.f3318e).f3326b;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f3314a) {
            case 0:
                return this.f3315b > 0;
            default:
                return this.f3315b > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f3314a) {
            case 0:
                b();
                int i = this.f3315b;
                b bVar = (b) this.f3318e;
                if (i < bVar.f3321c) {
                    this.f3315b = i + 1;
                    this.f3316c = i;
                    return bVar.f3319a[bVar.f3320b + i];
                }
                throw new NoSuchElementException();
            default:
                c();
                int i9 = this.f3315b;
                c cVar = (c) this.f3318e;
                if (i9 < cVar.f3326b) {
                    this.f3315b = i9 + 1;
                    this.f3316c = i9;
                    return cVar.f3325a[i9];
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f3314a) {
            case 0:
                return this.f3315b;
            default:
                return this.f3315b;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f3314a) {
            case 0:
                b();
                int i = this.f3315b;
                if (i > 0) {
                    int i9 = i - 1;
                    this.f3315b = i9;
                    this.f3316c = i9;
                    b bVar = (b) this.f3318e;
                    return bVar.f3319a[bVar.f3320b + i9];
                }
                throw new NoSuchElementException();
            default:
                c();
                int i10 = this.f3315b;
                if (i10 > 0) {
                    int i11 = i10 - 1;
                    this.f3315b = i11;
                    this.f3316c = i11;
                    return ((c) this.f3318e).f3325a[i11];
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.f3314a) {
            case 0:
                i = this.f3315b;
                break;
            default:
                i = this.f3315b;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i9;
        switch (this.f3314a) {
            case 0:
                b bVar = (b) this.f3318e;
                b();
                int i10 = this.f3316c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                bVar.c(i10);
                this.f3315b = this.f3316c;
                this.f3316c = -1;
                i = ((AbstractList) bVar).modCount;
                this.f3317d = i;
                return;
            default:
                c cVar = (c) this.f3318e;
                c();
                int i11 = this.f3316c;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                cVar.c(i11);
                this.f3315b = this.f3316c;
                this.f3316c = -1;
                i9 = ((AbstractList) cVar).modCount;
                this.f3317d = i9;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f3314a) {
            case 0:
                b();
                int i = this.f3316c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((b) this.f3318e).set(i, obj);
                return;
            default:
                c();
                int i9 = this.f3316c;
                if (i9 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f3318e).set(i9, obj);
                return;
        }
    }

    public a(b bVar, int i) {
        int i9;
        this.f3318e = bVar;
        this.f3315b = i;
        i9 = ((AbstractList) bVar).modCount;
        this.f3317d = i9;
    }
}
