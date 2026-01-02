package z4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.firebase-auth-api.zzahv;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import y4.g0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class e extends y4.l {
    public static final Parcelable.Creator<e> CREATOR = new b(1);

    /* renamed from: a  reason: collision with root package name */
    public zzahv f7325a;

    /* renamed from: b  reason: collision with root package name */
    public c f7326b;

    /* renamed from: c  reason: collision with root package name */
    public String f7327c;

    /* renamed from: d  reason: collision with root package name */
    public String f7328d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f7329e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f7330f;

    /* renamed from: m  reason: collision with root package name */
    public String f7331m;

    /* renamed from: n  reason: collision with root package name */
    public Boolean f7332n;

    /* renamed from: o  reason: collision with root package name */
    public f f7333o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f7334p;
    public g0 q;

    /* renamed from: r  reason: collision with root package name */
    public o f7335r;

    /* renamed from: s  reason: collision with root package name */
    public List f7336s;

    public e(q4.f fVar, ArrayList arrayList) {
        Preconditions.checkNotNull(fVar);
        fVar.a();
        this.f7327c = fVar.f5387b;
        this.f7328d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f7331m = "2";
        z(arrayList);
    }

    @Override // y4.l
    public final void A(ArrayList arrayList) {
        o oVar;
        if (arrayList.isEmpty()) {
            oVar = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                y4.p pVar = (y4.p) obj;
                if (pVar instanceof y4.w) {
                    arrayList2.add((y4.w) pVar);
                } else if (pVar instanceof y4.z) {
                    arrayList3.add((y4.z) pVar);
                }
            }
            oVar = new o(arrayList2, arrayList3);
        }
        this.f7335r = oVar;
    }

    @Override // y4.b0
    public final String s() {
        return this.f7326b.f7312b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f7325a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f7326b, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.f7327c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f7328d, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.f7329e, false);
        SafeParcelWriter.writeStringList(parcel, 6, this.f7330f, false);
        SafeParcelWriter.writeString(parcel, 7, this.f7331m, false);
        SafeParcelWriter.writeBooleanObject(parcel, 8, Boolean.valueOf(y()), false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f7333o, i, false);
        SafeParcelWriter.writeBoolean(parcel, 10, this.f7334p);
        SafeParcelWriter.writeParcelable(parcel, 11, this.q, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f7335r, i, false);
        SafeParcelWriter.writeTypedList(parcel, 13, this.f7336s, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // y4.l
    public final String x() {
        Map map;
        zzahv zzahvVar = this.f7325a;
        if (zzahvVar == null || zzahvVar.zzc() == null || (map = (Map) ((Map) n.a(this.f7325a.zzc()).f3275b).get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // y4.l
    public final boolean y() {
        String str;
        Boolean bool = this.f7332n;
        if (bool == null || bool.booleanValue()) {
            zzahv zzahvVar = this.f7325a;
            if (zzahvVar != null) {
                Map map = (Map) ((Map) n.a(zzahvVar.zzc()).f3275b).get("firebase");
                str = map != null ? (String) map.get("sign_in_provider") : null;
            } else {
                str = "";
            }
            boolean z9 = true;
            if (this.f7329e.size() > 1 || (str != null && str.equals("custom"))) {
                z9 = false;
            }
            this.f7332n = Boolean.valueOf(z9);
        }
        return this.f7332n.booleanValue();
    }

    @Override // y4.l
    public final synchronized e z(List list) {
        try {
            Preconditions.checkNotNull(list);
            this.f7329e = new ArrayList(list.size());
            this.f7330f = new ArrayList(list.size());
            for (int i = 0; i < list.size(); i++) {
                y4.b0 b0Var = (y4.b0) list.get(i);
                if (b0Var.s().equals("firebase")) {
                    this.f7326b = (c) b0Var;
                } else {
                    this.f7330f.add(b0Var.s());
                }
                this.f7329e.add((c) b0Var);
            }
            if (this.f7326b == null) {
                this.f7326b = (c) this.f7329e.get(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }
}
