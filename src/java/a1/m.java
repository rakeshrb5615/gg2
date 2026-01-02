package a1;

import java.io.File;
import java.util.LinkedHashSet;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class m extends kotlin.jvm.internal.k implements u7.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f139a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g0 f140b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(g0 g0Var, int i) {
        super(0);
        this.f139a = i;
        this.f140b = g0Var;
    }

    @Override // u7.a
    public final Object invoke() {
        switch (this.f139a) {
            case 0:
                return ((o0) this.f140b.j.getValue()).f164c;
            default:
                l0 l0Var = this.f140b.f72a;
                File canonicalFile = ((File) l0Var.f137c.invoke()).getCanonicalFile();
                synchronized (l0.f134e) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = l0.f133d;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    kotlin.jvm.internal.j.d(absolutePath, "path");
                    linkedHashSet.add(absolutePath);
                }
                return new o0(canonicalFile, l0Var.f135a, (s0) l0Var.f136b.invoke(canonicalFile), new k0(canonicalFile, 0));
        }
    }
}
