package q2;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseArray f5247a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ h0[] f5248b;
    /* JADX INFO: Fake field, exist only in values array */
    h0 EF1;

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Enum, q2.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Enum, q2.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Enum, q2.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Enum, q2.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Enum, q2.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Enum, q2.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Enum, q2.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Enum, q2.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, q2.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Enum, q2.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Enum, q2.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Enum, q2.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, q2.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, q2.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, q2.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, q2.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, q2.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, q2.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, q2.h0, java.lang.Object] */
    static {
        ?? r12 = new Enum("MOBILE", 0);
        ?? r22 = new Enum("WIFI", 1);
        ?? r32 = new Enum("MOBILE_MMS", 2);
        ?? r42 = new Enum("MOBILE_SUPL", 3);
        ?? r52 = new Enum("MOBILE_DUN", 4);
        ?? r62 = new Enum("MOBILE_HIPRI", 5);
        ?? r72 = new Enum("WIMAX", 6);
        ?? r8 = new Enum("BLUETOOTH", 7);
        ?? r9 = new Enum("DUMMY", 8);
        ?? r10 = new Enum("ETHERNET", 9);
        ?? r11 = new Enum("MOBILE_FOTA", 10);
        ?? r122 = new Enum("MOBILE_IMS", 11);
        ?? r13 = new Enum("MOBILE_CBS", 12);
        ?? r14 = new Enum("WIFI_P2P", 13);
        ?? r15 = new Enum("MOBILE_IA", 14);
        ?? r02 = new Enum("MOBILE_EMERGENCY", 15);
        ?? r16 = new Enum("PROXY", 16);
        ?? r23 = new Enum("VPN", 17);
        ?? r03 = new Enum("NONE", 18);
        f5248b = new h0[]{r12, r22, r32, r42, r52, r62, r72, r8, r9, r10, r11, r122, r13, r14, r15, r02, r16, r23, r03};
        SparseArray sparseArray = new SparseArray();
        f5247a = sparseArray;
        sparseArray.put(0, r12);
        sparseArray.put(1, r22);
        sparseArray.put(2, r32);
        sparseArray.put(3, r42);
        sparseArray.put(4, r52);
        sparseArray.put(5, r62);
        sparseArray.put(6, r72);
        sparseArray.put(7, r8);
        sparseArray.put(8, r9);
        sparseArray.put(9, r10);
        sparseArray.put(10, r11);
        sparseArray.put(11, r122);
        sparseArray.put(12, r13);
        sparseArray.put(13, r14);
        sparseArray.put(14, r15);
        sparseArray.put(15, r02);
        sparseArray.put(16, r16);
        sparseArray.put(17, r23);
        sparseArray.put(-1, r03);
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) f5248b.clone();
    }
}
