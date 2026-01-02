package y4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.firebase-auth-api.zzajb;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class f0 implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6863a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f6863a) {
            case 0:
                int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader) {
                    int readHeader = SafeParcelReader.readHeader(parcel);
                    SafeParcelReader.getFieldId(readHeader);
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
                return new AbstractSafeParcelable();
            case 1:
                int validateObjectHeader2 = SafeParcelReader.validateObjectHeader(parcel);
                String str = null;
                String str2 = null;
                String str3 = null;
                zzajb zzajbVar = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
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
                            zzajbVar = (zzajb) SafeParcelReader.createParcelable(parcel, readHeader2, zzajb.CREATOR);
                            break;
                        case d1.h.STRING_FIELD_NUMBER /* 5 */:
                            str4 = SafeParcelReader.createString(parcel, readHeader2);
                            break;
                        case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                            str5 = SafeParcelReader.createString(parcel, readHeader2);
                            break;
                        case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                            str6 = SafeParcelReader.createString(parcel, readHeader2);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, readHeader2);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader2);
                return new g0(str, str2, str3, zzajbVar, str4, str5, str6);
            case 2:
                int validateObjectHeader3 = SafeParcelReader.validateObjectHeader(parcel);
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                boolean z9 = false;
                while (parcel.dataPosition() < validateObjectHeader3) {
                    int readHeader3 = SafeParcelReader.readHeader(parcel);
                    int fieldId = SafeParcelReader.getFieldId(readHeader3);
                    if (fieldId == 1) {
                        str7 = SafeParcelReader.createString(parcel, readHeader3);
                    } else if (fieldId == 2) {
                        str8 = SafeParcelReader.createString(parcel, readHeader3);
                    } else if (fieldId == 3) {
                        str9 = SafeParcelReader.createString(parcel, readHeader3);
                    } else if (fieldId == 4) {
                        str10 = SafeParcelReader.createString(parcel, readHeader3);
                    } else if (fieldId != 5) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader3);
                    } else {
                        z9 = SafeParcelReader.readBoolean(parcel, readHeader3);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader3);
                return new d(str7, str8, str9, str10, z9);
            default:
                int validateObjectHeader4 = SafeParcelReader.validateObjectHeader(parcel);
                String str11 = null;
                while (parcel.dataPosition() < validateObjectHeader4) {
                    int readHeader4 = SafeParcelReader.readHeader(parcel);
                    if (SafeParcelReader.getFieldId(readHeader4) != 1) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader4);
                    } else {
                        str11 = SafeParcelReader.createString(parcel, readHeader4);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader4);
                return new e(str11);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f6863a) {
            case 0:
                return new t[i];
            case 1:
                return new g0[i];
            case 2:
                return new d[i];
            default:
                return new e[i];
        }
    }
}
