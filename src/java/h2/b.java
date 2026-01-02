package h2;

import android.os.Parcel;
import android.util.SparseIntArray;
import r.e;
import r.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f2151d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f2152e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2153f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2154g;

    /* renamed from: h  reason: collision with root package name */
    public final String f2155h;
    public int i;
    public int j;

    /* renamed from: k  reason: collision with root package name */
    public int f2156k;

    /* JADX WARN: Type inference failed for: r5v0, types: [r.e, r.j] */
    /* JADX WARN: Type inference failed for: r6v0, types: [r.e, r.j] */
    /* JADX WARN: Type inference failed for: r7v0, types: [r.e, r.j] */
    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new j(0), new j(0), new j(0));
    }

    @Override // h2.a
    public final b a() {
        Parcel parcel = this.f2152e;
        int dataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f2153f) {
            i = this.f2154g;
        }
        return new b(parcel, dataPosition, i, v1.a.n(new StringBuilder(), this.f2155h, "  "), this.f2148a, this.f2149b, this.f2150c);
    }

    @Override // h2.a
    public final boolean e(int i) {
        while (this.j < this.f2154g) {
            int i9 = this.f2156k;
            if (i9 == i) {
                return true;
            }
            if (String.valueOf(i9).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i10 = this.j;
            Parcel parcel = this.f2152e;
            parcel.setDataPosition(i10);
            int readInt = parcel.readInt();
            this.f2156k = parcel.readInt();
            this.j += readInt;
        }
        return this.f2156k == i;
    }

    @Override // h2.a
    public final void h(int i) {
        int i9 = this.i;
        SparseIntArray sparseIntArray = this.f2151d;
        Parcel parcel = this.f2152e;
        if (i9 >= 0) {
            int i10 = sparseIntArray.get(i9);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i10);
            parcel.writeInt(dataPosition - i10);
            parcel.setDataPosition(dataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public b(Parcel parcel, int i, int i9, String str, e eVar, e eVar2, e eVar3) {
        super(eVar, eVar2, eVar3);
        this.f2151d = new SparseIntArray();
        this.i = -1;
        this.f2156k = -1;
        this.f2152e = parcel;
        this.f2153f = i;
        this.f2154g = i9;
        this.j = i;
        this.f2155h = str;
    }
}
