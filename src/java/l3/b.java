package l3;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import q3.h;
import q3.i;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class b extends q4.b {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3748f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f3749g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, int i) {
        super(26);
        this.f3748f = i;
        this.f3749g = obj;
    }

    private final void V(int i) {
    }

    @Override // q4.b
    public final void I(int i) {
        switch (this.f3748f) {
            case 0:
                return;
            default:
                i iVar = (i) this.f3749g;
                iVar.f5363d = true;
                h hVar = (h) iVar.f5364e.get();
                if (hVar != null) {
                    hVar.a();
                    return;
                }
                return;
        }
    }

    @Override // q4.b
    public final void J(Typeface typeface, boolean z9) {
        switch (this.f3748f) {
            case 0:
                Chip chip = (Chip) this.f3749g;
                f fVar = chip.e;
                chip.setText(fVar.R0 ? fVar.T : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (z9) {
                    return;
                }
                i iVar = (i) this.f3749g;
                iVar.f5363d = true;
                h hVar = (h) iVar.f5364e.get();
                if (hVar != null) {
                    hVar.a();
                    return;
                }
                return;
        }
    }
}
