package w3;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase-auth-api.zzahy;
import com.google.android.gms.internal.firebase-auth-api.zzaiz;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;
import y4.p;
import y4.w;
import y4.z;
import y7.e;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6432a;

    /* renamed from: b  reason: collision with root package name */
    public final SideSheetBehavior f6433b;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f6432a = i;
        this.f6433b = sideSheetBehavior;
    }

    public static y7.d e(e eVar, int i) {
        j.e(eVar, "<this>");
        boolean z9 = i > 0;
        Integer valueOf = Integer.valueOf(i);
        if (!z9) {
            throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
        }
        int i9 = eVar.f6967a;
        int i10 = eVar.f6968b;
        if (eVar.f6969c <= 0) {
            i = -i;
        }
        return new y7.d(i9, i10, i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [y7.e, y7.d] */
    public static e f(int i, int i9) {
        if (i9 <= Integer.MIN_VALUE) {
            e eVar = e.f6970d;
            return e.f6970d;
        }
        return new y7.d(i, i9 - 1, 1);
    }

    public static ArrayList h(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p i = i((zzahy) it.next());
            if (i != null) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }

    public static p i(zzahy zzahyVar) {
        if (zzahyVar == null) {
            return null;
        }
        if (TextUtils.isEmpty(zzahyVar.zze())) {
            if (zzahyVar.zzb() != null) {
                return new z(zzahyVar.zzd(), zzahyVar.zzc(), zzahyVar.zza(), (zzaiz) Preconditions.checkNotNull(zzahyVar.zzb(), "totpInfo cannot be null."));
            }
            return null;
        }
        return new w(zzahyVar.zza(), zzahyVar.zzd(), zzahyVar.zzc(), Preconditions.checkNotEmpty(zzahyVar.zze()));
    }

    public final int a() {
        switch (this.f6432a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f6433b;
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f6433b;
                return Math.max(0, (sideSheetBehavior2.m - sideSheetBehavior2.l) - sideSheetBehavior2.o);
        }
    }

    public final int b() {
        switch (this.f6432a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f6433b;
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return this.f6433b.m;
        }
    }

    public final int c(View view) {
        switch (this.f6432a) {
            case 0:
                return view.getRight() + this.f6433b.o;
            default:
                return view.getLeft() - this.f6433b.o;
        }
    }

    public final int d() {
        switch (this.f6432a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    public final void g(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        switch (this.f6432a) {
            case 0:
                marginLayoutParams.leftMargin = i;
                return;
            default:
                marginLayoutParams.rightMargin = i;
                return;
        }
    }
}
