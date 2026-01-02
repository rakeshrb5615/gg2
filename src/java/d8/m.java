package d8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final /* synthetic */ class m implements u7.q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1216a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1217b;

    public /* synthetic */ m(Object obj, int i) {
        this.f1216a = i;
        this.f1217b = obj;
    }

    @Override // u7.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f1216a) {
            case 0:
                l7.h hVar = (l7.h) obj3;
                ((a6.i) this.f1217b).invoke((Throwable) obj);
                break;
            case 1:
                m8.c cVar = (m8.c) this.f1217b;
                Throwable th = (Throwable) obj;
                h7.l lVar = (h7.l) obj2;
                l7.h hVar2 = (l7.h) obj3;
                m8.c.f4059g.set(cVar, null);
                cVar.f(null);
                break;
            default:
                Throwable th2 = (Throwable) obj;
                h7.l lVar2 = (h7.l) obj2;
                l7.h hVar3 = (l7.h) obj3;
                ((m8.g) this.f1217b).b();
                break;
        }
        return h7.l.f2236a;
    }

    public /* synthetic */ m(m8.c cVar, m8.b bVar) {
        this.f1216a = 1;
        this.f1217b = cVar;
    }
}
