package h8;

import b8.q;
import d8.f0;
import d8.x;
import h7.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class g extends n7.c implements g8.d {

    /* renamed from: a  reason: collision with root package name */
    public final g8.d f2245a;

    /* renamed from: b  reason: collision with root package name */
    public final l7.h f2246b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2247c;

    /* renamed from: d  reason: collision with root package name */
    public l7.h f2248d;

    /* renamed from: e  reason: collision with root package name */
    public l7.c f2249e;

    public g(g8.d dVar, l7.h hVar) {
        super(e.f2243a, l7.i.f3796a);
        this.f2245a = dVar;
        this.f2246b = hVar;
        this.f2247c = ((Number) hVar.fold(0, new x(3))).intValue();
    }

    @Override // g8.d
    public final Object a(Object obj, l7.c cVar) {
        try {
            Object d9 = d(cVar, obj);
            return d9 == m7.a.f4049a ? d9 : l.f2236a;
        } catch (Throwable th) {
            this.f2248d = new c(th, cVar.getContext());
            throw th;
        }
    }

    public final Object d(l7.c cVar, Object obj) {
        Comparable comparable;
        String str;
        l7.h context = cVar.getContext();
        f0.g(context);
        l7.h hVar = this.f2248d;
        if (hVar != context) {
            if (hVar instanceof c) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((c) hVar).f2242b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                kotlin.jvm.internal.j.e(str2, "<this>");
                List X = a8.h.X(new a8.i(str2, 2));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : X) {
                    if (!b8.i.y0((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(i7.j.X(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                int i9 = 0;
                while (i9 < size) {
                    Object obj3 = arrayList.get(i9);
                    i9++;
                    String str3 = (String) obj3;
                    int length = str3.length();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            i10 = -1;
                            break;
                        } else if (!a.a.D(str3.charAt(i10))) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (i10 == -1) {
                        i10 = str3.length();
                    }
                    arrayList2.add(Integer.valueOf(i10));
                }
                Iterator it = arrayList2.iterator();
                if (it.hasNext()) {
                    comparable = (Comparable) it.next();
                    while (it.hasNext()) {
                        Comparable comparable2 = (Comparable) it.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                Integer num = (Integer) comparable;
                int intValue = num != null ? num.intValue() : 0;
                int length2 = str2.length();
                X.size();
                int y9 = a.a.y(X);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : X) {
                    int i11 = i + 1;
                    if (i < 0) {
                        a.a.V();
                        throw null;
                    }
                    String str4 = (String) obj4;
                    if ((i == 0 || i == y9) && b8.i.y0(str4)) {
                        str = null;
                    } else {
                        kotlin.jvm.internal.j.e(str4, "<this>");
                        if (intValue < 0) {
                            throw new IllegalArgumentException(v1.a.j("Requested character count ", intValue, " is less than zero.").toString());
                        }
                        int length3 = str4.length();
                        if (intValue <= length3) {
                            length3 = intValue;
                        }
                        str = str4.substring(length3);
                        kotlin.jvm.internal.j.d(str, "substring(...)");
                    }
                    if (str != null) {
                        arrayList3.add(str);
                    }
                    i = i11;
                }
                StringBuilder sb = new StringBuilder(length2);
                i7.i.a0(arrayList3, sb, "\n", "", "", "...", null);
                throw new IllegalStateException(sb.toString().toString());
            } else if (((Number) context.fold(0, new q(1, this))).intValue() != this.f2247c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f2246b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            } else {
                this.f2248d = context;
            }
        }
        this.f2249e = cVar;
        u7.q qVar = i.f2251a;
        g8.d dVar = this.f2245a;
        kotlin.jvm.internal.j.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object b10 = qVar.b(dVar, obj, this);
        if (!kotlin.jvm.internal.j.a(b10, m7.a.f4049a)) {
            this.f2249e = null;
        }
        return b10;
    }

    @Override // n7.a, n7.d
    public final n7.d getCallerFrame() {
        l7.c cVar = this.f2249e;
        if (cVar instanceof n7.d) {
            return (n7.d) cVar;
        }
        return null;
    }

    @Override // n7.c, l7.c
    public final l7.h getContext() {
        l7.h hVar = this.f2248d;
        return hVar == null ? l7.i.f3796a : hVar;
    }

    @Override // n7.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        Throwable a10 = h7.h.a(obj);
        if (a10 != null) {
            this.f2248d = new c(a10, getContext());
        }
        l7.c cVar = this.f2249e;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return m7.a.f4049a;
    }
}
