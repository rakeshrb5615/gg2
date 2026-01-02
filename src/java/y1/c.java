package y1;

import android.content.pm.PackageInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a6.e f6740a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f6741b = {112, 114, 111, 0};

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f6742c = {112, 114, 109, 0};

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f6743d = {48, 49, 53, 0};

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f6744e = {48, 49, 48, 0};

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f6745f = {48, 48, 57, 0};

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f6746g = {48, 48, 53, 0};

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f6747h = {48, 48, 49, 0};
    public static final byte[] i = {48, 48, 49, 0};
    public static final byte[] j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(a[] aVarArr, byte[] bArr) {
        int i9 = 0;
        int i10 = 0;
        for (a aVar : aVarArr) {
            i10 += ((((aVar.f6738g * 2) + 7) & (-8)) / 8) + (aVar.f6736e * 2) + d(bArr, aVar.f6732a, aVar.f6733b).getBytes(StandardCharsets.UTF_8).length + 16 + aVar.f6737f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i10);
        if (Arrays.equals(bArr, f6745f)) {
            int length = aVarArr.length;
            while (i9 < length) {
                a aVar2 = aVarArr[i9];
                q(byteArrayOutputStream, aVar2, d(bArr, aVar2.f6732a, aVar2.f6733b));
                p(byteArrayOutputStream, aVar2);
                i9++;
            }
        } else {
            for (a aVar3 : aVarArr) {
                q(byteArrayOutputStream, aVar3, d(bArr, aVar3.f6732a, aVar3.f6733b));
            }
            int length2 = aVarArr.length;
            while (i9 < length2) {
                p(byteArrayOutputStream, aVarArr[i9]);
                i9++;
            }
        }
        if (byteArrayOutputStream.size() == i10) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i10);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z9 = true;
        for (File file2 : listFiles) {
            z9 = c(file2) && z9;
        }
        return z9;
    }

    public static String d(byte[] bArr, String str, String str2) {
        byte[] bArr2 = f6747h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f6746g;
        String str3 = "!";
        String str4 = (equals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str4)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str4)) {
                return str2.replace("!", ":");
            }
        } else if (str2.equals("classes.dex")) {
            return str;
        } else {
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str4)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str4)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return v1.a.n(u.e.b(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : ":", str2);
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i9) {
        byte[] bArr = new byte[i9];
        int i10 = 0;
        while (i10 < i9) {
            int read = inputStream.read(bArr, i10, i9 - i10);
            if (read < 0) {
                throw new IllegalStateException(g2.g.c(i9, "Not enough bytes to read: "));
            }
            i10 += read;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i9) {
        int[] iArr = new int[i9];
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            i10 += (int) m(byteArrayInputStream, 2);
            iArr[i11] = i10;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        if (r0.finished() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] h(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.c.h(java.io.FileInputStream, int, int):byte[]");
    }

    public static a[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, a[] aVarArr) {
        byte[] bArr3 = i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (Arrays.equals(bArr, j)) {
                int m9 = (int) m(fileInputStream, 2);
                byte[] h9 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
                if (fileInputStream.read() <= 0) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h9);
                    try {
                        a[] k9 = k(byteArrayInputStream, bArr2, m9, aVarArr);
                        byteArrayInputStream.close();
                        return k9;
                    } catch (Throwable th) {
                        try {
                            byteArrayInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                throw new IllegalStateException("Content found after the end of file");
            }
            throw new IllegalStateException("Unsupported meta version");
        } else if (Arrays.equals(f6743d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else {
            if (Arrays.equals(bArr, bArr3)) {
                int m10 = (int) m(fileInputStream, 1);
                byte[] h10 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
                if (fileInputStream.read() <= 0) {
                    ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h10);
                    try {
                        a[] j8 = j(byteArrayInputStream2, m10, aVarArr);
                        byteArrayInputStream2.close();
                        return j8;
                    } catch (Throwable th3) {
                        try {
                            byteArrayInputStream2.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                throw new IllegalStateException("Content found after the end of file");
            }
            throw new IllegalStateException("Unsupported meta version");
        }
    }

    public static a[] j(ByteArrayInputStream byteArrayInputStream, int i9, a[] aVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i9 == aVarArr.length) {
            String[] strArr = new String[i9];
            int[] iArr = new int[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                iArr[i10] = (int) m(byteArrayInputStream, 2);
                strArr[i10] = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            }
            for (int i11 = 0; i11 < i9; i11++) {
                a aVar = aVarArr[i11];
                if (!aVar.f6733b.equals(strArr[i11])) {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
                int i12 = iArr[i11];
                aVar.f6736e = i12;
                aVar.f6739h = g(byteArrayInputStream, i12);
            }
            return aVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static a[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i9, a[] aVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i9 == aVarArr.length) {
            for (int i10 = 0; i10 < i9; i10++) {
                m(byteArrayInputStream, 2);
                String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long m9 = m(byteArrayInputStream, 4);
                int m10 = (int) m(byteArrayInputStream, 2);
                a aVar = null;
                if (aVarArr.length > 0) {
                    int indexOf = str.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str.indexOf(":");
                    }
                    String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= aVarArr.length) {
                            break;
                        } else if (aVarArr[i11].f6733b.equals(substring)) {
                            aVar = aVarArr[i11];
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                if (aVar == null) {
                    throw new IllegalStateException("Missing profile key: ".concat(str));
                }
                aVar.f6735d = m9;
                int[] g3 = g(byteArrayInputStream, m10);
                if (Arrays.equals(bArr, f6747h)) {
                    aVar.f6736e = m10;
                    aVar.f6739h = g3;
                }
            }
            return aVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static a[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, f6744e)) {
            int m9 = (int) m(fileInputStream, 1);
            byte[] h9 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h9);
                try {
                    a[] n9 = n(byteArrayInputStream, str, m9);
                    byteArrayInputStream.close();
                    return n9;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }

    public static long m(InputStream inputStream, int i9) {
        byte[] f9 = f(inputStream, i9);
        long j8 = 0;
        for (int i10 = 0; i10 < i9; i10++) {
            j8 += (f9[i10] & 255) << (i10 * 8);
        }
        return j8;
    }

    public static a[] n(ByteArrayInputStream byteArrayInputStream, String str, int i9) {
        int i10 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        a[] aVarArr = new a[i9];
        for (int i11 = 0; i11 < i9; i11++) {
            int m9 = (int) m(byteArrayInputStream, 2);
            aVarArr[i11] = new a(str, new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m9, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m9], new TreeMap());
        }
        int i12 = 0;
        while (i12 < i9) {
            a aVar = aVarArr[i12];
            int available = byteArrayInputStream.available();
            int i13 = aVar.f6737f;
            int i14 = aVar.f6738g;
            TreeMap treeMap = aVar.i;
            int i15 = available - i13;
            int i16 = i10;
            while (byteArrayInputStream.available() > i15) {
                i16 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i16), 1);
                int m10 = (int) m(byteArrayInputStream, 2);
                while (m10 > 0) {
                    m(byteArrayInputStream, 2);
                    int m11 = (int) m(byteArrayInputStream, 1);
                    if (m11 != 6 && m11 != 7) {
                        while (m11 > 0) {
                            m(byteArrayInputStream, 1);
                            int i17 = i10;
                            int i18 = i12;
                            for (int m12 = (int) m(byteArrayInputStream, 1); m12 > 0; m12--) {
                                m(byteArrayInputStream, 2);
                            }
                            m11--;
                            i10 = i17;
                            i12 = i18;
                        }
                    }
                    m10--;
                    i10 = i10;
                    i12 = i12;
                }
            }
            int i19 = i10;
            int i20 = i12;
            if (byteArrayInputStream.available() != i15) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            aVar.f6739h = g(byteArrayInputStream, aVar.f6736e);
            BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i14 * 2) + 7) & (-8)) / 8));
            for (int i21 = i19; i21 < i14; i21++) {
                int i22 = valueOf.get(i21) ? 2 : i19;
                if (valueOf.get(i21 + i14)) {
                    i22 |= 4;
                }
                if (i22 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i21));
                    if (num == null) {
                        num = Integer.valueOf(i19);
                    }
                    treeMap.put(Integer.valueOf(i21), Integer.valueOf(i22 | num.intValue()));
                }
            }
            i12 = i20 + 1;
            i10 = i19;
        }
        return aVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, a[] aVarArr) {
        long j8;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f6743d;
        int i9 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f6744e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b10 = b(aVarArr, bArr3);
                u(byteArrayOutputStream, aVarArr.length, 1);
                u(byteArrayOutputStream, b10.length, 4);
                byte[] a10 = a(b10);
                u(byteArrayOutputStream, a10.length, 4);
                byteArrayOutputStream.write(a10);
                return true;
            }
            byte[] bArr4 = f6746g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, aVarArr.length, 1);
                for (a aVar : aVarArr) {
                    String d9 = d(bArr4, aVar.f6732a, aVar.f6733b);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, d9.getBytes(charset).length);
                    v(byteArrayOutputStream, aVar.f6739h.length);
                    u(byteArrayOutputStream, aVar.i.size() * 4, 4);
                    u(byteArrayOutputStream, aVar.f6734c, 4);
                    byteArrayOutputStream.write(d9.getBytes(charset));
                    for (Integer num : aVar.i.keySet()) {
                        v(byteArrayOutputStream, num.intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i10 : aVar.f6739h) {
                        v(byteArrayOutputStream, i10);
                    }
                }
                return true;
            }
            byte[] bArr5 = f6745f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b11 = b(aVarArr, bArr5);
                u(byteArrayOutputStream, aVarArr.length, 1);
                u(byteArrayOutputStream, b11.length, 4);
                byte[] a11 = a(b11);
                u(byteArrayOutputStream, a11.length, 4);
                byteArrayOutputStream.write(a11);
                return true;
            }
            byte[] bArr6 = f6747h;
            if (Arrays.equals(bArr, bArr6)) {
                v(byteArrayOutputStream, aVarArr.length);
                for (a aVar2 : aVarArr) {
                    String str = aVar2.f6732a;
                    TreeMap treeMap = aVar2.i;
                    String d10 = d(bArr6, str, aVar2.f6733b);
                    Charset charset2 = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, d10.getBytes(charset2).length);
                    v(byteArrayOutputStream, treeMap.size());
                    v(byteArrayOutputStream, aVar2.f6739h.length);
                    u(byteArrayOutputStream, aVar2.f6734c, 4);
                    byteArrayOutputStream.write(d10.getBytes(charset2));
                    for (Integer num2 : treeMap.keySet()) {
                        v(byteArrayOutputStream, num2.intValue());
                    }
                    for (int i11 : aVar2.f6739h) {
                        v(byteArrayOutputStream, i11);
                    }
                }
                return true;
            }
            return false;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, aVarArr.length);
            int i12 = 2;
            int i13 = 2;
            for (a aVar3 : aVarArr) {
                u(byteArrayOutputStream2, aVar3.f6734c, 4);
                u(byteArrayOutputStream2, aVar3.f6735d, 4);
                u(byteArrayOutputStream2, aVar3.f6738g, 4);
                String d11 = d(bArr2, aVar3.f6732a, aVar3.f6733b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d11.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i13 = i13 + 14 + length2;
                byteArrayOutputStream2.write(d11.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i13 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray.length);
            }
            h hVar = new h(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(hVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i14 = 0;
            int i15 = 0;
            while (i14 < aVarArr.length) {
                try {
                    a aVar4 = aVarArr[i14];
                    v(byteArrayOutputStream3, i14);
                    v(byteArrayOutputStream3, aVar4.f6736e);
                    i15 = i15 + 4 + (aVar4.f6736e * i12);
                    int[] iArr = aVar4.f6739h;
                    int length3 = iArr.length;
                    int i16 = i9;
                    int i17 = i12;
                    int i18 = i16;
                    while (i18 < length3) {
                        int i19 = iArr[i18];
                        v(byteArrayOutputStream3, i19 - i16);
                        i18++;
                        i16 = i19;
                    }
                    i14++;
                    i12 = i17;
                    i9 = 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i15 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i15 + ", does not match actual size " + byteArray2.length);
            }
            h hVar2 = new h(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(hVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i20 = 0;
            int i21 = 0;
            while (i20 < aVarArr.length) {
                try {
                    a aVar5 = aVarArr[i20];
                    int i22 = 0;
                    for (Map.Entry entry : aVar5.i.entrySet()) {
                        i22 |= ((Integer) entry.getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    r(byteArrayOutputStream4, i22, aVar5);
                    byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                    byteArrayOutputStream4.close();
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    s(byteArrayOutputStream5, aVar5);
                    byte[] byteArray4 = byteArrayOutputStream5.toByteArray();
                    byteArrayOutputStream5.close();
                    v(byteArrayOutputStream3, i20);
                    int length4 = byteArray3.length + 2 + byteArray4.length;
                    int i23 = i21 + 6;
                    ArrayList arrayList4 = arrayList3;
                    u(byteArrayOutputStream3, length4, 4);
                    v(byteArrayOutputStream3, i22);
                    byteArrayOutputStream3.write(byteArray3);
                    byteArrayOutputStream3.write(byteArray4);
                    i21 = i23 + length4;
                    i20++;
                    arrayList3 = arrayList4;
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i21 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i21 + ", does not match actual size " + byteArray5.length);
            }
            h hVar3 = new h(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(hVar3);
            long j9 = 4;
            long size = j9 + j9 + 4 + (arrayList2.size() * 16);
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i24 = 0;
            while (i24 < arrayList2.size()) {
                h hVar4 = (h) arrayList2.get(i24);
                int i25 = hVar4.f6755a;
                byte[] bArr7 = hVar4.f6756b;
                if (i25 == 1) {
                    j8 = 0;
                } else if (i25 == 2) {
                    j8 = 1;
                } else if (i25 == 3) {
                    j8 = 2;
                } else if (i25 == 4) {
                    j8 = 3;
                } else if (i25 != 5) {
                    throw null;
                } else {
                    j8 = 4;
                }
                u(byteArrayOutputStream, j8, 4);
                u(byteArrayOutputStream, size, 4);
                if (hVar4.f6757c) {
                    byte[] a12 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a12);
                    u(byteArrayOutputStream, a12.length, 4);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    length = a12.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size += length;
                i24++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i26 = 0; i26 < arrayList6.size(); i26++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i26));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, a aVar) {
        s(byteArrayOutputStream, aVar);
        int i9 = aVar.f6738g;
        int[] iArr = aVar.f6739h;
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            v(byteArrayOutputStream, i12 - i11);
            i10++;
            i11 = i12;
        }
        byte[] bArr = new byte[(((i9 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : aVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i13 = intValue / 8;
                bArr[i13] = (byte) (bArr[i13] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i14 = intValue + i9;
                int i15 = i14 / 8;
                bArr[i15] = (byte) ((1 << (i14 % 8)) | bArr[i15]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, a aVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, aVar.f6736e);
        u(byteArrayOutputStream, aVar.f6737f, 4);
        u(byteArrayOutputStream, aVar.f6734c, 4);
        u(byteArrayOutputStream, aVar.f6738g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i9, a aVar) {
        int i10 = aVar.f6738g;
        byte[] bArr = new byte[(((Integer.bitCount(i9 & (-2)) * i10) + 7) & (-8)) / 8];
        for (Map.Entry entry : aVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i11 = 0;
            for (int i12 = 1; i12 <= 4; i12 <<= 1) {
                if (i12 != 1 && (i12 & i9) != 0) {
                    if ((i12 & intValue2) == i12) {
                        int i13 = (i11 * i10) + intValue;
                        int i14 = i13 / 8;
                        bArr[i14] = (byte) ((1 << (i13 % 8)) | bArr[i14]);
                    }
                    i11++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, a aVar) {
        int i9 = 0;
        for (Map.Entry entry : aVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, intValue - i9);
                v(byteArrayOutputStream, 0);
                i9 = intValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0162 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x01c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0154  */
    /* JADX WARN: Type inference failed for: r0v57, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void t(android.content.Context r18, java.util.concurrent.Executor r19, y1.b r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.c.t(android.content.Context, java.util.concurrent.Executor, y1.b, boolean):void");
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j8, int i9) {
        byte[] bArr = new byte[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            bArr[i10] = (byte) ((j8 >> (i10 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i9) {
        u(byteArrayOutputStream, i9, 2);
    }
}
