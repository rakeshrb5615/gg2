package u6;

import android.content.Context;
import android.os.Bundle;
import j5.t1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class a implements p {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f6087a;

    public a(Context context) {
        kotlin.jvm.internal.j.e(context, "appContext");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f6087a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // u6.p
    public final Boolean a() {
        Bundle bundle = this.f6087a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // u6.p
    public final Double b() {
        Bundle bundle = this.f6087a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // u6.p
    public final Object c(l7.c cVar) {
        return h7.l.f2236a;
    }

    @Override // u6.p
    public final c8.a d() {
        Bundle bundle = this.f6087a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new c8.a(t1.U(bundle.getInt("firebase_sessions_sessions_restart_timeout"), c8.c.f952d));
        }
        return null;
    }
}
