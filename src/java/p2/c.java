package p2;

import android.content.Context;
import android.net.ConnectivityManager;
import j6.o;
import java.net.MalformedURLException;
import java.net.URL;
import q2.a0;
import q2.b0;
import q2.c0;
import q2.d0;
import q2.e0;
import q2.f;
import q2.f0;
import q2.g;
import q2.h;
import q2.i;
import q2.i0;
import q2.j;
import q2.k;
import q2.l;
import q2.m;
import q2.n;
import q2.p;
import q2.q;
import q2.r;
import q2.s;
import q2.t;
import q2.v;
import q2.w;
import q2.y;
import s2.e;
import v5.d;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class c implements e {

    /* renamed from: a  reason: collision with root package name */
    public final o f5077a;

    /* renamed from: b  reason: collision with root package name */
    public final ConnectivityManager f5078b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f5079c;

    /* renamed from: d  reason: collision with root package name */
    public final URL f5080d;

    /* renamed from: e  reason: collision with root package name */
    public final a3.a f5081e;

    /* renamed from: f  reason: collision with root package name */
    public final a3.a f5082f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5083g;

    public c(Context context, a3.a aVar, a3.a aVar2) {
        d dVar = new d();
        q2.c cVar = q2.c.f5230a;
        dVar.a(w.class, cVar);
        dVar.a(m.class, cVar);
        j jVar = j.f5257a;
        dVar.a(f0.class, jVar);
        dVar.a(t.class, jVar);
        q2.d dVar2 = q2.d.f5232a;
        dVar.a(y.class, dVar2);
        dVar.a(n.class, dVar2);
        q2.b bVar = q2.b.f5219a;
        dVar.a(q2.a.class, bVar);
        dVar.a(l.class, bVar);
        i iVar = i.f5249a;
        dVar.a(e0.class, iVar);
        dVar.a(s.class, iVar);
        q2.e eVar = q2.e.f5235a;
        dVar.a(a0.class, eVar);
        dVar.a(q2.o.class, eVar);
        h hVar = h.f5245a;
        dVar.a(d0.class, hVar);
        dVar.a(r.class, hVar);
        g gVar = g.f5241a;
        dVar.a(c0.class, gVar);
        dVar.a(q.class, gVar);
        k kVar = k.f5267a;
        dVar.a(i0.class, kVar);
        dVar.a(v.class, kVar);
        f fVar = f.f5238a;
        dVar.a(b0.class, fVar);
        dVar.a(p.class, fVar);
        dVar.f6312d = true;
        this.f5077a = new o(dVar, 19);
        this.f5079c = context;
        this.f5078b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f5080d = b(a.f5068c);
        this.f5081e = aVar2;
        this.f5082f = aVar;
        this.f5083g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e9) {
            throw new IllegalArgumentException(g2.g.l("Invalid url: ", str), e9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a1, code lost:
        if (((q2.g0) q2.g0.f5243a.get(r0)) != null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final r2.i a(r2.i r7) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.c.a(r2.i):r2.i");
    }
}
