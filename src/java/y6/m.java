package y6;

import java.util.AbstractSet;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class m extends AbstractSet {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6931a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f6932b;

    public /* synthetic */ m(o oVar, int i) {
        this.f6931a = i;
        this.f6932b = oVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f6931a) {
            case 0:
                this.f6932b.clear();
                return;
            default:
                this.f6932b.clear();
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean contains(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f6931a
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            y6.o r0 = r4.f6932b
            boolean r5 = r0.containsKey(r5)
            return r5
        Lc:
            boolean r0 = r5 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L34
            y6.o r0 = r4.f6932b
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r2 = r5.getKey()
            r3 = 0
            if (r2 == 0) goto L21
            y6.n r0 = r0.b(r2, r1)     // Catch: java.lang.ClassCastException -> L21
            goto L22
        L21:
            r0 = r3
        L22:
            if (r0 == 0) goto L31
            java.lang.Object r2 = r0.f6940n
            java.lang.Object r5 = r5.getValue()
            boolean r5 = java.util.Objects.equals(r2, r5)
            if (r5 == 0) goto L31
            r3 = r0
        L31:
            if (r3 == 0) goto L34
            r1 = 1
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.m.contains(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f6931a) {
            case 0:
                return new l(this.f6932b, 0);
            default:
                return new l(this.f6932b, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f6931a
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            r0 = 0
            y6.o r1 = r5.f6932b
            r2 = 0
            if (r6 == 0) goto Lf
            y6.n r2 = r1.b(r6, r0)     // Catch: java.lang.ClassCastException -> Lf
        Lf:
            r6 = 1
            if (r2 == 0) goto L15
            r1.d(r2, r6)
        L15:
            if (r2 == 0) goto L18
            r0 = r6
        L18:
            return r0
        L19:
            boolean r0 = r6 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L1f
            goto L46
        L1f:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r0 = r6.getKey()
            y6.o r2 = r5.f6932b
            r3 = 0
            if (r0 == 0) goto L2f
            y6.n r0 = r2.b(r0, r1)     // Catch: java.lang.ClassCastException -> L2f
            goto L30
        L2f:
            r0 = r3
        L30:
            if (r0 == 0) goto L3f
            java.lang.Object r4 = r0.f6940n
            java.lang.Object r6 = r6.getValue()
            boolean r6 = java.util.Objects.equals(r4, r6)
            if (r6 == 0) goto L3f
            r3 = r0
        L3f:
            if (r3 != 0) goto L42
            goto L46
        L42:
            r1 = 1
            r2.d(r3, r1)
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.m.remove(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f6931a) {
            case 0:
                return this.f6932b.f6946d;
            default:
                return this.f6932b.f6946d;
        }
    }
}
