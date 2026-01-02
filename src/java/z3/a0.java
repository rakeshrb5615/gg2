package z3;

import a2.c1;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class a0 extends x0.b {
    public static final Parcelable.Creator<a0> CREATOR = new c1(9);

    /* renamed from: c  reason: collision with root package name */
    public CharSequence f7188c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7189d;

    public a0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f7188c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f7189d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f7188c) + "}";
    }

    @Override // x0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f7188c, parcel, i);
        parcel.writeInt(this.f7189d ? 1 : 0);
    }
}
