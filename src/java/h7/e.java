package h7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ e[] f2224a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, h7.e] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, h7.e] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, h7.e] */
    static {
        e[] eVarArr = {new Enum("SYNCHRONIZED", 0), new Enum("PUBLICATION", 1), new Enum("NONE", 2)};
        f2224a = eVarArr;
        c4.b.x(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f2224a.clone();
    }
}
