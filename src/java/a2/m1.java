package a2;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class m1 extends q0.b {

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f398d;

    /* renamed from: e  reason: collision with root package name */
    public final l1 f399e;

    public m1(RecyclerView recyclerView) {
        this.f398d = recyclerView;
        l1 l1Var = this.f399e;
        if (l1Var != null) {
            this.f399e = l1Var;
        } else {
            this.f399e = new l1(this);
        }
    }

    @Override // q0.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f398d.O()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().U(accessibilityEvent);
        }
    }

    @Override // q0.b
    public final void d(View view, r0.c cVar) {
        this.f5094a.onInitializeAccessibilityNodeInfo(view, cVar.f5491a);
        RecyclerView recyclerView = this.f398d;
        if (recyclerView.O() || recyclerView.getLayoutManager() == null) {
            return;
        }
        t0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f488b;
        layoutManager.V(recyclerView2.c, recyclerView2.k0, cVar);
    }

    @Override // q0.b
    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f398d;
        if (recyclerView.O() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().i0(i, bundle);
    }
}
