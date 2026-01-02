package f3;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class c extends q4.b {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f1492f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i) {
        super(6);
        this.f1492f = i;
    }

    @Override // q4.b
    public final ViewPropertyAnimator A(View view, int i) {
        switch (this.f1492f) {
            case 0:
                return view.animate().translationY(i);
            case 1:
                return view.animate().translationX(-i);
            default:
                return view.animate().translationX(i);
        }
    }

    @Override // q4.b
    public final int x(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int measuredHeight;
        int i;
        switch (this.f1492f) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i = marginLayoutParams.rightMargin;
                break;
        }
        return measuredHeight + i;
    }

    @Override // q4.b
    public final int z() {
        switch (this.f1492f) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 0;
        }
    }
}
