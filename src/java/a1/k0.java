package a1;

import java.io.File;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class k0 extends kotlin.jvm.internal.k implements u7.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f119a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f120b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(Object obj, int i) {
        super(0);
        this.f119a = i;
        this.f120b = obj;
    }

    @Override // u7.a
    public final Object invoke() {
        switch (this.f119a) {
            case 0:
                Object obj = l0.f134e;
                File file = (File) this.f120b;
                synchronized (obj) {
                    l0.f133d.remove(file.getAbsolutePath());
                }
                return h7.l.f2236a;
            case 1:
                ((d8.p0) this.f120b).a();
                return h7.l.f2236a;
            default:
                File file2 = (File) ((c1.a) this.f120b).invoke();
                String name = file2.getName();
                kotlin.jvm.internal.j.d(name, "getName(...)");
                String str = "";
                int z0 = b8.i.z0(name, '.', 0, 6);
                if (z0 != -1) {
                    str = name.substring(z0 + 1, name.length());
                    kotlin.jvm.internal.j.d(str, "substring(...)");
                }
                if (str.equals("preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    kotlin.jvm.internal.j.d(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }
}
