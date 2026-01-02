package l2;

import android.content.Context;
import android.widget.Toast;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3744a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k2.c f3745b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f3746c;

    public /* synthetic */ z(k2.c cVar, String str, int i) {
        this.f3744a = i;
        this.f3745b = cVar;
        this.f3746c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3744a) {
            case 0:
                Context context = ((a0) this.f3745b.f3364c).f3540a;
                Toast.makeText(context, "Error: " + this.f3746c, 1).show();
                return;
            default:
                a0 a0Var = (a0) this.f3745b.f3364c;
                Toast.makeText(a0Var.f3540a, a0Var.getString(2131951966), 0).show();
                a0Var.f3613v.edit().putString("lastLocation", this.f3746c).apply();
                return;
        }
    }
}
