package c7;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import w6.a0;
import w6.m;
import w6.z;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class a extends z {

    /* renamed from: b  reason: collision with root package name */
    public static final C0000a f935b = new C0000a();

    /* renamed from: a  reason: collision with root package name */
    public final SimpleDateFormat f936a;

    /* renamed from: c7.a$a  reason: collision with other inner class name */
    /* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
    public class C0000a implements a0 {
        @Override // w6.a0
        public final z a(m mVar, d7.a aVar) {
            if (aVar.f1153a == Date.class) {
                return new a(0);
            }
            return null;
        }
    }

    public /* synthetic */ a(int i) {
        this();
    }

    @Override // w6.z
    public final Object b(e7.a aVar) {
        Date date;
        if (aVar.O() == 9) {
            aVar.K();
            return null;
        }
        String M = aVar.M();
        synchronized (this) {
            TimeZone timeZone = this.f936a.getTimeZone();
            try {
                date = new Date(this.f936a.parse(M).getTime());
                this.f936a.setTimeZone(timeZone);
            } catch (ParseException e9) {
                throw new RuntimeException("Failed parsing '" + M + "' as SQL Date; at path " + aVar.A(true), e9);
            }
        }
        return date;
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.B();
            return;
        }
        synchronized (this) {
            format = this.f936a.format((java.util.Date) date);
        }
        bVar.I(format);
    }

    private a() {
        this.f936a = new SimpleDateFormat("MMM d, yyyy");
    }
}
