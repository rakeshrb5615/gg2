package a6;

import a5.u;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.SystemClock;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentRegistrar;
import j5.t1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import m.m;
import m.x;
import v3.p;
import x8.y;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class e implements a3.a, SuccessContinuation, x, q0.x, t2.b, y1.b {
    /* JADX WARN: Type inference failed for: r6v2, types: [a6.e, java.lang.Object] */
    public static e c(Context context, int i) {
        p0.e.b("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, c3.a.f884n);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        t1.v(context, obtainStyledAttributes, 4);
        t1.v(context, obtainStyledAttributes, 9);
        t1.v(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        p.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new v3.a(0)).a();
        obtainStyledAttributes.recycle();
        ?? obj = new Object();
        p0.e.c(rect.left);
        p0.e.c(rect.top);
        p0.e.c(rect.right);
        p0.e.c(rect.bottom);
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, x8.g] */
    public static y d(String str) {
        kotlin.jvm.internal.j.e(str, "<this>");
        x8.j jVar = y8.c.f6975a;
        ?? obj = new Object();
        obj.S(str);
        return y8.c.d(obj, false);
    }

    public static Path e(float f9, float f10, float f11, float f12) {
        Path path = new Path();
        path.moveTo(f9, f10);
        path.lineTo(f11, f12);
        return path;
    }

    @Override // m.x
    public void a(m mVar, boolean z9) {
    }

    @Override // a3.a
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    public List f(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (a5.c cVar : componentRegistrar.getComponents()) {
            String str = cVar.f569a;
            if (str != null) {
                cVar = new a5.c(str, cVar.f570b, cVar.f571c, cVar.f572d, cVar.f573e, new u(9, str, cVar), cVar.f575g);
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }

    @Override // g7.a
    public Object get() {
        return new m0.f(Executors.newSingleThreadExecutor(), 3);
    }

    @Override // m.x
    public boolean h(m mVar) {
        return false;
    }

    @Override // y1.b
    public void i() {
    }

    @Override // y1.b
    public void j(int i, Object obj) {
    }

    @Override // q0.x
    public void onScrollLimit(int i, int i9, int i10, boolean z9) {
    }

    @Override // q0.x
    public void onScrollProgress(int i, int i9, int i10, int i11) {
    }

    public Task then(Object obj) {
        Void r12 = (Void) obj;
        return Tasks.forResult(Boolean.TRUE);
    }
}
