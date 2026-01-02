package z;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f7078a;

    /* renamed from: b  reason: collision with root package name */
    public int f7079b;

    /* renamed from: c  reason: collision with root package name */
    public int f7080c;

    /* renamed from: d  reason: collision with root package name */
    public int f7081d;

    /* renamed from: e  reason: collision with root package name */
    public int f7082e;

    /* renamed from: f  reason: collision with root package name */
    public int f7083f;

    /* renamed from: g  reason: collision with root package name */
    public int f7084g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f7085h;

    public f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f7085h = constraintLayout;
        this.f7078a = constraintLayout2;
    }

    public static boolean a(int i, int i9, int i10) {
        if (i == i9) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i10 == size;
        }
        return false;
    }

    public final void b(w.d dVar, x.b bVar) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        boolean z9;
        int measuredWidth;
        int baseline;
        int i;
        if (dVar == null) {
            return;
        }
        w.c cVar = dVar.K;
        w.c cVar2 = dVar.I;
        if (dVar.f6358g0 == 8) {
            bVar.f6494e = 0;
            bVar.f6495f = 0;
            bVar.f6496g = 0;
        } else if (dVar.T == null) {
        } else {
            s sVar = ConstraintLayout.v;
            int i9 = bVar.f6490a;
            int i10 = bVar.f6491b;
            int i11 = bVar.f6492c;
            int i12 = bVar.f6493d;
            int i13 = this.f7079b + this.f7080c;
            int i14 = this.f7081d;
            View view = dVar.f0;
            int c9 = u.e.c(i9);
            if (c9 == 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            } else if (c9 == 1) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f7083f, i14, -2);
            } else if (c9 == 2) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f7083f, i14, -2);
                boolean z10 = dVar.f6374r == 1;
                int i15 = bVar.j;
                if (i15 == 1 || i15 == 2) {
                    boolean z11 = view.getMeasuredHeight() == dVar.k();
                    if (bVar.j == 2 || !z10 || ((z10 && z11) || dVar.A())) {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dVar.q(), 1073741824);
                    }
                }
            } else if (c9 != 3) {
                makeMeasureSpec = 0;
            } else {
                int i16 = this.f7083f;
                int i17 = cVar2 != null ? cVar2.f6344g : 0;
                if (cVar != null) {
                    i17 += cVar.f6344g;
                }
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(i16, i14 + i17, -1);
            }
            int c10 = u.e.c(i10);
            if (c10 == 0) {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            } else if (c10 == 1) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f7084g, i13, -2);
            } else if (c10 == 2) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f7084g, i13, -2);
                boolean z12 = dVar.f6375s == 1;
                int i18 = bVar.j;
                if (i18 == 1 || i18 == 2) {
                    boolean z13 = view.getMeasuredWidth() == dVar.q();
                    if (bVar.j == 2 || !z12 || ((z12 && z13) || dVar.B())) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dVar.k(), 1073741824);
                    }
                }
            } else if (c10 != 3) {
                makeMeasureSpec2 = 0;
            } else {
                int i19 = this.f7084g;
                int i20 = cVar2 != null ? dVar.J.f6344g : 0;
                if (cVar != null) {
                    i20 += dVar.L.f6344g;
                }
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i19, i13 + i20, -1);
            }
            w.e eVar = (w.e) dVar.T;
            ConstraintLayout constraintLayout = this.f7085h;
            if (eVar != null && w.j.c(constraintLayout.o, 256) && view.getMeasuredWidth() == dVar.q() && view.getMeasuredWidth() < eVar.q() && view.getMeasuredHeight() == dVar.k() && view.getMeasuredHeight() < eVar.k() && view.getBaseline() == dVar.f6347a0 && !dVar.z() && a(dVar.G, makeMeasureSpec, dVar.q()) && a(dVar.H, makeMeasureSpec2, dVar.k())) {
                bVar.f6494e = dVar.q();
                bVar.f6495f = dVar.k();
                bVar.f6496g = dVar.f6347a0;
                return;
            }
            boolean z14 = i9 == 3;
            boolean z15 = i10 == 3;
            boolean z16 = i10 == 4 || i10 == 1;
            boolean z17 = i9 == 4 || i9 == 1;
            boolean z18 = z14 && dVar.W > 0.0f;
            boolean z19 = z15 && dVar.W > 0.0f;
            if (view == null) {
                return;
            }
            e eVar2 = (e) view.getLayoutParams();
            int i21 = bVar.j;
            if (i21 != 1 && i21 != 2 && z14 && dVar.f6374r == 0 && z15 && dVar.f6375s == 0) {
                z9 = false;
                measuredWidth = 0;
                baseline = 0;
                i = -1;
                max = 0;
            } else {
                if ((view instanceof t) && (dVar instanceof w.g)) {
                    ((t) view).j((w.g) dVar, makeMeasureSpec, makeMeasureSpec2);
                } else {
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                }
                dVar.G = makeMeasureSpec;
                dVar.H = makeMeasureSpec2;
                dVar.f6357g = false;
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                int baseline2 = view.getBaseline();
                int i22 = dVar.f6377u;
                int max2 = i22 > 0 ? Math.max(i22, measuredWidth2) : measuredWidth2;
                int i23 = dVar.f6378v;
                if (i23 > 0) {
                    max2 = Math.min(i23, max2);
                }
                int i24 = dVar.f6380x;
                max = i24 > 0 ? Math.max(i24, measuredHeight) : measuredHeight;
                int i25 = makeMeasureSpec2;
                int i26 = dVar.f6381y;
                if (i26 > 0) {
                    max = Math.min(i26, max);
                }
                if (!w.j.c(constraintLayout.o, 1)) {
                    if (z18 && z16) {
                        max2 = (int) ((max * dVar.W) + 0.5f);
                    } else if (z19 && z17) {
                        max = (int) ((max2 / dVar.W) + 0.5f);
                    }
                }
                if (measuredWidth2 == max2 && measuredHeight == max) {
                    baseline = baseline2;
                    measuredWidth = max2;
                    z9 = false;
                } else {
                    if (measuredWidth2 != max2) {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max2, 1073741824);
                    }
                    int makeMeasureSpec3 = measuredHeight != max ? View.MeasureSpec.makeMeasureSpec(max, 1073741824) : i25;
                    view.measure(makeMeasureSpec, makeMeasureSpec3);
                    dVar.G = makeMeasureSpec;
                    dVar.H = makeMeasureSpec3;
                    z9 = false;
                    dVar.f6357g = false;
                    measuredWidth = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    max = measuredHeight2;
                }
                i = -1;
            }
            boolean z20 = baseline != i ? true : z9;
            bVar.i = (measuredWidth == bVar.f6492c && max == bVar.f6493d) ? z9 : true;
            boolean z21 = eVar2.f7046c0 ? true : z20;
            if (z21 && baseline != -1 && dVar.f6347a0 != baseline) {
                bVar.i = true;
            }
            bVar.f6494e = measuredWidth;
            bVar.f6495f = max;
            bVar.f6497h = z21;
            bVar.f6496g = baseline;
        }
    }
}
