package p1;

import a6.e;
import g2.g;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final e f5064a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f5065b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashSet f5066c = new LinkedHashSet();

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f5067d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                g.k(autoCloseable);
            } catch (Exception e9) {
                throw new RuntimeException(e9);
            }
        }
    }
}
