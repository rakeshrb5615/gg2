package i2;

import android.content.Context;
import android.content.SharedPreferences;
import j5.t1;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.UnrecoverableKeyException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class o0 {
    public static String B;
    public static String C;
    public static String D;
    public static String E;
    public static String F;
    public static String G;
    public static String H;
    public static String I;
    public static String J;
    public static String K;
    public static String L;
    public static String M;
    public static String N;

    /* renamed from: t  reason: collision with root package name */
    public static o0 f2445t;

    /* renamed from: u  reason: collision with root package name */
    public static String f2446u;

    /* renamed from: v  reason: collision with root package name */
    public static String f2447v;

    /* renamed from: w  reason: collision with root package name */
    public static String f2448w;

    /* renamed from: x  reason: collision with root package name */
    public static String f2449x;

    /* renamed from: y  reason: collision with root package name */
    public static String f2450y;

    /* renamed from: a  reason: collision with root package name */
    public final String f2452a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2453b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2454c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2455d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2456e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2457f;

    /* renamed from: g  reason: collision with root package name */
    public final String f2458g;

    /* renamed from: h  reason: collision with root package name */
    public final String f2459h;
    public final String i;
    public final String j;

    /* renamed from: k  reason: collision with root package name */
    public final String f2460k;

    /* renamed from: l  reason: collision with root package name */
    public final String f2461l;

    /* renamed from: m  reason: collision with root package name */
    public final String f2462m;

    /* renamed from: n  reason: collision with root package name */
    public final String f2463n;

    /* renamed from: o  reason: collision with root package name */
    public final String f2464o;

    /* renamed from: p  reason: collision with root package name */
    public final String f2465p;
    public final String q;

    /* renamed from: r  reason: collision with root package name */
    public final SharedPreferences f2466r;

    /* renamed from: s  reason: collision with root package name */
    public final SharedPreferences.Editor f2467s;

    /* renamed from: z  reason: collision with root package name */
    public static final String f2451z = q4.b.l("CqrqbUwCORuQDGr1lsyYVg==");
    public static final String A = q4.b.l("/6alv3nBW6W2pZA2TQyc2w==");

    public o0(Context context) {
        context.getApplicationContext();
        String[] strArr = p0.f2471b;
        this.f2452a = strArr[1];
        this.f2456e = strArr[9];
        this.f2457f = strArr[2];
        this.f2454c = strArr[3];
        this.f2453b = strArr[4];
        this.f2455d = strArr[5];
        this.f2458g = strArr[6];
        this.f2459h = strArr[7];
        this.f2462m = strArr[8];
        this.f2463n = strArr[13];
        this.f2460k = strArr[14];
        this.f2461l = strArr[10];
        this.f2465p = strArr[12];
        this.f2464o = strArr[11];
        this.i = strArr[15];
        this.j = strArr[16];
        f2446u = q4.b.l("l86ZE/I0dN9y+JeaU1MSdg==");
        f2448w = q4.b.l("IOf/RvD2VhtBdlvpNwBtug==");
        f2447v = q4.b.l("F7NzFi6+XgyIOHA7OEyMcQ==");
        f2449x = q4.b.l("DILGpo2Ndc+wEqKSXS6zSQ==");
        f2450y = q4.b.l("TFgybHM6y14LAQhtEYwGdQ==");
        C = q4.b.l("MmuH1dH+6I0q1S/MGBIspA==");
        D = q4.b.l("cc5dMs5Ad/qA2xwkuOuHsg==");
        E = q4.b.l("/Z65e80DbOUw+nBuMJNRBA==");
        B = q4.b.l("Ns7VlFcRrYADwlGpyPY5/w==");
        F = q4.b.l("Us93BuUfXJhPv/OCHkA1Sg==");
        G = q4.b.l("lYgmyIXj0dx8M60k39mYUA==");
        H = q4.b.l("qjyNrUof2/cuocPmzyqX5Q==");
        I = q4.b.l("5mDerQy43uvCMWmouJcpkQ==");
        J = q4.b.l("3FG6+dRgoxtR+05fd4I5rA==");
        K = q4.b.l("sSnHh3mpaPFHdBPH4oSL8A==");
        L = q4.b.l("9NZb3/8XzTYX1m0d2JG9Hg==");
        M = q4.b.l("2h38ClSNRu8fxkrluG/FYw==");
        N = q4.b.l("DBHIc0CBco+qcQcFzHnH0g==");
        this.q = context.getString(2131952437);
        SharedPreferences z9 = t1.z(context);
        this.f2466r = z9;
        this.f2467s = z9.edit();
    }

    public static void a(Context context) {
        try {
            File file = new File(context.getFilesDir().getParent() + "/shared_prefs/pksp.xml");
            if (file.exists()) {
                file.delete();
            }
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            keyStore.deleteEntry("pmk");
            context.getSharedPreferences("psp", 0).edit().clear().apply();
        } catch (Exception unused) {
        }
    }

    public static synchronized o0 c(Context context) {
        synchronized (o0.class) {
            if (f2445t == null) {
                try {
                    try {
                        try {
                            f2445t = new o0(context.getApplicationContext());
                        } catch (Exception unused) {
                            try {
                                f2445t = new o0(context.getApplicationContext());
                            } catch (Exception unused2) {
                                a(context.getApplicationContext());
                                try {
                                    f2445t = new o0(context.getApplicationContext());
                                } catch (Exception e9) {
                                    throw new RuntimeException("Failed to recover instance after full reset.", e9);
                                }
                            }
                            return f2445t;
                        }
                    } catch (GeneralSecurityException e10) {
                        throw new RuntimeException("Security error initializing.", e10);
                    }
                } catch (IOException | InvalidKeyException | KeyStoreException | UnrecoverableKeyException unused3) {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    keyStore.deleteEntry("pmk");
                    f2445t = new o0(context.getApplicationContext());
                    return f2445t;
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
        }
        return f2445t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    public final int b() {
        SharedPreferences sharedPreferences = this.f2466r;
        boolean[] zArr = {sharedPreferences.getBoolean(A, false), sharedPreferences.getBoolean(B, false), sharedPreferences.getBoolean(F, false), sharedPreferences.getBoolean(L, false), sharedPreferences.getBoolean(C, false), sharedPreferences.getBoolean(f2446u, false), sharedPreferences.getBoolean(f2448w, false), sharedPreferences.getBoolean(f2447v, false), sharedPreferences.getBoolean(f2449x, false), sharedPreferences.getBoolean(f2450y, false), sharedPreferences.getBoolean(D, false), sharedPreferences.getBoolean(E, false), sharedPreferences.getBoolean(f2451z, false)};
        boolean z9 = zArr[0];
        boolean z10 = z9;
        if (zArr[1]) {
            z10 = (z9 ? 1 : 0) | true;
        }
        boolean z11 = z10;
        if (zArr[2]) {
            z11 = (z10 ? 1 : 0) | true;
        }
        boolean z12 = z11;
        if (zArr[3]) {
            z12 = (z11 ? 1 : 0) | true;
        }
        boolean z13 = z12;
        if (zArr[4]) {
            z13 = (z12 ? 1 : 0) | true;
        }
        boolean z14 = z13;
        if (zArr[5]) {
            z14 = (z13 ? 1 : 0) | true;
        }
        boolean z15 = z14;
        if (zArr[6]) {
            z15 = (z14 ? 1 : 0) | true;
        }
        boolean z16 = z15;
        if (zArr[7]) {
            z16 = (z15 ? 1 : 0) | true;
        }
        boolean z17 = z16;
        if (zArr[8]) {
            z17 = (z16 ? 1 : 0) | true;
        }
        boolean z18 = z17;
        if (zArr[9]) {
            z18 = (z17 ? 1 : 0) | true;
        }
        boolean z19 = z18;
        if (zArr[10]) {
            z19 = (z18 ? 1 : 0) | true;
        }
        ?? r02 = z19;
        if (zArr[11]) {
            r02 = (z19 ? 1 : 0) | true;
        }
        return zArr[12] ? r02 | 4096 : r02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    public final int d() {
        String str = G;
        SharedPreferences sharedPreferences = this.f2466r;
        boolean[] zArr = {sharedPreferences.getBoolean(str, false), sharedPreferences.getBoolean(H, false), sharedPreferences.getBoolean(I, false), sharedPreferences.getBoolean(J, false), sharedPreferences.getBoolean(K, false), sharedPreferences.getBoolean(L, false)};
        boolean z9 = zArr[0];
        boolean z10 = z9;
        if (zArr[1]) {
            z10 = (z9 ? 1 : 0) | true;
        }
        boolean z11 = z10;
        if (zArr[2]) {
            z11 = (z10 ? 1 : 0) | true;
        }
        ?? r12 = z11;
        if (zArr[3]) {
            r12 = (z11 ? 1 : 0) | true;
        }
        return zArr[4] ? r12 | 16 : r12;
    }

    public final String e(String str) {
        if (str.equals(this.f2456e)) {
            return f2446u;
        }
        if (str.equals(this.f2461l)) {
            return f2448w;
        }
        if (str.equals(this.f2464o)) {
            return f2447v;
        }
        if (str.equals(this.f2465p)) {
            return f2449x;
        }
        if (str.equals(this.i)) {
            return f2450y;
        }
        if (str.equals(this.j)) {
            return f2451z;
        }
        if (str.equals(this.f2457f)) {
            return A;
        }
        if (str.equals(this.f2458g)) {
            return B;
        }
        if (str.equals(this.f2459h)) {
            return F;
        }
        if (str.equals(this.f2462m)) {
            return C;
        }
        if (str.equals(this.f2463n)) {
            return D;
        }
        if (str.equals(this.f2460k)) {
            return E;
        }
        throw new IllegalArgumentException(v1.a.n(new StringBuilder(), this.q, str));
    }

    public final String f(String str) {
        if (str.equals(this.f2452a)) {
            return G;
        }
        if (str.equals(this.f2453b)) {
            return H;
        }
        if (str.equals(this.f2454c)) {
            return I;
        }
        if (str.equals(this.f2455d)) {
            return J;
        }
        throw new IllegalArgumentException(v1.a.n(new StringBuilder(), this.q, str));
    }

    public final void g(String str, boolean z9) {
        SharedPreferences.Editor editor = this.f2467s;
        editor.putBoolean(str, z9);
        editor.apply();
    }
}
