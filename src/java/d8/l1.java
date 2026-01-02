package d8;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class l1 implements b1 {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1212b = AtomicIntegerFieldUpdater.newUpdater(l1.class, "_isCompleting$volatile");

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1213c = AtomicReferenceFieldUpdater.newUpdater(l1.class, Object.class, "_rootCause$volatile");

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1214d = AtomicReferenceFieldUpdater.newUpdater(l1.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* renamed from: a  reason: collision with root package name */
    public final s1 f1215a;

    public l1(s1 s1Var, Throwable th) {
        this.f1215a = s1Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable b10 = b();
        if (b10 == null) {
            f1213c.set(this, th);
        } else if (th == b10) {
        } else {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1214d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th);
            } else if (!(obj instanceof Throwable)) {
                if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                    return;
                }
                throw new IllegalStateException(("State is " + obj).toString());
            } else if (th == obj) {
            } else {
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(obj);
                arrayList.add(th);
                atomicReferenceFieldUpdater.set(this, arrayList);
            }
        }
    }

    public final Throwable b() {
        return (Throwable) f1213c.get(this);
    }

    @Override // d8.b1
    public final s1 c() {
        return this.f1215a;
    }

    public final boolean d() {
        return b() != null;
    }

    public final ArrayList e(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1214d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else if (!(obj instanceof ArrayList)) {
            throw new IllegalStateException(("State is " + obj).toString());
        } else {
            arrayList = (ArrayList) obj;
        }
        Throwable b10 = b();
        if (b10 != null) {
            arrayList.add(0, b10);
        }
        if (th != null && !th.equals(b10)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, f0.f1192h);
        return arrayList;
    }

    @Override // d8.b1
    public final boolean isActive() {
        return b() == null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(d());
        sb.append(", completing=");
        sb.append(f1212b.get(this) != 0);
        sb.append(", rootCause=");
        sb.append(b());
        sb.append(", exceptions=");
        sb.append(f1214d.get(this));
        sb.append(", list=");
        sb.append(this.f1215a);
        sb.append(']');
        return sb.toString();
    }
}
