package g0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import l2.a0;
import l2.u;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1628a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f1629b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1630c;

    public /* synthetic */ k(Object obj, int i, int i9) {
        this.f1628a = i9;
        this.f1630c = obj;
        this.f1629b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1628a) {
            case 0:
                ((b) this.f1630c).h(this.f1629b);
                return;
            case 1:
                ((View) this.f1630c).setVisibility(this.f1629b);
                return;
            case 2:
                ScrollView scrollView = (ScrollView) this.f1630c;
                int height = scrollView.getHeight();
                int i = this.f1629b;
                if (height > i) {
                    ViewGroup.LayoutParams layoutParams = scrollView.getLayoutParams();
                    layoutParams.height = i;
                    scrollView.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                a0 a0Var = (a0) this.f1630c;
                a0Var.f3564g2.getClass();
                int i9 = this.f1629b;
                if (i9 == 0) {
                    i9 = a0Var.f3601s.size() * 2000;
                }
                a0Var.f3567h2.addOnLayoutChangeListener(new u(a0Var, i9));
                return;
            case 4:
                a0 a0Var2 = ((u) this.f1630c).f3733b;
                LinearLayoutManager linearLayoutManager = a0Var2.f3570i2;
                int i10 = this.f1629b;
                View q = linearLayoutManager.q(i10);
                if (q != null) {
                    int width = q.getWidth();
                    a0Var2.f3570i2.d1(i10, (a0Var2.f3567h2.getWidth() / 2) - ((int) (width * 0.38f)));
                    return;
                }
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1630c;
                View view = (View) sideSheetBehavior.p.get();
                if (view != null) {
                    sideSheetBehavior.y(view, this.f1629b, false);
                    return;
                }
                return;
        }
    }
}
