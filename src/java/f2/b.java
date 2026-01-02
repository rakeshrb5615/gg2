package f2;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class b extends Property {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1402a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i, Class cls) {
        super(cls, str);
        this.f1402a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f1402a) {
            case 0:
                e eVar = (e) obj;
                return null;
            case 1:
                e eVar2 = (e) obj;
                return null;
            case 2:
                View view = (View) obj;
                return null;
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                View view2 = (View) obj;
                return null;
            case 4:
                View view3 = (View) obj;
                return null;
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                return Float.valueOf(c0.f1403a.G((View) obj));
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((View) obj).getClipBounds();
            default:
                return Float.valueOf(((SwitchCompat) obj).F);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f1402a) {
            case 0:
                e eVar = (e) obj;
                PointF pointF = (PointF) obj2;
                eVar.getClass();
                eVar.f1410a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                eVar.f1411b = round;
                int i = eVar.f1415f + 1;
                eVar.f1415f = i;
                if (i == eVar.f1416g) {
                    c0.a(eVar.f1414e, eVar.f1410a, round, eVar.f1412c, eVar.f1413d);
                    eVar.f1415f = 0;
                    eVar.f1416g = 0;
                    return;
                }
                return;
            case 1:
                e eVar2 = (e) obj;
                PointF pointF2 = (PointF) obj2;
                eVar2.getClass();
                eVar2.f1412c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                eVar2.f1413d = round2;
                int i9 = eVar2.f1416g + 1;
                eVar2.f1416g = i9;
                if (eVar2.f1415f == i9) {
                    c0.a(eVar2.f1414e, eVar2.f1410a, eVar2.f1411b, eVar2.f1412c, round2);
                    eVar2.f1415f = 0;
                    eVar2.f1416g = 0;
                    return;
                }
                return;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                c0.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                return;
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                c0.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                return;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                c0.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                return;
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                float floatValue = ((Float) obj2).floatValue();
                c0.f1403a.S((View) obj, floatValue);
                return;
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                ((View) obj).setClipBounds((Rect) obj2);
                return;
            default:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                return;
        }
    }
}
