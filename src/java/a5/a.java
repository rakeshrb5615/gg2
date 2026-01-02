package a5;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import androidx.credentials.playservices.HiddenActivity;
import com.chilllive.chillwallpaperproject.MainActivity;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j6.c0;
import j6.e0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import okhttp3.EventListener;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final /* synthetic */ class a implements f, c6.a, Continuation, OnSuccessListener, OnCompleteListener, SuccessContinuation, EventListener.Factory, z2.b, y6.p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f560a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f561b;

    public /* synthetic */ a(Object obj, int i) {
        this.f560a = i;
        this.f561b = obj;
    }

    @Override // c6.a
    public void a(c6.b bVar) {
        switch (this.f560a) {
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                d5.b bVar2 = (d5.b) this.f561b;
                bVar2.getClass();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
                }
                bVar2.f1124b.set((d5.b) bVar.get());
                return;
            default:
                d5.c cVar = (d5.c) this.f561b;
                j6.s sVar = ((m6.j) ((p6.a) bVar.get())).a().i;
                ((Set) sVar.f3285e).add(cVar);
                Task b10 = ((n6.d) sVar.f3282b).b();
                b10.addOnSuccessListener((Executor) sVar.f3284d, new h5.a(sVar, b10, cVar, 5));
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Registering RemoteConfig Rollouts subscriber", null);
                    return;
                }
                return;
        }
    }

    @Override // z2.b
    public Object b() {
        SQLiteDatabase c9;
        int i = this.f560a;
        Object obj = this.f561b;
        switch (i) {
            case 22:
                y2.h hVar = (y2.h) ((y2.c) obj);
                hVar.getClass();
                int i9 = u2.a.f6037e;
                j6.s sVar = new j6.s(12, false);
                sVar.f3283c = null;
                sVar.f3284d = new ArrayList();
                sVar.f3285e = null;
                sVar.f3282b = "";
                HashMap hashMap = new HashMap();
                c9 = hVar.c();
                c9.beginTransaction();
                try {
                    u2.a aVar = (u2.a) y2.h.A(c9.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new h5.a(hVar, hashMap, sVar, 9));
                    c9.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 23:
                y2.h hVar2 = (y2.h) ((y2.d) obj);
                long b10 = hVar2.f6773b.b() - hVar2.f6775d.f6762d;
                c9 = hVar2.c();
                c9.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(b10)};
                    Cursor rawQuery = c9.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        int i10 = rawQuery.getInt(0);
                        hVar2.x(i10, u2.c.MESSAGE_TOO_OLD, rawQuery.getString(1));
                    }
                    rawQuery.close();
                    int delete = c9.delete("events", "timestamp_ms < ?", strArr);
                    c9.setTransactionSuccessful();
                    c9.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case 24:
                y2.h hVar3 = (y2.h) ((y2.c) ((o5.d) obj).i);
                c9 = hVar3.c();
                c9.beginTransaction();
                try {
                    c9.compileStatement("DELETE FROM log_event_dropped").execute();
                    c9.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar3.f6773b.b()).execute();
                    c9.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                j6.s sVar2 = (j6.s) obj;
                for (r2.j jVar : (Iterable) ((y2.h) ((y2.d) sVar2.f3283c)).i(new r2.q(13))) {
                    ((b8.g) sVar2.f3284d).s(jVar, 1, false);
                }
                return null;
        }
    }

    @Override // y6.p
    public Object c() {
        int i = this.f560a;
        Object obj = this.f561b;
        switch (i) {
            case 26:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e9) {
                    q4.b bVar = b7.c.f765a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e9);
                } catch (InstantiationException e10) {
                    throw new RuntimeException("Failed to invoke constructor '" + b7.c.b(constructor) + "' with no args", e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException("Failed to invoke constructor '" + b7.c.b(constructor) + "' with no args", e11.getCause());
                }
            default:
                Class cls = (Class) obj;
                try {
                    return y6.v.f6958a.a(cls);
                } catch (Exception e12) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e12);
                }
        }
    }

    public p2.b d(b8.g gVar) {
        p2.c cVar = (p2.c) this.f561b;
        URL url = (URL) gVar.f789b;
        String concat = "TRuntime.".concat("CctTransportBackend");
        if (Log.isLoggable(concat, 4)) {
            Log.i(concat, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.f5083g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) gVar.f791d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                j6.o oVar = cVar.f5077a;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                v5.d dVar = (v5.d) oVar.f3275b;
                v5.e eVar = new v5.e(bufferedWriter, dVar.f6309a, dVar.f6310b, dVar.f6311c, dVar.f6312d);
                eVar.h((q2.m) gVar.f790c);
                eVar.j();
                eVar.f6314b.flush();
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Integer valueOf = Integer.valueOf(responseCode);
                String concat2 = "TRuntime.".concat("CctTransportBackend");
                if (Log.isLoggable(concat2, 4)) {
                    Log.i(concat2, String.format("Status Code: %d", valueOf));
                }
                c4.b.v("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                c4.b.v("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new p2.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                }
                if (responseCode != 200) {
                    return new p2.b(responseCode, null, 0L);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                    p2.b bVar = new p2.b(responseCode, null, q2.u.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f5301a);
                    if (gZIPInputStream != null) {
                        gZIPInputStream.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bVar;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (ConnectException e9) {
            e = e9;
            c4.b.w(e, "CctTransportBackend", "Couldn't open connection, returning with 500");
            return new p2.b(500, null, 0L);
        } catch (UnknownHostException e10) {
            e = e10;
            c4.b.w(e, "CctTransportBackend", "Couldn't open connection, returning with 500");
            return new p2.b(500, null, 0L);
        } catch (IOException e11) {
            e = e11;
            c4.b.w(e, "CctTransportBackend", "Couldn't encode request, returning with 400");
            return new p2.b(400, null, 0L);
        } catch (t5.b e12) {
            e = e12;
            c4.b.w(e, "CctTransportBackend", "Couldn't encode request, returning with 400");
            return new p2.b(400, null, 0L);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(38:3|(1:5)(1:160)|6|7|(1:9)|(1:11)(1:159)|12|(3:155|156|(47:158|28|(1:30)|31|(3:33|(2:35|36)(1:38)|37)|39|40|41|42|43|(1:45)|46|(1:48)|(1:50)(1:147)|51|(4:54|(2:56|57)(1:59)|58|52)|60|61|(1:63)|64|65|(1:67)(1:146)|68|(1:70)(1:145)|71|(5:132|(1:134)|135|3ca|140)(1:75)|76|(17:80|(1:82)(2:128|(1:130))|83|84|(2:86|(1:88))(2:124|(2:126|127))|89|90|91|92|93|94|95|(3:116|(1:118)|119)(3:103|(1:105)|106)|107|108|(2:110|(1:112))|113)|131|83|84|(0)(0)|89|90|91|92|93|94|95|(2:97|99)|116|(0)|119|107|108|(0)|113))(3:16|(3:151|152|(1:154))(4:20|(2:23|21)|24|25)|26)|27|28|(0)|31|(0)|39|40|41|42|43|(0)|46|(0)|(0)(0)|51|(1:52)|60|61|(0)|64|65|(0)(0)|68|(0)(0)|71|(1:73)|132|(0)|135|3ca) */
    /* JADX WARN: Can't wrap try/catch for region: R(47:158|28|(1:30)|31|(3:33|(2:35|36)(1:38)|37)|39|40|41|42|43|(1:45)|46|(1:48)|(1:50)(1:147)|51|(4:54|(2:56|57)(1:59)|58|52)|60|61|(1:63)|64|65|(1:67)(1:146)|68|(1:70)(1:145)|71|(5:132|(1:134)|135|3ca|140)(1:75)|76|(17:80|(1:82)(2:128|(1:130))|83|84|(2:86|(1:88))(2:124|(2:126|127))|89|90|91|92|93|94|95|(3:116|(1:118)|119)(3:103|(1:105)|106)|107|108|(2:110|(1:112))|113)|131|83|84|(0)(0)|89|90|91|92|93|94|95|(2:97|99)|116|(0)|119|107|108|(0)|113) */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0575, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0590, code lost:
        android.util.Log.e(r3, "Crashlytics was not started due to an exception during initialization", r0);
        r9.f1837g = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x05f2, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x05f3, code lost:
        r3 = "FirebaseCrashlytics";
        android.util.Log.e(r3, "Error retrieving app package info.", r0);
        r4 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0305 A[LOOP:3: B:66:0x0303->B:67:0x0305, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03b2  */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, o5.d] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, c5.c] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, c5.c] */
    @Override // a5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(a5.z r49) {
        /*
            Method dump skipped, instructions count: 1582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.a.e(a5.z):java.lang.Object");
    }

    public void onComplete(Task task) {
        switch (this.f560a) {
            case 11:
                c0.a((Intent) this.f561b);
                return;
            case 12:
                ((e0) this.f561b).f3243b.trySetResult((Object) null);
                return;
            default:
                ((ScheduledFuture) this.f561b).cancel(false);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [c.n, com.chilllive.chillwallpaperproject.MainActivity] */
    public void onSuccess(Object obj) {
        int i = this.f560a;
        Object obj2 = this.f561b;
        switch (i) {
            case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                ?? r22 = (MainActivity) obj2;
                c4.a aVar = (c4.a) obj;
                int i9 = MainActivity.f958u0;
                int i10 = aVar.f896a;
                PendingIntent pendingIntent = aVar.f897b;
                if (i10 == 2) {
                    byte b10 = (byte) (((byte) (0 | 1)) | 2);
                    if (b10 != 3) {
                        StringBuilder sb = new StringBuilder();
                        if ((b10 & 1) == 0) {
                            sb.append(" appUpdateType");
                        }
                        if ((b10 & 2) == 0) {
                            sb.append(" allowAssetPackDeletion");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                    }
                    if ((pendingIntent != null ? pendingIntent : null) != null) {
                        r22.f967e0 = true;
                        byte b11 = (byte) (((byte) (0 | 1)) | 2);
                        try {
                            if (b11 != 3) {
                                StringBuilder sb2 = new StringBuilder();
                                if ((b11 & 1) == 0) {
                                    sb2.append(" appUpdateType");
                                }
                                if ((b11 & 2) == 0) {
                                    sb2.append(" allowAssetPackDeletion");
                                }
                                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                            }
                            r22.f961b0.getClass();
                            if ((pendingIntent != null ? pendingIntent : null) != null && !aVar.f898c) {
                                aVar.f898c = true;
                                if (pendingIntent == null) {
                                    pendingIntent = null;
                                }
                                r22.startIntentSenderForResult(pendingIntent.getIntentSender(), 100, null, 0, 0, 0, null);
                                return;
                            }
                            return;
                        } catch (IntentSender.SendIntentException e9) {
                            e9.printStackTrace();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 18:
                int i11 = HiddenActivity.c;
                ((u0.c) obj2).invoke(obj);
                return;
            case 19:
                int i12 = HiddenActivity.c;
                ((u0.c) obj2).invoke(obj);
                return;
            case 20:
                int i13 = HiddenActivity.c;
                ((u0.c) obj2).invoke(obj);
                return;
            default:
                int i14 = HiddenActivity.c;
                ((u0.c) obj2).invoke(obj);
                return;
        }
    }

    public Object then(Task task) {
        switch (this.f560a) {
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                ((CountDownLatch) this.f561b).countDown();
                return null;
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                return (Task) ((g5.l) this.f561b).call();
            case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Runnable) this.f561b).run();
                return Tasks.forResult((Object) null);
            default:
                ((z) this.f561b).getClass();
                Bundle bundle = (Bundle) task.getResult(IOException.class);
                if (bundle != null) {
                    String string = bundle.getString("registration_id");
                    if (string == null && (string = bundle.getString("unregistered")) == null) {
                        String string2 = bundle.getString("error");
                        if ("RST".equals(string2)) {
                            throw new IOException("INSTANCE_ID_RESET");
                        }
                        if (string2 != null) {
                            throw new IOException(string2);
                        }
                        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                        throw new IOException("SERVICE_NOT_AVAILABLE");
                    }
                    return string;
                }
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    public Task then(Object obj) {
        n6.f fVar = (n6.f) obj;
        return Tasks.forResult((n6.h) this.f561b);
    }
}
