package c4;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class j extends i {
    @Override // c4.i, d4.i
    public final void zzb(Bundle bundle) {
        super.zzb(bundle);
        int i = bundle.getInt("error.code", -2);
        TaskCompletionSource taskCompletionSource = this.f918c;
        if (i != 0) {
            taskCompletionSource.trySetException(new e4.a(bundle.getInt("error.code", -2)));
        } else {
            taskCompletionSource.trySetResult((Object) null);
        }
    }
}
