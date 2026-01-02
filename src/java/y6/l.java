package y6;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class l implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public n f6926a;

    /* renamed from: b  reason: collision with root package name */
    public n f6927b = null;

    /* renamed from: c  reason: collision with root package name */
    public int f6928c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ o f6929d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f6930e;

    public l(o oVar, int i) {
        this.f6930e = i;
        this.f6929d = oVar;
        this.f6926a = oVar.f6948f.f6936d;
        this.f6928c = oVar.f6947e;
    }

    public final Object a() {
        return b();
    }

    public final n b() {
        n nVar = this.f6926a;
        o oVar = this.f6929d;
        if (nVar != oVar.f6948f) {
            if (oVar.f6947e == this.f6928c) {
                this.f6926a = nVar.f6936d;
                this.f6927b = nVar;
                return nVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6926a != this.f6929d.f6948f;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f6930e) {
            case 1:
                return b().f6938f;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        n nVar = this.f6927b;
        if (nVar == null) {
            throw new IllegalStateException();
        }
        o oVar = this.f6929d;
        oVar.d(nVar, true);
        this.f6927b = null;
        this.f6928c = oVar.f6947e;
    }
}
