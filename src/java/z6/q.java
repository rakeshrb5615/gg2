package z6;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final String f7431a;

    /* renamed from: b  reason: collision with root package name */
    public final Field f7432b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7433c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Method f7434d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ w6.z f7435e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ w6.z f7436f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f7437g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ boolean f7438h;

    public q(String str, Field field, Method method, w6.z zVar, w6.z zVar2, boolean z9, boolean z10) {
        this.f7434d = method;
        this.f7435e = zVar;
        this.f7436f = zVar2;
        this.f7437g = z9;
        this.f7438h = z10;
        this.f7431a = str;
        this.f7432b = field;
        this.f7433c = field.getName();
    }

    public final void a(e7.b bVar, Object obj) {
        Object obj2;
        Method method = this.f7434d;
        if (method != null) {
            try {
                obj2 = method.invoke(obj, null);
            } catch (InvocationTargetException e9) {
                throw new RuntimeException(v1.a.l("Accessor ", b7.c.d(method, false), " threw exception"), e9.getCause());
            }
        } else {
            obj2 = this.f7432b.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        bVar.z(this.f7431a);
        this.f7435e.c(bVar, obj2);
    }
}
