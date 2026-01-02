package r6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class x implements v5.f {

    /* renamed from: b  reason: collision with root package name */
    public static final x f5757b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ x[] f5758c;

    /* renamed from: a  reason: collision with root package name */
    public final int f5759a;

    static {
        x xVar = new x("LOG_ENVIRONMENT_UNKNOWN", 0, 0);
        x xVar2 = new x("LOG_ENVIRONMENT_AUTOPUSH", 1, 1);
        x xVar3 = new x("LOG_ENVIRONMENT_STAGING", 2, 2);
        x xVar4 = new x("LOG_ENVIRONMENT_PROD", 3, 3);
        f5757b = xVar4;
        x[] xVarArr = {xVar, xVar2, xVar3, xVar4};
        f5758c = xVarArr;
        c4.b.x(xVarArr);
    }

    public x(String str, int i, int i9) {
        this.f5759a = i9;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f5758c.clone();
    }

    @Override // v5.f
    public final int a() {
        return this.f5759a;
    }
}
