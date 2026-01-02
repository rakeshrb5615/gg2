package a2;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class z0 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f550a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f551b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f552c;

    /* renamed from: d  reason: collision with root package name */
    public final List f553d;

    /* renamed from: e  reason: collision with root package name */
    public int f554e;

    /* renamed from: f  reason: collision with root package name */
    public int f555f;

    /* renamed from: g  reason: collision with root package name */
    public y0 f556g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f557h;

    public z0(RecyclerView recyclerView) {
        this.f557h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f550a = arrayList;
        this.f551b = null;
        this.f552c = new ArrayList();
        this.f553d = Collections.unmodifiableList(arrayList);
        this.f554e = 2;
        this.f555f = 2;
    }

    public final void a(k1 k1Var, boolean z9) {
        RecyclerView.l(k1Var);
        View view = k1Var.f376a;
        RecyclerView recyclerView = this.f557h;
        m1 m1Var = recyclerView.r0;
        if (m1Var != null) {
            l1 l1Var = m1Var.f399e;
            q0.q0.n(view, l1Var != null ? (q0.b) l1Var.f395e.remove(view) : null);
        }
        if (z9) {
            ArrayList arrayList = recyclerView.t;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
            i0 i0Var = recyclerView.r;
            if (i0Var != null) {
                i0Var.e(k1Var);
            }
            if (recyclerView.k0 != null) {
                recyclerView.m.D(k1Var);
            }
            if (RecyclerView.G0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + k1Var);
            }
        }
        k1Var.f391s = null;
        k1Var.f390r = null;
        y0 c9 = c();
        c9.getClass();
        int i = k1Var.f381f;
        ArrayList arrayList2 = c9.a(i).f532a;
        if (((x0) c9.f546a.get(i)).f533b <= arrayList2.size()) {
            w0.a.a(view);
        } else if (RecyclerView.F0 && arrayList2.contains(k1Var)) {
            throw new IllegalArgumentException("this scrap item already exists");
        } else {
            k1Var.m();
            arrayList2.add(k1Var);
        }
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.f557h;
        if (i >= 0 && i < recyclerView.k0.b()) {
            return !recyclerView.k0.f332g ? i : recyclerView.e.g(i, 0);
        }
        StringBuilder p8 = v1.a.p("invalid position ", i, ". State item count is ");
        p8.append(recyclerView.k0.b());
        p8.append(recyclerView.B());
        throw new IndexOutOfBoundsException(p8.toString());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, a2.y0] */
    public final y0 c() {
        if (this.f556g == null) {
            ?? obj = new Object();
            obj.f546a = new SparseArray();
            obj.f547b = 0;
            obj.f548c = Collections.newSetFromMap(new IdentityHashMap());
            this.f556g = obj;
            e();
        }
        return this.f556g;
    }

    public final View d(int i) {
        return l(i, Long.MAX_VALUE).f376a;
    }

    public final void e() {
        RecyclerView recyclerView;
        i0 i0Var;
        y0 y0Var = this.f556g;
        if (y0Var == null || (i0Var = (recyclerView = this.f557h).r) == null || !recyclerView.x) {
            return;
        }
        y0Var.f548c.add(i0Var);
    }

    public final void f(i0 i0Var, boolean z9) {
        y0 y0Var = this.f556g;
        if (y0Var != null) {
            SparseArray sparseArray = y0Var.f546a;
            Set set = y0Var.f548c;
            set.remove(i0Var);
            if (set.size() != 0 || z9) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((x0) sparseArray.get(sparseArray.keyAt(i))).f532a;
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    w0.a.a(((k1) arrayList.get(i9)).f376a);
                }
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.f552c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h(size);
        }
        arrayList.clear();
        if (RecyclerView.K0) {
            r rVar = this.f557h.j0;
            int[] iArr = (int[]) rVar.f453d;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            rVar.f452c = 0;
        }
    }

    public final void h(int i) {
        if (RecyclerView.G0) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        ArrayList arrayList = this.f552c;
        k1 k1Var = (k1) arrayList.get(i);
        if (RecyclerView.G0) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + k1Var);
        }
        a(k1Var, true);
        arrayList.remove(i);
    }

    public final void i(View view) {
        k1 M = RecyclerView.M(view);
        boolean j = M.j();
        RecyclerView recyclerView = this.f557h;
        if (j) {
            recyclerView.removeDetachedView(view, false);
        }
        if (M.i()) {
            M.f387n.m(M);
        } else if (M.p()) {
            M.j &= -33;
        }
        j(M);
        if (recyclerView.P == null || M.g()) {
            return;
        }
        recyclerView.P.d(M);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b6, code lost:
        r6 = r6 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(a2.k1 r13) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.z0.j(a2.k1):void");
    }

    public final void k(View view) {
        p0 p0Var;
        k1 M = RecyclerView.M(view);
        int i = M.j & 12;
        RecyclerView recyclerView = this.f557h;
        if (i == 0 && M.k() && (p0Var = recyclerView.P) != null) {
            k kVar = (k) p0Var;
            if (M.c().isEmpty() && kVar.f366g && !M.f()) {
                if (this.f551b == null) {
                    this.f551b = new ArrayList();
                }
                M.f387n = this;
                M.f388o = true;
                this.f551b.add(M);
                return;
            }
        }
        if (M.f() && !M.h() && !recyclerView.r.f351b) {
            throw new IllegalArgumentException(v1.a.h(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        M.f387n = this;
        M.f388o = false;
        this.f550a.add(M);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0206, code lost:
        if (r10.f381f != 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x049e, code lost:
        if (r10.f() == false) goto L174;
     */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0663 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Type inference failed for: r6v42, types: [a2.o0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a2.k1 l(int r29, long r30) {
        /*
            Method dump skipped, instructions count: 1689
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.z0.l(int, long):a2.k1");
    }

    public final void m(k1 k1Var) {
        if (k1Var.f388o) {
            this.f551b.remove(k1Var);
        } else {
            this.f550a.remove(k1Var);
        }
        k1Var.f387n = null;
        k1Var.f388o = false;
        k1Var.j &= -33;
    }

    public final void n() {
        t0 t0Var = this.f557h.s;
        this.f555f = this.f554e + (t0Var != null ? t0Var.j : 0);
        ArrayList arrayList = this.f552c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f555f; size--) {
            h(size);
        }
    }
}
