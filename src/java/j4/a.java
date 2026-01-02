package j4;

import java.util.HashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f2862a;

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f2863b;

    static {
        HashMap hashMap = new HashMap();
        f2862a = hashMap;
        HashMap hashMap2 = new HashMap();
        f2863b = hashMap2;
        hashMap.put(-1, "The Play Store app is either not installed or not the official version.");
        hashMap.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        hashMap.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        hashMap2.put(-1, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(-2, "INVALID_REQUEST");
        hashMap2.put(-100, "INTERNAL_ERROR");
    }
}
