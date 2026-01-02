package j2;

import android.content.Context;
import android.content.SharedPreferences;
import i2.p0;
import j5.t1;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import w6.m;
import z8.k0;
import z8.r0;
import z8.s0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class j {
    public final String A;

    /* renamed from: a  reason: collision with root package name */
    public final Context f2830a;

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f2831b;

    /* renamed from: c  reason: collision with root package name */
    public final h f2832c;

    /* renamed from: d  reason: collision with root package name */
    public String f2833d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2834e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2835f;

    /* renamed from: g  reason: collision with root package name */
    public final String f2836g;

    /* renamed from: h  reason: collision with root package name */
    public final String f2837h;
    public final String i;
    public final String j;

    /* renamed from: k  reason: collision with root package name */
    public final String f2838k;

    /* renamed from: l  reason: collision with root package name */
    public final String f2839l;

    /* renamed from: m  reason: collision with root package name */
    public final String f2840m;

    /* renamed from: n  reason: collision with root package name */
    public final String f2841n;

    /* renamed from: o  reason: collision with root package name */
    public final String f2842o;

    /* renamed from: p  reason: collision with root package name */
    public final String f2843p;
    public final String q;

    /* renamed from: r  reason: collision with root package name */
    public final String f2844r;

    /* renamed from: s  reason: collision with root package name */
    public final String f2845s;

    /* renamed from: t  reason: collision with root package name */
    public final String f2846t;

    /* renamed from: u  reason: collision with root package name */
    public final String f2847u;

    /* renamed from: v  reason: collision with root package name */
    public final String f2848v;

    /* renamed from: w  reason: collision with root package name */
    public final String f2849w;

    /* renamed from: x  reason: collision with root package name */
    public final String f2850x;

    /* renamed from: y  reason: collision with root package name */
    public final String f2851y;

    /* renamed from: z  reason: collision with root package name */
    public final String f2852z;

    public j(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f2830a = applicationContext;
        this.f2831b = t1.z(applicationContext);
        if (g.f2829a == null) {
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
            httpLoggingInterceptor.d = HttpLoggingInterceptor.Level.c;
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.c.add(httpLoggingInterceptor);
            OkHttpClient okHttpClient = new OkHttpClient(builder);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            HttpUrl.j.getClass();
            HttpUrl.Builder builder2 = new HttpUrl.Builder();
            builder2.b((HttpUrl) null, "https://api.weatherapi.com/v1/");
            HttpUrl a10 = builder2.a();
            ArrayList arrayList3 = a10.f;
            if (!"".equals(arrayList3.get(arrayList3.size() - 1))) {
                throw new IllegalArgumentException("baseUrl must end in /: " + a10);
            }
            arrayList.add(new a9.a(new m()));
            m0.f fVar = k0.f7502a;
            z8.a aVar = k0.f7504c;
            ArrayList arrayList4 = new ArrayList(arrayList2);
            List a11 = aVar.a(fVar);
            arrayList4.addAll(a11);
            List b10 = aVar.b();
            ArrayList arrayList5 = new ArrayList(arrayList.size() + 1 + b10.size());
            arrayList5.add(new z8.b(0));
            arrayList5.addAll(arrayList);
            arrayList5.addAll(b10);
            List unmodifiableList = Collections.unmodifiableList(arrayList5);
            List unmodifiableList2 = Collections.unmodifiableList(arrayList4);
            a11.size();
            g.f2829a = new s0(okHttpClient, a10, unmodifiableList, unmodifiableList2);
        }
        s0 s0Var = g.f2829a;
        s0Var.getClass();
        if (!h.class.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(h.class);
        while (!arrayDeque.isEmpty()) {
            Class cls = (Class) arrayDeque.removeFirst();
            if (cls.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls.getName());
                if (cls != h.class) {
                    sb.append(" which is an interface of ");
                    sb.append(h.class.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls.getInterfaces());
        }
        this.f2832c = (h) Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{h.class}, new r0(s0Var));
        this.f2834e = this.f2830a.getString(2131952366);
        this.f2835f = this.f2830a.getString(2131952372);
        this.f2836g = this.f2830a.getString(2131952397);
        this.f2837h = this.f2830a.getString(2131952398);
        this.i = this.f2830a.getString(2131952417);
        this.j = this.f2830a.getString(2131952418);
        this.f2830a.getString(2131952506);
        this.f2830a.getString(2131952507);
        this.f2838k = this.f2830a.getString(2131951804);
        this.f2839l = this.f2830a.getString(2131951805);
        this.f2841n = this.f2830a.getString(2131952105);
        this.f2842o = this.f2830a.getString(2131952104);
        this.f2843p = this.f2830a.getString(2131952478);
        this.q = this.f2830a.getString(2131951751);
        this.f2844r = this.f2830a.getString(2131952503);
        this.f2845s = this.f2830a.getString(2131952502);
        this.f2846t = this.f2830a.getString(2131952243);
        this.f2847u = this.f2830a.getString(2131951934);
        this.f2848v = this.f2830a.getString(2131951970);
        this.f2849w = this.f2830a.getString(2131951920);
        this.f2850x = this.f2830a.getString(2131951927);
        this.f2851y = this.f2830a.getString(2131951926);
        this.f2852z = this.f2830a.getString(2131952493);
        this.A = this.f2830a.getString(2131951956);
        this.f2840m = this.f2830a.getString(2131951883);
    }

    public static float e(String str) {
        if (str == null || str.equalsIgnoreCase("No moonrise") || str.equalsIgnoreCase("No moonset") || str.isEmpty()) {
            return -1.0f;
        }
        int i = 0;
        String[] split = str.substring(0, 5).split(":");
        int parseInt = Integer.parseInt(split[0]);
        int parseInt2 = Integer.parseInt(split[1]);
        if (str.toLowerCase().contains("pm") && parseInt < 12) {
            i = parseInt + 12;
        } else if (!str.toLowerCase().contains("am") || parseInt != 12) {
            i = parseInt;
        }
        return (parseInt2 / 60.0f) + i;
    }

    public final boolean a(boolean z9) {
        SharedPreferences sharedPreferences = this.f2831b;
        long currentTimeMillis = (System.currentTimeMillis() - sharedPreferences.getLong("lastEpoch", 0L)) / 60000;
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.US).format(new Date());
        int i = (currentTimeMillis > 10000L ? 1 : (currentTimeMillis == 10000L ? 0 : -1));
        Context context = this.f2830a;
        String string = i > 0 ? context.getString(2131951928) : d(currentTimeMillis);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (z9) {
            edit.putString(context.getString(2131952493), format);
        }
        edit.putString("lastProviderUpdate", string);
        edit.putString(this.f2843p, sharedPreferences.getString("weatherSaved", ""));
        edit.apply();
        return currentTimeMillis < 10;
    }

    public final void b(String str, i iVar) {
        String str2 = this.f2833d;
        if (str2 == null || str2.isEmpty()) {
            m6.b a10 = ((m6.j) q4.f.d().b(m6.j.class)).a();
            String[] strArr = p0.f2470a;
            this.f2833d = a10.a(q4.b.l("EsHRYyAys99gO4XPhP1w8g=="));
        }
        this.f2832c.a(this.f2833d, str, 3, "no", "no").f(new k2.c(this, iVar, 26, false));
    }

    public final void c(double d9, double d10, boolean z9, i iVar) {
        if (a(z9)) {
            return;
        }
        b(d9 + "," + d10, iVar);
    }

    public final String d(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        Context context = this.f2830a;
        if (i == 0) {
            return context.getString(2131951896);
        }
        if (j <= 15) {
            return j + context.getString(2131952083);
        } else if (j <= 30) {
            return context.getString(2131951849);
        } else {
            if (j <= 60) {
                return context.getString(2131951875);
            }
            if (j >= 120) {
                return (j / 60) + context.getString(2131952198);
            }
            return context.getString(2131951968);
        }
    }

    public final void f(double d9, double d10, SharedPreferences.Editor editor) {
        if (d9 == 999.0d || d10 == 999.0d) {
            return;
        }
        int i = (d9 > 0.0d ? 1 : (d9 == 0.0d ? 0 : -1));
        String str = this.f2840m;
        if (i >= 0) {
            editor.putInt(str, 1);
        } else {
            editor.putInt(str, -1);
        }
        SharedPreferences sharedPreferences = this.f2831b;
        sharedPreferences.edit().putString(this.f2847u, Double.toString(d9)).apply();
        sharedPreferences.edit().putString(this.f2848v, Double.toString(d10)).apply();
        editor.commit();
    }
}
