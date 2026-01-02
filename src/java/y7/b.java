package y7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class b implements Iterator, v7.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6962a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final int f6963b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6964c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6965d;

    /* renamed from: e  reason: collision with root package name */
    public int f6966e;

    public b(char c9, char c10, int i) {
        boolean z9 = false;
        this.f6963b = i;
        this.f6964c = c10;
        if (i <= 0 ? j.f(c9, c10) >= 0 : j.f(c9, c10) <= 0) {
            z9 = true;
        }
        this.f6965d = z9;
        this.f6966e = z9 ? c9 : c10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f6962a) {
            case 0:
                return this.f6965d;
            default:
                return this.f6965d;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f6962a) {
            case 0:
                int i = this.f6966e;
                if (i != this.f6964c) {
                    this.f6966e = this.f6963b + i;
                } else if (!this.f6965d) {
                    throw new NoSuchElementException();
                } else {
                    this.f6965d = false;
                }
                return Character.valueOf((char) i);
            default:
                return Integer.valueOf(nextInt());
        }
    }

    public int nextInt() {
        int i = this.f6966e;
        if (i != this.f6964c) {
            this.f6966e = this.f6963b + i;
            return i;
        } else if (this.f6965d) {
            this.f6965d = false;
            return i;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f6962a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(int i, int i9, int i10) {
        this.f6963b = i10;
        this.f6964c = i9;
        boolean z9 = false;
        if (i10 <= 0 ? i >= i9 : i <= i9) {
            z9 = true;
        }
        this.f6965d = z9;
        this.f6966e = z9 ? i : i9;
    }
}
