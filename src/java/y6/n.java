package y6;

import java.util.Map;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class n implements Map.Entry {

    /* renamed from: a  reason: collision with root package name */
    public n f6933a;

    /* renamed from: b  reason: collision with root package name */
    public n f6934b;

    /* renamed from: c  reason: collision with root package name */
    public n f6935c;

    /* renamed from: d  reason: collision with root package name */
    public n f6936d;

    /* renamed from: e  reason: collision with root package name */
    public n f6937e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f6938f;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f6939m;

    /* renamed from: n  reason: collision with root package name */
    public Object f6940n;

    /* renamed from: o  reason: collision with root package name */
    public int f6941o;

    public n(boolean z9) {
        this.f6938f = null;
        this.f6939m = z9;
        this.f6937e = this;
        this.f6936d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f6938f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f6940n;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f6938f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f6940n;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f6938f;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f6940n;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj != null || this.f6939m) {
            Object obj2 = this.f6940n;
            this.f6940n = obj;
            return obj2;
        }
        throw new NullPointerException("value == null");
    }

    public final String toString() {
        return this.f6938f + "=" + this.f6940n;
    }

    public n(boolean z9, n nVar, Object obj, n nVar2, n nVar3) {
        this.f6933a = nVar;
        this.f6938f = obj;
        this.f6939m = z9;
        this.f6941o = 1;
        this.f6936d = nVar2;
        this.f6937e = nVar3;
        nVar3.f6936d = this;
        nVar2.f6937e = this;
    }
}
