package a2;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class k extends p0 {

    /* renamed from: s  reason: collision with root package name */
    public static TimeInterpolator f365s;

    /* renamed from: g  reason: collision with root package name */
    public boolean f366g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList f367h;
    public ArrayList i;
    public ArrayList j;

    /* renamed from: k  reason: collision with root package name */
    public ArrayList f368k;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList f369l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f370m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList f371n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList f372o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList f373p;
    public ArrayList q;

    /* renamed from: r  reason: collision with root package name */
    public ArrayList f374r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((k1) arrayList.get(size)).f376a.animate().cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r12v8, types: [a2.i, java.lang.Object] */
    @Override // a2.p0
    public final boolean a(k1 k1Var, k1 k1Var2, o0 o0Var, o0 o0Var2) {
        int i;
        int i9;
        int i10 = o0Var.f406a;
        int i11 = o0Var.f407b;
        if (k1Var2.o()) {
            int i12 = o0Var.f406a;
            i9 = o0Var.f407b;
            i = i12;
        } else {
            i = o0Var2.f406a;
            i9 = o0Var2.f407b;
        }
        if (k1Var == k1Var2) {
            return g(k1Var, i10, i11, i, i9);
        }
        View view = k1Var.f376a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(k1Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = k1Var2.f376a;
        l(k1Var2);
        view2.setTranslationX(-((int) ((i - i10) - translationX)));
        view2.setTranslationY(-((int) ((i9 - i11) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f368k;
        ?? obj = new Object();
        obj.f344a = k1Var;
        obj.f345b = k1Var2;
        obj.f346c = i10;
        obj.f347d = i11;
        obj.f348e = i;
        obj.f349f = i9;
        arrayList.add(obj);
        return true;
    }

    @Override // a2.p0
    public final void d(k1 k1Var) {
        ArrayList arrayList = this.f369l;
        ArrayList arrayList2 = this.f370m;
        ArrayList arrayList3 = this.f371n;
        View view = k1Var.f376a;
        view.animate().cancel();
        ArrayList arrayList4 = this.j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((j) arrayList4.get(size)).f353a == k1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(k1Var);
                arrayList4.remove(size);
            }
        }
        j(this.f368k, k1Var);
        if (this.f367h.remove(k1Var)) {
            view.setAlpha(1.0f);
            c(k1Var);
        }
        if (this.i.remove(k1Var)) {
            view.setAlpha(1.0f);
            c(k1Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, k1Var);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            int size4 = arrayList6.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((j) arrayList6.get(size4)).f353a == k1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(k1Var);
                    arrayList6.remove(size4);
                    if (arrayList6.isEmpty()) {
                        arrayList2.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(k1Var)) {
                view.setAlpha(1.0f);
                c(k1Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.q.remove(k1Var);
        this.f372o.remove(k1Var);
        this.f374r.remove(k1Var);
        this.f373p.remove(k1Var);
        i();
    }

    @Override // a2.p0
    public final void e() {
        ArrayList arrayList = this.f371n;
        ArrayList arrayList2 = this.f369l;
        ArrayList arrayList3 = this.f370m;
        ArrayList arrayList4 = this.f368k;
        ArrayList arrayList5 = this.i;
        ArrayList arrayList6 = this.f367h;
        ArrayList arrayList7 = this.j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) arrayList7.get(size);
            View view = jVar.f353a.f376a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(jVar.f353a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((k1) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            k1 k1Var = (k1) arrayList5.get(size3);
            k1Var.f376a.setAlpha(1.0f);
            c(k1Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            i iVar = (i) arrayList4.get(size4);
            k1 k1Var2 = iVar.f344a;
            if (k1Var2 != null) {
                k(iVar, k1Var2);
            }
            k1 k1Var3 = iVar.f345b;
            if (k1Var3 != null) {
                k(iVar, k1Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList8.get(size6);
                    View view2 = jVar2.f353a.f376a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(jVar2.f353a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    k1 k1Var4 = (k1) arrayList9.get(size8);
                    k1Var4.f376a.setAlpha(1.0f);
                    c(k1Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList2.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    i iVar2 = (i) arrayList10.get(size10);
                    k1 k1Var5 = iVar2.f344a;
                    if (k1Var5 != null) {
                        k(iVar2, k1Var5);
                    }
                    k1 k1Var6 = iVar2.f345b;
                    if (k1Var6 != null) {
                        k(iVar2, k1Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            h(this.q);
            h(this.f373p);
            h(this.f372o);
            h(this.f374r);
            ArrayList arrayList11 = this.f439b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // a2.p0
    public final boolean f() {
        return (this.i.isEmpty() && this.f368k.isEmpty() && this.j.isEmpty() && this.f367h.isEmpty() && this.f373p.isEmpty() && this.q.isEmpty() && this.f372o.isEmpty() && this.f374r.isEmpty() && this.f370m.isEmpty() && this.f369l.isEmpty() && this.f371n.isEmpty()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [a2.j, java.lang.Object] */
    public final boolean g(k1 k1Var, int i, int i9, int i10, int i11) {
        View view = k1Var.f376a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i9 + ((int) k1Var.f376a.getTranslationY());
        l(k1Var);
        int i12 = i10 - translationX;
        int i13 = i11 - translationY;
        if (i12 == 0 && i13 == 0) {
            c(k1Var);
            return false;
        }
        if (i12 != 0) {
            view.setTranslationX(-i12);
        }
        if (i13 != 0) {
            view.setTranslationY(-i13);
        }
        ArrayList arrayList = this.j;
        ?? obj = new Object();
        obj.f353a = k1Var;
        obj.f354b = translationX;
        obj.f355c = translationY;
        obj.f356d = i10;
        obj.f357e = i11;
        arrayList.add(obj);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f439b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, k1 k1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            i iVar = (i) arrayList.get(size);
            if (k(iVar, k1Var) && iVar.f344a == null && iVar.f345b == null) {
                arrayList.remove(iVar);
            }
        }
    }

    public final boolean k(i iVar, k1 k1Var) {
        if (iVar.f345b == k1Var) {
            iVar.f345b = null;
        } else if (iVar.f344a != k1Var) {
            return false;
        } else {
            iVar.f344a = null;
        }
        View view = k1Var.f376a;
        View view2 = k1Var.f376a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(k1Var);
        return true;
    }

    public final void l(k1 k1Var) {
        if (f365s == null) {
            f365s = new ValueAnimator().getInterpolator();
        }
        k1Var.f376a.animate().setInterpolator(f365s);
        d(k1Var);
    }
}
