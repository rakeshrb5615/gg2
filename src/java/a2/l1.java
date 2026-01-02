package a2;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class l1 extends q0.b {

    /* renamed from: d  reason: collision with root package name */
    public final m1 f394d;

    /* renamed from: e  reason: collision with root package name */
    public final WeakHashMap f395e = new WeakHashMap();

    public l1(m1 m1Var) {
        this.f394d = m1Var;
    }

    @Override // q0.b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        q0.b bVar = (q0.b) this.f395e.get(view);
        return bVar != null ? bVar.a(view, accessibilityEvent) : this.f5094a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // q0.b
    public final j6.o b(View view) {
        q0.b bVar = (q0.b) this.f395e.get(view);
        return bVar != null ? bVar.b(view) : super.b(view);
    }

    @Override // q0.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        q0.b bVar = (q0.b) this.f395e.get(view);
        if (bVar != null) {
            bVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // q0.b
    public final void d(View view, r0.c cVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f5491a;
        m1 m1Var = this.f394d;
        RecyclerView recyclerView = m1Var.f398d;
        RecyclerView recyclerView2 = m1Var.f398d;
        boolean O = recyclerView.O();
        View.AccessibilityDelegate accessibilityDelegate = this.f5094a;
        if (O || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().X(view, cVar);
        q0.b bVar = (q0.b) this.f395e.get(view);
        if (bVar != null) {
            bVar.d(view, cVar);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // q0.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        q0.b bVar = (q0.b) this.f395e.get(view);
        if (bVar != null) {
            bVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // q0.b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        q0.b bVar = (q0.b) this.f395e.get(viewGroup);
        return bVar != null ? bVar.f(viewGroup, view, accessibilityEvent) : this.f5094a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // q0.b
    public final boolean g(View view, int i, Bundle bundle) {
        m1 m1Var = this.f394d;
        RecyclerView recyclerView = m1Var.f398d;
        RecyclerView recyclerView2 = m1Var.f398d;
        if (recyclerView.O() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i, bundle);
        }
        q0.b bVar = (q0.b) this.f395e.get(view);
        if (bVar != null) {
            if (bVar.g(view, i, bundle)) {
                return true;
            }
        } else if (super.g(view, i, bundle)) {
            return true;
        }
        z0 z0Var = recyclerView2.getLayoutManager().f488b.c;
        return false;
    }

    @Override // q0.b
    public final void h(View view, int i) {
        q0.b bVar = (q0.b) this.f395e.get(view);
        if (bVar != null) {
            bVar.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // q0.b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        q0.b bVar = (q0.b) this.f395e.get(view);
        if (bVar != null) {
            bVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
