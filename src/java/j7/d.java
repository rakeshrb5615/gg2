package j7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class d extends h1.c implements Iterator, v7.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f3328e;

    public d(f fVar, int i) {
        this.f3328e = i;
        j.e(fVar, "map");
        this.f2147d = fVar;
        this.f2145b = -1;
        this.f2146c = fVar.f3340n;
        f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3328e) {
            case 0:
                c();
                int i = this.f2144a;
                f fVar = (f) this.f2147d;
                if (i < fVar.f3338f) {
                    this.f2144a = i + 1;
                    this.f2145b = i;
                    e eVar = new e(fVar, i);
                    f();
                    return eVar;
                }
                throw new NoSuchElementException();
            case 1:
                c();
                int i9 = this.f2144a;
                f fVar2 = (f) this.f2147d;
                if (i9 < fVar2.f3338f) {
                    this.f2144a = i9 + 1;
                    this.f2145b = i9;
                    Object obj = fVar2.f3333a[i9];
                    f();
                    return obj;
                }
                throw new NoSuchElementException();
            default:
                c();
                int i10 = this.f2144a;
                f fVar3 = (f) this.f2147d;
                if (i10 < fVar3.f3338f) {
                    this.f2144a = i10 + 1;
                    this.f2145b = i10;
                    Object[] objArr = fVar3.f3334b;
                    j.b(objArr);
                    Object obj2 = objArr[this.f2145b];
                    f();
                    return obj2;
                }
                throw new NoSuchElementException();
        }
    }
}
