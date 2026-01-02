package i8;

import d8.u0;
import d8.v0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public class u {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2802b = AtomicIntegerFieldUpdater.newUpdater(u.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a  reason: collision with root package name */
    public u0[] f2803a;

    public final void a(u0 u0Var) {
        u0Var.d((v0) this);
        u0[] u0VarArr = this.f2803a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2802b;
        if (u0VarArr == null) {
            u0VarArr = new u0[4];
            this.f2803a = u0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= u0VarArr.length) {
            Object[] copyOf = Arrays.copyOf(u0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
            u0VarArr = (u0[]) copyOf;
            this.f2803a = u0VarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        u0VarArr[i] = u0Var;
        u0Var.f1248b = i;
        c(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
        if (r6.compareTo(r7) < 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final d8.u0 b(int r9) {
        /*
            r8 = this;
            d8.u0[] r0 = r8.f2803a
            kotlin.jvm.internal.j.b(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = i8.u.f2802b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            kotlin.jvm.internal.j.b(r4)
            r5 = r0[r2]
            kotlin.jvm.internal.j.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            d8.u0[] r5 = r8.f2803a
            kotlin.jvm.internal.j.b(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            kotlin.jvm.internal.j.b(r6)
            r7 = r5[r4]
            kotlin.jvm.internal.j.b(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            kotlin.jvm.internal.j.b(r4)
            r5 = r5[r2]
            kotlin.jvm.internal.j.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            kotlin.jvm.internal.j.b(r9)
            r2 = 0
            r9.d(r2)
            r9.f1248b = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.u.b(int):d8.u0");
    }

    public final void c(int i) {
        while (i > 0) {
            u0[] u0VarArr = this.f2803a;
            kotlin.jvm.internal.j.b(u0VarArr);
            int i9 = (i - 1) / 2;
            u0 u0Var = u0VarArr[i9];
            kotlin.jvm.internal.j.b(u0Var);
            u0 u0Var2 = u0VarArr[i];
            kotlin.jvm.internal.j.b(u0Var2);
            if (u0Var.compareTo(u0Var2) <= 0) {
                return;
            }
            d(i, i9);
            i = i9;
        }
    }

    public final void d(int i, int i9) {
        u0[] u0VarArr = this.f2803a;
        kotlin.jvm.internal.j.b(u0VarArr);
        u0 u0Var = u0VarArr[i9];
        kotlin.jvm.internal.j.b(u0Var);
        u0 u0Var2 = u0VarArr[i];
        kotlin.jvm.internal.j.b(u0Var2);
        u0VarArr[i] = u0Var;
        u0VarArr[i9] = u0Var2;
        u0Var.f1248b = i;
        u0Var2.f1248b = i9;
    }
}
