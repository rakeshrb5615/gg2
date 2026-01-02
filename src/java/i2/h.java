package i2;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Scanner;
import q0.t1;
import q0.u1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public class h extends h3.j implements View.OnClickListener {
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public float J = 6.0f;
    public float K = 18.0f;
    public int L;
    public int M;
    public int N;
    public SharedPreferences O;

    /* renamed from: a  reason: collision with root package name */
    public Context f2341a;

    /* renamed from: b  reason: collision with root package name */
    public l f2342b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f2343c;

    /* renamed from: d  reason: collision with root package name */
    public LinearLayout f2344d;

    /* renamed from: e  reason: collision with root package name */
    public LinearLayout f2345e;

    /* renamed from: f  reason: collision with root package name */
    public LinearLayout f2346f;

    /* renamed from: m  reason: collision with root package name */
    public LinearLayout f2347m;

    /* renamed from: n  reason: collision with root package name */
    public ScrollView f2348n;

    /* renamed from: o  reason: collision with root package name */
    public TextView f2349o;

    /* renamed from: p  reason: collision with root package name */
    public TextView f2350p;
    public TextView q;

    /* renamed from: r  reason: collision with root package name */
    public TextView f2351r;

    /* renamed from: s  reason: collision with root package name */
    public TextView f2352s;

    /* renamed from: t  reason: collision with root package name */
    public TextView f2353t;

    /* renamed from: u  reason: collision with root package name */
    public TextView f2354u;

    /* renamed from: v  reason: collision with root package name */
    public String f2355v;

    /* renamed from: w  reason: collision with root package name */
    public String f2356w;

    /* renamed from: x  reason: collision with root package name */
    public String f2357x;

    /* renamed from: y  reason: collision with root package name */
    public String f2358y;

    /* renamed from: z  reason: collision with root package name */
    public String f2359z;

    public final int getTheme() {
        return 2132017788;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != this.f2344d) {
            if (view == this.f2345e) {
                c4.b.K(requireActivity(), view.getContext());
                return;
            } else if (view == this.f2346f) {
                c4.b.F(this.f2341a);
                return;
            } else if (view == this.f2347m) {
                c4.b.b0(getActivity(), this.f2341a);
                return;
            } else {
                return;
            }
        }
        String string = getString(2131951821);
        String string2 = getString(2131952377);
        String string3 = getString(2131951824);
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", new String[]{string});
        intent.putExtra("android.intent.extra.SUBJECT", string2);
        intent.putExtra("android.intent.extra.TEXT", string3);
        Intent createChooser = Intent.createChooser(intent, "Say Hello! 👋");
        if (intent.resolveActivity(requireActivity().getPackageManager()) != null) {
            startActivity(createChooser);
        } else {
            Toast.makeText(getContext(), "No email app installed.", 0).show();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(requireArguments().getInt("arg_layout"), viewGroup, false);
    }

    public final void onStart() {
        Window window;
        View findViewById;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (findViewById = dialog.findViewById(2131362011)) != null) {
            findViewById.post(new a5.i(8, this, findViewById));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || getArguments() == null) {
            return;
        }
        this.N = window.getNavigationBarColor();
        int i = getArguments().getInt("arg_background_color");
        window.setNavigationBarColor(i);
        v3.f fVar = new v3.f(window.getDecorView());
        int i9 = Build.VERSION.SDK_INT;
        a.a u1Var = i9 >= 35 ? new u1(window, fVar) : i9 >= 30 ? new u1(window, fVar) : new t1(window, fVar);
        boolean z9 = !l.n(i);
        u1Var.P(z9);
        window.setStatusBarColor(0);
        u1Var.Q(z9);
    }

    public final void onStop() {
        Window window;
        super.onStop();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setNavigationBarColor(this.N);
        v3.f fVar = new v3.f(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        (i >= 35 ? new u1(window, fVar) : i >= 30 ? new u1(window, fVar) : new t1(window, fVar)).P(!l.n(this.N));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String sb;
        String sb2;
        super/*androidx.fragment.app.e0*/.onViewCreated(view, bundle);
        Context applicationContext = requireContext().getApplicationContext();
        this.f2341a = applicationContext;
        this.O = j5.t1.z(applicationContext);
        this.f2355v = getString(2131952397);
        this.f2356w = getString(2131952398);
        this.f2357x = getString(2131952190);
        this.f2358y = getString(2131952192);
        this.B = getString(2131952111);
        this.f2359z = getResources().getString(2131952369);
        this.A = getResources().getString(2131952375);
        this.C = getString(2131952113);
        this.D = getResources().getString(2131951963);
        this.E = getResources().getString(2131951932);
        this.G = getResources().getString(2131952493);
        this.F = getResources().getString(2131951928);
        getResources().getString(2131951931);
        getString(2131951796);
        getResources().getString(2131951809);
        this.H = getString(2131952366);
        this.I = getString(2131952372);
        this.f2342b = l.l(requireContext());
        LinearLayout linearLayout = (LinearLayout) view.findViewById(requireArguments().getInt("arg_layout2"));
        this.f2343c = (TextView) view.findViewById(2131362520);
        TextView textView = (TextView) view.findViewById(2131361988);
        this.L = e0.c.getColor(this.f2341a, 2131099794);
        this.M = e0.c.getColor(this.f2341a, 2131100822);
        int i = 2;
        if (getArguments() != null) {
            int i9 = getArguments().getInt("arg_file_res_id");
            this.f2343c.setText(getString(getArguments().getInt("arg_title_res_id")));
            if (i9 != 0) {
                try {
                    String next = new Scanner(getResources().openRawResource(i9)).useDelimiter("\\A").next();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    String[] split = next.split("\\r?\\n");
                    int length = split.length;
                    int i10 = 0;
                    while (i10 < length) {
                        String str = split[i10];
                        int length2 = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) str);
                        int length3 = spannableStringBuilder.length();
                        if (str.startsWith("##")) {
                            int i11 = length2 + 2;
                            if (str.length() > i && str.charAt(i) == ' ') {
                                i11 = length2 + 3;
                            }
                            spannableStringBuilder.delete(length2, i11);
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.5f), length2, length3 - (i11 - length2), 33);
                        } else if (str.startsWith("#")) {
                            int i12 = length2 + 1;
                            if (str.length() > 1 && str.charAt(1) == ' ') {
                                i12 = length2 + 2;
                            }
                            spannableStringBuilder.delete(length2, i12);
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.25f), length2, length3 - (i12 - length2), 33);
                        }
                        spannableStringBuilder.append((CharSequence) "\n");
                        i10++;
                        i = 2;
                    }
                    textView.setText(spannableStringBuilder);
                } catch (Exception e9) {
                    e9.printStackTrace();
                    textView.setText("Error loading changelog.");
                }
            }
        }
        if (requireArguments().getInt("arg_layout3") == 1) {
            ScrollView scrollView = (ScrollView) view.findViewById(2131362400);
            this.f2348n = scrollView;
            scrollView.setVisibility(0);
            view.findViewById(2131361988).setVisibility(8);
            this.f2342b.r(this.f2348n, this.f2342b.o() ? this.L : this.M);
        } else if (requireArguments().getInt("arg_layout3") == 2) {
            final ViewGroup viewGroup = (ViewGroup) view.findViewById(2131362532);
            viewGroup.setVisibility(0);
            view.findViewById(2131361988).setVisibility(8);
            float f9 = this.O.getFloat(this.f2355v, 11.0f);
            float f10 = this.O.getFloat(this.f2356w, 23.0f);
            String str2 = this.B;
            if (f9 < 0.0f) {
                StringBuilder b10 = u.e.b(str2);
                b10.append(this.f2357x);
                sb = b10.toString();
            } else {
                StringBuilder b11 = u.e.b(str2);
                b11.append(m2.a.b(f9));
                sb = b11.toString();
            }
            String str3 = this.C;
            if (f10 < 0.0f) {
                StringBuilder b12 = u.e.b(str3);
                b12.append(this.f2358y);
                sb2 = b12.toString();
            } else {
                StringBuilder b13 = u.e.b(str3);
                b13.append(m2.a.b(f10));
                sb2 = b13.toString();
            }
            this.J = this.O.getFloat(this.H, 6.0f);
            this.K = this.O.getFloat(this.I, 18.0f);
            String str4 = this.f2359z + m2.a.b(this.J);
            String str5 = this.A + m2.a.b(this.K);
            StringBuilder b14 = u.e.b(v1.a.n(new StringBuilder(), this.D, " "));
            SharedPreferences sharedPreferences = this.O;
            String str6 = this.F;
            try {
                str6 = sharedPreferences.getString("lastLocation", str6);
            } catch (ClassCastException unused) {
                sharedPreferences.edit().remove("lastLocation").apply();
            }
            b14.append(str6);
            String sb3 = b14.toString();
            SharedPreferences sharedPreferences2 = this.O;
            String str7 = this.G;
            String str8 = this.E;
            try {
                str8 = sharedPreferences2.getString(str7, str8);
            } catch (ClassCastException unused2) {
                sharedPreferences2.edit().remove(str7).apply();
            }
            SharedPreferences sharedPreferences3 = this.O;
            String str9 = this.E;
            try {
                str9 = sharedPreferences3.getString("lastProviderUpdate", str9);
            } catch (ClassCastException unused3) {
                sharedPreferences3.edit().remove("lastProviderUpdate").apply();
            }
            this.f2350p = (TextView) viewGroup.findViewById(2131362467);
            this.f2349o = (TextView) viewGroup.findViewById(2131362465);
            this.q = (TextView) viewGroup.findViewById(2131362218);
            this.f2351r = (TextView) viewGroup.findViewById(2131362219);
            this.f2352s = (TextView) viewGroup.findViewById(2131362166);
            this.f2353t = (TextView) viewGroup.findViewById(2131362142);
            this.f2354u = (TextView) viewGroup.findViewById(2131362141);
            this.f2349o.setText(str4);
            this.f2350p.setText(str5);
            this.q.setText(sb);
            this.f2351r.setText(sb2);
            this.f2352s.setText(sb3);
            this.f2353t.setText(str8);
            this.f2354u.setText(str9);
            viewGroup.post(new Runnable(this) { // from class: i2.g

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ h f2339b;

                {
                    this.f2339b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (r3) {
                        case 0:
                            this.f2339b.f2342b.r(viewGroup, 0);
                            return;
                        default:
                            this.f2339b.f2342b.r(viewGroup, 0);
                            return;
                    }
                }
            });
        } else if (requireArguments().getInt("arg_layout3") == 3) {
            final ViewGroup viewGroup2 = (ViewGroup) view.findViewById(2131362535);
            viewGroup2.setVisibility(0);
            view.findViewById(2131361988).setVisibility(8);
            viewGroup2.post(new Runnable(this) { // from class: i2.g

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ h f2339b;

                {
                    this.f2339b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (r3) {
                        case 0:
                            this.f2339b.f2342b.r(viewGroup2, 0);
                            return;
                        default:
                            this.f2339b.f2342b.r(viewGroup2, 0);
                            return;
                    }
                }
            });
        } else if (requireArguments().getInt("arg_layout3") == 4) {
            this.f2344d = (LinearLayout) view.findViewById(2131361984);
            this.f2345e = (LinearLayout) view.findViewById(2131362338);
            this.f2346f = (LinearLayout) view.findViewById(2131362306);
            this.f2347m = (LinearLayout) view.findViewById(2131362402);
            this.f2344d.setOnClickListener(this);
            this.f2345e.setOnClickListener(this);
            this.f2346f.setOnClickListener(this);
            this.f2347m.setOnClickListener(this);
            ViewGroup viewGroup3 = (ViewGroup) view.findViewById(2131361919);
            viewGroup3.setVisibility(0);
            view.findViewById(2131361988).setVisibility(8);
            viewGroup3.post(new c.l(this, viewGroup3, this.f2342b.o() ? this.L : this.M));
        }
        view.findViewById(2131361961).setBackgroundColor(this.f2342b.o() ? this.L : this.M);
        this.f2342b.q(requireActivity(), linearLayout);
    }
}
