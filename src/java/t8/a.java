package t8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5977a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ a[] f5978b;

    /* JADX WARN: Type inference failed for: r0v0, types: [t8.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [t8.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [t8.a, java.lang.Enum] */
    static {
        ?? r02 = new Enum("NONE", 0);
        ?? r12 = new Enum("ALL_JSON_OBJECTS", 1);
        ?? r22 = new Enum("POLYMORPHIC", 2);
        f5977a = r22;
        a[] aVarArr = {r02, r12, r22};
        f5978b = aVarArr;
        c4.b.x(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f5978b.clone();
    }
}
