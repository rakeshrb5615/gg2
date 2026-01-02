package p2;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import r2.l;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class a implements l {

    /* renamed from: c  reason: collision with root package name */
    public static final String f5068c;

    /* renamed from: d  reason: collision with root package name */
    public static final Set f5069d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f5070e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f5071f;

    /* renamed from: a  reason: collision with root package name */
    public final String f5072a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5073b;

    static {
        String F = q4.b.F("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f5068c = F;
        String F2 = q4.b.F("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String F3 = q4.b.F("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f5069d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new o2.c("proto"), new o2.c("json"))));
        f5070e = new a(F, null);
        f5071f = new a(F2, F3);
    }

    public a(String str, String str2) {
        this.f5072a = str;
        this.f5073b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (str2.isEmpty()) {
                    throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
                }
                String str3 = split[1];
                if (str3.isEmpty()) {
                    str3 = null;
                }
                return new a(str2, str3);
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }
}
