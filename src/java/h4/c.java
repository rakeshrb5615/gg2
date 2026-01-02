package h4;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class c extends ResultReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f2196a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.f2196a = taskCompletionSource;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.f2196a.trySetResult((Object) null);
    }
}
