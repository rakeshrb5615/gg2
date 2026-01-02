package b5;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class m implements Executor {

    /* renamed from: f  reason: collision with root package name */
    public static final Logger f753f = Logger.getLogger(m.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final Executor f754a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque f755b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public int f756c = 1;

    /* renamed from: d  reason: collision with root package name */
    public long f757d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final l f758e = new l(this);

    public m(Executor executor) {
        this.f754a = (Executor) Preconditions.checkNotNull(executor);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        synchronized (this.f755b) {
            int i = this.f756c;
            if (i != 4 && i != 3) {
                long j = this.f757d;
                k kVar = new k(runnable, 0);
                this.f755b.add(kVar);
                this.f756c = 2;
                try {
                    this.f754a.execute(this.f758e);
                    if (this.f756c != 2) {
                        return;
                    }
                    synchronized (this.f755b) {
                        try {
                            if (this.f757d == j && this.f756c == 2) {
                                this.f756c = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e9) {
                    synchronized (this.f755b) {
                        try {
                            int i9 = this.f756c;
                            boolean z9 = true;
                            if ((i9 != 1 && i9 != 2) || !this.f755b.removeLastOccurrence(kVar)) {
                                z9 = false;
                            }
                            if (!(e9 instanceof RejectedExecutionException) || z9) {
                                throw e9;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f755b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f754a + "}";
    }
}
