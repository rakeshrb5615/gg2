package z8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public abstract class k0 {

    /* renamed from: a  reason: collision with root package name */
    public static final m0.f f7502a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f7503b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f7504c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f7502a = null;
            f7503b = new a(7);
            f7504c = new a(6);
        } else if (property.equals("Dalvik")) {
            f7502a = new m0.f();
            f7503b = new l0(0);
            f7504c = new a(6);
        } else {
            f7502a = null;
            f7503b = new l0(1);
            f7504c = new a(6);
        }
    }
}
