package y0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import j6.o;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q0.q0;
import v3.f;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public abstract class b extends q0.b {

    /* renamed from: n  reason: collision with root package name */
    public static final Rect f6698n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o  reason: collision with root package name */
    public static final c5.c f6699o = new Object();

    /* renamed from: p  reason: collision with root package name */
    public static final f f6700p = new Object();

    /* renamed from: h  reason: collision with root package name */
    public final AccessibilityManager f6705h;
    public final View i;
    public a j;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f6701d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f6702e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final Rect f6703f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final int[] f6704g = new int[2];

    /* renamed from: k  reason: collision with root package name */
    public int f6706k = Integer.MIN_VALUE;

    /* renamed from: l  reason: collision with root package name */
    public int f6707l = Integer.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    public int f6708m = Integer.MIN_VALUE;

    public b(View view) {
        this.i = view;
        this.f6705h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = q0.f5172a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // q0.b
    public final o b(View view) {
        if (this.j == null) {
            this.j = new a(this);
        }
        return this.j;
    }

    @Override // q0.b
    public final void d(View view, r0.c cVar) {
        this.f5094a.onInitializeAccessibilityNodeInfo(view, cVar.f5491a);
        t(cVar);
    }

    public final boolean j(int i) {
        if (this.f6707l != i) {
            return false;
        }
        this.f6707l = Integer.MIN_VALUE;
        v(i, false);
        x(i, 8);
        return true;
    }

    public final AccessibilityEvent k(int i, int i9) {
        View view = this.i;
        if (i == -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i9);
            view.onInitializeAccessibilityEvent(obtain);
            return obtain;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i9);
        r0.c r8 = r(i);
        obtain2.getText().add(r8.g());
        AccessibilityNodeInfo accessibilityNodeInfo = r8.f5491a;
        obtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        obtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        obtain2.setPassword(accessibilityNodeInfo.isPassword());
        obtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        obtain2.setChecked(accessibilityNodeInfo.isChecked());
        if (obtain2.getText().isEmpty() && obtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain2.setClassName(accessibilityNodeInfo.getClassName());
        obtain2.setSource(view, i);
        obtain2.setPackageName(view.getContext().getPackageName());
        return obtain2;
    }

    public final r0.c l(int i) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        r0.c cVar = new r0.c(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        cVar.i("android.view.View");
        Rect rect = f6698n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        View view = this.i;
        obtain.setParent(view);
        u(i, cVar);
        if (cVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f6702e;
        cVar.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = obtain.getActions();
        if ((actions & 64) == 0) {
            if ((actions & 128) == 0) {
                obtain.setPackageName(view.getContext().getPackageName());
                cVar.f5492b = i;
                obtain.setSource(view, i);
                if (this.f6706k == i) {
                    obtain.setAccessibilityFocused(true);
                    cVar.a(128);
                } else {
                    obtain.setAccessibilityFocused(false);
                    cVar.a(64);
                }
                boolean z9 = this.f6707l == i;
                if (z9) {
                    cVar.a(2);
                } else if (obtain.isFocusable()) {
                    cVar.a(1);
                }
                obtain.setFocused(z9);
                int[] iArr = this.f6704g;
                view.getLocationOnScreen(iArr);
                Rect rect3 = this.f6701d;
                obtain.getBoundsInScreen(rect3);
                if (rect3.equals(rect)) {
                    cVar.f(rect3);
                    rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                }
                Rect rect4 = this.f6703f;
                if (view.getLocalVisibleRect(rect4)) {
                    rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    if (rect3.intersect(rect4)) {
                        obtain.setBoundsInScreen(rect3);
                        if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                            ViewParent parent = view.getParent();
                            while (true) {
                                if (parent instanceof View) {
                                    View view2 = (View) parent;
                                    if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                        break;
                                    }
                                    parent = view2.getParent();
                                } else if (parent != null) {
                                    cVar.f5491a.setVisibleToUser(true);
                                }
                            }
                        }
                    }
                }
                return cVar;
            }
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
    }

    public final boolean m(MotionEvent motionEvent) {
        int i;
        AccessibilityManager accessibilityManager = this.f6705h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int n9 = n(motionEvent.getX(), motionEvent.getY());
                int i9 = this.f6708m;
                if (i9 != n9) {
                    this.f6708m = n9;
                    x(n9, 128);
                    x(i9, 256);
                }
                if (n9 == Integer.MIN_VALUE) {
                    return false;
                }
            } else if (action != 10 || (i = this.f6708m) == Integer.MIN_VALUE) {
                return false;
            } else {
                if (i != Integer.MIN_VALUE) {
                    this.f6708m = Integer.MIN_VALUE;
                    x(Integer.MIN_VALUE, 128);
                    x(i, 256);
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public abstract int n(float f9, float f10);

    public abstract void o(ArrayList arrayList);

    public final void p(int i) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f6705h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        AccessibilityEvent k9 = k(i, 2048);
        k9.setContentChangeTypes(0);
        parent.requestSendAccessibilityEvent(view, k9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(int r19, android.graphics.Rect r20) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.b.q(int, android.graphics.Rect):boolean");
    }

    public final r0.c r(int i) {
        if (i == -1) {
            View view = this.i;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            r0.c cVar = new r0.c(obtain);
            WeakHashMap weakHashMap = q0.f5172a;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            o(arrayList);
            if (obtain.getChildCount() <= 0 || arrayList.size() <= 0) {
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    cVar.f5491a.addChild(view, ((Integer) arrayList.get(i9)).intValue());
                }
                return cVar;
            }
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        return l(i);
    }

    public abstract boolean s(int i, int i9, Bundle bundle);

    public void t(r0.c cVar) {
    }

    public abstract void u(int i, r0.c cVar);

    public void v(int i, boolean z9) {
    }

    public final boolean w(int i) {
        int i9;
        View view = this.i;
        if ((view.isFocused() || view.requestFocus()) && (i9 = this.f6707l) != i) {
            if (i9 != Integer.MIN_VALUE) {
                j(i9);
            }
            if (i == Integer.MIN_VALUE) {
                return false;
            }
            this.f6707l = i;
            v(i, true);
            x(i, 8);
            return true;
        }
        return false;
    }

    public final void x(int i, int i9) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f6705h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, k(i, i9));
    }
}
