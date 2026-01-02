package a1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class g extends n7.i implements u7.p {

    /* renamed from: a  reason: collision with root package name */
    public Iterator f65a;

    /* renamed from: b  reason: collision with root package name */
    public c1.d f66b;

    /* renamed from: c  reason: collision with root package name */
    public Object f67c;

    /* renamed from: d  reason: collision with root package name */
    public int f68d;

    /* renamed from: e  reason: collision with root package name */
    public /* synthetic */ Object f69e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ List f70f;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ ArrayList f71m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(List list, ArrayList arrayList, l7.c cVar) {
        super(2, cVar);
        this.f70f = list;
        this.f71m = arrayList;
    }

    @Override // n7.a
    public final l7.c create(Object obj, l7.c cVar) {
        g gVar = new g(this.f70f, this.f71m, cVar);
        gVar.f69e = obj;
        return gVar;
    }

    @Override // u7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create(obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
        if (r11 == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0092 -> B:11:0x003c). Please submit an issue!!! */
    @Override // n7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            m7.a r0 = m7.a.f4049a
            int r1 = r10.f68d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.util.Iterator r1 = r10.f65a
            java.lang.Object r4 = r10.f69e
            java.util.List r4 = (java.util.List) r4
            c4.b.e0(r11)
            goto L3c
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1e:
            java.lang.Object r1 = r10.f67c
            c1.d r4 = r10.f66b
            java.util.Iterator r5 = r10.f65a
            java.lang.Object r6 = r10.f69e
            java.util.List r6 = (java.util.List) r6
            c4.b.e0(r11)
            r9 = r6
            r6 = r4
            r4 = r9
            goto L5e
        L2f:
            c4.b.e0(r11)
            java.lang.Object r11 = r10.f69e
            java.util.List r1 = r10.f70f
            java.util.Iterator r1 = r1.iterator()
            java.util.ArrayList r4 = r10.f71m
        L3c:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L96
            java.lang.Object r5 = r1.next()
            c1.d r5 = (c1.d) r5
            r10.f69e = r4
            r10.f65a = r1
            r10.f66b = r5
            r10.f67c = r11
            r10.f68d = r3
            java.lang.Object r6 = r5.a(r11, r10)
            if (r6 != r0) goto L59
            goto L91
        L59:
            r9 = r1
            r1 = r11
            r11 = r6
            r6 = r5
            r5 = r9
        L5e:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L94
            a1.f r11 = new a1.f
            r7 = 0
            r8 = 0
            r11.<init>(r6, r8, r7)
            r4.add(r11)
            r10.f69e = r4
            r10.f65a = r5
            r10.f66b = r8
            r10.f67c = r8
            r10.f68d = r2
            d1.i r11 = r6.f857b
            c1.f r7 = new c1.f
            h7.j r8 = r6.f860e
            java.lang.Object r8 = r8.getValue()
            android.content.SharedPreferences r8 = (android.content.SharedPreferences) r8
            java.util.Set r6 = r6.f861f
            r7.<init>(r8, r6)
            java.lang.Object r11 = r11.b(r7, r1, r10)
            if (r11 != r0) goto L92
        L91:
            return r0
        L92:
            r1 = r5
            goto L3c
        L94:
            r11 = r1
            goto L92
        L96:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
