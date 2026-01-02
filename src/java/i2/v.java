package i2;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.chilllive.chillwallpaperproject.MainActivity;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2527a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2528b;

    public /* synthetic */ v(View view, int i) {
        this.f2527a = i;
        this.f2528b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2527a;
        View view = this.f2528b;
        switch (i) {
            case 0:
                view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(50).start();
                return;
            case 1:
                view.setVisibility(8);
                return;
            case 2:
                int i9 = MainActivity.f958u0;
                view.setVisibility(8);
                return;
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                int i10 = MainActivity.f958u0;
                view.setVisibility(8);
                return;
            default:
                ((InputMethodManager) e0.c.getSystemService(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
        }
    }
}
