package h;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import n.a3;
import n.f3;
import n.j1;
import n.k1;
import n.k3;
import q0.q0;
import q0.t0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class c0 extends p implements m.k, LayoutInflater.Factory2 {

    /* renamed from: o0  reason: collision with root package name */
    public static final r.j f1991o0 = new r.j(0);

    /* renamed from: p0  reason: collision with root package name */
    public static final int[] f1992p0 = {16842836};

    /* renamed from: q0  reason: collision with root package name */
    public static final boolean f1993q0 = !"robolectric".equals(Build.FINGERPRINT);
    public l.a A;
    public ActionBarContextView B;
    public PopupWindow C;
    public q D;
    public boolean G;
    public ViewGroup H;
    public TextView I;
    public View J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public b0[] S;
    public b0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public Configuration Y;
    public final int Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f1994a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f1995b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f1996c0;

    /* renamed from: d0  reason: collision with root package name */
    public y f1997d0;

    /* renamed from: e0  reason: collision with root package name */
    public y f1998e0;
    public boolean f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f1999g0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f2001i0;

    /* renamed from: j0  reason: collision with root package name */
    public Rect f2002j0;

    /* renamed from: k0  reason: collision with root package name */
    public Rect f2003k0;
    public h0 l0;

    /* renamed from: m0  reason: collision with root package name */
    public OnBackInvokedDispatcher f2004m0;

    /* renamed from: n0  reason: collision with root package name */
    public OnBackInvokedCallback f2005n0;

    /* renamed from: p  reason: collision with root package name */
    public final Object f2006p;
    public final Context q;

    /* renamed from: r  reason: collision with root package name */
    public Window f2007r;

    /* renamed from: s  reason: collision with root package name */
    public x f2008s;

    /* renamed from: t  reason: collision with root package name */
    public final Object f2009t;

    /* renamed from: u  reason: collision with root package name */
    public n0 f2010u;

    /* renamed from: v  reason: collision with root package name */
    public l.h f2011v;

    /* renamed from: w  reason: collision with root package name */
    public CharSequence f2012w;

    /* renamed from: x  reason: collision with root package name */
    public j1 f2013x;

    /* renamed from: y  reason: collision with root package name */
    public r f2014y;

    /* renamed from: z  reason: collision with root package name */
    public r f2015z;
    public t0 E = null;
    public final boolean F = true;

    /* renamed from: h0  reason: collision with root package name */
    public final q f2000h0 = new q(this, 0);

    public c0(Context context, Window window, j jVar, Object obj) {
        i iVar = null;
        this.Z = -100;
        this.q = context;
        this.f2009t = jVar;
        this.f2006p = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof i)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        iVar = (i) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (iVar != null) {
                this.Z = ((c0) iVar.h()).Z;
            }
        }
        if (this.Z == -100) {
            String name = this.f2006p.getClass().getName();
            r.j jVar2 = f1991o0;
            Integer num = (Integer) jVar2.get(name);
            if (num != null) {
                this.Z = num.intValue();
                jVar2.remove(this.f2006p.getClass().getName());
            }
        }
        if (window != null) {
            r(window);
        }
        n.u.d();
    }

    public static m0.h s(Context context) {
        m0.h hVar;
        m0.h hVar2;
        if (Build.VERSION.SDK_INT < 33 && (hVar = p.f2098c) != null) {
            m0.i iVar = hVar.f3950a;
            m0.h b10 = u.b(context.getApplicationContext().getResources().getConfiguration());
            if (hVar.b()) {
                hVar2 = m0.h.f3949b;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int i = 0;
                while (i < b10.f3950a.f3951a.size() + iVar.f3951a.size()) {
                    Locale locale = i < iVar.f3951a.size() ? iVar.f3951a.get(i) : b10.f3950a.f3951a.get(i - iVar.f3951a.size());
                    if (locale != null) {
                        linkedHashSet.add(locale);
                    }
                    i++;
                }
                hVar2 = new m0.h(new m0.i(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
            }
            return hVar2.b() ? b10 : hVar2;
        }
        return null;
    }

    public static Configuration w(Context context, int i, m0.h hVar, Configuration configuration, boolean z9) {
        int i9 = i != 1 ? i != 2 ? z9 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i9 | (configuration2.uiMode & (-49));
        if (hVar != null) {
            u.d(configuration2, hVar);
        }
        return configuration2;
    }

    public final void A() {
        if (this.f2007r == null) {
            Object obj = this.f2006p;
            if (obj instanceof Activity) {
                r(((Activity) obj).getWindow());
            }
        }
        if (this.f2007r == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final z B(Context context) {
        if (this.f1997d0 == null) {
            if (b8.g.f787e == null) {
                Context applicationContext = context.getApplicationContext();
                b8.g.f787e = new b8.g(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f1997d0 = new y(this, b8.g.f787e);
        }
        return this.f1997d0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, h.b0] */
    public final b0 C(int i) {
        Object[] objArr = this.S;
        if (objArr == null || objArr.length <= i) {
            b0[] b0VarArr = new b0[i + 1];
            if (objArr != null) {
                System.arraycopy(objArr, 0, b0VarArr, 0, objArr.length);
            }
            this.S = b0VarArr;
            objArr = b0VarArr;
        }
        b0 b0Var = objArr[i];
        if (b0Var == 0) {
            ?? obj = new Object();
            obj.f1975a = i;
            obj.f1986n = false;
            objArr[i] = obj;
            return obj;
        }
        return b0Var;
    }

    public final void D() {
        z();
        if (this.M && this.f2010u == null) {
            Object obj = this.f2006p;
            if (obj instanceof Activity) {
                this.f2010u = new n0((Activity) obj, this.N);
            } else if (obj instanceof Dialog) {
                this.f2010u = new n0((Dialog) obj);
            }
            n0 n0Var = this.f2010u;
            if (n0Var != null) {
                n0Var.Z(this.f2001i0);
            }
        }
    }

    public final void E(int i) {
        this.f1999g0 = (1 << i) | this.f1999g0;
        if (this.f0) {
            return;
        }
        View decorView = this.f2007r.getDecorView();
        WeakHashMap weakHashMap = q0.f5172a;
        decorView.postOnAnimation(this.f2000h0);
        this.f0 = true;
    }

    public final int F(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            if (this.f1998e0 == null) {
                                this.f1998e0 = new y(this, context);
                            }
                            return this.f1998e0.e();
                        }
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return B(context).e();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean G() {
        k1 k1Var;
        a3 a3Var;
        boolean z9 = this.U;
        this.U = false;
        b0 C = C(0);
        if (!C.f1985m) {
            l.a aVar = this.A;
            if (aVar != null) {
                aVar.a();
                return true;
            }
            D();
            n0 n0Var = this.f2010u;
            if (n0Var == null || (k1Var = n0Var.j) == null || (a3Var = ((f3) k1Var).f4117a.R) == null || a3Var.f4085b == null) {
                return false;
            }
            a3 a3Var2 = ((f3) k1Var).f4117a.R;
            m.o oVar = a3Var2 == null ? null : a3Var2.f4085b;
            if (oVar != null) {
                oVar.collapseActionView();
            }
        } else if (!z9) {
            v(C, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0156, code lost:
        if (r2 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0176, code lost:
        if (r2.f3866f.getCount() > 0) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(h.b0 r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.c0.H(h.b0, android.view.KeyEvent):void");
    }

    public final boolean I(b0 b0Var, int i, KeyEvent keyEvent) {
        m.m mVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((b0Var.f1983k || J(b0Var, keyEvent)) && (mVar = b0Var.f1982h) != null) {
            return mVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cd, code lost:
        if (r13.f1982h == null) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean J(h.b0 r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.c0.J(h.b0, android.view.KeyEvent):boolean");
    }

    public final void K() {
        if (this.G) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void L() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z9 = false;
            if (this.f2004m0 != null && (C(0).f1985m || this.A != null)) {
                z9 = true;
            }
            if (z9 && this.f2005n0 == null) {
                this.f2005n0 = w.b(this.f2004m0, this);
            } else if (z9 || (onBackInvokedCallback = this.f2005n0) == null) {
            } else {
                w.c(this.f2004m0, onBackInvokedCallback);
                this.f2005n0 = null;
            }
        }
    }

    @Override // m.k
    public final boolean b(m.m mVar, MenuItem menuItem) {
        b0 b0Var;
        Window.Callback callback = this.f2007r.getCallback();
        if (callback != null && !this.X) {
            m.m k9 = mVar.k();
            b0[] b0VarArr = this.S;
            int length = b0VarArr != null ? b0VarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    b0Var = b0VarArr[i];
                    if (b0Var != null && b0Var.f1982h == k9) {
                        break;
                    }
                    i++;
                } else {
                    b0Var = null;
                    break;
                }
            }
            if (b0Var != null) {
                return callback.onMenuItemSelected(b0Var.f1975a, menuItem);
            }
        }
        return false;
    }

    @Override // h.p
    public final void d() {
        LayoutInflater from = LayoutInflater.from(this.q);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (from.getFactory2() instanceof c0) {
        } else {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // h.p
    public final void e() {
        if (this.f2010u != null) {
            D();
            this.f2010u.getClass();
            E(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (r6.f() != false) goto L19;
     */
    @Override // m.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(m.m r6) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.c0.f(m.m):void");
    }

    @Override // h.p
    public final void h() {
        String str;
        this.V = true;
        q(false, true);
        A();
        Object obj = this.f2006p;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = d0.d.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e9) {
                    throw new IllegalArgumentException(e9);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                n0 n0Var = this.f2010u;
                if (n0Var == null) {
                    this.f2001i0 = true;
                } else {
                    n0Var.Z(true);
                }
            }
            synchronized (p.f2103n) {
                p.j(this);
                p.f2102m.add(new WeakReference(this));
            }
        }
        this.Y = new Configuration(this.q.getResources().getConfiguration());
        this.W = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // h.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f2006p
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = h.p.f2103n
            monitor-enter(r0)
            h.p.j(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f2007r
            android.view.View r0 = r0.getDecorView()
            h.q r1 = r3.f2000h0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.X = r0
            int r0 = r3.Z
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f2006p
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            r.j r0 = h.c0.f1991o0
            java.lang.Object r1 = r3.f2006p
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.Z
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            r.j r0 = h.c0.f1991o0
            java.lang.Object r1 = r3.f2006p
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            h.y r0 = r3.f1997d0
            if (r0 == 0) goto L63
            r0.c()
        L63:
            h.y r0 = r3.f1998e0
            if (r0 == 0) goto L6a
            r0.c()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.c0.i():void");
    }

    @Override // h.p
    public final boolean k(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.Q && i == 108) {
            return false;
        }
        if (this.M && i == 1) {
            this.M = false;
        }
        if (i == 1) {
            K();
            this.Q = true;
            return true;
        } else if (i == 2) {
            K();
            this.K = true;
            return true;
        } else if (i == 5) {
            K();
            this.L = true;
            return true;
        } else if (i == 10) {
            K();
            this.O = true;
            return true;
        } else if (i == 108) {
            K();
            this.M = true;
            return true;
        } else if (i != 109) {
            return this.f2007r.requestFeature(i);
        } else {
            K();
            this.N = true;
            return true;
        }
    }

    @Override // h.p
    public final void l(int i) {
        z();
        ViewGroup viewGroup = (ViewGroup) this.H.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.q).inflate(i, viewGroup);
        this.f2008s.a(this.f2007r.getCallback());
    }

    @Override // h.p
    public final void m(View view) {
        z();
        ViewGroup viewGroup = (ViewGroup) this.H.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2008s.a(this.f2007r.getCallback());
    }

    @Override // h.p
    public final void n(View view, ViewGroup.LayoutParams layoutParams) {
        z();
        ViewGroup viewGroup = (ViewGroup) this.H.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2008s.a(this.f2007r.getCallback());
    }

    @Override // h.p
    public final void o(CharSequence charSequence) {
        this.f2012w = charSequence;
        j1 j1Var = this.f2013x;
        if (j1Var != null) {
            j1Var.setWindowTitle(charSequence);
            return;
        }
        n0 n0Var = this.f2010u;
        if (n0Var == null) {
            TextView textView = this.I;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        f3 f3Var = (f3) n0Var.j;
        if (f3Var.f4123g) {
            return;
        }
        Toolbar toolbar = f3Var.f4117a;
        f3Var.f4124h = charSequence;
        if ((f3Var.f4118b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (f3Var.f4123g) {
                q0.o(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010e, code lost:
        if (r10.equals("ImageButton") == false) goto L23;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x01e3 -> B:145:0x01e9). Please submit an issue!!! */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.c0.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.c0.q(boolean, boolean):boolean");
    }

    public final void r(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f2007r != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof x) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        x xVar = new x(this, callback);
        this.f2008s = xVar;
        window.setCallback(xVar);
        Context context = this.q;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f1992p0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            n.u a10 = n.u.a();
            synchronized (a10) {
                drawable = a10.f4310a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f2007r = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f2004m0) != null) {
            return;
        }
        Object obj = this.f2006p;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f2005n0) != null) {
            w.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f2005n0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f2004m0 = w.a(activity);
                L();
            }
        }
        this.f2004m0 = null;
        L();
    }

    public final void t(int i, b0 b0Var, m.m mVar) {
        if (mVar == null) {
            if (b0Var == null && i >= 0) {
                b0[] b0VarArr = this.S;
                if (i < b0VarArr.length) {
                    b0Var = b0VarArr[i];
                }
            }
            if (b0Var != null) {
                mVar = b0Var.f1982h;
            }
        }
        if ((b0Var == null || b0Var.f1985m) && !this.X) {
            x xVar = this.f2008s;
            Window.Callback callback = this.f2007r.getCallback();
            xVar.getClass();
            try {
                xVar.f2116d = true;
                callback.onPanelClosed(i, mVar);
            } finally {
                xVar.f2116d = false;
            }
        }
    }

    public final void u(m.m mVar) {
        n.k kVar;
        if (this.R) {
            return;
        }
        this.R = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2013x;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((f3) actionBarOverlayLayout.e).f4117a.a;
        if (actionMenuView != null && (kVar = actionMenuView.z) != null) {
            kVar.c();
            n.g gVar = kVar.f4194z;
            if (gVar != null && gVar.b()) {
                gVar.i.dismiss();
            }
        }
        Window.Callback callback = this.f2007r.getCallback();
        if (callback != null && !this.X) {
            callback.onPanelClosed(108, mVar);
        }
        this.R = false;
    }

    public final void v(b0 b0Var, boolean z9) {
        ContentFrameLayout contentFrameLayout;
        ActionBarOverlayLayout actionBarOverlayLayout;
        n.k kVar;
        if (z9 && b0Var.f1975a == 0 && (actionBarOverlayLayout = this.f2013x) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = actionBarOverlayLayout;
            actionBarOverlayLayout2.k();
            ActionMenuView actionMenuView = ((f3) actionBarOverlayLayout2.e).f4117a.a;
            if (actionMenuView != null && (kVar = actionMenuView.z) != null && kVar.f()) {
                u(b0Var.f1982h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.q.getSystemService("window");
        if (windowManager != null && b0Var.f1985m && (contentFrameLayout = b0Var.f1979e) != null) {
            windowManager.removeView(contentFrameLayout);
            if (z9) {
                t(b0Var.f1975a, b0Var, null);
            }
        }
        b0Var.f1983k = false;
        b0Var.f1984l = false;
        b0Var.f1985m = false;
        b0Var.f1980f = null;
        b0Var.f1986n = true;
        if (this.T == b0Var) {
            this.T = null;
        }
        if (b0Var.f1975a == 0) {
            L();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r4.dispatchKeyEvent(r7) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00dc, code lost:
        if (r7.c() != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0102, code lost:
        if (r7.l() != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean x(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.c0.x(android.view.KeyEvent):boolean");
    }

    public final void y(int i) {
        b0 C = C(i);
        if (C.f1982h != null) {
            Bundle bundle = new Bundle();
            C.f1982h.t(bundle);
            if (bundle.size() > 0) {
                C.f1988p = bundle;
            }
            C.f1982h.w();
            C.f1982h.clear();
        }
        C.f1987o = true;
        C.f1986n = true;
        if ((i == 108 || i == 0) && this.f2013x != null) {
            b0 C2 = C(0);
            C2.f1983k = false;
            J(C2, null);
        }
    }

    public final void z() {
        ViewGroup viewGroup;
        if (this.G) {
            return;
        }
        Context context = this.q;
        int[] iArr = g.a.j;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(126, false)) {
            k(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            k(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            k(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            k(10);
        }
        this.P = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        A();
        this.f2007r.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.Q) {
            viewGroup = this.O ? (ViewGroup) from.inflate(2131558422, (ViewGroup) null) : (ViewGroup) from.inflate(2131558421, (ViewGroup) null);
        } else if (this.P) {
            viewGroup = (ViewGroup) from.inflate(2131558412, (ViewGroup) null);
            this.N = false;
            this.M = false;
        } else if (this.M) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(2130968588, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new l.c(context, typedValue.resourceId) : context).inflate(2131558423, (ViewGroup) null);
            j1 j1Var = (j1) viewGroup.findViewById(2131362007);
            this.f2013x = j1Var;
            j1Var.setWindowCallback(this.f2007r.getCallback());
            if (this.N) {
                this.f2013x.j(109);
            }
            if (this.K) {
                this.f2013x.j(2);
            }
            if (this.L) {
                this.f2013x.j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.M + ", windowActionBarOverlay: " + this.N + ", android:windowIsFloating: " + this.P + ", windowActionModeOverlay: " + this.O + ", windowNoTitle: " + this.Q + " }");
        }
        r rVar = new r(this, 0);
        WeakHashMap weakHashMap = q0.f5172a;
        q0.i0.j(viewGroup, rVar);
        if (this.f2013x == null) {
            this.I = (TextView) viewGroup.findViewById(2131362518);
        }
        boolean z9 = k3.f4203a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e9) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e9);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e10) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
        }
        ContentFrameLayout findViewById = viewGroup.findViewById(2131361847);
        ViewGroup viewGroup2 = (ViewGroup) this.f2007r.findViewById(16908290);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                findViewById.addView(childAt);
            }
            viewGroup2.setId(-1);
            findViewById.setId(16908290);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f2007r.setContentView(viewGroup);
        findViewById.setAttachListener(new r(this, 1));
        this.H = viewGroup;
        Object obj = this.f2006p;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f2012w;
        if (!TextUtils.isEmpty(title)) {
            j1 j1Var2 = this.f2013x;
            if (j1Var2 != null) {
                j1Var2.setWindowTitle(title);
            } else {
                n0 n0Var = this.f2010u;
                if (n0Var != null) {
                    f3 f3Var = (f3) n0Var.j;
                    if (!f3Var.f4123g) {
                        Toolbar toolbar = f3Var.f4117a;
                        f3Var.f4124h = title;
                        if ((f3Var.f4118b & 8) != 0) {
                            toolbar.setTitle(title);
                            if (f3Var.f4123g) {
                                q0.o(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.I;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout findViewById2 = this.H.findViewById(16908290);
        View decorView = this.f2007r.getDecorView();
        findViewById2.m.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (findViewById2.isLaidOut()) {
            findViewById2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(124, findViewById2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(125, findViewById2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(122)) {
            obtainStyledAttributes2.getValue(122, findViewById2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(123)) {
            obtainStyledAttributes2.getValue(123, findViewById2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, findViewById2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            obtainStyledAttributes2.getValue(121, findViewById2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        findViewById2.requestLayout();
        this.G = true;
        b0 C = C(0);
        if (this.X || C.f1982h != null) {
            return;
        }
        E(108);
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
