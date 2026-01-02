package z4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.firebase-auth-api.zzahv;
import java.util.ArrayList;
import y4.e0;
import y4.g0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7305a;

    /* JADX WARN: Type inference failed for: r0v3, types: [z4.e, java.lang.Object, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable, z4.h] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, z4.d0] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f7305a) {
            case 0:
                int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                boolean z9 = false;
                while (parcel.dataPosition() < validateObjectHeader) {
                    int readHeader = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(readHeader)) {
                        case 1:
                            str = SafeParcelReader.createString(parcel, readHeader);
                            break;
                        case 2:
                            str2 = SafeParcelReader.createString(parcel, readHeader);
                            break;
                        case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                            str5 = SafeParcelReader.createString(parcel, readHeader);
                            break;
                        case 4:
                            str4 = SafeParcelReader.createString(parcel, readHeader);
                            break;
                        case d1.h.STRING_FIELD_NUMBER /* 5 */:
                            str3 = SafeParcelReader.createString(parcel, readHeader);
                            break;
                        case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                            str6 = SafeParcelReader.createString(parcel, readHeader);
                            break;
                        case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                            z9 = SafeParcelReader.readBoolean(parcel, readHeader);
                            break;
                        case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                            str7 = SafeParcelReader.createString(parcel, readHeader);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, readHeader);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
                return new c(str, str2, str3, str4, str5, str6, z9, str7);
            case 1:
                int validateObjectHeader2 = SafeParcelReader.validateObjectHeader(parcel);
                zzahv zzahvVar = null;
                String str8 = null;
                String str9 = null;
                ArrayList arrayList = null;
                ArrayList arrayList2 = null;
                String str10 = null;
                Boolean bool = null;
                f fVar = null;
                g0 g0Var = null;
                o oVar = null;
                ArrayList arrayList3 = null;
                boolean z10 = false;
                c cVar = null;
                while (parcel.dataPosition() < validateObjectHeader2) {
                    int readHeader2 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(readHeader2)) {
                        case 1:
                            zzahvVar = (zzahv) SafeParcelReader.createParcelable(parcel, readHeader2, zzahv.CREATOR);
                            break;
                        case 2:
                            cVar = (c) SafeParcelReader.createParcelable(parcel, readHeader2, c.CREATOR);
                            break;
                        case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                            str8 = SafeParcelReader.createString(parcel, readHeader2);
                            break;
                        case 4:
                            str9 = SafeParcelReader.createString(parcel, readHeader2);
                            break;
                        case d1.h.STRING_FIELD_NUMBER /* 5 */:
                            arrayList = SafeParcelReader.createTypedList(parcel, readHeader2, c.CREATOR);
                            break;
                        case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                            arrayList2 = SafeParcelReader.createStringList(parcel, readHeader2);
                            break;
                        case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                            str10 = SafeParcelReader.createString(parcel, readHeader2);
                            break;
                        case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                            bool = SafeParcelReader.readBooleanObject(parcel, readHeader2);
                            break;
                        case 9:
                            fVar = (f) SafeParcelReader.createParcelable(parcel, readHeader2, f.CREATOR);
                            break;
                        case 10:
                            z10 = SafeParcelReader.readBoolean(parcel, readHeader2);
                            break;
                        case 11:
                            g0Var = (g0) SafeParcelReader.createParcelable(parcel, readHeader2, g0.CREATOR);
                            break;
                        case 12:
                            oVar = (o) SafeParcelReader.createParcelable(parcel, readHeader2, o.CREATOR);
                            break;
                        case 13:
                            arrayList3 = SafeParcelReader.createTypedList(parcel, readHeader2, e0.CREATOR);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, readHeader2);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader2);
                ?? abstractSafeParcelable = new AbstractSafeParcelable();
                abstractSafeParcelable.f7325a = zzahvVar;
                abstractSafeParcelable.f7326b = cVar;
                abstractSafeParcelable.f7327c = str8;
                abstractSafeParcelable.f7328d = str9;
                abstractSafeParcelable.f7329e = arrayList;
                abstractSafeParcelable.f7330f = arrayList2;
                abstractSafeParcelable.f7331m = str10;
                abstractSafeParcelable.f7332n = bool;
                abstractSafeParcelable.f7333o = fVar;
                abstractSafeParcelable.f7334p = z10;
                abstractSafeParcelable.q = g0Var;
                abstractSafeParcelable.f7335r = oVar;
                abstractSafeParcelable.f7336s = arrayList3;
                return abstractSafeParcelable;
            case 2:
                int validateObjectHeader3 = SafeParcelReader.validateObjectHeader(parcel);
                long j = 0;
                long j8 = 0;
                while (parcel.dataPosition() < validateObjectHeader3) {
                    int readHeader3 = SafeParcelReader.readHeader(parcel);
                    int fieldId = SafeParcelReader.getFieldId(readHeader3);
                    if (fieldId == 1) {
                        j = SafeParcelReader.readLong(parcel, readHeader3);
                    } else if (fieldId != 2) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader3);
                    } else {
                        j8 = SafeParcelReader.readLong(parcel, readHeader3);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader3);
                return new f(j, j8);
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                int validateObjectHeader4 = SafeParcelReader.validateObjectHeader(parcel);
                ArrayList arrayList4 = null;
                h hVar = null;
                String str11 = null;
                g0 g0Var2 = null;
                e eVar = null;
                ArrayList arrayList5 = null;
                while (parcel.dataPosition() < validateObjectHeader4) {
                    int readHeader4 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(readHeader4)) {
                        case 1:
                            arrayList4 = SafeParcelReader.createTypedList(parcel, readHeader4, y4.w.CREATOR);
                            break;
                        case 2:
                            hVar = (h) SafeParcelReader.createParcelable(parcel, readHeader4, h.CREATOR);
                            break;
                        case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                            str11 = SafeParcelReader.createString(parcel, readHeader4);
                            break;
                        case 4:
                            g0Var2 = (g0) SafeParcelReader.createParcelable(parcel, readHeader4, g0.CREATOR);
                            break;
                        case d1.h.STRING_FIELD_NUMBER /* 5 */:
                            eVar = (e) SafeParcelReader.createParcelable(parcel, readHeader4, e.CREATOR);
                            break;
                        case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                            arrayList5 = SafeParcelReader.createTypedList(parcel, readHeader4, y4.z.CREATOR);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, readHeader4);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader4);
                return new g(arrayList4, hVar, str11, g0Var2, eVar, arrayList5);
            case 4:
                int validateObjectHeader5 = SafeParcelReader.validateObjectHeader(parcel);
                String str12 = null;
                String str13 = null;
                ArrayList arrayList6 = null;
                ArrayList arrayList7 = null;
                e eVar2 = null;
                while (parcel.dataPosition() < validateObjectHeader5) {
                    int readHeader5 = SafeParcelReader.readHeader(parcel);
                    int fieldId2 = SafeParcelReader.getFieldId(readHeader5);
                    if (fieldId2 == 1) {
                        str12 = SafeParcelReader.createString(parcel, readHeader5);
                    } else if (fieldId2 == 2) {
                        str13 = SafeParcelReader.createString(parcel, readHeader5);
                    } else if (fieldId2 == 3) {
                        arrayList6 = SafeParcelReader.createTypedList(parcel, readHeader5, y4.w.CREATOR);
                    } else if (fieldId2 == 4) {
                        arrayList7 = SafeParcelReader.createTypedList(parcel, readHeader5, y4.z.CREATOR);
                    } else if (fieldId2 != 5) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader5);
                    } else {
                        eVar2 = (e) SafeParcelReader.createParcelable(parcel, readHeader5, e.CREATOR);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader5);
                ?? abstractSafeParcelable2 = new AbstractSafeParcelable();
                abstractSafeParcelable2.f7345a = str12;
                abstractSafeParcelable2.f7346b = str13;
                abstractSafeParcelable2.f7347c = arrayList6;
                abstractSafeParcelable2.f7348d = arrayList7;
                abstractSafeParcelable2.f7349e = eVar2;
                return abstractSafeParcelable2;
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                int validateObjectHeader6 = SafeParcelReader.validateObjectHeader(parcel);
                ArrayList arrayList8 = null;
                ArrayList arrayList9 = null;
                while (parcel.dataPosition() < validateObjectHeader6) {
                    int readHeader6 = SafeParcelReader.readHeader(parcel);
                    int fieldId3 = SafeParcelReader.getFieldId(readHeader6);
                    if (fieldId3 == 1) {
                        arrayList8 = SafeParcelReader.createTypedList(parcel, readHeader6, y4.w.CREATOR);
                    } else if (fieldId3 != 2) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader6);
                    } else {
                        arrayList9 = SafeParcelReader.createTypedList(parcel, readHeader6, y4.z.CREATOR);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader6);
                return new o(arrayList8, arrayList9);
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                int validateObjectHeader7 = SafeParcelReader.validateObjectHeader(parcel);
                String str14 = null;
                boolean z11 = false;
                String str15 = null;
                while (parcel.dataPosition() < validateObjectHeader7) {
                    int readHeader7 = SafeParcelReader.readHeader(parcel);
                    int fieldId4 = SafeParcelReader.getFieldId(readHeader7);
                    if (fieldId4 == 1) {
                        str14 = SafeParcelReader.createString(parcel, readHeader7);
                    } else if (fieldId4 == 2) {
                        str15 = SafeParcelReader.createString(parcel, readHeader7);
                    } else if (fieldId4 != 3) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader7);
                    } else {
                        z11 = SafeParcelReader.readBoolean(parcel, readHeader7);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader7);
                return new c0(str14, str15, z11);
            default:
                int validateObjectHeader8 = SafeParcelReader.validateObjectHeader(parcel);
                e eVar3 = null;
                c0 c0Var = null;
                g0 g0Var3 = null;
                while (parcel.dataPosition() < validateObjectHeader8) {
                    int readHeader8 = SafeParcelReader.readHeader(parcel);
                    int fieldId5 = SafeParcelReader.getFieldId(readHeader8);
                    if (fieldId5 == 1) {
                        eVar3 = (e) SafeParcelReader.createParcelable(parcel, readHeader8, e.CREATOR);
                    } else if (fieldId5 == 2) {
                        c0Var = (c0) SafeParcelReader.createParcelable(parcel, readHeader8, c0.CREATOR);
                    } else if (fieldId5 != 3) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader8);
                    } else {
                        g0Var3 = (g0) SafeParcelReader.createParcelable(parcel, readHeader8, g0.CREATOR);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader8);
                ?? obj = new Object();
                obj.f7322a = eVar3;
                obj.f7323b = c0Var;
                obj.f7324c = g0Var3;
                return obj;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f7305a) {
            case 0:
                return new c[i];
            case 1:
                return new e[i];
            case 2:
                return new f[i];
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                return new g[i];
            case 4:
                return new h[i];
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                return new o[i];
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                return new c0[i];
            default:
                return new d0[i];
        }
    }
}
