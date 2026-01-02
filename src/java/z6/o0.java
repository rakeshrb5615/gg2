package z6;

import java.util.Calendar;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public class o0 extends w6.z {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (r1.equals("month") == false) goto L11;
     */
    @Override // w6.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(e7.a r13) {
        /*
            r12 = this;
            int r0 = r13.O()
            r1 = 9
            if (r0 != r1) goto Ld
            r13.K()
            r13 = 0
            return r13
        Ld:
            r13.f()
            r0 = 0
            r2 = r0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
        L17:
            int r1 = r13.O()
            r8 = 4
            if (r1 == r8) goto L82
            java.lang.String r1 = r13.I()
            int r9 = r13.G()
            r1.getClass()
            int r10 = r1.hashCode()
            r11 = -1
            switch(r10) {
                case -1181204563: goto L68;
                case -1074026988: goto L5d;
                case -906279820: goto L52;
                case 3704893: goto L47;
                case 104080000: goto L3e;
                case 985252545: goto L33;
                default: goto L31;
            }
        L31:
            r8 = r11
            goto L72
        L33:
            java.lang.String r8 = "hourOfDay"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L3c
            goto L31
        L3c:
            r8 = 5
            goto L72
        L3e:
            java.lang.String r10 = "month"
            boolean r1 = r1.equals(r10)
            if (r1 != 0) goto L72
            goto L31
        L47:
            java.lang.String r8 = "year"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L50
            goto L31
        L50:
            r8 = 3
            goto L72
        L52:
            java.lang.String r8 = "second"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L5b
            goto L31
        L5b:
            r8 = 2
            goto L72
        L5d:
            java.lang.String r8 = "minute"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L66
            goto L31
        L66:
            r8 = 1
            goto L72
        L68:
            java.lang.String r8 = "dayOfMonth"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L71
            goto L31
        L71:
            r8 = r0
        L72:
            switch(r8) {
                case 0: goto L80;
                case 1: goto L7e;
                case 2: goto L7c;
                case 3: goto L7a;
                case 4: goto L78;
                case 5: goto L76;
                default: goto L75;
            }
        L75:
            goto L17
        L76:
            r5 = r9
            goto L17
        L78:
            r3 = r9
            goto L17
        L7a:
            r2 = r9
            goto L17
        L7c:
            r7 = r9
            goto L17
        L7e:
            r6 = r9
            goto L17
        L80:
            r4 = r9
            goto L17
        L82:
            r13.y()
            java.util.GregorianCalendar r1 = new java.util.GregorianCalendar
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.o0.b(e7.a):java.lang.Object");
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        Calendar calendar = (Calendar) obj;
        if (calendar == null) {
            bVar.B();
            return;
        }
        bVar.i();
        bVar.z("year");
        bVar.G(calendar.get(1));
        bVar.z("month");
        bVar.G(calendar.get(2));
        bVar.z("dayOfMonth");
        bVar.G(calendar.get(5));
        bVar.z("hourOfDay");
        bVar.G(calendar.get(11));
        bVar.z("minute");
        bVar.G(calendar.get(12));
        bVar.z("second");
        bVar.G(calendar.get(13));
        bVar.y();
    }
}
