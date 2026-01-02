package l2;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.materialswitch.MaterialSwitch;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public class b0 extends androidx.fragment.app.e0 {

    /* renamed from: a  reason: collision with root package name */
    public Context f3640a;

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup f3641b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f3642c;

    /* renamed from: d  reason: collision with root package name */
    public ImageButton[] f3643d;

    /* renamed from: e  reason: collision with root package name */
    public ImageButton[] f3644e;

    /* renamed from: f  reason: collision with root package name */
    public MaterialButtonToggleGroup f3645f;

    /* renamed from: m  reason: collision with root package name */
    public TextView f3646m;

    /* renamed from: n  reason: collision with root package name */
    public a0 f3647n;

    /* renamed from: o  reason: collision with root package name */
    public ImageButton f3648o;

    /* renamed from: p  reason: collision with root package name */
    public ImageButton f3649p;
    public ImageView q;

    /* renamed from: r  reason: collision with root package name */
    public ImageView f3650r;

    /* renamed from: s  reason: collision with root package name */
    public MaterialSwitch f3651s;

    /* renamed from: t  reason: collision with root package name */
    public MaterialSwitch f3652t;

    public final void f() {
        a0 a0Var = this.f3647n;
        if (a0Var == null) {
            return;
        }
        a0Var.m(this.f3644e, -1);
        this.f3647n.v(this.f3643d);
        a0 a0Var2 = this.f3647n;
        ImageButton[] imageButtonArr = this.f3643d;
        a0Var2.Y = a0Var2.f3613v.getBoolean(a0Var2.I0, false);
        for (ImageButton imageButton : imageButtonArr) {
            imageButton.setEnabled(!a0Var2.Y);
        }
        this.f3647n.E(this.f3645f);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131558549, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f3640a = requireContext();
        this.f3647n = (a0) getParentFragment();
        this.f3641b = (ViewGroup) view.findViewById(2131362410);
        this.f3648o = (ImageButton) view.findViewById(2131362609);
        this.f3649p = (ImageButton) view.findViewById(2131362393);
        this.q = (ImageView) view.findViewById(2131362352);
        this.f3650r = (ImageView) view.findViewById(2131362162);
        this.f3642c = (TextView) view.findViewById(2131362605);
        ImageButton[] imageButtonArr = {(ImageButton) view.findViewById(2131362463), (ImageButton) view.findViewById(2131362298), (ImageButton) view.findViewById(2131361974), (ImageButton) view.findViewById(2131362289), (ImageButton) view.findViewById(2131362327), (ImageButton) view.findViewById(2131362427), (ImageButton) view.findViewById(2131362511), (ImageButton) view.findViewById(2131362512), (ImageButton) view.findViewById(2131361798), (ImageButton) view.findViewById(2131361800)};
        this.f3643d = imageButtonArr;
        a0 a0Var = this.f3647n;
        TextView textView = this.f3642c;
        a0Var.getClass();
        for (int i = 0; i < 10; i++) {
            imageButtonArr[i].setOnClickListener(new c(a0Var, imageButtonArr, i, textView));
        }
        a0Var.K(textView);
        this.f3647n.v(this.f3643d);
        MaterialButtonToggleGroup findViewById = view.findViewById(2131362351);
        this.f3645f = findViewById;
        a0 a0Var2 = this.f3647n;
        a0Var2.getClass();
        findViewById.q.add(new i(a0Var2, 0));
        a0Var2.E(findViewById);
        MaterialSwitch findViewById2 = view.findViewById(2131362049);
        this.f3651s = findViewById2;
        this.f3647n.n(findViewById2);
        MaterialSwitch findViewById3 = view.findViewById(2131362161);
        this.f3652t = findViewById3;
        a0 a0Var3 = this.f3647n;
        Context context = this.f3640a;
        a0Var3.getClass();
        ((LinearLayout) findViewById3.getParent()).setOnClickListener(new j(findViewById3, 1));
        findViewById3.setChecked(a0Var3.f3613v.getBoolean(a0Var3.H0, false));
        findViewById3.setOnClickListener(new k2.b(a0Var3, (KeyEvent.Callback) findViewById3, (Object) context, 1));
        this.f3646m = (TextView) view.findViewById(2131362391);
        ImageButton[] imageButtonArr2 = {(ImageButton) view.findViewById(2131362437), (ImageButton) view.findViewById(2131362461), (ImageButton) view.findViewById(2131361905), (ImageButton) view.findViewById(2131362615), (ImageButton) view.findViewById(2131361903), (ImageButton) view.findViewById(2131362329)};
        this.f3644e = imageButtonArr2;
        this.f3647n.p(imageButtonArr2, this.f3646m);
    }
}
