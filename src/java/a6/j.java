package a6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final /* synthetic */ class j implements u7.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f642a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f643b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f644c;

    public /* synthetic */ j(int i, Object obj, Object obj2) {
        this.f642a = i;
        this.f643b = obj;
        this.f644c = obj2;
    }

    @Override // u7.l
    public final Object invoke(Object obj) {
        switch (this.f642a) {
            case 0:
                l lVar = (l) this.f643b;
                String str = (String) this.f644c;
                e1.b bVar = (e1.b) obj;
                lVar.getClass();
                bVar.d(l.f648d, str);
                lVar.d(bVar, str);
                return null;
            default:
                Throwable th = (Throwable) obj;
                ((e8.c) this.f643b).f1357c.removeCallbacks((b5.l) this.f644c);
                return h7.l.f2236a;
        }
    }
}
