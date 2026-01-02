package y3;

import android.view.View;
import q0.s1;
import q0.t;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class e implements t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f6789a;

    public /* synthetic */ e(h hVar) {
        this.f6789a = hVar;
    }

    public void a(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.f6789a.a(0);
    }

    @Override // q0.t
    public s1 i(View view, s1 s1Var) {
        int a10 = s1Var.a();
        h hVar = this.f6789a;
        hVar.f6818m = a10;
        hVar.f6819n = s1Var.b();
        hVar.f6820o = s1Var.c();
        hVar.f();
        return s1Var;
    }
}
