package b8;

import java.nio.charset.Charset;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f766a;

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f767b;

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f768c;

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f769d;

    /* renamed from: e  reason: collision with root package name */
    public static volatile Charset f770e;

    /* renamed from: f  reason: collision with root package name */
    public static volatile Charset f771f;

    static {
        Charset forName = Charset.forName("UTF-8");
        kotlin.jvm.internal.j.d(forName, "forName(...)");
        f766a = forName;
        kotlin.jvm.internal.j.d(Charset.forName("UTF-16"), "forName(...)");
        Charset forName2 = Charset.forName("UTF-16BE");
        kotlin.jvm.internal.j.d(forName2, "forName(...)");
        f767b = forName2;
        Charset forName3 = Charset.forName("UTF-16LE");
        kotlin.jvm.internal.j.d(forName3, "forName(...)");
        f768c = forName3;
        kotlin.jvm.internal.j.d(Charset.forName("US-ASCII"), "forName(...)");
        Charset forName4 = Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.j.d(forName4, "forName(...)");
        f769d = forName4;
    }
}
