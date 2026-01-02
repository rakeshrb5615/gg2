package h;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class g0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final View f2043a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2044b;

    /* renamed from: c  reason: collision with root package name */
    public Method f2045c;

    /* renamed from: d  reason: collision with root package name */
    public Context f2046d;

    public g0(View view, String str) {
        this.f2043a = view;
        this.f2044b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id;
        String str;
        Method method;
        if (this.f2045c == null) {
            View view2 = this.f2043a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f2044b;
                if (context == null) {
                    if (view2.getId() == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder q = v1.a.q("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    q.append(view2.getClass());
                    q.append(str);
                    throw new IllegalStateException(q.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f2045c = method;
                        this.f2046d = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f2045c.invoke(this.f2046d, view);
        } catch (IllegalAccessException e9) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e9);
        } catch (InvocationTargetException e10) {
            throw new IllegalStateException("Could not execute method for android:onClick", e10);
        }
    }
}
