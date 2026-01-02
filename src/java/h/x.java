package h;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import q0.q0;
import q0.t0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class x implements Window.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final Window.Callback f2113a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2114b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2115c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2116d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ c0 f2117e;

    public x(c0 c0Var, Window.Callback callback) {
        this.f2117e = c0Var;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f2113a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f2114b = true;
            callback.onContentChanged();
        } finally {
            this.f2114b = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f2113a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f2113a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        l.l.a(this.f2113a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2113a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z9 = this.f2115c;
        Window.Callback callback = this.f2113a;
        return z9 ? callback.dispatchKeyEvent(keyEvent) : this.f2117e.x(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r0 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
        if (r7 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e A[RETURN] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.view.Window$Callback r0 = r6.f2113a
            boolean r0 = r0.dispatchKeyShortcutEvent(r7)
            r1 = 1
            if (r0 != 0) goto L6f
            int r0 = r7.getKeyCode()
            h.c0 r2 = r6.f2117e
            r2.D()
            h.n0 r3 = r2.f2010u
            r4 = 0
            if (r3 == 0) goto L3d
            h.m0 r3 = r3.f2082n
            if (r3 != 0) goto L1d
        L1b:
            r0 = r4
            goto L39
        L1d:
            m.m r3 = r3.f2068d
            if (r3 == 0) goto L1b
            int r5 = r7.getDeviceId()
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r1) goto L31
            r5 = r1
            goto L32
        L31:
            r5 = r4
        L32:
            r3.setQwertyMode(r5)
            boolean r0 = r3.performShortcut(r0, r7, r4)
        L39:
            if (r0 == 0) goto L3d
        L3b:
            r7 = r1
            goto L6b
        L3d:
            h.b0 r0 = r2.T
            if (r0 == 0) goto L52
            int r3 = r7.getKeyCode()
            boolean r0 = r2.I(r0, r3, r7)
            if (r0 == 0) goto L52
            h.b0 r7 = r2.T
            if (r7 == 0) goto L3b
            r7.f1984l = r1
            goto L3b
        L52:
            h.b0 r0 = r2.T
            if (r0 != 0) goto L6a
            h.b0 r0 = r2.C(r4)
            r2.J(r0, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r2.I(r0, r3, r7)
            r0.f1983k = r4
            if (r7 == 0) goto L6a
            goto L3b
        L6a:
            r7 = r4
        L6b:
            if (r7 == 0) goto L6e
            goto L6f
        L6e:
            return r4
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h.x.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2113a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2113a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2113a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f2113a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f2113a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f2113a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f2114b) {
            this.f2113a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof m.m)) {
            return this.f2113a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f2113a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f2113a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f2113a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        if (i == 108) {
            c0 c0Var = this.f2117e;
            c0Var.D();
            n0 n0Var = c0Var.f2010u;
            if (n0Var != null) {
                ArrayList arrayList = n0Var.f2085r;
                if (true != n0Var.q) {
                    n0Var.q = true;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        throw new ClassCastException();
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f2116d) {
            this.f2113a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        c0 c0Var = this.f2117e;
        if (i != 108) {
            if (i == 0) {
                b0 C = c0Var.C(i);
                if (C.f1985m) {
                    c0Var.v(C, false);
                    return;
                }
                return;
            }
            return;
        }
        c0Var.D();
        n0 n0Var = c0Var.f2010u;
        if (n0Var != null) {
            ArrayList arrayList = n0Var.f2085r;
            if (n0Var.q) {
                n0Var.q = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z9) {
        l.m.a(this.f2113a, z9);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        m.m mVar = menu instanceof m.m ? (m.m) menu : null;
        if (i == 0 && mVar == null) {
            return false;
        }
        if (mVar != null) {
            mVar.f3894x = true;
        }
        boolean onPreparePanel = this.f2113a.onPreparePanel(i, view, menu);
        if (mVar != null) {
            mVar.f3894x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        m.m mVar = this.f2117e.C(0).f1982h;
        if (mVar != null) {
            d(list, mVar, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return l.k.a(this.f2113a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f2113a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z9) {
        this.f2113a.onWindowFocusChanged(z9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [l.d, java.lang.Object, m.k, l.a] */
    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        c0 c0Var = this.f2117e;
        if (c0Var.F && i == 0) {
            Context context = c0Var.q;
            j6.s sVar = new j6.s(context, callback);
            l.a aVar = c0Var.A;
            if (aVar != null) {
                aVar.a();
            }
            k2.c cVar = new k2.c(c0Var, sVar, 22, false);
            c0Var.D();
            n0 n0Var = c0Var.f2010u;
            if (n0Var != null) {
                m0 m0Var = n0Var.f2082n;
                if (m0Var != null) {
                    m0Var.a();
                }
                n0Var.f2078h.setHideOnContentScrollEnabled(false);
                n0Var.f2079k.e();
                m0 m0Var2 = new m0(n0Var, n0Var.f2079k.getContext(), cVar);
                m.m mVar = m0Var2.f2068d;
                mVar.w();
                try {
                    if (((j6.s) m0Var2.f2069e.f3363b).n(m0Var2, mVar)) {
                        n0Var.f2082n = m0Var2;
                        m0Var2.i();
                        n0Var.f2079k.c(m0Var2);
                        n0Var.W(true);
                    } else {
                        m0Var2 = null;
                    }
                    c0Var.A = m0Var2;
                } finally {
                    mVar.v();
                }
            }
            if (c0Var.A == null) {
                t0 t0Var = c0Var.E;
                if (t0Var != null) {
                    t0Var.b();
                }
                l.a aVar2 = c0Var.A;
                if (aVar2 != null) {
                    aVar2.a();
                }
                if (c0Var.B == null) {
                    if (c0Var.P) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(2130968588, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme newTheme = context.getResources().newTheme();
                            newTheme.setTo(theme);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            l.c cVar2 = new l.c(context, 0);
                            cVar2.getTheme().setTo(newTheme);
                            context = cVar2;
                        }
                        c0Var.B = new ActionBarContextView(context, (AttributeSet) null);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, 2130968603);
                        c0Var.C = popupWindow;
                        popupWindow.setWindowLayoutType(2);
                        c0Var.C.setContentView(c0Var.B);
                        c0Var.C.setWidth(-1);
                        context.getTheme().resolveAttribute(2130968582, typedValue, true);
                        c0Var.B.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        c0Var.C.setHeight(-2);
                        c0Var.D = new q(c0Var, 1);
                    } else {
                        ViewStubCompat findViewById = c0Var.H.findViewById(2131361861);
                        if (findViewById != null) {
                            c0Var.D();
                            n0 n0Var2 = c0Var.f2010u;
                            Context X = n0Var2 != null ? n0Var2.X() : null;
                            if (X != null) {
                                context = X;
                            }
                            findViewById.setLayoutInflater(LayoutInflater.from(context));
                            c0Var.B = findViewById.a();
                        }
                    }
                }
                if (c0Var.B != null) {
                    t0 t0Var2 = c0Var.E;
                    if (t0Var2 != null) {
                        t0Var2.b();
                    }
                    c0Var.B.e();
                    Context context2 = c0Var.B.getContext();
                    ActionBarContextView actionBarContextView = c0Var.B;
                    ?? obj = new Object();
                    obj.f3480c = context2;
                    obj.f3481d = actionBarContextView;
                    obj.f3482e = cVar;
                    m.m mVar2 = new m.m(actionBarContextView.getContext());
                    mVar2.f3883l = 1;
                    obj.f3485n = mVar2;
                    mVar2.f3878e = obj;
                    if (sVar.n(obj, mVar2)) {
                        obj.i();
                        c0Var.B.c((l.a) obj);
                        c0Var.A = obj;
                        if (c0Var.G && (viewGroup = c0Var.H) != null && viewGroup.isLaidOut()) {
                            c0Var.B.setAlpha(0.0f);
                            t0 b10 = q0.b(c0Var.B);
                            b10.a(1.0f);
                            c0Var.E = b10;
                            b10.d(new s(c0Var, 1));
                        } else {
                            c0Var.B.setAlpha(1.0f);
                            c0Var.B.setVisibility(0);
                            if (c0Var.B.getParent() instanceof View) {
                                WeakHashMap weakHashMap = q0.f5172a;
                                q0.g0.c((View) c0Var.B.getParent());
                            }
                        }
                        if (c0Var.C != null) {
                            c0Var.f2007r.getDecorView().post(c0Var.D);
                        }
                    } else {
                        c0Var.A = null;
                    }
                }
                c0Var.L();
                c0Var.A = c0Var.A;
            }
            c0Var.L();
            l.a aVar3 = c0Var.A;
            if (aVar3 != null) {
                return sVar.f(aVar3);
            }
            return null;
        }
        return l.k.b(this.f2113a, callback, i);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f2113a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
