package e;

import a2.z;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new z(12);

    /* renamed from: a  reason: collision with root package name */
    public final IntentSender f1292a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f1293b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1294c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1295d;

    public k(IntentSender intentSender, Intent intent, int i, int i9) {
        kotlin.jvm.internal.j.e(intentSender, "intentSender");
        this.f1292a = intentSender;
        this.f1293b = intent;
        this.f1294c = i;
        this.f1295d = i9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.j.e(parcel, "dest");
        parcel.writeParcelable(this.f1292a, i);
        parcel.writeParcelable(this.f1293b, i);
        parcel.writeInt(this.f1294c);
        parcel.writeInt(this.f1295d);
    }
}
