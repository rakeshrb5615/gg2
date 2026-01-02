package q1;

import androidx.lifecycle.e0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class d implements e0 {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.loader.content.e f5211a;

    /* renamed from: b  reason: collision with root package name */
    public final a f5212b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5213c = false;

    public d(androidx.loader.content.e eVar, a aVar) {
        this.f5211a = eVar;
        this.f5212b = aVar;
    }

    public final void a(Object obj) {
        this.f5212b.onLoadFinished(this.f5211a, obj);
        this.f5213c = true;
    }

    public final String toString() {
        return this.f5212b.toString();
    }
}
