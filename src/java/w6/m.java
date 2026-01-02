package w6;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import z6.a1;
import z6.q0;
import z6.s0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class m {

    /* renamed from: k  reason: collision with root package name */
    public static final i f6468k = i.f6460d;

    /* renamed from: l  reason: collision with root package name */
    public static final a f6469l = h.f6458a;

    /* renamed from: m  reason: collision with root package name */
    public static final t f6470m = x.f6484a;

    /* renamed from: n  reason: collision with root package name */
    public static final u f6471n = x.f6485b;

    /* renamed from: a  reason: collision with root package name */
    public final ThreadLocal f6472a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f6473b;

    /* renamed from: c  reason: collision with root package name */
    public final y6.c f6474c;

    /* renamed from: d  reason: collision with root package name */
    public final z6.k f6475d;

    /* renamed from: e  reason: collision with root package name */
    public final List f6476e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f6477f;

    /* renamed from: g  reason: collision with root package name */
    public final i f6478g;

    /* renamed from: h  reason: collision with root package name */
    public final List f6479h;
    public final List i;
    public final List j;

    public m() {
        y6.e eVar = y6.e.f6914c;
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this.f6472a = new ThreadLocal();
        this.f6473b = new ConcurrentHashMap();
        y6.c cVar = new y6.c();
        this.f6474c = cVar;
        this.f6477f = true;
        this.f6478g = f6468k;
        this.f6479h = list;
        this.i = list;
        this.j = list;
        ArrayList arrayList = new ArrayList();
        arrayList.add(a1.A);
        t tVar = x.f6484a;
        t tVar2 = f6470m;
        arrayList.add(tVar2 == tVar ? z6.p.f7428c : new z6.n(tVar2, 1));
        arrayList.add(eVar);
        arrayList.addAll(list);
        arrayList.add(a1.f7390p);
        arrayList.add(a1.f7383g);
        arrayList.add(a1.f7380d);
        arrayList.add(a1.f7381e);
        arrayList.add(a1.f7382f);
        z6.y yVar = a1.f7385k;
        arrayList.add(new s0(Long.TYPE, Long.class, yVar));
        arrayList.add(new s0(Double.TYPE, Double.class, new j(0)));
        arrayList.add(new s0(Float.TYPE, Float.class, new j(1)));
        u uVar = x.f6485b;
        u uVar2 = f6471n;
        arrayList.add(uVar2 == uVar ? z6.o.f7426b : new z6.n(new z6.o(uVar2), 0));
        arrayList.add(a1.f7384h);
        arrayList.add(a1.i);
        arrayList.add(new q0(AtomicLong.class, new k(yVar, 0).a(), 0));
        arrayList.add(new q0(AtomicLongArray.class, new k(yVar, 1).a(), 0));
        arrayList.add(a1.j);
        arrayList.add(a1.f7386l);
        arrayList.add(a1.q);
        arrayList.add(a1.f7391r);
        arrayList.add(new q0(BigDecimal.class, a1.f7387m, 0));
        arrayList.add(new q0(BigInteger.class, a1.f7388n, 0));
        arrayList.add(new q0(y6.k.class, a1.f7389o, 0));
        arrayList.add(a1.f7392s);
        arrayList.add(a1.f7393t);
        arrayList.add(a1.f7395v);
        arrayList.add(a1.f7396w);
        arrayList.add(a1.f7398y);
        arrayList.add(a1.f7394u);
        arrayList.add(a1.f7378b);
        arrayList.add(z6.g.f7409c);
        arrayList.add(a1.f7397x);
        if (c7.e.f941a) {
            arrayList.add(c7.e.f943c);
            arrayList.add(c7.e.f942b);
            arrayList.add(c7.e.f944d);
        }
        arrayList.add(z6.b.f7400c);
        arrayList.add(a1.f7377a);
        arrayList.add(new z6.d(cVar, 0));
        arrayList.add(new z6.d(cVar, 1));
        z6.k kVar = new z6.k(cVar);
        this.f6475d = kVar;
        arrayList.add(kVar);
        arrayList.add(a1.B);
        arrayList.add(new z6.v(cVar, f6469l, eVar, kVar));
        this.f6476e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d9) {
        if (Double.isNaN(d9) || Double.isInfinite(d9)) {
            throw new IllegalArgumentException(d9 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final z b(d7.a aVar) {
        boolean z9;
        ConcurrentHashMap concurrentHashMap = this.f6473b;
        z zVar = (z) concurrentHashMap.get(aVar);
        if (zVar != null) {
            return zVar;
        }
        ThreadLocal threadLocal = this.f6472a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z9 = true;
        } else {
            z zVar2 = (z) map.get(aVar);
            if (zVar2 != null) {
                return zVar2;
            }
            z9 = false;
        }
        try {
            l lVar = new l();
            map.put(aVar, lVar);
            Iterator it = this.f6476e.iterator();
            z zVar3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                zVar3 = ((a0) it.next()).a(this, aVar);
                if (zVar3 != null) {
                    if (lVar.f6467a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    lVar.f6467a = zVar3;
                    map.put(aVar, zVar3);
                }
            }
            if (z9) {
                threadLocal.remove();
            }
            if (zVar3 != null) {
                if (z9) {
                    concurrentHashMap.putAll(map);
                }
                return zVar3;
            }
            throw new IllegalArgumentException("GSON (2.13.2) cannot handle " + aVar);
        } catch (Throwable th) {
            if (z9) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f6476e + ",instanceCreators:" + this.f6474c + "}";
    }
}
