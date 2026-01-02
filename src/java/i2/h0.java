package i2;

import android.app.Dialog;
import android.view.View;
import com.chilllive.chillwallpaperproject.MainActivity;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class h0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2360a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Dialog f2361b;

    public /* synthetic */ h0(Dialog dialog, int i) {
        this.f2360a = i;
        this.f2361b = dialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f2360a;
        Dialog dialog = this.f2361b;
        switch (i) {
            case 0:
                int i9 = MainActivity.f958u0;
                dialog.dismiss();
                return;
            case 1:
                dialog.dismiss();
                return;
            default:
                dialog.dismiss();
                return;
        }
    }
}
