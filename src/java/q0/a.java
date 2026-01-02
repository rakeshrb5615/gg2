package q0;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class a extends View.AccessibilityDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final b f5091a;

    public a(b bVar) {
        this.f5091a = bVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f5091a.a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        j6.o b10 = this.f5091a.b(view);
        if (b10 != null) {
            return (AccessibilityNodeProvider) b10.f3275b;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f5091a.c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        Object tag2;
        r0.c cVar = new r0.c(accessibilityNodeInfo);
        WeakHashMap weakHashMap = q0.f5172a;
        CharSequence charSequence = null;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = Boolean.valueOf(l0.c(view));
        } else {
            tag = view.getTag(2131362483);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        boolean z9 = true;
        cVar.m(bool != null && bool.booleanValue());
        if (Build.VERSION.SDK_INT >= 28) {
            tag2 = Boolean.valueOf(l0.b(view));
        } else {
            tag2 = view.getTag(2131362477);
            if (!Boolean.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        Boolean bool2 = (Boolean) tag2;
        cVar.k((bool2 == null || !bool2.booleanValue()) ? false : false);
        cVar.l(q0.f(view));
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            charSequence = n0.b(view);
        } else {
            Object tag3 = view.getTag(2131362484);
            if (CharSequence.class.isInstance(tag3)) {
                charSequence = tag3;
            }
        }
        CharSequence charSequence2 = charSequence;
        if (i >= 30) {
            e0.b.j(accessibilityNodeInfo, charSequence2);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence2);
        }
        this.f5091a.d(view, cVar);
        accessibilityNodeInfo.getText();
        List list = (List) view.getTag(2131362475);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            cVar.b((r0.b) list.get(i9));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f5091a.e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f5091a.f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f5091a.g(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.f5091a.h(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f5091a.i(view, accessibilityEvent);
    }
}
