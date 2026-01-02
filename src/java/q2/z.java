package q2;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final z f5306a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ z[] f5307b;
    /* JADX INFO: Fake field, exist only in values array */
    z EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, q2.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, q2.z, java.lang.Object] */
    static {
        ?? r02 = new Enum("NOT_SET", 0);
        ?? r12 = new Enum("EVENT_OVERRIDE", 1);
        f5306a = r12;
        f5307b = new z[]{r02, r12};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r02);
        sparseArray.put(5, r12);
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f5307b.clone();
    }
}
