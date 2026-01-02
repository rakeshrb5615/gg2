package c1;

import a1.p;
import android.content.Context;
import d1.i;
import h7.j;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final p f856a;

    /* renamed from: b  reason: collision with root package name */
    public final i f857b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f858c;

    /* renamed from: d  reason: collision with root package name */
    public final String f859d;

    /* renamed from: e  reason: collision with root package name */
    public final j f860e;

    /* renamed from: f  reason: collision with root package name */
    public final Set f861f;

    public d(Context context, String str, Set set, p pVar, i iVar) {
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(str, "sharedPreferencesName");
        kotlin.jvm.internal.j.e(set, "keysToMigrate");
        a aVar = new a(context, str, 0);
        this.f856a = pVar;
        this.f857b = iVar;
        this.f858c = context;
        this.f859d = str;
        this.f860e = a.a.F(aVar);
        this.f861f = set == e.f862a ? null : new LinkedHashSet(set);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
        if (r5.isEmpty() == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r5, n7.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof c1.c
            if (r0 == 0) goto L13
            r0 = r6
            c1.c r0 = (c1.c) r0
            int r1 = r0.f855d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f855d = r1
            goto L18
        L13:
            c1.c r0 = new c1.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f853b
            m7.a r1 = m7.a.f4049a
            int r2 = r0.f855d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            c1.d r5 = r0.f852a
            c4.b.e0(r6)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            c4.b.e0(r6)
            r0.f852a = r4
            r0.f855d = r3
            a1.p r6 = r4.f856a
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            r5 = r4
        L42:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L4d
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L4d:
            java.util.Set r6 = r5.f861f
            h7.j r5 = r5.f860e
            r0 = 0
            if (r6 != 0) goto L6c
            java.lang.Object r5 = r5.getValue()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.util.Map r5 = r5.getAll()
            java.lang.String r6 = "sharedPrefs.all"
            kotlin.jvm.internal.j.d(r5, r6)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L6a
            goto L8f
        L6a:
            r3 = r0
            goto L8f
        L6c:
            java.lang.Object r5 = r5.getValue()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L79
            goto L6a
        L79:
            java.util.Iterator r6 = r6.iterator()
        L7d:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r5.contains(r1)
            if (r1 == 0) goto L7d
        L8f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.d.a(java.lang.Object, n7.c):java.lang.Object");
    }
}
