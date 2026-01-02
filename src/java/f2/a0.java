package f2;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class a0 {

    /* renamed from: b  reason: collision with root package name */
    public final View f1400b;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f1399a = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f1401c = new ArrayList();

    public a0(View view) {
        this.f1400b = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            return this.f1400b == a0Var.f1400b && this.f1399a.equals(a0Var.f1399a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1399a.hashCode() + (this.f1400b.hashCode() * 31);
    }

    public final String toString() {
        HashMap hashMap;
        String d9 = g2.g.d(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f1400b + "\n", "    values:");
        for (String str : this.f1399a.keySet()) {
            d9 = d9 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return d9;
    }
}
