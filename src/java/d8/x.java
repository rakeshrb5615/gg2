package d8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final /* synthetic */ class x implements u7.p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1260a;

    public /* synthetic */ x(int i) {
        this.f1260a = i;
    }

    @Override // u7.p
    public final Object invoke(Object obj, Object obj2) {
        l7.b bVar;
        switch (this.f1260a) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                l7.f fVar = (l7.f) obj2;
                return bool;
            case 1:
                return ((l7.h) obj).plus((l7.f) obj2);
            case 2:
                return ((l7.h) obj).plus((l7.f) obj2);
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                l7.f fVar2 = (l7.f) obj2;
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 4:
                l7.f fVar3 = (l7.f) obj2;
                if (fVar3 instanceof y1) {
                    Integer num = obj instanceof Integer ? (Integer) obj : null;
                    int intValue = num != null ? num.intValue() : 1;
                    return intValue == 0 ? fVar3 : Integer.valueOf(intValue + 1);
                }
                return obj;
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                y1 y1Var = (y1) obj;
                l7.f fVar4 = (l7.f) obj2;
                if (y1Var != null) {
                    return y1Var;
                }
                if (fVar4 instanceof y1) {
                    return (y1) fVar4;
                }
                return null;
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                l7.f fVar5 = (l7.f) obj2;
                return (i8.v) obj;
            case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                String str = (String) obj;
                l7.f fVar6 = (l7.f) obj2;
                kotlin.jvm.internal.j.e(str, "acc");
                kotlin.jvm.internal.j.e(fVar6, "element");
                if (str.length() == 0) {
                    return fVar6.toString();
                }
                return str + ", " + fVar6;
            default:
                l7.h hVar = (l7.h) obj;
                l7.f fVar7 = (l7.f) obj2;
                kotlin.jvm.internal.j.e(hVar, "acc");
                kotlin.jvm.internal.j.e(fVar7, "element");
                l7.h minusKey = hVar.minusKey(fVar7.getKey());
                l7.i iVar = l7.i.f3796a;
                if (minusKey == iVar) {
                    return fVar7;
                }
                l7.d dVar = l7.d.f3795a;
                l7.e eVar = (l7.e) minusKey.get(dVar);
                if (eVar == null) {
                    bVar = new l7.b(fVar7, minusKey);
                } else {
                    l7.h minusKey2 = minusKey.minusKey(dVar);
                    if (minusKey2 == iVar) {
                        return new l7.b(eVar, fVar7);
                    }
                    bVar = new l7.b(eVar, new l7.b(fVar7, minusKey2));
                }
                return bVar;
        }
    }
}
