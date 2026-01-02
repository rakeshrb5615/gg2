package n2;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class w extends c4.b {

    /* renamed from: s  reason: collision with root package name */
    public static final float[] f4837s = {0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f};

    /* renamed from: c  reason: collision with root package name */
    public int f4838c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4839d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4840e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4841f;

    /* renamed from: g  reason: collision with root package name */
    public FloatBuffer f4842g;

    /* renamed from: m  reason: collision with root package name */
    public float f4846m;

    /* renamed from: n  reason: collision with root package name */
    public float f4847n;

    /* renamed from: o  reason: collision with root package name */
    public float f4848o;

    /* renamed from: p  reason: collision with root package name */
    public float f4849p;
    public final float[] j = new float[16];

    /* renamed from: k  reason: collision with root package name */
    public final float[] f4844k = new float[16];

    /* renamed from: l  reason: collision with root package name */
    public final float[] f4845l = new float[16];
    public final ArrayDeque q = new ArrayDeque();

    /* renamed from: r  reason: collision with root package name */
    public final ArrayDeque f4850r = new ArrayDeque();

    /* renamed from: h  reason: collision with root package name */
    public ArrayList f4843h = new ArrayList();
    public ArrayList i = new ArrayList();

    public w() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(48);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.f4842g = asFloatBuffer;
        asFloatBuffer.put(f4837s);
        this.f4842g.position(0);
        int M = c4.b.M(35633, q4.b.l("MfzI+f+y1B50XqZJ8b0DaNjidKlxynZC+adhP0iBm5Yu9O8IWDMFv+dYecxLccWlpOAN5ms7o3Tqm9a+svyMBVVK6ORGSnA/rvEL6Nfpo7Ayw8wwpbVuGTgbKipo6pr05sxhLaiTzlIP0WDjqbYmbKxxn7EiJCYf/QYjvgT/xB9o52dbkEZKT2h4FJiSX/s2i+yloWbat2kZ9yFDOWxQAg=="));
        int M2 = c4.b.M(35632, q4.b.l("KOd+G86ICKS0CZskYfaItKQP4Bwte+UpsY8uxv7BkzZ8tZBWdwoFclTnGUQUT3O/y0kFNRpZCYrnvUHRvPntPsIA36Kx6iwAGjNDXpJsktc8Lpy+TDcFIkvY/sHgm0SU"));
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, M);
        GLES20.glAttachShader(glCreateProgram, M2);
        GLES20.glLinkProgram(glCreateProgram);
        this.f4838c = glCreateProgram;
        this.f4839d = GLES20.glGetAttribLocation(glCreateProgram, "a_Position");
        this.f4840e = GLES20.glGetUniformLocation(this.f4838c, "u_Color");
        this.f4841f = GLES20.glGetUniformLocation(this.f4838c, "u_MVPMatrix");
    }

    public final void k0(float f9, float f10, float f11, float f12, float f13, float f14, float f15) {
        float[] fArr = (float[]) this.q.pollFirst();
        if (fArr == null) {
            fArr = new float[4];
        }
        fArr[0] = f9;
        fArr[1] = f10;
        fArr[2] = f11;
        fArr[3] = f12;
        this.f4843h.add(fArr);
        float[] fArr2 = (float[]) this.f4850r.pollFirst();
        if (fArr2 == null) {
            fArr2 = new float[4];
        }
        fArr2[0] = f13;
        fArr2[1] = f14;
        fArr2[2] = f15;
        fArr2[3] = 1.0f;
        this.i.add(fArr2);
    }

    public final void l0(int i, float f9, float f10, float f11, float f12) {
        if (i < 0 || i >= this.i.size()) {
            return;
        }
        float[] fArr = (float[]) this.i.get(i);
        fArr[0] = f9;
        fArr[1] = f10;
        fArr[2] = f11;
        fArr[3] = f12;
    }
}
