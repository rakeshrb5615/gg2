package r6;

import a1.n1;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class i0 implements a1.f1 {

    /* renamed from: a  reason: collision with root package name */
    public final t0 f5681a;

    public i0(t0 t0Var) {
        kotlin.jvm.internal.j.e(t0Var, "sessionGenerator");
        this.f5681a = t0Var;
    }

    @Override // a1.f1
    public final void a(Object obj, n1 n1Var) {
        byte[] bytes = t8.b.f5979d.b(h0.Companion.serializer(), (h0) obj).getBytes(b8.a.f766a);
        kotlin.jvm.internal.j.d(bytes, "getBytes(...)");
        n1Var.write(bytes);
    }

    @Override // a1.f1
    public final Object b() {
        return new h0(this.f5681a.a(null), null, null);
    }

    @Override // a1.f1
    public final Object c(FileInputStream fileInputStream) {
        try {
            t8.b bVar = t8.b.f5979d;
            String str = new String(c4.b.S(fileInputStream), b8.a.f766a);
            bVar.getClass();
            return (h0) bVar.a(h0.Companion.serializer(), str);
        } catch (Exception e9) {
            throw new IOException("Cannot parse session data", e9);
        }
    }
}
