package s2;

import android.content.Context;
import b8.g;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final n0.a f5814a;

    /* renamed from: b  reason: collision with root package name */
    public final g f5815b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f5816c;

    public d(Context context, g gVar) {
        n0.a aVar = new n0.a(context);
        this.f5816c = new HashMap();
        this.f5814a = aVar;
        this.f5815b = gVar;
    }

    public final synchronized e a(String str) {
        if (this.f5816c.containsKey(str)) {
            return (e) this.f5816c.get(str);
        }
        CctBackendFactory e9 = this.f5814a.e(str);
        if (e9 == null) {
            return null;
        }
        g gVar = this.f5815b;
        e create = e9.create(new b((Context) gVar.f789b, (a3.a) gVar.f790c, (a3.a) gVar.f791d, str));
        this.f5816c.put(str, create);
        return create;
    }
}
