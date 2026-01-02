package com.chilllive.chillwallpaperproject;

import a5.t;
import android.app.Application;
import android.app.Dialog;
import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Insets;
import android.graphics.Point;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.TypedValue;
import android.view.Choreographer;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.b1;
import androidx.fragment.app.t0;
import androidx.fragment.app.x0;
import androidx.lifecycle.g0;
import b2.a;
import c4.c;
import c4.e;
import c4.g;
import com.chilllive.chillwallpaperproject.MainActivity;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.radiobutton.MaterialRadioButton;
import d4.r;
import h.h;
import h.i;
import i2.b0;
import i2.c0;
import i2.e0;
import i2.f;
import i2.h0;
import i2.i0;
import i2.j0;
import i2.l;
import i2.n;
import i2.p0;
import i2.v;
import i2.v0;
import i2.y;
import i2.z;
import j5.t1;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import l2.a0;
import l2.d0;
import m3.d;
import q4.b;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public class MainActivity extends i implements SharedPreferences.OnSharedPreferenceChangeListener, n {

    /* renamed from: u0  reason: collision with root package name */
    public static final /* synthetic */ int f958u0 = 0;
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public String J;
    public String K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public l R;
    public SharedPreferences S;
    public v0 T;
    public SensorManager U;
    public Sensor V;
    public boolean W;
    public boolean X;
    public int[] Y;
    public int Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f959a0;

    /* renamed from: b  reason: collision with root package name */
    public Context f960b;

    /* renamed from: b0  reason: collision with root package name */
    public e f961b0;

    /* renamed from: c  reason: collision with root package name */
    public float f962c;

    /* renamed from: c0  reason: collision with root package name */
    public f f963c0;

    /* renamed from: d  reason: collision with root package name */
    public float f964d;

    /* renamed from: d0  reason: collision with root package name */
    public final i0 f965d0;

    /* renamed from: e  reason: collision with root package name */
    public ViewGroup f966e;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f967e0;

    /* renamed from: f  reason: collision with root package name */
    public FrameLayout f968f;
    public ImageView f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f969g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f970h0;

    /* renamed from: i0  reason: collision with root package name */
    public e0 f971i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f972j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f973k0;
    public int l0;

    /* renamed from: m  reason: collision with root package name */
    public n2.f f974m;

    /* renamed from: m0  reason: collision with root package name */
    public final j0 f975m0;

    /* renamed from: n  reason: collision with root package name */
    public GLSurfaceView f976n;

    /* renamed from: n0  reason: collision with root package name */
    public a0 f977n0;

    /* renamed from: o  reason: collision with root package name */
    public LinearLayout f978o;

    /* renamed from: o0  reason: collision with root package name */
    public d0 f979o0;

    /* renamed from: p  reason: collision with root package name */
    public LinearLayout f980p;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f981p0;
    public LinearLayout q;

    /* renamed from: q0  reason: collision with root package name */
    public ViewGroup f982q0;

    /* renamed from: r  reason: collision with root package name */
    public final Handler f983r;

    /* renamed from: r0  reason: collision with root package name */
    public int f984r0;

    /* renamed from: s  reason: collision with root package name */
    public final g0 f985s;

    /* renamed from: s0  reason: collision with root package name */
    public int f986s0;

    /* renamed from: t  reason: collision with root package name */
    public String f987t;

    /* renamed from: t0  reason: collision with root package name */
    public c0 f988t0;

    /* renamed from: u  reason: collision with root package name */
    public String f989u;

    /* renamed from: v  reason: collision with root package name */
    public String f990v;

    /* renamed from: w  reason: collision with root package name */
    public String f991w;

    /* renamed from: x  reason: collision with root package name */
    public String f992x;

    /* renamed from: y  reason: collision with root package name */
    public String f993y;

    /* renamed from: z  reason: collision with root package name */
    public String f994z;

    /* JADX WARN: Multi-variable type inference failed */
    public MainActivity() {
        getSavedStateRegistry().c("androidx:appcompat", new a(this));
        addOnContextAvailableListener(new h(this));
        this.f983r = new Handler();
        this.f985s = new g0(this, 6);
        new m2.a();
        this.X = true;
        this.f965d0 = new i0(this, 0);
        this.f972j0 = 2131886093;
        this.f975m0 = new j0(this);
    }

    public static /* synthetic */ WindowInsets i(View view, WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            return windowInsets;
        }
        Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return WindowInsets.CONSUMED;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.X) {
            this.T.r(motionEvent);
            motionEvent.getAction();
            return super/*android.app.Activity*/.dispatchTouchEvent(motionEvent);
        }
        return super/*android.app.Activity*/.dispatchTouchEvent(motionEvent);
    }

    public void initializeBilling(View view) {
        this.f963c0 = new f(this, this.f960b, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j() {
        String[] strArr = p0.f2470a;
        int i = 0;
        if (!b.l("TjDOnnINYlVAsmYolC+bV29g6SCDyb3iRtpbl3M2Y7XRggTkNcdhjKwxWbRcGKyB").equals(getApplicationContext().getPackageName())) {
            this.T.f2533b.p0(1.0f);
            this.T.f2533b.l0(false);
            System.gc();
            return;
        }
        this.Y = new int[128];
        while (true) {
            int[] iArr = this.Y;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = (int) (Math.sin(i) * 255.0d);
            i++;
        }
    }

    public final void k(String str) {
        b1 supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.e0 B = supportFragmentManager.B(str);
        if (B == null || B.isVisible()) {
            return;
        }
        androidx.fragment.app.e0 e0Var = (androidx.fragment.app.e0) supportFragmentManager.c.f().stream().filter(new Object()).findFirst().orElse(null);
        i2.e eVar = new i2.e(supportFragmentManager, e0Var, B, str, 1);
        if (e0Var != null && e0Var.getView() != null) {
            e0Var.getView().animate().alpha(0.0f).setDuration(200L).withEndAction(new androidx.fragment.app.l(this, eVar, e0Var, 3)).start();
            return;
        }
        View findViewById = findViewById(2131362494);
        findViewById.animate().alpha(0.0f).setDuration(200L).withEndAction(new v(findViewById, 2)).start();
        eVar.run();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l() {
        ViewGroup viewGroup;
        boolean o9 = this.R.o();
        this.f981p0 = o9;
        int i = o9 ? this.Z : this.f959a0;
        if (this.f982q0 == null) {
            return;
        }
        this.R.r(this.f968f, i);
        this.R.q(this, this.f968f);
        ((TextView) findViewById(2131362492)).setTextColor(i);
        ((Button) findViewById(2131361935)).setTextColor(i);
        findViewById(2131362171).setBackgroundColor(i);
        boolean n9 = l.n(i);
        Window window = getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsetsController insetsController = window.getInsetsController();
            if (insetsController != null) {
                insetsController.setSystemBarsAppearance(n9 ? 24 : 0, 24);
            }
        } else {
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            window.getDecorView().setSystemUiVisibility(n9 ? systemUiVisibility | 8208 : systemUiVisibility & (-8209));
        }
        this.f0.setColorFilter(this.f967e0 ? this.f970h0 : this.f969g0);
        d0 d0Var = this.f979o0;
        if (d0Var == null || (viewGroup = d0Var.f3662d) == null) {
            return;
        }
        this.R.r(viewGroup, i);
        this.R.q(this, viewGroup);
        a0 a0Var = this.f977n0;
        if (a0Var != null) {
            a0Var.r();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m() {
        GLSurfaceView gLSurfaceView = this.f976n;
        if (gLSurfaceView != null) {
            gLSurfaceView.onResume();
            return;
        }
        this.f974m = this.T.f2533b;
        GLSurfaceView gLSurfaceView2 = new GLSurfaceView(this.f960b);
        this.f976n = gLSurfaceView2;
        gLSurfaceView2.setEGLContextClientVersion(2);
        this.f976n.setRenderer(this.f974m);
        this.f976n.setRenderMode(0);
        this.f968f = new FrameLayout(this);
        this.f966e = (RelativeLayout) getLayoutInflater().inflate(2131558428, (ViewGroup) this.f968f, false);
        if (this.f976n.getParent() != null) {
            ((ViewGroup) this.f976n.getParent()).removeView(this.f976n);
        }
        this.f968f.addView(this.f976n, new FrameLayout.LayoutParams(-1, -1));
        if (this.f966e.getParent() != null) {
            ((ViewGroup) this.f966e.getParent()).removeView(this.f966e);
        }
        this.f968f.addView(this.f966e, new FrameLayout.LayoutParams(-1, -1));
        setContentView(this.f968f);
    }

    public final void n(int i, int i9, int i10) {
        int i11 = this.R.o() ? this.f984r0 : this.f986s0;
        i2.h hVar = new i2.h();
        Bundle bundle = new Bundle();
        bundle.putInt("arg_title_res_id", i);
        bundle.putInt("arg_file_res_id", i9);
        bundle.putInt("arg_background_color", i11);
        bundle.putInt("arg_layout", 2131558455);
        bundle.putInt("arg_layout2", 2131361920);
        bundle.putInt("arg_layout3", i10);
        hVar.setArguments(bundle);
        hVar.show(getSupportFragmentManager(), "ChangelogBottomSheetTag");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onClickLanguages(View view) {
        Dialog dialog = new Dialog(new ContextThemeWrapper((Context) this, 2132017452));
        dialog.setContentView(a.a.n(this, dialog, this, 2131558450));
        MaterialRadioButton findViewById = dialog.findViewById(2131361937);
        MaterialRadioButton findViewById2 = dialog.findViewById(2131361938);
        MaterialRadioButton findViewById3 = dialog.findViewById(2131361936);
        MaterialRadioButton findViewById4 = dialog.findViewById(2131361939);
        if (dialog.getWindow() != null) {
            int i = this.f981p0 ? this.Z : this.f959a0;
            ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{16842912}, new int[]{-16842912}}, new int[]{l.d(i, this.S.getInt(this.Q, -1), l.n(i) ? 0.8f : 0.4f), i});
            findViewById.setButtonTintList(colorStateList);
            findViewById2.setButtonTintList(colorStateList);
            findViewById3.setButtonTintList(colorStateList);
            findViewById4.setButtonTintList(colorStateList);
        }
        dialog.findViewById(2131362138).setOnClickListener(new h0(dialog, 0));
        String y9 = t1.y();
        String lowerCase = y9.toLowerCase(Locale.ROOT);
        if (lowerCase.startsWith("fr")) {
            findViewById2.setChecked(true);
        } else if (lowerCase.startsWith("ja")) {
            findViewById3.setChecked(true);
        } else if (lowerCase.contains("zh") || lowerCase.contains("tw")) {
            findViewById4.setChecked(true);
        } else {
            findViewById.setChecked(true);
        }
        final AtomicReference atomicReference = new AtomicReference(y9);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: i2.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i9 = r2;
                AtomicReference atomicReference2 = atomicReference;
                switch (i9) {
                    case 0:
                        int i10 = MainActivity.f958u0;
                        atomicReference2.set("fr");
                        return;
                    case 1:
                        int i11 = MainActivity.f958u0;
                        atomicReference2.set("ja");
                        return;
                    case 2:
                        int i12 = MainActivity.f958u0;
                        atomicReference2.set("zh");
                        return;
                    default:
                        int i13 = MainActivity.f958u0;
                        atomicReference2.set("en");
                        return;
                }
            }
        });
        findViewById2.setOnClickListener(new View.OnClickListener() { // from class: i2.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i9 = r2;
                AtomicReference atomicReference2 = atomicReference;
                switch (i9) {
                    case 0:
                        int i10 = MainActivity.f958u0;
                        atomicReference2.set("fr");
                        return;
                    case 1:
                        int i11 = MainActivity.f958u0;
                        atomicReference2.set("ja");
                        return;
                    case 2:
                        int i12 = MainActivity.f958u0;
                        atomicReference2.set("zh");
                        return;
                    default:
                        int i13 = MainActivity.f958u0;
                        atomicReference2.set("en");
                        return;
                }
            }
        });
        findViewById3.setOnClickListener(new View.OnClickListener() { // from class: i2.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i9 = r2;
                AtomicReference atomicReference2 = atomicReference;
                switch (i9) {
                    case 0:
                        int i10 = MainActivity.f958u0;
                        atomicReference2.set("fr");
                        return;
                    case 1:
                        int i11 = MainActivity.f958u0;
                        atomicReference2.set("ja");
                        return;
                    case 2:
                        int i12 = MainActivity.f958u0;
                        atomicReference2.set("zh");
                        return;
                    default:
                        int i13 = MainActivity.f958u0;
                        atomicReference2.set("en");
                        return;
                }
            }
        });
        findViewById4.setOnClickListener(new View.OnClickListener() { // from class: i2.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i9 = r2;
                AtomicReference atomicReference2 = atomicReference;
                switch (i9) {
                    case 0:
                        int i10 = MainActivity.f958u0;
                        atomicReference2.set("fr");
                        return;
                    case 1:
                        int i11 = MainActivity.f958u0;
                        atomicReference2.set("ja");
                        return;
                    case 2:
                        int i12 = MainActivity.f958u0;
                        atomicReference2.set("zh");
                        return;
                    default:
                        int i13 = MainActivity.f958u0;
                        atomicReference2.set("en");
                        return;
                }
            }
        });
        dialog.findViewById(2131362139).setOnClickListener(new b0(0, dialog, atomicReference));
        dialog.show();
    }

    public void onClickSettingsButton(View view) {
        this.X = false;
        this.f977n0.f();
        this.f977n0.r();
        k(this.L);
    }

    public void onClickStoreButton(View view) {
        this.X = false;
        d0 d0Var = this.f979o0;
        d0Var.f();
        d0Var.g();
        k(this.M);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, m3.f] */
    /* JADX WARN: Type inference failed for: r4v77, types: [java.lang.Object, i2.c0] */
    /* JADX WARN: Type inference failed for: r4v97, types: [java.lang.Object, android.view.View$OnApplyWindowInsetsListener] */
    public final void onCreate(Bundle bundle) {
        Point point;
        g gVar;
        Task task;
        super.onCreate(bundle);
        t1.R(getWindow(), false);
        setContentView(2131558428);
        Context applicationContext = getApplicationContext();
        this.f960b = applicationContext;
        ((WindowManager) applicationContext.getSystemService("window")).getDefaultDisplay().getRealSize(new Point());
        this.f962c = Math.min(point.y, point.x);
        Display defaultDisplay = ((WindowManager) this.f960b.getSystemService("window")).getDefaultDisplay();
        Point point2 = new Point();
        defaultDisplay.getRealSize(point2);
        float max = Math.max(point2.y, point2.x);
        this.f964d = max;
        float f9 = this.f962c;
        boolean z9 = getResources().getConfiguration().orientation == 1;
        this.W = z9;
        if (z9) {
            this.f962c = Math.min(f9, max);
            this.f964d = Math.max(f9, max);
        } else {
            this.f962c = Math.max(f9, max);
            this.f964d = Math.min(f9, max);
        }
        this.T = new v0(this.f960b, this.f974m, this.f962c, this.f964d, this.W);
        registerForActivityResult(new x0(4), new t(19));
        synchronized (c4.b.class) {
            try {
                if (c4.b.f899a == null) {
                    Context applicationContext2 = getApplicationContext();
                    if (applicationContext2 == null) {
                        applicationContext2 = this;
                    }
                    c4.b.f899a = new g(new c4.f(applicationContext2, 0));
                }
                gVar = c4.b.f899a;
            } catch (Throwable th) {
                throw th;
            }
        }
        e eVar = (e) gVar.f912a.zza();
        this.f961b0 = eVar;
        c4.l lVar = eVar.f908a;
        String packageName = eVar.f910c.getPackageName();
        r rVar = lVar.f923a;
        if (rVar == null) {
            d4.l lVar2 = c4.l.f921e;
            Object[] objArr = {-9};
            lVar2.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", d4.l.j(lVar2.f1097b, "onError(%d)", objArr));
            }
            task = Tasks.forException(new e4.a(-9));
        } else {
            c4.l.f921e.h("requestUpdateInfo(%s)", packageName);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            rVar.a().post(new c4.h(rVar, taskCompletionSource, taskCompletionSource, new c4.h(lVar, taskCompletionSource, packageName, taskCompletionSource), 2));
            task = taskCompletionSource.getTask();
        }
        task.addOnSuccessListener(new a5.a(this, 8));
        e0 e0Var = new e0(this);
        this.f971i0 = e0Var;
        e eVar2 = this.f961b0;
        synchronized (eVar2) {
            c cVar = eVar2.f909b;
            synchronized (cVar) {
                cVar.f901a.h("registerListener", new Object[0]);
                cVar.f904d.add(e0Var);
                cVar.a();
            }
        }
        this.f987t = getString(2131952057);
        this.f989u = getString(2131952246);
        this.f990v = getString(2131952391);
        this.f991w = getString(2131952262);
        this.f992x = this.f960b.getString(2131952214);
        this.f993y = getString(2131952361);
        this.f994z = getString(2131952103);
        this.A = getString(2131951695);
        this.B = this.f960b.getString(2131951749);
        this.C = this.f960b.getString(2131952244);
        this.K = getString(2131951815);
        getString(2131951939);
        this.E = getString(2131952326);
        this.F = getString(2131951799);
        this.G = getString(2131952322);
        this.H = getString(2131951912);
        this.I = getString(2131952478);
        this.J = getString(2131952417);
        this.D = getString(2131952500);
        this.L = getString(2131952332);
        this.M = getString(2131952352);
        this.N = getString(2131952397);
        this.O = getString(2131951785);
        this.P = getString(2131951803);
        this.Q = getString(2131952433);
        this.f966e = (ViewGroup) findViewById(2131362114);
        ViewGroup viewGroup = (ViewGroup) findViewById(2131362494);
        this.f982q0 = (ViewGroup) findViewById(2131362495);
        this.Z = e0.c.getColor(this.f960b, 2131099794);
        this.f959a0 = e0.c.getColor(this.f960b, 2131100822);
        this.f984r0 = e0.c.getColor(this.f960b, 2131099684);
        this.f986s0 = e0.c.getColor(this.f960b, 2131099685);
        this.R = l.l(this.f960b);
        m();
        String y9 = t1.y();
        if (y9.equals("fr")) {
            this.f973k0 = 2131886090;
            this.f972j0 = 2131886086;
            this.l0 = 2131886094;
        } else if (y9.equals("ja") || y9.equals("ja-jp")) {
            this.f973k0 = 2131886091;
            this.f972j0 = 2131886087;
            this.l0 = 2131886095;
        } else if (y9.equals("zh") || y9.equals("zh-hant-tw")) {
            this.f973k0 = 2131886092;
            this.f972j0 = 2131886088;
            this.l0 = 2131886096;
        } else {
            this.f973k0 = 2131886089;
            this.f972j0 = 2131886085;
            this.l0 = 2131886093;
        }
        ((LinearLayout) findViewById(2131362148)).setOnClickListener(new z(this, 1));
        ((LinearLayout) findViewById(2131362360)).setOnClickListener(new z(this, 2));
        this.f980p = (LinearLayout) findViewById(2131362098);
        this.q = (LinearLayout) findViewById(2131362140);
        ((LinearLayout) findViewById(2131361959)).setOnClickListener(new z(this, 3));
        LinearLayout linearLayout = (LinearLayout) findViewById(2131362453);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(2131362399);
        this.f978o = (LinearLayout) findViewById(2131361982);
        this.f0 = (ImageView) findViewById(2131362589);
        this.f969g0 = getColor(2131100823);
        this.f970h0 = getColor(2131100824);
        final ImageButton imageButton = (ImageButton) findViewById(2131362175);
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: i2.d0

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ MainActivity f2311b;

            {
                this.f2311b = this;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [com.chilllive.chillwallpaperproject.MainActivity, java.lang.Object, android.app.Activity] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = r3;
                ImageButton imageButton2 = imageButton;
                ?? r22 = this.f2311b;
                switch (i) {
                    case 0:
                        int i9 = MainActivity.f958u0;
                        r22.getClass();
                        y.b(imageButton2);
                        c4.b.b0(r22, r22.f960b);
                        return;
                    case 1:
                        int i10 = MainActivity.f958u0;
                        r22.getClass();
                        y.b(imageButton2);
                        c4.b.K(r22, view.getContext());
                        return;
                    default:
                        int i11 = MainActivity.f958u0;
                        r22.getClass();
                        y.b(imageButton2);
                        c4.b.F(r22.f960b);
                        return;
                }
            }
        });
        final ImageButton imageButton2 = (ImageButton) findViewById(2131362174);
        imageButton2.setOnClickListener(new View.OnClickListener(this) { // from class: i2.d0

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ MainActivity f2311b;

            {
                this.f2311b = this;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [com.chilllive.chillwallpaperproject.MainActivity, java.lang.Object, android.app.Activity] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = r3;
                ImageButton imageButton22 = imageButton2;
                ?? r22 = this.f2311b;
                switch (i) {
                    case 0:
                        int i9 = MainActivity.f958u0;
                        r22.getClass();
                        y.b(imageButton22);
                        c4.b.b0(r22, r22.f960b);
                        return;
                    case 1:
                        int i10 = MainActivity.f958u0;
                        r22.getClass();
                        y.b(imageButton22);
                        c4.b.K(r22, view.getContext());
                        return;
                    default:
                        int i11 = MainActivity.f958u0;
                        r22.getClass();
                        y.b(imageButton22);
                        c4.b.F(r22.f960b);
                        return;
                }
            }
        });
        final ImageButton imageButton3 = (ImageButton) findViewById(2131362173);
        imageButton3.setOnClickListener(new View.OnClickListener(this) { // from class: i2.d0

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ MainActivity f2311b;

            {
                this.f2311b = this;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [com.chilllive.chillwallpaperproject.MainActivity, java.lang.Object, android.app.Activity] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = r3;
                ImageButton imageButton22 = imageButton3;
                ?? r22 = this.f2311b;
                switch (i) {
                    case 0:
                        int i9 = MainActivity.f958u0;
                        r22.getClass();
                        y.b(imageButton22);
                        c4.b.b0(r22, r22.f960b);
                        return;
                    case 1:
                        int i10 = MainActivity.f958u0;
                        r22.getClass();
                        y.b(imageButton22);
                        c4.b.K(r22, view.getContext());
                        return;
                    default:
                        int i11 = MainActivity.f958u0;
                        r22.getClass();
                        y.b(imageButton22);
                        c4.b.F(r22.f960b);
                        return;
                }
            }
        });
        SharedPreferences z10 = t1.z(this.f960b);
        this.S = z10;
        z10.registerOnSharedPreferenceChangeListener(this.f988t0);
        this.f988t0 = new Object();
        int parseInt = Integer.parseInt(getResources().getString(2131952321));
        onSharedPreferenceChanged(this.S, "");
        SharedPreferences.Editor edit = this.S.edit();
        edit.putString(getResources().getString(2131952322), Integer.toString(parseInt));
        edit.apply();
        Window window = getWindow();
        window.setFormat(1);
        t1.R(window, false);
        window.addFlags(Integer.MIN_VALUE);
        window.clearFlags(67108864);
        int color = e0.c.getColor(getBaseContext(), 2131100813);
        int i = Build.VERSION.SDK_INT;
        if (i <= 34) {
            window.setStatusBarColor(color);
            window.setNavigationBarColor(color);
        }
        if (i >= 30) {
            window.setDecorFitsSystemWindows(false);
        } else {
            window.getDecorView().setSystemUiVisibility(1792);
        }
        View findViewById = findViewById(2131362114);
        if (findViewById != 0) {
            findViewById.setOnApplyWindowInsetsListener(new Object());
        }
        this.Y = null;
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(16843499, typedValue, true)) {
            this.S.edit().putInt(getString(2131951656), TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics())).apply();
        }
        q4.f.h(getApplicationContext());
        getOnBackPressedDispatcher().a(new t0(this), this);
        this.f978o.setOnClickListener(new z(this, 0));
        this.f980p.setOnClickListener(new z(this, 4));
        this.q.setOnClickListener(new z(this, 6));
        SensorManager sensorManager = (SensorManager) this.f960b.getSystemService("sensor");
        this.U = sensorManager;
        this.V = sensorManager.getDefaultSensor(4);
        Application application = getApplication();
        int[] iArr = m3.e.f3957a;
        application.registerActivityLifecycleCallbacks(new d(new Object()));
        l();
        b1 supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.B(this.L) == null) {
            a0 a0Var = new a0();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.c(2131362114, a0Var, this.L, 1);
            aVar.h(a0Var);
            aVar.f();
        }
        if (supportFragmentManager.B(this.M) == null) {
            d0 d0Var = new d0();
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
            aVar2.c(2131362114, d0Var, this.M, 1);
            aVar2.h(d0Var);
            aVar2.f();
        }
        this.f977n0 = (a0) getSupportFragmentManager().B(this.L);
        this.f979o0 = (d0) getSupportFragmentManager().B(this.M);
    }

    @Override // h.i
    public final void onDestroy() {
        super.onDestroy();
        this.S.unregisterOnSharedPreferenceChangeListener(this.f988t0);
        this.f983r.removeCallbacks(this.f985s);
        this.R = null;
        v0 v0Var = this.T;
        if (v0Var != null) {
            v0Var.g();
            this.T = null;
        }
        this.f974m.l0(true);
        GLSurfaceView gLSurfaceView = this.f976n;
        if (gLSurfaceView != null) {
            gLSurfaceView.onPause();
            if (this.f976n.getParent() != null) {
                ((ViewGroup) this.f976n.getParent()).removeView(this.f976n);
            }
            this.f976n = null;
        }
        this.U.unregisterListener(this.f965d0);
        this.f961b0.a(this.f971i0);
    }

    public final void onPause() {
        super.onPause();
        Choreographer.getInstance().removeFrameCallback(this.f975m0);
        this.f976n.onPause();
        this.f983r.removeCallbacks(this.f985s);
        this.S.unregisterOnSharedPreferenceChangeListener(this.f988t0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onResume() {
        super.onResume();
        this.U.registerListener(this.f965d0, this.V, 2);
        if (this.S.getBoolean(getString(2131951952), false)) {
            this.S.edit().putInt(this.f987t, (int) (m2.a.a() / 0.016666668f)).apply();
        }
        Choreographer.getInstance().postFrameCallback(this.f975m0);
        this.f963c0.a();
        boolean z9 = getResources().getConfiguration().orientation == 1;
        this.W = z9;
        if (this.T == null) {
            this.T = new v0(this.f960b, this.f974m, this.f962c, this.f964d, z9);
        }
        m();
        this.S.registerOnSharedPreferenceChangeListener(this);
        this.f983r.post(this.f985s);
        n2.f fVar = this.f974m;
        if (fVar.q != null) {
            fVar.p0(this.S.getInt(this.K, 0) * 0.01f);
        }
        ArrayList arrayList = getSupportFragmentManager().d;
        if ((arrayList != null ? arrayList.size() : 0) > 0) {
            View findViewById = findViewById(2131362494);
            findViewById.animate().alpha(0.0f).setDuration(getResources().getInteger(17694720)).withEndAction(new v(findViewById, 3));
        }
        Button button = (Button) findViewById(2131361935);
        Context context = this.f960b;
        WallpaperInfo wallpaperInfo = WallpaperManager.getInstance(context).getWallpaperInfo();
        button.setVisibility(wallpaperInfo == null ? false : new ComponentName(context, MyWallpaperService.class).equals(wallpaperInfo.getComponent()) ? 8 : 0);
        l();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (this.T == null || str == null) {
            return;
        }
        this.f976n.queueEvent(new androidx.fragment.app.l(this, str, sharedPreferences, 2));
        boolean z9 = this.f981p0;
        boolean o9 = this.R.o();
        this.f981p0 = o9;
        if (o9 != z9) {
            l();
        }
        a0 a0Var = this.f977n0;
        if (a0Var == null || !a0Var.isAdded()) {
            return;
        }
        boolean z10 = this.f977n0.X1;
    }

    @Override // h.i
    public final void onStop() {
        super.onStop();
        this.f976n.onPause();
        this.U.unregisterListener(this.f965d0);
        this.f961b0.a(this.f971i0);
    }

    public void onclickContact(View view) {
        n(2131951782, 0, 4);
    }

    public void onclickHelp(View view) {
        n(2131951882, this.f972j0, 0);
    }

    public void onclickHelpSettings(View view) {
        y.b(view);
        n(2131952395, 0, 1);
    }

    public void onclickInfoSettings(View view) {
        y.b(view);
        n(2131951961, 0, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setWallpaper(View view) {
        try {
            try {
                Intent intent = new Intent("android.service.wallpaper.CHANGE_LIVE_WALLPAPER");
                intent.putExtra("android.service.wallpaper.extra.LIVE_WALLPAPER_COMPONENT", new ComponentName((Context) this, (Class<?>) MyWallpaperService.class));
                startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                startActivity(new Intent("android.service.wallpaper.LIVE_WALLPAPER_CHOOSER"));
            }
        } catch (ActivityNotFoundException unused2) {
            Toast.makeText((Context) this, 2131951962, 1).show();
        }
    }
}
