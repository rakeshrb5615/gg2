package i2;

import a2.k1;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class t0 extends a2.i0 {

    /* renamed from: d  reason: collision with root package name */
    public int f2519d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f2520e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f2521f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList f2522g;

    /* renamed from: h  reason: collision with root package name */
    public final l2.f f2523h;
    public final RecyclerView i;

    public t0(ArrayList arrayList, l2.f fVar, Context context, RecyclerView recyclerView) {
        this.f2522g = new ArrayList(arrayList);
        this.f2523h = fVar;
        this.f2520e = context;
        this.i = recyclerView;
        this.f2521f = new ArrayList(Collections.nCopies(arrayList.size(), Float.valueOf(1.0f)));
    }

    @Override // a2.i0
    public final int a() {
        return Integer.MAX_VALUE;
    }

    @Override // a2.i0
    public final void c(k1 k1Var, int i) {
        s0 s0Var = (s0) k1Var;
        ArrayList arrayList = this.f2522g;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        final int size = i % this.f2522g.size();
        ImageButton imageButton = s0Var.f2516u;
        View view = s0Var.f376a;
        imageButton.setImageBitmap((Bitmap) this.f2522g.get(size));
        Context context = this.f2520e;
        boolean z9 = context.getResources().getConfiguration().orientation == 1;
        if (this.f2519d == 0) {
            if (z9) {
                this.f2519d = context.getResources().getDisplayMetrics().widthPixels;
            } else {
                this.f2519d = context.getResources().getDisplayMetrics().heightPixels;
            }
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = 0;
        marginLayoutParams.rightMargin = 0;
        view.setLayoutParams(marginLayoutParams);
        float floatValue = ((Float) this.f2521f.get(i % this.f2521f.size())).floatValue();
        imageButton.setScaleX(floatValue);
        imageButton.setScaleY(floatValue);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: i2.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                float scaleX = view2.getScaleX();
                float f9 = 0.95f * scaleX;
                view2.animate().scaleX(f9).scaleY(f9).setDuration(80).withEndAction(new r(view2, scaleX, 1)).start();
                l2.f fVar = t0.this.f2523h;
                if (fVar != null) {
                    l2.a0 a0Var = fVar.f3682a;
                    int i9 = a0Var.f3590p;
                    int i10 = size;
                    boolean z10 = i9 == i10;
                    a0Var.f3613v.edit().putInt(a0Var.B1, a0Var.f3597r).apply();
                    if (z10) {
                        if (i10 == 7) {
                            a0Var.f3613v.edit().putInt(a0Var.z0, 100).apply();
                        }
                        if (i10 == a0Var.f3613v.getInt(a0Var.z0, 0)) {
                            a0Var.f3613v.edit().putString(a0Var.A0, String.valueOf(k0.f2392a.nextInt(900000))).apply();
                        }
                        a0Var.f3613v.edit().putInt(a0Var.z0, i10).apply();
                        a0Var.f3549c1 = i10;
                        a0Var.r();
                    }
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [a2.k1, i2.s0] */
    @Override // a2.i0
    public final k1 d(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131558464, viewGroup, false);
        ?? k1Var = new k1(inflate);
        k1Var.f2516u = (ImageButton) inflate.findViewById(2131362509);
        return k1Var;
    }

    @Override // a2.i0
    public final void e(k1 k1Var) {
        ((s0) k1Var).f2516u.setImageBitmap(null);
    }
}
