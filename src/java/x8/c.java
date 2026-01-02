package x8;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class c extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        d l5;
        while (true) {
            try {
                h.f fVar = d.f6626h;
                reentrantLock = d.j;
                reentrantLock.lock();
                l5 = c5.c.l();
            } catch (InterruptedException unused) {
            }
            if (l5 == d.i) {
                d.i = null;
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            if (l5 != null) {
                l5.k();
            }
        }
    }
}
