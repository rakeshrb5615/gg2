package t;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class b extends Throwable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5899a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i) {
        super(str);
        this.f5899a = i;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        int i = this.f5899a;
        synchronized (this) {
            switch (i) {
                case 0:
                    return this;
                default:
                    return this;
            }
        }
    }
}
