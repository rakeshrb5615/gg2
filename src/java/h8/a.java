package h8;

import java.util.concurrent.CancellationException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class a extends CancellationException {

    /* renamed from: a  reason: collision with root package name */
    public final transient Object f2237a;

    public a(g8.d dVar) {
        super("Flow was aborted, no more elements needed");
        this.f2237a = dVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
