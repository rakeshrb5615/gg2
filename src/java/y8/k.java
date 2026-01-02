package y8;

import java.io.IOException;
import kotlin.jvm.internal.r;
import u7.p;
import x8.b0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final /* synthetic */ class k implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7008a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r f7009b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b0 f7010c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ r f7011d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ r f7012e;

    public /* synthetic */ k(r rVar, b0 b0Var, r rVar2, r rVar3) {
        this.f7009b = rVar;
        this.f7010c = b0Var;
        this.f7011d = rVar2;
        this.f7012e = rVar3;
    }

    @Override // u7.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f7008a;
        int intValue = ((Integer) obj).intValue();
        Long l5 = (Long) obj2;
        switch (i) {
            case 0:
                long longValue = l5.longValue();
                if (intValue == 21589) {
                    if (longValue < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    b0 b0Var = this.f7010c;
                    byte readByte = b0Var.readByte();
                    boolean z9 = (readByte & 1) == 1;
                    boolean z10 = (readByte & 2) == 2;
                    boolean z11 = (readByte & 4) == 4;
                    long j = z9 ? 5L : 1L;
                    if (z10) {
                        j += 4;
                    }
                    if (z11) {
                        j += 4;
                    }
                    if (longValue < j) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z9) {
                        this.f7009b.a = Integer.valueOf(b0Var.f());
                    }
                    if (z10) {
                        this.f7011d.a = Integer.valueOf(b0Var.f());
                    }
                    if (z11) {
                        this.f7012e.a = Integer.valueOf(b0Var.f());
                    }
                }
                return h7.l.f2236a;
            default:
                long longValue2 = l5.longValue();
                if (intValue == 1) {
                    r rVar = this.f7009b;
                    if (rVar.a != null) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (longValue2 != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    b0 b0Var2 = this.f7010c;
                    rVar.a = Long.valueOf(b0Var2.i());
                    this.f7011d.a = Long.valueOf(b0Var2.i());
                    this.f7012e.a = Long.valueOf(b0Var2.i());
                }
                return h7.l.f2236a;
        }
    }

    public /* synthetic */ k(b0 b0Var, r rVar, r rVar2, r rVar3) {
        this.f7010c = b0Var;
        this.f7009b = rVar;
        this.f7011d = rVar2;
        this.f7012e = rVar3;
    }
}
