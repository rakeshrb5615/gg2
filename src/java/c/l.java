package c;

import android.content.Intent;
import android.content.IntentSender;
import android.view.ViewGroup;
import java.io.Serializable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f818a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f819b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f820c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f821d;

    public /* synthetic */ l(i2.h hVar, ViewGroup viewGroup, int i) {
        this.f818a = 2;
        this.f819b = hVar;
        this.f821d = viewGroup;
        this.f820c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f818a) {
            case 0:
                m mVar = (m) this.f819b;
                Serializable serializable = (Serializable) ((l6.c) this.f821d).f3791b;
                String str = (String) mVar.f1285a.get(Integer.valueOf(this.f820c));
                if (str == null) {
                    return;
                }
                e.f fVar = (e.f) mVar.f1289e.get(str);
                if ((fVar != null ? fVar.f1277a : null) == null) {
                    mVar.f1291g.remove(str);
                    mVar.f1290f.put(str, serializable);
                    return;
                }
                e.b bVar = fVar.f1277a;
                kotlin.jvm.internal.j.c(bVar, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
                if (mVar.f1288d.remove(str)) {
                    bVar.onActivityResult(serializable);
                    return;
                }
                return;
            case 1:
                ((m) this.f819b).a(this.f820c, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f821d));
                return;
            case 2:
                ((i2.h) this.f819b).f2342b.r((ViewGroup) this.f821d, this.f820c);
                return;
            default:
                ((y1.b) ((u8.i) this.f819b).f6143d).j(this.f820c, this.f821d);
                return;
        }
    }

    public /* synthetic */ l(Object obj, int i, int i9, Object obj2) {
        this.f818a = i9;
        this.f819b = obj;
        this.f820c = i;
        this.f821d = obj2;
    }
}
