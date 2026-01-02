package i2;

import android.content.SharedPreferences;
import com.chilllive.chillwallpaperproject.MainActivity;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class c0 implements SharedPreferences.OnSharedPreferenceChangeListener {
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        String str2;
        int i = MainActivity.f958u0;
        switch (str.hashCode()) {
            case -1980407683:
                str2 = "cloudCoverKey";
                break;
            case 338844318:
                str2 = "weatherCodeKey";
                break;
            case 1369998646:
                str2 = "windStrengthKey";
                break;
            case 2109709988:
                str2 = "precipitationAmountKey";
                break;
            default:
                return;
        }
        str.equals(str2);
    }
}
