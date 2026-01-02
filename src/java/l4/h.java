package l4;

import a5.x;
import a5.z;
import android.graphics.Insets;
import android.view.WindowInsets;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j5.n2;
import java.nio.charset.Charset;
import java.util.Set;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class h implements f, a5.f, SuccessContinuation, o2.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3780a;

    public /* synthetic */ h(int i) {
        this.f3780a = i;
    }

    public static /* bridge */ /* synthetic */ int a(Insets insets) {
        return insets.left;
    }

    public static /* bridge */ /* synthetic */ WindowInsets b() {
        return WindowInsets.CONSUMED;
    }

    public static /* bridge */ /* synthetic */ int c(Insets insets) {
        return insets.top;
    }

    public static /* bridge */ /* synthetic */ int d(Insets insets) {
        return insets.right;
    }

    public static /* bridge */ /* synthetic */ int f(Insets insets) {
        return insets.bottom;
    }

    @Override // o2.e
    public Object apply(Object obj) {
        n5.a.f4864b.getClass();
        return k5.a.f3403a.q((n2) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override // a5.f
    public Object e(z zVar) {
        Set c9 = zVar.c(x.a(l6.a.class));
        l6.c cVar = l6.c.f3789c;
        if (cVar == null) {
            synchronized (l6.c.class) {
                try {
                    cVar = l6.c.f3789c;
                    if (cVar == null) {
                        cVar = new l6.c(0);
                        l6.c.f3789c = cVar;
                    }
                } finally {
                }
            }
        }
        return new l6.b(c9, cVar);
    }

    @Override // l4.f
    public Object get() {
        throw new IllegalStateException();
    }

    public Task then(Object obj) {
        n6.h hVar = (n6.h) obj;
        return Tasks.forResult((Object) null);
    }
}
