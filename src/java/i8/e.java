package i8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class e extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    public final transient l7.h f2770a;

    public e(l7.h hVar) {
        this.f2770a = hVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f2770a.toString();
    }
}
