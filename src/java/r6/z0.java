package r6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class z0 {

    /* renamed from: a  reason: collision with root package name */
    public static final z0 f5768a;

    /* renamed from: b  reason: collision with root package name */
    public static final z0 f5769b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ z0[] f5770c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, r6.z0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, r6.z0] */
    static {
        ?? r02 = new Enum("GENERAL", 0);
        f5768a = r02;
        ?? r12 = new Enum("FALLBACK", 1);
        f5769b = r12;
        z0[] z0VarArr = {r02, r12};
        f5770c = z0VarArr;
        c4.b.x(z0VarArr);
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) f5770c.clone();
    }
}
