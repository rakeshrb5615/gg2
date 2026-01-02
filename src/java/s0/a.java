package s0;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import j6.o;
import n.w;
import q0.c;
import q0.d;
import q0.e;
import q0.q0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class a extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a5.a f5775a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InputConnection inputConnection, a5.a aVar) {
        super(inputConnection, false);
        this.f5775a = aVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        d dVar;
        o oVar = inputContentInfo == null ? null : new o(new o(inputContentInfo, 13), 14);
        w wVar = (w) this.f5775a.f561b;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((o) oVar.f3275b).f3275b).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((o) oVar.f3275b).f3275b;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e9) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e9);
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = (InputContentInfo) ((o) oVar.f3275b).f3275b;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            dVar = new c(clipData, 2);
        } else {
            e eVar = new e();
            eVar.f5116b = clipData;
            eVar.f5117c = 2;
            dVar = eVar;
        }
        dVar.e(inputContentInfo3.getLinkUri());
        dVar.setExtras(bundle2);
        if (q0.j(wVar, dVar.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
