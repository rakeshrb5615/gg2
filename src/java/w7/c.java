package w7;

import java.util.Random;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class c extends a {

    /* renamed from: b  reason: collision with root package name */
    public final b f6488b = new ThreadLocal();

    @Override // w7.a
    public final Random a() {
        Object obj = this.f6488b.get();
        j.d(obj, "get(...)");
        return (Random) obj;
    }
}
