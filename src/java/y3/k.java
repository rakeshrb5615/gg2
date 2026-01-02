package y3;

import android.os.Handler;
import android.os.Message;
import j6.s;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class k implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f6825a;

    public k(s sVar) {
        this.f6825a = sVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        s sVar = this.f6825a;
        l lVar = (l) message.obj;
        synchronized (sVar.f3282b) {
            if (((l) sVar.f3284d) == lVar || ((l) sVar.f3285e) == lVar) {
                sVar.c(lVar, 2);
            }
        }
        return true;
    }
}
