package r0;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import q0.a0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f5478e;

    /* renamed from: f  reason: collision with root package name */
    public static final b f5479f;

    /* renamed from: g  reason: collision with root package name */
    public static final b f5480g;

    /* renamed from: h  reason: collision with root package name */
    public static final b f5481h;
    public static final b i;
    public static final b j;

    /* renamed from: k  reason: collision with root package name */
    public static final b f5482k;

    /* renamed from: l  reason: collision with root package name */
    public static final b f5483l;

    /* renamed from: m  reason: collision with root package name */
    public static final b f5484m;

    /* renamed from: n  reason: collision with root package name */
    public static final b f5485n;

    /* renamed from: o  reason: collision with root package name */
    public static final b f5486o;

    /* renamed from: a  reason: collision with root package name */
    public final Object f5487a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5488b;

    /* renamed from: c  reason: collision with root package name */
    public final Class f5489c;

    /* renamed from: d  reason: collision with root package name */
    public final l f5490d;

    static {
        new b(1, (String) null);
        new b(2, (String) null);
        new b(4, (String) null);
        new b(8, (String) null);
        f5478e = new b(16, (String) null);
        new b(32, (String) null);
        new b(64, (String) null);
        new b(128, (String) null);
        new b(256, e.class);
        new b(512, e.class);
        new b(1024, f.class);
        new b(2048, f.class);
        f5479f = new b(4096, (String) null);
        f5480g = new b(8192, (String) null);
        new b(16384, (String) null);
        new b(32768, (String) null);
        new b(65536, (String) null);
        new b(131072, j.class);
        f5481h = new b(262144, (String) null);
        i = new b(524288, (String) null);
        j = new b(1048576, (String) null);
        new b(2097152, k.class);
        int i9 = Build.VERSION.SDK_INT;
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
        f5482k = new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, h.class);
        f5483l = new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
        f5484m = new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
        new b(i9 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
        new b(i9 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
        new b(i9 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
        new b(i9 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
        f5485n = new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, null, null, i.class);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, 16908354, null, null, g.class);
        new b(i9 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
        new b(i9 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, null, null, null);
        new b(i9 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
        new b(i9 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, null, null, null);
        new b(i9 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, 16908373, null, null, null);
        new b(i9 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, 16908374, null, null, null);
        new b(i9 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, 16908375, null, null, null);
        new b(i9 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, 16908376, null, null, null);
        f5486o = new b(i9 >= 34 ? a0.a() : null, 16908382, null, null, null);
    }

    public b(int i9, String str) {
        this(null, i9, str, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f5487a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof b)) {
            Object obj2 = ((b) obj).f5487a;
            Object obj3 = this.f5487a;
            return obj3 == null ? obj2 == null : obj3.equals(obj2);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f5487a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d9 = c.d(this.f5488b);
        if (d9.equals("ACTION_UNKNOWN")) {
            Object obj = this.f5487a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d9 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d9);
        return sb.toString();
    }

    public b(int i9, Class cls) {
        this(null, i9, null, null, cls);
    }

    public b(Object obj, int i9, CharSequence charSequence, l lVar, Class cls) {
        this.f5488b = i9;
        this.f5490d = lVar;
        if (obj == null) {
            this.f5487a = new AccessibilityNodeInfo.AccessibilityAction(i9, charSequence);
        } else {
            this.f5487a = obj;
        }
        this.f5489c = cls;
    }
}
