package r0;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import j6.o;
import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class d extends AccessibilityNodeProvider {

    /* renamed from: a  reason: collision with root package name */
    public final o f5493a;

    public d(o oVar) {
        this.f5493a = oVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f5493a.getClass();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        c p8 = this.f5493a.p(i);
        if (p8 == null) {
            return null;
        }
        return p8.f5491a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f5493a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        c r8 = this.f5493a.r(i);
        if (r8 == null) {
            return null;
        }
        return r8.f5491a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i9, Bundle bundle) {
        return this.f5493a.F(i, i9, bundle);
    }
}
