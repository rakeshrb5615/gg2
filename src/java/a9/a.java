package a9;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import l6.c;
import w6.m;
import z8.l;
import z8.s0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class a extends l {

    /* renamed from: a  reason: collision with root package name */
    public final m f675a;

    public a(m mVar) {
        this.f675a = mVar;
    }

    @Override // z8.l
    public final z8.m a(Type type) {
        d7.a aVar = new d7.a(type);
        m mVar = this.f675a;
        return new b(mVar, mVar.b(aVar));
    }

    @Override // z8.l
    public final z8.m b(Type type, Annotation[] annotationArr, s0 s0Var) {
        d7.a aVar = new d7.a(type);
        m mVar = this.f675a;
        return new c(mVar, mVar.b(aVar));
    }
}
