package a2;

import android.util.SparseArray;
import java.util.Set;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class y0 {

    /* renamed from: a  reason: collision with root package name */
    public SparseArray f546a;

    /* renamed from: b  reason: collision with root package name */
    public int f547b;

    /* renamed from: c  reason: collision with root package name */
    public Set f548c;

    public final x0 a(int i) {
        SparseArray sparseArray = this.f546a;
        x0 x0Var = (x0) sparseArray.get(i);
        if (x0Var == null) {
            x0 x0Var2 = new x0();
            sparseArray.put(i, x0Var2);
            return x0Var2;
        }
        return x0Var;
    }
}
