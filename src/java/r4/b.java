package r4;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class b {

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f5574g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h  reason: collision with root package name */
    public static final SimpleDateFormat f5575h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a  reason: collision with root package name */
    public final String f5576a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5577b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5578c;

    /* renamed from: d  reason: collision with root package name */
    public final Date f5579d;

    /* renamed from: e  reason: collision with root package name */
    public final long f5580e;

    /* renamed from: f  reason: collision with root package name */
    public final long f5581f;

    public b(String str, String str2, String str3, Date date, long j, long j8) {
        this.f5576a = str;
        this.f5577b = str2;
        this.f5578c = str3;
        this.f5579d = date;
        this.f5580e = j;
        this.f5581f = j8;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [u4.a, java.lang.Object] */
    public final u4.a a() {
        ?? obj = new Object();
        obj.f6071a = "frc";
        obj.f6081m = this.f5579d.getTime();
        obj.f6072b = this.f5576a;
        obj.f6073c = this.f5577b;
        String str = this.f5578c;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        obj.f6074d = str;
        obj.f6075e = this.f5580e;
        obj.j = this.f5581f;
        return obj;
    }
}
