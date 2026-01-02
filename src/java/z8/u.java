package z8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class u implements u7.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7573a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f7574b;

    public /* synthetic */ u(Object obj, int i) {
        this.f7573a = i;
        this.f7574b = obj;
    }

    @Override // u7.l
    public final Object invoke(Object obj) {
        switch (this.f7573a) {
            case 0:
                Throwable th = (Throwable) obj;
                ((d) this.f7574b).cancel();
                return h7.l.f2236a;
            case 1:
                Throwable th2 = (Throwable) obj;
                ((d) this.f7574b).cancel();
                return h7.l.f2236a;
            case 2:
                Throwable th3 = (Throwable) obj;
                ((d) this.f7574b).cancel();
                return h7.l.f2236a;
            default:
                Throwable th4 = (Throwable) obj;
                h7.l lVar = h7.l.f2236a;
                ((d8.n) this.f7574b).resumeWith(lVar);
                return lVar;
        }
    }
}
