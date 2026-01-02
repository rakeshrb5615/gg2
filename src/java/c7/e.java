package c7;

import c7.a;
import c7.b;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f941a;

    /* renamed from: b  reason: collision with root package name */
    public static final a.C0000a f942b;

    /* renamed from: c  reason: collision with root package name */
    public static final b.a f943c;

    /* renamed from: d  reason: collision with root package name */
    public static final c f944d;

    static {
        boolean z9;
        try {
            Class.forName("java.sql.Date");
            z9 = true;
        } catch (ClassNotFoundException unused) {
            z9 = false;
        }
        f941a = z9;
        if (z9) {
            f942b = a.f935b;
            f943c = b.f937b;
            f944d = d.f939b;
            return;
        }
        f942b = null;
        f943c = null;
        f944d = null;
    }
}
