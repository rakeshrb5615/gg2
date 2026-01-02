package j3;

import a2.q0;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class b extends q0 {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f2857a;

    /* renamed from: b  reason: collision with root package name */
    public final List f2858b;

    public b() {
        Paint paint = new Paint();
        this.f2857a = paint;
        this.f2858b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // a2.q0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int D;
        int E;
        int i;
        int i9;
        float dimension = recyclerView.getResources().getDimension(2131165442);
        Paint paint = this.f2857a;
        paint.setStrokeWidth(dimension);
        for (d dVar : this.f2858b) {
            dVar.getClass();
            paint.setColor(h0.a.d(-65281, -16776961, 0.0f));
            if (recyclerView.getLayoutManager().E0()) {
                c cVar = recyclerView.getLayoutManager().q;
                switch (cVar.f2860b) {
                    case 0:
                        i = 0;
                        break;
                    default:
                        i = cVar.f2861c.F();
                        break;
                }
                float f9 = i;
                c cVar2 = recyclerView.getLayoutManager().q;
                switch (cVar2.f2860b) {
                    case 0:
                        i9 = cVar2.f2861c.f499o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = cVar2.f2861c;
                        i9 = carouselLayoutManager.f499o - carouselLayoutManager.C();
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f9, 0.0f, i9, paint);
            } else {
                canvas2 = canvas;
                c cVar3 = recyclerView.getLayoutManager().q;
                switch (cVar3.f2860b) {
                    case 0:
                        D = cVar3.f2861c.D();
                        break;
                    default:
                        D = 0;
                        break;
                }
                float f10 = D;
                c cVar4 = recyclerView.getLayoutManager().q;
                switch (cVar4.f2860b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = cVar4.f2861c;
                        E = carouselLayoutManager2.f498n - carouselLayoutManager2.E();
                        break;
                    default:
                        E = cVar4.f2861c.f498n;
                        break;
                }
                canvas2.drawLine(f10, 0.0f, E, 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
