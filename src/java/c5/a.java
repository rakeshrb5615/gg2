package c5;

import a6.e;
import android.os.Bundle;
import android.util.Log;
import b8.g;
import g5.q;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final /* synthetic */ class a implements f5.a, e5.a, c6.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f928a;

    public /* synthetic */ a(b bVar) {
        this.f928a = bVar;
    }

    @Override // c6.a
    public void a(c6.b bVar) {
        b bVar2 = this.f928a;
        d5.d dVar = d5.d.f1126a;
        dVar.b("AnalyticsConnector now available.");
        u4.b bVar3 = (u4.b) bVar.get();
        l6.c cVar = new l6.c(bVar3, 14);
        k2.c cVar2 = new k2.c(6, false);
        u4.c cVar3 = (u4.c) bVar3;
        e b10 = cVar3.b("clx", cVar2);
        if (b10 == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            b10 = cVar3.b("crash", cVar2);
            if (b10 != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
        }
        if (b10 == null) {
            dVar.d("Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        dVar.b("Registered Firebase Analytics listener.");
        l6.c cVar4 = new l6.c(13, false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        g gVar = new g(cVar);
        synchronized (bVar2) {
            try {
                ArrayList arrayList = (ArrayList) bVar2.f929a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    cVar4.b((q) obj);
                }
                cVar2.f3364c = cVar4;
                cVar2.f3363b = gVar;
                bVar2.f931c = cVar4;
                bVar2.f930b = gVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // f5.a
    public void b(q qVar) {
        b bVar = this.f928a;
        synchronized (bVar) {
            try {
                if (((f5.a) bVar.f931c) instanceof f5.b) {
                    ((ArrayList) bVar.f929a).add(qVar);
                }
                ((f5.a) bVar.f931c).b(qVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // e5.a
    public void g(Bundle bundle) {
        ((e5.a) this.f928a.f930b).g(bundle);
    }
}
