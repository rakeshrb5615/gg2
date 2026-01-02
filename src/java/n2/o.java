package n2;

import android.content.Context;
import android.opengl.GLES20;
import j5.t1;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class o extends c4.b {

    /* renamed from: c  reason: collision with root package name */
    public int f4658c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4659d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4660e;

    /* renamed from: f  reason: collision with root package name */
    public FloatBuffer f4661f;

    /* renamed from: g  reason: collision with root package name */
    public float f4662g;

    /* renamed from: h  reason: collision with root package name */
    public float[] f4663h;
    public final float[] i;
    public final float[] j;

    /* renamed from: k  reason: collision with root package name */
    public final float[] f4664k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4665l;

    public o(Context context) {
        float[] fArr = new float[16];
        this.i = fArr;
        float[] fArr2 = new float[16];
        this.j = fArr2;
        float[] fArr3 = new float[16];
        this.f4664k = fArr3;
        this.f4665l = false;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.f4661f = asFloatBuffer;
        asFloatBuffer.put(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
        this.f4661f.position(0);
        int M = c4.b.M(35633, q4.b.l("MfzI+f+y1B50XqZJ8b0DaNjidKlxynZC+adhP0iBm5Y+p7R63ZmdNrK31Ej4ADtCtAx0ZYCo7SQK3nk2o8HvYbkO391Bp3P9Ge8fLpmLAKfLgMrsts1BFRkZLDPeTEX95mwqGaqdOzC1DQeAFJgK59ZG0wbvrMWW0rnIONbpPGf0lBxgrX5X9peG14aBR8FnAXjAhDn81xrFUgBHTT90jqYJaMnMqeeOsWzWqLxxTzk="));
        int M2 = c4.b.M(35632, q4.b.l("KOd+G86ICKS0CZskYfaItKQP4Bwte+UpsY8uxv7BkzZ8tZBWdwoFclTnGUQUT3O/Zxps3GsUzmQiFBJNzuMJyFzv79LwEaTvEJi1jCdBlCng8ZGCd/tbGhvNH1CQrdlX"));
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, M);
        GLES20.glAttachShader(glCreateProgram, M2);
        GLES20.glLinkProgram(glCreateProgram);
        this.f4658c = glCreateProgram;
        this.f4659d = GLES20.glGetAttribLocation(glCreateProgram, "a_Position");
        this.f4660e = GLES20.glGetUniformLocation(this.f4658c, "u_Color");
        c4.b.a0(fArr, fArr2, fArr3, -1.0f, 1.0f, -1.0f, 1.0f);
        i2.m.d().e("dimmer");
        float f9 = t1.z(context).getInt(context.getString(2131951815), 0) * 0.01f;
        this.f4662g = f9;
        this.f4663h = new float[]{0.0f, 0.0f, 0.0f, f9};
        this.f4665l = f9 != 0.0f;
        if (f9 != f9) {
            this.f4662g = Math.max(0.0f, Math.min(1.0f, f9));
        }
    }

    public final void k0() {
        if (this.f4665l) {
            GLES20.glUseProgram(this.f4658c);
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 771);
            int i = this.f4659d;
            GLES20.glEnableVertexAttribArray(i);
            GLES20.glVertexAttribPointer(this.f4659d, 2, 5126, false, 0, (Buffer) this.f4661f);
            float[] fArr = this.f4663h;
            fArr[3] = this.f4662g;
            GLES20.glUniform4fv(this.f4660e, 1, fArr, 0);
            c4.b.g0(this.f4658c, this.i, this.j, this.f4664k, 0.0f);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(i);
            GLES20.glBindTexture(3553, 0);
            GLES20.glUseProgram(0);
            GLES20.glDisable(3042);
        }
    }
}
