package q0;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public class p1 {

    /* renamed from: b  reason: collision with root package name */
    public static final s1 f5165b;

    /* renamed from: a  reason: collision with root package name */
    public final s1 f5166a;

    static {
        int i = Build.VERSION.SDK_INT;
        f5165b = (i >= 34 ? new h1() : i >= 30 ? new g1() : i >= 29 ? new f1() : new d1()).b().f5183a.a().f5183a.b().f5183a.c();
    }

    public p1(s1 s1Var) {
        this.f5166a = s1Var;
    }

    public s1 a() {
        return this.f5166a;
    }

    public s1 b() {
        return this.f5166a;
    }

    public s1 c() {
        return this.f5166a;
    }

    public void d(View view) {
    }

    public j e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            return n() == p1Var.n() && m() == p1Var.m() && Objects.equals(j(), p1Var.j()) && Objects.equals(h(), p1Var.h()) && Objects.equals(e(), p1Var.e());
        }
        return false;
    }

    public h0.b f(int i) {
        return h0.b.f2124e;
    }

    public h0.b g() {
        return j();
    }

    public h0.b h() {
        return h0.b.f2124e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public h0.b i() {
        return j();
    }

    public h0.b j() {
        return h0.b.f2124e;
    }

    public h0.b k() {
        return j();
    }

    public s1 l(int i, int i9, int i10, int i11) {
        return f5165b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void o(h0.b[] bVarArr) {
    }

    public void p(s1 s1Var) {
    }

    public void q(h0.b bVar) {
    }

    public void r(int i) {
    }
}
