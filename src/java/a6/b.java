package a6;

import a5.x;
import a5.z;
import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final /* synthetic */ class b implements a5.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f627a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x f628b;

    public /* synthetic */ b(x xVar, int i) {
        this.f627a = i;
        this.f628b = xVar;
    }

    @Override // a5.f
    public final Object e(z zVar) {
        switch (this.f627a) {
            case 0:
                return new d((Context) zVar.a(Context.class), ((q4.f) zVar.a(q4.f.class)).f(), zVar.c(x.a(e.class)), zVar.f(l6.b.class), (Executor) zVar.e(this.f628b));
            case 1:
                return FirebaseMessagingRegistrar.a(this.f628b, zVar);
            default:
                return RemoteConfigRegistrar.a(this.f628b, zVar);
        }
    }
}
