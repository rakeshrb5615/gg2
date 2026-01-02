package g1;

import android.os.Build;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class e extends q4.b {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c5.b f1646f;

    public e(c5.b bVar) {
        super(7);
        this.f1646f = bVar;
    }

    @Override // q4.b
    public final void H(Throwable th) {
        ((i) this.f1646f.f929a).d(th);
    }

    @Override // q4.b
    public final void K(j6.s sVar) {
        c5.b bVar = this.f1646f;
        bVar.f931c = sVar;
        j6.s sVar2 = (j6.s) bVar.f931c;
        i iVar = (i) bVar.f929a;
        bVar.f930b = new b8.g(sVar2, iVar.f1654g, iVar.i, Build.VERSION.SDK_INT >= 34 ? m.a() : a.a.w());
        i iVar2 = (i) bVar.f929a;
        iVar2.getClass();
        ArrayList arrayList = new ArrayList();
        iVar2.f1648a.writeLock().lock();
        try {
            iVar2.f1650c = 1;
            arrayList.addAll(iVar2.f1649b);
            iVar2.f1649b.clear();
            iVar2.f1648a.writeLock().unlock();
            iVar2.f1651d.post(new com.google.android.material.datepicker.g(arrayList, iVar2.f1650c, (Throwable) null));
        } catch (Throwable th) {
            iVar2.f1648a.writeLock().unlock();
            throw th;
        }
    }
}
