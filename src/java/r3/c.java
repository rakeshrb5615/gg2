package r3;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import h.v;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public OnBackInvokedCallback f5564a;

    public OnBackInvokedCallback a(b bVar) {
        Objects.requireNonNull(bVar);
        return new v(bVar, 2);
    }

    public void b(b bVar, View view, boolean z9) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (this.f5564a == null && (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
            OnBackInvokedCallback a10 = a(bVar);
            this.f5564a = a10;
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(z9 ? 1000000 : 0, a10);
        }
    }

    public void c(View view) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (this.f5564a == null || (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f5564a);
        this.f5564a = null;
    }
}
