package q2;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final j0 f5265a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ j0[] f5266b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, java.lang.Object, q2.j0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, java.lang.Object, q2.j0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Enum, java.lang.Object, q2.j0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, java.lang.Object, q2.j0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, java.lang.Object, q2.j0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, java.lang.Object, q2.j0] */
    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f5265a = r02;
        ?? r12 = new Enum("UNMETERED_ONLY", 1);
        ?? r22 = new Enum("UNMETERED_OR_DAILY", 2);
        ?? r32 = new Enum("FAST_IF_RADIO_AWAKE", 3);
        ?? r42 = new Enum("NEVER", 4);
        ?? r52 = new Enum("UNRECOGNIZED", 5);
        f5266b = new j0[]{r02, r12, r22, r32, r42, r52};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r02);
        sparseArray.put(1, r12);
        sparseArray.put(2, r22);
        sparseArray.put(3, r32);
        sparseArray.put(4, r42);
        sparseArray.put(-1, r52);
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) f5266b.clone();
    }
}
