package l2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.slider.Slider;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public class b extends androidx.fragment.app.e0 {

    /* renamed from: a  reason: collision with root package name */
    public a0 f3631a;

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup f3632b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f3633c;

    /* renamed from: d  reason: collision with root package name */
    public Slider[] f3634d;

    /* renamed from: e  reason: collision with root package name */
    public MaterialSwitch[] f3635e;

    /* renamed from: f  reason: collision with root package name */
    public ImageButton[] f3636f;

    /* renamed from: m  reason: collision with root package name */
    public TextView[] f3637m;

    /* renamed from: n  reason: collision with root package name */
    public ImageButton f3638n;

    /* renamed from: o  reason: collision with root package name */
    public final int[] f3639o = {0, 0, 100, 100};

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131558543, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f3631a = (a0) getParentFragment();
        this.f3632b = (ViewGroup) view.findViewById(2131362372);
        this.f3633c = (TextView) view.findViewById(2131362391);
        this.f3638n = (ImageButton) view.findViewById(2131362393);
        this.f3637m = new TextView[]{(TextView) view.findViewById(2131361916), (TextView) view.findViewById(2131362152)};
        this.f3635e = new MaterialSwitch[]{view.findViewById(2131362154), view.findViewById(2131361875)};
        a0 a0Var = this.f3631a;
        MaterialSwitch[] materialSwitchArr = a0Var.E2.f3635e;
        if (materialSwitchArr != null && materialSwitchArr.length != 0) {
            String[] strArr = {a0Var.T0, a0Var.S0};
            boolean[] zArr = {false, true};
            for (int i = 0; i < materialSwitchArr.length; i++) {
                MaterialSwitch materialSwitch = materialSwitchArr[i];
                if (materialSwitch != null) {
                    a0Var.G(materialSwitch, strArr[i], zArr[i]);
                }
            }
        }
        ImageButton[] imageButtonArr = {(ImageButton) view.findViewById(2131362437), (ImageButton) view.findViewById(2131362461), (ImageButton) view.findViewById(2131361905), (ImageButton) view.findViewById(2131362615), (ImageButton) view.findViewById(2131361903), (ImageButton) view.findViewById(2131362329)};
        this.f3636f = imageButtonArr;
        this.f3631a.p(imageButtonArr, this.f3633c);
        Slider[] sliderArr = {view.findViewById(2131362028), view.findViewById(2131361915), view.findViewById(2131361880), view.findViewById(2131362364), view.findViewById(2131362003), view.findViewById(2131362096)};
        this.f3634d = sliderArr;
        this.f3631a.q(new Slider[]{sliderArr[0], sliderArr[3], sliderArr[4], sliderArr[5]}, new String[]{getString(2131951815), getString(2131951785), getString(2131951803), getString(2131951876)}, this.f3639o);
        a0 a0Var2 = this.f3631a;
        Slider slider = this.f3634d[1];
        a0Var2.getClass();
        i2.y.c(slider);
        a0Var2.z(slider, a0Var2.U0, 0);
        slider.f6597s.add(new h(a0Var2, 1));
        a0 a0Var3 = this.f3631a;
        Slider slider2 = this.f3634d[2];
        a0Var3.getClass();
        i2.y.c(slider2);
        a0Var3.z(slider2, a0Var3.b1, 100);
        slider2.f6597s.add(new g(a0Var3, a0Var3.Z1.f2533b, 1));
    }
}
