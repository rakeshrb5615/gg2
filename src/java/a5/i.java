package a5;

import android.app.job.JobParameters;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.opengl.EGL14;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.TaskCompletionSource;
import i2.n0;
import i2.t0;
import i2.v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f582a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f583b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f584c;

    public /* synthetic */ i(int i, Object obj, Object obj2) {
        this.f582a = i;
        this.f584c = obj;
        this.f583b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c6.a aVar;
        switch (this.f582a) {
            case 0:
                v vVar = (v) this.f584c;
                c6.b bVar = (c6.b) this.f583b;
                if (vVar.f616b != v.f614d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (vVar) {
                    aVar = vVar.f615a;
                    vVar.f615a = null;
                    vVar.f616b = bVar;
                }
                aVar.a(bVar);
                return;
            case 1:
                s sVar = (s) this.f584c;
                c6.b bVar2 = (c6.b) this.f583b;
                synchronized (sVar) {
                    try {
                        if (sVar.f608b == null) {
                            sVar.f607a.add(bVar2);
                        } else {
                            sVar.f608b.add(bVar2.get());
                        }
                    } finally {
                    }
                }
                return;
            case 2:
                b5.a aVar2 = (b5.a) this.f584c;
                Runnable runnable = (Runnable) this.f583b;
                Process.setThreadPriority(aVar2.f720c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.f721d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                Callable callable = (Callable) this.f584c;
                b5.i iVar = (b5.i) ((l6.c) this.f583b).f3791b;
                try {
                    iVar.j(callable.call());
                    return;
                } catch (Exception e9) {
                    iVar.k(e9);
                    return;
                }
            case 4:
                c.n nVar = (c.n) this.f584c;
                nVar.getLifecycle().a(new c.d(0, (c.v) this.f583b, nVar));
                return;
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                ((g0.b) this.f584c).i((Typeface) this.f583b);
                return;
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                ((g5.n) this.f584c).c((String) this.f583b, Boolean.FALSE);
                return;
            case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                h.n nVar2 = (h.n) this.f584c;
                Runnable runnable2 = (Runnable) this.f583b;
                nVar2.getClass();
                try {
                    runnable2.run();
                    return;
                } finally {
                    nVar2.a();
                }
            case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                i2.h hVar = (i2.h) this.f584c;
                View view = (View) this.f583b;
                if (hVar.getArguments() != null) {
                    int i = hVar.getArguments().getInt("arg_background_color", -1);
                    Drawable background = view.getBackground();
                    if (background instanceof v3.k) {
                        ((v3.k) background).o(ColorStateList.valueOf(i));
                        return;
                    } else {
                        view.setBackgroundColor(i);
                        return;
                    }
                }
                return;
            case 9:
                n0 n0Var = (n0) this.f584c;
                v0 v0Var = (v0) this.f583b;
                try {
                    try {
                        n0Var.d();
                        n2.f fVar = v0Var.f2533b;
                        n0Var.f2420c = fVar;
                        if (fVar != null) {
                            fVar.onSurfaceCreated(null, null);
                            SurfaceHolder surfaceHolder = n0Var.getSurfaceHolder();
                            if (surfaceHolder != null) {
                                n0Var.f2420c.onSurfaceChanged(null, surfaceHolder.getSurfaceFrame().width(), surfaceHolder.getSurfaceFrame().height());
                                EGL14.eglSwapInterval(n0Var.V, 1);
                                v0Var.I1 = true;
                                v0Var.K1 = true;
                                while (n0Var.Z && !Thread.currentThread().isInterrupted()) {
                                    try {
                                        if (v0Var.J1) {
                                            n0Var.N = true;
                                        }
                                    } catch (InterruptedException unused) {
                                        n0Var.Z = false;
                                    } catch (Exception e10) {
                                        Log.e("GLWallpaper", "Renderer crashed loop. Stopping thread.", e10);
                                        n0Var.Z = false;
                                    }
                                    while (true) {
                                        Runnable runnable3 = (Runnable) n0Var.Q.poll();
                                        if (runnable3 != null) {
                                            try {
                                                runnable3.run();
                                            } catch (Throwable unused2) {
                                            }
                                        } else {
                                            long nanoTime = System.nanoTime();
                                            if (n0Var.f2417a0 && nanoTime >= n0Var.f2421c0 + 100000000) {
                                                long j = n0Var.f2419b0;
                                                if (nanoTime - j < 10000000000L) {
                                                    long nanoTime2 = ((j + 10000000000L) - System.nanoTime()) / 1000000;
                                                    if (nanoTime2 > 0) {
                                                        Thread.sleep(Math.min(nanoTime2, 30L));
                                                    }
                                                }
                                            }
                                            n0Var.f2419b0 = nanoTime;
                                            n0Var.f2420c.onDrawFrame(null);
                                            EGL14.eglSwapBuffers(n0Var.V, n0Var.X);
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Exception e11) {
                        Log.e("GLWallpaper", "Engine initialization failed.", e11);
                    }
                    return;
                } finally {
                    n0Var.c();
                    n0Var.Z = false;
                }
            case 10:
                t0 t0Var = (t0) this.f584c;
                RecyclerView recyclerView = t0Var.i;
                t0Var.f2522g = new ArrayList((List) this.f583b);
                if (t0Var.f2521f.size() != t0Var.f2522g.size()) {
                    t0Var.f2521f = new ArrayList(Collections.nCopies(t0Var.f2522g.size(), Float.valueOf(1.0f)));
                }
                t0Var.f350a.b();
                recyclerView.setAlpha(0.0f);
                recyclerView.animate().alpha(1.0f).setDuration(200).start();
                return;
            case 11:
                m5.c cVar = (m5.c) this.f584c;
                ((i5.g) cVar.f4020c).i((String) cVar.f4019b, (List) this.f583b);
                return;
            case 12:
                j6.n nVar3 = (j6.n) this.f584c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f583b;
                try {
                    taskCompletionSource.setResult(nVar3.c());
                    return;
                } catch (Exception e12) {
                    taskCompletionSource.setException(e12);
                    return;
                }
            case 13:
                n5.c cVar2 = (n5.c) this.f584c;
                CountDownLatch countDownLatch = (CountDownLatch) this.f583b;
                try {
                    a2.b bVar3 = cVar2.f4880h;
                    r2.r.a().f5557d.c(((r2.j) bVar3.f263b).b(o2.d.f5008c), 1);
                } catch (Exception unused3) {
                }
                countDownLatch.countDown();
                return;
            default:
                int i9 = JobInfoSchedulerService.a;
                ((JobInfoSchedulerService) this.f584c).jobFinished((JobParameters) this.f583b, false);
                return;
        }
    }
}
