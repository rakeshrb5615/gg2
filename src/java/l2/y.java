package l2;

import android.content.Context;
import android.widget.Toast;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3741a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i2.m f3742b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f3743c;

    public /* synthetic */ y(i2.m mVar, String str, int i) {
        this.f3741a = i;
        this.f3742b = mVar;
        this.f3743c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3741a) {
            case 0:
                Context context = ((a0) this.f3742b.f2413b).f3540a;
                Toast.makeText(context, "Error: " + this.f3743c, 1).show();
                return;
            default:
                Toast.makeText(((a0) this.f3742b.f2413b).f3540a, this.f3743c, 0).show();
                return;
        }
    }
}
