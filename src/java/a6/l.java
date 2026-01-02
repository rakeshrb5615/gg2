package a6;

import a1.t;
import android.content.Context;
import d8.f0;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final e1.e f646b = new e1.e("fire-global");

    /* renamed from: c  reason: collision with root package name */
    public static final e1.e f647c = new e1.e("fire-count");

    /* renamed from: d  reason: collision with root package name */
    public static final e1.e f648d = new e1.e("last-used-date");

    /* renamed from: a  reason: collision with root package name */
    public final q5.d f649a;

    public l(Context context, String str) {
        this.f649a = new q5.d(context, g2.g.l("FirebaseHeartBeat", str));
    }

    public final synchronized ArrayList a() {
        try {
            ArrayList arrayList = new ArrayList();
            String b10 = b(System.currentTimeMillis());
            q5.d dVar = this.f649a;
            dVar.getClass();
            for (Map.Entry entry : ((Map) f0.t(new q5.b(dVar, null, 0))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(b10);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new a(((e1.e) entry.getKey()).f1304a, new ArrayList(hashSet)));
                    }
                }
            }
            final long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.f649a.a(new u7.l() { // from class: a6.k
                    @Override // u7.l
                    public final Object invoke(Object obj) {
                        ((e1.b) obj).d(l.f646b, Long.valueOf(currentTimeMillis));
                        return null;
                    }
                });
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String b(long j) {
        return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public final synchronized e1.e c(e1.b bVar, String str) {
        for (Map.Entry entry : bVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str2 : (Set) entry.getValue()) {
                    if (str.equals(str2)) {
                        return c4.b.c0(((e1.e) entry.getKey()).f1304a);
                    }
                }
                continue;
            }
        }
        return null;
    }

    public final synchronized void d(e1.b bVar, String str) {
        try {
            e1.e c9 = c(bVar, str);
            if (c9 == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) c4.b.B(bVar, c9, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                bVar.c(c9);
            } else {
                bVar.e(c9, hashSet);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean e(e1.e eVar, long j) {
        long longValue;
        q5.d dVar = this.f649a;
        dVar.getClass();
        kotlin.jvm.internal.j.e(eVar, "key");
        longValue = ((Long) f0.t(new a1.d(dVar, eVar, null, 9))).longValue();
        synchronized (this) {
        }
        if (b(longValue).equals(b(j))) {
            return false;
        }
        q5.d dVar2 = this.f649a;
        Long valueOf = Long.valueOf(j);
        dVar2.getClass();
        e1.b bVar = (e1.b) f0.t(new t(dVar2, eVar, valueOf, null, 4));
        return true;
    }
}
