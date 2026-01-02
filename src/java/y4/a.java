package y4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class a extends AbstractSafeParcelable {
    public static final Parcelable.Creator<a> CREATOR = new a2.z(20);

    /* renamed from: a  reason: collision with root package name */
    public final String f6829a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6830b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6831c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6832d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6833e;

    /* renamed from: f  reason: collision with root package name */
    public final String f6834f;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f6835m;

    /* renamed from: n  reason: collision with root package name */
    public final String f6836n;

    /* renamed from: o  reason: collision with root package name */
    public int f6837o;

    /* renamed from: p  reason: collision with root package name */
    public final String f6838p;
    public final String q;

    public a(String str, String str2, String str3, String str4, boolean z9, String str5, boolean z10, String str6, int i, String str7, String str8) {
        this.f6829a = str;
        this.f6830b = str2;
        this.f6831c = str3;
        this.f6832d = str4;
        this.f6833e = z9;
        this.f6834f = str5;
        this.f6835m = z10;
        this.f6836n = str6;
        this.f6837o = i;
        this.f6838p = str7;
        this.q = str8;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f6829a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f6830b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f6831c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f6832d, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f6833e);
        SafeParcelWriter.writeString(parcel, 6, this.f6834f, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f6835m);
        SafeParcelWriter.writeString(parcel, 8, this.f6836n, false);
        SafeParcelWriter.writeInt(parcel, 9, this.f6837o);
        SafeParcelWriter.writeString(parcel, 10, this.f6838p, false);
        SafeParcelWriter.writeString(parcel, 11, this.q, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
