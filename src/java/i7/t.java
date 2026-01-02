package i7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class t extends n7.h implements u7.p {

    /* renamed from: b  reason: collision with root package name */
    public Object f2752b;

    /* renamed from: c  reason: collision with root package name */
    public Iterator f2753c;

    /* renamed from: d  reason: collision with root package name */
    public int f2754d;

    /* renamed from: e  reason: collision with root package name */
    public int f2755e;

    /* renamed from: f  reason: collision with root package name */
    public int f2756f;

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f2757m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Iterator f2758n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Iterator it, l7.c cVar) {
        super(2, cVar);
        this.f2758n = it;
    }

    @Override // n7.a
    public final l7.c create(Object obj, l7.c cVar) {
        t tVar = new t(this.f2758n, cVar);
        tVar.f2757m = obj;
        return tVar;
    }

    @Override // u7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((a8.g) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        int i;
        int i9;
        int i10;
        ArrayList arrayList;
        Iterator it;
        int i11;
        int i12;
        int i13;
        s sVar;
        Object[] array;
        a8.g gVar = (a8.g) this.f2757m;
        m7.a aVar = m7.a.f4049a;
        int i14 = this.f2756f;
        boolean z9 = true;
        if (i14 == 0) {
            i = 1;
            c4.b.e0(obj);
            i9 = 0;
            i10 = 0;
            arrayList = new ArrayList(20);
            it = this.f2758n;
            i11 = 20;
        } else if (i14 != 1) {
            if (i14 != 2) {
                if (i14 == 3) {
                    i12 = this.f2755e;
                    int i15 = this.f2754d;
                    Iterator it2 = this.f2753c;
                    s sVar2 = (s) this.f2752b;
                    c4.b.e0(obj);
                    sVar2.c();
                    while (true) {
                        int i16 = sVar2.f2749b;
                        Object[] objArr = sVar2.f2748a;
                        if (!it2.hasNext()) {
                            i13 = i15;
                            sVar = sVar2;
                            break;
                        }
                        Object next = it2.next();
                        boolean z10 = z9;
                        if (sVar2.b() == i16) {
                            throw new IllegalStateException("ring buffer is full");
                        }
                        int i17 = sVar2.f2750c;
                        int i18 = sVar2.f2751d;
                        objArr[(i17 + i18) % i16] = next;
                        sVar2.f2751d = i18 + 1;
                        if (sVar2.b() == i16) {
                            if (sVar2.f2751d >= 20) {
                                ArrayList arrayList2 = new ArrayList(sVar2);
                                this.f2757m = gVar;
                                this.f2752b = sVar2;
                                this.f2753c = it2;
                                this.f2754d = i15;
                                this.f2755e = i12;
                                this.f2756f = 3;
                                gVar.d(arrayList2, this);
                                m7.a aVar2 = m7.a.f4049a;
                                return aVar;
                            }
                            int i19 = i16 + (i16 >> 1) + 1;
                            if (i19 > 20) {
                                i19 = 20;
                            }
                            if (sVar2.f2750c == 0) {
                                array = Arrays.copyOf(objArr, i19);
                                kotlin.jvm.internal.j.d(array, "copyOf(...)");
                            } else {
                                array = sVar2.toArray(new Object[i19]);
                            }
                            sVar2 = new s(array, sVar2.f2751d);
                        }
                        z9 = z10;
                    }
                } else if (i14 == 4) {
                    i12 = this.f2755e;
                    i13 = this.f2754d;
                    sVar = (s) this.f2752b;
                    c4.b.e0(obj);
                    sVar.c();
                } else if (i14 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    s sVar3 = (s) this.f2752b;
                }
                if (sVar.f2751d > 20) {
                    ArrayList arrayList3 = new ArrayList(sVar);
                    this.f2757m = gVar;
                    this.f2752b = sVar;
                    this.f2753c = null;
                    this.f2754d = i13;
                    this.f2755e = i12;
                    this.f2756f = 4;
                    gVar.d(arrayList3, this);
                    m7.a aVar3 = m7.a.f4049a;
                    return aVar;
                }
                if (!sVar.isEmpty()) {
                    this.f2757m = null;
                    this.f2752b = null;
                    this.f2753c = null;
                    this.f2754d = i13;
                    this.f2755e = i12;
                    this.f2756f = 5;
                    gVar.d(sVar, this);
                    m7.a aVar4 = m7.a.f4049a;
                    return aVar;
                }
                return h7.l.f2236a;
            }
            ArrayList arrayList4 = (ArrayList) this.f2752b;
            c4.b.e0(obj);
            return h7.l.f2236a;
        } else {
            i = 1;
            i9 = this.f2755e;
            int i20 = this.f2754d;
            Iterator it3 = this.f2753c;
            ArrayList arrayList5 = (ArrayList) this.f2752b;
            c4.b.e0(obj);
            arrayList = new ArrayList(20);
            it = it3;
            i11 = i20;
            i10 = i9;
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (i9 > 0) {
                i9--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 20) {
                    this.f2757m = gVar;
                    this.f2752b = arrayList;
                    this.f2753c = it;
                    this.f2754d = i11;
                    this.f2755e = i10;
                    this.f2756f = i;
                    gVar.d(arrayList, this);
                    m7.a aVar5 = m7.a.f4049a;
                    return aVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f2757m = null;
            this.f2752b = null;
            this.f2753c = null;
            this.f2754d = i11;
            this.f2755e = i10;
            this.f2756f = 2;
            gVar.d(arrayList, this);
            m7.a aVar6 = m7.a.f4049a;
            return aVar;
        }
        return h7.l.f2236a;
    }
}
