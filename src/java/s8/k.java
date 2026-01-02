package s8;

import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final q8.d[] f5876a = new q8.d[0];

    public static final void a(int i, int i9, q8.d dVar) {
        kotlin.jvm.internal.j.e(dVar, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i10 = (~i) & i9;
        for (int i11 = 0; i11 < 32; i11++) {
            if ((i10 & 1) != 0) {
                arrayList.add(dVar.e(i11));
            }
            i10 >>>= 1;
        }
        String b10 = dVar.b();
        kotlin.jvm.internal.j.e(b10, "serialName");
        throw new o8.b(arrayList, arrayList.size() == 1 ? "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + b10 + "', but it was missing" : "Fields " + arrayList + " are required for type with serial name '" + b10 + "', but they were missing", null);
    }
}
