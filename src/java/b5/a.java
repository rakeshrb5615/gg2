package b5;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class a implements ThreadFactory {

    /* renamed from: e  reason: collision with root package name */
    public static final ThreadFactory f717e = Executors.defaultThreadFactory();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicLong f718a = new AtomicLong();

    /* renamed from: b  reason: collision with root package name */
    public final String f719b;

    /* renamed from: c  reason: collision with root package name */
    public final int f720c;

    /* renamed from: d  reason: collision with root package name */
    public final StrictMode.ThreadPolicy f721d;

    public a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.f719b = str;
        this.f720c = i;
        this.f721d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f717e.newThread(new a5.i(2, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f718a.getAndIncrement();
        newThread.setName(this.f719b + " Thread #" + andIncrement);
        return newThread;
    }
}
