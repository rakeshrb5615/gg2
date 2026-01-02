package f8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f1523a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f1524b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f1525c;

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ a[] f1526d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, f8.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, f8.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, f8.a] */
    static {
        ?? r02 = new Enum("SUSPEND", 0);
        f1523a = r02;
        ?? r12 = new Enum("DROP_OLDEST", 1);
        f1524b = r12;
        ?? r22 = new Enum("DROP_LATEST", 2);
        f1525c = r22;
        a[] aVarArr = {r02, r12, r22};
        f1526d = aVarArr;
        c4.b.x(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f1526d.clone();
    }
}
