package i1;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class h extends g1.g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f2270a;

    public h(EditText editText) {
        this.f2270a = new WeakReference(editText);
    }

    @Override // g1.g
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.f2270a.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        i.a((EditText) this.f2270a.get(), 1);
    }
}
