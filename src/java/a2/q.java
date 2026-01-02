package a2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class q implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f445a;

    public /* synthetic */ q(int i) {
        this.f445a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f445a) {
            case 0:
                s sVar = (s) obj;
                s sVar2 = (s) obj2;
                RecyclerView recyclerView = sVar.f469d;
                if ((recyclerView == null) == (sVar2.f469d == null)) {
                    boolean z9 = sVar.f466a;
                    if (z9 == sVar2.f466a) {
                        int i = sVar2.f467b - sVar.f467b;
                        if (i != 0) {
                            return i;
                        }
                        int i9 = sVar.f468c - sVar2.f468c;
                        if (i9 != 0) {
                            return i9;
                        }
                        return 0;
                    } else if (!z9) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            case 1:
                WeakHashMap weakHashMap = q0.q0.f5172a;
                float f9 = q0.i0.f((View) obj);
                float f10 = q0.i0.f((View) obj2);
                if (f9 > f10) {
                    return -1;
                }
                return f9 < f10 ? 1 : 0;
            case 2:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                return ((u.f) obj).f6020b - ((u.f) obj2).f6020b;
            case 4:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            default:
                x8.y yVar = ((y8.j) obj).f6996a;
                x8.y yVar2 = ((y8.j) obj2).f6996a;
                if (yVar == yVar2) {
                    return 0;
                }
                if (yVar == null) {
                    return -1;
                }
                if (yVar2 == null) {
                    return 1;
                }
                return yVar.compareTo(yVar2);
        }
    }
}
