package l2;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.slider.Slider;
import i2.k0;
import java.util.Random;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a0 f3653a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ImageButton[] f3654b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f3655c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TextView f3656d;

    public /* synthetic */ c(a0 a0Var, ImageButton[] imageButtonArr, int i, TextView textView) {
        this.f3653a = a0Var;
        this.f3654b = imageButtonArr;
        this.f3655c = i;
        this.f3656d = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z9;
        a0 a0Var = this.f3653a;
        a0Var.getClass();
        boolean z10 = view instanceof ImageView;
        ImageButton[] imageButtonArr = this.f3654b;
        if (z10) {
            int i = 0;
            z9 = false;
            while (i < imageButtonArr.length) {
                ImageButton imageButton = imageButtonArr[i];
                imageButton.setSelected(imageButton == view);
                z9 = i == imageButtonArr.length - 1 && imageButton == view;
                i++;
            }
        } else {
            z9 = false;
        }
        if (view.isEnabled()) {
            i2.y.b(view);
            boolean z11 = a0Var.f3613v.getBoolean(a0Var.I0, false);
            for (ImageButton imageButton2 : imageButtonArr) {
                imageButton2.setEnabled(z11);
            }
            String[] strArr = a0Var.P;
            int i9 = this.f3655c;
            a0Var.C(this.f3656d, strArr[i9]);
            if (z9) {
                a0Var.f3613v.edit().putString(a0Var.f3574k0, "100000").apply();
                a0Var.f3613v.edit().putString(a0Var.f3574k0, "random").apply();
                Random random = k0.f2392a;
                int nextInt = random.nextInt(100);
                int nextInt2 = random.nextInt(30);
                int nextInt3 = random.nextInt(130) - 65;
                c4.b.Q(a0Var.f3613v, a0Var.B0, nextInt);
                c4.b.Q(a0Var.f3613v, a0Var.f3621x0, nextInt2);
                c4.b.Q(a0Var.f3613v, a0Var.f3625y0, nextInt3);
                Slider[] sliderArr = a0Var.D2.f3687e;
                a0Var.z(sliderArr[0], a0Var.B0, nextInt);
                a0Var.z(sliderArr[1], a0Var.f3625y0, nextInt2);
                a0Var.z(sliderArr[2], a0Var.f3621x0, nextInt3);
            } else {
                a0Var.f3613v.edit().putString(a0Var.f3574k0, a0Var.Z0).apply();
            }
            a0Var.f3613v.edit().putBoolean(a0Var.getString(2131952274), z9).apply();
            a0Var.f3613v.edit().putString(a0Var.f3580m0, a0Var.P[i9]).apply();
            a0Var.f3613v.edit().putString(a0Var.f3574k0, a0Var.O[i9]).apply();
            a0Var.B2.f();
            a0Var.D2.f();
        }
    }
}
