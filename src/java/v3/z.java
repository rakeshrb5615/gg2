package v3;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public float f6283a;

    /* renamed from: b  reason: collision with root package name */
    public float f6284b;

    /* renamed from: c  reason: collision with root package name */
    public float f6285c;

    /* renamed from: d  reason: collision with root package name */
    public float f6286d;

    /* renamed from: e  reason: collision with root package name */
    public float f6287e;

    /* renamed from: f  reason: collision with root package name */
    public float f6288f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f6289g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f6290h = new ArrayList();

    public z() {
        d(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public final void a(float f9) {
        float f10 = this.f6287e;
        if (f10 == f9) {
            return;
        }
        float f11 = ((f9 - f10) + 360.0f) % 360.0f;
        if (f11 > 180.0f) {
            return;
        }
        float f12 = this.f6285c;
        float f13 = this.f6286d;
        v vVar = new v(f12, f13, f12, f13);
        vVar.f6276f = this.f6287e;
        vVar.f6277g = f11;
        this.f6290h.add(new t(vVar));
        this.f6287e = f9;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f6289g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((x) arrayList.get(i)).a(matrix, path);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [v3.w, v3.x, java.lang.Object] */
    public final void c(float f9, float f10) {
        ?? xVar = new x();
        xVar.f6278b = f9;
        xVar.f6279c = f10;
        this.f6289g.add(xVar);
        u uVar = new u(xVar, this.f6285c, this.f6286d);
        a(uVar.b() + 270.0f);
        this.f6290h.add(uVar);
        this.f6287e = uVar.b() + 270.0f;
        this.f6285c = f9;
        this.f6286d = f10;
    }

    public final void d(float f9, float f10, float f11, float f12) {
        this.f6283a = f9;
        this.f6284b = f10;
        this.f6285c = f9;
        this.f6286d = f10;
        this.f6287e = f11;
        this.f6288f = (f11 + f12) % 360.0f;
        this.f6289g.clear();
        this.f6290h.clear();
    }
}
