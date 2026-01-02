package g2;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract /* synthetic */ class g {
    public static /* synthetic */ int a(int i) {
        int i9 = 1;
        if (i != 1) {
            i9 = 2;
            if (i != 2) {
                i9 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i9;
    }

    public static float b(float f9, float f10, float f11, float f12) {
        return ((f9 - f10) * f11) + f12;
    }

    public static String c(int i, String str) {
        return str + i;
    }

    public static String d(String str, String str2) {
        return str + str2;
    }

    public static String e(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String f(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String g(String str, StringBuilder sb) {
        return str + ((Object) sb);
    }

    public static HashMap h(Class cls, w5.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static Map i(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static /* synthetic */ void j(int i, String str) {
        if (i == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = kotlin.jvm.internal.j.class.getName();
            int i9 = 0;
            while (!stackTrace[i9].getClassName().equals(name)) {
                i9++;
            }
            while (stackTrace[i9].getClassName().equals(name)) {
                i9++;
            }
            StackTraceElement stackTraceElement = stackTrace[i9];
            StringBuilder r8 = v1.a.r("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            r8.append(str);
            NullPointerException nullPointerException = new NullPointerException(r8.toString());
            kotlin.jvm.internal.j.h(nullPointerException, kotlin.jvm.internal.j.class.getName());
            throw nullPointerException;
        }
    }

    public static /* synthetic */ void k(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
        } else if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else if (!(autoCloseable instanceof MediaDrm)) {
                throw new IllegalArgumentException();
            } else {
                ((MediaDrm) autoCloseable).release();
            }
        } else {
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z9 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z9) {
                        executorService.shutdownNow();
                        z9 = true;
                    }
                }
            }
            if (z9) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static String l(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ String m(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                return "TOP";
            case 4:
                return "RIGHT";
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                return "BOTTOM";
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                return "BASELINE";
            case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                return "CENTER";
            case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }
}
