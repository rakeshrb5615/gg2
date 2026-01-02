package k8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f3436a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f3437b;

    /* renamed from: c  reason: collision with root package name */
    public static final b f3438c;

    /* renamed from: d  reason: collision with root package name */
    public static final b f3439d;

    /* renamed from: e  reason: collision with root package name */
    public static final b f3440e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ b[] f3441f;

    /* JADX WARN: Type inference failed for: r0v0, types: [k8.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [k8.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [k8.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [k8.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [k8.b, java.lang.Enum] */
    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f3436a = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f3437b = r12;
        ?? r22 = new Enum("PARKING", 2);
        f3438c = r22;
        ?? r32 = new Enum("DORMANT", 3);
        f3439d = r32;
        ?? r42 = new Enum("TERMINATED", 4);
        f3440e = r42;
        b[] bVarArr = {r02, r12, r22, r32, r42};
        f3441f = bVarArr;
        c4.b.x(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f3441f.clone();
    }
}
