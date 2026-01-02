package i1;

import android.text.Editable;
import g1.t;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class a extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f2255a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile a f2256b;

    /* renamed from: c  reason: collision with root package name */
    public static Class f2257c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f2257c;
        return cls != null ? new t(cls, charSequence) : super.newEditable(charSequence);
    }
}
