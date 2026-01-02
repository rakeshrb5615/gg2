package x;

import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public class f implements d {

    /* renamed from: d  reason: collision with root package name */
    public final o f6511d;

    /* renamed from: f  reason: collision with root package name */
    public int f6513f;

    /* renamed from: g  reason: collision with root package name */
    public int f6514g;

    /* renamed from: a  reason: collision with root package name */
    public o f6508a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6509b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6510c = false;

    /* renamed from: e  reason: collision with root package name */
    public int f6512e = 1;

    /* renamed from: h  reason: collision with root package name */
    public int f6515h = 1;
    public g i = null;
    public boolean j = false;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f6516k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f6517l = new ArrayList();

    public f(o oVar) {
        this.f6511d = oVar;
    }

    @Override // x.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f6517l;
        int size = arrayList.size();
        int i = 0;
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            if (!((f) obj).j) {
                return;
            }
        }
        this.f6510c = true;
        o oVar = this.f6508a;
        if (oVar != null) {
            oVar.a(this);
        }
        if (this.f6509b) {
            this.f6511d.a(this);
            return;
        }
        int size2 = arrayList.size();
        f fVar = null;
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            f fVar2 = (f) obj2;
            if (!(fVar2 instanceof g)) {
                i++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i == 1 && fVar.j) {
            g gVar = this.i;
            if (gVar != null) {
                if (!gVar.j) {
                    return;
                }
                this.f6513f = this.f6515h * gVar.f6514g;
            }
            d(fVar.f6514g + this.f6513f);
        }
        o oVar2 = this.f6508a;
        if (oVar2 != null) {
            oVar2.a(this);
        }
    }

    public final void b(o oVar) {
        this.f6516k.add(oVar);
        if (this.j) {
            oVar.a(oVar);
        }
    }

    public final void c() {
        this.f6517l.clear();
        this.f6516k.clear();
        this.j = false;
        this.f6514g = 0;
        this.f6510c = false;
        this.f6509b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f6514g = i;
        ArrayList arrayList = this.f6516k;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            d dVar = (d) obj;
            dVar.a(dVar);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6511d.f6532b.f6360h0);
        sb.append(":");
        switch (this.f6512e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                str = "RIGHT";
                break;
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "TOP";
                break;
            case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "BOTTOM";
                break;
            case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.f6514g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f6517l.size());
        sb.append(":d=");
        sb.append(this.f6516k.size());
        sb.append(">");
        return sb.toString();
    }
}
