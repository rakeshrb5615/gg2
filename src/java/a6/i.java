package a6;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import r6.h0;
import r6.i0;
import s8.m;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final /* synthetic */ class i implements u7.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f640a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f641b;

    public /* synthetic */ i(Object obj, int i) {
        this.f640a = i;
        this.f641b = obj;
    }

    @Override // u7.l
    public final Object invoke(Object obj) {
        switch (this.f640a) {
            case 0:
                l lVar = (l) this.f641b;
                e1.b bVar = (e1.b) obj;
                e1.e eVar = l.f647c;
                long j = 0;
                for (Map.Entry entry : bVar.a().entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        e1.e eVar2 = (e1.e) entry.getKey();
                        String b10 = lVar.b(System.currentTimeMillis());
                        if (((Set) entry.getValue()).contains(b10)) {
                            Object[] objArr = {b10};
                            HashSet hashSet = new HashSet(1);
                            Object obj2 = objArr[0];
                            Objects.requireNonNull(obj2);
                            if (!hashSet.add(obj2)) {
                                throw new IllegalArgumentException("duplicate element: " + obj2);
                            }
                            bVar.d(eVar2, Collections.unmodifiableSet(hashSet));
                            j++;
                        } else {
                            bVar.c(eVar2);
                        }
                    }
                }
                if (j == 0) {
                    bVar.c(eVar);
                    return null;
                }
                bVar.d(eVar, Long.valueOf(j));
                return null;
            case 1:
                kotlin.jvm.internal.j.e(obj, "it");
                return ((e.e) this.f641b).invoke();
            case 2:
                return ((b8.f) this.f641b).c(((Integer) obj).intValue());
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                return obj == ((i7.a) this.f641b) ? "(this Collection)" : String.valueOf(obj);
            case 4:
                Throwable th = (Throwable) obj;
                ((m8.c) this.f641b).f(null);
                return h7.l.f2236a;
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                a1.b bVar2 = (a1.b) obj;
                kotlin.jvm.internal.j.e(bVar2, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", bVar2);
                return new h0(((i0) this.f641b).f5681a.a(null), null, null);
            default:
                m mVar = (m) this.f641b;
                int intValue = ((Integer) obj).intValue();
                return mVar.f5883e[intValue] + ": " + mVar.i(intValue).b();
        }
    }

    public /* synthetic */ i(m8.c cVar, m8.b bVar) {
        this.f640a = 4;
        this.f641b = cVar;
    }
}
