package g5;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final v f1796a;

    /* renamed from: b  reason: collision with root package name */
    public final j f1797b;

    public k(v vVar, m5.c cVar) {
        this.f1796a = vVar;
        this.f1797b = new j(cVar);
    }

    public final void a(String str) {
        j jVar = this.f1797b;
        synchronized (jVar) {
            if (!Objects.equals(jVar.f1794b, str)) {
                j.a(jVar.f1793a, str, jVar.f1795c);
                jVar.f1794b = str;
            }
        }
    }
}
