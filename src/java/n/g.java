package n;

import android.content.Context;
import android.view.View;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class g extends m.w {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f4130l = 0;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ k f4131m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, Context context, m.m mVar, View view) {
        super(context, mVar, view, true, 2130968611, 0);
        this.f4131m = kVar;
        this.f3937f = 8388613;
        j6.o oVar = kVar.C;
        this.f3939h = oVar;
        m.u uVar = this.i;
        if (uVar != null) {
            uVar.j(oVar);
        }
    }

    @Override // m.w
    public final void c() {
        switch (this.f4130l) {
            case 0:
                k kVar = this.f4131m;
                kVar.f4194z = null;
                kVar.getClass();
                super.c();
                return;
            default:
                k kVar2 = this.f4131m;
                m.m mVar = kVar2.f4178c;
                if (mVar != null) {
                    mVar.c(true);
                }
                kVar2.f4193y = null;
                super.c();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, Context context, m.e0 e0Var, View view) {
        super(context, e0Var, view, false, 2130968611, 0);
        this.f4131m = kVar;
        if ((e0Var.A.f3918x & 32) != 32) {
            View view2 = kVar.f4184o;
            this.f3936e = view2 == null ? (View) kVar.f4183n : view2;
        }
        j6.o oVar = kVar.C;
        this.f3939h = oVar;
        m.u uVar = this.i;
        if (uVar != null) {
            uVar.j(oVar);
        }
    }
}
