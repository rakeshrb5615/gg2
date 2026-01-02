package z;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public int f7101a;

    /* renamed from: b  reason: collision with root package name */
    public final l f7102b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7103c;

    /* renamed from: d  reason: collision with root package name */
    public final j f7104d;

    /* renamed from: e  reason: collision with root package name */
    public final m f7105e;

    /* renamed from: f  reason: collision with root package name */
    public HashMap f7106f;

    /* JADX WARN: Type inference failed for: r0v0, types: [z.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [z.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [z.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [z.m, java.lang.Object] */
    public i() {
        ?? obj = new Object();
        obj.f7152a = 0;
        obj.f7153b = 0;
        obj.f7154c = 1.0f;
        obj.f7155d = Float.NaN;
        this.f7102b = obj;
        ?? obj2 = new Object();
        obj2.f7144a = -1;
        obj2.f7145b = 0;
        obj2.f7146c = -1;
        obj2.f7147d = Float.NaN;
        obj2.f7148e = Float.NaN;
        obj2.f7149f = Float.NaN;
        obj2.f7150g = -1;
        obj2.f7151h = null;
        obj2.i = -1;
        this.f7103c = obj2;
        ?? obj3 = new Object();
        obj3.f7108a = false;
        obj3.f7114d = -1;
        obj3.f7116e = -1;
        obj3.f7118f = -1.0f;
        obj3.f7119g = true;
        obj3.f7121h = -1;
        obj3.i = -1;
        obj3.j = -1;
        obj3.f7125k = -1;
        obj3.f7127l = -1;
        obj3.f7128m = -1;
        obj3.f7130n = -1;
        obj3.f7132o = -1;
        obj3.f7134p = -1;
        obj3.q = -1;
        obj3.f7135r = -1;
        obj3.f7136s = -1;
        obj3.f7137t = -1;
        obj3.f7138u = -1;
        obj3.f7139v = -1;
        obj3.f7140w = 0.5f;
        obj3.f7141x = 0.5f;
        obj3.f7142y = null;
        obj3.f7143z = -1;
        obj3.A = 0;
        obj3.B = 0.0f;
        obj3.C = -1;
        obj3.D = -1;
        obj3.E = -1;
        obj3.F = 0;
        obj3.G = 0;
        obj3.H = 0;
        obj3.I = 0;
        obj3.J = 0;
        obj3.K = 0;
        obj3.L = 0;
        obj3.M = Integer.MIN_VALUE;
        obj3.N = Integer.MIN_VALUE;
        obj3.O = Integer.MIN_VALUE;
        obj3.P = Integer.MIN_VALUE;
        obj3.Q = Integer.MIN_VALUE;
        obj3.R = Integer.MIN_VALUE;
        obj3.S = Integer.MIN_VALUE;
        obj3.T = -1.0f;
        obj3.U = -1.0f;
        obj3.V = 0;
        obj3.W = 0;
        obj3.X = 0;
        obj3.Y = 0;
        obj3.Z = 0;
        obj3.f7109a0 = 0;
        obj3.f7111b0 = 0;
        obj3.f7113c0 = 0;
        obj3.f7115d0 = 1.0f;
        obj3.f7117e0 = 1.0f;
        obj3.f0 = -1;
        obj3.f7120g0 = 0;
        obj3.f7122h0 = -1;
        obj3.l0 = false;
        obj3.f7129m0 = false;
        obj3.f7131n0 = true;
        obj3.f7133o0 = 0;
        this.f7104d = obj3;
        ?? obj4 = new Object();
        obj4.f7157a = 0.0f;
        obj4.f7158b = 0.0f;
        obj4.f7159c = 0.0f;
        obj4.f7160d = 1.0f;
        obj4.f7161e = 1.0f;
        obj4.f7162f = Float.NaN;
        obj4.f7163g = Float.NaN;
        obj4.f7164h = -1;
        obj4.i = 0.0f;
        obj4.j = 0.0f;
        obj4.f7165k = 0.0f;
        obj4.f7166l = false;
        obj4.f7167m = 0.0f;
        this.f7105e = obj4;
        this.f7106f = new HashMap();
    }

    public final void a(e eVar) {
        j jVar = this.f7104d;
        eVar.f7049e = jVar.f7121h;
        eVar.f7051f = jVar.i;
        eVar.f7052g = jVar.j;
        eVar.f7054h = jVar.f7125k;
        eVar.i = jVar.f7127l;
        eVar.j = jVar.f7128m;
        eVar.f7058k = jVar.f7130n;
        eVar.f7060l = jVar.f7132o;
        eVar.f7061m = jVar.f7134p;
        eVar.f7063n = jVar.q;
        eVar.f7065o = jVar.f7135r;
        eVar.f7070s = jVar.f7136s;
        eVar.f7071t = jVar.f7137t;
        eVar.f7072u = jVar.f7138u;
        eVar.f7073v = jVar.f7139v;
        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = jVar.F;
        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = jVar.G;
        ((ViewGroup.MarginLayoutParams) eVar).topMargin = jVar.H;
        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = jVar.I;
        eVar.A = jVar.R;
        eVar.B = jVar.Q;
        eVar.f7075x = jVar.N;
        eVar.f7077z = jVar.P;
        eVar.E = jVar.f7140w;
        eVar.F = jVar.f7141x;
        eVar.f7067p = jVar.f7143z;
        eVar.q = jVar.A;
        eVar.f7069r = jVar.B;
        eVar.G = jVar.f7142y;
        eVar.T = jVar.C;
        eVar.U = jVar.D;
        eVar.I = jVar.T;
        eVar.H = jVar.U;
        eVar.K = jVar.W;
        eVar.J = jVar.V;
        eVar.W = jVar.l0;
        eVar.X = jVar.f7129m0;
        eVar.L = jVar.X;
        eVar.M = jVar.Y;
        eVar.P = jVar.Z;
        eVar.Q = jVar.f7109a0;
        eVar.N = jVar.f7111b0;
        eVar.O = jVar.f7113c0;
        eVar.R = jVar.f7115d0;
        eVar.S = jVar.f7117e0;
        eVar.V = jVar.E;
        eVar.f7045c = jVar.f7118f;
        eVar.f7041a = jVar.f7114d;
        eVar.f7043b = jVar.f7116e;
        ((ViewGroup.MarginLayoutParams) eVar).width = jVar.f7110b;
        ((ViewGroup.MarginLayoutParams) eVar).height = jVar.f7112c;
        String str = jVar.f7126k0;
        if (str != null) {
            eVar.Y = str;
        }
        eVar.Z = jVar.f7133o0;
        eVar.setMarginStart(jVar.K);
        eVar.setMarginEnd(jVar.J);
        eVar.a();
    }

    public final Object clone() {
        i iVar = new i();
        j jVar = iVar.f7104d;
        jVar.getClass();
        j jVar2 = this.f7104d;
        jVar.f7108a = jVar2.f7108a;
        jVar.f7110b = jVar2.f7110b;
        jVar.f7112c = jVar2.f7112c;
        jVar.f7114d = jVar2.f7114d;
        jVar.f7116e = jVar2.f7116e;
        jVar.f7118f = jVar2.f7118f;
        jVar.f7119g = jVar2.f7119g;
        jVar.f7121h = jVar2.f7121h;
        jVar.i = jVar2.i;
        jVar.j = jVar2.j;
        jVar.f7125k = jVar2.f7125k;
        jVar.f7127l = jVar2.f7127l;
        jVar.f7128m = jVar2.f7128m;
        jVar.f7130n = jVar2.f7130n;
        jVar.f7132o = jVar2.f7132o;
        jVar.f7134p = jVar2.f7134p;
        jVar.q = jVar2.q;
        jVar.f7135r = jVar2.f7135r;
        jVar.f7136s = jVar2.f7136s;
        jVar.f7137t = jVar2.f7137t;
        jVar.f7138u = jVar2.f7138u;
        jVar.f7139v = jVar2.f7139v;
        jVar.f7140w = jVar2.f7140w;
        jVar.f7141x = jVar2.f7141x;
        jVar.f7142y = jVar2.f7142y;
        jVar.f7143z = jVar2.f7143z;
        jVar.A = jVar2.A;
        jVar.B = jVar2.B;
        jVar.C = jVar2.C;
        jVar.D = jVar2.D;
        jVar.E = jVar2.E;
        jVar.F = jVar2.F;
        jVar.G = jVar2.G;
        jVar.H = jVar2.H;
        jVar.I = jVar2.I;
        jVar.J = jVar2.J;
        jVar.K = jVar2.K;
        jVar.L = jVar2.L;
        jVar.M = jVar2.M;
        jVar.N = jVar2.N;
        jVar.O = jVar2.O;
        jVar.P = jVar2.P;
        jVar.Q = jVar2.Q;
        jVar.R = jVar2.R;
        jVar.S = jVar2.S;
        jVar.T = jVar2.T;
        jVar.U = jVar2.U;
        jVar.V = jVar2.V;
        jVar.W = jVar2.W;
        jVar.X = jVar2.X;
        jVar.Y = jVar2.Y;
        jVar.Z = jVar2.Z;
        jVar.f7109a0 = jVar2.f7109a0;
        jVar.f7111b0 = jVar2.f7111b0;
        jVar.f7113c0 = jVar2.f7113c0;
        jVar.f7115d0 = jVar2.f7115d0;
        jVar.f7117e0 = jVar2.f7117e0;
        jVar.f0 = jVar2.f0;
        jVar.f7120g0 = jVar2.f7120g0;
        jVar.f7122h0 = jVar2.f7122h0;
        jVar.f7126k0 = jVar2.f7126k0;
        int[] iArr = jVar2.f7123i0;
        if (iArr == null || jVar2.f7124j0 != null) {
            jVar.f7123i0 = null;
        } else {
            jVar.f7123i0 = Arrays.copyOf(iArr, iArr.length);
        }
        jVar.f7124j0 = jVar2.f7124j0;
        jVar.l0 = jVar2.l0;
        jVar.f7129m0 = jVar2.f7129m0;
        jVar.f7131n0 = jVar2.f7131n0;
        jVar.f7133o0 = jVar2.f7133o0;
        k kVar = iVar.f7103c;
        kVar.getClass();
        k kVar2 = this.f7103c;
        kVar2.getClass();
        kVar.f7144a = kVar2.f7144a;
        kVar.f7146c = kVar2.f7146c;
        kVar.f7148e = kVar2.f7148e;
        kVar.f7147d = kVar2.f7147d;
        l lVar = this.f7102b;
        int i = lVar.f7152a;
        l lVar2 = iVar.f7102b;
        lVar2.f7152a = i;
        lVar2.f7154c = lVar.f7154c;
        lVar2.f7155d = lVar.f7155d;
        lVar2.f7153b = lVar.f7153b;
        m mVar = iVar.f7105e;
        mVar.getClass();
        m mVar2 = this.f7105e;
        mVar2.getClass();
        mVar.f7157a = mVar2.f7157a;
        mVar.f7158b = mVar2.f7158b;
        mVar.f7159c = mVar2.f7159c;
        mVar.f7160d = mVar2.f7160d;
        mVar.f7161e = mVar2.f7161e;
        mVar.f7162f = mVar2.f7162f;
        mVar.f7163g = mVar2.f7163g;
        mVar.f7164h = mVar2.f7164h;
        mVar.i = mVar2.i;
        mVar.j = mVar2.j;
        mVar.f7165k = mVar2.f7165k;
        mVar.f7166l = mVar2.f7166l;
        mVar.f7167m = mVar2.f7167m;
        iVar.f7101a = this.f7101a;
        return iVar;
    }
}
