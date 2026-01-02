package n;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class e3 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final m.a f4114a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f3 f4115b;

    /* JADX WARN: Type inference failed for: r0v0, types: [m.a, java.lang.Object] */
    public e3(f3 f3Var) {
        this.f4115b = f3Var;
        Context context = f3Var.f4117a.getContext();
        CharSequence charSequence = f3Var.f4124h;
        ?? obj = new Object();
        obj.f3801e = 4096;
        obj.f3803g = 4096;
        obj.f3806l = null;
        obj.f3807m = null;
        obj.f3808n = false;
        obj.f3809o = false;
        obj.f3810p = 16;
        obj.i = context;
        obj.f3797a = charSequence;
        this.f4114a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f3 f3Var = this.f4115b;
        Window.Callback callback = f3Var.f4125k;
        if (callback == null || !f3Var.f4126l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f4114a);
    }
}
