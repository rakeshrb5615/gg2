package y8;

import java.util.ArrayList;
import x8.y;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final y f6996a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6997b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6998c;

    /* renamed from: d  reason: collision with root package name */
    public final long f6999d;

    /* renamed from: e  reason: collision with root package name */
    public final long f7000e;

    /* renamed from: f  reason: collision with root package name */
    public final long f7001f;

    /* renamed from: g  reason: collision with root package name */
    public final int f7002g;

    /* renamed from: h  reason: collision with root package name */
    public final long f7003h;
    public final int i;
    public final int j;

    /* renamed from: k  reason: collision with root package name */
    public final Long f7004k;

    /* renamed from: l  reason: collision with root package name */
    public final Long f7005l;

    /* renamed from: m  reason: collision with root package name */
    public final Long f7006m;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f7007n;

    public j(y yVar, boolean z9, String str, long j, long j8, long j9, int i, long j10, int i9, int i10, Long l5, Long l9, Long l10, Integer num, Integer num2, Integer num3) {
        kotlin.jvm.internal.j.e(yVar, "canonicalPath");
        kotlin.jvm.internal.j.e(str, "comment");
        this.f6996a = yVar;
        this.f6997b = z9;
        this.f6998c = str;
        this.f6999d = j;
        this.f7000e = j8;
        this.f7001f = j9;
        this.f7002g = i;
        this.f7003h = j10;
        this.i = i9;
        this.j = i10;
        this.f7004k = l5;
        this.f7005l = l9;
        this.f7006m = l10;
        this.f7007n = new ArrayList();
    }

    public /* synthetic */ j(y yVar, boolean z9, String str, long j, long j8, long j9, int i, long j10, int i9, int i10, Long l5, Long l9, Long l10, int i11) {
        this(yVar, z9, (i11 & 4) != 0 ? "" : str, (i11 & 8) != 0 ? -1L : j, (i11 & 16) != 0 ? -1L : j8, (i11 & 32) != 0 ? -1L : j9, (i11 & 64) != 0 ? -1 : i, (i11 & 128) != 0 ? -1L : j10, (i11 & 256) != 0 ? -1 : i9, (i11 & 512) != 0 ? -1 : i10, (i11 & 1024) != 0 ? null : l5, (i11 & 2048) != 0 ? null : l9, (i11 & 4096) != 0 ? null : l10, null, null, null);
    }
}
