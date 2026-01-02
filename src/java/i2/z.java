package i2;

import android.util.Log;
import android.view.View;
import com.chilllive.chillwallpaperproject.MainActivity;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class z implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2638a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MainActivity f2639b;

    public /* synthetic */ z(MainActivity mainActivity, int i) {
        this.f2638a = i;
        this.f2639b = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f2638a;
        MainActivity mainActivity = this.f2639b;
        switch (i) {
            case 0:
                int i9 = MainActivity.f958u0;
                mainActivity.onclickContact(null);
                return;
            case 1:
                mainActivity.n(2131951936, mainActivity.f973k0, 0);
                return;
            case 2:
                mainActivity.n(2131952294, mainActivity.l0, 0);
                return;
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                int i10 = MainActivity.f958u0;
                mainActivity.n(2131951655, 2131886080, 0);
                return;
            case 4:
                int i11 = MainActivity.f958u0;
                mainActivity.onclickHelp(null);
                return;
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                c4.e eVar = mainActivity.f961b0;
                c4.l lVar = eVar.f908a;
                String packageName = eVar.f910c.getPackageName();
                d4.r rVar = lVar.f923a;
                if (rVar != null) {
                    c4.l.f921e.h("completeUpdate(%s)", packageName);
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                    rVar.a().post(new c4.h(rVar, taskCompletionSource, taskCompletionSource, new c4.h(lVar, taskCompletionSource, taskCompletionSource, packageName, 1), 2));
                    taskCompletionSource.getTask();
                    return;
                }
                d4.l lVar2 = c4.l.f921e;
                Object[] objArr = {-9};
                lVar2.getClass();
                if (Log.isLoggable("PlayCore", 6)) {
                    Log.e("PlayCore", d4.l.j(lVar2.f1097b, "onError(%d)", objArr));
                }
                Tasks.forException(new e4.a(-9));
                return;
            default:
                int i12 = MainActivity.f958u0;
                mainActivity.onClickLanguages(null);
                return;
        }
    }
}
