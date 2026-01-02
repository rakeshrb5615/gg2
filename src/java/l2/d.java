package l2;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.chilllive.chillwallpaperproject.MainActivity;
import i2.k0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3657a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a0 f3658b;

    public /* synthetic */ d(a0 a0Var, int i) {
        this.f3657a = i;
        this.f3658b = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3657a) {
            case 0:
                a0 a0Var = this.f3658b;
                i2.y.b(a0Var.f3624y);
                ViewGroup viewGroup = a0Var.f3547c;
                int i = a0Var.V1 ? 400 : 200;
                i2.y.h(viewGroup, i, 8);
                i2.y.h(a0Var.f3586o, i, 4);
                i2.y.h(a0Var.f3628z, i, 4);
                i2.y.h(a0Var.B, i, 4);
                i2.y.h(a0Var.A, i, 4);
                i2.y.h(a0Var.C, i, 4);
                i2.y.h(a0Var.f3559f, i, 4);
                boolean z9 = !a0Var.V1;
                a0Var.V1 = z9;
                a0Var.f3624y.setSelected(z9);
                i2.n nVar = a0Var.f3544b;
                if (nVar != null) {
                    ((MainActivity) nVar).X = a0Var.V1;
                    return;
                }
                return;
            case 1:
                a0 a0Var2 = this.f3658b;
                i2.y.b(a0Var2.E);
                boolean z10 = a0Var2.f3613v.getBoolean(a0Var2.K0, false);
                boolean z11 = !z10;
                a0Var2.f3613v.edit().putBoolean(a0Var2.K0, z11).apply();
                a0Var2.E.setSelected(z11);
                if (z10) {
                    a0Var2.f3613v.edit().putBoolean(a0Var2.C1, false).apply();
                    return;
                }
                a0Var2.f3613v.edit().putBoolean(a0Var2.G0, false).apply();
                i2.y.a(a0Var2.H, null, k0.f2392a.nextInt(1440), 1000);
                return;
            case 2:
                a0 a0Var3 = this.f3658b;
                a0Var3.getClass();
                i2.y.b(view);
                view.setSelected(true);
                View view2 = a0Var3.f3596q2;
                if (view == view2) {
                    a0Var3.f3600r2.setSelected(false);
                } else {
                    view2.setSelected(false);
                }
                boolean z12 = view == a0Var3.f3596q2;
                if (!z12 && (!a0Var3.f3575k1 || !a0Var3.f3572j1)) {
                    a0Var3.I();
                }
                a0Var3.f3613v.edit().putInt(a0Var3.z0, 100).apply();
                a0Var3.f3613v.edit().putInt(a0Var3.z0, 0).apply();
                a0Var3.f3613v.edit().putBoolean(a0Var3.getString(2131951838), z12).apply();
                a0Var3.Z1.P1 = z12;
                a0Var3.f3613v.edit().putString(a0Var3.A0, String.valueOf(k0.f2392a.nextInt(900000))).apply();
                return;
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                a0 a0Var4 = this.f3658b;
                i2.y.b(a0Var4.F);
                i2.y.a(a0Var4.H, null, Math.round(a0Var4.f3566h1 / 0.016666668f), 1000);
                return;
            case 4:
                a0 a0Var5 = this.f3658b;
                i2.y.b(a0Var5.G);
                i2.y.a(a0Var5.H, null, Math.round(a0Var5.f3569i1 / 0.016666668f), 1000);
                return;
            default:
                a0 a0Var6 = this.f3658b;
                i2.y.b(a0Var6.A2);
                Context context = a0Var6.f3540a;
                boolean z13 = a0Var6.f3607t1;
                String string = a0Var6.getString(2131952242);
                View inflate = LayoutInflater.from(context).inflate(2131558553, (ViewGroup) null);
                PopupWindow popupWindow = new PopupWindow(inflate, -2, -2, true);
                popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                popupWindow.setOutsideTouchable(true);
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                popupWindow.setAnimationStyle(2132018017);
                popupWindow.showAtLocation(view, 0, ((view.getWidth() / 2) + iArr[0]) - (inflate.getMeasuredWidth() / 2), view.getHeight() + iArr[1]);
                popupWindow.showAtLocation(view, 0, ((view.getWidth() / 2) + iArr[0]) - (inflate.getMeasuredWidth() / 2), view.getHeight() + iArr[1]);
                int i9 = z13 ? 2131099684 : 2131099685;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(e0.c.getColor(context, i9));
                gradientDrawable.setCornerRadius(TypedValue.applyDimension(1, 28.0f, context.getResources().getDisplayMetrics()));
                inflate.setBackground(gradientDrawable);
                TextView textView = (TextView) inflate.findViewById(2131362537);
                textView.setText(string);
                int color = e0.c.getColor(context, 2131100821);
                int color2 = e0.c.getColor(context, 2131100822);
                if (!z13) {
                    color = color2;
                }
                textView.setTextColor(color);
                return;
        }
    }
}
