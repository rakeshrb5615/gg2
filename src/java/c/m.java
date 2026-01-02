package c;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class m extends e.i {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ n f822h;

    public m(n nVar) {
        this.f822h = nVar;
    }

    @Override // e.i
    public final void b(int i, f.a aVar, Object obj) {
        Bundle bundle;
        int i9;
        kotlin.jvm.internal.j.e(aVar, "contract");
        n nVar = this.f822h;
        l6.c b10 = aVar.b(nVar, obj);
        if (b10 != null) {
            new Handler(Looper.getMainLooper()).post(new l(this, i, 0, b10));
            return;
        }
        Intent a10 = aVar.a(nVar, obj);
        if (a10.getExtras() != null) {
            Bundle extras = a10.getExtras();
            kotlin.jvm.internal.j.b(extras);
            if (extras.getClassLoader() == null) {
                a10.setExtrasClassLoader(nVar.getClassLoader());
            }
        }
        if (a10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a10.getAction())) {
            String[] stringArrayExtra = a10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < stringArrayExtra.length; i10++) {
                if (TextUtils.isEmpty(stringArrayExtra[i10])) {
                    throw new IllegalArgumentException(v1.a.n(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i10], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i10));
                }
            }
            int size = hashSet.size();
            String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i11 = 0;
                for (int i12 = 0; i12 < stringArrayExtra.length; i12++) {
                    if (!hashSet.contains(Integer.valueOf(i12))) {
                        strArr[i11] = stringArrayExtra[i12];
                        i11++;
                    }
                }
            }
            if (nVar instanceof d0.a) {
                ((d0.a) nVar).validateRequestPermissionsRequestCode(i);
            }
            nVar.requestPermissions(stringArrayExtra, i);
        } else if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a10.getAction())) {
            nVar.startActivityForResult(a10, i, bundle2);
        } else {
            e.k kVar = (e.k) a10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                kotlin.jvm.internal.j.b(kVar);
                i9 = i;
                try {
                    nVar.startIntentSenderForResult(kVar.f1292a, i9, kVar.f1293b, kVar.f1294c, kVar.f1295d, 0, bundle2);
                } catch (IntentSender.SendIntentException e9) {
                    e = e9;
                    new Handler(Looper.getMainLooper()).post(new l(this, i9, 1, e));
                }
            } catch (IntentSender.SendIntentException e10) {
                e = e10;
                i9 = i;
            }
        }
    }
}
