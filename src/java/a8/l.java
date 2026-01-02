package a8;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class l implements Iterator, v7.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f672a;

    /* renamed from: b  reason: collision with root package name */
    public Iterator f673b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f674c;

    public l(b bVar) {
        this.f672a = 1;
        this.f674c = new ArrayList();
        this.f673b = bVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f672a) {
            case 0:
                return this.f673b.hasNext();
            default:
                return this.f673b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f672a) {
            case 0:
                return ((a6.i) ((e) this.f674c).f662c).invoke(this.f673b.next());
            default:
                Object next = this.f673b.next();
                ArrayList arrayList = (ArrayList) this.f674c;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                b bVar = viewGroup != null ? new b(viewGroup, 3) : null;
                if (bVar == null || !bVar.hasNext()) {
                    while (!this.f673b.hasNext() && !arrayList.isEmpty()) {
                        this.f673b = (Iterator) i7.i.d0(arrayList);
                        kotlin.jvm.internal.j.e(arrayList, "<this>");
                        if (arrayList.isEmpty()) {
                            throw new NoSuchElementException("List is empty.");
                        }
                        arrayList.remove(a.a.y(arrayList));
                    }
                } else {
                    arrayList.add(this.f673b);
                    this.f673b = bVar;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f672a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public l(e eVar) {
        this.f672a = 0;
        this.f674c = eVar;
        this.f673b = ((Iterable) ((i) eVar.f661b).f668b).iterator();
    }
}
