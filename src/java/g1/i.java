package g1;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class i {
    public static final Object j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public static volatile i f1647k;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantReadWriteLock f1648a;

    /* renamed from: b  reason: collision with root package name */
    public final r.f f1649b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f1650c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f1651d;

    /* renamed from: e  reason: collision with root package name */
    public final c5.b f1652e;

    /* renamed from: f  reason: collision with root package name */
    public final h f1653f;

    /* renamed from: g  reason: collision with root package name */
    public final a6.e f1654g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1655h;
    public final d i;

    /* JADX WARN: Type inference failed for: r6v5, types: [a6.e, java.lang.Object] */
    public i(q qVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1648a = reentrantReadWriteLock;
        this.f1650c = 3;
        h hVar = (h) qVar.f304b;
        this.f1653f = hVar;
        int i = qVar.f303a;
        this.f1655h = i;
        this.i = (d) qVar.f305c;
        this.f1651d = new Handler(Looper.getMainLooper());
        this.f1649b = new r.f(0);
        this.f1654g = new Object();
        c5.b bVar = new c5.b(this);
        this.f1652e = bVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f1650c = 0;
            } catch (Throwable th) {
                this.f1648a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                hVar.a(new e(bVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static i a() {
        i iVar;
        synchronized (j) {
            try {
                iVar = f1647k;
                if (!(iVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return iVar;
    }

    public final int b() {
        this.f1648a.readLock().lock();
        try {
            return this.f1650c;
        } finally {
            this.f1648a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f1655h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f1648a.writeLock().lock();
        try {
            if (this.f1650c == 0) {
                return;
            }
            this.f1650c = 0;
            this.f1648a.writeLock().unlock();
            c5.b bVar = this.f1652e;
            i iVar = (i) bVar.f929a;
            try {
                iVar.f1653f.a(new e(bVar));
            } catch (Throwable th) {
                iVar.d(th);
            }
        } finally {
            this.f1648a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1648a.writeLock().lock();
        try {
            this.f1650c = 2;
            arrayList.addAll(this.f1649b);
            this.f1649b.clear();
            this.f1648a.writeLock().unlock();
            this.f1651d.post(new com.google.android.material.datepicker.g(arrayList, this.f1650c, th));
        } catch (Throwable th2) {
            this.f1648a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:32:0x005d, B:35:0x0062, B:37:0x0066, B:39:0x0073, B:46:0x0092, B:48:0x009c, B:50:0x009f, B:52:0x00a2, B:54:0x00b2, B:55:0x00b5), top: B:94:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0108  */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, g1.x] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence e(java.lang.CharSequence r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.i.e(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final void f(g gVar) {
        p0.e.d(gVar, "initCallback cannot be null");
        this.f1648a.writeLock().lock();
        try {
            if (this.f1650c != 1 && this.f1650c != 2) {
                this.f1649b.add(gVar);
                this.f1648a.writeLock().unlock();
            }
            this.f1651d.post(new com.google.android.material.datepicker.g(Arrays.asList(gVar), this.f1650c, (Throwable) null));
            this.f1648a.writeLock().unlock();
        } catch (Throwable th) {
            this.f1648a.writeLock().unlock();
            throw th;
        }
    }
}
