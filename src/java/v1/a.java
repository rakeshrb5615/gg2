package v1;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.b1;
import androidx.fragment.app.e0;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.internal.measurement.zzbk;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzlm;
import com.google.android.gms.internal.play_billing.zzep;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.recaptcha.internal.zzln;
import d1.h;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;
import u.e;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public abstract /* synthetic */ class a {
    public static final void a(View view, int i) {
        j.e(view, "view");
        int c9 = e.c(i);
        if (c9 == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (b1.H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
            }
        } else if (c9 == 1) {
            if (b1.H(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
        } else if (c9 == 2) {
            if (b1.H(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
        } else if (c9 != 3) {
        } else {
            if (b1.H(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
            }
            view.setVisibility(4);
        }
    }

    public static int b(int i, int i9, int i10) {
        return zzlm.zzz(i) + i9 + i10;
    }

    public static int c(int i, int i9, int i10, int i11, int i12) {
        return Math.max(((i * i9) / i10) + i11, i12);
    }

    public static BillingResult d(int i, String str) {
        BillingResult.Builder newBuilder = BillingResult.newBuilder();
        newBuilder.setResponseCode(i);
        newBuilder.setDebugMessage(str);
        return newBuilder.build();
    }

    public static ClassCastException e(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static Object f(zzbk zzbkVar, int i, List list, int i9) {
        zzh.zza(zzbkVar.name(), i, list);
        return list.get(i9);
    }

    public static String g(long j, String str) {
        return str + j;
    }

    public static String h(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.B());
        return sb.toString();
    }

    public static String i(String str, int i, int i9, String str2) {
        return str + i + str2 + i9;
    }

    public static String j(String str, int i, String str2) {
        return str + i + str2;
    }

    public static String k(String str, e0 e0Var, String str2) {
        return str + e0Var + str2;
    }

    public static String l(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String m(StringBuilder sb, String str, int i) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String n(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String o(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static StringBuilder p(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder q(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder r(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void s(zzic zzicVar, String str) {
        zzicVar.zzaV().zzb().zza(str);
    }

    public static /* synthetic */ void t(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static int u(int i, int i9, int i10) {
        return zzep.zzC(i) + i9 + i10;
    }

    public static void v(zzic zzicVar, String str) {
        zzicVar.zzaV().zze().zza(str);
    }

    public static int w(int i, int i9, int i10) {
        return zzln.zzA(i) + i9 + i10;
    }

    public static /* synthetic */ String x(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static /* synthetic */ String y(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }

    public static /* synthetic */ String z(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case h.INTEGER_FIELD_NUMBER /* 3 */:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case h.STRING_FIELD_NUMBER /* 5 */:
                return "NAME";
            case h.STRING_SET_FIELD_NUMBER /* 6 */:
                return "STRING";
            case h.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NUMBER";
            case h.BYTES_FIELD_NUMBER /* 8 */:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }
}
