package b5;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class j implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public static final j f746a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ j[] f747b;

    /* JADX WARN: Type inference failed for: r0v0, types: [b5.j, java.lang.Enum] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f746a = r02;
        f747b = new j[]{r02};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f747b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
