package f2;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q0.i0;
import q0.q0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class s implements Cloneable {
    public static final Animator[] D = new Animator[0];
    public static final int[] E = {2, 1, 3, 4};
    public static final a6.e F = new Object();
    public static final ThreadLocal G = new ThreadLocal();
    public a.a B;
    public ArrayList q;

    /* renamed from: r  reason: collision with root package name */
    public ArrayList f1468r;

    /* renamed from: s  reason: collision with root package name */
    public q[] f1469s;

    /* renamed from: a  reason: collision with root package name */
    public final String f1458a = getClass().getName();

    /* renamed from: b  reason: collision with root package name */
    public long f1459b = -1;

    /* renamed from: c  reason: collision with root package name */
    public long f1460c = -1;

    /* renamed from: d  reason: collision with root package name */
    public TimeInterpolator f1461d = null;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f1462e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f1463f = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    public j6.s f1464m = new j6.s(5);

    /* renamed from: n  reason: collision with root package name */
    public j6.s f1465n = new j6.s(5);

    /* renamed from: o  reason: collision with root package name */
    public y f1466o = null;

    /* renamed from: p  reason: collision with root package name */
    public final int[] f1467p = E;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList f1470t = new ArrayList();

    /* renamed from: u  reason: collision with root package name */
    public Animator[] f1471u = D;

    /* renamed from: v  reason: collision with root package name */
    public int f1472v = 0;

    /* renamed from: w  reason: collision with root package name */
    public boolean f1473w = false;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1474x = false;

    /* renamed from: y  reason: collision with root package name */
    public s f1475y = null;

    /* renamed from: z  reason: collision with root package name */
    public ArrayList f1476z = null;
    public ArrayList A = new ArrayList();
    public a6.e C = F;

    public static void d(j6.s sVar, View view, a0 a0Var) {
        r.e eVar = (r.e) sVar.f3285e;
        SparseArray sparseArray = (SparseArray) sVar.f3283c;
        r.g gVar = (r.g) sVar.f3284d;
        ((r.e) sVar.f3282b).put(view, a0Var);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = q0.f5172a;
        String e9 = i0.e(view);
        if (e9 != null) {
            if (eVar.containsKey(e9)) {
                eVar.put(e9, null);
            } else {
                eVar.put(e9, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (gVar.f5463a) {
                    int i = gVar.f5466d;
                    long[] jArr = gVar.f5464b;
                    Object[] objArr = gVar.f5465c;
                    int i9 = 0;
                    for (int i10 = 0; i10 < i; i10++) {
                        Object obj = objArr[i10];
                        if (obj != r.h.f5467a) {
                            if (i10 != i9) {
                                jArr[i9] = jArr[i10];
                                objArr[i9] = obj;
                                objArr[i10] = null;
                            }
                            i9++;
                        }
                    }
                    gVar.f5463a = false;
                    gVar.f5466d = i9;
                }
                if (s.a.b(gVar.f5464b, gVar.f5466d, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    gVar.e(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) gVar.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    gVar.e(itemIdAtPosition, null);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [r.e, java.lang.Object, r.j] */
    public static r.e s() {
        ThreadLocal threadLocal = G;
        r.e eVar = (r.e) threadLocal.get();
        if (eVar == null) {
            ?? jVar = new r.j(0);
            threadLocal.set(jVar);
            return jVar;
        }
        return eVar;
    }

    public static boolean x(a0 a0Var, a0 a0Var2, String str) {
        Object obj = a0Var.f1399a.get(str);
        Object obj2 = a0Var2.f1399a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public s A(q qVar) {
        s sVar;
        ArrayList arrayList = this.f1476z;
        if (arrayList != null) {
            if (!arrayList.remove(qVar) && (sVar = this.f1475y) != null) {
                sVar.A(qVar);
            }
            if (this.f1476z.size() == 0) {
                this.f1476z = null;
            }
        }
        return this;
    }

    public void B(View view) {
        this.f1463f.remove(view);
    }

    public void C(View view) {
        if (this.f1473w) {
            if (!this.f1474x) {
                ArrayList arrayList = this.f1470t;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f1471u);
                this.f1471u = D;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f1471u = animatorArr;
                y(this, r.f1457k);
            }
            this.f1473w = false;
        }
    }

    public void D() {
        K();
        r.e s5 = s();
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (s5.containsKey(animator)) {
                K();
                if (animator != null) {
                    animator.addListener(new n(this, s5));
                    long j = this.f1460c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j8 = this.f1459b;
                    if (j8 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j8);
                    }
                    TimeInterpolator timeInterpolator = this.f1461d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new o(this, 0));
                    animator.start();
                }
            }
        }
        this.A.clear();
        p();
    }

    public void E(long j) {
        this.f1460c = j;
    }

    public void F(a.a aVar) {
        this.B = aVar;
    }

    public void G(TimeInterpolator timeInterpolator) {
        this.f1461d = timeInterpolator;
    }

    public void H(a6.e eVar) {
        if (eVar == null) {
            this.C = F;
        } else {
            this.C = eVar;
        }
    }

    public void I() {
    }

    public void J(long j) {
        this.f1459b = j;
    }

    public final void K() {
        if (this.f1472v == 0) {
            y(this, r.f1455g);
            this.f1474x = false;
        }
        this.f1472v++;
    }

    public String L(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f1460c != -1) {
            sb.append("dur(");
            sb.append(this.f1460c);
            sb.append(") ");
        }
        if (this.f1459b != -1) {
            sb.append("dly(");
            sb.append(this.f1459b);
            sb.append(") ");
        }
        if (this.f1461d != null) {
            sb.append("interp(");
            sb.append(this.f1461d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f1462e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1463f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                    if (i9 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i9));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(q qVar) {
        if (this.f1476z == null) {
            this.f1476z = new ArrayList();
        }
        this.f1476z.add(qVar);
    }

    public void b(View view) {
        this.f1463f.add(view);
    }

    public void cancel() {
        ArrayList arrayList = this.f1470t;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f1471u);
        this.f1471u = D;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f1471u = animatorArr;
        y(this, r.i);
    }

    public abstract void e(a0 a0Var);

    public final void g(View view, boolean z9) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            a0 a0Var = new a0(view);
            if (z9) {
                j(a0Var);
            } else {
                e(a0Var);
            }
            a0Var.f1401c.add(this);
            h(a0Var);
            if (z9) {
                d(this.f1464m, view, a0Var);
            } else {
                d(this.f1465n, view, a0Var);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), z9);
            }
        }
    }

    public void h(a0 a0Var) {
    }

    public abstract void j(a0 a0Var);

    public final void k(ViewGroup viewGroup, boolean z9) {
        l(z9);
        ArrayList arrayList = this.f1462e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1463f;
        if (size <= 0 && arrayList2.size() <= 0) {
            g(viewGroup, z9);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                a0 a0Var = new a0(findViewById);
                if (z9) {
                    j(a0Var);
                } else {
                    e(a0Var);
                }
                a0Var.f1401c.add(this);
                h(a0Var);
                if (z9) {
                    d(this.f1464m, findViewById, a0Var);
                } else {
                    d(this.f1465n, findViewById, a0Var);
                }
            }
        }
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            View view = (View) arrayList2.get(i9);
            a0 a0Var2 = new a0(view);
            if (z9) {
                j(a0Var2);
            } else {
                e(a0Var2);
            }
            a0Var2.f1401c.add(this);
            h(a0Var2);
            if (z9) {
                d(this.f1464m, view, a0Var2);
            } else {
                d(this.f1465n, view, a0Var2);
            }
        }
    }

    public final void l(boolean z9) {
        if (z9) {
            ((r.e) this.f1464m.f3282b).clear();
            ((SparseArray) this.f1464m.f3283c).clear();
            ((r.g) this.f1464m.f3284d).a();
            return;
        }
        ((r.e) this.f1465n.f3282b).clear();
        ((SparseArray) this.f1465n.f3283c).clear();
        ((r.g) this.f1465n.f3284d).a();
    }

    @Override // 
    /* renamed from: m */
    public s clone() {
        try {
            s sVar = (s) super.clone();
            sVar.A = new ArrayList();
            sVar.f1464m = new j6.s(5);
            sVar.f1465n = new j6.s(5);
            sVar.q = null;
            sVar.f1468r = null;
            sVar.f1475y = this;
            sVar.f1476z = null;
            return sVar;
        } catch (CloneNotSupportedException e9) {
            throw new RuntimeException(e9);
        }
    }

    public Animator n(ViewGroup viewGroup, a0 a0Var, a0 a0Var2) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [f2.p, java.lang.Object] */
    public void o(ViewGroup viewGroup, j6.s sVar, j6.s sVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i9;
        View view;
        a0 a0Var;
        Animator animator;
        a0 a0Var2;
        r.e s5 = s();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        r().getClass();
        int i10 = 0;
        while (i10 < size) {
            a0 a0Var3 = (a0) arrayList.get(i10);
            a0 a0Var4 = (a0) arrayList2.get(i10);
            if (a0Var3 != null && !a0Var3.f1401c.contains(this)) {
                a0Var3 = null;
            }
            if (a0Var4 != null && !a0Var4.f1401c.contains(this)) {
                a0Var4 = null;
            }
            if ((a0Var3 != null || a0Var4 != null) && (a0Var3 == null || a0Var4 == null || v(a0Var3, a0Var4))) {
                Animator n9 = n(viewGroup, a0Var3, a0Var4);
                if (n9 != null) {
                    String str = this.f1458a;
                    if (a0Var4 != null) {
                        view = a0Var4.f1400b;
                        String[] t7 = t();
                        if (t7 != null && t7.length > 0) {
                            a0Var2 = new a0(view);
                            a0 a0Var5 = (a0) ((r.e) sVar2.f3282b).get(view);
                            i = size;
                            if (a0Var5 != null) {
                                int i11 = 0;
                                while (i11 < t7.length) {
                                    String str2 = t7[i11];
                                    int i12 = i10;
                                    a0Var2.f1399a.put(str2, a0Var5.f1399a.get(str2));
                                    i11++;
                                    i10 = i12;
                                    a0Var5 = a0Var5;
                                }
                            }
                            i9 = i10;
                            int i13 = s5.f5471c;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= i13) {
                                    animator = n9;
                                    break;
                                }
                                p pVar = (p) s5.get((Animator) s5.g(i14));
                                if (pVar.f1451c != null && pVar.f1449a == view && pVar.f1450b.equals(str) && pVar.f1451c.equals(a0Var2)) {
                                    animator = null;
                                    break;
                                }
                                i14++;
                            }
                        } else {
                            i = size;
                            i9 = i10;
                            animator = n9;
                            a0Var2 = null;
                        }
                        n9 = animator;
                        a0Var = a0Var2;
                    } else {
                        i = size;
                        i9 = i10;
                        view = a0Var3.f1400b;
                        a0Var = null;
                    }
                    if (n9 != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        ?? obj = new Object();
                        obj.f1449a = view;
                        obj.f1450b = str;
                        obj.f1451c = a0Var;
                        obj.f1452d = windowId;
                        obj.f1453e = this;
                        obj.f1454f = n9;
                        s5.put(n9, obj);
                        this.A.add(n9);
                    }
                    i10 = i9 + 1;
                    size = i;
                }
            }
            i = size;
            i9 = i10;
            i10 = i9 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i15 = 0; i15 < sparseIntArray.size(); i15++) {
                p pVar2 = (p) s5.get((Animator) this.A.get(sparseIntArray.keyAt(i15)));
                long startDelay = pVar2.f1454f.getStartDelay();
                pVar2.f1454f.setStartDelay(startDelay + (sparseIntArray.valueAt(i15) - Long.MAX_VALUE));
            }
        }
    }

    public final void p() {
        int i = this.f1472v - 1;
        this.f1472v = i;
        if (i == 0) {
            y(this, r.f1456h);
            for (int i9 = 0; i9 < ((r.g) this.f1464m.f3284d).g(); i9++) {
                View view = (View) ((r.g) this.f1464m.f3284d).h(i9);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i10 = 0; i10 < ((r.g) this.f1465n.f3284d).g(); i10++) {
                View view2 = (View) ((r.g) this.f1465n.f3284d).h(i10);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f1474x = true;
        }
    }

    public final a0 q(View view, boolean z9) {
        y yVar = this.f1466o;
        if (yVar != null) {
            return yVar.q(view, z9);
        }
        ArrayList arrayList = z9 ? this.q : this.f1468r;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            a0 a0Var = (a0) arrayList.get(i);
            if (a0Var == null) {
                return null;
            }
            if (a0Var.f1400b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (a0) (z9 ? this.f1468r : this.q).get(i);
        }
        return null;
    }

    public final s r() {
        y yVar = this.f1466o;
        return yVar != null ? yVar.r() : this;
    }

    public String[] t() {
        return null;
    }

    public final String toString() {
        return L("");
    }

    public final a0 u(View view, boolean z9) {
        y yVar = this.f1466o;
        if (yVar != null) {
            return yVar.u(view, z9);
        }
        return (a0) ((r.e) (z9 ? this.f1464m : this.f1465n).f3282b).get(view);
    }

    public boolean v(a0 a0Var, a0 a0Var2) {
        if (a0Var != null && a0Var2 != null) {
            String[] t7 = t();
            if (t7 != null) {
                for (String str : t7) {
                    if (x(a0Var, a0Var2, str)) {
                        return true;
                    }
                }
            } else {
                for (String str2 : a0Var.f1399a.keySet()) {
                    if (x(a0Var, a0Var2, str2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean w(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f1462e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1463f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final void y(s sVar, r rVar) {
        s sVar2 = this.f1475y;
        if (sVar2 != null) {
            sVar2.y(sVar, rVar);
        }
        ArrayList arrayList = this.f1476z;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f1476z.size();
        q[] qVarArr = this.f1469s;
        if (qVarArr == null) {
            qVarArr = new q[size];
        }
        this.f1469s = null;
        q[] qVarArr2 = (q[]) this.f1476z.toArray(qVarArr);
        for (int i = 0; i < size; i++) {
            rVar.b(qVarArr2[i], sVar);
            qVarArr2[i] = null;
        }
        this.f1469s = qVarArr2;
    }

    public void z(View view) {
        if (this.f1474x) {
            return;
        }
        ArrayList arrayList = this.f1470t;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f1471u);
        this.f1471u = D;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f1471u = animatorArr;
        y(this, r.j);
        this.f1473w = true;
    }
}
