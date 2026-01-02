package v5;

import java.util.Map;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final /* synthetic */ class a implements t5.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6302a;

    @Override // t5.a
    public final void a(Object obj, Object obj2) {
        switch (this.f6302a) {
            case 0:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                t5.e eVar = (t5.e) obj2;
                eVar.f(w5.f.f6446g, entry.getKey());
                eVar.f(w5.f.f6447h, entry.getValue());
                return;
            default:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
