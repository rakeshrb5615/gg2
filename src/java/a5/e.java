package a5;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final /* synthetic */ class e implements c6.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f576a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f577b;

    public /* synthetic */ e(Object obj, int i) {
        this.f576a = i;
        this.f577b = obj;
    }

    @Override // c6.b
    public final Object get() {
        switch (this.f576a) {
            case 0:
                String str = (String) this.f577b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new RuntimeException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e9) {
                    throw new RuntimeException(v1.a.l("Could not instantiate ", str, "."), e9);
                } catch (InstantiationException e10) {
                    throw new RuntimeException(v1.a.l("Could not instantiate ", str, "."), e10);
                } catch (NoSuchMethodException e11) {
                    throw new RuntimeException(g2.g.l("Could not instantiate ", str), e11);
                } catch (InvocationTargetException e12) {
                    throw new RuntimeException(g2.g.l("Could not instantiate ", str), e12);
                }
            case 1:
                return (ComponentRegistrar) this.f577b;
            default:
                return new e6.c((q4.f) this.f577b);
        }
    }
}
