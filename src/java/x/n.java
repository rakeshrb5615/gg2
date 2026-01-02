package x;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class n {

    /* renamed from: f  reason: collision with root package name */
    public static int f6525f;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f6526a;

    /* renamed from: b  reason: collision with root package name */
    public int f6527b;

    /* renamed from: c  reason: collision with root package name */
    public int f6528c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f6529d;

    /* renamed from: e  reason: collision with root package name */
    public int f6530e;

    public final void a(ArrayList arrayList) {
        int size = this.f6526a.size();
        if (this.f6530e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                n nVar = (n) arrayList.get(i);
                if (this.f6530e == nVar.f6527b) {
                    c(this.f6528c, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(u.c cVar, int i) {
        int n9;
        int n10;
        ArrayList arrayList = this.f6526a;
        if (arrayList.size() == 0) {
            return 0;
        }
        w.e eVar = (w.e) ((w.d) arrayList.get(0)).T;
        cVar.t();
        eVar.b(cVar, false);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            ((w.d) arrayList.get(i9)).b(cVar, false);
        }
        if (i == 0 && eVar.z0 > 0) {
            w.j.a(eVar, cVar, arrayList, 0);
        }
        if (i == 1 && eVar.A0 > 0) {
            w.j.a(eVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e9) {
            System.err.println(e9.toString() + "\n" + Arrays.toString(e9.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f6529d = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            w.d dVar = (w.d) arrayList.get(i10);
            Object obj = new Object();
            new WeakReference(dVar);
            u.c.n(dVar.I);
            u.c.n(dVar.J);
            u.c.n(dVar.K);
            u.c.n(dVar.L);
            u.c.n(dVar.M);
            this.f6529d.add(obj);
        }
        if (i == 0) {
            n9 = u.c.n(eVar.I);
            n10 = u.c.n(eVar.K);
            cVar.t();
        } else {
            n9 = u.c.n(eVar.J);
            n10 = u.c.n(eVar.L);
            cVar.t();
        }
        return n10 - n9;
    }

    public final void c(int i, n nVar) {
        int i9 = nVar.f6527b;
        ArrayList arrayList = this.f6526a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            w.d dVar = (w.d) obj;
            ArrayList arrayList2 = nVar.f6526a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
            if (i == 0) {
                dVar.f6369n0 = i9;
            } else {
                dVar.f6371o0 = i9;
            }
        }
        this.f6530e = i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f6528c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f6527b);
        sb.append("] <");
        String sb2 = sb.toString();
        ArrayList arrayList = this.f6526a;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            sb2 = sb2 + " " + ((w.d) obj).f6360h0;
        }
        return g2.g.d(sb2, " >");
    }
}
