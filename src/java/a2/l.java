package a2;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f392a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f393b;

    public /* synthetic */ l(Object obj, int i) {
        this.f392a = i;
        this.f393b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        boolean z9;
        n.k kVar;
        boolean a10;
        switch (this.f392a) {
            case 0:
                p pVar = (p) this.f393b;
                ValueAnimator valueAnimator = pVar.f437z;
                int i9 = pVar.A;
                if (i9 != 1) {
                    i = 2;
                    if (i9 != 2) {
                        return;
                    }
                } else {
                    i = 2;
                    valueAnimator.cancel();
                }
                pVar.A = 3;
                float[] fArr = new float[i];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 1:
                RecyclerView recyclerView = (RecyclerView) this.f393b;
                p0 p0Var = recyclerView.P;
                if (p0Var != null) {
                    k kVar2 = (k) p0Var;
                    long j = kVar2.f441d;
                    ArrayList arrayList = kVar2.f367h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = kVar2.j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = kVar2.f368k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = kVar2.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        int size = arrayList.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            k1 k1Var = (k1) arrayList.get(i10);
                            View view = k1Var.f376a;
                            boolean z10 = isEmpty4;
                            ViewPropertyAnimator animate = view.animate();
                            kVar2.q.add(k1Var);
                            animate.setDuration(j).alpha(0.0f).setListener(new f(kVar2, k1Var, animate, view)).start();
                            isEmpty4 = z10;
                            size = size;
                        }
                        boolean z11 = isEmpty4;
                        arrayList.clear();
                        if (!isEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            kVar2.f370m.add(arrayList5);
                            arrayList2.clear();
                            e eVar = new e(kVar2, arrayList5, 0);
                            if (isEmpty) {
                                eVar.run();
                            } else {
                                View view2 = ((j) arrayList5.get(0)).f353a.f376a;
                                WeakHashMap weakHashMap = q0.q0.f5172a;
                                view2.postOnAnimationDelayed(eVar, j);
                            }
                        }
                        if (!isEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            kVar2.f371n.add(arrayList6);
                            arrayList3.clear();
                            e eVar2 = new e(kVar2, arrayList6, 1);
                            if (isEmpty) {
                                eVar2.run();
                            } else {
                                View view3 = ((i) arrayList6.get(0)).f344a.f376a;
                                WeakHashMap weakHashMap2 = q0.q0.f5172a;
                                view3.postOnAnimationDelayed(eVar2, j);
                            }
                        }
                        if (!z11) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            kVar2.f369l.add(arrayList7);
                            arrayList4.clear();
                            e eVar3 = new e(kVar2, arrayList7, 2);
                            if (!isEmpty || !isEmpty2 || !isEmpty3) {
                                if (isEmpty) {
                                    j = 0;
                                }
                                long j8 = !isEmpty2 ? kVar2.f442e : 0L;
                                long j9 = !isEmpty3 ? kVar2.f443f : 0L;
                                z9 = false;
                                View view4 = ((k1) arrayList7.get(0)).f376a;
                                WeakHashMap weakHashMap3 = q0.q0.f5172a;
                                view4.postOnAnimationDelayed(eVar3, Math.max(j8, j9) + j);
                                recyclerView.q0 = z9;
                                return;
                            }
                            eVar3.run();
                        }
                        z9 = false;
                        recyclerView.q0 = z9;
                        return;
                    }
                }
                z9 = false;
                recyclerView.q0 = z9;
                return;
            case 2:
                ((StaggeredGridLayoutManager) this.f393b).D0();
                return;
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                h3.e eVar4 = (h3.e) this.f393b;
                eVar4.f2170c = false;
                BottomSheetBehavior bottomSheetBehavior = eVar4.f2172e;
                y0.e eVar5 = bottomSheetBehavior.O;
                if (eVar5 != null && eVar5.f()) {
                    eVar4.a(eVar4.f2169b);
                    return;
                } else if (bottomSheetBehavior.N == 2) {
                    bottomSheetBehavior.I(eVar4.f2169b);
                    return;
                } else {
                    return;
                }
            case 4:
                n.t1 t1Var = (n.t1) this.f393b;
                t1Var.f4300r = null;
                t1Var.drawableStateChanged();
                return;
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                View view5 = (SearchView.SearchAutoComplete) this.f393b;
                if (((SearchView.SearchAutoComplete) view5).f) {
                    ((InputMethodManager) view5.getContext().getSystemService("input_method")).showSoftInput(view5, 0);
                    ((SearchView.SearchAutoComplete) view5).f = false;
                    return;
                }
                return;
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                ActionMenuView actionMenuView = ((Toolbar) this.f393b).a;
                if (actionMenuView == null || (kVar = actionMenuView.z) == null) {
                    return;
                }
                kVar.l();
                return;
            case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                n6.l lVar = (n6.l) this.f393b;
                synchronized (lVar) {
                    a10 = lVar.a();
                    if (a10) {
                        synchronized (lVar) {
                            lVar.f4944b = true;
                        }
                    }
                }
                if (a10) {
                    if (new Date(lVar.f4956p.currentTimeMillis()).before(lVar.q.c().f4959b)) {
                        lVar.h();
                        return;
                    }
                    d6.c cVar = (d6.c) lVar.f4951k;
                    Task d9 = cVar.d();
                    Task c9 = cVar.c();
                    Task continueWithTask = Tasks.whenAllComplete(new Task[]{d9, c9}).continueWithTask(lVar.f4950h, new h5.a(lVar, d9, c9, 4));
                    Tasks.whenAllComplete(new Task[]{continueWithTask}).continueWith(lVar.f4950h, new a5.u(8, lVar, continueWithTask));
                    return;
                }
                return;
            case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                t0.d dVar = (t0.d) this.f393b;
                n.t1 t1Var2 = dVar.f5936c;
                t0.a aVar = dVar.f5934a;
                if (dVar.f5947u) {
                    if (dVar.f5945s) {
                        dVar.f5945s = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f5929e = currentAnimationTimeMillis;
                        aVar.f5931g = -1L;
                        aVar.f5930f = currentAnimationTimeMillis;
                        aVar.f5932h = 0.5f;
                    }
                    if ((aVar.f5931g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f5931g + aVar.i) || !dVar.e()) {
                        dVar.f5947u = false;
                        return;
                    }
                    if (dVar.f5946t) {
                        dVar.f5946t = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        t1Var2.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f5930f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a11 = aVar.a(currentAnimationTimeMillis2);
                    aVar.f5930f = currentAnimationTimeMillis2;
                    dVar.f5949w.scrollListBy((int) (((float) (currentAnimationTimeMillis2 - aVar.f5930f)) * ((a11 * 4.0f) + ((-4.0f) * a11 * a11)) * aVar.f5928d));
                    WeakHashMap weakHashMap4 = q0.q0.f5172a;
                    t1Var2.postOnAnimation(this);
                    return;
                }
                return;
            case 9:
                ((y0.e) this.f393b).n(0);
                return;
            default:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f393b).c.f7229m;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
        }
    }
}
