package h4;

import com.google.android.gms.tasks.TaskCompletionSource;
import d4.l;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class e extends d4.d {

    /* renamed from: b  reason: collision with root package name */
    public final l f2200b;

    /* renamed from: c  reason: collision with root package name */
    public final TaskCompletionSource f2201c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f f2202d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, TaskCompletionSource taskCompletionSource) {
        super(1);
        l lVar = new l("OnRequestInstallCallback", 3);
        this.f2202d = fVar;
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.f2200b = lVar;
        this.f2201c = taskCompletionSource;
    }
}
