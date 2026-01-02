package a8;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class k implements Iterable, v7.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f671a;

    public k(e eVar) {
        this.f671a = eVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b8.b(this.f671a);
    }
}
