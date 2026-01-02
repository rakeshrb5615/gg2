package d4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.install.zza;
import h.z;
import i2.e0;
import i2.n0;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class k extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1094a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1095b;

    public /* synthetic */ k(Object obj, int i) {
        this.f1094a = i;
        this.f1095b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f1094a) {
            case 0:
                c4.c cVar = (c4.c) this.f1095b;
                if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
                    cVar.f901a.d("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
                    return;
                }
                cVar.f901a.d("List of extras in received intent:", new Object[0]);
                for (String str : intent.getExtras().keySet()) {
                    cVar.f901a.d("Key: %s; value: %s", str, intent.getExtras().get(str));
                }
                l lVar = cVar.f901a;
                lVar.d("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
                lVar.d("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
                lVar.d("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
                zza zzaVar = new zza(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
                cVar.f901a.d("ListenerRegistryBroadcastReceiver.onReceive: %s", zzaVar);
                synchronized (cVar) {
                    Iterator it = new HashSet(cVar.f904d).iterator();
                    while (it.hasNext()) {
                        ((e0) it.next()).a(zzaVar);
                    }
                }
                return;
            case 1:
                ((z) this.f1095b).g();
                return;
            default:
                ((n0) this.f1095b).b();
                return;
        }
    }
}
