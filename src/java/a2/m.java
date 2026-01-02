package a2;

import android.view.View;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class m extends w0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f396a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f397b;

    public /* synthetic */ m(Object obj, int i) {
        this.f396a = i;
        this.f397b = obj;
    }

    private final void c(RecyclerView recyclerView, int i) {
    }

    @Override // a2.w0
    public void a(RecyclerView recyclerView, int i) {
        int i9 = this.f396a;
    }

    @Override // a2.w0
    public final void b(RecyclerView recyclerView, int i, int i9) {
        float y9;
        int height;
        switch (this.f396a) {
            case 0:
                p pVar = (p) this.f397b;
                int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int i10 = pVar.f415a;
                int computeVerticalScrollRange = pVar.f430s.computeVerticalScrollRange();
                int i11 = pVar.f429r;
                pVar.f431t = computeVerticalScrollRange - i11 > 0 && i11 >= i10;
                int computeHorizontalScrollRange = pVar.f430s.computeHorizontalScrollRange();
                int i12 = pVar.q;
                boolean z9 = computeHorizontalScrollRange - i12 > 0 && i12 >= i10;
                pVar.f432u = z9;
                boolean z10 = pVar.f431t;
                if (!z10 && !z9) {
                    if (pVar.f433v != 0) {
                        pVar.f(0);
                        return;
                    }
                    return;
                }
                if (z10) {
                    float f9 = i11;
                    pVar.f424l = (int) ((((f9 / 2.0f) + computeVerticalScrollOffset) * f9) / computeVerticalScrollRange);
                    pVar.f423k = Math.min(i11, (i11 * i11) / computeVerticalScrollRange);
                }
                if (pVar.f432u) {
                    float f10 = computeHorizontalScrollOffset;
                    float f11 = i12;
                    pVar.f427o = (int) ((((f11 / 2.0f) + f10) * f11) / computeHorizontalScrollRange);
                    pVar.f426n = Math.min(i12, (i12 * i12) / computeHorizontalScrollRange);
                }
                int i13 = pVar.f433v;
                if (i13 == 0 || i13 == 1) {
                    pVar.f(1);
                    return;
                }
                return;
            default:
                l2.a0 a0Var = (l2.a0) this.f397b;
                if (a0Var.isAdded()) {
                    recyclerView.post(new androidx.lifecycle.g0(this, 12));
                    a0Var.q = a0Var.f3570i2.N0();
                    int O0 = a0Var.f3570i2.O0();
                    int i14 = (a0Var.q + O0) / 2;
                    a0Var.f3597r = i14;
                    int size = a0Var.f3601s.size();
                    a0Var.f3590p = ((i14 % size) + size) % size;
                    i2.t0 t0Var = a0Var.f3564g2;
                    RecyclerView recyclerView2 = t0Var.i;
                    boolean z11 = t0Var.f2520e.getResources().getConfiguration().orientation == 1;
                    int width = z11 ? recyclerView2.getWidth() : recyclerView2.getHeight();
                    int i15 = width / 2;
                    for (int i16 = a0Var.q; i16 <= O0; i16++) {
                        k1 H = recyclerView2.H(i16);
                        if (H != null) {
                            View view = H.f376a;
                            if (z11) {
                                y9 = view.getX();
                                height = view.getWidth();
                            } else {
                                y9 = view.getY();
                                height = view.getHeight();
                            }
                            float cos = (1.2f * ((float) ((Math.cos(Math.min((width == 0 ? 0.0f : Math.abs(((int) ((height / 2.0f) + y9)) - i15) / width) * 2.0f, 1.0f) * 3.1415927f) + 1.0d) / 2.0d))) + 0.3f;
                            t0Var.f2521f.set(i16 % t0Var.f2522g.size(), Float.valueOf(cos));
                            ImageButton imageButton = (ImageButton) view.findViewById(2131362509);
                            if (imageButton != null) {
                                imageButton.setScaleX(cos);
                                imageButton.setScaleY(cos);
                            }
                        }
                    }
                    recyclerView.postInvalidateOnAnimation();
                    return;
                }
                return;
        }
    }
}
