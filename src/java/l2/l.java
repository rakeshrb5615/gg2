package l2;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.b1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3706a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a0 f3707b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3708c;

    public /* synthetic */ l(a0 a0Var, View view, int i) {
        this.f3706a = i;
        this.f3707b = a0Var;
        this.f3708c = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NetworkInfo activeNetworkInfo;
        String str;
        switch (this.f3706a) {
            case 0:
                a0 a0Var = this.f3707b;
                a0Var.f();
                a0Var.f3613v.getInt(a0Var.J0, 240);
                i2.q qVar = a0Var.f3615v1;
                Context context = a0Var.f3540a;
                qVar.getClass();
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()) {
                    a0Var.k();
                    Toast.makeText(a0Var.f3540a, 2131952456, 0).show();
                    return;
                }
                if (a0Var.f3572j1 || a0Var.f3575k1 || a0Var.f3577l1 || a0Var.f3581m1 || a0Var.n1) {
                    int b10 = a0Var.Z.b();
                    if ((!c4.b.H(b10) && !c4.b.I(b10) && !c4.b.J(b10)) || !a0Var.f3613v.getBoolean(a0Var.H0, false)) {
                        a0Var.k();
                        a0Var.H();
                        return;
                    }
                    boolean z9 = a0Var.f3613v.getBoolean(a0Var.I0, false);
                    a0Var.f3613v.edit().putBoolean(a0Var.I0, !z9).apply();
                    View view2 = this.f3708c;
                    if (z9) {
                        view2.setSelected(false);
                        a0Var.k();
                    } else {
                        view2.setSelected(true);
                    }
                } else {
                    a0Var.k();
                    Toast.makeText(a0Var.f3540a, 2131952206, 0).show();
                }
                String string = a0Var.f3613v.getString(a0Var.E1, null);
                String string2 = a0Var.f3613v.getString(a0Var.F1, null);
                double parseDouble = string != null ? Double.parseDouble(string) : 999.0d;
                double parseDouble2 = string2 != null ? Double.parseDouble(string2) : 999.0d;
                boolean z10 = a0Var.f3613v.getBoolean(a0Var.I0, false);
                boolean z11 = a0Var.f3613v.getBoolean(a0Var.H0, false);
                if (z10 && z11) {
                    String string3 = a0Var.f3613v.getString(a0Var.f3584n0, a0Var.getString(2131951825));
                    int i = (a0Var.f3575k1 || a0Var.n1) ? 1 : 10;
                    a0Var.f3618w1.getClass();
                    boolean f9 = m2.a.f(i, string3);
                    boolean z12 = string3.equals("failed") || !(parseDouble == 999.0d || parseDouble2 == 999.0d);
                    if (f9 && z12) {
                        a0Var.f3611u1.c(parseDouble, parseDouble2, true, new i2.m((Object) a0Var, true));
                    } else {
                        StringBuilder b11 = u.e.b(v1.a.n(new StringBuilder(), a0Var.L0, " "));
                        if (i == 1) {
                            str = "";
                        } else {
                            str = i + a0Var.M0;
                        }
                        b11.append(str);
                        Toast.makeText(a0Var.f3540a, b11.toString(), 0).show();
                        String string4 = a0Var.f3613v.getString(a0Var.R0, null);
                        SharedPreferences.Editor edit = a0Var.f3613v.edit();
                        edit.putString(a0Var.f3574k0, string4);
                        edit.apply();
                    }
                } else if (!z11) {
                    a0Var.k();
                    a0Var.H();
                }
                a0Var.w();
                a0Var.B2.f();
                a0Var.D2.f();
                return;
            default:
                View view3 = this.f3708c;
                i2.y.b(view3);
                if (view3.isSelected()) {
                    return;
                }
                int id = view3.getId();
                a0 a0Var2 = this.f3707b;
                String str2 = id == 2131362523 ? a0Var2.f3554d2 : view3.getId() == 2131362533 ? a0Var2.f3543a2 : view3.getId() == 2131362536 ? a0Var2.f3550c2 : view3.getId() == 2131362534 ? a0Var2.f3546b2 : view3.getId() == 2131362543 ? a0Var2.f3558e2 : null;
                if (str2 == null) {
                    return;
                }
                a0Var2.A.setSelected(false);
                a0Var2.B.setSelected(false);
                a0Var2.C.setSelected(false);
                a0Var2.f3628z.setSelected(false);
                a0Var2.D.setSelected(false);
                view3.setSelected(true);
                b1 childFragmentManager = a0Var2.getChildFragmentManager();
                androidx.fragment.app.e0 B = childFragmentManager.B(str2);
                a0Var2.K2 = B;
                if (B != null) {
                    androidx.fragment.app.e0 e0Var = (androidx.fragment.app.e0) childFragmentManager.c.f().stream().filter(new Object()).findFirst().orElse(null);
                    View view4 = e0Var != null ? e0Var.getView() : null;
                    View view5 = B.getView();
                    if (e0Var != null) {
                        i2.y.g(a0Var2.f3551d, 200);
                    }
                    i2.e eVar = new i2.e(a0Var2, childFragmentManager, e0Var, B, 3);
                    long j = 400;
                    if (view5 != null) {
                        view5.setAlpha(0.0f);
                        if (view4 != null) {
                            view4.animate().alpha(0.0f).setDuration(j / 2).withEndAction(new g5.r(eVar, view5, j)).start();
                        } else {
                            eVar.run();
                            view5.animate().alpha(1.0f).setDuration(j).start();
                        }
                    }
                }
                a0Var2.r();
                return;
        }
    }
}
