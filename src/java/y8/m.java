package y8;

import java.util.logging.Logger;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f7022a = Logger.getLogger("okio.Okio");

    public static final boolean a(AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? b8.i.s0(message, "getsockname failed") : false) {
                return true;
            }
        }
        return false;
    }
}
