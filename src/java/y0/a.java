package y0;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import j6.o;
import java.util.WeakHashMap;
import q0.q0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class a extends o {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f6697c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(11);
        this.f6697c = bVar;
    }

    @Override // j6.o
    public final boolean F(int i, int i9, Bundle bundle) {
        int i10;
        b bVar = this.f6697c;
        View view = bVar.i;
        if (i == -1) {
            WeakHashMap weakHashMap = q0.f5172a;
            return view.performAccessibilityAction(i9, bundle);
        } else if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 64) {
                    if (i9 != 128) {
                        return bVar.s(i, i9, bundle);
                    }
                    if (bVar.f6706k == i) {
                        bVar.f6706k = Integer.MIN_VALUE;
                        view.invalidate();
                        bVar.x(i, 65536);
                        return true;
                    }
                    return false;
                }
                AccessibilityManager accessibilityManager = bVar.f6705h;
                if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i10 = bVar.f6706k) != i) {
                    if (i10 != Integer.MIN_VALUE) {
                        bVar.f6706k = Integer.MIN_VALUE;
                        view.invalidate();
                        bVar.x(i10, 65536);
                    }
                    bVar.f6706k = i;
                    view.invalidate();
                    bVar.x(i, 32768);
                    return true;
                }
                return false;
            }
            return bVar.j(i);
        } else {
            return bVar.w(i);
        }
    }

    @Override // j6.o
    public final r0.c p(int i) {
        return new r0.c(AccessibilityNodeInfo.obtain(this.f6697c.r(i).f5491a));
    }

    @Override // j6.o
    public final r0.c r(int i) {
        b bVar = this.f6697c;
        int i9 = i == 2 ? bVar.f6706k : bVar.f6707l;
        if (i9 == Integer.MIN_VALUE) {
            return null;
        }
        return p(i9);
    }
}
