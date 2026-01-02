package q0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public abstract class i1 {

    /* renamed from: a  reason: collision with root package name */
    public final s1 f5136a;

    /* renamed from: b  reason: collision with root package name */
    public h0.b[] f5137b;

    public i1() {
        this(new s1());
    }

    public final void a() {
        h0.b[] bVarArr = this.f5137b;
        if (bVarArr != null) {
            h0.b bVar = bVarArr[0];
            h0.b bVar2 = bVarArr[1];
            s1 s1Var = this.f5136a;
            if (bVar2 == null) {
                bVar2 = s1Var.f5183a.f(2);
            }
            if (bVar == null) {
                bVar = s1Var.f5183a.f(1);
            }
            g(h0.b.a(bVar, bVar2));
            h0.b bVar3 = this.f5137b[q4.b.B(16)];
            if (bVar3 != null) {
                f(bVar3);
            }
            h0.b bVar4 = this.f5137b[q4.b.B(32)];
            if (bVar4 != null) {
                d(bVar4);
            }
            h0.b bVar5 = this.f5137b[q4.b.B(64)];
            if (bVar5 != null) {
                h(bVar5);
            }
        }
    }

    public abstract s1 b();

    public void c(int i, h0.b bVar) {
        if (this.f5137b == null) {
            this.f5137b = new h0.b[10];
        }
        for (int i9 = 1; i9 <= 512; i9 <<= 1) {
            if ((i & i9) != 0) {
                this.f5137b[q4.b.B(i9)] = bVar;
            }
        }
    }

    public void d(h0.b bVar) {
    }

    public abstract void e(h0.b bVar);

    public void f(h0.b bVar) {
    }

    public abstract void g(h0.b bVar);

    public void h(h0.b bVar) {
    }

    public i1(s1 s1Var) {
        this.f5136a = s1Var;
    }
}
