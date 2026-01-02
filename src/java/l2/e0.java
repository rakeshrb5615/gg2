package l2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.materialswitch.MaterialSwitch;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public class e0 extends androidx.fragment.app.e0 {

    /* renamed from: a  reason: collision with root package name */
    public MaterialSwitch[] f3680a;

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup f3681b;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131558453, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        MaterialSwitch[] materialSwitchArr;
        this.f3681b = (ViewGroup) view.findViewById(2131362058);
        this.f3680a = new MaterialSwitch[]{view.findViewById(2131362318), view.findViewById(2131362510), view.findViewById(2131362462), view.findViewById(2131362217), view.findViewById(2131362328), view.findViewById(2131362297), view.findViewById(2131362612), view.findViewById(2131362405), view.findViewById(2131361991), view.findViewById(2131362054)};
        a0 a0Var = (a0) getParentFragment();
        if (a0Var == null || (materialSwitchArr = a0Var.F2.f3680a) == null || materialSwitchArr.length == 0) {
            return;
        }
        String[] strArr = {a0Var.f3587o0, a0Var.f3591p0, a0Var.f3598r0, a0Var.f3594q0, a0Var.f3602s0, a0Var.f3606t0, a0Var.getString(2131952499), a0Var.f3610u0, a0Var.f3614v0, a0Var.f3617w0};
        for (int i = 0; i < materialSwitchArr.length; i++) {
            MaterialSwitch materialSwitch = materialSwitchArr[i];
            if (materialSwitch != null) {
                a0Var.G(materialSwitch, strArr[i], true);
            }
        }
    }
}
