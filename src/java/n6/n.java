package n6;

import android.content.SharedPreferences;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class n {

    /* renamed from: e  reason: collision with root package name */
    public static final Date f4960e = new Date(-1);

    /* renamed from: f  reason: collision with root package name */
    public static final Date f4961f = new Date(-1);

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f4962a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4963b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final Object f4964c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final Object f4965d = new Object();

    public n(SharedPreferences sharedPreferences) {
        this.f4962a = sharedPreferences;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [n6.m, java.lang.Object] */
    public final m a() {
        ?? obj;
        synchronized (this.f4964c) {
            int i = this.f4962a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.f4962a.getLong("backoff_end_time_in_millis", -1L));
            obj = new Object();
            obj.f4958a = i;
            obj.f4959b = date;
        }
        return obj;
    }

    public final HashMap b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f4962a.getString("customSignals", "{}"));
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [n6.m, java.lang.Object] */
    public final m c() {
        ?? obj;
        synchronized (this.f4965d) {
            int i = this.f4962a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.f4962a.getLong("realtime_backoff_end_time_in_millis", -1L));
            obj = new Object();
            obj.f4958a = i;
            obj.f4959b = date;
        }
        return obj;
    }

    public final void d(int i, Date date) {
        synchronized (this.f4964c) {
            this.f4962a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void e(int i, Date date) {
        synchronized (this.f4965d) {
            this.f4962a.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
