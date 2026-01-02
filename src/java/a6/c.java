package a6;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f629a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f630b;

    public /* synthetic */ c(d dVar, int i) {
        this.f629a = i;
        this.f630b = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        switch (this.f629a) {
            case 0:
                d dVar = this.f630b;
                synchronized (dVar) {
                    try {
                        l lVar = (l) dVar.f631a.get();
                        ArrayList a10 = lVar.a();
                        synchronized (lVar) {
                            lVar.f649a.a(new i(lVar, 0));
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < a10.size(); i++) {
                            a aVar = (a) a10.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", aVar.f625a);
                            jSONObject.put("dates", new JSONArray((Collection) aVar.f626b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return byteArrayOutputStream;
            default:
                d dVar2 = this.f630b;
                synchronized (dVar2) {
                    final l lVar2 = (l) dVar2.f631a.get();
                    long currentTimeMillis = System.currentTimeMillis();
                    final String a11 = ((l6.b) dVar2.f633c.get()).a();
                    synchronized (lVar2) {
                        final String b10 = lVar2.b(currentTimeMillis);
                        final e1.e c02 = c4.b.c0(a11);
                        lVar2.f649a.a(new u7.l() { // from class: a6.h
                            @Override // u7.l
                            public final Object invoke(Object obj) {
                                Object obj2;
                                l lVar3 = l.this;
                                String str = b10;
                                String str2 = a11;
                                e1.e eVar = c02;
                                e1.b bVar = (e1.b) obj;
                                Object obj3 = null;
                                if (((String) c4.b.B(bVar, l.f648d, "")).equals(str)) {
                                    e1.e c9 = lVar3.c(bVar, str);
                                    if (c9 == null || c9.f1304a.equals(str2)) {
                                        return null;
                                    }
                                    synchronized (lVar3) {
                                        lVar3.d(bVar, str);
                                        HashSet hashSet = new HashSet((Collection) c4.b.B(bVar, eVar, new HashSet()));
                                        hashSet.add(str);
                                        bVar.e(eVar, hashSet);
                                    }
                                    return null;
                                }
                                e1.e eVar2 = l.f647c;
                                long longValue = ((Long) c4.b.B(bVar, eVar2, 0L)).longValue();
                                if (longValue + 1 == 30) {
                                    synchronized (lVar3) {
                                        try {
                                            long longValue2 = ((Long) c4.b.B(bVar, eVar2, 0L)).longValue();
                                            String str3 = "";
                                            Set hashSet2 = new HashSet();
                                            String str4 = null;
                                            for (Map.Entry entry : bVar.a().entrySet()) {
                                                if (entry.getValue() instanceof Set) {
                                                    Set<String> set = (Set) entry.getValue();
                                                    for (String str5 : set) {
                                                        Object obj4 = obj3;
                                                        if (str4 != null && str4.compareTo(str5) <= 0) {
                                                            obj3 = obj4;
                                                        }
                                                        str3 = ((e1.e) entry.getKey()).f1304a;
                                                        str4 = str5;
                                                        hashSet2 = set;
                                                        obj3 = obj4;
                                                    }
                                                }
                                                obj3 = obj3;
                                            }
                                            obj2 = obj3;
                                            HashSet hashSet3 = new HashSet(hashSet2);
                                            hashSet3.remove(str4);
                                            bVar.e(c4.b.c0(str3), hashSet3);
                                            longValue = longValue2 - 1;
                                            bVar.d(l.f647c, Long.valueOf(longValue));
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                } else {
                                    obj2 = null;
                                }
                                HashSet hashSet4 = new HashSet((Collection) c4.b.B(bVar, eVar, new HashSet()));
                                hashSet4.add(str);
                                bVar.e(eVar, hashSet4);
                                bVar.d(l.f647c, Long.valueOf(longValue + 1));
                                bVar.d(l.f648d, str);
                                return obj2;
                            }
                        });
                    }
                }
                return null;
        }
    }
}
