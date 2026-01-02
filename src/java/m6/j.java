package m6;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import g5.p;
import j6.s;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import n6.n;
import n6.o;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class j implements p6.a {
    public static final Clock j = DefaultClock.getInstance();

    /* renamed from: k  reason: collision with root package name */
    public static final Random f4039k = new Random();

    /* renamed from: l  reason: collision with root package name */
    public static final HashMap f4040l = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Context f4042b;

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledExecutorService f4043c;

    /* renamed from: d  reason: collision with root package name */
    public final q4.f f4044d;

    /* renamed from: e  reason: collision with root package name */
    public final d6.d f4045e;

    /* renamed from: f  reason: collision with root package name */
    public final r4.c f4046f;

    /* renamed from: g  reason: collision with root package name */
    public final c6.b f4047g;

    /* renamed from: h  reason: collision with root package name */
    public final String f4048h;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f4041a = new HashMap();
    public final HashMap i = new HashMap();

    /* JADX WARN: Type inference failed for: r5v2, types: [com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener, java.lang.Object] */
    public j(Context context, ScheduledExecutorService scheduledExecutorService, q4.f fVar, d6.d dVar, r4.c cVar, c6.b bVar) {
        this.f4042b = context;
        this.f4043c = scheduledExecutorService;
        this.f4044d = fVar;
        this.f4045e = dVar;
        this.f4046f = cVar;
        this.f4047g = bVar;
        fVar.a();
        this.f4048h = fVar.f5388c.f5400b;
        AtomicReference atomicReference = i.f4038a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = i.f4038a;
        if (atomicReference2.get() == null) {
            ?? obj = new Object();
            while (true) {
                if (!atomicReference2.compareAndSet(null, obj)) {
                    if (atomicReference2.get() != null) {
                        break;
                    }
                } else {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener((BackgroundDetector.BackgroundStateChangeListener) obj);
                    break;
                }
            }
        }
        Tasks.call(scheduledExecutorService, new p(this, 1));
    }

    public final synchronized b a() {
        try {
            try {
                n6.d c9 = c("fetch");
                n6.d c10 = c("activate");
                n6.d c11 = c("defaults");
                Context context = this.f4042b;
                String str = this.f4048h;
                n nVar = new n(context.getSharedPreferences("frc_" + str + "_firebase_settings", 0));
                n6.j jVar = new n6.j(this.f4043c, c10, c11);
                q4.f fVar = this.f4044d;
                c6.b bVar = this.f4047g;
                fVar.a();
                final n0.a aVar = fVar.f5387b.equals("[DEFAULT]") ? new n0.a(bVar) : null;
                if (aVar != null) {
                    BiConsumer biConsumer = new BiConsumer() { // from class: m6.h
                        public final void accept(Object obj, Object obj2) {
                            JSONObject optJSONObject;
                            n0.a aVar2 = n0.a.this;
                            String str2 = (String) obj;
                            n6.f fVar2 = (n6.f) obj2;
                            u4.b bVar2 = (u4.b) ((c6.b) aVar2.f4373b).get();
                            if (bVar2 == null) {
                                return;
                            }
                            JSONObject jSONObject = fVar2.f4914e;
                            if (jSONObject.length() < 1) {
                                return;
                            }
                            JSONObject jSONObject2 = fVar2.f4911b;
                            if (jSONObject2.length() >= 1 && (optJSONObject = jSONObject.optJSONObject(str2)) != null) {
                                String optString = optJSONObject.optString("choiceId");
                                if (optString.isEmpty()) {
                                    return;
                                }
                                synchronized (((Map) aVar2.f4374c)) {
                                    try {
                                        if (optString.equals(((Map) aVar2.f4374c).get(str2))) {
                                            return;
                                        }
                                        ((Map) aVar2.f4374c).put(str2, optString);
                                        Bundle bundle = new Bundle();
                                        bundle.putString("arm_key", str2);
                                        bundle.putString("arm_value", jSONObject2.optString(str2));
                                        bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                                        bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                                        bundle.putString("group", optJSONObject.optString("group"));
                                        u4.c cVar = (u4.c) bVar2;
                                        cVar.a("fp", "personalization_assignment", bundle);
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putString("_fpid", optString);
                                        cVar.a("fp", "_fpc", bundle2);
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        }
                    };
                    synchronized (jVar.f4936a) {
                        jVar.f4936a.add(biConsumer);
                    }
                }
                n0.a aVar2 = new n0.a(4);
                aVar2.f4373b = c10;
                aVar2.f4374c = c11;
                ScheduledExecutorService scheduledExecutorService = this.f4043c;
                s sVar = new s(8, false);
                sVar.f3285e = Collections.newSetFromMap(new ConcurrentHashMap());
                sVar.f3282b = c10;
                sVar.f3283c = aVar2;
                sVar.f3284d = scheduledExecutorService;
                return b(this.f4044d, this.f4045e, this.f4046f, this.f4043c, c9, c10, c11, d(c9, nVar), jVar, nVar, sVar);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized b b(q4.f fVar, d6.d dVar, r4.c cVar, Executor executor, n6.d dVar2, n6.d dVar3, n6.d dVar4, n6.i iVar, n6.j jVar, n nVar, s sVar) {
        if (!this.f4041a.containsKey("firebase")) {
            fVar.a();
            r4.c cVar2 = fVar.f5387b.equals("[DEFAULT]") ? cVar : null;
            Context context = this.f4042b;
            synchronized (this) {
                b bVar = new b(cVar2, executor, dVar2, dVar3, dVar4, iVar, jVar, nVar, new n0.a(fVar, dVar, iVar, dVar3, context, nVar, this.f4043c), sVar);
                dVar3.b();
                dVar4.b();
                dVar2.b();
                this.f4041a.put("firebase", bVar);
                f4040l.put("firebase", bVar);
            }
        }
        return (b) this.f4041a.get("firebase");
    }

    public final n6.d c(String str) {
        o oVar;
        n6.d dVar;
        String str2 = "frc_" + this.f4048h + "_firebase_" + str + ".json";
        ScheduledExecutorService scheduledExecutorService = this.f4043c;
        Context context = this.f4042b;
        HashMap hashMap = o.f4966c;
        synchronized (o.class) {
            try {
                HashMap hashMap2 = o.f4966c;
                if (!hashMap2.containsKey(str2)) {
                    hashMap2.put(str2, new o(context, str2));
                }
                oVar = (o) hashMap2.get(str2);
            } finally {
            }
        }
        HashMap hashMap3 = n6.d.f4898d;
        synchronized (n6.d.class) {
            try {
                String str3 = oVar.f4968b;
                HashMap hashMap4 = n6.d.f4898d;
                if (!hashMap4.containsKey(str3)) {
                    hashMap4.put(str3, new n6.d(scheduledExecutorService, oVar));
                }
                dVar = (n6.d) hashMap4.get(str3);
            } finally {
            }
        }
        return dVar;
    }

    public final synchronized n6.i d(n6.d dVar, n nVar) {
        d6.d dVar2;
        c6.b gVar;
        ScheduledExecutorService scheduledExecutorService;
        Clock clock;
        Random random;
        String str;
        q4.f fVar;
        try {
            dVar2 = this.f4045e;
            q4.f fVar2 = this.f4044d;
            fVar2.a();
            gVar = fVar2.f5387b.equals("[DEFAULT]") ? this.f4047g : new a5.g(7);
            scheduledExecutorService = this.f4043c;
            clock = j;
            random = f4039k;
            q4.f fVar3 = this.f4044d;
            fVar3.a();
            str = fVar3.f5388c.f5399a;
            fVar = this.f4044d;
            fVar.a();
        } catch (Throwable th) {
            throw th;
        }
        return new n6.i(dVar2, gVar, scheduledExecutorService, clock, random, dVar, new ConfigFetchHttpClient(this.f4042b, fVar.f5388c.f5400b, str, nVar.f4962a.getLong("fetch_timeout_in_seconds", 60L), nVar.f4962a.getLong("fetch_timeout_in_seconds", 60L)), nVar, this.i);
    }
}
