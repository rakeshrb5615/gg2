package r4;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjh;
import com.google.android.gms.measurement.internal.zzlt;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import m4.g;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final c6.b f5582a;

    /* renamed from: b  reason: collision with root package name */
    public Integer f5583b = null;

    public c(c6.b bVar) {
        this.f5582a = bVar;
    }

    public static boolean a(ArrayList arrayList, b bVar) {
        String str = bVar.f5576a;
        String str2 = bVar.f5577b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            b bVar2 = (b) obj;
            if (bVar2.f5576a.equals(str) && bVar2.f5577b.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [u4.a, java.lang.Object] */
    public final ArrayList b() {
        u4.c cVar = (u4.c) ((u4.b) this.f5582a.get());
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : cVar.f6085a.getConditionalUserProperties("frc", "")) {
            g gVar = v4.a.f6291a;
            Preconditions.checkNotNull(bundle);
            ?? obj = new Object();
            obj.f6071a = (String) Preconditions.checkNotNull((String) zzjh.zzb(bundle, "origin", String.class, (Object) null));
            obj.f6072b = (String) Preconditions.checkNotNull((String) zzjh.zzb(bundle, "name", String.class, (Object) null));
            obj.f6073c = zzjh.zzb(bundle, "value", Object.class, (Object) null);
            obj.f6074d = (String) zzjh.zzb(bundle, "trigger_event_name", String.class, (Object) null);
            obj.f6075e = ((Long) zzjh.zzb(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            obj.f6076f = (String) zzjh.zzb(bundle, "timed_out_event_name", String.class, (Object) null);
            obj.f6077g = (Bundle) zzjh.zzb(bundle, "timed_out_event_params", Bundle.class, (Object) null);
            obj.f6078h = (String) zzjh.zzb(bundle, "triggered_event_name", String.class, (Object) null);
            obj.i = (Bundle) zzjh.zzb(bundle, "triggered_event_params", Bundle.class, (Object) null);
            obj.j = ((Long) zzjh.zzb(bundle, "time_to_live", Long.class, 0L)).longValue();
            obj.f6079k = (String) zzjh.zzb(bundle, "expired_event_name", String.class, (Object) null);
            obj.f6080l = (Bundle) zzjh.zzb(bundle, "expired_event_params", Bundle.class, (Object) null);
            obj.f6082n = ((Boolean) zzjh.zzb(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            obj.f6081m = ((Long) zzjh.zzb(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            obj.f6083o = ((Long) zzjh.zzb(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final void c(ArrayList arrayList) {
        Object obj;
        String str;
        String str2;
        String str3;
        c6.b bVar = this.f5582a;
        if (bVar.get() == null) {
            throw new Exception("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                if (arrayList2.isEmpty()) {
                    if (bVar.get() == null) {
                        throw new Exception("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                    }
                    ArrayList b10 = b();
                    int size2 = b10.size();
                    int i9 = 0;
                    while (i9 < size2) {
                        Object obj2 = b10.get(i9);
                        i9++;
                        ((u4.c) ((u4.b) bVar.get())).f6085a.clearConditionalUserProperty(((u4.a) obj2).f6072b, (String) null, (Bundle) null);
                    }
                    return;
                } else if (bVar.get() == null) {
                    throw new Exception("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                } else {
                    ArrayList b11 = b();
                    ArrayList arrayList3 = new ArrayList();
                    int size3 = b11.size();
                    int i10 = 0;
                    while (i10 < size3) {
                        Object obj3 = b11.get(i10);
                        i10++;
                        u4.a aVar = (u4.a) obj3;
                        String[] strArr = b.f5574g;
                        String str4 = aVar.f6074d;
                        arrayList3.add(new b(aVar.f6072b, String.valueOf(aVar.f6073c), str4 != null ? str4 : "", new Date(aVar.f6081m), aVar.f6075e, aVar.j));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size4 = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size4) {
                        Object obj4 = arrayList3.get(i11);
                        i11++;
                        b bVar2 = (b) obj4;
                        if (!a(arrayList2, bVar2)) {
                            arrayList4.add(bVar2.a());
                        }
                    }
                    int size5 = arrayList4.size();
                    int i12 = 0;
                    while (i12 < size5) {
                        Object obj5 = arrayList4.get(i12);
                        i12++;
                        ((u4.c) ((u4.b) bVar.get())).f6085a.clearConditionalUserProperty(((u4.a) obj5).f6072b, (String) null, (Bundle) null);
                    }
                    ArrayList arrayList5 = new ArrayList();
                    int size6 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size6) {
                        Object obj6 = arrayList2.get(i13);
                        i13++;
                        b bVar3 = (b) obj6;
                        if (!a(arrayList3, bVar3)) {
                            arrayList5.add(bVar3);
                        }
                    }
                    ArrayDeque arrayDeque = new ArrayDeque(b());
                    if (this.f5583b == null) {
                        this.f5583b = Integer.valueOf(((u4.c) ((u4.b) bVar.get())).f6085a.getMaxUserProperties("frc"));
                    }
                    int intValue = this.f5583b.intValue();
                    int size7 = arrayList5.size();
                    int i14 = 0;
                    while (i14 < size7) {
                        Object obj7 = arrayList5.get(i14);
                        i14++;
                        b bVar4 = (b) obj7;
                        while (arrayDeque.size() >= intValue) {
                            ((u4.c) ((u4.b) bVar.get())).f6085a.clearConditionalUserProperty(((u4.a) arrayDeque.pollFirst()).f6072b, (String) null, (Bundle) null);
                        }
                        u4.a a10 = bVar4.a();
                        u4.c cVar = (u4.c) ((u4.b) bVar.get());
                        cVar.getClass();
                        g gVar = v4.a.f6291a;
                        String str5 = a10.f6071a;
                        if (str5 != null && !str5.isEmpty() && (((obj = a10.f6073c) == null || zzlt.zzb(obj) != null) && v4.a.a(str5) && v4.a.c(str5, a10.f6072b) && (((str = a10.f6079k) == null || (v4.a.b(a10.f6080l, str) && v4.a.d(str5, a10.f6079k, a10.f6080l))) && (((str2 = a10.f6078h) == null || (v4.a.b(a10.i, str2) && v4.a.d(str5, a10.f6078h, a10.i))) && ((str3 = a10.f6076f) == null || (v4.a.b(a10.f6077g, str3) && v4.a.d(str5, a10.f6076f, a10.f6077g))))))) {
                            AppMeasurementSdk appMeasurementSdk = cVar.f6085a;
                            Bundle bundle = new Bundle();
                            String str6 = a10.f6071a;
                            if (str6 != null) {
                                bundle.putString("origin", str6);
                            }
                            String str7 = a10.f6072b;
                            if (str7 != null) {
                                bundle.putString("name", str7);
                            }
                            Object obj8 = a10.f6073c;
                            if (obj8 != null) {
                                zzjh.zza(bundle, obj8);
                            }
                            String str8 = a10.f6074d;
                            if (str8 != null) {
                                bundle.putString("trigger_event_name", str8);
                            }
                            bundle.putLong("trigger_timeout", a10.f6075e);
                            String str9 = a10.f6076f;
                            if (str9 != null) {
                                bundle.putString("timed_out_event_name", str9);
                            }
                            Bundle bundle2 = a10.f6077g;
                            if (bundle2 != null) {
                                bundle.putBundle("timed_out_event_params", bundle2);
                            }
                            String str10 = a10.f6078h;
                            if (str10 != null) {
                                bundle.putString("triggered_event_name", str10);
                            }
                            Bundle bundle3 = a10.i;
                            if (bundle3 != null) {
                                bundle.putBundle("triggered_event_params", bundle3);
                            }
                            bundle.putLong("time_to_live", a10.j);
                            String str11 = a10.f6079k;
                            if (str11 != null) {
                                bundle.putString("expired_event_name", str11);
                            }
                            Bundle bundle4 = a10.f6080l;
                            if (bundle4 != null) {
                                bundle.putBundle("expired_event_params", bundle4);
                            }
                            bundle.putLong("creation_timestamp", a10.f6081m);
                            bundle.putBoolean("active", a10.f6082n);
                            bundle.putLong("triggered_timestamp", a10.f6083o);
                            appMeasurementSdk.setConditionalUserProperty(bundle);
                        }
                        arrayDeque.offer(a10);
                    }
                    return;
                }
            }
            Object obj9 = arrayList.get(i);
            i++;
            Map map = (Map) obj9;
            String[] strArr2 = b.f5574g;
            ArrayList arrayList6 = new ArrayList();
            String[] strArr3 = b.f5574g;
            for (int i15 = 0; i15 < 5; i15++) {
                String str12 = strArr3[i15];
                if (!map.containsKey(str12)) {
                    arrayList6.add(str12);
                }
            }
            if (!arrayList6.isEmpty()) {
                throw new Exception(String.format("The following keys are missing from the experiment info map: %s", arrayList6));
            }
            try {
                arrayList2.add(new b((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", b.f5575h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis"))));
            } catch (NumberFormatException e9) {
                throw new Exception("Could not process experiment: one of the durations could not be converted into a long.", e9);
            } catch (ParseException e10) {
                throw new Exception("Could not process experiment: parsing experiment start time failed.", e10);
            }
        }
    }
}
