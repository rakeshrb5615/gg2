package l2;

import a2.w0;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.b1;
import androidx.fragment.app.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chilllive.chillwallpaperproject.MainActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.slider.Slider;
import com.google.android.material.textfield.TextInputLayout;
import i2.h0;
import i2.o0;
import i2.t0;
import i2.v0;
import j5.t1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public class a0 extends androidx.fragment.app.e0 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public TextView A;
    public String A0;
    public String A1;
    public ImageButton A2;
    public TextView B;
    public String B0;
    public String B1;
    public b0 B2;
    public TextView C;
    public String C0;
    public String C1;
    public a C2;
    public TextView D;
    public String D0;
    public String D1;
    public f0 D2;
    public ImageButton E;
    public String E0;
    public String E1;
    public b E2;
    public ImageButton F;
    public String F0;
    public String F1;
    public e0 F2;
    public ImageButton G;
    public String G0;
    public String G1;
    public long G2;
    public Slider H;
    public String H0;
    public String H1;
    public Drawable I;
    public String I0;
    public String I1;
    public int I2;
    public Drawable J;
    public String J0;
    public String J1;
    public Drawable K;
    public String K0;
    public androidx.fragment.app.e0 K2;
    public Drawable L;
    public String L0;
    public boolean L2;
    public int M;
    public String M0;
    public boolean M2;
    public int[] N;
    public String N0;
    public String[] O;
    public String O0;
    public TextInputLayout O1;
    public String[] P;
    public String P0;
    public TextInputLayout P1;
    public String Q;
    public String Q0;
    public TextInputLayout Q1;
    public int R;
    public String R0;
    public EditText R1;
    public int S;
    public String S0;
    public EditText S1;
    public int T;
    public String T0;
    public EditText T1;
    public int U;
    public String U0;
    public ImageView U1;
    public int V;
    public String V0;
    public int W;
    public String W0;
    public Locale W1;
    public int X;
    public String X0;
    public boolean X1;
    public boolean Y;
    public String Y0;
    public MainActivity Y1;
    public o0 Z;
    public String Z0;
    public v0 Z1;

    /* renamed from: a  reason: collision with root package name */
    public Context f3540a;

    /* renamed from: a0  reason: collision with root package name */
    public String f3541a0;

    /* renamed from: a1  reason: collision with root package name */
    public String f3542a1;

    /* renamed from: a2  reason: collision with root package name */
    public String f3543a2;

    /* renamed from: b  reason: collision with root package name */
    public i2.n f3544b;

    /* renamed from: b0  reason: collision with root package name */
    public String f3545b0;
    public String b1;

    /* renamed from: b2  reason: collision with root package name */
    public String f3546b2;

    /* renamed from: c  reason: collision with root package name */
    public ViewGroup f3547c;

    /* renamed from: c0  reason: collision with root package name */
    public String f3548c0;

    /* renamed from: c1  reason: collision with root package name */
    public int f3549c1;

    /* renamed from: c2  reason: collision with root package name */
    public String f3550c2;

    /* renamed from: d  reason: collision with root package name */
    public ViewGroup f3551d;

    /* renamed from: d0  reason: collision with root package name */
    public String f3552d0;

    /* renamed from: d1  reason: collision with root package name */
    public Drawable[] f3553d1;

    /* renamed from: d2  reason: collision with root package name */
    public String f3554d2;

    /* renamed from: e  reason: collision with root package name */
    public ViewGroup f3555e;

    /* renamed from: e0  reason: collision with root package name */
    public String f3556e0;

    /* renamed from: e2  reason: collision with root package name */
    public String f3558e2;

    /* renamed from: f  reason: collision with root package name */
    public ViewGroup f3559f;
    public String f0;

    /* renamed from: f2  reason: collision with root package name */
    public TextView f3561f2;

    /* renamed from: g0  reason: collision with root package name */
    public String f3562g0;

    /* renamed from: g1  reason: collision with root package name */
    public String[] f3563g1;

    /* renamed from: g2  reason: collision with root package name */
    public t0 f3564g2;

    /* renamed from: h0  reason: collision with root package name */
    public String f3565h0;

    /* renamed from: h2  reason: collision with root package name */
    public RecyclerView f3567h2;

    /* renamed from: i0  reason: collision with root package name */
    public String f3568i0;

    /* renamed from: i2  reason: collision with root package name */
    public LinearLayoutManager f3570i2;

    /* renamed from: j0  reason: collision with root package name */
    public String f3571j0;

    /* renamed from: j1  reason: collision with root package name */
    public boolean f3572j1;

    /* renamed from: j2  reason: collision with root package name */
    public boolean f3573j2;

    /* renamed from: k0  reason: collision with root package name */
    public String f3574k0;

    /* renamed from: k1  reason: collision with root package name */
    public boolean f3575k1;

    /* renamed from: k2  reason: collision with root package name */
    public View f3576k2;
    public String l0;

    /* renamed from: l1  reason: collision with root package name */
    public boolean f3577l1;

    /* renamed from: l2  reason: collision with root package name */
    public MaterialSwitch f3578l2;

    /* renamed from: m  reason: collision with root package name */
    public TextView f3579m;

    /* renamed from: m0  reason: collision with root package name */
    public String f3580m0;

    /* renamed from: m1  reason: collision with root package name */
    public boolean f3581m1;

    /* renamed from: m2  reason: collision with root package name */
    public View f3582m2;

    /* renamed from: n  reason: collision with root package name */
    public LinearLayout f3583n;

    /* renamed from: n0  reason: collision with root package name */
    public String f3584n0;
    public boolean n1;

    /* renamed from: n2  reason: collision with root package name */
    public MaterialButtonToggleGroup f3585n2;

    /* renamed from: o  reason: collision with root package name */
    public ViewGroup f3586o;

    /* renamed from: o0  reason: collision with root package name */
    public String f3587o0;

    /* renamed from: o1  reason: collision with root package name */
    public boolean f3588o1;

    /* renamed from: o2  reason: collision with root package name */
    public Slider f3589o2;

    /* renamed from: p  reason: collision with root package name */
    public int f3590p;

    /* renamed from: p0  reason: collision with root package name */
    public String f3591p0;

    /* renamed from: p1  reason: collision with root package name */
    public boolean f3592p1;

    /* renamed from: p2  reason: collision with root package name */
    public ViewGroup f3593p2;
    public int q;

    /* renamed from: q0  reason: collision with root package name */
    public String f3594q0;

    /* renamed from: q1  reason: collision with root package name */
    public boolean f3595q1;

    /* renamed from: q2  reason: collision with root package name */
    public View f3596q2;

    /* renamed from: r  reason: collision with root package name */
    public int f3597r;

    /* renamed from: r0  reason: collision with root package name */
    public String f3598r0;

    /* renamed from: r1  reason: collision with root package name */
    public boolean f3599r1;

    /* renamed from: r2  reason: collision with root package name */
    public View f3600r2;

    /* renamed from: s  reason: collision with root package name */
    public ArrayList f3601s;

    /* renamed from: s0  reason: collision with root package name */
    public String f3602s0;

    /* renamed from: s1  reason: collision with root package name */
    public boolean f3603s1;

    /* renamed from: s2  reason: collision with root package name */
    public Slider f3604s2;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList f3605t;

    /* renamed from: t0  reason: collision with root package name */
    public String f3606t0;

    /* renamed from: t1  reason: collision with root package name */
    public boolean f3607t1;

    /* renamed from: t2  reason: collision with root package name */
    public Slider f3608t2;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList f3609u;

    /* renamed from: u0  reason: collision with root package name */
    public String f3610u0;

    /* renamed from: u1  reason: collision with root package name */
    public j2.j f3611u1;

    /* renamed from: u2  reason: collision with root package name */
    public ViewGroup f3612u2;

    /* renamed from: v  reason: collision with root package name */
    public SharedPreferences f3613v;

    /* renamed from: v0  reason: collision with root package name */
    public String f3614v0;

    /* renamed from: v1  reason: collision with root package name */
    public i2.q f3615v1;
    public ViewGroup v2;

    /* renamed from: w  reason: collision with root package name */
    public String f3616w;

    /* renamed from: w0  reason: collision with root package name */
    public String f3617w0;

    /* renamed from: w2  reason: collision with root package name */
    public Slider f3619w2;

    /* renamed from: x  reason: collision with root package name */
    public i2.l f3620x;

    /* renamed from: x0  reason: collision with root package name */
    public String f3621x0;

    /* renamed from: x1  reason: collision with root package name */
    public String f3622x1;

    /* renamed from: x2  reason: collision with root package name */
    public Slider f3623x2;

    /* renamed from: y  reason: collision with root package name */
    public TextView f3624y;

    /* renamed from: y0  reason: collision with root package name */
    public String f3625y0;

    /* renamed from: y1  reason: collision with root package name */
    public String f3626y1;

    /* renamed from: y2  reason: collision with root package name */
    public ViewGroup f3627y2;

    /* renamed from: z  reason: collision with root package name */
    public TextView f3628z;
    public String z0;

    /* renamed from: z1  reason: collision with root package name */
    public String f3629z1;

    /* renamed from: z2  reason: collision with root package name */
    public ViewGroup f3630z2;

    /* renamed from: e1  reason: collision with root package name */
    public int f3557e1 = -7829368;

    /* renamed from: f1  reason: collision with root package name */
    public int f3560f1 = -7829368;

    /* renamed from: h1  reason: collision with root package name */
    public float f3566h1 = 6.0f;

    /* renamed from: i1  reason: collision with root package name */
    public float f3569i1 = 18.0f;

    /* renamed from: w1  reason: collision with root package name */
    public final m2.a f3618w1 = new m2.a();
    public final Handler K1 = new Handler();
    public final e L1 = new e(this, 0);
    public final Handler M1 = new Handler();
    public final e N1 = new e(this, 1);
    public boolean V1 = false;
    public final Handler H2 = new Handler(Looper.getMainLooper());
    public final int[] J2 = {0, 5, 10, 30, 60, 120, 180, 360, 720, 1440};
    public final e.c N2 = registerForActivityResult(new x0(2), new f(this));
    public boolean O2 = false;

    public final void A() {
        boolean z9 = this.f3613v.getBoolean(this.G0, false);
        int round = Math.round(m2.a.a() / 0.016666668f);
        if (!z9) {
            round = this.f3613v.getInt(this.F0, round);
        }
        z(this.H, this.F0, round);
        float f9 = round * 0.016666668f;
        this.Z1.f2564j2 = f9;
        F(f9);
    }

    public final void B() {
        int i = this.f3613v.getInt(this.f3542a1, -1);
        this.f3557e1 = i;
        int a10 = i2.l.a(i, this.f3607t1 ? 0.5f : 1.2f);
        this.f3560f1 = a10;
        this.f3560f1 = i2.l.b(a10, 0.5f);
    }

    public final void C(TextView textView, String str) {
        this.Z0 = str;
        int i = 0;
        if (str.equalsIgnoreCase(this.P[0])) {
            str = this.f3607t1 ? this.P[0] : this.Q;
        }
        if (this.Z0.equalsIgnoreCase(this.D0)) {
            this.f3613v.edit().putString(this.f3574k0, "").apply();
            textView.setText(this.E0);
            return;
        }
        while (true) {
            if (i >= this.O.length) {
                break;
            } else if (str.equals(this.P[i])) {
                str = this.P[i];
                break;
            } else {
                i++;
            }
        }
        textView.setText(str);
    }

    public final void D() {
        if (this.f3585n2 == null) {
            return;
        }
        this.O2 = true;
        int i = this.f3613v.getBoolean(this.P0, false) ? 2131362315 : this.f3613v.getBoolean(this.Q0, false) ? 2131362311 : 2131362314;
        this.f3585n2.f(i, true);
        g(this.f3585n2, i);
        this.O2 = false;
    }

    public final void E(MaterialButtonToggleGroup materialButtonToggleGroup) {
        if (materialButtonToggleGroup == null) {
            return;
        }
        MaterialButton findViewById = materialButtonToggleGroup.findViewById(2131362350);
        MaterialButton findViewById2 = materialButtonToggleGroup.findViewById(2131362347);
        if (findViewById != null) {
            findViewById.setEnabled(this.n1);
        }
        if (findViewById2 != null) {
            findViewById2.setEnabled(this.n1 || this.Y || this.f3572j1);
        }
        materialButtonToggleGroup.setEnabled(this.f3613v.getBoolean(this.H0, false));
        int i = this.f3613v.getInt(this.J0, 240);
        int i9 = i != 5 ? i == 30 ? 2131362347 : i == 60 ? 2131362345 : i == 120 ? 2131362346 : i == 180 ? 2131362348 : 2131362349 : 2131362350;
        materialButtonToggleGroup.f(i9, true);
        g(materialButtonToggleGroup, i9);
    }

    public final void F(float f9) {
        if (!"en".equals(this.W1.getLanguage()) || !"US".equals(this.W1.getCountry())) {
            this.f3579m.setText(m2.a.b(f9));
            return;
        }
        TextView textView = this.f3579m;
        this.f3618w1.getClass();
        int i = (int) f9;
        int i9 = (int) ((f9 - i) * 60.0f);
        int i10 = i % 12;
        if (i10 == 0) {
            i10 = 12;
        }
        textView.setText(String.format(Locale.getDefault(), "%02d:%02d %s", Integer.valueOf(i10), Integer.valueOf(i9), i < 12 ? "AM" : "PM"));
    }

    public final void G(MaterialSwitch materialSwitch, final String str, boolean z9) {
        materialSwitch.setChecked(this.f3613v.getBoolean(str, z9));
        this.f3620x.u(materialSwitch, this.f3560f1);
        LinearLayout linearLayout = (LinearLayout) materialSwitch.getParent();
        if (linearLayout == null) {
            materialSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: l2.s

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ a0 f3730b;

                {
                    this.f3730b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    switch (r3) {
                        case 0:
                            this.f3730b.f3613v.edit().putBoolean(str, z10).apply();
                            return;
                        default:
                            this.f3730b.f3613v.edit().putBoolean(str, z10).apply();
                            return;
                    }
                }
            });
            return;
        }
        materialSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: l2.s

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ a0 f3730b;

            {
                this.f3730b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                switch (r3) {
                    case 0:
                        this.f3730b.f3613v.edit().putBoolean(str, z10).apply();
                        return;
                    default:
                        this.f3730b.f3613v.edit().putBoolean(str, z10).apply();
                        return;
                }
            }
        });
        linearLayout.setOnClickListener(new j(materialSwitch, 2));
    }

    public final void H() {
        if (this.B2.isVisible() || this.D2.isVisible()) {
            Toast.makeText(this.f3540a, 2131952457, 0).show();
        }
    }

    public final void I() {
        String string = this.f3540a.getString(2131952211);
        if (this.f3613v.getBoolean(string, false)) {
            Toast.makeText(this.f3540a, 2131952463, 0).show();
            return;
        }
        Dialog dialog = new Dialog(new ContextThemeWrapper(this.f3540a, 2132017452));
        View n9 = a.a.n(this.Y1, dialog, this.f3540a, 2131558452);
        if (dialog.getWindow() != null) {
            CheckBox checkBox = (CheckBox) n9.findViewById(2131362018);
            Button button = (Button) n9.findViewById(2131362022);
            Button button2 = (Button) n9.findViewById(2131362017);
            ((TextView) n9.findViewById(2131362025)).setText(this.f3540a.getString(2131952472));
            ((TextView) n9.findViewById(2131362021)).setText(this.f3540a.getString(2131952463));
            button.setText(this.f3540a.getString(2131952471));
            button2.setText(this.f3540a.getString(2131952470));
            checkBox.setVisibility(0);
            checkBox.setText(this.f3540a.getString(2131951778));
            checkBox.setOnClickListener(new k2.b(this, string, checkBox, 4));
            button2.setOnClickListener(new h0(dialog, 2));
            button.setOnClickListener(new i2.b0(this, dialog));
        }
    }

    public final void J(boolean z9) {
        this.H.setEnabled(z9);
        this.F.setEnabled(z9);
        this.G.setEnabled(z9);
        this.E.setEnabled(z9);
        Context context = this.f3540a;
        boolean o9 = this.f3620x.o();
        int color = e0.c.getColor(context, 2131099794);
        int color2 = e0.c.getColor(context, 2131100822);
        int i = o9 ? color : color2;
        if (!o9) {
            color = color2;
        }
        int[] iArr = {i, color};
        int i9 = z9 ? this.f3607t1 ? this.U : this.V : iArr[0];
        int i10 = z9 ? iArr[1] : this.f3607t1 ? this.U : this.V;
        i2.l.i(this.H, i9, i10);
        i2.l.i(this.F, i9, i10);
        i2.l.i(this.G, i9, i10);
        i2.l.i(this.E, i9, i10);
    }

    public final void K(TextView textView) {
        String string = this.f3613v.getString(this.f3574k0, this.l0);
        int i = 0;
        while (true) {
            String[] strArr = this.O;
            if (i >= strArr.length) {
                return;
            }
            if (string.equalsIgnoreCase(strArr[i])) {
                this.Z0 = string;
                C(textView, this.P[i]);
                return;
            }
            i++;
        }
    }

    public final void L() {
        B();
        s();
        E(this.B2.isVisible() ? this.B2.f3645f : this.D2.f3689m);
        D();
        if (this.f3549c1 == 8) {
            this.f3624y.setTextColor(this.T);
            this.f3628z.setTextColor(this.T);
            this.A.setTextColor(this.T);
            this.B.setTextColor(this.T);
            this.C.setTextColor(this.T);
        }
    }

    public final void M(ImageButton[] imageButtonArr, TextView textView) {
        if (imageButtonArr == null || imageButtonArr.length < 2) {
            return;
        }
        ImageButton[] imageButtonArr2 = {imageButtonArr[0], imageButtonArr[1]};
        for (int i = 0; i < imageButtonArr.length; i++) {
            ImageButton imageButton = imageButtonArr[i];
            String str = this.O[i];
            Drawable drawable = imageButton == imageButtonArr2[0] ? this.f3607t1 ? this.I : this.J : imageButton == imageButtonArr2[1] ? this.f3607t1 ? this.K : this.L : imageButton.getDrawable();
            if (drawable != null) {
                Drawable mutate = drawable.getConstantState() != null ? drawable.getConstantState().newDrawable().mutate() : drawable.mutate();
                imageButton.setSelected(str.equalsIgnoreCase(this.Y0));
                this.f3620x.getClass();
                if (mutate != null) {
                    int t7 = a.a.t(imageButton, 0);
                    if (Color.alpha(t7) == 0) {
                        t7 = (t7 & 16777215) | (-16777216);
                    }
                    Drawable mutate2 = mutate.mutate();
                    mutate2.setTint(t7);
                    imageButton.setImageDrawable(mutate2);
                    imageButton.setTag(2131361998, Integer.valueOf(t7));
                }
            }
        }
        K(textView);
    }

    public final void f() {
        o0 o0Var = this.Z;
        if (o0Var == null) {
            return;
        }
        int b10 = o0Var.b();
        this.I2 = b10;
        boolean z9 = false;
        this.f3572j1 = (b10 & 1) != 0;
        this.f3575k1 = c4.b.G(b10);
        this.f3577l1 = c4.b.I(this.I2);
        this.f3581m1 = c4.b.H(this.I2);
        this.n1 = c4.b.J(this.I2);
        int d9 = this.Z.d();
        boolean z10 = this.f3572j1;
        this.f3588o1 = z10 || this.f3575k1 || (d9 & 1) != 0;
        this.f3592p1 = z10 || this.f3575k1 || (d9 & 2) != 0;
        this.f3595q1 = z10 || this.f3575k1 || (d9 & 4) != 0;
        this.f3599r1 = z10 || this.f3575k1 || (d9 & 8) != 0;
        if (z10 || this.f3575k1 || (d9 & 16) != 0) {
            z9 = true;
        }
        this.f3603s1 = z9;
    }

    public final void g(MaterialButtonToggleGroup materialButtonToggleGroup, int i) {
        for (int i9 = 0; i9 < materialButtonToggleGroup.getChildCount(); i9++) {
            MaterialButton childAt = materialButtonToggleGroup.getChildAt(i9);
            if (childAt instanceof MaterialButton) {
                MaterialButton materialButton = childAt;
                if (!materialButton.isEnabled()) {
                    materialButton.setStrokeColor(ColorStateList.valueOf(this.f3607t1 ? this.U : this.V));
                    materialButton.setTextColor(this.f3607t1 ? this.U : this.V);
                } else if (materialButton.getId() == i) {
                    materialButton.setBackgroundTintList(ColorStateList.valueOf(this.f3560f1));
                    materialButton.setTextColor(this.f3557e1);
                } else {
                    materialButton.setBackgroundTintList(ColorStateList.valueOf(0));
                    materialButton.setTextColor(this.f3607t1 ? this.S : this.T);
                }
            }
        }
    }

    public final void h(Slider slider) {
        if (slider == null) {
            return;
        }
        i2.l.s(this.f3540a, slider, this.f3560f1, this.f3620x.o() ? i2.l.a(this.T, 0.95f) : i2.l.a(this.S, 1.6f));
    }

    public final void i(Slider[] sliderArr) {
        if (sliderArr == null || sliderArr.length == 0) {
            return;
        }
        int a10 = this.f3620x.o() ? i2.l.a(this.T, 0.95f) : i2.l.a(this.S, 1.6f);
        for (Slider slider : sliderArr) {
            if (slider != null) {
                i2.l.s(this.f3540a, slider, this.f3560f1, a10);
            }
        }
    }

    public final void j(MaterialSwitch[] materialSwitchArr) {
        if (materialSwitchArr == null) {
            return;
        }
        for (MaterialSwitch materialSwitch : materialSwitchArr) {
            if (materialSwitch != null) {
                this.f3620x.u(materialSwitch, this.f3560f1);
            }
        }
    }

    public final void k() {
        this.f3613v.edit().putBoolean(this.I0, false).apply();
        this.B2.f3651s.setChecked(false);
        this.D2.f3691o.setChecked(false);
    }

    public final void l(final EditText editText) {
        editText.setSingleLine(true);
        editText.setImeOptions(6);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l2.q
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                a0 a0Var = a0.this;
                if (i != 6) {
                    a0Var.getClass();
                    return false;
                }
                InputMethodManager inputMethodManager = (InputMethodManager) a0Var.f3540a.getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(textView.getWindowToken(), 0);
                }
                editText.clearFocus();
                return true;
            }
        });
    }

    public final void m(ImageButton[] imageButtonArr, int i) {
        boolean isSelected;
        if (imageButtonArr == null || imageButtonArr.length == 0) {
            return;
        }
        if (i == -1) {
            i = this.Z1.f2560i1;
        }
        int i9 = 0;
        while (i9 < imageButtonArr.length) {
            if (i9 < 4) {
                isSelected = i == i9;
                imageButtonArr[i9].setSelected(isSelected);
            } else {
                isSelected = imageButtonArr[i9].isSelected();
            }
            i2.l.j(this.f3620x, imageButtonArr[i9], isSelected, this.S, this.T, this.N[i9]);
            i9++;
        }
    }

    public final void n(MaterialSwitch materialSwitch) {
        ((LinearLayout) materialSwitch.getParent()).setOnClickListener(new j(materialSwitch, 0));
        materialSwitch.setOnClickListener(new l(this, materialSwitch, 0));
        materialSwitch.setChecked(this.f3613v.getBoolean(this.I0, false));
    }

    public final void o(Slider slider, String str) {
        slider.setValueFrom(0.0f);
        int[] iArr = this.J2;
        slider.setValueTo(iArr.length - 1);
        slider.setStepSize(1.0f);
        slider.f6597s.add(new g(this, str, 0));
        slider.setLabelFormatter(new f(this));
        int i = this.f3613v.getInt(str, 10);
        int i9 = 0;
        while (true) {
            if (i9 >= iArr.length) {
                i9 = 0;
                break;
            } else if (iArr[i9] == i) {
                break;
            } else {
                i9++;
            }
        }
        slider.setValue(i9);
        ViewGroup viewGroup = (ViewGroup) requireView().findViewById(2131362342);
        viewGroup.removeView(this.f3551d);
        viewGroup.addView(this.f3551d, 0);
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        if (!(context instanceof i2.n)) {
            throw new ClassCastException(context.toString());
        }
        this.f3544b = (i2.n) context;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131558456, viewGroup, false);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.M1.removeCallbacks(this.N1);
        this.f3613v.unregisterOnSharedPreferenceChangeListener(this);
        for (int i = 0; i < this.f3601s.size(); i++) {
            Bitmap bitmap = (Bitmap) this.f3601s.get(i);
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
            Bitmap bitmap2 = (Bitmap) this.f3605t.get(i);
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                bitmap2.recycle();
            }
            Bitmap bitmap3 = (Bitmap) this.f3609u.get(i);
            if (bitmap3 != null && !bitmap3.isRecycled()) {
                bitmap3.recycle();
            }
        }
        this.f3601s.clear();
        this.f3605t.clear();
        this.f3609u.clear();
        this.f3601s = null;
        this.f3605t = null;
        this.f3609u = null;
    }

    public final void onPause() {
        super.onPause();
        this.K1.removeCallbacks(this.L1);
        this.M1.removeCallbacks(this.N1);
        this.f3613v.edit().putInt(this.F0, (int) this.H.getValue()).apply();
        this.f3613v.unregisterOnSharedPreferenceChangeListener(this);
    }

    public final void onResume() {
        super.onResume();
        this.f3613v.registerOnSharedPreferenceChangeListener(this);
        this.K1.post(this.L1);
        this.M1.post(this.N1);
        B();
        J(!this.f3613v.getBoolean(this.G0, false));
        this.H2.postDelayed(new e(this, 3), 700L);
        A();
        if (this.f3613v.getBoolean(this.I0, false)) {
            String string = this.f3613v.getString(this.f3584n0, "empty");
            int i = this.f3613v.getInt(this.J0, 240);
            this.f3618w1.getClass();
            if (m2.a.f(i, string)) {
                this.f3611u1.c(Double.parseDouble(this.f3613v.getString(this.E1, "35")), Double.parseDouble(this.f3613v.getString(this.F1, "130")), true, new i2.m((Object) this, true));
            }
        }
        a aVar = this.C2;
        if (aVar == null) {
            return;
        }
        View view = aVar.f3539e;
        this.f3582m2 = view;
        if (view != null) {
            MaterialButtonToggleGroup findViewById = view.findViewById(2131362312);
            this.f3585n2 = findViewById;
            if (findViewById != null) {
                findViewById.q.add(new i(this, 1));
                D();
            }
            ImageButton imageButton = (ImageButton) this.f3582m2.findViewById(2131362317);
            this.A2 = imageButton;
            imageButton.setOnClickListener(new d(this, 5));
        }
        View view2 = this.B2.getView();
        if (view2 != null) {
            this.f3612u2 = (ViewGroup) view2.findViewById(2131362336);
            Slider slider = (Slider) view2.findViewById(2131362335);
            this.f3604s2 = slider;
            o(slider, this.I1);
            this.f3627y2 = (ViewGroup) view2.findViewById(2131362334);
            Slider slider2 = (Slider) view2.findViewById(2131362333);
            this.f3619w2 = slider2;
            o(slider2, this.J1);
        }
        View view3 = this.D2.getView();
        if (view3 != null) {
            this.v2 = (ViewGroup) view3.findViewById(2131362336);
            Slider slider3 = (Slider) view3.findViewById(2131362335);
            this.f3608t2 = slider3;
            o(slider3, this.I1);
            String string2 = getString(2131951753);
            MaterialSwitch materialSwitch = (MaterialSwitch) view3.findViewById(2131361973);
            this.f3578l2 = materialSwitch;
            G(materialSwitch, string2, true);
        }
        View view4 = this.E2.getView();
        if (view4 != null) {
            this.f3630z2 = (ViewGroup) view4.findViewById(2131362334);
            Slider slider4 = (Slider) view4.findViewById(2131362333);
            this.f3623x2 = slider4;
            o(slider4, this.J1);
        }
        if (this.f3613v.getInt(this.f3616w, 1) != 5) {
            ViewGroup viewGroup = this.f3627y2;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            ViewGroup viewGroup2 = this.f3630z2;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str == null || !isAdded()) {
            return;
        }
        this.f3566h1 = sharedPreferences.getFloat(this.f3629z1, 6.0f);
        this.f3569i1 = sharedPreferences.getFloat(this.A1, 18.0f);
        if (str.equals(this.V0)) {
            x(this.D2.f3687e);
        }
        Slider[] sliderArr = this.D2.f3687e;
        if (str.equals(this.B0)) {
            z(sliderArr[0], this.B0, 50);
        }
        if (str.equals(getString(2131952244))) {
            z(sliderArr[1], getString(2131952244), 30);
        }
        if (str.equals("ui_colors") || str.equals("seedGen")) {
            L();
        }
    }

    /* JADX WARN: Type inference failed for: r2v134, types: [a2.w0, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        this.f3540a = requireContext;
        this.W1 = requireContext.getResources().getConfiguration().getLocales().get(0);
        getString(2131952383);
        this.R0 = getString(2131952491);
        this.S0 = getString(2131951735);
        this.T0 = getString(2131951939);
        this.f3616w = getString(2131951799);
        this.f3541a0 = getString(2131951864);
        this.f3545b0 = getString(2131952234);
        this.f3548c0 = getString(2131952100);
        this.f3552d0 = getString(2131951894);
        this.f3556e0 = getString(2131951818);
        this.f0 = getString(2131951736);
        this.f3562g0 = getString(2131952345);
        this.f3565h0 = getString(2131952265);
        this.f3568i0 = getString(2131951740);
        this.f3571j0 = getString(2131952197);
        this.f3563g1 = new String[]{getString(2131952309), getString(2131952310), ("en".equals(this.W1.getLanguage()) && "US".equals(this.W1.getCountry())) ? this.f3540a.getString(2131952312) : this.f3540a.getString(2131952311), getString(2131952313), getString(2131952314), getString(2131952315)};
        this.f3574k0 = getResources().getString(2131952478);
        this.l0 = getResources().getString(2131951809);
        getResources().getString(2131951810);
        this.f3580m0 = getResources().getString(2131952479);
        this.f3584n0 = getResources().getString(2131952493);
        this.z0 = getString(2131952326);
        this.A0 = getString(2131952322);
        getString(2131952363);
        getString(2131952216);
        getString(2131951755);
        getString(2131952205);
        getString(2131952261);
        getString(2131952347);
        getString(2131952392);
        getString(2131952393);
        getString(2131952087);
        this.D0 = getString(2131952273);
        getString(2131952481);
        getString(2131952483);
        getString(2131952484);
        getString(2131952485);
        getString(2131952486);
        getString(2131952487);
        getString(2131952488);
        getString(2131952489);
        getString(2131952490);
        this.E0 = getString(2131952273);
        getString(2131952273);
        this.F0 = getString(2131952057);
        this.B0 = this.f3540a.getString(2131951749);
        this.C0 = this.f3540a.getString(2131951751);
        this.f3621x0 = this.f3540a.getString(2131952244);
        this.f3625y0 = this.f3540a.getString(2131952500);
        this.G0 = this.f3540a.getString(2131951952);
        this.K0 = this.f3540a.getString(2131952270);
        this.J0 = this.f3540a.getString(2131951622);
        this.H0 = this.f3540a.getString(2131951954);
        this.I0 = this.f3540a.getString(2131951903);
        getString(2131952366);
        getString(2131952372);
        this.f3622x1 = getString(2131952368);
        this.f3626y1 = getString(2131952374);
        this.f3629z1 = getString(2131952366);
        this.A1 = getString(2131952372);
        this.L0 = getString(2131952466);
        this.M0 = getString(2131952468);
        this.P0 = getString(2131951696);
        this.Q0 = getString(2131951691);
        this.N0 = getString(2131952301);
        this.O0 = getString(2131951874);
        this.U0 = getString(2131951706);
        this.V0 = getString(2131952243);
        this.W0 = getString(2131952503);
        this.X0 = getString(2131952502);
        this.B1 = getString(2131951851);
        this.C1 = getString(2131952269);
        this.D1 = getString(2131952438);
        this.f3542a1 = getString(2131952433);
        getString(2131952299);
        this.b1 = getString(2131952431);
        this.E1 = getString(2131951934);
        this.F1 = getString(2131951970);
        this.G1 = getString(2131951855);
        this.H1 = getString(2131952264);
        this.I1 = getString(2131952275);
        this.J1 = getString(2131952266);
        this.f3587o0 = this.f3540a.getString(2131952246);
        this.f3591p0 = this.f3540a.getString(2131952391);
        this.f3594q0 = this.f3540a.getString(2131952103);
        this.f3598r0 = this.f3540a.getString(2131952361);
        this.f3602s0 = this.f3540a.getString(2131952262);
        this.f3606t0 = this.f3540a.getString(2131952214);
        this.f3610u0 = this.f3540a.getString(2131952342);
        this.f3614v0 = this.f3540a.getString(2131951784);
        this.f3617w0 = this.f3540a.getString(2131951819);
        this.S = e0.c.getColor(this.f3540a, 2131099794);
        this.T = e0.c.getColor(this.f3540a, 2131100822);
        this.U = e0.c.getColor(this.f3540a, 2131100819);
        this.V = e0.c.getColor(this.f3540a, 2131100820);
        this.R = e0.c.getColor(this.f3540a, 2131099807);
        e0.c.getColor(this.f3540a, 2131099808);
        e0.c.getColor(this.f3540a, 2131099787);
        this.W = e0.c.getColor(this.f3540a, 2131100819);
        this.X = e0.c.getColor(this.f3540a, 2131100820);
        MainActivity mainActivity = (MainActivity) getActivity();
        this.Y1 = mainActivity;
        if (mainActivity != null) {
            this.Z1 = mainActivity.T;
        }
        this.f3620x = i2.l.l(this.f3540a);
        this.Z = o0.c(this.f3540a);
        this.f3613v = t1.z(this.f3540a);
        int i = getResources().getConfiguration().orientation;
        j2.j jVar = new j2.j(this.f3540a);
        this.f3611u1 = jVar;
        this.f3615v1 = new i2.q(this.f3540a, jVar);
        k2.c.p().m(this.Y1, this.f3540a, this.f3611u1, true);
        f();
        Drawable[] drawableArr = new Drawable[7];
        this.f3553d1 = drawableArr;
        drawableArr[0] = e0.c.getDrawable(this.f3540a, 2131231413);
        this.f3553d1[1] = e0.c.getDrawable(this.f3540a, 2131231414);
        this.f3553d1[2] = e0.c.getDrawable(this.f3540a, 2131231415);
        this.f3553d1[3] = e0.c.getDrawable(this.f3540a, 2131231416);
        this.f3553d1[4] = e0.c.getDrawable(this.f3540a, 2131231417);
        this.f3553d1[5] = e0.c.getDrawable(this.f3540a, 2131231418);
        this.f3553d1[6] = e0.c.getDrawable(this.f3540a, 2131231419);
        this.I = e0.c.getDrawable(this.f3540a, 2131231466);
        this.J = e0.c.getDrawable(this.f3540a, 2131231133);
        this.K = e0.c.getDrawable(this.f3540a, 2131231374);
        this.L = e0.c.getDrawable(this.f3540a, 2131231375);
        this.M = this.f3540a.getColor(2131100829);
        this.f3547c = (ViewGroup) view.findViewById(2131362144);
        this.f3559f = (ViewGroup) view.findViewById(2131362176);
        this.f3555e = (ViewGroup) view.findViewById(2131362342);
        this.f3551d = (ViewGroup) view.findViewById(2131362344);
        this.f3579m = (TextView) view.findViewById(2131361969);
        View findViewById = view.findViewById(2131362178);
        this.f3576k2 = findViewById;
        AtomicBoolean atomicBoolean = new AtomicBoolean(this.f3613v.getBoolean(this.G0, false));
        findViewById.setSelected(atomicBoolean.get());
        findViewById.setOnClickListener(new k2.b((Object) this, (Object) findViewById, (Object) atomicBoolean, 2));
        this.f3583n = (LinearLayout) view.findViewById(2131361921);
        this.f3586o = (ViewGroup) view.findViewById(2131362542);
        this.f3628z = (TextView) view.findViewById(2131362523);
        this.A = (TextView) view.findViewById(2131362536);
        this.B = (TextView) view.findViewById(2131362533);
        this.C = (TextView) view.findViewById(2131362534);
        this.D = (TextView) view.findViewById(2131362543);
        this.f3624y = (TextView) view.findViewById(2131362100);
        this.E = (ImageButton) view.findViewById(2131362330);
        this.H = view.findViewById(2131362180);
        this.F = (ImageButton) view.findViewById(2131362464);
        this.G = (ImageButton) view.findViewById(2131362466);
        this.O = new String[]{getString(2131952363), getString(2131952216), getString(2131951755), getString(2131952205), getString(2131952261), getString(2131952347), getString(2131952392), getString(2131952393), getString(2131952087), getString(2131952273)};
        getString(2131951743);
        this.Q = getString(2131952482);
        this.P = new String[]{getString(2131952481), getString(2131952483), getString(2131952484), getString(2131952485), getString(2131952486), getString(2131952487), getString(2131952488), getString(2131952489), getString(2131952490), getString(2131952273), getString(2131952273)};
        int color = e0.c.getColor(this.f3540a, 2131100761);
        int color2 = e0.c.getColor(this.f3540a, 2131100762);
        int color3 = e0.c.getColor(this.f3540a, 2131099677);
        int color4 = e0.c.getColor(this.f3540a, 2131100831);
        int i9 = this.f3560f1;
        this.N = new int[]{color, color2, color3, color4, i9, i9};
        this.f3593p2 = (ViewGroup) view.findViewById(2131362332);
        Slider slider = (Slider) view.findViewById(2131362331);
        this.f3589o2 = slider;
        o(slider, this.H1);
        this.f3596q2 = view.findViewById(2131362083);
        this.f3600r2 = view.findViewById(2131362136);
        this.f3596q2.setOnClickListener(new d(this, 2));
        this.f3600r2.setOnClickListener(new d(this, 2));
        boolean z9 = this.f3613v.getBoolean(getString(2131951838), true);
        this.f3596q2.setSelected(z9);
        this.f3600r2.setSelected(!z9);
        z(this.H, this.F0, Math.round(m2.a.a() / 0.016666668f));
        this.f3607t1 = this.f3620x.o();
        List asList = Arrays.asList(t1.m(this.f3540a, 2131231189), t1.m(this.f3540a, 2131231384), t1.m(this.f3540a, 2131231243), t1.m(this.f3540a, 2131231293), t1.m(this.f3540a, 2131231177), t1.m(this.f3540a, 2131231201), t1.m(this.f3540a, 2131231441), t1.m(this.f3540a, 2131231410), t1.m(this.f3540a, 2131231127));
        List asList2 = Arrays.asList(t1.m(this.f3540a, 2131231190), t1.m(this.f3540a, 2131231385), t1.m(this.f3540a, 2131231244), t1.m(this.f3540a, 2131231295), t1.m(this.f3540a, 2131231179), t1.m(this.f3540a, 2131231202), t1.m(this.f3540a, 2131231442), t1.m(this.f3540a, 2131231411), t1.m(this.f3540a, 2131231128));
        this.f3605t = new ArrayList(asList);
        this.f3609u = new ArrayList(asList2);
        this.f3601s = new ArrayList(this.f3607t1 ? this.f3605t : this.f3609u);
        i2.y.c(this.H);
        boolean z10 = this.f3613v.getBoolean(this.G0, false);
        z(this.H, this.F0, 720);
        this.H.f6597s.add(new h(this, 0));
        if (z10) {
            this.H.setEnabled(false);
        }
        TextView textView = (TextView) requireView().findViewById(2131362543);
        textView.setOnClickListener(new i2.b0(2, this, textView));
        this.f3624y.setOnClickListener(new d(this, 0));
        TextView textView2 = this.B;
        textView2.setOnClickListener(new l(this, textView2, 1));
        TextView textView3 = this.A;
        textView3.setOnClickListener(new l(this, textView3, 1));
        TextView textView4 = this.C;
        textView4.setOnClickListener(new l(this, textView4, 1));
        TextView textView5 = this.f3628z;
        textView5.setOnClickListener(new l(this, textView5, 1));
        textView.setOnClickListener(new l(this, textView, 1));
        this.E.setSelected(this.f3613v.getBoolean(this.K0, false));
        this.E.setOnClickListener(new d(this, 1));
        this.F.setOnClickListener(new d(this, 3));
        this.G.setOnClickListener(new d(this, 4));
        b1 childFragmentManager = getChildFragmentManager();
        this.f3543a2 = "modes";
        this.f3546b2 = "scenes";
        this.f3550c2 = "weather_frag";
        this.f3554d2 = "effects";
        this.f3558e2 = "simple_settings";
        a aVar = (a) childFragmentManager.B("modes");
        this.C2 = aVar;
        if (aVar == null) {
            this.C2 = new a();
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(childFragmentManager);
            aVar2.c(2131362045, this.C2, this.f3543a2, 1);
            aVar2.h(this.C2);
            aVar2.f();
        }
        b bVar = (b) childFragmentManager.B(this.f3546b2);
        this.E2 = bVar;
        if (bVar == null) {
            this.E2 = new b();
            androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(childFragmentManager);
            aVar3.c(2131362045, this.E2, this.f3546b2, 1);
            aVar3.h(this.E2);
            aVar3.f();
        }
        f0 f0Var = (f0) childFragmentManager.B(this.f3550c2);
        this.D2 = f0Var;
        if (f0Var == null) {
            this.D2 = new f0();
            androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(childFragmentManager);
            aVar4.c(2131362045, this.D2, this.f3550c2, 1);
            aVar4.h(this.D2);
            aVar4.f();
        }
        e0 e0Var = (e0) childFragmentManager.B(this.f3554d2);
        this.F2 = e0Var;
        if (e0Var == null) {
            this.F2 = new e0();
            androidx.fragment.app.a aVar5 = new androidx.fragment.app.a(childFragmentManager);
            aVar5.c(2131362045, this.F2, this.f3554d2, 1);
            aVar5.h(this.F2);
            aVar5.f();
        }
        b0 b0Var = (b0) childFragmentManager.B(this.f3558e2);
        this.B2 = b0Var;
        if (b0Var == null) {
            this.B2 = new b0();
            androidx.fragment.app.a aVar6 = new androidx.fragment.app.a(childFragmentManager);
            aVar6.c(2131362045, this.B2, this.f3558e2, 1);
            aVar6.f();
        }
        this.K2 = this.B2;
        this.D.setSelected(true);
        this.f3567h2 = view.findViewById(2131362369);
        this.f3561f2 = (TextView) view.findViewById(2131362370);
        this.f3570i2 = new LinearLayoutManager(0);
        new a2.c0(0).a(this.f3567h2);
        Context context = this.f3567h2.getContext();
        this.f3567h2.setLayoutManager(this.f3570i2);
        t0 t0Var = new t0(this.f3601s, new f(this), context, this.f3567h2);
        this.f3564g2 = t0Var;
        this.f3567h2.setAdapter(t0Var);
        this.f3567h2.j((w0) new Object());
        g0.k kVar = new g0.k(this, this.f3613v.getInt(this.B1, 0), 3);
        v vVar = new v(this, kVar);
        this.f3564g2.f350a.registerObserver(vVar);
        this.f3567h2.getViewTreeObserver().addOnGlobalLayoutListener(new w(this, kVar, vVar));
        this.f3567h2.getViewTreeObserver().addOnPreDrawListener(new b0.e(this, 1));
        this.f3567h2.j(new a2.m(this, 1));
        this.X1 = true;
    }

    public final void p(final ImageButton[] imageButtonArr, final TextView textView) {
        for (final int i = 0; i < imageButtonArr.length; i++) {
            final ImageButton imageButton = imageButtonArr[i];
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: l2.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a0 a0Var = a0.this;
                    a0Var.getClass();
                    boolean z9 = view instanceof ImageButton;
                    ImageButton[] imageButtonArr2 = imageButtonArr;
                    if (z9) {
                        int length = imageButtonArr2.length;
                        for (int i9 = 0; i9 < length; i9++) {
                            ImageButton imageButton2 = imageButtonArr2[i9];
                            imageButton2.setSelected(imageButton2 == view);
                        }
                    }
                    i2.y.b(imageButton);
                    int i10 = i;
                    a0Var.y(i10, textView);
                    a0Var.m(imageButtonArr2, i10);
                }
            });
        }
        y(this.f3613v.getInt(this.f3616w, 1), textView);
    }

    public final void q(Slider[] sliderArr, final String[] strArr, int[] iArr) {
        for (final int i = 0; i < sliderArr.length; i++) {
            z(sliderArr[i], strArr[i], iArr[i]);
            Slider slider = sliderArr[i];
            slider.f6597s.add(new x3.g() { // from class: l2.r
                @Override // x3.g
                public final void a(float f9) {
                    a0.this.f3613v.edit().putInt(strArr[i], (int) f9).apply();
                }
            });
            i2.y.c(sliderArr[i]);
        }
    }

    public final void r() {
        TextView[] textViewArr;
        a0 a0Var;
        char c9;
        t0 t0Var;
        i2.l lVar = this.f3620x;
        if (lVar == null) {
            return;
        }
        boolean z9 = this.f3607t1;
        boolean o9 = lVar.o();
        boolean z10 = o9 != z9;
        this.f3607t1 = o9;
        if (z10 && this.f3601s != null && (t0Var = this.f3564g2) != null) {
            ArrayList arrayList = o9 ? this.f3605t : this.f3609u;
            this.f3601s = arrayList;
            t0Var.i.animate().alpha(0.0f).setDuration(200).withEndAction(new a5.i(10, t0Var, arrayList)).start();
        }
        String string = this.f3613v.getString(this.f3574k0, this.l0);
        int i = 0;
        while (true) {
            String[] strArr = this.O;
            if (i >= strArr.length) {
                break;
            } else if (string.equals(strArr[i])) {
                this.Z0 = this.P[i];
                break;
            } else {
                i++;
            }
        }
        androidx.fragment.app.e0 e0Var = this.K2;
        b0 b0Var = this.B2;
        if (e0Var == b0Var) {
            M(b0Var.f3643d, b0Var.f3642c);
        } else {
            f0 f0Var = this.D2;
            if (e0Var == f0Var) {
                M(f0Var.f3686d, f0Var.f3685c);
            }
        }
        char c10 = 3;
        ViewGroup[] viewGroupArr = {this.f3583n, this.f3586o, this.C2.f3535a, this.E2.f3632b, this.D2.f3684b, this.F2.f3681b};
        boolean[] zArr = {this.f3549c1 == 8, false, false, false, false, false};
        boolean[] zArr2 = {true, true, this.B.isSelected(), this.C.isSelected(), this.A.isSelected(), this.f3628z.isSelected()};
        int i9 = 0;
        while (i9 < 6) {
            if (zArr2[i9]) {
                c9 = c10;
                i2.l.p(viewGroupArr[i9], zArr[i9], this.f3620x, this.S, this.T, this.f3607t1);
            } else {
                c9 = c10;
            }
            i9++;
            c10 = c9;
        }
        char c11 = c10;
        b0 b0Var2 = this.B2;
        ImageButton imageButton = b0Var2.f3648o;
        ImageButton imageButton2 = b0Var2.f3649p;
        ImageView imageView = b0Var2.q;
        ImageView imageView2 = b0Var2.f3650r;
        f0 f0Var2 = this.D2;
        ImageView imageView3 = f0Var2.f3690n;
        ImageButton imageButton3 = this.E2.f3638n;
        ImageButton imageButton4 = f0Var2.f3688f;
        ImageButton imageButton5 = this.F;
        ImageButton imageButton6 = this.G;
        ImageButton imageButton7 = this.E;
        View[] viewArr = new View[10];
        viewArr[0] = imageButton;
        viewArr[1] = imageButton2;
        viewArr[2] = imageView;
        viewArr[c11] = imageView2;
        viewArr[4] = imageView3;
        viewArr[5] = imageButton3;
        viewArr[6] = imageButton4;
        viewArr[7] = imageButton5;
        viewArr[8] = imageButton6;
        viewArr[9] = imageButton7;
        boolean z11 = !this.f3613v.getBoolean(this.G0, false);
        boolean[] zArr3 = new boolean[10];
        zArr3[0] = true;
        zArr3[1] = true;
        zArr3[2] = true;
        zArr3[c11] = true;
        zArr3[4] = true;
        zArr3[5] = true;
        zArr3[6] = true;
        zArr3[7] = z11;
        zArr3[8] = z11;
        zArr3[9] = z11;
        int i10 = 0;
        while (i10 < 10) {
            View view = viewArr[i10];
            i2.l lVar2 = this.f3620x;
            boolean z12 = i10 == 9 && this.E.isSelected();
            boolean z13 = zArr3[i10];
            i2.l.j(lVar2, view, z12, z13 ? this.S : this.U, z13 ? this.T : this.V, this.f3607t1 ? this.S : this.T);
            i10++;
        }
        this.f3620x.c(this.Y1, this.f3586o, false);
        this.f3620x.c(this.Y1, this.f3559f, false);
        this.f3620x.c(this.Y1, this.f3583n, true);
        this.f3620x.c(this.Y1, this.f3555e, false);
        ViewGroup[] viewGroupArr2 = {this.B2.f3641b, this.C2.f3535a, this.E2.f3632b, this.D2.f3684b, this.F2.f3681b};
        boolean isSelected = this.D.isSelected();
        boolean isSelected2 = this.B.isSelected();
        boolean isSelected3 = this.C.isSelected();
        boolean isSelected4 = this.A.isSelected();
        boolean isSelected5 = this.f3628z.isSelected();
        boolean[] zArr4 = new boolean[5];
        zArr4[0] = isSelected;
        zArr4[1] = isSelected2;
        zArr4[2] = isSelected3;
        zArr4[c11] = isSelected4;
        zArr4[4] = isSelected5;
        for (int i11 = 0; i11 < 5; i11++) {
            ViewGroup viewGroup = viewGroupArr2[i11];
            if (viewGroup != null && zArr4[i11]) {
                this.f3620x.c(this.Y1, viewGroup, false);
            }
        }
        w();
        this.Y = this.f3613v.getBoolean(this.I0, false);
        this.B2.f3652t.setChecked(this.f3613v.getBoolean(this.H0, false));
        this.B2.f3651s.setChecked(this.Y);
        this.D2.f3691o.setChecked(this.Y);
        E(this.B2.f3645f);
        D();
        boolean z14 = this.f3549c1 == 7;
        if (z14) {
            i2.y.e(this.f3593p2);
        } else {
            i2.y.d(this.f3593p2);
        }
        this.f3589o2.setEnabled(z14);
        s();
        b0 b0Var3 = this.B2;
        if (b0Var3 != null) {
            b0Var3.f();
        }
        f0 f0Var3 = this.D2;
        if (f0Var3 != null) {
            f0Var3.f();
        }
        b bVar = this.E2;
        if (bVar != null && (a0Var = bVar.f3631a) != null) {
            a0Var.m(bVar.f3636f, -1);
        }
        b bVar2 = this.E2;
        if (bVar2 == null || (textViewArr = bVar2.f3637m) == null) {
            return;
        }
        for (TextView textView : textViewArr) {
            i2.l lVar3 = this.f3620x;
            int i12 = this.M;
            lVar3.getClass();
            ValueAnimator ofArgb = ValueAnimator.ofArgb(i12, i12);
            ofArgb.setDuration(300L);
            ofArgb.addUpdateListener(new i2.k(0, textView));
            ofArgb.start();
        }
    }

    public final void s() {
        int a10 = this.f3607t1 ? i2.l.a(this.T, 0.95f) : i2.l.a(this.S, 1.6f);
        Slider slider = this.H;
        int i = this.f3560f1;
        if (slider.isEnabled()) {
            slider.setTrackActiveTintList(ColorStateList.valueOf(i));
            slider.setTrackInactiveTintList(ColorStateList.valueOf(a10));
            slider.setThumbTintList(ColorStateList.valueOf(i));
        } else {
            slider.setTrackActiveTintList(ColorStateList.valueOf(this.W));
            slider.setTrackInactiveTintList(ColorStateList.valueOf(this.X));
            slider.setThumbTintList(ColorStateList.valueOf(this.W));
        }
        i(this.C2.f3536b);
        i(this.D2.f3687e);
        i(this.E2.f3634d);
        h(this.f3589o2);
        h(this.f3604s2);
        h(this.f3608t2);
        h(this.f3619w2);
        h(this.f3623x2);
        j(this.C2.f3537c);
        j(this.E2.f3635e);
        j(this.F2.f3680a);
        this.f3620x.u(this.B2.f3652t, this.f3560f1);
        this.f3620x.u(this.B2.f3651s, this.f3560f1);
        this.f3620x.u(this.D2.f3691o, this.f3560f1);
        this.f3620x.u(this.f3578l2, this.f3560f1);
    }

    public final void t(MaterialSwitch materialSwitch) {
        NetworkInfo activeNetworkInfo;
        i2.q qVar = this.f3615v1;
        Context context = this.f3540a;
        qVar.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.L2 = (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()) ? false : true;
        this.M2 = this.f3613v.getBoolean(this.H0, false);
        this.f3613v.edit().putBoolean(this.H0, !this.M2).apply();
        materialSwitch.setChecked(!this.M2);
        if (!materialSwitch.isChecked() && this.Y) {
            this.B2.f3651s.setChecked(false);
            this.D2.f3691o.setChecked(false);
            this.f3613v.edit().putBoolean(this.I0, true ^ this.M2).apply();
        }
        this.B2.f();
        w();
    }

    public final void u() {
        float f9;
        float f10 = this.f3566h1;
        if (f10 == 6.0f || f10 == 0.0f) {
            f9 = 18.0f;
            f10 = 6.0f;
        } else {
            f9 = this.f3569i1;
        }
        this.f3613v.edit().putFloat(this.f3629z1, f10).apply();
        this.f3613v.edit().putFloat(this.A1, f9).apply();
        this.f3613v.edit().putBoolean(this.H0, false).apply();
    }

    public final void v(ImageButton[] imageButtonArr) {
        if (imageButtonArr == null || imageButtonArr.length == 0) {
            return;
        }
        String string = this.f3613v.getString(this.f3574k0, this.l0);
        this.Y0 = string.toLowerCase();
        boolean z9 = this.f3613v.getBoolean(this.I0, false);
        int i = this.f3607t1 ? this.U : this.V;
        for (int i9 = 0; i9 < imageButtonArr.length; i9++) {
            ImageButton imageButton = imageButtonArr[i9];
            boolean equalsIgnoreCase = this.O[i9].equalsIgnoreCase(this.Y0);
            imageButton.setSelected(equalsIgnoreCase);
            i2.l.j(this.f3620x, imageButton, equalsIgnoreCase, z9 ? i : this.S, z9 ? i : this.T, this.R);
        }
        if (string.equalsIgnoreCase(this.O[9])) {
            i2.y.e(this.v2);
            i2.y.e(this.f3612u2);
            return;
        }
        i2.y.d(this.v2);
        i2.y.d(this.f3612u2);
    }

    public final void w() {
        i2.l lVar = this.f3620x;
        View view = this.f3576k2;
        i2.l.j(lVar, view, view.isSelected(), this.S, this.T, this.R);
    }

    public final void x(Slider[] sliderArr) {
        if (!this.Y || sliderArr == null || sliderArr.length == 0) {
            return;
        }
        int i = 0;
        Slider slider = sliderArr[0];
        Slider slider2 = sliderArr[1];
        Slider slider3 = sliderArr[2];
        int parseInt = Integer.parseInt(this.f3613v.getString(this.C0, "20"));
        slider.setValue(Math.max(1, Math.min(100, parseInt)));
        this.f3613v.edit().putInt(this.B0, parseInt).apply();
        String string = this.f3613v.getString(this.V0, null);
        if (string != null) {
            try {
                slider2.setValue(Math.round((Math.min(Float.parseFloat(string) * 5.0f, 30.0f) / 30.0f) * 100.0f));
            } catch (NumberFormatException unused) {
            }
        } else {
            slider2.setValue(29.0f);
        }
        SharedPreferences sharedPreferences = this.f3613v;
        String string2 = sharedPreferences.getString(this.W0, null);
        String string3 = sharedPreferences.getString(this.X0, null);
        if (string2 != null && string3 != null) {
            try {
                float parseFloat = Float.parseFloat(string2);
                i = Math.round(((float) Math.cos(Math.toRadians(Float.parseFloat(string3)))) * (Math.min(parseFloat, 50.0f) / 50.0f) * 65.0f);
            } catch (NumberFormatException unused2) {
            }
        }
        slider3.setValue(Math.max(-65, Math.min(65, i)));
    }

    public final void y(int i, TextView textView) {
        if (i != 5) {
            textView.setText(this.f3563g1[i]);
            this.f3613v.edit().putInt(this.f3616w, i).apply();
            i2.y.d(this.f3627y2);
            i2.y.d(this.f3630z2);
            return;
        }
        this.f3613v.edit().putInt(this.f3616w, 100).apply();
        this.f3613v.edit().putInt(this.f3616w, 5).apply();
        textView.setText((CharSequence) null);
        i2.y.e(this.f3627y2);
        i2.y.e(this.f3630z2);
    }

    public final void z(Slider slider, String str, int i) {
        if (slider == null) {
            return;
        }
        int valueFrom = (int) slider.getValueFrom();
        int valueTo = (int) slider.getValueTo();
        try {
            if (this.f3613v.contains(str)) {
                i = this.f3613v.getInt(str, i);
            }
        } catch (ClassCastException unused) {
        }
        slider.setValue(Math.max(valueFrom, Math.min(valueTo, i)));
    }
}
