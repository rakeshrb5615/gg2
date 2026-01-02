package g5;

import android.view.View;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1827a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1828b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f1829c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f1830d;

    public /* synthetic */ r(s sVar, long j, String str, int i) {
        this.f1827a = i;
        this.f1828b = sVar;
        this.f1829c = j;
        this.f1830d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1827a) {
            case 0:
                s sVar = (s) this.f1828b;
                sVar.f1843o.f2218b.a(new r(sVar, this.f1829c, (String) this.f1830d, 1));
                return;
            case 1:
                String str = (String) this.f1830d;
                n nVar = ((s) this.f1828b).f1837g;
                u uVar = nVar.f1818n;
                if (uVar == null || !uVar.f1855e.get()) {
                    ((i5.c) nVar.i.f2710b).g(this.f1829c, str);
                    return;
                }
                return;
            default:
                ((i2.e) this.f1828b).run();
                ((View) this.f1830d).animate().alpha(1.0f).setDuration(this.f1829c).start();
                return;
        }
    }

    public /* synthetic */ r(i2.e eVar, View view, long j) {
        this.f1827a = 2;
        this.f1828b = eVar;
        this.f1830d = view;
        this.f1829c = j;
    }
}
