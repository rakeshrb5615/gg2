package f3;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final /* synthetic */ class a implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1487a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1488b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b0.a f1489c;

    public /* synthetic */ a(b0.a aVar, View view, int i) {
        this.f1487a = i;
        this.f1489c = aVar;
        this.f1488b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z9) {
        switch (this.f1487a) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = this.f1489c;
                if (z9 && hideBottomViewOnScrollBehavior.j == 1) {
                    hideBottomViewOnScrollBehavior.v(this.f1488b);
                    return;
                }
                return;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = this.f1489c;
                if (z9 && hideViewOnScrollBehavior.j == 1) {
                    hideViewOnScrollBehavior.w(this.f1488b);
                    return;
                }
                return;
        }
    }
}
