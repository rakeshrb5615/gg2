package l2;

import android.content.Context;
import android.widget.Toast;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class f implements e.b, x3.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a0 f3682a;

    public /* synthetic */ f(a0 a0Var) {
        this.f3682a = a0Var;
    }

    @Override // e.b
    public void onActivityResult(Object obj) {
        a0 a0Var = this.f3682a;
        a0Var.getClass();
        if (((Boolean) obj).booleanValue()) {
            a0Var.f3615v1.a(true);
            return;
        }
        Toast.makeText((Context) a0Var.Y1, 2131952235, 0).show();
        a0Var.u();
    }
}
