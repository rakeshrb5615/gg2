package m7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f4049a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ a[] f4050b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, m7.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, m7.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, m7.a] */
    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f4049a = r02;
        a[] aVarArr = {r02, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
        f4050b = aVarArr;
        c4.b.x(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f4050b.clone();
    }
}
