package l2;

import android.view.View;
import com.google.android.material.materialswitch.MaterialSwitch;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3700a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialSwitch f3701b;

    public /* synthetic */ j(MaterialSwitch materialSwitch, int i) {
        this.f3700a = i;
        this.f3701b = materialSwitch;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3700a) {
            case 0:
                this.f3701b.performClick();
                return;
            case 1:
                this.f3701b.performClick();
                return;
            default:
                this.f3701b.toggle();
                return;
        }
    }
}
