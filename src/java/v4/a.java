package v4;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzjo;
import j5.t1;
import java.util.Arrays;
import m4.g;
import m4.i;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final g f6291a;

    /* renamed from: b  reason: collision with root package name */
    public static final i f6292b;

    /* renamed from: c  reason: collision with root package name */
    public static final i f6293c;

    /* renamed from: d  reason: collision with root package name */
    public static final i f6294d;

    /* renamed from: e  reason: collision with root package name */
    public static final i f6295e;

    /* renamed from: f  reason: collision with root package name */
    public static final i f6296f;

    static {
        int i = g.f3974c;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        f6291a = g.g(15, objArr);
        m4.b bVar = m4.d.f3967b;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        t1.d(7, objArr2);
        f6292b = m4.d.e(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        t1.d(3, objArr3);
        f6293c = m4.d.e(3, objArr3);
        Object[] objArr4 = {"_r", "_dbg"};
        t1.d(2, objArr4);
        f6294d = m4.d.e(2, objArr4);
        Object[] objArr5 = new Object[4];
        String[] strArr = zzjo.zza;
        int length = strArr.length;
        t1.d(length, strArr);
        if (4 < length) {
            objArr5 = Arrays.copyOf(objArr5, c4.b.y(4, length));
        }
        System.arraycopy(strArr, 0, objArr5, 0, length);
        String[] strArr2 = zzjo.zzb;
        int length2 = strArr2.length;
        t1.d(length2, strArr2);
        int i9 = length + length2;
        if (objArr5.length < i9) {
            objArr5 = Arrays.copyOf(objArr5, c4.b.y(objArr5.length, i9));
        }
        System.arraycopy(strArr2, 0, objArr5, length, length2);
        f6295e = m4.d.e(i9, objArr5);
        Object[] objArr6 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
        t1.d(2, objArr6);
        f6296f = m4.d.e(2, objArr6);
    }

    public static boolean a(String str) {
        return !f6293c.contains(str);
    }

    public static boolean b(Bundle bundle, String str) {
        if (f6292b.contains(str)) {
            return false;
        }
        if (bundle != null) {
            i iVar = f6294d;
            int i = iVar.f3980d;
            int i9 = 0;
            while (i9 < i) {
                boolean containsKey = bundle.containsKey((String) iVar.get(i9));
                i9++;
                if (containsKey) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            if (str.equals("fcm") || str.equals("frc")) {
                return true;
            }
        } else if ("_ln".equals(str2)) {
            if (str.equals("fcm") || str.equals("fiam")) {
                return true;
            }
        } else if (!f6295e.contains(str2)) {
            i iVar = f6296f;
            int i = iVar.f3980d;
            int i9 = 0;
            while (i9 < i) {
                boolean matches = str2.matches((String) iVar.get(i9));
                i9++;
                if (matches) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean d(String str, String str2, Bundle bundle) {
        if ("_cmp".equals(str2)) {
            if (a(str) && bundle != null) {
                i iVar = f6294d;
                int i = iVar.f3980d;
                int i9 = 0;
                while (true) {
                    if (i9 < i) {
                        boolean containsKey = bundle.containsKey((String) iVar.get(i9));
                        i9++;
                        if (containsKey) {
                            break;
                        }
                    } else {
                        int hashCode = str.hashCode();
                        if (hashCode != 101200) {
                            if (hashCode != 101230) {
                                if (hashCode == 3142703 && str.equals("fiam")) {
                                    bundle.putString("_cis", "fiam_integration");
                                    return true;
                                }
                            } else if (str.equals("fdl")) {
                                bundle.putString("_cis", "fdl_integration");
                                return true;
                            }
                        } else if (str.equals("fcm")) {
                            bundle.putString("_cis", "fcm_integration");
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
}
