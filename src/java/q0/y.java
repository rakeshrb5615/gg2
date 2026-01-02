package q0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final x f5203a;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, q0.x] */
    public y(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f5203a = new w(nestedScrollView);
        } else {
            this.f5203a = new Object();
        }
    }
}
