package c4;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class i extends d4.d implements d4.i {

    /* renamed from: b  reason: collision with root package name */
    public final d4.l f917b;

    /* renamed from: c  reason: collision with root package name */
    public final TaskCompletionSource f918c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ l f919d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, d4.l lVar2, TaskCompletionSource taskCompletionSource) {
        super(0);
        this.f919d = lVar;
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.f917b = lVar2;
        this.f918c = taskCompletionSource;
    }

    @Override // d4.i
    public void a(Bundle bundle) {
        this.f919d.f923a.c(this.f918c);
        this.f917b.h("onRequestInfo", new Object[0]);
    }

    @Override // d4.i
    public void zzb(Bundle bundle) {
        this.f919d.f923a.c(this.f918c);
        this.f917b.h("onCompleteUpdate", new Object[0]);
    }
}
