package h;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class c extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1989a = 0;

    /* renamed from: b  reason: collision with root package name */
    public Object f1990b;

    public /* synthetic */ c() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        c4.b[] bVarArr;
        switch (this.f1989a) {
            case 0:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f1990b).get(), message.what);
                    return;
                } else if (i != 1) {
                    return;
                } else {
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            default:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                r1.a aVar = (r1.a) this.f1990b;
                do {
                    synchronized (aVar.f5497b) {
                        try {
                            size = aVar.f5499d.size();
                            if (size <= 0) {
                                return;
                            }
                            bVarArr = new c4.b[size];
                            aVar.f5499d.toArray(bVarArr);
                            aVar.f5499d.clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } while (size <= 0);
                c4.b bVar = bVarArr[0];
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r1.a aVar, Looper looper) {
        super(looper);
        this.f1990b = aVar;
    }
}
