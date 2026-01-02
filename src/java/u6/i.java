package u6;

import a1.f1;
import a1.n1;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class i implements f1 {

    /* renamed from: a  reason: collision with root package name */
    public static final i f6114a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final h f6115b = new h(null, null, null, null, null);

    @Override // a1.f1
    public final void a(Object obj, n1 n1Var) {
        byte[] bytes = t8.b.f5979d.b(h.Companion.serializer(), (h) obj).getBytes(b8.a.f766a);
        kotlin.jvm.internal.j.d(bytes, "getBytes(...)");
        n1Var.write(bytes);
    }

    @Override // a1.f1
    public final /* bridge */ /* synthetic */ Object b() {
        return f6115b;
    }

    @Override // a1.f1
    public final Object c(FileInputStream fileInputStream) {
        try {
            t8.b bVar = t8.b.f5979d;
            String str = new String(c4.b.S(fileInputStream), b8.a.f766a);
            bVar.getClass();
            return (h) bVar.a(h.Companion.serializer(), str);
        } catch (Exception e9) {
            throw new IOException("Cannot parse session configs", e9);
        }
    }
}
