package k7;

import java.util.Comparator;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class a implements Comparator {

    /* renamed from: b  reason: collision with root package name */
    public static final a f3424b = new a(0);

    /* renamed from: c  reason: collision with root package name */
    public static final a f3425c = new a(1);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3426a;

    public /* synthetic */ a(int i) {
        this.f3426a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f3426a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                j.e(comparable, "a");
                j.e(comparable2, "b");
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                j.e(comparable3, "a");
                j.e(comparable4, "b");
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f3426a) {
            case 0:
                return f3425c;
            default:
                return f3424b;
        }
    }
}
