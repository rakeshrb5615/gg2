package x6;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public @interface b {
    String[] alternate() default {};

    String value();
}
