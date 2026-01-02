package y3;

import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class j extends h {
    public static final int[] C = {2130969755, 2130969757};
    public final AccessibilityManager A;
    public boolean B;

    public j(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.A = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public final int g() {
        int i = this.f6816k;
        if (i != -2) {
            int i9 = Build.VERSION.SDK_INT;
            AccessibilityManager accessibilityManager = this.A;
            if (i9 >= 29) {
                return accessibilityManager.getRecommendedTimeoutMillis(i, (this.B ? 4 : 0) | 3);
            } else if (!this.B || !accessibilityManager.isTouchExplorationEnabled()) {
                return i;
            }
        }
        return -2;
    }
}
