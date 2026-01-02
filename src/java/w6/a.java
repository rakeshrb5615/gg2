package w6;

import java.lang.reflect.Field;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public enum a extends h {
    public a() {
        super("IDENTITY", 0);
    }

    @Override // w6.h
    public final String b(Field field) {
        return field.getName();
    }
}
