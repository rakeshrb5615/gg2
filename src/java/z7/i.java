package z7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ i[] f7459a;

    /* JADX WARN: Type inference failed for: r0v0, types: [z7.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [z7.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [z7.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [z7.i, java.lang.Enum] */
    static {
        i[] iVarArr = {new Enum("PUBLIC", 0), new Enum("PROTECTED", 1), new Enum("INTERNAL", 2), new Enum("PRIVATE", 3)};
        f7459a = iVarArr;
        c4.b.x(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f7459a.clone();
    }
}
