package g5;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.NavigableSet;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final /* synthetic */ class p implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1824a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1825b;

    public /* synthetic */ p(Object obj, int i) {
        this.f1824a = i;
        this.f1825b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        n6.f fVar;
        FileInputStream fileInputStream;
        Throwable th;
        switch (this.f1824a) {
            case 0:
                n nVar = ((s) this.f1825b).f1837g;
                nVar.getClass();
                h5.f.a();
                k2.c cVar = nVar.f1809c;
                m5.c cVar2 = (m5.c) cVar.f3364c;
                String str = (String) cVar.f3363b;
                cVar2.getClass();
                boolean z9 = true;
                if (new File((File) cVar2.f4021d, str).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    m5.c cVar3 = (m5.c) cVar.f3364c;
                    cVar3.getClass();
                    new File((File) cVar3.f4021d, str).delete();
                } else {
                    NavigableSet c9 = ((m5.a) nVar.f1817m.f620b).c();
                    String str2 = c9.isEmpty() ? null : (String) c9.first();
                    if (str2 == null || !nVar.j.c(str2)) {
                        z9 = false;
                    }
                }
                return Boolean.valueOf(z9);
            case 1:
                return ((m6.j) this.f1825b).a();
            case 2:
                n6.o oVar = (n6.o) this.f1825b;
                synchronized (oVar) {
                    fVar = null;
                    try {
                        fileInputStream = oVar.f4967a.openFileInput(oVar.f4968b);
                    } catch (FileNotFoundException | JSONException unused) {
                        fileInputStream = null;
                    } catch (Throwable th2) {
                        fileInputStream = null;
                        th = th2;
                    }
                    try {
                        int available = fileInputStream.available();
                        byte[] bArr = new byte[available];
                        fileInputStream.read(bArr, 0, available);
                        fVar = n6.f.a(new JSONObject(new String(bArr, "UTF-8")));
                        fileInputStream.close();
                    } catch (FileNotFoundException | JSONException unused2) {
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return fVar;
                    } catch (Throwable th3) {
                        th = th3;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        throw th;
                    }
                }
                return fVar;
            default:
                o5.d dVar = (o5.d) ((n0.a) this.f1825b).f4374c;
                d4.l lVar = (d4.l) dVar.f5026f;
                o5.f fVar2 = (o5.f) dVar.f5022b;
                String str3 = lVar.f1097b;
                h5.f.b();
                try {
                    HashMap b10 = d4.l.b(fVar2);
                    b8.g gVar = new b8.g(str3, b10);
                    gVar.n("User-Agent", "Crashlytics Android SDK/20.0.3");
                    gVar.n("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    d4.l.a(gVar, fVar2);
                    String str4 = "Requesting settings from " + str3;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str4, null);
                    }
                    String str5 = "Settings query params were: " + b10;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str5, null);
                    }
                    return lVar.c(gVar.f());
                } catch (IOException e9) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e9);
                    return null;
                }
        }
    }
}
