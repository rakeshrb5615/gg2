package d8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class z1 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f1269a = new ThreadLocal();

    public static x0 a() {
        ThreadLocal threadLocal = f1269a;
        x0 x0Var = (x0) threadLocal.get();
        if (x0Var == null) {
            i iVar = new i(Thread.currentThread());
            threadLocal.set(iVar);
            return iVar;
        }
        return x0Var;
    }
}
