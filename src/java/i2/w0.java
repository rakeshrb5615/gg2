package i2;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class w0 implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f2617a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2618b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2619c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2620d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2621e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2622f;

    /* renamed from: m  reason: collision with root package name */
    public final String f2623m;

    /* renamed from: n  reason: collision with root package name */
    public final String f2624n;

    /* renamed from: o  reason: collision with root package name */
    public final String f2625o;

    /* renamed from: p  reason: collision with root package name */
    public final String f2626p;
    public final String q;

    /* renamed from: r  reason: collision with root package name */
    public final String f2627r;

    /* renamed from: s  reason: collision with root package name */
    public final String f2628s;

    /* renamed from: t  reason: collision with root package name */
    public final String f2629t;

    /* renamed from: u  reason: collision with root package name */
    public final String f2630u;

    /* renamed from: v  reason: collision with root package name */
    public final String f2631v;

    /* renamed from: w  reason: collision with root package name */
    public final HashSet f2632w;

    /* renamed from: x  reason: collision with root package name */
    public final HashSet f2633x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f2634y;

    /* renamed from: z  reason: collision with root package name */
    public final String[] f2635z = new String[2];
    public final boolean[] A = new boolean[5];

    public w0(Context context, SharedPreferences sharedPreferences) {
        this.f2617a = sharedPreferences;
        this.f2634y = context;
        this.f2618b = context.getResources().getString(2131952478);
        this.f2619c = context.getResources().getString(2131951751);
        this.f2620d = context.getResources().getString(2131952363);
        this.f2621e = context.getResources().getString(2131951743);
        this.f2622f = context.getResources().getString(2131952216);
        this.f2623m = context.getResources().getString(2131951755);
        String string = context.getResources().getString(2131952261);
        this.f2624n = string;
        String string2 = context.getResources().getString(2131952347);
        this.f2625o = string2;
        this.f2628s = context.getResources().getString(2131952392);
        String string3 = context.getResources().getString(2131952393);
        this.f2629t = string3;
        this.f2630u = context.getResources().getString(2131952205);
        this.f2626p = context.getResources().getString(2131952087);
        this.q = context.getResources().getString(2131951856);
        String string4 = context.getResources().getString(2131951816);
        this.f2631v = context.getResources().getString(2131952263);
        this.f2627r = context.getResources().getString(2131951809);
        String string5 = context.getResources().getString(2131952227);
        String string6 = context.getResources().getString(2131952229);
        context.getResources().getString(2131952228);
        context.getResources().getString(2131952219);
        context.getResources().getString(2131952394);
        String string7 = context.getResources().getString(2131951705);
        String string8 = context.getResources().getString(2131951704);
        context.getResources().getString(2131951860);
        String string9 = context.getResources().getString(2131952221);
        String string10 = context.getResources().getString(2131951942);
        String string11 = context.getResources().getString(2131951859);
        String string12 = context.getResources().getString(2131951878);
        String string13 = context.getResources().getString(2131952222);
        String string14 = context.getResources().getString(2131951944);
        String string15 = context.getResources().getString(2131952098);
        String string16 = context.getResources().getString(2131952097);
        String string17 = context.getResources().getString(2131951880);
        String string18 = context.getResources().getString(2131951879);
        String string19 = context.getResources().getString(2131951943);
        String string20 = context.getResources().getString(2131952089);
        String string21 = context.getResources().getString(2131951947);
        String string22 = context.getResources().getString(2131952093);
        String string23 = context.getResources().getString(2131952224);
        String string24 = context.getResources().getString(2131951949);
        String string25 = context.getResources().getString(2131952226);
        String string26 = context.getResources().getString(2131952099);
        String string27 = context.getResources().getString(2131952220);
        String string28 = context.getResources().getString(2131951881);
        String string29 = context.getResources().getString(2131951887);
        String string30 = context.getResources().getString(2131951945);
        String string31 = context.getResources().getString(2131952090);
        String string32 = context.getResources().getString(2131952429);
        String string33 = context.getResources().getString(2131951948);
        String string34 = context.getResources().getString(2131952094);
        String string35 = context.getResources().getString(2131951950);
        String string36 = context.getResources().getString(2131952095);
        String string37 = context.getResources().getString(2131951946);
        String string38 = context.getResources().getString(2131952092);
        String string39 = context.getResources().getString(2131952223);
        String string40 = context.getResources().getString(2131952091);
        String string41 = context.getResources().getString(2131952225);
        String string42 = context.getResources().getString(2131952096);
        this.f2632w = new HashSet(Arrays.asList(string, string4, string5, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string30, string31, string32, string39, string40, string19, string20, string21, string22, string33, string34, string3));
        this.f2633x = new HashSet(Arrays.asList(string2, string6, string23, string24, string25, string26, string27, string28, string8, string7, string35, string36, string41, string42, string29, string37, string38));
    }

    public final String[] a() {
        String str = this.f2618b;
        String str2 = this.f2627r;
        SharedPreferences sharedPreferences = this.f2617a;
        String string = sharedPreferences.getString(str, str2);
        String[] strArr = this.f2635z;
        strArr[0] = string;
        strArr[1] = sharedPreferences.getString(this.f2619c, "0");
        if (strArr[0].equals(this.f2631v.toLowerCase()) && sharedPreferences.getBoolean(this.f2634y.getString(2131952274), false)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f2620d);
            arrayList.add(this.f2621e);
            arrayList.add(this.f2622f);
            arrayList.add(this.f2623m);
            arrayList.add(this.f2624n);
            arrayList.add(this.f2625o);
            arrayList.add(this.f2628s);
            arrayList.add(this.f2629t);
            arrayList.add(this.f2630u);
            arrayList.add(this.f2626p);
            strArr[0] = (String) arrayList.get(k0.f2392a.nextInt(arrayList.size()));
        }
        return strArr;
    }

    public final boolean[] b(boolean z9) {
        String[] strArr = this.f2635z;
        if (strArr[0] == null) {
            a();
        }
        String lowerCase = strArr[0].toLowerCase();
        boolean contains = lowerCase.contains(this.f2620d.toLowerCase());
        String str = this.q;
        String str2 = this.f2626p;
        boolean z10 = true;
        boolean z11 = (contains || lowerCase.contains(this.f2621e.toLowerCase()) || lowerCase.contains(this.f2622f.toLowerCase()) || lowerCase.contains(this.f2623m.toLowerCase()) || lowerCase.contains(str2.toLowerCase()) || lowerCase.contains(str.toLowerCase())) ? false : true;
        boolean[] zArr = this.A;
        zArr[0] = z11;
        zArr[1] = this.f2632w.contains(strArr[0]);
        zArr[2] = this.f2633x.contains(strArr[0]);
        if (!strArr[0].contains(str2) && !strArr[0].contains(this.f2625o)) {
            z10 = false;
        }
        zArr[3] = z10;
        zArr[4] = strArr[0].contains(str);
        String str3 = this.f2618b;
        String str4 = this.f2627r;
        SharedPreferences sharedPreferences = this.f2617a;
        if (sharedPreferences.getString(str3, str4).equalsIgnoreCase(this.f2631v)) {
            Context context = this.f2634y;
            if (sharedPreferences.getBoolean(context.getString(2131952274), false) && z9) {
                Random random = k0.f2392a;
                int nextInt = random.nextInt(100);
                int nextInt2 = random.nextInt(30);
                c4.b.Q(sharedPreferences, context.getString(2131951749), nextInt);
                c4.b.Q(sharedPreferences, "precipitationAmountKey", nextInt2);
                c4.b.Q(sharedPreferences, "windStrengthKey", random.nextInt(130) - 65);
            }
        }
        return zArr;
    }
}
