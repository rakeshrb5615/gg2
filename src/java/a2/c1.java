package a2;

import android.os.Parcel;
import android.os.Parcelable;
import n.d3;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class c1 implements Parcelable.ClassLoaderCreator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f291a;

    public /* synthetic */ c1(int i) {
        this.f291a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f291a) {
            case 0:
                return new d1(parcel, classLoader);
            case 1:
                return new androidx.fragment.app.d0(parcel, classLoader);
            case 2:
                return new b0.f(parcel, classLoader);
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                return new h3.d(parcel, classLoader);
            case 4:
                return new i3.c(parcel, classLoader);
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                return new d3(parcel, classLoader);
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                return new q3.a(parcel, classLoader);
            case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                return new w3.d(parcel, classLoader);
            case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                if (parcel.readParcelable(classLoader) == null) {
                    return x0.b.f6539b;
                }
                throw new IllegalStateException("superState must be null");
            default:
                return new z3.a0(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f291a) {
            case 0:
                return new d1[i];
            case 1:
                return new androidx.fragment.app.d0[i];
            case 2:
                return new b0.f[i];
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                return new h3.d[i];
            case 4:
                return new i3.c[i];
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                return new d3[i];
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                return new q3.a[i];
            case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                return new w3.d[i];
            case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                return new x0.b[i];
            default:
                return new z3.a0[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f291a) {
            case 0:
                return new d1(parcel, null);
            case 1:
                return new androidx.fragment.app.d0(parcel, (ClassLoader) null);
            case 2:
                return new b0.f(parcel, null);
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                return new h3.d(parcel, null);
            case 4:
                return new i3.c(parcel, null);
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                return new d3(parcel, null);
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                return new q3.a(parcel, null);
            case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                return new w3.d(parcel, null);
            case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                if (parcel.readParcelable(null) == null) {
                    return x0.b.f6539b;
                }
                throw new IllegalStateException("superState must be null");
            default:
                return new z3.a0(parcel, null);
        }
    }
}
