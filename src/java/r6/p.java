package r6;

import android.content.Context;
import java.io.File;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final /* synthetic */ class p implements u7.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5709a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f5710b;

    public /* synthetic */ p(Context context, int i) {
        this.f5709a = i;
        this.f5710b = context;
    }

    @Override // u7.a
    public final Object invoke() {
        switch (this.f5709a) {
            case 0:
                File a10 = x1.b.a(this.f5710b, "firebaseSessions/sessionConfigsDataStore.data");
                q.c(a10);
                return a10;
            default:
                File a11 = x1.b.a(this.f5710b, "firebaseSessions/sessionDataStore.data");
                q.c(a11);
                return a11;
        }
    }
}
