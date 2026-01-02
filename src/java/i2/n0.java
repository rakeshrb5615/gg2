package i2;

import android.app.WallpaperColors;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.service.wallpaper.WallpaperService;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import com.chilllive.chillwallpaperproject.MyWallpaperService;
import j5.t1;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class n0 extends WallpaperService.Engine {
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
    public boolean L;
    public boolean M;
    public boolean N;
    public final BatteryManager O;
    public final PowerManager P;
    public final ConcurrentLinkedQueue Q;
    public long R;
    public long S;
    public final i0 T;
    public final d4.k U;
    public EGLDisplay V;
    public EGLContext W;
    public EGLSurface X;
    public Thread Y;
    public volatile boolean Z;

    /* renamed from: a  reason: collision with root package name */
    public Context f2416a;

    /* renamed from: a0  reason: collision with root package name */
    public volatile boolean f2417a0;

    /* renamed from: b  reason: collision with root package name */
    public v0 f2418b;

    /* renamed from: b0  reason: collision with root package name */
    public long f2419b0;

    /* renamed from: c  reason: collision with root package name */
    public n2.f f2420c;

    /* renamed from: c0  reason: collision with root package name */
    public long f2421c0;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f2422d;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ MyWallpaperService f2423d0;

    /* renamed from: e  reason: collision with root package name */
    public final m0 f2424e;

    /* renamed from: f  reason: collision with root package name */
    public final Handler f2425f;

    /* renamed from: g  reason: collision with root package name */
    public final m0 f2426g;

    /* renamed from: h  reason: collision with root package name */
    public float f2427h;
    public float i;
    public boolean j;

    /* renamed from: k  reason: collision with root package name */
    public q f2428k;

    /* renamed from: l  reason: collision with root package name */
    public j2.j f2429l;

    /* renamed from: m  reason: collision with root package name */
    public SharedPreferences f2430m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f2431n;

    /* renamed from: o  reason: collision with root package name */
    public o0 f2432o;

    /* renamed from: p  reason: collision with root package name */
    public final m2.a f2433p;
    public SensorManager q;

    /* renamed from: r  reason: collision with root package name */
    public Sensor f2434r;

    /* renamed from: s  reason: collision with root package name */
    public String f2435s;

    /* renamed from: t  reason: collision with root package name */
    public String f2436t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2437u;

    /* renamed from: v  reason: collision with root package name */
    public String f2438v;

    /* renamed from: w  reason: collision with root package name */
    public String f2439w;

    /* renamed from: x  reason: collision with root package name */
    public String f2440x;

    /* renamed from: y  reason: collision with root package name */
    public String f2441y;

    /* renamed from: z  reason: collision with root package name */
    public String f2442z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [i2.m0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [i2.m0] */
    public n0(MyWallpaperService myWallpaperService) {
        super(myWallpaperService);
        this.f2423d0 = myWallpaperService;
        this.f2422d = new Handler();
        this.f2424e = new Runnable(this) { // from class: i2.m0

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ n0 f2415b;

            {
                this.f2415b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (r2) {
                    case 0:
                        n0 n0Var = this.f2415b;
                        n0Var.f2418b.K1 = true;
                        n0Var.f2422d.postDelayed(n0Var.f2424e, 15000.0f);
                        return;
                    default:
                        n0.a(this.f2415b);
                        return;
                }
            }
        };
        this.f2425f = new Handler();
        this.f2426g = new Runnable(this) { // from class: i2.m0

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ n0 f2415b;

            {
                this.f2415b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (r2) {
                    case 0:
                        n0 n0Var = this.f2415b;
                        n0Var.f2418b.K1 = true;
                        n0Var.f2422d.postDelayed(n0Var.f2424e, 15000.0f);
                        return;
                    default:
                        n0.a(this.f2415b);
                        return;
                }
            }
        };
        this.j = true;
        this.f2431n = true;
        this.f2433p = new m2.a();
        this.M = false;
        this.O = (BatteryManager) myWallpaperService.getSystemService("batterymanager");
        this.P = (PowerManager) myWallpaperService.getSystemService("power");
        this.Q = new ConcurrentLinkedQueue();
        this.T = new i0(this, 1);
        this.U = new d4.k(this, 2);
        this.V = EGL14.EGL_NO_DISPLAY;
        this.W = EGL14.EGL_NO_CONTEXT;
        this.X = EGL14.EGL_NO_SURFACE;
        this.Z = false;
        this.f2417a0 = false;
        this.f2419b0 = 0L;
        this.f2421c0 = 0L;
    }

    public static void a(n0 n0Var) {
        SurfaceHolder surfaceHolder;
        if (n0Var.N) {
            if (Build.VERSION.SDK_INT >= 27 && (surfaceHolder = n0Var.getSurfaceHolder()) != null && surfaceHolder.getSurface().isValid() && !n0Var.L) {
                try {
                    n0Var.notifyColorsChanged();
                } catch (Exception unused) {
                }
            }
            n0Var.N = false;
        }
        n0Var.f2425f.postDelayed(n0Var.f2426g, 2500L);
    }

    public final void b() {
        BatteryManager batteryManager = this.O;
        if (batteryManager != null) {
            int intProperty = batteryManager.getIntProperty(4);
            boolean z9 = this.f2430m.getBoolean(this.A, false);
            boolean z10 = this.f2430m.getBoolean(this.B, false);
            int i = this.f2430m.getInt(this.C, 15);
            boolean z11 = this.P.isPowerSaveMode() && this.f2430m.getBoolean(this.D, false);
            if (z9 || z11 || (z10 && intProperty <= i)) {
                this.f2417a0 = true;
            } else {
                this.f2417a0 = false;
            }
        }
    }

    public final void c() {
        EGLDisplay eGLDisplay = this.V;
        if (eGLDisplay == null || eGLDisplay == EGL14.EGL_NO_DISPLAY) {
            return;
        }
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGLSurface eGLSurface2 = this.X;
        if (eGLSurface2 != null && eGLSurface2 != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.V, eGLSurface2);
            this.X = EGL14.EGL_NO_SURFACE;
        }
        EGLContext eGLContext = this.W;
        if (eGLContext != null && eGLContext != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglDestroyContext(this.V, eGLContext);
            this.W = EGL14.EGL_NO_CONTEXT;
        }
        EGL14.eglReleaseThread();
        EGL14.eglTerminate(this.V);
        this.V = EGL14.EGL_NO_DISPLAY;
    }

    public final void d() {
        SurfaceHolder surfaceHolder = getSurfaceHolder();
        if (surfaceHolder.getSurface().isValid()) {
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                throw new RuntimeException("Unable to get EGL14 display");
            }
            int[] iArr = new int[2];
            if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                throw new RuntimeException("Unable to initialize EGL14");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!EGL14.eglChooseConfig(eglGetDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12352, 4, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                throw new RuntimeException("eglChooseConfig failed");
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
            if (eglCreateContext == null || eglCreateContext == EGL14.EGL_NO_CONTEXT) {
                throw new RuntimeException("Failed to create EGL context");
            }
            int[] iArr2 = {12344};
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            int i = 0;
            while (i < 3) {
                try {
                    eGLSurface = EGL14.eglCreateWindowSurface(eglGetDisplay, eGLConfig, surfaceHolder, iArr2, 0);
                } catch (Throwable unused) {
                }
                if (eGLSurface != null && eGLSurface != EGL14.EGL_NO_SURFACE) {
                    break;
                }
                int eglGetError = EGL14.eglGetError();
                StringBuilder sb = new StringBuilder("Surface creation failed (try ");
                i++;
                sb.append(i);
                sb.append("/3). EGL Error: ");
                sb.append(eglGetError);
                Log.w("GLWallpaper", sb.toString());
                try {
                    Thread.sleep(50L);
                } catch (InterruptedException unused2) {
                }
            }
            if (eGLSurface == null || eGLSurface == EGL14.EGL_NO_SURFACE) {
                throw new RuntimeException("Failed to create EGL surface after 3 attempts");
            }
            if (!EGL14.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, eglCreateContext)) {
                throw new RuntimeException("eglMakeCurrent failed");
            }
            EGL14.eglSwapInterval(eglGetDisplay, 1);
            this.V = eglGetDisplay;
            this.W = eglCreateContext;
            this.X = eGLSurface;
        }
    }

    public final void e() {
        v0 v0Var;
        if (this.Y == null && (v0Var = this.f2418b) != null) {
            this.Z = true;
            Thread thread = new Thread(new a5.i(9, this, v0Var), "GLRenderThread");
            this.Y = thread;
            thread.setPriority(5);
            this.Y.start();
        }
    }

    public final void f() {
        this.Z = false;
        Thread thread = this.Y;
        if (thread != null) {
            thread.interrupt();
            try {
                this.Y.join(2000L);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.Y.isAlive()) {
                Log.e("WallpaperEngine", "Thread stuck! Giving up to prevent ANR.");
            }
            this.Y = null;
        }
    }

    @Override // android.service.wallpaper.WallpaperService.Engine
    public final WallpaperColors onComputeColors() {
        v0 v0Var = this.f2418b;
        if (v0Var != null && Build.VERSION.SDK_INT >= 27) {
            return v0Var.m();
        }
        return null;
    }

    @Override // android.service.wallpaper.WallpaperService.Engine
    public final void onCreate(SurfaceHolder surfaceHolder) {
        Point point;
        super.onCreate(surfaceHolder);
        MyWallpaperService myWallpaperService = this.f2423d0;
        this.f2416a = myWallpaperService.getApplicationContext();
        this.L = isPreview();
        ((WindowManager) this.f2416a.getSystemService("window")).getDefaultDisplay().getRealSize(new Point());
        this.f2427h = Math.min(point.y, point.x);
        Display defaultDisplay = ((WindowManager) this.f2416a.getSystemService("window")).getDefaultDisplay();
        Point point2 = new Point();
        defaultDisplay.getRealSize(point2);
        float max = Math.max(point2.y, point2.x);
        this.i = max;
        float f9 = this.f2427h;
        boolean z9 = max > f9;
        this.f2431n = z9;
        if (z9) {
            this.f2427h = Math.min(f9, max);
            this.i = Math.max(f9, max);
        } else {
            this.f2427h = Math.max(f9, max);
            this.i = Math.min(f9, max);
        }
        v0 v0Var = new v0(this.f2416a, this.f2420c, this.f2427h, this.i, this.f2431n);
        this.f2418b = v0Var;
        this.f2420c = v0Var.f2533b;
        this.f2430m = t1.z(this.f2416a);
        this.f2432o = o0.c(this.f2416a);
        Resources resources = this.f2416a.getResources();
        this.f2438v = resources.getString(2131952301);
        resources.getString(2131951967);
        this.f2441y = resources.getString(2131951825);
        this.f2439w = resources.getString(2131951954);
        this.f2440x = resources.getString(2131951874);
        resources.getString(2131951934);
        resources.getString(2131951970);
        resources.getString(2131951621);
        this.f2442z = resources.getString(2131951622);
        this.f2435s = resources.getString(2131952493);
        this.f2436t = resources.getString(2131951903);
        this.A = resources.getString(2131951696);
        this.B = resources.getString(2131951691);
        this.C = resources.getString(2131951692);
        this.D = resources.getString(2131952236);
        this.E = resources.getString(2131952326);
        this.F = resources.getString(2131951799);
        this.G = resources.getString(2131952269);
        this.H = resources.getString(2131952264);
        this.I = resources.getString(2131952275);
        this.J = resources.getString(2131951923);
        this.K = resources.getString(2131951925);
        resources.getString(2131952478);
        j2.j jVar = new j2.j(this.f2416a);
        this.f2429l = jVar;
        this.f2428k = new q(this.f2416a, jVar);
        SensorManager sensorManager = (SensorManager) this.f2416a.getSystemService("sensor");
        this.q = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(4);
        this.f2434r = defaultSensor;
        if (defaultSensor == null) {
            this.f2437u = false;
            this.f2430m.edit().putBoolean(this.f2440x, false).apply();
        } else {
            this.f2437u = true;
        }
        myWallpaperService.registerReceiver(this.U, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.M = true;
        this.R = this.f2430m.getLong(this.J, 0L);
    }

    @Override // android.service.wallpaper.WallpaperService.Engine
    public final void onDestroy() {
        super.onDestroy();
        if (this.M) {
            try {
                this.f2423d0.unregisterReceiver(this.U);
                this.M = false;
            } catch (IllegalArgumentException unused) {
            }
        }
        v0 v0Var = this.f2418b;
        if (v0Var != null) {
            v0Var.g();
        }
    }

    @Override // android.service.wallpaper.WallpaperService.Engine
    public final void onSurfaceChanged(SurfaceHolder surfaceHolder, int i, final int i9, final int i10) {
        i0 i0Var = this.T;
        super.onSurfaceChanged(surfaceHolder, i, i9, i10);
        if (i9 <= 0 || i10 <= 0) {
            return;
        }
        float f9 = i9;
        this.f2427h = f9;
        float f10 = i10;
        this.i = f10;
        int i11 = 0;
        this.f2431n = i10 > i9;
        f();
        v0 v0Var = this.f2418b;
        if (v0Var != null) {
            v0Var.g();
            this.f2418b = null;
        }
        v0 v0Var2 = new v0(this.f2416a, this.f2420c, f9, f10, this.f2431n);
        this.f2418b = v0Var2;
        n2.f fVar = v0Var2.f2533b;
        this.f2420c = fVar;
        fVar.A = true;
        v0Var2.f2551g = this.f2431n;
        v0Var2.f2544e = f9;
        v0Var2.f2548f = f10;
        v0Var2.I1 = true;
        v0Var2.C();
        n2.f fVar2 = this.f2420c;
        v0 v0Var3 = this.f2418b;
        v0 v0Var4 = fVar2.f4491d;
        if (v0Var4 != null) {
            v0Var4.g();
        }
        fVar2.f4491d = v0Var3;
        e();
        this.Q.add(new Runnable() { // from class: i2.l0
            @Override // java.lang.Runnable
            public final void run() {
                n0 n0Var = n0.this;
                n2.f fVar3 = n0Var.f2420c;
                if (fVar3 != null) {
                    fVar3.onSurfaceChanged(null, i9, i10);
                    n0Var.f2421c0 = System.nanoTime();
                }
            }
        });
        if (this.f2430m.getBoolean(this.f2440x, true) && this.f2437u) {
            this.q.registerListener(i0Var, this.f2434r, 2);
        } else if (this.f2437u) {
            this.q.unregisterListener(i0Var);
        }
        boolean z9 = this.f2431n;
        if (z9) {
            v0 v0Var5 = this.f2418b;
            Bitmap[] bitmapArr = v0Var5.J0;
            if (bitmapArr != null && bitmapArr[0] != null) {
                i11 = v0Var5.S1[0];
            }
            if (i11 == i9) {
                v0Var5.o(f9, f10, z9);
            }
        }
        this.f2418b.c(this.f2438v);
    }

    @Override // android.service.wallpaper.WallpaperService.Engine
    public final void onSurfaceDestroyed(SurfaceHolder surfaceHolder) {
        super.onSurfaceDestroyed(surfaceHolder);
        f();
        this.f2418b.g();
        this.f2420c.l0(true);
    }

    @Override // android.service.wallpaper.WallpaperService.Engine
    public final void onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        if (motionEvent.getPointerCount() < 1) {
            return;
        }
        this.f2418b.r(motionEvent);
        motionEvent.getAction();
    }

    @Override // android.service.wallpaper.WallpaperService.Engine
    public final void onVisibilityChanged(boolean z9) {
        Integer num;
        this.j = z9;
        if (!z9) {
            f();
            this.f2422d.removeCallbacks(this.f2424e);
            this.f2425f.removeCallbacks(this.f2426g);
            if (this.f2437u) {
                this.q.unregisterListener(this.T);
                return;
            }
            return;
        }
        this.f2430m.edit().putBoolean(this.G, true).apply();
        int i = this.f2430m.getInt(this.E, 0);
        o0 o0Var = this.f2432o;
        v0 v0Var = this.f2418b;
        int b10 = o0Var.b();
        int d9 = o0Var.d();
        boolean z10 = (b10 & 1) == 0 && (b10 & 32) == 0 && (b10 & 64) == 0 && (b10 & 256) == 0 && (b10 & 128) == 0;
        boolean z11 = (8 & b10) != 0;
        if (z10) {
            HashMap hashMap = new HashMap();
            hashMap.put(2, 1);
            hashMap.put(3, 2);
            hashMap.put(4, 4);
            hashMap.put(5, 8);
            hashMap.put(8, 16);
            if (hashMap.containsKey(Integer.valueOf(i)) && (num = (Integer) hashMap.get(Integer.valueOf(i))) != null && (num.intValue() & d9) == 0) {
                SharedPreferences.Editor edit = v0Var.f2536c.edit();
                edit.putInt(v0Var.f2540d, 0);
                edit.apply();
                v0Var.w();
            }
        }
        if (z11) {
            v0Var.g();
        }
        if (z10) {
            v0Var.f2536c.edit().putBoolean(v0Var.f2529a.getString(2131951838), true).apply();
            v0Var.I1 = true;
            v0Var.J1 = true;
            v0Var.K1 = true;
            v0Var.L1 = true;
            v0Var.P1 = true;
            v0Var.f2533b.H = true;
        } else {
            v0Var.getClass();
        }
        if (this.j && !this.L) {
            int b11 = this.f2432o.b();
            boolean z12 = c4.b.H(b11) || c4.b.I(b11) || c4.b.J(b11);
            boolean z13 = this.f2430m.getBoolean(this.f2439w, false);
            boolean z14 = this.f2430m.getBoolean(this.f2436t, false) && z12;
            if (!z12) {
                this.f2430m.edit().putBoolean(this.f2436t, false).apply();
            }
            if (z13) {
                String string = this.f2430m.getString(this.f2435s, this.f2441y);
                int i9 = this.f2430m.getInt(this.f2442z, 240);
                m2.a aVar = this.f2433p;
                int i10 = z14 ? i9 : 240;
                aVar.getClass();
                if (m2.a.f(i10, string)) {
                    this.f2428k.a(false);
                }
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z15 = (currentTimeMillis - this.S) / 60000 >= ((long) this.f2430m.getInt(this.I, 10));
        this.S = System.currentTimeMillis();
        this.f2430m.edit().putLong(this.K, this.S).apply();
        this.f2430m.edit().putBoolean(this.f2423d0.getString(2131952274), z15).apply();
        k2.c.p().m(null, this.f2416a, this.f2429l, false);
        this.f2418b.n(false, false);
        this.f2418b.y();
        a aVar2 = this.f2418b.f2555h;
        int i11 = aVar2.f2282h.getInt(aVar2.f2283k, 50);
        aVar2.f2295x = i11;
        aVar2.f2275a.f2603v1 = i11;
        this.f2418b.c(this.f2438v);
        this.f2418b.c(this.f2423d0.getString(2131952379));
        boolean z16 = (currentTimeMillis - this.R) / 60000 >= ((long) this.f2430m.getInt(this.H, 10));
        this.R = System.currentTimeMillis();
        this.f2430m.edit().putLong(this.J, this.R).apply();
        if (this.f2430m.getInt(this.E, 0) == 7 && z16) {
            this.f2418b.f2568k2 = true;
        }
        if (this.f2430m.getInt(this.F, 0) == 5) {
            this.f2418b.f2571l2 = true;
        }
        boolean z17 = this.f2430m.getBoolean(this.f2440x, true);
        boolean z18 = this.f2437u;
        if (z18 && z17) {
            this.q.registerListener(this.T, this.f2434r, 2);
        } else if (z18) {
            this.q.unregisterListener(this.T);
        }
        e();
        SharedPreferences sharedPreferences = this.f2432o.f2466r;
        boolean[] zArr = {sharedPreferences.getBoolean(o0.L, false), sharedPreferences.getBoolean(o0.M, false), sharedPreferences.getBoolean(o0.N, false)};
        if (zArr[0]) {
            this.f2418b.g();
        } else if (zArr[1]) {
            this.f2418b.g();
        } else if (zArr[2]) {
            this.f2418b.g();
        }
        b();
        this.f2422d.post(this.f2424e);
        this.f2425f.post(this.f2426g);
    }
}
