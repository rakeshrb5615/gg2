package f3;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import d1.h;
import m.d0;
import m.g;
import z3.o;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class b implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1490a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1491b;

    public /* synthetic */ b(Object obj, int i) {
        this.f1490a = i;
        this.f1491b = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f1490a) {
            case 0:
            case 1:
            case 2:
            case h.INTEGER_FIELD_NUMBER /* 3 */:
                return;
            default:
                o oVar = (o) this.f1491b;
                AccessibilityManager accessibilityManager = oVar.f7241z;
                if (oVar.A == null || accessibilityManager == null || !oVar.isAttachedToWindow()) {
                    return;
                }
                accessibilityManager.addTouchExplorationStateChangeListener(oVar.A);
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        switch (this.f1490a) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f1491b;
                a aVar = hideBottomViewOnScrollBehavior.h;
                if (aVar == null || (accessibilityManager = hideBottomViewOnScrollBehavior.g) == null) {
                    return;
                }
                accessibilityManager.removeTouchExplorationStateChangeListener(aVar);
                hideBottomViewOnScrollBehavior.h = null;
                return;
            case 1:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f1491b;
                a aVar2 = hideViewOnScrollBehavior.c;
                if (aVar2 == null || (accessibilityManager2 = hideViewOnScrollBehavior.b) == null) {
                    return;
                }
                accessibilityManager2.removeTouchExplorationStateChangeListener(aVar2);
                hideViewOnScrollBehavior.c = null;
                return;
            case 2:
                g gVar = (g) this.f1491b;
                ViewTreeObserver viewTreeObserver = gVar.D;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        gVar.D = view.getViewTreeObserver();
                    }
                    gVar.D.removeGlobalOnLayoutListener(gVar.f3848o);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case h.INTEGER_FIELD_NUMBER /* 3 */:
                d0 d0Var = (d0) this.f1491b;
                ViewTreeObserver viewTreeObserver2 = d0Var.f3827u;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        d0Var.f3827u = view.getViewTreeObserver();
                    }
                    d0Var.f3827u.removeGlobalOnLayoutListener(d0Var.f3822o);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                o oVar = (o) this.f1491b;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = oVar.A;
                if (touchExplorationStateChangeListener == null || (accessibilityManager3 = oVar.f7241z) == null) {
                    return;
                }
                accessibilityManager3.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                return;
        }
    }
}
