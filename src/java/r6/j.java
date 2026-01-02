package r6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class j implements v5.f {

    /* renamed from: b  reason: collision with root package name */
    public static final j f5682b;

    /* renamed from: c  reason: collision with root package name */
    public static final j f5683c;

    /* renamed from: d  reason: collision with root package name */
    public static final j f5684d;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ j[] f5685e;

    /* renamed from: a  reason: collision with root package name */
    public final int f5686a;

    static {
        j jVar = new j("COLLECTION_UNKNOWN", 0, 0);
        j jVar2 = new j("COLLECTION_SDK_NOT_INSTALLED", 1, 1);
        f5682b = jVar2;
        j jVar3 = new j("COLLECTION_ENABLED", 2, 2);
        f5683c = jVar3;
        j jVar4 = new j("COLLECTION_DISABLED", 3, 3);
        f5684d = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, new j("COLLECTION_DISABLED_REMOTE", 4, 4), new j("COLLECTION_SAMPLED", 5, 5)};
        f5685e = jVarArr;
        c4.b.x(jVarArr);
    }

    public j(String str, int i, int i9) {
        this.f5686a = i9;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f5685e.clone();
    }

    @Override // v5.f
    public final int a() {
        return this.f5686a;
    }
}
