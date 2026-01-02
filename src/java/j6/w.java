package j6;

import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class w {

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f3295d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a  reason: collision with root package name */
    public final String f3296a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3297b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3298c;

    public w(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        }
        if (str3 == null || !f3295d.matcher(str3).matches()) {
            throw new IllegalArgumentException(v1.a.l("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f3296a = str3;
        this.f3297b = str;
        this.f3298c = g2.g.e(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            return this.f3296a.equals(wVar.f3296a) && this.f3297b.equals(wVar.f3297b);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.f3297b, this.f3296a});
    }
}
