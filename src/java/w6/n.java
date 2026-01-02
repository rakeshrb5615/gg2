package w6;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class n extends o implements Iterable {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f6480a = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof n) && ((n) obj).f6480a.equals(this.f6480a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f6480a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f6480a.iterator();
    }
}
