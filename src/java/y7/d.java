package y7;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public class d implements Iterable, v7.a {

    /* renamed from: a  reason: collision with root package name */
    public final int f6967a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6968b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6969c;

    public d(int i, int i9, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f6967a = i;
        this.f6968b = c4.b.D(i, i9, i10);
        this.f6969c = i10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            if (isEmpty() && ((d) obj).isEmpty()) {
                return true;
            }
            d dVar = (d) obj;
            return this.f6967a == dVar.f6967a && this.f6968b == dVar.f6968b && this.f6969c == dVar.f6969c;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f6967a * 31) + this.f6968b) * 31) + this.f6969c;
    }

    public boolean isEmpty() {
        int i = this.f6969c;
        int i9 = this.f6968b;
        int i10 = this.f6967a;
        return i > 0 ? i10 > i9 : i10 < i9;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f6967a, this.f6968b, this.f6969c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f6968b;
        int i9 = this.f6967a;
        int i10 = this.f6969c;
        if (i10 > 0) {
            sb = new StringBuilder();
            sb.append(i9);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i10);
        } else {
            sb = new StringBuilder();
            sb.append(i9);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i10);
        }
        return sb.toString();
    }
}
