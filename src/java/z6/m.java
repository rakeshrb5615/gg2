package z6;

import java.lang.reflect.Type;
import java.util.Map;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class m extends w6.z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7420a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7421b;

    /* renamed from: c  reason: collision with root package name */
    public final w6.z f7422c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f7423d;

    public m(w6.m mVar, w6.z zVar, Type type) {
        this.f7421b = mVar;
        this.f7422c = zVar;
        this.f7423d = type;
    }

    @Override // w6.z
    public final Object b(e7.a aVar) {
        switch (this.f7420a) {
            case 0:
                int O = aVar.O();
                if (O == 9) {
                    aVar.K();
                    return null;
                }
                Map map = (Map) ((y6.p) this.f7423d).c();
                if (O == 1) {
                    aVar.c();
                    while (aVar.B()) {
                        aVar.c();
                        Object b10 = ((m) this.f7421b).f7422c.b(aVar);
                        if (map.put(b10, ((m) this.f7422c).f7422c.b(aVar)) != null) {
                            throw new RuntimeException("duplicate key: " + b10);
                        }
                        aVar.x();
                    }
                    aVar.x();
                } else {
                    aVar.f();
                    while (aVar.B()) {
                        v3.f.f6186a.getClass();
                        int i = aVar.f1336m;
                        if (i == 0) {
                            i = aVar.s();
                        }
                        if (i == 13) {
                            aVar.f1336m = 9;
                        } else if (i == 12) {
                            aVar.f1336m = 8;
                        } else if (i != 14) {
                            throw aVar.W("a name");
                        } else {
                            aVar.f1336m = 10;
                        }
                        Object b11 = ((m) this.f7421b).f7422c.b(aVar);
                        if (map.put(b11, ((m) this.f7422c).f7422c.b(aVar)) != null) {
                            throw new RuntimeException("duplicate key: " + b11);
                        }
                    }
                    aVar.y();
                }
                return map;
            default:
                return this.f7422c.b(aVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
        if ((r1 instanceof z6.r) == false) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.reflect.Type] */
    @Override // w6.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(e7.b r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.f7420a
            switch(r0) {
                case 0: goto L4a;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f7423d
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            if (r6 == 0) goto L18
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto L13
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L18
        L13:
            java.lang.Class r1 = r6.getClass()
            goto L19
        L18:
            r1 = r0
        L19:
            w6.z r2 = r4.f7422c
            if (r1 == r0) goto L46
            java.lang.Object r0 = r4.f7421b
            w6.m r0 = (w6.m) r0
            d7.a r3 = new d7.a
            r3.<init>(r1)
            w6.z r0 = r0.b(r3)
            boolean r1 = r0 instanceof z6.r
            if (r1 != 0) goto L2f
            goto L45
        L2f:
            r1 = r2
        L30:
            boolean r3 = r1 instanceof z6.w
            if (r3 == 0) goto L40
            r3 = r1
            z6.w r3 = (z6.w) r3
            w6.z r3 = r3.d()
            if (r3 != r1) goto L3e
            goto L40
        L3e:
            r1 = r3
            goto L30
        L40:
            boolean r1 = r1 instanceof z6.r
            if (r1 != 0) goto L45
            goto L46
        L45:
            r2 = r0
        L46:
            r2.c(r5, r6)
            return
        L4a:
            java.util.Map r6 = (java.util.Map) r6
            w6.z r0 = r4.f7422c
            z6.m r0 = (z6.m) r0
            if (r6 != 0) goto L56
            r5.B()
            goto L83
        L56:
            r5.i()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L61:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L80
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r5.z(r2)
            java.lang.Object r1 = r1.getValue()
            r0.c(r5, r1)
            goto L61
        L80:
            r5.y()
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.m.c(e7.b, java.lang.Object):void");
    }

    public m(d dVar, m mVar, m mVar2, y6.p pVar) {
        this.f7421b = mVar;
        this.f7422c = mVar2;
        this.f7423d = pVar;
    }
}
