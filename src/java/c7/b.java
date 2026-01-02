package c7;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import w6.a0;
import w6.m;
import w6.z;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class b extends z {

    /* renamed from: b  reason: collision with root package name */
    public static final a f937b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final SimpleDateFormat f938a;

    /* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
    public class a implements a0 {
        @Override // w6.a0
        public final z a(m mVar, d7.a aVar) {
            if (aVar.f1153a == Time.class) {
                return new b(0);
            }
            return null;
        }
    }

    public /* synthetic */ b(int i) {
        this();
    }

    @Override // w6.z
    public final Object b(e7.a aVar) {
        Time time;
        if (aVar.O() == 9) {
            aVar.K();
            return null;
        }
        String M = aVar.M();
        synchronized (this) {
            TimeZone timeZone = this.f938a.getTimeZone();
            try {
                time = new Time(this.f938a.parse(M).getTime());
                this.f938a.setTimeZone(timeZone);
            } catch (ParseException e9) {
                throw new RuntimeException("Failed parsing '" + M + "' as SQL Time; at path " + aVar.A(true), e9);
            }
        }
        return time;
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            bVar.B();
            return;
        }
        synchronized (this) {
            format = this.f938a.format((Date) time);
        }
        bVar.I(format);
    }

    private b() {
        this.f938a = new SimpleDateFormat("hh:mm:ss a");
    }
}
