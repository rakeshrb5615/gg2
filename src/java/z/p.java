package z;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class p extends View {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7174a;

    public p(Context context) {
        super(context);
        this.f7174a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i9) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z9) {
        this.f7174a = z9;
    }

    public void setGuidelineBegin(int i) {
        e eVar = (e) getLayoutParams();
        if (this.f7174a && eVar.f7041a == i) {
            return;
        }
        eVar.f7041a = i;
        setLayoutParams(eVar);
    }

    public void setGuidelineEnd(int i) {
        e eVar = (e) getLayoutParams();
        if (this.f7174a && eVar.f7043b == i) {
            return;
        }
        eVar.f7043b = i;
        setLayoutParams(eVar);
    }

    public void setGuidelinePercent(float f9) {
        e eVar = (e) getLayoutParams();
        if (this.f7174a && eVar.f7045c == f9) {
            return;
        }
        eVar.f7045c = f9;
        setLayoutParams(eVar);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
