package r;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class a implements Iterator, v7.a {

    /* renamed from: a  reason: collision with root package name */
    public int f5446a;

    /* renamed from: b  reason: collision with root package name */
    public int f5447b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5448c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5449d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f5450e;

    public a(int i) {
        this.f5446a = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5447b < this.f5446a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object g3;
        if (hasNext()) {
            int i = this.f5447b;
            switch (this.f5449d) {
                case 0:
                    g3 = ((e) this.f5450e).g(i);
                    break;
                case 1:
                    g3 = ((e) this.f5450e).j(i);
                    break;
                default:
                    g3 = ((f) this.f5450e).f5461b[i];
                    break;
            }
            this.f5447b++;
            this.f5448c = true;
            return g3;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f5448c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.f5447b - 1;
        this.f5447b = i;
        switch (this.f5449d) {
            case 0:
                ((e) this.f5450e).h(i);
                break;
            case 1:
                ((e) this.f5450e).h(i);
                break;
            default:
                ((f) this.f5450e).b(i);
                break;
        }
        this.f5446a--;
        this.f5448c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(f fVar) {
        this(fVar.f5462c);
        this.f5449d = 2;
        this.f5450e = fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(e eVar, int i) {
        this(eVar.f5471c);
        this.f5449d = i;
        switch (i) {
            case 1:
                this.f5450e = eVar;
                this(eVar.f5471c);
                return;
            default:
                this.f5450e = eVar;
                return;
        }
    }
}
