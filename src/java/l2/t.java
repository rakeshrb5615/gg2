package l2;

import a2.w0;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class t extends w0 {
    @Override // a2.w0
    public final void a(RecyclerView recyclerView, int i) {
        int i9 = 0;
        if (i != 0) {
            if (i == 1 || i == 2) {
                while (i9 < recyclerView.getChildCount()) {
                    View childAt = recyclerView.getChildAt(i9);
                    childAt.animate().cancel();
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    i9++;
                }
                return;
            }
            return;
        }
        boolean z9 = recyclerView.getResources().getConfiguration().orientation == 1;
        while (i9 < recyclerView.getChildCount()) {
            View childAt2 = recyclerView.getChildAt(i9);
            childAt2.animate().cancel();
            float f9 = -10.0f;
            float f10 = z9 ? -10.0f : 0.0f;
            if (z9) {
                f9 = 0.0f;
            }
            childAt2.animate().setDuration(50L).setInterpolator(new AccelerateDecelerateInterpolator()).translationXBy(f10).translationYBy(f9).withEndAction(new k(childAt2, f10, f9, 0)).start();
            i9++;
        }
    }
}
