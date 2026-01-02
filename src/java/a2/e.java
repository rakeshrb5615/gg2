package a2;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f300a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f301b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f302c;

    public /* synthetic */ e(k kVar, ArrayList arrayList, int i) {
        this.f300a = i;
        this.f302c = kVar;
        this.f301b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f300a) {
            case 0:
                ArrayList arrayList = this.f301b;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    k kVar = this.f302c;
                    if (i >= size) {
                        arrayList.clear();
                        kVar.f370m.remove(arrayList);
                        return;
                    }
                    Object obj = arrayList.get(i);
                    i++;
                    j jVar = (j) obj;
                    k1 k1Var = jVar.f353a;
                    int i9 = jVar.f354b;
                    int i10 = jVar.f355c;
                    int i11 = jVar.f356d;
                    int i12 = jVar.f357e;
                    kVar.getClass();
                    View view = k1Var.f376a;
                    int i13 = i11 - i9;
                    int i14 = i12 - i10;
                    if (i13 != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (i14 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator animate = view.animate();
                    kVar.f373p.add(k1Var);
                    animate.setDuration(kVar.f442e).setListener(new g(kVar, k1Var, i13, view, i14, animate)).start();
                }
            case 1:
                ArrayList arrayList2 = this.f301b;
                int size2 = arrayList2.size();
                int i15 = 0;
                while (true) {
                    k kVar2 = this.f302c;
                    if (i15 >= size2) {
                        arrayList2.clear();
                        kVar2.f371n.remove(arrayList2);
                        return;
                    }
                    Object obj2 = arrayList2.get(i15);
                    i15++;
                    i iVar = (i) obj2;
                    ArrayList arrayList3 = kVar2.f374r;
                    long j = kVar2.f443f;
                    k1 k1Var2 = iVar.f344a;
                    View view2 = k1Var2 == null ? null : k1Var2.f376a;
                    k1 k1Var3 = iVar.f345b;
                    View view3 = k1Var3 != null ? k1Var3.f376a : null;
                    if (view2 != null) {
                        ViewPropertyAnimator duration = view2.animate().setDuration(j);
                        arrayList3.add(iVar.f344a);
                        duration.translationX(iVar.f348e - iVar.f346c);
                        duration.translationY(iVar.f349f - iVar.f347d);
                        duration.alpha(0.0f).setListener(new h(kVar2, iVar, duration, view2, 0)).start();
                    }
                    if (view3 != null) {
                        ViewPropertyAnimator animate2 = view3.animate();
                        arrayList3.add(iVar.f345b);
                        animate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new h(kVar2, iVar, animate2, view3, 1)).start();
                    }
                }
            default:
                ArrayList arrayList4 = this.f301b;
                int size3 = arrayList4.size();
                int i16 = 0;
                while (true) {
                    k kVar3 = this.f302c;
                    if (i16 >= size3) {
                        arrayList4.clear();
                        kVar3.f369l.remove(arrayList4);
                        return;
                    }
                    Object obj3 = arrayList4.get(i16);
                    i16++;
                    k1 k1Var4 = (k1) obj3;
                    kVar3.getClass();
                    View view4 = k1Var4.f376a;
                    ViewPropertyAnimator animate3 = view4.animate();
                    kVar3.f372o.add(k1Var4);
                    animate3.alpha(1.0f).setDuration(kVar3.f440c).setListener(new f(kVar3, k1Var4, view4, animate3)).start();
                }
        }
    }
}
