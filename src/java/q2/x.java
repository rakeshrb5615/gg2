package q2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final x f5304a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ x[] f5305b;
    /* JADX INFO: Fake field, exist only in values array */
    x EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, q2.x] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, q2.x] */
    static {
        ?? r02 = new Enum("UNKNOWN", 0);
        ?? r12 = new Enum("ANDROID_FIREBASE", 1);
        f5304a = r12;
        f5305b = new x[]{r02, r12};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f5305b.clone();
    }
}
