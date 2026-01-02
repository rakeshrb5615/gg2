package y6;

import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import w6.a0;
import w6.z;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class e implements a0, Cloneable {

    /* renamed from: c  reason: collision with root package name */
    public static final e f6914c = new e();

    /* renamed from: a  reason: collision with root package name */
    public final List f6915a;

    /* renamed from: b  reason: collision with root package name */
    public final List f6916b;

    public e() {
        List list = Collections.EMPTY_LIST;
        this.f6915a = list;
        this.f6916b = list;
    }

    @Override // w6.a0
    public final z a(w6.m mVar, d7.a aVar) {
        Class cls = aVar.f1153a;
        boolean b10 = b(cls, true);
        boolean b11 = b(cls, false);
        if (b10 || b11) {
            return new d(this, b11, b10, mVar, aVar);
        }
        return null;
    }

    public final boolean b(Class cls, boolean z9) {
        if (!z9 && !Enum.class.isAssignableFrom(cls)) {
            q4.b bVar = b7.c.f765a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z9 ? this.f6915a : this.f6916b).iterator();
        if (it.hasNext()) {
            throw v1.a.e(it);
        }
        return false;
    }

    public final Object clone() {
        try {
            return (e) super.clone();
        } catch (CloneNotSupportedException e9) {
            throw new AssertionError(e9);
        }
    }
}
