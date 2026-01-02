package c8;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final c f950b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f951c;

    /* renamed from: d  reason: collision with root package name */
    public static final c f952d;

    /* renamed from: e  reason: collision with root package name */
    public static final c f953e;

    /* renamed from: f  reason: collision with root package name */
    public static final c f954f;

    /* renamed from: m  reason: collision with root package name */
    public static final c f955m;

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ c[] f956n;

    /* renamed from: a  reason: collision with root package name */
    public final TimeUnit f957a;

    static {
        c cVar = new c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f950b = cVar;
        c cVar2 = new c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        c cVar3 = new c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f951c = cVar3;
        c cVar4 = new c("SECONDS", 3, TimeUnit.SECONDS);
        f952d = cVar4;
        c cVar5 = new c("MINUTES", 4, TimeUnit.MINUTES);
        f953e = cVar5;
        c cVar6 = new c("HOURS", 5, TimeUnit.HOURS);
        f954f = cVar6;
        c cVar7 = new c("DAYS", 6, TimeUnit.DAYS);
        f955m = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f956n = cVarArr;
        c4.b.x(cVarArr);
    }

    public c(String str, int i, TimeUnit timeUnit) {
        this.f957a = timeUnit;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f956n.clone();
    }
}
