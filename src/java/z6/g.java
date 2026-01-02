package z6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class g extends w6.z {

    /* renamed from: c  reason: collision with root package name */
    public static final e f7409c = new e();

    /* renamed from: a  reason: collision with root package name */
    public final f f7410a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f7411b;

    public g() {
        ArrayList arrayList = new ArrayList();
        this.f7411b = arrayList;
        this.f7410a = f.f7408a;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (y6.j.f6924a >= 9) {
            arrayList.add(new SimpleDateFormat(g2.g.e("MMM d, yyyy", " ", "h:mm:ss a"), locale));
        }
    }

    @Override // w6.z
    public final Object b(e7.a aVar) {
        Date b10;
        if (aVar.O() == 9) {
            aVar.K();
            return null;
        }
        String M = aVar.M();
        synchronized (this.f7411b) {
            try {
                ArrayList arrayList = this.f7411b;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        try {
                            b10 = a7.a.b(M, new ParsePosition(0));
                            break;
                        } catch (ParseException e9) {
                            StringBuilder q = v1.a.q("Failed parsing '", M, "' as Date; at path ");
                            q.append(aVar.A(true));
                            throw new RuntimeException(q.toString(), e9);
                        }
                    }
                    Object obj = arrayList.get(i);
                    i++;
                    DateFormat dateFormat = (DateFormat) obj;
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        b10 = dateFormat.parse(M);
                        dateFormat.setTimeZone(timeZone);
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
            } finally {
            }
        }
        this.f7410a.getClass();
        return b10;
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.B();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f7411b.get(0);
        synchronized (this.f7411b) {
            format = dateFormat.format(date);
        }
        bVar.I(format);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f7411b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
