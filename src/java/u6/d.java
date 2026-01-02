package u6;

import d8.c0;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class d extends n7.i implements u7.p {

    /* renamed from: a  reason: collision with root package name */
    public int f6101a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f6102b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f6103c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a1.d f6104d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ a1.o f6105e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Map map, a1.d dVar, a1.o oVar, l7.c cVar) {
        super(2, cVar);
        this.f6102b = eVar;
        this.f6103c = map;
        this.f6104d = dVar;
        this.f6105e = oVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    @Override // n7.a
    public final l7.c create(Object obj, l7.c cVar) {
        return new d(this.f6102b, this.f6103c, this.f6104d, this.f6105e, cVar);
    }

    @Override // u7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((c0) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.Map, java.lang.Object] */
    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        m7.a aVar = m7.a.f4049a;
        int i = this.f6101a;
        h7.l lVar = h7.l.f2236a;
        a1.o oVar = this.f6105e;
        try {
        } catch (Exception e9) {
            String message = e9.getMessage();
            if (message == null) {
                message = e9.toString();
            }
            this.f6101a = 3;
            oVar.invoke(message, this);
            if (lVar == aVar) {
            }
        }
        if (i == 0) {
            c4.b.e0(obj);
            URLConnection openConnection = e.a(this.f6102b).openConnection();
            kotlin.jvm.internal.j.c(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            httpsURLConnection.setRequestMethod("GET");
            httpsURLConnection.setRequestProperty("Accept", "application/json");
            for (Map.Entry entry : this.f6103c.entrySet()) {
                httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int responseCode = httpsURLConnection.getResponseCode();
            if (responseCode == 200) {
                InputStream inputStream = httpsURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
                bufferedReader.close();
                inputStream.close();
                JSONObject jSONObject = new JSONObject(sb.toString());
                a1.d dVar = this.f6104d;
                this.f6101a = 1;
                if (dVar.invoke(jSONObject, this) == aVar) {
                    return aVar;
                }
            } else {
                this.f6101a = 2;
                oVar.invoke("Bad response code: " + responseCode, this);
                if (lVar == aVar) {
                    return aVar;
                }
            }
        } else if (i == 1 || i == 2) {
            c4.b.e0(obj);
        } else if (i != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            c4.b.e0(obj);
        }
        return lVar;
    }
}
