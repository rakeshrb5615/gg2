package l2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.j0;
import com.chilllive.chillwallpaperproject.MainActivity;
import i2.o0;
import j5.t1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public class d0 extends androidx.fragment.app.e0 {
    public Drawable A;
    public Drawable B;
    public Drawable C;
    public i2.l D;
    public String E;
    public String F;
    public String G;
    public o0 H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;

    /* renamed from: a  reason: collision with root package name */
    public j0 f3659a;

    /* renamed from: b  reason: collision with root package name */
    public Context f3660b;

    /* renamed from: c  reason: collision with root package name */
    public i2.n f3661c;

    /* renamed from: d  reason: collision with root package name */
    public ViewGroup f3662d;

    /* renamed from: e  reason: collision with root package name */
    public ViewGroup f3663e;

    /* renamed from: f  reason: collision with root package name */
    public ViewGroup f3664f;

    /* renamed from: m  reason: collision with root package name */
    public ViewGroup f3665m;

    /* renamed from: n  reason: collision with root package name */
    public ViewGroup f3666n;

    /* renamed from: o  reason: collision with root package name */
    public ViewGroup f3667o;

    /* renamed from: p  reason: collision with root package name */
    public Button f3668p;
    public Button q;

    /* renamed from: r  reason: collision with root package name */
    public Button f3669r;

    /* renamed from: s  reason: collision with root package name */
    public Button f3670s;

    /* renamed from: t  reason: collision with root package name */
    public Button f3671t;

    /* renamed from: u  reason: collision with root package name */
    public TextView f3672u;

    /* renamed from: v  reason: collision with root package name */
    public TextView f3673v;

    /* renamed from: w  reason: collision with root package name */
    public TextView f3674w;

    /* renamed from: x  reason: collision with root package name */
    public TextView f3675x;

    /* renamed from: y  reason: collision with root package name */
    public Button f3676y;

    /* renamed from: z  reason: collision with root package name */
    public Button f3677z;

    public static void h(View view, boolean z9) {
        view.setEnabled(!z9);
        view.setVisibility(z9 ? 8 : 0);
    }

    public final void f() {
        boolean z9;
        boolean z10;
        o0 o0Var = this.H;
        if (o0Var == null) {
            return;
        }
        int b10 = o0Var.b();
        boolean z11 = (b10 & 128) != 0;
        boolean z12 = (b10 & 1) != 0;
        boolean z13 = (b10 & 32) != 0;
        boolean z14 = (b10 & 64) != 0;
        boolean z15 = ((b10 & 512) == 0 && (b10 & 4096) == 0) ? false : true;
        boolean z16 = (b10 & 256) != 0;
        boolean z17 = (b10 & 16) != 0;
        boolean z18 = (b10 & 1024) != 0;
        boolean z19 = (b10 & 2048) != 0;
        boolean z20 = (b10 & 2) != 0;
        boolean z21 = (b10 & 4) != 0;
        h(this.f3665m, true);
        if (z13) {
            h(this.f3663e, false);
            h(this.f3673v, true);
            h(this.f3671t, true);
            h(this.f3668p, true);
            h(this.f3665m, true);
            this.f3668p.setText(this.E);
            this.f3675x.setVisibility(8);
            this.f3672u.setText(z12 ? this.G : this.F);
        }
        if (z14 || z12) {
            h(this.f3663e, false);
            h(this.f3670s, true);
            h(this.f3671t, false);
            h(this.f3673v, true);
            h(this.f3668p, true);
            h(this.f3669r, true);
            h(this.q, z12);
            h(this.f3666n, false);
            ((TextView) this.f3664f.findViewById(2131362565)).setText(getString(2131952444));
            this.f3674w.setText(getString(2131952434));
            this.f3668p.setText(this.E);
            this.f3672u.setText(z12 ? this.G : this.F);
            this.f3675x.setVisibility(8);
        }
        if (z11) {
            h(this.f3664f, false);
            h(this.f3663e, false);
            h(this.f3673v, true);
            h(this.f3668p, true);
            this.f3675x.setVisibility(8);
            this.q.setVisibility(8);
            ((TextView) this.f3664f.findViewById(2131362565)).setText(getString(2131952436));
            this.f3667o.setVisibility(8);
            if (z12) {
                this.f3671t.setVisibility(0);
                this.f3670s.setVisibility(8);
            }
        }
        if (z16 || z15) {
            h(this.f3663e, true);
            h(this.f3665m, true);
            h(this.f3670s, true);
            h(this.q, true);
            h(this.f3671t, true);
            h(this.f3664f, false);
            this.q.setVisibility(8);
            ((TextView) this.f3664f.findViewById(2131362565)).setText(getString(2131952435));
            ((TextView) this.f3664f.findViewById(2131362563)).setVisibility(8);
            this.f3667o.setVisibility(8);
        }
        if (z12) {
            this.f3674w.setText(getString(2131951721));
            h(this.f3667o, true);
        }
        TextView textView = (TextView) this.f3666n.findViewById(2131362568);
        Button button = (Button) this.f3666n.findViewById(2131362579);
        Button button2 = (Button) this.f3666n.findViewById(2131362580);
        Button button3 = (Button) this.f3666n.findViewById(2131362578);
        if (z17 || z18 || z19) {
            if (z17) {
                z9 = true;
                h(button, true);
            } else {
                z9 = true;
            }
            if (z18) {
                h(button, z9);
                h(button2, z9);
            }
            if (z19) {
                h(button, z9);
                h(button2, z9);
                h(button3, z9);
                textView.setText(getString(2131952443));
                if (z12) {
                    h(this.f3665m, z9);
                    h(this.f3664f, z9);
                }
            }
            ((TextView) this.f3666n.findViewById(2131362568)).setText(getString(2131952443));
        } else {
            textView.setText(getString(2131951702));
        }
        if (z15 || z16) {
            z10 = true;
            h(this.f3666n, true);
        } else {
            z10 = true;
        }
        if (z11) {
            h(button, z10);
            h(button2, z10);
        }
        h(this.f3667o, (z20 || z21 || z19 || z16 || z12 || z14) ? z10 : false);
    }

    public final void g() {
        boolean o9 = this.D.o();
        int color = e0.c.getColor(this.f3660b, 2131100814);
        int color2 = e0.c.getColor(this.f3660b, 2131100816);
        if (!o9) {
            color = color2;
        }
        if (isAdded()) {
            if (this.D == null) {
                this.D = i2.l.l(requireContext().getApplicationContext());
            }
            int i = o9 ? this.I : this.J;
            this.D.r(this.f3662d, i);
            View requireView = requireView();
            a.a.S(this.f3659a, (ViewGroup) requireView.findViewById(2131361944), o9 ? this.K : this.P);
            a.a.S(this.f3659a, (ViewGroup) requireView.findViewById(2131361947), o9 ? this.M : this.N);
            a.a.S(this.f3659a, (ViewGroup) requireView.findViewById(2131361948), o9 ? this.M : this.N);
            a.a.S(this.f3659a, (ViewGroup) requireView.findViewById(2131361949), color);
            this.A.setTint(o9 ? this.K : this.P);
            this.f3668p.setBackground(this.A);
            this.B.setTint(o9 ? this.L : this.Q);
            this.f3669r.setBackground(this.B);
            this.C.setTint(o9 ? this.O : this.R);
            this.f3677z.setBackground(this.C);
            boolean z9 = t1.z(this.f3660b).getInt(getString(2131952299), 0) == 8;
            ((TextView) requireView.findViewById(2131362455)).setTextColor(z9 ? this.J : i);
            ImageView imageView = (ImageView) requireView.findViewById(2131362454);
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                Drawable mutate = drawable.mutate();
                if (z9) {
                    i = this.J;
                }
                mutate.setTint(i);
                imageView.setImageDrawable(mutate);
            }
            this.f3670s.setTextColor(-1);
            this.f3671t.setTextColor(-1);
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        if (!(context instanceof i2.n)) {
            throw new ClassCastException(context.toString());
        }
        this.f3661c = (i2.n) context;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(2131558459, viewGroup, false);
        ((LinearLayout) inflate.findViewById(2131361983)).setOnClickListener(new com.google.android.material.datepicker.o(this, 1));
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        i2.n nVar = this.f3661c;
        if (nVar != null) {
            ((MainActivity) nVar).X = false;
        }
        f();
        g();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f3659a = requireActivity();
        this.f3660b = requireContext();
        this.f3662d = (ViewGroup) view.findViewById(2131362452);
        this.f3663e = (ViewGroup) view.findViewById(2131361945);
        this.f3665m = (ViewGroup) view.findViewById(2131361946);
        this.f3664f = (ViewGroup) view.findViewById(2131361948);
        this.f3675x = (TextView) view.findViewById(2131362557);
        this.f3666n = (ViewGroup) view.findViewById(2131362340);
        this.f3672u = (TextView) view.findViewById(2131362573);
        this.f3668p = (Button) view.findViewById(2131362575);
        this.f3669r = (Button) view.findViewById(2131362577);
        this.q = (Button) view.findViewById(2131362576);
        this.f3670s = (Button) view.findViewById(2131362581);
        this.f3671t = (Button) view.findViewById(2131362582);
        this.f3676y = (Button) view.findViewById(2131362579);
        this.f3667o = (ViewGroup) view.findViewById(2131362047);
        Button button = (Button) view.findViewById(2131362586);
        this.f3677z = (Button) view.findViewById(2131361992);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(2131361982);
        this.f3673v = (TextView) view.findViewById(2131362562);
        TextView textView = (TextView) view.findViewById(2131362568);
        TextView textView2 = (TextView) view.findViewById(2131362571);
        this.f3674w = (TextView) view.findViewById(2131362564);
        TextView textView3 = (TextView) view.findViewById(2131362567);
        ImageButton imageButton = (ImageButton) view.findViewById(2131361931);
        imageButton.setOnClickListener(new i2.b0(3, this, imageButton));
        this.B = this.f3669r.getBackground().mutate();
        this.A = this.f3668p.getBackground().mutate();
        this.f3676y.getBackground().mutate();
        this.C = this.f3677z.getBackground().mutate();
        i2.l l5 = i2.l.l(this.f3660b);
        this.D = l5;
        l5.c(this.f3659a, this.f3662d, false);
        this.H = o0.c(this.f3660b);
        getString(2131951701);
        this.E = getString(2131952448);
        getString(2131952208);
        getString(2131952210);
        getString(2131951718);
        this.F = getString(2131951719);
        this.G = getString(2131952207);
        getString(2131952257);
        getString(2131952256);
        this.I = e0.c.getColor(this.f3660b, 2131099794);
        this.J = e0.c.getColor(this.f3660b, 2131100822);
        this.K = e0.c.getColor(this.f3660b, 2131100713);
        this.L = e0.c.getColor(this.f3660b, 2131099803);
        this.O = e0.c.getColor(this.f3660b, 2131100791);
        this.P = e0.c.getColor(this.f3660b, 2131100714);
        this.Q = e0.c.getColor(this.f3660b, 2131099804);
        this.R = e0.c.getColor(this.f3660b, 2131100792);
        this.M = e0.c.getColor(this.f3660b, 2131100730);
        this.N = e0.c.getColor(this.f3660b, 2131100732);
        this.f3669r.setOnClickListener(new View.OnClickListener(this) { // from class: l2.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                i2.y.b(view2);
            }
        });
        this.f3668p.setOnClickListener(new View.OnClickListener(this) { // from class: l2.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                i2.y.b(view2);
            }
        });
        ((MainActivity) requireActivity()).initializeBilling(view);
    }
}
