package a2;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class f0 extends b0 {
    public final /* synthetic */ int q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ c0 f318r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(c0 c0Var, Context context, int i) {
        super(context);
        this.q = i;
        this.f318r = c0Var;
    }

    @Override // a2.b0
    public final float d(DisplayMetrics displayMetrics) {
        int i;
        switch (this.q) {
            case 0:
                i = displayMetrics.densityDpi;
                break;
            default:
                i = displayMetrics.densityDpi;
                break;
        }
        return 100.0f / i;
    }

    @Override // a2.b0
    public int e(int i) {
        switch (this.q) {
            case 0:
                return Math.min(100, super.e(i));
            default:
                return super.e(i);
        }
    }

    @Override // a2.b0
    public final void h(View view, e1 e1Var) {
        switch (this.q) {
            case 0:
                c0 c0Var = this.f318r;
                int[] b10 = c0Var.b(c0Var.f285a.getLayoutManager(), view);
                int i = b10[0];
                int i9 = b10[1];
                int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i9))) / 0.3356d);
                if (ceil > 0) {
                    e1Var.f306a = i;
                    e1Var.f307b = i9;
                    e1Var.f308c = ceil;
                    e1Var.f310e = this.j;
                    e1Var.f311f = true;
                    return;
                }
                return;
            default:
                c0 c0Var2 = this.f318r;
                RecyclerView recyclerView = c0Var2.f285a;
                if (recyclerView == null) {
                    return;
                }
                int[] b11 = c0Var2.b(recyclerView.getLayoutManager(), view);
                int i10 = b11[0];
                int i11 = b11[1];
                int ceil2 = (int) Math.ceil(e(Math.max(Math.abs(i10), Math.abs(i11))) / 0.3356d);
                if (ceil2 > 0) {
                    e1Var.f306a = i10;
                    e1Var.f307b = i11;
                    e1Var.f308c = ceil2;
                    e1Var.f310e = this.j;
                    e1Var.f311f = true;
                    return;
                }
                return;
        }
    }
}
