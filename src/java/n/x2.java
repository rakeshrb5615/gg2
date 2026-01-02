package n;

import androidx.appcompat.widget.Toolbar;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final /* synthetic */ class x2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4347a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Toolbar f4348b;

    public /* synthetic */ x2(Toolbar toolbar, int i) {
        this.f4347a = i;
        this.f4348b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4347a) {
            case 0:
                a3 a3Var = this.f4348b.R;
                m.o oVar = a3Var == null ? null : a3Var.f4085b;
                if (oVar != null) {
                    oVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f4348b.m();
                return;
        }
    }
}
