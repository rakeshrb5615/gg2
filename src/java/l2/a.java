package l2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.slider.Slider;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public class a extends androidx.fragment.app.e0 {

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f3535a;

    /* renamed from: b  reason: collision with root package name */
    public Slider[] f3536b;

    /* renamed from: c  reason: collision with root package name */
    public MaterialSwitch[] f3537c;

    /* renamed from: d  reason: collision with root package name */
    public a0 f3538d;

    /* renamed from: e  reason: collision with root package name */
    public View f3539e;

    public final View getView() {
        return this.f3539e;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131558487, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f3539e = view;
        this.f3538d = (a0) getParentFragment();
        this.f3535a = (ViewGroup) view.findViewById(2131362210);
        this.f3537c = new MaterialSwitch[]{view.findViewById(2131362470), view.findViewById(2131362514), view.findViewById(2131362316)};
        a0 a0Var = this.f3538d;
        MaterialSwitch[] materialSwitchArr = a0Var.C2.f3537c;
        if (materialSwitchArr != null && materialSwitchArr.length != 0) {
            String[] strArr = {a0Var.N0, a0Var.O0, a0Var.P0, a0Var.Q0};
            boolean[] zArr = {true, true, false, false};
            for (int i = 0; i < materialSwitchArr.length; i++) {
                MaterialSwitch materialSwitch = materialSwitchArr[i];
                if (materialSwitch != null) {
                    a0Var.G(materialSwitch, strArr[i], zArr[i]);
                }
            }
        }
        this.f3536b = new Slider[]{view.findViewById(2131362419), view.findViewById(2131362420)};
        this.f3538d.q(this.f3536b, new String[]{getString(2131951692), getString(2131952379)}, new int[]{20, 40});
    }
}
