package y4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class s extends c implements Cloneable {
    public static final Parcelable.Creator<s> CREATOR = new a2.z(24);

    /* renamed from: a  reason: collision with root package name */
    public final String f6888a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6889b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6890c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6891d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6892e;

    public s(String str, String str2, String str3, String str4, boolean z9) {
        Preconditions.checkArgument(((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) ? false : true, "Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.");
        this.f6888a = str;
        this.f6889b = str2;
        this.f6890c = str3;
        this.f6891d = z9;
        this.f6892e = str4;
    }

    public final Object clone() {
        boolean z9 = this.f6891d;
        return new s(this.f6888a, this.f6889b, this.f6890c, this.f6892e, z9);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f6888a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f6889b, false);
        SafeParcelWriter.writeString(parcel, 4, this.f6890c, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f6891d);
        SafeParcelWriter.writeString(parcel, 6, this.f6892e, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // y4.c
    public final String x() {
        return "phone";
    }
}
