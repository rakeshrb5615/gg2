package b8;

import java.io.Serializable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final /* synthetic */ class q implements u7.p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f793a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Serializable f794b;

    public /* synthetic */ q(int i, Serializable serializable) {
        this.f793a = i;
        this.f794b = serializable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r0 == null) goto L7;
     */
    @Override // u7.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5) {
        /*
            r3 = this;
            int r0 = r3.f793a
            switch(r0) {
                case 0: goto L77;
                default: goto L5;
            }
        L5:
            java.io.Serializable r0 = r3.f794b
            h8.g r0 = (h8.g) r0
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r1 = r4.intValue()
            l7.f r5 = (l7.f) r5
            l7.g r4 = r5.getKey()
            l7.h r0 = r0.f2246b
            l7.f r0 = r0.get(r4)
            d8.b0 r2 = d8.b0.f1162b
            if (r4 == r2) goto L27
            if (r5 == r0) goto L24
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L3b
        L24:
            int r1 = r1 + 1
            goto L3b
        L27:
            d8.e1 r0 = (d8.e1) r0
            d8.e1 r5 = (d8.e1) r5
        L2b:
            r4 = 0
            if (r5 != 0) goto L30
            r5 = r4
            goto L37
        L30:
            if (r5 != r0) goto L33
            goto L37
        L33:
            boolean r2 = r5 instanceof i8.q
            if (r2 != 0) goto L65
        L37:
            if (r5 != r0) goto L40
            if (r0 != 0) goto L24
        L3b:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            return r4
        L40:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = ", expected child of "
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L65:
            i8.q r5 = (i8.q) r5
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = d8.r1.f1242b
            java.lang.Object r5 = r2.get(r5)
            d8.q r5 = (d8.q) r5
            if (r5 == 0) goto L75
            d8.e1 r4 = r5.getParent()
        L75:
            r5 = r4
            goto L2b
        L77:
            java.io.Serializable r0 = r3.f794b
            char[] r0 = (char[]) r0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.String r1 = "$this$DelimitedRangesSequence"
            kotlin.jvm.internal.j.e(r4, r1)
            r1 = 0
            int r4 = b8.i.x0(r4, r0, r5, r1)
            if (r4 >= 0) goto L91
            r4 = 0
            goto La0
        L91:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            h7.f r0 = new h7.f
            r0.<init>(r4, r5)
            r4 = r0
        La0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.q.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
