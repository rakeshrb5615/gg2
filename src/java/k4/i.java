package k4;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class i implements h, l8.b, t2.b, t6.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3395a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3396b;

    public /* synthetic */ i(Object obj, int i) {
        this.f3395a = i;
        this.f3396b = obj;
    }

    public static i b(Object obj) {
        if (obj != null) {
            return new i(obj, 4);
        }
        throw new NullPointerException("instance cannot be null");
    }

    public static i c(boolean z9, int i, int i9, int i10, int i11) {
        return new i(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i9, i10, i11, false, z9), 2);
    }

    @Override // k4.j
    public Object a() {
        return this.f3396b;
    }

    @Override // g7.a
    public Object get() {
        switch (this.f3395a) {
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                return this.f3396b;
            default:
                return this.f3396b;
        }
    }
}
