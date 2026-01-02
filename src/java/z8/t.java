package z8;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7570a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f7571b;

    /* renamed from: c  reason: collision with root package name */
    public final List f7572c;

    public t(Object obj, Method method, ArrayList arrayList) {
        this.f7570a = obj;
        this.f7571b = method;
        this.f7572c = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", j2.h.class.getName(), this.f7571b.getName(), this.f7572c);
    }
}
