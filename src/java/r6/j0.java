package r6;

import android.content.Context;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class j0 implements t6.b, t2.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5687a;

    /* renamed from: b  reason: collision with root package name */
    public final g7.a f5688b;

    public /* synthetic */ j0(g7.a aVar, int i) {
        this.f5687a = i;
        this.f5688b = aVar;
    }

    @Override // g7.a
    public final Object get() {
        switch (this.f5687a) {
            case 0:
                return new i0((t0) this.f5688b.get());
            case 1:
                String packageName = ((Context) this.f5688b.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new y2.j((Context) this.f5688b.get(), Integer.valueOf(y2.j.f6779d).intValue(), "com.google.android.datatransport.events");
        }
    }
}
