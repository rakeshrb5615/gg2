package n7;

import h7.l;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class a implements l7.c, d, Serializable {
    private final l7.c<Object> completion;

    public a(l7.c cVar) {
        this.completion = cVar;
    }

    public l7.c<l> create(l7.c<?> cVar) {
        j.e(cVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        l7.c<Object> cVar = this.completion;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    public final l7.c<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar != null && eVar.v() >= 1) {
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                i = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                i = -1;
            }
            int i9 = i >= 0 ? eVar.l()[i] : -1;
            b8.g gVar = f.f4971b;
            b8.g gVar2 = f.f4970a;
            if (gVar == null) {
                try {
                    b8.g gVar3 = new b8.g(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 9);
                    f.f4971b = gVar3;
                    gVar = gVar3;
                } catch (Exception unused2) {
                    f.f4971b = gVar2;
                    gVar = gVar2;
                }
            }
            if (gVar != gVar2 && (method = (Method) gVar.f789b) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = (Method) gVar.f790c) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
                Method method3 = (Method) gVar.f791d;
                Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
                if (invoke3 instanceof String) {
                    str2 = invoke3;
                }
            }
            if (str2 == null) {
                str = eVar.c();
            } else {
                str = str2 + '/' + eVar.c();
            }
            return new StackTraceElement(str, eVar.m(), eVar.f(), i9);
        }
        return null;
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l7.c
    public final void resumeWith(Object obj) {
        l7.c cVar = this;
        while (true) {
            a aVar = (a) cVar;
            l7.c cVar2 = aVar.completion;
            j.b(cVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == m7.a.f4049a) {
                    return;
                }
            } catch (Throwable th) {
                obj = c4.b.p(th);
            }
            aVar.releaseIntercepted();
            if (!(cVar2 instanceof a)) {
                cVar2.resumeWith(obj);
                return;
            }
            cVar = cVar2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public l7.c<l> create(Object obj, l7.c<?> cVar) {
        j.e(cVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
