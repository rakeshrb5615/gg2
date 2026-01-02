package m4;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class c extends d {

    /* renamed from: c  reason: collision with root package name */
    public final transient int f3964c;

    /* renamed from: d  reason: collision with root package name */
    public final transient int f3965d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d f3966e;

    public c(d dVar, int i, int i9) {
        this.f3966e = dVar;
        this.f3964c = i;
        this.f3965d = i9;
    }

    @Override // m4.a
    public final Object[] b() {
        return this.f3966e.b();
    }

    @Override // m4.a
    public final int c() {
        return this.f3966e.d() + this.f3964c + this.f3965d;
    }

    @Override // m4.a
    public final int d() {
        return this.f3966e.d() + this.f3964c;
    }

    @Override // m4.d, java.util.List
    /* renamed from: g */
    public final d subList(int i, int i9) {
        a.a.i(i, i9, this.f3965d);
        int i10 = this.f3964c;
        return this.f3966e.subList(i + i10, i9 + i10);
    }

    @Override // java.util.List
    public final Object get(int i) {
        a.a.f(i, this.f3965d);
        return this.f3966e.get(i + this.f3964c);
    }

    @Override // m4.d, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // m4.d, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3965d;
    }

    @Override // m4.d, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
