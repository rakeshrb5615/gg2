package b8;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class c implements Iterator, v7.a {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f778a;

    /* renamed from: b  reason: collision with root package name */
    public int f779b;

    /* renamed from: c  reason: collision with root package name */
    public int f780c;

    /* renamed from: d  reason: collision with root package name */
    public int f781d;

    /* renamed from: e  reason: collision with root package name */
    public int f782e;

    public c(CharSequence charSequence) {
        kotlin.jvm.internal.j.e(charSequence, "string");
        this.f778a = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i9 = this.f779b;
        if (i9 != 0) {
            return i9 == 1;
        }
        int i10 = 2;
        if (this.f782e < 0) {
            this.f779b = 2;
            return false;
        }
        CharSequence charSequence = this.f778a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i11 = this.f780c; i11 < length2; i11++) {
            char charAt = charSequence.charAt(i11);
            if (charAt == '\n' || charAt == '\r') {
                i10 = (charAt == '\r' && (i = i11 + 1) < charSequence.length() && charSequence.charAt(i) == '\n') ? 1 : 1;
                length = i11;
                this.f779b = 1;
                this.f782e = i10;
                this.f781d = length;
                return true;
            }
        }
        i10 = -1;
        this.f779b = 1;
        this.f782e = i10;
        this.f781d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f779b = 0;
            int i = this.f781d;
            int i9 = this.f780c;
            this.f780c = this.f782e + i;
            return this.f778a.subSequence(i9, i).toString();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
