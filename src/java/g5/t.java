package g5;

import android.content.Context;
import j5.s0;
import j5.t0;
import j5.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class t {

    /* renamed from: f  reason: collision with root package name */
    public static final HashMap f1844f;

    /* renamed from: g  reason: collision with root package name */
    public static final String f1845g;

    /* renamed from: a  reason: collision with root package name */
    public final Context f1846a;

    /* renamed from: b  reason: collision with root package name */
    public final y f1847b;

    /* renamed from: c  reason: collision with root package name */
    public final a f1848c;

    /* renamed from: d  reason: collision with root package name */
    public final n0.a f1849d;

    /* renamed from: e  reason: collision with root package name */
    public final o5.d f1850e;

    static {
        HashMap hashMap = new HashMap();
        f1844f = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        f1845g = "Crashlytics Android SDK/20.0.3";
    }

    public t(Context context, y yVar, a aVar, n0.a aVar2, o5.d dVar) {
        this.f1846a = context;
        this.f1847b = yVar;
        this.f1848c = aVar;
        this.f1849d = aVar2;
        this.f1850e = dVar;
    }

    public static t0 c(j6.s sVar, int i) {
        String str = (String) sVar.f3283c;
        String str2 = (String) sVar.f3282b;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) sVar.f3284d;
        int i9 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        j6.s sVar2 = (j6.s) sVar.f3285e;
        if (i >= 8) {
            j6.s sVar3 = sVar2;
            while (sVar3 != null) {
                sVar3 = (j6.s) sVar3.f3285e;
                i9++;
            }
        }
        int i10 = i9;
        List d9 = d(stackTraceElementArr, 4);
        if (d9 != null) {
            byte b10 = (byte) (0 | 1);
            t0 t0Var = null;
            if (sVar2 != null && i10 == 0) {
                t0Var = c(sVar2, i + 1);
            }
            if (b10 == 1) {
                return new t0(str, str2, d9, t0Var, i10);
            }
            StringBuilder sb = new StringBuilder();
            if ((b10 & 1) == 0) {
                sb.append(" overflowCount");
            }
            throw new IllegalStateException(g2.g.g("Missing required properties:", sb));
        }
        throw new NullPointerException("Null frames");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [j5.w0, java.lang.Object] */
    public static List d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            ?? obj = new Object();
            obj.f3183e = i;
            obj.f3184f = (byte) (obj.f3184f | 4);
            long j = 0;
            long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j = stackTraceElement.getLineNumber();
            }
            obj.f3179a = max;
            byte b10 = (byte) (obj.f3184f | 1);
            obj.f3184f = b10;
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            obj.f3180b = str;
            obj.f3181c = fileName;
            obj.f3182d = j;
            obj.f3184f = (byte) (b10 | 2);
            arrayList.add(obj.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static u0 e() {
        byte b10 = (byte) 1;
        if (b10 == 1) {
            return new u0("0", "0", 0L);
        }
        StringBuilder sb = new StringBuilder();
        if (b10 == 0) {
            sb.append(" address");
        }
        throw new IllegalStateException(g2.g.g("Missing required properties:", sb));
    }

    public final List a() {
        byte b10 = (byte) (((byte) (0 | 1)) | 2);
        a aVar = this.f1848c;
        String str = aVar.f1769e;
        if (str != null) {
            String str2 = aVar.f1766b;
            if (b10 == 3) {
                return Collections.singletonList(new s0(0L, 0L, str, str2));
            }
            StringBuilder sb = new StringBuilder();
            if ((b10 & 1) == 0) {
                sb.append(" baseAddress");
            }
            if ((b10 & 2) == 0) {
                sb.append(" size");
            }
            throw new IllegalStateException(g2.g.g("Missing required properties:", sb));
        }
        throw new NullPointerException("Null name");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, j5.a1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j5.b1 b(int r17) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.t.b(int):j5.b1");
    }
}
