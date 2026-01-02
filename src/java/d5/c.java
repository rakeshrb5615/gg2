package d5;

import a5.i;
import android.util.Log;
import h.f;
import i5.m;
import i7.j;
import j6.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final m5.c f1125a;

    public c(m5.c cVar) {
        this.f1125a = cVar;
    }

    public final void a(q6.d dVar) {
        m5.c cVar = this.f1125a;
        HashSet hashSet = dVar.f5435a;
        ArrayList arrayList = new ArrayList(j.X(hashSet, 10));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            q6.c cVar2 = (q6.c) ((q6.e) it.next());
            String str = cVar2.f5430b;
            String str2 = cVar2.f5432d;
            String str3 = cVar2.f5433e;
            String str4 = cVar2.f5431c;
            long j = cVar2.f5434f;
            o oVar = m.f2729a;
            if (str3.length() > 256) {
                str3 = str3.substring(0, 256);
            }
            arrayList.add(new i5.b(str, str2, str3, str4, j));
        }
        synchronized (((f) cVar.f4024m)) {
            try {
                if (((f) cVar.f4024m).h(arrayList)) {
                    ((h5.f) cVar.f4021d).f2218b.a(new i(11, cVar, ((f) cVar.f4024m).d()));
                }
            } finally {
            }
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Updated Crashlytics Rollout State", null);
        }
    }
}
