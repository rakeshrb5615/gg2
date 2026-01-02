package y4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.firebase-auth-api.zzac;
import com.google.android.gms.internal.firebase-auth-api.zzajb;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class g0 extends r {
    public static final Parcelable.Creator<g0> CREATOR = new f0(1);

    /* renamed from: a  reason: collision with root package name */
    public final String f6866a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6867b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6868c;

    /* renamed from: d  reason: collision with root package name */
    public final zzajb f6869d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6870e;

    /* renamed from: f  reason: collision with root package name */
    public final String f6871f;

    /* renamed from: m  reason: collision with root package name */
    public final String f6872m;

    public g0(String str, String str2, String str3, zzajb zzajbVar, String str4, String str5, String str6) {
        this.f6866a = zzac.zzb(str);
        this.f6867b = str2;
        this.f6868c = str3;
        this.f6869d = zzajbVar;
        this.f6870e = str4;
        this.f6871f = str5;
        this.f6872m = str6;
    }

    public static g0 z(zzajb zzajbVar) {
        Preconditions.checkNotNull(zzajbVar, "Must specify a non-null webSignInCredential");
        return new g0(null, null, null, zzajbVar, null, null, null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f6866a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f6867b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f6868c, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f6869d, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.f6870e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f6871f, false);
        SafeParcelWriter.writeString(parcel, 7, this.f6872m, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // y4.c
    public final String x() {
        return this.f6866a;
    }

    public final c y() {
        return new g0(this.f6866a, this.f6867b, this.f6868c, this.f6869d, this.f6870e, this.f6871f, this.f6872m);
    }
}
