package a1;

import android.content.Context;
import android.view.View;
import java.io.File;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class d0 extends kotlin.jvm.internal.k implements u7.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f39a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f40b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(Object obj, int i) {
        super(1);
        this.f39a = i;
        this.f40b = obj;
    }

    @Override // u7.l
    public final Object invoke(Object obj) {
        switch (this.f39a) {
            case 0:
                Throwable th = (Throwable) obj;
                g0 g0Var = (g0) this.f40b;
                if (th != null) {
                    g0Var.f79h.l(new r0(th));
                }
                if (g0Var.j.f2233b != h7.k.f2235a) {
                    ((o0) g0Var.j.getValue()).close();
                }
                return h7.l.f2236a;
            case 1:
                File file = (File) obj;
                kotlin.jvm.internal.j.e(file, "it");
                return new z0(((i8.c) this.f40b).f2768a, file);
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.j.e(entry, "entry");
                WeakHashMap weakHashMap = q0.q0.f5172a;
                return Boolean.valueOf(i7.i.Z((Collection) this.f40b, q0.i0.e((View) entry.getValue())));
            default:
                kotlin.jvm.internal.j.e((Context) obj, "it");
                return new x1.c((Context) this.f40b, 0);
        }
    }
}
