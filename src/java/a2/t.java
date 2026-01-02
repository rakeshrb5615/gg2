package a2;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class t implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public static final ThreadLocal f481e = new ThreadLocal();

    /* renamed from: f  reason: collision with root package name */
    public static final q f482f = new q(0);

    /* renamed from: b  reason: collision with root package name */
    public long f484b;

    /* renamed from: c  reason: collision with root package name */
    public long f485c;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f483a = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f486d = new ArrayList();

    public static k1 c(RecyclerView recyclerView, int i, long j) {
        int u9 = recyclerView.f.u();
        for (int i9 = 0; i9 < u9; i9++) {
            k1 M = RecyclerView.M(recyclerView.f.t(i9));
            if (M.f378c == i && !M.f()) {
                return null;
            }
        }
        z0 z0Var = recyclerView.c;
        if (j == Long.MAX_VALUE) {
            try {
                if (m0.j.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th) {
                recyclerView.U(false);
                Trace.endSection();
                throw th;
            }
        }
        recyclerView.T();
        k1 l5 = z0Var.l(i, j);
        if (l5 != null) {
            if (!l5.e() || l5.f()) {
                z0Var.a(l5, false);
            } else {
                z0Var.i(l5.f376a);
            }
        }
        recyclerView.U(false);
        Trace.endSection();
        return l5;
    }

    public final void a(RecyclerView recyclerView, int i, int i9) {
        if (recyclerView.x) {
            if (RecyclerView.F0 && !this.f483a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f484b == 0) {
                this.f484b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        r rVar = recyclerView.j0;
        rVar.f450a = i;
        rVar.f451b = i9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(long j) {
        s sVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        s sVar2;
        ArrayList arrayList = this.f483a;
        int size = arrayList.size();
        int i = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i10);
            int windowVisibility = recyclerView3.getWindowVisibility();
            r rVar = recyclerView3.j0;
            if (windowVisibility == 0) {
                rVar.b(recyclerView3, false);
                i9 += rVar.f452c;
            }
        }
        ArrayList arrayList2 = this.f486d;
        arrayList2.ensureCapacity(i9);
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i11);
            if (recyclerView4.getWindowVisibility() == 0) {
                r rVar2 = recyclerView4.j0;
                int abs = Math.abs(rVar2.f451b) + Math.abs(rVar2.f450a);
                for (int i13 = i; i13 < rVar2.f452c * 2; i13 += 2) {
                    if (i12 >= arrayList2.size()) {
                        Object obj = new Object();
                        arrayList2.add(obj);
                        sVar2 = obj;
                    } else {
                        sVar2 = (s) arrayList2.get(i12);
                    }
                    int[] iArr = (int[]) rVar2.f453d;
                    int i14 = iArr[i13 + 1];
                    sVar2.f466a = i14 <= abs;
                    sVar2.f467b = abs;
                    sVar2.f468c = i14;
                    sVar2.f469d = recyclerView4;
                    sVar2.f470e = iArr[i13];
                    i12++;
                }
            }
            i11++;
            i = 0;
        }
        Collections.sort(arrayList2, f482f);
        for (int i15 = 0; i15 < arrayList2.size() && (recyclerView = (sVar = (s) arrayList2.get(i15)).f469d) != null; i15++) {
            k1 c9 = c(recyclerView, sVar.f470e, sVar.f466a ? Long.MAX_VALUE : j);
            if (c9 != null && c9.f377b != null && c9.e() && !c9.f() && (recyclerView2 = (RecyclerView) c9.f377b.get()) != null) {
                if (recyclerView2.G && recyclerView2.f.u() != 0) {
                    z0 z0Var = recyclerView2.c;
                    p0 p0Var = recyclerView2.P;
                    if (p0Var != null) {
                        p0Var.e();
                    }
                    t0 t0Var = recyclerView2.s;
                    if (t0Var != null) {
                        t0Var.j0(z0Var);
                        recyclerView2.s.k0(z0Var);
                    }
                    z0Var.f550a.clear();
                    z0Var.g();
                }
                r rVar3 = recyclerView2.j0;
                rVar3.b(recyclerView2, true);
                if (rVar3.f452c != 0) {
                    try {
                        Trace.beginSection(j == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        g1 g1Var = recyclerView2.k0;
                        i0 i0Var = recyclerView2.r;
                        g1Var.f329d = 1;
                        g1Var.f330e = i0Var.a();
                        g1Var.f332g = false;
                        g1Var.f333h = false;
                        g1Var.i = false;
                        for (int i16 = 0; i16 < rVar3.f452c * 2; i16 += 2) {
                            c(recyclerView2, ((int[]) rVar3.f453d)[i16], j);
                        }
                        Trace.endSection();
                        sVar.f466a = false;
                        sVar.f467b = 0;
                        sVar.f468c = 0;
                        sVar.f469d = null;
                        sVar.f470e = 0;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            sVar.f466a = false;
            sVar.f467b = 0;
            sVar.f468c = 0;
            sVar.f469d = null;
            sVar.f470e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f483a;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j) + this.f485c);
                }
            }
        } finally {
            this.f484b = 0L;
            Trace.endSection();
        }
    }
}
