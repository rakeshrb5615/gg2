package g1;

import android.util.SparseArray;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray f1674a;

    /* renamed from: b  reason: collision with root package name */
    public u f1675b;

    public r(int i) {
        this.f1674a = new SparseArray(i);
    }

    public final void a(u uVar, int i, int i9) {
        int a10 = uVar.a(i);
        SparseArray sparseArray = this.f1674a;
        r rVar = sparseArray == null ? null : (r) sparseArray.get(a10);
        if (rVar == null) {
            rVar = new r(1);
            sparseArray.put(uVar.a(i), rVar);
        }
        if (i9 > i) {
            rVar.a(uVar, i + 1, i9);
        } else {
            rVar.f1675b = uVar;
        }
    }
}
