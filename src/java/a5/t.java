package a5;

import android.util.Log;
import android.window.OnBackInvokedDispatcher;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeResponseListener;
import com.chilllive.chillwallpaperproject.MainActivity;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final /* synthetic */ class t implements c6.a, f, OnFailureListener, f2.r, Continuation, OnCompleteListener, ConsumeResponseListener, e.b, x5.a, o2.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f609a;

    public /* synthetic */ t(int i) {
        this.f609a = i;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher d(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    @Override // c6.a
    public void a(c6.b bVar) {
    }

    @Override // o2.e
    public Object apply(Object obj) {
        k6.e eVar = (k6.e) obj;
        eVar.getClass();
        b8.g gVar = j6.p.f3276a;
        gVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            gVar.e(eVar, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // f2.r
    public void b(f2.q qVar, f2.s sVar) {
        switch (this.f609a) {
            case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                qVar.e(sVar);
                return;
            case 9:
                qVar.f(sVar);
                return;
            case 10:
                qVar.c(sVar);
                return;
            case 11:
                qVar.b();
                return;
            default:
                qVar.d();
                return;
        }
    }

    @Override // a5.f
    public Object e(z zVar) {
        switch (this.f609a) {
            case 1:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 2:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case 4:
                r rVar = ExecutorsRegistrar.a;
                return b5.n.f759a;
            default:
                return FirebaseInstallationsRegistrar.a(zVar);
        }
    }

    @Override // e.b
    public void onActivityResult(Object obj) {
        int i = MainActivity.f958u0;
        ((e.a) obj).getClass();
    }

    public void onComplete(Task task) {
    }

    public void onConsumeResponse(BillingResult billingResult, String str) {
        billingResult.getResponseCode();
    }

    public void onFailure(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    public Object then(Task task) {
        boolean z9;
        File file;
        int i;
        switch (this.f609a) {
            case 14:
                if (task.isSuccessful()) {
                    g5.b bVar = (g5.b) task.getResult();
                    d5.d dVar = d5.d.f1126a;
                    dVar.b("Crashlytics report successfully enqueued to DataTransport: " + bVar.f1774b);
                    z9 = true;
                    if (bVar.f1775c.delete()) {
                        dVar.b("Deleted report file: " + file.getPath());
                    } else {
                        dVar.d("Crashlytics could not delete report file: " + file.getPath(), null);
                    }
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            case 20:
                i = 403;
                break;
            default:
                i = -1;
                break;
        }
        return Integer.valueOf(i);
    }

    public /* synthetic */ t(z zVar) {
        this.f609a = 14;
    }
}
