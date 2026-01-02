package z6;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class v implements w6.a0 {

    /* renamed from: a  reason: collision with root package name */
    public final y6.c f7454a;

    /* renamed from: b  reason: collision with root package name */
    public final w6.h f7455b;

    /* renamed from: c  reason: collision with root package name */
    public final y6.e f7456c;

    /* renamed from: d  reason: collision with root package name */
    public final k f7457d;

    /* renamed from: e  reason: collision with root package name */
    public final List f7458e;

    public v(y6.c cVar, w6.h hVar, y6.e eVar, k kVar) {
        List list = Collections.EMPTY_LIST;
        this.f7454a = cVar;
        this.f7455b = hVar;
        this.f7456c = eVar;
        this.f7457d = kVar;
        this.f7458e = list;
    }

    public static void b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + b7.c.c(field) + " and " + b7.c.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    @Override // w6.a0
    public final w6.z a(w6.m mVar, d7.a aVar) {
        Class cls = aVar.f1153a;
        if (Object.class.isAssignableFrom(cls)) {
            q4.b bVar = b7.c.f765a;
            if (Modifier.isStatic(cls.getModifiers()) || !(cls.isAnonymousClass() || cls.isLocalClass())) {
                List list = Collections.EMPTY_LIST;
                y6.i.e();
                return b7.c.f765a.E(cls) ? new u(cls, c(mVar, aVar, cls, true)) : new s(this.f7454a.b(aVar, true), c(mVar, aVar, cls, false));
            }
            return new w6.j(2);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0168  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r29v0, types: [z6.v] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final z6.t c(w6.m r30, d7.a r31, java.lang.Class r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.v.c(w6.m, d7.a, java.lang.Class, boolean):z6.t");
    }

    public final boolean d(Field field, boolean z9) {
        boolean z10;
        y6.e eVar = this.f7456c;
        eVar.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || eVar.b(field.getType(), z9)) {
            z10 = true;
        } else {
            List list = z9 ? eVar.f6915a : eVar.f6916b;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw v1.a.e(it);
                }
            }
            z10 = false;
        }
        return !z10;
    }
}
