package a2;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.firebase-auth-api.zzaiz;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class z implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f549a;

    /* JADX WARN: Type inference failed for: r1v32, types: [y4.c0, java.lang.Object, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [a2.a0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [a2.q1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27, types: [android.view.View$BaseSavedState, java.lang.Object, k3.b] */
    /* JADX WARN: Type inference failed for: r2v28, types: [android.view.View$BaseSavedState, n.p0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29, types: [android.view.View$BaseSavedState, t0.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [a2.r1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30, types: [android.view.View$BaseSavedState, x3.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.fragment.app.y0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, androidx.fragment.app.d1] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f549a) {
            case 0:
                ?? obj = new Object();
                obj.f259a = parcel.readInt();
                obj.f260b = parcel.readInt();
                obj.f261c = parcel.readInt() == 1;
                return obj;
            case 1:
                ?? obj2 = new Object();
                obj2.f446a = parcel.readInt();
                obj2.f447b = parcel.readInt();
                obj2.f449d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    obj2.f448c = iArr;
                    parcel.readIntArray(iArr);
                }
                return obj2;
            case 2:
                ?? obj3 = new Object();
                obj3.f456a = parcel.readInt();
                obj3.f457b = parcel.readInt();
                int readInt2 = parcel.readInt();
                obj3.f458c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    obj3.f459d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                obj3.f460e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    obj3.f461f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                obj3.f463n = parcel.readInt() == 1;
                obj3.f464o = parcel.readInt() == 1;
                obj3.f465p = parcel.readInt() == 1;
                obj3.f462m = parcel.readArrayList(q1.class.getClassLoader());
                return obj3;
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                return new androidx.fragment.app.b(parcel);
            case 4:
                return new androidx.fragment.app.c(parcel);
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                ?? obj4 = new Object();
                ((androidx.fragment.app.y0) obj4).a = parcel.readString();
                ((androidx.fragment.app.y0) obj4).b = parcel.readInt();
                return obj4;
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                ?? obj5 = new Object();
                ((androidx.fragment.app.d1) obj5).e = null;
                ((androidx.fragment.app.d1) obj5).f = new ArrayList();
                ((androidx.fragment.app.d1) obj5).m = new ArrayList();
                ((androidx.fragment.app.d1) obj5).a = parcel.createStringArrayList();
                ((androidx.fragment.app.d1) obj5).b = parcel.createStringArrayList();
                ((androidx.fragment.app.d1) obj5).c = (androidx.fragment.app.b[]) parcel.createTypedArray(androidx.fragment.app.b.CREATOR);
                ((androidx.fragment.app.d1) obj5).d = parcel.readInt();
                ((androidx.fragment.app.d1) obj5).e = parcel.readString();
                ((androidx.fragment.app.d1) obj5).f = parcel.createStringArrayList();
                ((androidx.fragment.app.d1) obj5).m = parcel.createTypedArrayList(androidx.fragment.app.c.CREATOR);
                ((androidx.fragment.app.d1) obj5).n = parcel.createTypedArrayList(androidx.fragment.app.y0.CREATOR);
                return obj5;
            case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                return new androidx.fragment.app.h1(parcel);
            case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                return new com.google.android.material.datepicker.b(parcel.readParcelable(com.google.android.material.datepicker.s.class.getClassLoader()), parcel.readParcelable(com.google.android.material.datepicker.s.class.getClassLoader()), parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), parcel.readParcelable(com.google.android.material.datepicker.s.class.getClassLoader()), parcel.readInt());
            case 9:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 10:
                return com.google.android.material.datepicker.s.a(parcel.readInt(), parcel.readInt());
            case 11:
                kotlin.jvm.internal.j.e(parcel, "parcel");
                return new e.a(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
            case 12:
                kotlin.jvm.internal.j.e(parcel, "inParcel");
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                kotlin.jvm.internal.j.b(readParcelable);
                return new e.k((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 13:
                return new ParcelImpl(parcel);
            case 14:
                return new h4.b((PendingIntent) parcel.readParcelable(h4.a.class.getClassLoader()), parcel.readInt() != 0);
            case 15:
                int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < validateObjectHeader) {
                    int readHeader = SafeParcelReader.readHeader(parcel);
                    if (SafeParcelReader.getFieldId(readHeader) != 2) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader);
                    } else {
                        bundle = SafeParcelReader.createBundle(parcel, readHeader);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
                return new j6.q(bundle);
            case 16:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.f3367a = ((Integer) parcel.readValue(k3.b.class.getClassLoader())).intValue();
                return baseSavedState;
            case 17:
                ?? baseSavedState2 = new View.BaseSavedState(parcel);
                baseSavedState2.f4245a = parcel.readByte() != 0;
                return baseSavedState2;
            case 18:
                ?? baseSavedState3 = new View.BaseSavedState(parcel);
                baseSavedState3.f5950a = parcel.readInt();
                return baseSavedState3;
            case 19:
                ?? baseSavedState4 = new View.BaseSavedState(parcel);
                baseSavedState4.f6564a = parcel.readFloat();
                baseSavedState4.f6565b = parcel.readFloat();
                ArrayList arrayList = new ArrayList();
                baseSavedState4.f6566c = arrayList;
                parcel.readList(arrayList, Float.class.getClassLoader());
                baseSavedState4.f6567d = parcel.readFloat();
                baseSavedState4.f6568e = parcel.createBooleanArray()[0];
                return baseSavedState4;
            case 20:
                int validateObjectHeader2 = SafeParcelReader.validateObjectHeader(parcel);
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                boolean z9 = false;
                boolean z10 = false;
                int i = 0;
                while (parcel.dataPosition() < validateObjectHeader2) {
                    int readHeader2 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(readHeader2)) {
                        case 1:
                            str = SafeParcelReader.createString(parcel, readHeader2);
                            break;
                        case 2:
                            str2 = SafeParcelReader.createString(parcel, readHeader2);
                            break;
                        case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                            str3 = SafeParcelReader.createString(parcel, readHeader2);
                            break;
                        case 4:
                            str4 = SafeParcelReader.createString(parcel, readHeader2);
                            break;
                        case d1.h.STRING_FIELD_NUMBER /* 5 */:
                            z9 = SafeParcelReader.readBoolean(parcel, readHeader2);
                            break;
                        case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                            str5 = SafeParcelReader.createString(parcel, readHeader2);
                            break;
                        case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                            z10 = SafeParcelReader.readBoolean(parcel, readHeader2);
                            break;
                        case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                            str6 = SafeParcelReader.createString(parcel, readHeader2);
                            break;
                        case 9:
                            i = SafeParcelReader.readInt(parcel, readHeader2);
                            break;
                        case 10:
                            str7 = SafeParcelReader.createString(parcel, readHeader2);
                            break;
                        case 11:
                            str8 = SafeParcelReader.createString(parcel, readHeader2);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, readHeader2);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader2);
                return new y4.a(str, str2, str3, str4, z9, str5, z10, str6, i, str7, str8);
            case 21:
                int validateObjectHeader3 = SafeParcelReader.validateObjectHeader(parcel);
                String str9 = null;
                while (parcel.dataPosition() < validateObjectHeader3) {
                    int readHeader3 = SafeParcelReader.readHeader(parcel);
                    if (SafeParcelReader.getFieldId(readHeader3) != 1) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader3);
                    } else {
                        str9 = SafeParcelReader.createString(parcel, readHeader3);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader3);
                return new y4.m(str9);
            case 22:
                int validateObjectHeader4 = SafeParcelReader.validateObjectHeader(parcel);
                String str10 = null;
                String str11 = null;
                while (parcel.dataPosition() < validateObjectHeader4) {
                    int readHeader4 = SafeParcelReader.readHeader(parcel);
                    int fieldId = SafeParcelReader.getFieldId(readHeader4);
                    if (fieldId == 1) {
                        str10 = SafeParcelReader.createString(parcel, readHeader4);
                    } else if (fieldId != 2) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader4);
                    } else {
                        str11 = SafeParcelReader.createString(parcel, readHeader4);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader4);
                return new y4.n(str10, str11);
            case 23:
                int validateObjectHeader5 = SafeParcelReader.validateObjectHeader(parcel);
                String str12 = null;
                String str13 = null;
                String str14 = null;
                while (parcel.dataPosition() < validateObjectHeader5) {
                    int readHeader5 = SafeParcelReader.readHeader(parcel);
                    int fieldId2 = SafeParcelReader.getFieldId(readHeader5);
                    if (fieldId2 == 1) {
                        str12 = SafeParcelReader.createString(parcel, readHeader5);
                    } else if (fieldId2 == 2) {
                        str13 = SafeParcelReader.createString(parcel, readHeader5);
                    } else if (fieldId2 != 3) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader5);
                    } else {
                        str14 = SafeParcelReader.createString(parcel, readHeader5);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader5);
                return new y4.e0(str12, str13, str14);
            case 24:
                int validateObjectHeader6 = SafeParcelReader.validateObjectHeader(parcel);
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                boolean z11 = false;
                while (parcel.dataPosition() < validateObjectHeader6) {
                    int readHeader6 = SafeParcelReader.readHeader(parcel);
                    int fieldId3 = SafeParcelReader.getFieldId(readHeader6);
                    if (fieldId3 == 1) {
                        str15 = SafeParcelReader.createString(parcel, readHeader6);
                    } else if (fieldId3 == 2) {
                        str16 = SafeParcelReader.createString(parcel, readHeader6);
                    } else if (fieldId3 == 4) {
                        str17 = SafeParcelReader.createString(parcel, readHeader6);
                    } else if (fieldId3 == 5) {
                        z11 = SafeParcelReader.readBoolean(parcel, readHeader6);
                    } else if (fieldId3 != 6) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader6);
                    } else {
                        str18 = SafeParcelReader.createString(parcel, readHeader6);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader6);
                return new y4.s(str15, str16, str17, str18, z11);
            case 25:
                int validateObjectHeader7 = SafeParcelReader.validateObjectHeader(parcel);
                String str19 = null;
                String str20 = null;
                String str21 = null;
                long j = 0;
                while (parcel.dataPosition() < validateObjectHeader7) {
                    int readHeader7 = SafeParcelReader.readHeader(parcel);
                    int fieldId4 = SafeParcelReader.getFieldId(readHeader7);
                    if (fieldId4 == 1) {
                        str19 = SafeParcelReader.createString(parcel, readHeader7);
                    } else if (fieldId4 == 2) {
                        str20 = SafeParcelReader.createString(parcel, readHeader7);
                    } else if (fieldId4 == 3) {
                        j = SafeParcelReader.readLong(parcel, readHeader7);
                    } else if (fieldId4 != 4) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader7);
                    } else {
                        str21 = SafeParcelReader.createString(parcel, readHeader7);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader7);
                return new y4.w(j, str19, str20, str21);
            case 26:
                int validateObjectHeader8 = SafeParcelReader.validateObjectHeader(parcel);
                String str22 = null;
                while (parcel.dataPosition() < validateObjectHeader8) {
                    int readHeader8 = SafeParcelReader.readHeader(parcel);
                    if (SafeParcelReader.getFieldId(readHeader8) != 1) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader8);
                    } else {
                        str22 = SafeParcelReader.createString(parcel, readHeader8);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader8);
                return new y4.x(str22);
            case 27:
                int validateObjectHeader9 = SafeParcelReader.validateObjectHeader(parcel);
                String str23 = null;
                String str24 = null;
                zzaiz zzaizVar = null;
                long j8 = 0;
                while (parcel.dataPosition() < validateObjectHeader9) {
                    int readHeader9 = SafeParcelReader.readHeader(parcel);
                    int fieldId5 = SafeParcelReader.getFieldId(readHeader9);
                    if (fieldId5 == 1) {
                        str23 = SafeParcelReader.createString(parcel, readHeader9);
                    } else if (fieldId5 == 2) {
                        str24 = SafeParcelReader.createString(parcel, readHeader9);
                    } else if (fieldId5 == 3) {
                        j8 = SafeParcelReader.readLong(parcel, readHeader9);
                    } else if (fieldId5 != 4) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader9);
                    } else {
                        zzaizVar = (zzaiz) SafeParcelReader.createParcelable(parcel, readHeader9, zzaiz.CREATOR);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader9);
                return new y4.z(str23, str24, j8, zzaizVar);
            case 28:
                int validateObjectHeader10 = SafeParcelReader.validateObjectHeader(parcel);
                String str25 = null;
                String str26 = null;
                while (parcel.dataPosition() < validateObjectHeader10) {
                    int readHeader10 = SafeParcelReader.readHeader(parcel);
                    int fieldId6 = SafeParcelReader.getFieldId(readHeader10);
                    if (fieldId6 == 1) {
                        str25 = SafeParcelReader.createString(parcel, readHeader10);
                    } else if (fieldId6 != 2) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader10);
                    } else {
                        str26 = SafeParcelReader.createString(parcel, readHeader10);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader10);
                return new y4.a0(str25, str26);
            default:
                int validateObjectHeader11 = SafeParcelReader.validateObjectHeader(parcel);
                boolean z12 = false;
                String str27 = null;
                String str28 = null;
                boolean z13 = false;
                while (parcel.dataPosition() < validateObjectHeader11) {
                    int readHeader11 = SafeParcelReader.readHeader(parcel);
                    int fieldId7 = SafeParcelReader.getFieldId(readHeader11);
                    if (fieldId7 == 2) {
                        str27 = SafeParcelReader.createString(parcel, readHeader11);
                    } else if (fieldId7 == 3) {
                        str28 = SafeParcelReader.createString(parcel, readHeader11);
                    } else if (fieldId7 == 4) {
                        z12 = SafeParcelReader.readBoolean(parcel, readHeader11);
                    } else if (fieldId7 != 5) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader11);
                    } else {
                        z13 = SafeParcelReader.readBoolean(parcel, readHeader11);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader11);
                ?? abstractSafeParcelable = new AbstractSafeParcelable();
                abstractSafeParcelable.f6844a = str27;
                abstractSafeParcelable.f6845b = str28;
                abstractSafeParcelable.f6846c = z12;
                abstractSafeParcelable.f6847d = z13;
                abstractSafeParcelable.f6848e = TextUtils.isEmpty(str28) ? null : Uri.parse(str28);
                return abstractSafeParcelable;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f549a) {
            case 0:
                return new a0[i];
            case 1:
                return new q1[i];
            case 2:
                return new r1[i];
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                return new androidx.fragment.app.b[i];
            case 4:
                return new androidx.fragment.app.c[i];
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                return new androidx.fragment.app.y0[i];
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                return new androidx.fragment.app.d1[i];
            case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                return new androidx.fragment.app.h1[i];
            case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                return new com.google.android.material.datepicker.b[i];
            case 9:
                return new com.google.android.material.datepicker.d[i];
            case 10:
                return new com.google.android.material.datepicker.s[i];
            case 11:
                return new e.a[i];
            case 12:
                return new e.k[i];
            case 13:
                return new ParcelImpl[i];
            case 14:
                return new h4.a[i];
            case 15:
                return new j6.q[i];
            case 16:
                return new k3.b[i];
            case 17:
                return new n.p0[i];
            case 18:
                return new t0.g[i];
            case 19:
                return new x3.d[i];
            case 20:
                return new y4.a[i];
            case 21:
                return new y4.m[i];
            case 22:
                return new y4.n[i];
            case 23:
                return new y4.e0[i];
            case 24:
                return new y4.s[i];
            case 25:
                return new y4.w[i];
            case 26:
                return new y4.x[i];
            case 27:
                return new y4.z[i];
            case 28:
                return new y4.a0[i];
            default:
                return new y4.c0[i];
        }
    }
}
