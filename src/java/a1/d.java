package a1;

import android.net.Uri;
import java.util.List;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class d extends n7.i implements u7.p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f35a;

    /* renamed from: b  reason: collision with root package name */
    public int f36b;

    /* renamed from: c  reason: collision with root package name */
    public Object f37c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f38d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, l7.c cVar, int i) {
        super(2, cVar);
        this.f35a = i;
        this.f37c = obj;
        this.f38d = obj2;
    }

    @Override // n7.a
    public final l7.c create(Object obj, l7.c cVar) {
        switch (this.f35a) {
            case 0:
                d dVar = new d((List) this.f38d, cVar, 0);
                dVar.f37c = obj;
                return dVar;
            case 1:
                return new d((u7.p) ((n7.i) this.f37c), (c) this.f38d, cVar);
            case 2:
                d dVar2 = new d((g0) this.f38d, cVar, 2);
                dVar2.f37c = obj;
                return dVar2;
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                return new d((j6.s) this.f38d, cVar, 3);
            case 4:
                d dVar3 = new d((f8.s) this.f38d, cVar, 4);
                dVar3.f37c = obj;
                return dVar3;
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                d dVar4 = new d((g8.b) this.f38d, cVar, 5);
                dVar4.f37c = obj;
                return dVar4;
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                d dVar5 = new d((g8.b) this.f38d, cVar, 6);
                dVar5.f37c = obj;
                return dVar5;
            case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                d dVar6 = new d((g8.d) this.f38d, cVar, 7);
                dVar6.f37c = obj;
                return dVar6;
            case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                return new d((q5.d) this.f37c, (u7.l) this.f38d, cVar, 8);
            case 9:
                return new d((q5.d) this.f37c, (e1.e) this.f38d, cVar, 9);
            case 10:
                return new d((r6.o) this.f37c, (r6.w0) this.f38d, cVar, 10);
            case 11:
                return new d((r6.c1) this.f37c, (r6.h0) this.f38d, cVar, 11);
            case 12:
                d dVar7 = new d((u6.c) this.f38d, cVar, 12);
                dVar7.f37c = obj;
                return dVar7;
            default:
                return new d((w1.a) this.f37c, (Uri) this.f38d, cVar, 13);
        }
    }

    @Override // u7.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f35a) {
            case 0:
                return ((d) create((k) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
            case 1:
                return ((d) create((d8.c0) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
            case 2:
                return ((d) create((t0) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                return ((d) create((d8.c0) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
            case 4:
                return ((d) create((d8.c0) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                return ((d) create((f8.q) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((d) create((g8.d) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
            case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((d) create(obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
            case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                return ((d) create((d8.c0) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
            case 9:
                return ((d) create((d8.c0) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
            case 10:
                return ((d) create((d8.c0) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
            case 11:
                return ((d) create((d8.c0) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
            case 12:
                return ((d) create((JSONObject) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
            default:
                return ((d) create((d8.c0) obj, (l7.c) obj2)).invokeSuspend(h7.l.f2236a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01e1, code lost:
        if (r4.b(r20) == r6) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x035c, code lost:
        if (r2 == r3) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x035f, code lost:
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x036b, code lost:
        if (r2 == m7.a.f4049a) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x052d, code lost:
        if (r3.invoke(r2, r20) != r0) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:?, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0139, code lost:
        if (r0.a(r7, r20) == r10) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0182, code lost:
        if (r0 == r10) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0184, code lost:
        r5 = r10;
        r2 = r2;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b1, code lost:
        if (r7 == r6) goto L122;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:233:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:382:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Type inference failed for: r2v106, types: [r6.z0] */
    /* JADX WARN: Type inference failed for: r6v15, types: [i8.c, d8.c0] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:296:0x052d -> B:298:0x0531). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0184 -> B:348:0x0185). Please submit an issue!!! */
    @Override // n7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 1538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, l7.c cVar, int i) {
        super(2, cVar);
        this.f35a = i;
        this.f38d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(u7.p pVar, c cVar, l7.c cVar2) {
        super(2, cVar2);
        this.f35a = 1;
        this.f37c = (n7.i) pVar;
        this.f38d = cVar;
    }
}
