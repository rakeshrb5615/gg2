package x;

import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public o f6521a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f6522b;

    public static long a(f fVar, long j) {
        o oVar = fVar.f6511d;
        ArrayList arrayList = fVar.f6516k;
        if (oVar instanceof j) {
            return j;
        }
        int size = arrayList.size();
        long j8 = j;
        for (int i = 0; i < size; i++) {
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f6511d != oVar) {
                    j8 = Math.min(j8, a(fVar2, fVar2.f6513f + j));
                }
            }
        }
        f fVar3 = oVar.i;
        f fVar4 = oVar.f6538h;
        if (fVar == fVar3) {
            long j9 = j - oVar.j();
            return Math.min(Math.min(j8, a(fVar4, j9)), j9 - fVar4.f6513f);
        }
        return j8;
    }

    public static long b(f fVar, long j) {
        o oVar = fVar.f6511d;
        ArrayList arrayList = fVar.f6516k;
        if (oVar instanceof j) {
            return j;
        }
        int size = arrayList.size();
        long j8 = j;
        for (int i = 0; i < size; i++) {
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f6511d != oVar) {
                    j8 = Math.max(j8, b(fVar2, fVar2.f6513f + j));
                }
            }
        }
        f fVar3 = oVar.f6538h;
        f fVar4 = oVar.i;
        if (fVar == fVar3) {
            long j9 = oVar.j() + j;
            return Math.max(Math.max(j8, b(fVar4, j9)), j9 - fVar4.f6513f);
        }
        return j8;
    }
}
