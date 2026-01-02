package a6;

import a5.r;
import android.content.Context;
import android.os.UserManager;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class d implements f, g {

    /* renamed from: a  reason: collision with root package name */
    public final r f631a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f632b;

    /* renamed from: c  reason: collision with root package name */
    public final c6.b f633c;

    /* renamed from: d  reason: collision with root package name */
    public final Set f634d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f635e;

    public d(Context context, String str, Set set, c6.b bVar, Executor executor) {
        this.f631a = new r(new a5.h(1, context, str));
        this.f634d = set;
        this.f635e = executor;
        this.f633c = bVar;
        this.f632b = context;
    }

    public final void a() {
        if (this.f634d.size() <= 0) {
            Tasks.forResult((Object) null);
        } else if (!((UserManager) this.f632b.getSystemService(UserManager.class)).isUserUnlocked()) {
            Tasks.forResult((Object) null);
        } else {
            Tasks.call(this.f635e, new c(this, 1));
        }
    }
}
