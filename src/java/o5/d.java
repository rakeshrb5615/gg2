package o5;

import android.util.Log;
import j6.o;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public Object f5021a;

    /* renamed from: b  reason: collision with root package name */
    public Object f5022b;

    /* renamed from: c  reason: collision with root package name */
    public Object f5023c;

    /* renamed from: d  reason: collision with root package name */
    public Object f5024d;

    /* renamed from: e  reason: collision with root package name */
    public Object f5025e;

    /* renamed from: f  reason: collision with root package name */
    public Object f5026f;

    /* renamed from: g  reason: collision with root package name */
    public Object f5027g;

    /* renamed from: h  reason: collision with root package name */
    public Object f5028h;
    public Object i;

    public static void d(JSONObject jSONObject, String str) {
        StringBuilder b10 = u.e.b(str);
        b10.append(jSONObject.toString());
        String sb = b10.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb, null);
        }
    }

    public c a(int i) {
        c cVar = null;
        try {
            if (!u.e.a(2, i)) {
                JSONObject G = ((o) this.f5025e).G();
                if (G != null) {
                    c E = ((o) this.f5023c).E(G);
                    d(G, "Loaded cached settings: ");
                    ((c5.c) this.f5024d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (u.e.a(3, i) || E.f5017c >= currentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return E;
                        } catch (Exception e9) {
                            e = e9;
                            cVar = E;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return cVar;
                        }
                    } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        return null;
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e10) {
            e = e10;
        }
    }

    public c b() {
        return (c) ((AtomicReference) this.f5028h).get();
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0428 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, o5.d] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, o5.d] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, r2.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(r2.j r47, int r48) {
        /*
            Method dump skipped, instructions count: 1218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.d.c(r2.j, int):void");
    }
}
