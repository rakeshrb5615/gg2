package s6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f5853a;

    /* renamed from: b  reason: collision with root package name */
    public static final d f5854b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ d[] f5855c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, s6.d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, s6.d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, s6.d] */
    static {
        ?? r02 = new Enum("CRASHLYTICS", 0);
        f5853a = r02;
        ?? r12 = new Enum("PERFORMANCE", 1);
        f5854b = r12;
        d[] dVarArr = {r02, r12, new Enum("MATT_SAYS_HI", 2)};
        f5855c = dVarArr;
        c4.b.x(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f5855c.clone();
    }
}
