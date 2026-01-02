package q0;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public abstract class o0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static g b(View view, g gVar) {
        ContentInfo d9 = gVar.f5124a.d();
        Objects.requireNonNull(d9);
        ContentInfo performReceiveContent = view.performReceiveContent(d9);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == d9 ? gVar : new g(new c(performReceiveContent));
    }
}
