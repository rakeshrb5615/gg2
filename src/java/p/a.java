package p;

import java.util.HashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class a extends f {

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f5042e = new HashMap();

    @Override // p.f
    public final c a(Object obj) {
        return (c) this.f5042e.get(obj);
    }

    @Override // p.f
    public final Object b(Object obj) {
        Object b10 = super.b(obj);
        this.f5042e.remove(obj);
        return b10;
    }
}
