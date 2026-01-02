package z6;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class n implements w6.a0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7424a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f7425b;

    public /* synthetic */ n(Object obj, int i) {
        this.f7424a = i;
        this.f7425b = obj;
    }

    @Override // w6.a0
    public final w6.z a(w6.m mVar, d7.a aVar) {
        switch (this.f7424a) {
            case 0:
                if (aVar.f1153a == Number.class) {
                    return (o) this.f7425b;
                }
                return null;
            case 1:
                if (aVar.f1153a == Object.class) {
                    return new p(mVar, (w6.x) this.f7425b);
                }
                return null;
            default:
                Class cls = aVar.f1153a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (o0) this.f7425b;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f7424a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((o0) this.f7425b) + "]";
            default:
                return super.toString();
        }
    }
}
