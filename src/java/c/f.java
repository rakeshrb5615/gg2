package c;

import android.os.Bundle;
import g8.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final /* synthetic */ class f implements b2.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f809a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f810b;

    public /* synthetic */ f(Object obj, int i) {
        this.f809a = i;
        this.f810b = obj;
    }

    @Override // b2.d
    public final Bundle a() {
        h7.f[] fVarArr;
        switch (this.f809a) {
            case 0:
                return n.a((n) this.f810b);
            default:
                a2.b bVar = (a2.b) this.f810b;
                for (Map.Entry entry : i7.r.r0((LinkedHashMap) bVar.f266e).entrySet()) {
                    bVar.m(((y) ((g8.u) entry.getValue())).b(), (String) entry.getKey());
                }
                for (Map.Entry entry2 : i7.r.r0((LinkedHashMap) bVar.f264c).entrySet()) {
                    bVar.m(((b2.d) entry2.getValue()).a(), (String) entry2.getKey());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) bVar.f263b;
                if (linkedHashMap.isEmpty()) {
                    fVarArr = new h7.f[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        arrayList.add(new h7.f((String) entry3.getKey(), entry3.getValue()));
                    }
                    fVarArr = (h7.f[]) arrayList.toArray(new h7.f[0]);
                }
                return c4.b.f((h7.f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        }
    }
}
