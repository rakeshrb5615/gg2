package n2;

import android.content.Context;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class b extends c4.b {

    /* renamed from: w  reason: collision with root package name */
    public static final float[] f4429w = {-1.0f, -1.0f, 0.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: c  reason: collision with root package name */
    public FloatBuffer f4430c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f4431d;

    /* renamed from: e  reason: collision with root package name */
    public int f4432e;

    /* renamed from: f  reason: collision with root package name */
    public int f4433f;

    /* renamed from: g  reason: collision with root package name */
    public int f4434g;

    /* renamed from: h  reason: collision with root package name */
    public int f4435h;
    public int i;
    public int j;

    /* renamed from: k  reason: collision with root package name */
    public int f4436k;

    /* renamed from: l  reason: collision with root package name */
    public float f4437l = 0.0f;

    /* renamed from: m  reason: collision with root package name */
    public int f4438m;

    /* renamed from: n  reason: collision with root package name */
    public int f4439n;

    /* renamed from: o  reason: collision with root package name */
    public int f4440o;

    /* renamed from: p  reason: collision with root package name */
    public int f4441p;
    public int q;

    /* renamed from: r  reason: collision with root package name */
    public int f4442r;

    /* renamed from: s  reason: collision with root package name */
    public int f4443s;

    /* renamed from: t  reason: collision with root package name */
    public int f4444t;

    /* renamed from: u  reason: collision with root package name */
    public int f4445u;

    /* renamed from: v  reason: collision with root package name */
    public int f4446v;

    public b(Context context) {
        this.f4431d = context;
    }

    public final void k0() {
        if (m2.a.e(this.f4431d)) {
            GLES20.glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
        } else {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        }
        GLES20.glClear(16640);
    }

    public final void l0(float f9) {
        int i = this.f4441p;
        if (i == 0) {
            i = this.f4440o;
        }
        if (i == 0) {
            return;
        }
        if (f9 <= 0.0f) {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, this.j, this.f4436k);
            k0();
            GLES20.glDisable(2929);
            this.f4437l = 0.0f;
            m0(i, false);
        } else if (f9 == 0.0f) {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, this.j, this.f4436k);
            k0();
            this.f4437l = 0.0f;
            int i9 = this.f4441p;
            if (i9 == 0) {
                return;
            }
            m0(i9, false);
        } else {
            GLES20.glBindFramebuffer(36160, this.q);
            GLES20.glViewport(0, 0, this.f4445u, this.f4446v);
            k0();
            this.f4437l = 0.0f;
            m0(this.f4441p, false);
            GLES20.glBindFramebuffer(36160, this.f4443s);
            GLES20.glViewport(0, 0, this.f4445u, this.f4446v);
            k0();
            this.f4437l = f9;
            m0(this.f4442r, true);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, this.j, this.f4436k);
            k0();
            this.f4437l = f9;
            m0(this.f4444t, false);
        }
    }

    public final void m0(int i, boolean z9) {
        GLES20.glUseProgram(this.f4432e);
        GLES20.glEnableVertexAttribArray(this.f4433f);
        GLES20.glEnableVertexAttribArray(this.f4434g);
        this.f4430c.position(0);
        GLES20.glVertexAttribPointer(this.f4433f, 2, 5126, false, 16, (Buffer) this.f4430c);
        this.f4430c.position(2);
        GLES20.glVertexAttribPointer(this.f4434g, 2, 5126, false, 16, (Buffer) this.f4430c);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glUniform1i(this.f4435h, 0);
        GLES20.glUniform2f(this.i, z9 ? this.f4437l / this.j : 0.0f, z9 ? 0.0f : this.f4437l / this.f4436k);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f4433f);
        GLES20.glDisableVertexAttribArray(this.f4434g);
    }
}
