package b8;

import i7.s;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class b implements Iterator, v7.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f772a;

    /* renamed from: b  reason: collision with root package name */
    public int f773b;

    /* renamed from: c  reason: collision with root package name */
    public int f774c;

    /* renamed from: d  reason: collision with root package name */
    public int f775d;

    /* renamed from: e  reason: collision with root package name */
    public Object f776e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f777f;

    public b(s sVar) {
        this.f772a = 1;
        this.f777f = sVar;
        this.f774c = sVar.f2751d;
        this.f775d = sVar.f2750c;
    }

    public void b() {
        a8.e eVar = (a8.e) this.f777f;
        CharSequence charSequence = (CharSequence) eVar.f661b;
        int i = this.f775d;
        if (i < 0) {
            this.f773b = 0;
            this.f776e = null;
            return;
        }
        if (i > charSequence.length()) {
            this.f776e = new y7.d(this.f774c, i.t0(charSequence), 1);
            this.f775d = -1;
        } else {
            h7.f fVar = (h7.f) ((q) eVar.f662c).invoke(charSequence, Integer.valueOf(this.f775d));
            if (fVar == null) {
                this.f776e = new y7.d(this.f774c, i.t0(charSequence), 1);
                this.f775d = -1;
            } else {
                int intValue = ((Number) fVar.f2225a).intValue();
                int intValue2 = ((Number) fVar.f2226b).intValue();
                this.f776e = w3.a.f(this.f774c, intValue);
                int i9 = intValue + intValue2;
                this.f774c = i9;
                this.f775d = i9 + (intValue2 == 0 ? 1 : 0);
            }
        }
        this.f773b = 1;
    }

    public boolean c() {
        this.f773b = 3;
        int i = this.f774c;
        if (i == 0) {
            this.f773b = 2;
        } else {
            s sVar = (s) this.f777f;
            Object[] objArr = sVar.f2748a;
            int i9 = this.f775d;
            this.f776e = objArr[i9];
            this.f773b = 1;
            this.f775d = (i9 + 1) % sVar.f2749b;
            this.f774c = i - 1;
        }
        return this.f773b == 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f772a) {
            case 0:
                if (this.f773b == -1) {
                    b();
                }
                return this.f773b == 1;
            default:
                int i = this.f773b;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            return false;
                        }
                        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
                    }
                    return true;
                }
                return c();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f772a) {
            case 0:
                if (this.f773b == -1) {
                    b();
                }
                if (this.f773b != 0) {
                    y7.e eVar = (y7.e) this.f776e;
                    kotlin.jvm.internal.j.c(eVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                    this.f776e = null;
                    this.f773b = -1;
                    return eVar;
                }
                throw new NoSuchElementException();
            default:
                int i = this.f773b;
                if (i == 1) {
                    this.f773b = 0;
                    return this.f776e;
                } else if (i == 2 || !c()) {
                    throw new NoSuchElementException();
                } else {
                    this.f773b = 0;
                    return this.f776e;
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f772a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(a8.e eVar) {
        this.f772a = 0;
        this.f777f = eVar;
        this.f773b = -1;
        int length = ((CharSequence) eVar.f661b).length();
        if (length >= 0) {
            length = length >= 0 ? 0 : length;
            this.f774c = length;
            this.f775d = length;
            return;
        }
        throw new IllegalArgumentException(v1.a.j("Cannot coerce value to an empty range: maximum ", length, " is less than minimum 0."));
    }
}
