package e;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class h extends c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1281a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f1282b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f1283c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f.a f1284d;

    public /* synthetic */ h(i iVar, String str, f.a aVar, int i) {
        this.f1281a = i;
        this.f1282b = iVar;
        this.f1283c = str;
        this.f1284d = aVar;
    }

    @Override // e.c
    public final void a(Object obj) {
        switch (this.f1281a) {
            case 0:
                i iVar = this.f1282b;
                ArrayList arrayList = iVar.f1288d;
                LinkedHashMap linkedHashMap = iVar.f1286b;
                String str = this.f1283c;
                Object obj2 = linkedHashMap.get(str);
                f.a aVar = this.f1284d;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int intValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    iVar.b(intValue, aVar, obj);
                    return;
                } catch (Exception e9) {
                    arrayList.remove(str);
                    throw e9;
                }
            default:
                i iVar2 = this.f1282b;
                ArrayList arrayList2 = iVar2.f1288d;
                LinkedHashMap linkedHashMap2 = iVar2.f1286b;
                String str2 = this.f1283c;
                Object obj3 = linkedHashMap2.get(str2);
                f.a aVar2 = this.f1284d;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int intValue2 = ((Number) obj3).intValue();
                arrayList2.add(str2);
                try {
                    iVar2.b(intValue2, aVar2, obj);
                    return;
                } catch (Exception e10) {
                    arrayList2.remove(str2);
                    throw e10;
                }
        }
    }

    public void b() {
        this.f1282b.f(this.f1283c);
    }
}
