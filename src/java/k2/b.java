package k2;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputLayout;
import d1.h;
import i2.l;
import i2.y;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import l2.a0;
import l2.x;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3357a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3358b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3359c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f3360d;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i) {
        this.f3357a = i;
        this.f3359c = obj;
        this.f3358b = obj2;
        this.f3360d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3357a) {
            case 0:
                ((SharedPreferences) this.f3359c).edit().putBoolean(((Context) this.f3358b).getString(2131951777), true).apply();
                ((Dialog) this.f3360d).dismiss();
                return;
            case 1:
                final a0 a0Var = (a0) this.f3359c;
                final MaterialSwitch materialSwitch = (MaterialSwitch) this.f3360d;
                final Context context = (Context) this.f3358b;
                a0Var.t(materialSwitch);
                if (a0Var.M2) {
                    return;
                }
                String str = "";
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 2132017452);
                final Dialog dialog = new Dialog(contextThemeWrapper);
                LayoutInflater from = LayoutInflater.from(contextThemeWrapper);
                Window window = dialog.getWindow();
                Objects.requireNonNull(window);
                final View inflate = from.inflate(2131558451, (ViewGroup) window.getDecorView(), false);
                dialog.setContentView(inflate);
                Window window2 = dialog.getWindow();
                Objects.requireNonNull(window2);
                window2.setBackgroundDrawable(new ColorDrawable(0));
                int i = a0Var.f3607t1 ? 2131099684 : 2131099685;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(e0.c.getColor(context, i));
                gradientDrawable.setCornerRadius(TypedValue.applyDimension(1, 28.0f, context.getResources().getDisplayMetrics()));
                inflate.setBackground(gradientDrawable);
                final RadioButton radioButton = (RadioButton) inflate.findViewById(2131361932);
                final RadioButton radioButton2 = (RadioButton) inflate.findViewById(2131361933);
                MaterialButton findViewById = inflate.findViewById(2131362168);
                MaterialButton findViewById2 = inflate.findViewById(2131362167);
                final ViewGroup viewGroup = (ViewGroup) inflate.findViewById(2131362179);
                a0Var.O1 = inflate.findViewById(2131362145);
                a0Var.P1 = inflate.findViewById(2131362146);
                a0Var.Q1 = inflate.findViewById(2131362147);
                a0Var.R1 = (EditText) inflate.findViewById(2131362123);
                a0Var.S1 = (EditText) inflate.findViewById(2131362124);
                a0Var.T1 = (EditText) inflate.findViewById(2131362125);
                a0Var.U1 = (ImageView) inflate.findViewById(2131362020);
                try {
                    str = a0Var.f3613v.getString(a0Var.getString(2131951920), "");
                } catch (ClassCastException unused) {
                    a0Var.f3613v.edit().remove("lastLocation").apply();
                }
                if (!str.isEmpty()) {
                    a0Var.R1.setText(str);
                }
                String string = a0Var.f3613v.getString(a0Var.E1, null);
                String string2 = a0Var.f3613v.getString(a0Var.F1, null);
                double parseDouble = string != null ? Double.parseDouble(string) : 999.0d;
                double parseDouble2 = string2 != null ? Double.parseDouble(string2) : 999.0d;
                if (parseDouble != 999.0d) {
                    a0Var.S1.setText(String.valueOf(parseDouble));
                }
                if (parseDouble2 != 999.0d) {
                    a0Var.T1.setText(String.valueOf(parseDouble2));
                }
                EditText editText = a0Var.R1;
                editText.addTextChangedListener(new x(a0Var, editText));
                EditText editText2 = a0Var.S1;
                editText2.addTextChangedListener(new x(a0Var, editText2));
                EditText editText3 = a0Var.T1;
                editText3.addTextChangedListener(new x(a0Var, editText3));
                a0Var.l(a0Var.R1);
                a0Var.l(a0Var.S1);
                a0Var.l(a0Var.T1);
                int i9 = a0Var.f3607t1 ? a0Var.S : a0Var.T;
                a0Var.f3620x.c(a0Var.Y1, (ViewGroup) inflate, false);
                ImageView imageView = a0Var.U1;
                Drawable drawable = imageView.getDrawable();
                if (drawable == null) {
                    Drawable mutate = drawable.mutate();
                    mutate.setTint(i9);
                    imageView.setImageDrawable(mutate);
                }
                int d9 = l.d(i9, a0Var.f3613v.getInt(a0Var.f3542a1, -1), l.n(i9) ? 0.8f : 0.4f);
                ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{16842912}, new int[]{-16842912}}, new int[]{d9, i9});
                findViewById.setTextColor(d9);
                findViewById2.setTextColor(d9);
                radioButton.setButtonTintList(colorStateList);
                radioButton2.setButtonTintList(colorStateList);
                TextInputLayout textInputLayout = a0Var.O1;
                textInputLayout.setBoxStrokeColor(d9);
                textInputLayout.setDefaultHintTextColor(ColorStateList.valueOf(i9));
                TextInputLayout textInputLayout2 = a0Var.P1;
                textInputLayout2.setBoxStrokeColor(d9);
                textInputLayout2.setDefaultHintTextColor(ColorStateList.valueOf(i9));
                TextInputLayout textInputLayout3 = a0Var.Q1;
                textInputLayout3.setBoxStrokeColor(d9);
                textInputLayout3.setDefaultHintTextColor(ColorStateList.valueOf(i9));
                dialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l2.m
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        a0 a0Var2 = a0.this;
                        if (a0Var2.R1.getText().toString().isEmpty() || (a0Var2.S1.getText().toString().isEmpty() && a0Var2.T1.getText().toString().isEmpty())) {
                            a0Var2.t(materialSwitch);
                        }
                    }
                });
                radioButton.setOnClickListener(new View.OnClickListener() { // from class: l2.n
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                ViewGroup viewGroup2 = viewGroup;
                                if (viewGroup2.getVisibility() == 0) {
                                    i2.y.i(viewGroup2, 100);
                                    return;
                                }
                                return;
                            default:
                                ViewGroup viewGroup3 = viewGroup;
                                if (viewGroup3.getVisibility() == 8) {
                                    i2.y.i(viewGroup3, 200);
                                    return;
                                }
                                return;
                        }
                    }
                });
                findViewById2.setOnClickListener(new b(a0Var, (KeyEvent.Callback) dialog, (Object) materialSwitch, 3));
                radioButton2.setOnClickListener(new View.OnClickListener() { // from class: l2.n
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                ViewGroup viewGroup2 = viewGroup;
                                if (viewGroup2.getVisibility() == 0) {
                                    i2.y.i(viewGroup2, 100);
                                    return;
                                }
                                return;
                            default:
                                ViewGroup viewGroup3 = viewGroup;
                                if (viewGroup3.getVisibility() == 8) {
                                    i2.y.i(viewGroup3, 200);
                                    return;
                                }
                                return;
                        }
                    }
                });
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: l2.o
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        a0 a0Var2 = a0.this;
                        a0Var2.getClass();
                        Context context2 = context;
                        InputMethodManager inputMethodManager = (InputMethodManager) context2.getSystemService("input_method");
                        if (inputMethodManager != null) {
                            inputMethodManager.hideSoftInputFromWindow(inflate.getWindowToken(), 0);
                        }
                        boolean isChecked = radioButton.isChecked();
                        Dialog dialog2 = dialog;
                        if (isChecked) {
                            if (a0Var2.M2) {
                                a0Var2.f3613v.edit().putBoolean(a0Var2.I0, false).apply();
                            } else if (a0Var2.L2) {
                                a0Var2.f3566h1 = a0Var2.f3613v.getFloat(a0Var2.f3622x1, 6.0f);
                                a0Var2.f3569i1 = a0Var2.f3613v.getFloat(a0Var2.f3626y1, 18.0f);
                                a0Var2.f3613v.edit().putFloat(a0Var2.f3629z1, a0Var2.f3566h1).apply();
                                a0Var2.f3613v.edit().putFloat(a0Var2.A1, a0Var2.f3569i1).apply();
                                if (e0.c.checkSelfPermission(a0Var2.Y1, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                                    a0Var2.f3615v1.a(true);
                                } else {
                                    a0Var2.N2.a("android.permission.ACCESS_COARSE_LOCATION");
                                }
                            } else {
                                a0Var2.u();
                                a0Var2.k();
                                Toast.makeText(a0Var2.f3540a, 2131952456, 0).show();
                            }
                            a0Var2.f3613v.edit().putBoolean(a0Var2.G1, false).apply();
                            dialog2.dismiss();
                        } else if (radioButton2.isChecked()) {
                            String trim = a0Var2.R1.getText().toString().trim();
                            String obj = a0Var2.S1.getText().toString();
                            String obj2 = a0Var2.T1.getText().toString();
                            try {
                                double parseDouble3 = !obj.isEmpty() ? Double.parseDouble(obj) : 999.0d;
                                double parseDouble4 = obj2.isEmpty() ? 999.0d : Double.parseDouble(obj2);
                                boolean z9 = parseDouble3 >= -90.0d && parseDouble3 <= 90.0d && parseDouble4 >= -180.0d && parseDouble4 <= 180.0d;
                                boolean isEmpty = trim.isEmpty();
                                if (z9) {
                                    a0Var2.f3613v.edit().putBoolean(a0Var2.G1, false).apply();
                                    a0Var2.f3613v.edit().putBoolean(a0Var2.G1, false).apply();
                                    a0Var2.f3611u1.c(parseDouble3, parseDouble4, false, new i2.m((Object) a0Var2, false));
                                    dialog2.dismiss();
                                } else if (isEmpty) {
                                    Toast.makeText(context2, 2131952469, 1).show();
                                    a0Var2.f3613v.edit().putBoolean(a0Var2.G1, false).apply();
                                } else {
                                    a0Var2.f3613v.edit().putBoolean(a0Var2.G1, true).apply();
                                    j2.j jVar = a0Var2.f3611u1;
                                    k2.c cVar = new k2.c(a0Var2, trim, 28, false);
                                    if (!jVar.a(false)) {
                                        jVar.b(trim, cVar);
                                    }
                                    dialog2.dismiss();
                                }
                            } catch (NumberFormatException unused2) {
                                Toast.makeText(context2, 2131952469, 1).show();
                            }
                        }
                    }
                });
                dialog.show();
                int applyDimension = (int) TypedValue.applyDimension(1, 24.0f, context.getResources().getDisplayMetrics());
                Window window3 = dialog.getWindow();
                if (window3 != null) {
                    window3.setBackgroundDrawable(new InsetDrawable((Drawable) new ColorDrawable(0), applyDimension));
                    return;
                }
                return;
            case 2:
                a0 a0Var2 = (a0) this.f3359c;
                View view2 = (View) this.f3358b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f3360d;
                a0Var2.getClass();
                y.b(view2);
                view2.setSelected(!view2.isSelected());
                atomicBoolean.set(a0Var2.f3613v.getBoolean(a0Var2.G0, false));
                boolean z9 = atomicBoolean.get();
                a0Var2.f3613v.edit().putBoolean(a0Var2.G0, !z9).apply();
                int a10 = (int) (m2.a.a() / 0.016666668f);
                if (!z9) {
                    a0Var2.f3613v.edit().putBoolean(a0Var2.K0, false).apply();
                    a0Var2.E.setSelected(false);
                    y.a(a0Var2.H, null, a10, 1000);
                    a0Var2.G2 = 0L;
                }
                a0Var2.A();
                a0Var2.J(z9);
                a0Var2.s();
                a0Var2.B2.f();
                a0Var2.w();
                return;
            case h.INTEGER_FIELD_NUMBER /* 3 */:
                a0 a0Var3 = (a0) this.f3359c;
                a0Var3.getClass();
                ((Dialog) this.f3360d).dismiss();
                a0Var3.t((MaterialSwitch) this.f3358b);
                return;
            default:
                ((a0) this.f3359c).f3613v.edit().putBoolean((String) this.f3358b, ((CheckBox) this.f3360d).isChecked()).apply();
                return;
        }
    }

    public /* synthetic */ b(a0 a0Var, KeyEvent.Callback callback, Object obj, int i) {
        this.f3357a = i;
        this.f3359c = a0Var;
        this.f3360d = callback;
        this.f3358b = obj;
    }
}
