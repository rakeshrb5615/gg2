package z8;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.MediaType;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class o0 {

    /* renamed from: x  reason: collision with root package name */
    public static final Pattern f7522x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: y  reason: collision with root package name */
    public static final Pattern f7523y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: a  reason: collision with root package name */
    public final s0 f7524a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f7525b;

    /* renamed from: c  reason: collision with root package name */
    public final Annotation[] f7526c;

    /* renamed from: d  reason: collision with root package name */
    public final Annotation[][] f7527d;

    /* renamed from: e  reason: collision with root package name */
    public final Type[] f7528e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7529f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7530g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f7531h;
    public boolean i;
    public boolean j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7532k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f7533l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f7534m;

    /* renamed from: n  reason: collision with root package name */
    public String f7535n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f7536o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f7537p;
    public boolean q;

    /* renamed from: r  reason: collision with root package name */
    public String f7538r;

    /* renamed from: s  reason: collision with root package name */
    public Headers f7539s;

    /* renamed from: t  reason: collision with root package name */
    public MediaType f7540t;

    /* renamed from: u  reason: collision with root package name */
    public LinkedHashSet f7541u;

    /* renamed from: v  reason: collision with root package name */
    public z0[] f7542v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f7543w;

    public o0(s0 s0Var, Method method) {
        this.f7524a = s0Var;
        this.f7525b = method;
        this.f7526c = method.getAnnotations();
        this.f7528e = method.getGenericParameterTypes();
        this.f7527d = method.getParameterAnnotations();
    }

    public static Class a(Class cls) {
        return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
    }

    public final void b(String str, String str2, boolean z9) {
        String str3 = this.f7535n;
        Method method = this.f7525b;
        if (str3 != null) {
            throw z0.m(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }
        this.f7535n = str;
        this.f7536o = z9;
        if (str2.isEmpty()) {
            return;
        }
        int indexOf = str2.indexOf(63);
        Pattern pattern = f7522x;
        if (indexOf != -1 && indexOf < str2.length() - 1) {
            String substring = str2.substring(indexOf + 1);
            if (pattern.matcher(substring).find()) {
                throw z0.m(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
            }
        }
        this.f7538r = str2;
        Matcher matcher = pattern.matcher(str2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        this.f7541u = linkedHashSet;
    }

    public final void c(int i, Type type) {
        if (z0.j(type)) {
            throw z0.n(this.f7525b, i, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }
}
