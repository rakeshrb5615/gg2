package a8;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class d implements Iterator, v7.a {

    /* renamed from: a  reason: collision with root package name */
    public Object f657a;

    /* renamed from: b  reason: collision with root package name */
    public int f658b = -2;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f659c;

    public d(e eVar) {
        this.f659c = eVar;
    }

    public final void b() {
        Object invoke;
        int i = this.f658b;
        e eVar = this.f659c;
        if (i == -2) {
            invoke = ((u7.a) eVar.f661b).invoke();
        } else {
            Object obj = this.f657a;
            kotlin.jvm.internal.j.b(obj);
            invoke = ((u7.l) eVar.f662c).invoke(obj);
        }
        this.f657a = invoke;
        this.f658b = invoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f658b < 0) {
            b();
        }
        return this.f658b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f658b < 0) {
            b();
        }
        if (this.f658b != 0) {
            Object obj = this.f657a;
            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f658b = -1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
