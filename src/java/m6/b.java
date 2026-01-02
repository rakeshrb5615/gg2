package m6;

import j6.s;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import n6.l;
import n6.n;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final r4.c f4027a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f4028b;

    /* renamed from: c  reason: collision with root package name */
    public final n6.d f4029c;

    /* renamed from: d  reason: collision with root package name */
    public final n6.d f4030d;

    /* renamed from: e  reason: collision with root package name */
    public final n6.i f4031e;

    /* renamed from: f  reason: collision with root package name */
    public final n6.j f4032f;

    /* renamed from: g  reason: collision with root package name */
    public final n f4033g;

    /* renamed from: h  reason: collision with root package name */
    public final n0.a f4034h;
    public final s i;

    public b(r4.c cVar, Executor executor, n6.d dVar, n6.d dVar2, n6.d dVar3, n6.i iVar, n6.j jVar, n nVar, n0.a aVar, s sVar) {
        this.f4027a = cVar;
        this.f4028b = executor;
        this.f4029c = dVar;
        this.f4030d = dVar2;
        this.f4031e = iVar;
        this.f4032f = jVar;
        this.f4033g = nVar;
        this.f4034h = aVar;
        this.i = sVar;
    }

    public static ArrayList c(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public final String a(String str) {
        n6.j jVar = this.f4032f;
        n6.d dVar = jVar.f4938c;
        String b10 = n6.j.b(dVar, str);
        if (b10 != null) {
            jVar.a(str, dVar.c());
            return b10;
        }
        String b11 = n6.j.b(jVar.f4939d, str);
        if (b11 != null) {
            return b11;
        }
        n6.j.c(str, "String");
        return "";
    }

    public final void b(boolean z9) {
        HttpURLConnection httpURLConnection;
        n0.a aVar = this.f4034h;
        synchronized (aVar) {
            l lVar = (l) aVar.f4374c;
            synchronized (lVar.f4957r) {
                lVar.f4947e = z9;
                n6.c cVar = lVar.f4949g;
                if (cVar != null) {
                    cVar.j = z9;
                }
                if (z9 && (httpURLConnection = lVar.f4948f) != null) {
                    httpURLConnection.disconnect();
                }
            }
            if (!z9) {
                synchronized (aVar) {
                    if (!((LinkedHashSet) aVar.f4373b).isEmpty()) {
                        ((l) aVar.f4374c).e(0L);
                    }
                }
            }
        }
    }
}
