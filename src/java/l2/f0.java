package l2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.slider.Slider;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public class f0 extends androidx.fragment.app.e0 {

    /* renamed from: a  reason: collision with root package name */
    public a0 f3683a;

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup f3684b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f3685c;

    /* renamed from: d  reason: collision with root package name */
    public ImageButton[] f3686d;

    /* renamed from: e  reason: collision with root package name */
    public Slider[] f3687e;

    /* renamed from: f  reason: collision with root package name */
    public ImageButton f3688f;

    /* renamed from: m  reason: collision with root package name */
    public MaterialButtonToggleGroup f3689m;

    /* renamed from: n  reason: collision with root package name */
    public ImageView f3690n;

    /* renamed from: o  reason: collision with root package name */
    public MaterialSwitch f3691o;

    /* renamed from: p  reason: collision with root package name */
    public final int[] f3692p = {15, 65, 50};

    public final void f() {
        a0 a0Var = this.f3683a;
        if (a0Var == null) {
            return;
        }
        a0Var.v(this.f3686d);
        a0 a0Var2 = this.f3683a;
        ImageButton[] imageButtonArr = this.f3686d;
        a0Var2.Y = a0Var2.f3613v.getBoolean(a0Var2.I0, false);
        for (ImageButton imageButton : imageButtonArr) {
            imageButton.setEnabled(!a0Var2.Y);
        }
        a0 a0Var3 = this.f3683a;
        Slider[] sliderArr = this.f3687e;
        if (sliderArr == null) {
            a0Var3.getClass();
        } else {
            a0Var3.Y = a0Var3.f3613v.getBoolean(a0Var3.I0, false);
            for (Slider slider : sliderArr) {
                slider.setEnabled(!a0Var3.Y);
            }
            a0Var3.s();
        }
        this.f3683a.x(this.f3687e);
        this.f3683a.E(this.f3689m);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131558554, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f3683a = (a0) getParentFragment();
        this.f3684b = (ViewGroup) view.findViewById(2131362608);
        this.f3685c = (TextView) view.findViewById(2131362605);
        MaterialSwitch findViewById = view.findViewById(2131362049);
        this.f3691o = findViewById;
        this.f3683a.n(findViewById);
        this.f3688f = (ImageButton) view.findViewById(2131362609);
        this.f3690n = (ImageView) view.findViewById(2131362352);
        this.f3689m = view.findViewById(2131362351);
        ImageButton[] imageButtonArr = {(ImageButton) view.findViewById(2131362463), (ImageButton) view.findViewById(2131362298), (ImageButton) view.findViewById(2131361974), (ImageButton) view.findViewById(2131362289), (ImageButton) view.findViewById(2131362327), (ImageButton) view.findViewById(2131362427), (ImageButton) view.findViewById(2131362511), (ImageButton) view.findViewById(2131362512), (ImageButton) view.findViewById(2131361798), (ImageButton) view.findViewById(2131361800)};
        this.f3686d = imageButtonArr;
        a0 a0Var = this.f3683a;
        TextView textView = this.f3685c;
        a0Var.getClass();
        for (int i = 0; i < 10; i++) {
            imageButtonArr[i].setOnClickListener(new c(a0Var, imageButtonArr, i, textView));
        }
        a0Var.K(textView);
        a0 a0Var2 = this.f3683a;
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f3689m;
        a0Var2.getClass();
        materialButtonToggleGroup.q.add(new i(a0Var2, 0));
        a0Var2.E(materialButtonToggleGroup);
        String[] strArr = {getString(2131951749), getString(2131952244), getString(2131952500)};
        Slider[] sliderArr = {view.findViewById(2131361972), view.findViewById(2131362319), view.findViewById(2131362613)};
        this.f3687e = sliderArr;
        this.f3683a.q(sliderArr, strArr, this.f3692p);
    }
}
