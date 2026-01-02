package c7;

import java.sql.Timestamp;
import java.util.Date;
import w6.z;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class d extends z {

    /* renamed from: b  reason: collision with root package name */
    public static final c f939b = new c();

    /* renamed from: a  reason: collision with root package name */
    public final z f940a;

    public d(z zVar) {
        this.f940a = zVar;
    }

    @Override // w6.z
    public final Object b(e7.a aVar) {
        Date date = (Date) this.f940a.b(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        this.f940a.c(bVar, (Timestamp) obj);
    }
}
