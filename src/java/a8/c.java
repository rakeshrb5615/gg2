package a8;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public final f f655a;

    /* renamed from: b  reason: collision with root package name */
    public final int f656b;

    public c(f fVar, int i) {
        kotlin.jvm.internal.j.e(fVar, "sequence");
        this.f655a = fVar;
        this.f656b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // a8.f
    public final Iterator iterator() {
        return new b(this);
    }
}
