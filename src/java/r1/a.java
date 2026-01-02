package r1;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.fragment.app.j0;
import h.c;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final Object f5494e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static a f5495f;

    /* renamed from: a  reason: collision with root package name */
    public final Context f5496a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f5497b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f5498c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f5499d = new ArrayList();

    public a(Context context) {
        this.f5496a = context;
        new c(this, context.getMainLooper());
    }

    public static a a(j0 j0Var) {
        a aVar;
        synchronized (f5494e) {
            try {
                if (f5495f == null) {
                    f5495f = new a(j0Var.getApplicationContext());
                }
                aVar = f5495f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public final void b(Intent intent) {
        synchronized (this.f5497b) {
            try {
                intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f5496a.getContentResolver());
                intent.getData();
                String scheme = intent.getScheme();
                intent.getCategories();
                boolean z9 = (intent.getFlags() & 8) != 0;
                if (z9) {
                    Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList = (ArrayList) this.f5498c.get(intent.getAction());
                if (arrayList != null) {
                    if (z9) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                    }
                    if (arrayList.size() > 0) {
                        if (arrayList.get(0) != null) {
                            throw new ClassCastException();
                        }
                        if (!z9) {
                            throw null;
                        }
                        throw null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
