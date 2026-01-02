package w6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class j extends z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6464a;

    @Override // w6.z
    public final Object b(e7.a aVar) {
        switch (this.f6464a) {
            case 0:
                if (aVar.O() == 9) {
                    aVar.K();
                    return null;
                }
                return Double.valueOf(aVar.F());
            case 1:
                if (aVar.O() == 9) {
                    aVar.K();
                    return null;
                }
                return Float.valueOf((float) aVar.F());
            default:
                aVar.U();
                return null;
        }
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        switch (this.f6464a) {
            case 0:
                Number number = (Number) obj;
                if (number == null) {
                    bVar.B();
                    return;
                }
                double doubleValue = number.doubleValue();
                m.a(doubleValue);
                bVar.F(doubleValue);
                return;
            case 1:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    bVar.B();
                    return;
                }
                float floatValue = number2.floatValue();
                m.a(floatValue);
                if (!(number2 instanceof Float)) {
                    number2 = Float.valueOf(floatValue);
                }
                bVar.H(number2);
                return;
            default:
                bVar.B();
                return;
        }
    }

    public String toString() {
        switch (this.f6464a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}
