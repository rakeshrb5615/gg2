package m4;

import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class h extends s {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3976a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3977b;

    public h(Object obj) {
        this.f3977b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f3976a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3976a) {
            throw new NoSuchElementException();
        }
        this.f3976a = true;
        return this.f3977b;
    }
}
