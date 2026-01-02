package a5;

import android.os.StrictMode;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final /* synthetic */ class g implements c6.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f578a;

    public /* synthetic */ g(int i) {
        this.f578a = i;
    }

    @Override // c6.b
    public final Object get() {
        switch (this.f578a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                r rVar = ExecutorsRegistrar.a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                detectNetwork.detectResourceMismatches();
                detectNetwork.detectUnbufferedIo();
                return new b5.g(Executors.newFixedThreadPool(4, new b5.a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                r rVar2 = ExecutorsRegistrar.a;
                return new b5.g(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new b5.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                r rVar3 = ExecutorsRegistrar.a;
                return new b5.g(Executors.newCachedThreadPool(new b5.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                r rVar4 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new b5.a("Firebase Scheduler", 0, null));
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                j6.o oVar = FirebaseMessaging.k;
                return null;
            default:
                Clock clock = m6.j.j;
                return null;
        }
    }
}
