package i5;

import android.util.Log;
import j6.o;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f2711b = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final m5.c f2712a;

    public g(m5.c cVar) {
        this.f2712a = cVar;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }

    public static ArrayList b(String str) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                o oVar = m.f2729a;
                JSONObject jSONObject = new JSONObject(string);
                String string2 = jSONObject.getString("rolloutId");
                String string3 = jSONObject.getString("parameterKey");
                String string4 = jSONObject.getString("parameterValue");
                String string5 = jSONObject.getString("variantId");
                long j = jSONObject.getLong("templateVersion");
                if (string4.length() > 256) {
                    string4 = string4.substring(0, 256);
                }
                arrayList.add(new b(string2, string3, string4, string5, j));
            } catch (Exception e9) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e9);
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(m.f2729a.q(list.get(i))));
            } catch (JSONException e9) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e9);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    public static void g(File file, String str) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", g2.g.f("Deleted corrupt file: ", file.getAbsolutePath(), "\nReason: ", str), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    public final Map c(String str, boolean z9) {
        Throwable th;
        FileInputStream fileInputStream;
        Exception e9;
        m5.c cVar = this.f2712a;
        File b10 = z9 ? cVar.b(str, "internal-keys") : cVar.b(str, "keys");
        if (!b10.exists() || b10.length() == 0) {
            g(b10, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        try {
            try {
                fileInputStream = new FileInputStream(b10);
                try {
                    HashMap a10 = a(g5.g.i(fileInputStream));
                    g5.g.b(fileInputStream, "Failed to close user metadata file.");
                    return a10;
                } catch (Exception e10) {
                    e9 = e10;
                    Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e9);
                    f(b10);
                    g5.g.b(fileInputStream, "Failed to close user metadata file.");
                    return Collections.EMPTY_MAP;
                }
            } catch (Throwable th2) {
                th = th2;
                g5.g.b(r1, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e11) {
            fileInputStream = null;
            e9 = e11;
        } catch (Throwable th3) {
            ?? r12 = 0;
            th = th3;
            g5.g.b(r12, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    public final String d(String str) {
        FileInputStream fileInputStream;
        File b10 = this.f2712a.b(str, "user-data");
        Closeable closeable = null;
        if (b10.exists()) {
            ?? r32 = (b10.length() > 0L ? 1 : (b10.length() == 0L ? 0 : -1));
            try {
                if (r32 != 0) {
                    try {
                        fileInputStream = new FileInputStream(b10);
                        try {
                            JSONObject jSONObject = new JSONObject(g5.g.i(fileInputStream));
                            String optString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                            String str2 = "Loaded userId " + optString + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str2, null);
                            }
                            g5.g.b(fileInputStream, "Failed to close user metadata file.");
                            return optString;
                        } catch (Exception e9) {
                            e = e9;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            f(b10);
                            g5.g.b(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        g5.g.b(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = r32;
            }
        }
        String l5 = g2.g.l("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", l5, null);
        }
        f(b10);
        return null;
    }

    public final void h(String str, Map map, boolean z9) {
        String jSONObject;
        BufferedWriter bufferedWriter;
        m5.c cVar = this.f2712a;
        File b10 = z9 ? cVar.b(str, "internal-keys") : cVar.b(str, "keys");
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                jSONObject = new JSONObject(map).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b10), f2711b));
            } catch (Exception e9) {
                e = e9;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(jSONObject);
            bufferedWriter.flush();
            g5.g.b(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e10) {
            e = e10;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
            f(b10);
            g5.g.b(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            g5.g.b(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
    public final void i(String str, List list) {
        Throwable th;
        BufferedWriter bufferedWriter;
        Exception e9;
        File b10 = this.f2712a.b(str, "rollouts-state");
        ?? isEmpty = list.isEmpty();
        if (isEmpty != 0) {
            g(b10, "Rollout state is empty for session: " + str);
            return;
        }
        try {
            try {
                String e10 = e(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b10), f2711b));
                try {
                    bufferedWriter.write(e10);
                    bufferedWriter.flush();
                    g5.g.b(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Exception e11) {
                    e9 = e11;
                    Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e9);
                    f(b10);
                    g5.g.b(bufferedWriter, "Failed to close rollouts state file.");
                }
            } catch (Throwable th2) {
                th = th2;
                g5.g.b(isEmpty, "Failed to close rollouts state file.");
                throw th;
            }
        } catch (Exception e12) {
            bufferedWriter = null;
            e9 = e12;
        } catch (Throwable th3) {
            isEmpty = 0;
            th = th3;
            g5.g.b(isEmpty, "Failed to close rollouts state file.");
            throw th;
        }
    }
}
