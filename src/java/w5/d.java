package w5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f6443a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ d[] f6444b;

    /* JADX WARN: Type inference failed for: r0v0, types: [w5.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [w5.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [w5.d, java.lang.Enum] */
    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f6443a = r02;
        f6444b = new d[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f6444b.clone();
    }
}
