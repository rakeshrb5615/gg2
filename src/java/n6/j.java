package n6;

import android.util.Log;
import com.google.android.gms.common.util.BiConsumer;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class j {

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f4934e;

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f4935f;

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f4936a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final Executor f4937b;

    /* renamed from: c  reason: collision with root package name */
    public final d f4938c;

    /* renamed from: d  reason: collision with root package name */
    public final d f4939d;

    static {
        Charset.forName("UTF-8");
        f4934e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f4935f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public j(Executor executor, d dVar, d dVar2) {
        this.f4937b = executor;
        this.f4938c = dVar;
        this.f4939d = dVar2;
    }

    public static String b(d dVar, String str) {
        f c9 = dVar.c();
        if (c9 != null) {
            try {
                return c9.f4911b.getString(str);
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    public static void c(String str, String str2) {
        Log.w("FirebaseRemoteConfig", "No value of type '" + str2 + "' exists for parameter key '" + str + "'.");
    }

    public final void a(String str, f fVar) {
        if (fVar == null) {
            return;
        }
        synchronized (this.f4936a) {
            try {
                Iterator it = this.f4936a.iterator();
                while (it.hasNext()) {
                    this.f4937b.execute(new androidx.fragment.app.l((BiConsumer) it.next(), str, fVar, 5));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
