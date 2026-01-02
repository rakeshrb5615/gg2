package y0;

import android.graphics.Rect;
import java.util.Comparator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class c implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f6709a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public final Rect f6710b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public final boolean f6711c;

    /* renamed from: d  reason: collision with root package name */
    public final c5.c f6712d;

    public c(boolean z9, c5.c cVar) {
        this.f6711c = z9;
        this.f6712d = cVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f6712d.getClass();
        Rect rect = this.f6709a;
        ((r0.c) obj).f(rect);
        Rect rect2 = this.f6710b;
        ((r0.c) obj2).f(rect2);
        int i = rect.top;
        int i9 = rect2.top;
        if (i < i9) {
            return -1;
        }
        if (i > i9) {
            return 1;
        }
        int i10 = rect.left;
        int i11 = rect2.left;
        boolean z9 = this.f6711c;
        if (i10 < i11) {
            return z9 ? 1 : -1;
        } else if (i10 > i11) {
            return z9 ? -1 : 1;
        } else {
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            if (i12 < i13) {
                return -1;
            }
            if (i12 > i13) {
                return 1;
            }
            int i14 = rect.right;
            int i15 = rect2.right;
            if (i14 < i15) {
                return z9 ? 1 : -1;
            } else if (i14 > i15) {
                return z9 ? -1 : 1;
            } else {
                return 0;
            }
        }
    }
}
