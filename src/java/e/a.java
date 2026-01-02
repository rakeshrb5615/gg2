package e;

import a2.z;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new z(11);

    /* renamed from: a  reason: collision with root package name */
    public final int f1270a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f1271b;

    public a(int i, Intent intent) {
        this.f1270a = i;
        this.f1271b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f1270a;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f1271b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.j.e(parcel, "dest");
        parcel.writeInt(this.f1270a);
        Intent intent = this.f1271b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
