package d8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public static final d0 f1171a;

    /* renamed from: b  reason: collision with root package name */
    public static final d0 f1172b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ d0[] f1173c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, d8.d0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, d8.d0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, d8.d0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, d8.d0] */
    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f1171a = r02;
        ?? r12 = new Enum("LAZY", 1);
        ?? r22 = new Enum("ATOMIC", 2);
        f1172b = r22;
        d0[] d0VarArr = {r02, r12, r22, new Enum("UNDISPATCHED", 3)};
        f1173c = d0VarArr;
        c4.b.x(d0VarArr);
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) f1173c.clone();
    }
}
