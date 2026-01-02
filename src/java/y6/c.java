package y6;

import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6906a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final List f6907b;

    public c(List list) {
        this.f6907b = list;
    }

    public static String a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f9, code lost:
        if (y6.i.g(r0[0]) != java.lang.String.class) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public y6.p b(d7.a r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.c.b(d7.a, boolean):y6.p");
    }

    public String toString() {
        switch (this.f6906a) {
            case 0:
                return Collections.EMPTY_MAP.toString();
            default:
                return super.toString();
        }
    }

    public c() {
        Map map = Collections.EMPTY_MAP;
        this.f6907b = Collections.EMPTY_LIST;
    }
}
