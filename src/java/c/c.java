package c;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.t0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final /* synthetic */ class c implements u7.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f802a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n f803b;

    public /* synthetic */ c(n nVar, int i) {
        this.f802a = i;
        this.f803b = nVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [s1.e, java.lang.Object] */
    @Override // u7.a
    public final Object invoke() {
        switch (this.f802a) {
            case 0:
                this.f803b.reportFullyDrawn();
                return h7.l.f2236a;
            case 1:
                return n.c(this.f803b);
            case 2:
                ?? obj = new Object();
                this.f803b.getNavigationEventDispatcher().a(obj);
                return obj;
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                n nVar = this.f803b;
                return new t0(nVar.getApplication(), nVar, nVar.getIntent() != null ? nVar.getIntent().getExtras() : null);
            default:
                n nVar2 = this.f803b;
                v vVar = new v(new b(nVar2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (kotlin.jvm.internal.j.a(Looper.myLooper(), Looper.getMainLooper())) {
                        nVar2.getLifecycle().a(new d(0, vVar, nVar2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new a5.i(4, nVar2, vVar));
                    }
                }
                return vVar;
        }
    }
}
