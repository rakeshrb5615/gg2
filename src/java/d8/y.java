package d8;

import android.util.Log;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final /* synthetic */ class y implements u7.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1265a;

    public /* synthetic */ y(int i) {
        this.f1265a = i;
    }

    @Override // u7.l
    public final Object invoke(Object obj) {
        switch (this.f1265a) {
            case 0:
                l7.f fVar = (l7.f) obj;
                if (fVar instanceof a0) {
                    return (a0) fVar;
                }
                return null;
            default:
                a1.b bVar = (a1.b) obj;
                kotlin.jvm.internal.j.e(bVar, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", bVar);
                return u6.i.f6115b;
        }
    }
}
