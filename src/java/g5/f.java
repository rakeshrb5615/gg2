package g5;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f1785a;

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f1786b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ f[] f1787c;
    /* JADX INFO: Fake field, exist only in values array */
    f EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, g5.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, g5.f] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, g5.f] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, g5.f] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, g5.f] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, g5.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, g5.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, g5.f] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, g5.f] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, g5.f, java.lang.Object] */
    static {
        ?? r02 = new Enum("X86_32", 0);
        ?? r12 = new Enum("X86_64", 1);
        ?? r22 = new Enum("ARM_UNKNOWN", 2);
        ?? r32 = new Enum("PPC", 3);
        ?? r42 = new Enum("PPC64", 4);
        ?? r52 = new Enum("ARMV6", 5);
        ?? r62 = new Enum("ARMV7", 6);
        ?? r72 = new Enum("UNKNOWN", 7);
        f1785a = r72;
        ?? r8 = new Enum("ARMV7S", 8);
        ?? r9 = new Enum("ARM64", 9);
        f1787c = new f[]{r02, r12, r22, r32, r42, r52, r62, r72, r8, r9};
        HashMap hashMap = new HashMap(4);
        f1786b = hashMap;
        hashMap.put("armeabi-v7a", r62);
        hashMap.put("armeabi", r52);
        hashMap.put("arm64-v8a", r9);
        hashMap.put("x86", r02);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f1787c.clone();
    }
}
