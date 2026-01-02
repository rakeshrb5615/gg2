package b5;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class n implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public static final n f759a;

    /* renamed from: b  reason: collision with root package name */
    public static final Handler f760b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ n[] f761c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, b5.n] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f759a = r02;
        f761c = new n[]{r02};
        f760b = new Handler(Looper.getMainLooper());
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f761c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f760b.post(runnable);
    }
}
