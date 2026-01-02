package y4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class d extends c {
    public static final Parcelable.Creator<d> CREATOR = new f0(2);

    /* renamed from: a  reason: collision with root package name */
    public final String f6849a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6850b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6851c;

    /* renamed from: d  reason: collision with root package name */
    public String f6852d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6853e;

    public d(String str, String str2, String str3, String str4, boolean z9) {
        this.f6849a = Preconditions.checkNotEmpty(str);
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f6850b = str2;
        this.f6851c = str3;
        this.f6852d = str4;
        this.f6853e = z9;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f6849a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f6850b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f6851c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f6852d, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f6853e);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // y4.c
    public final String x() {
        return "password";
    }
}
