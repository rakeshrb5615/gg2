package y7;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public abstract class a implements Iterable, v7.a {

    /* renamed from: a  reason: collision with root package name */
    public final char f6959a;

    /* renamed from: b  reason: collision with root package name */
    public final char f6960b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6961c = 1;

    public a(char c9, char c10) {
        this.f6959a = c9;
        this.f6960b = (char) c4.b.D(c9, c10, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f6959a, this.f6960b, this.f6961c);
    }
}
