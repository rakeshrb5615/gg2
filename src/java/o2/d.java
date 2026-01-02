package o2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f5006a;

    /* renamed from: b  reason: collision with root package name */
    public static final d f5007b;

    /* renamed from: c  reason: collision with root package name */
    public static final d f5008c;

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ d[] f5009d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, o2.d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, o2.d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, o2.d] */
    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f5006a = r02;
        ?? r12 = new Enum("VERY_LOW", 1);
        f5007b = r12;
        ?? r22 = new Enum("HIGHEST", 2);
        f5008c = r22;
        f5009d = new d[]{r02, r12, r22};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f5009d.clone();
    }
}
