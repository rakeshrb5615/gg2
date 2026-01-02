package q0;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public class b {

    /* renamed from: c  reason: collision with root package name */
    public static final View.AccessibilityDelegate f5093c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f5094a;

    /* renamed from: b  reason: collision with root package name */
    public final a f5095b;

    public b() {
        this(f5093c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f5094a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public j6.o b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f5094a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new j6.o(accessibilityNodeProvider, 11);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f5094a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, r0.c cVar) {
        this.f5094a.onInitializeAccessibilityNodeInfo(view, cVar.f5491a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f5094a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f5094a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i, Bundle bundle) {
        boolean z9;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(2131362475);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z10 = false;
        int i9 = 0;
        while (true) {
            if (i9 >= list.size()) {
                break;
            }
            r0.b bVar = (r0.b) list.get(i9);
            if (bVar.a() == i) {
                Class cls = bVar.f5489c;
                r0.l lVar = bVar.f5490d;
                if (lVar != null) {
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e9) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e9);
                        }
                    }
                    z9 = lVar.a(view);
                }
            } else {
                i9++;
            }
        }
        z9 = false;
        if (!z9) {
            z9 = this.f5094a.performAccessibilityAction(view, i, bundle);
        }
        if (z9 || i != 2131361810 || bundle == null) {
            return z9;
        }
        int i10 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(2131362476);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i10)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i11 = 0;
            while (true) {
                if (clickableSpanArr == null || i11 >= clickableSpanArr.length) {
                    break;
                } else if (clickableSpan.equals(clickableSpanArr[i11])) {
                    clickableSpan.onClick(view);
                    z10 = true;
                    break;
                } else {
                    i11++;
                }
            }
        }
        return z10;
    }

    public void h(View view, int i) {
        this.f5094a.sendAccessibilityEvent(view, i);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f5094a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f5094a = accessibilityDelegate;
        this.f5095b = new a(this);
    }
}
