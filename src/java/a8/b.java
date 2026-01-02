package a8;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public class b implements Iterator, v7.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f652a;

    /* renamed from: b  reason: collision with root package name */
    public int f653b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f654c;

    public /* synthetic */ b(Object obj, int i) {
        this.f652a = i;
        this.f654c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f652a) {
            case 0:
                Iterator it = (Iterator) this.f654c;
                while (this.f653b > 0 && it.hasNext()) {
                    it.next();
                    this.f653b--;
                }
                return it.hasNext();
            case 1:
                return this.f653b < ((i7.d) this.f654c).b();
            case 2:
                return this.f653b < ((Object[]) this.f654c).length;
            default:
                return this.f653b < ((ViewGroup) this.f654c).getChildCount();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f652a) {
            case 0:
                Iterator it = (Iterator) this.f654c;
                while (this.f653b > 0 && it.hasNext()) {
                    it.next();
                    this.f653b--;
                }
                return it.next();
            case 1:
                if (hasNext()) {
                    int i = this.f653b;
                    this.f653b = i + 1;
                    return ((i7.d) this.f654c).get(i);
                }
                throw new NoSuchElementException();
            case 2:
                try {
                    int i9 = this.f653b;
                    this.f653b = i9 + 1;
                    return ((Object[]) this.f654c)[i9];
                } catch (ArrayIndexOutOfBoundsException e9) {
                    this.f653b--;
                    throw new NoSuchElementException(e9.getMessage());
                }
            default:
                int i10 = this.f653b;
                this.f653b = i10 + 1;
                View childAt = ((ViewGroup) this.f654c).getChildAt(i10);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f652a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                int i = this.f653b - 1;
                this.f653b = i;
                ((ViewGroup) this.f654c).removeViewAt(i);
                return;
        }
    }

    public b(Object[] objArr) {
        this.f652a = 2;
        kotlin.jvm.internal.j.e(objArr, "array");
        this.f654c = objArr;
    }

    public b(c cVar) {
        this.f652a = 0;
        this.f654c = cVar.f655a.iterator();
        this.f653b = cVar.f656b;
    }
}
