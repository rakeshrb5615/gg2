package n2;

import android.content.Context;
import android.content.SharedPreferences;
import android.opengl.GLES20;
import java.nio.FloatBuffer;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class i extends c4.b {
    public boolean G;

    /* renamed from: f  reason: collision with root package name */
    public float f4537f;

    /* renamed from: g  reason: collision with root package name */
    public float f4538g;

    /* renamed from: h  reason: collision with root package name */
    public float f4539h;
    public float i;
    public float j;

    /* renamed from: l  reason: collision with root package name */
    public int f4541l;

    /* renamed from: m  reason: collision with root package name */
    public int f4542m;

    /* renamed from: n  reason: collision with root package name */
    public int f4543n;

    /* renamed from: o  reason: collision with root package name */
    public int f4544o;

    /* renamed from: p  reason: collision with root package name */
    public int f4545p;
    public int q;

    /* renamed from: r  reason: collision with root package name */
    public int f4546r;

    /* renamed from: s  reason: collision with root package name */
    public int f4547s;

    /* renamed from: t  reason: collision with root package name */
    public int f4548t;

    /* renamed from: u  reason: collision with root package name */
    public int f4549u;

    /* renamed from: v  reason: collision with root package name */
    public int f4550v;

    /* renamed from: c  reason: collision with root package name */
    public final float[] f4534c = new float[16];

    /* renamed from: d  reason: collision with root package name */
    public final float[] f4535d = new float[16];

    /* renamed from: e  reason: collision with root package name */
    public final float[] f4536e = new float[16];

    /* renamed from: w  reason: collision with root package name */
    public float f4551w = 0.5f;

    /* renamed from: x  reason: collision with root package name */
    public float f4552x = 0.5f;

    /* renamed from: y  reason: collision with root package name */
    public float f4553y = 0.0f;

    /* renamed from: z  reason: collision with root package name */
    public float f4554z = 1.0f;
    public float A = 1.0f;
    public final float[] B = {0.99f, 0.99f, 0.99f, 1.0f};
    public float C = 0.2f;
    public float D = 0.1f;
    public float E = 0.04f;
    public float F = 1.0f;

    /* renamed from: k  reason: collision with root package name */
    public final FloatBuffer f4540k = c4.b.q(c4.b.A());

    public i() {
        i2.m.d().e("moon");
    }

    public final void k0(Context context, SharedPreferences sharedPreferences) {
        int M = c4.b.M(35633, q4.b.l("31CvLSW49ZsWqEJmlVijDBAlfN6a6sHyCd43LWRR14C7sc7PDx3CFahvAtzIDVlUlm0oNsG/E8rOX6GOxetIisNJd5Dy3ZbR8A2D3JZNfzKhFOxCao2tvfqUtDwU/2KfkwxJXQZReQCqswmUKuakUy3xNzMUqBUa7xUeYvcZDR8auO/jQnM113gwvpS3TBVwNk/wQLtYCmGKeriDtf+DMw=="));
        int M2 = c4.b.M(35632, q4.b.l("KOd+G86ICKS0CZskYfaItEzE4YLlflhTcRtN/7tyM6Byl54G5/roMxTF7tuJI0/VSxMzSfJQoas44UzWKQTPN8fAr2UzchI4FGTh73+84lf3yeXT05LmDwOko6aomS7IyjYduzdd8vnG/+IHCBs5xmcCEJwF7qVa8SeVZHIqZtp82YwGbdp6N3f3oUr/xt6jR+/rVFVzbawy9p9Klg6wDhA88CKBC0M2Q8taYyuZf7U72MMtO4XHKPj8mdnRTFpaMatE2ecDsBVZ/pClm6KOufPwE0PlcNnDQPKAJyUYTg70Tb+t9OzGp/INEcNDcB4hpakhBFmCYBrTPSfr/6ywH2QHgB9FoMcvOL9bH+cTaAby2t7EX2Rn+tjHQivTEzEnuI5xw74t1UC6sOCF050vAwb1JvBwpO3PPdAqwQHGI6N1GZaNCcRl8GFrTAHwDj2wQpymuac+vbc2dXiarp1tRTqIRR6zSz00ShYnNayuqckoQtyuoljj3UYg2+SYxlt5+BacEJBYAl3IbrRBDDdFg/eoAcHAfQJJ4hJchiQrvCQCvpL+nIRo55E6oYU6AjXjnoKuTo2exYRhbv0iNz8EUQnMLPN3BE6cswc+HSrJJLaV1VKUadRYej97uC+9NQgZPAXmf0PIn4gOjxU9uU9Vb84Sgi77lBmp/NFZDmbJkQ/i1bkYObvMuUTR9q/LAFNxr5SNNrIqtXV7TLSgvhHeeeXQYbwKy2z3hCUlA/jYqSrfj033EdBlJZqOOA8NE45LnPjc+3UuxjlmyVpASg03W3Ykq1exmtcOUvpVE742PaWDfe/dUDzoSR3951PgMhdEkcO7W7gwtgsxAd1Ch8pKdCcrw65gKnS9rhULCLWHe4v6+O7wQQW/PC2X4hTv6juD/HPepRneH3PkfOOPYhSc/7IX5DO5C/s9FJ8W4vrhUOYKOjDb6guQVGH6rvbbE9TPsDRRF/AN9jFJW5lrDeS6UP2gqrVemt9Ur6QuEZugka0utntLkBD6RoVFTYVAsvPvSbLRuxdWDndgPXnAEw4IA4ooQx8Xu9YOgiQ3sdIiZzeqQU26N9m3hu28hgluVlsPbZ32H2o08TcTFAlPp2TMqDn+MsNbJ7nF05qMOv4e+XN20ZyXtaBq5aSKbN3XcXlZyeHczSbILeoYRB8CC4iUHmqJyZBCH1LebHV522flK4AseFTKWJGvx8LDG87OceSmk67DM/92xAOWAw3Ky3qu7Cn4umdWEwlg9MAyZa/MrbOn02y2LHRBetPDzs7Oxdfu+V2ei5h/daNZcoqk1IKTcd3+TB/hW7fAoWb13OGJfTd5CQPeEo2i5o43bv2KwyAyDpxuDVzWyWxj0yQ8r2qN3FTqSMG8Z61+vtpPTSb67DTE67tFvZNVBnPBRQGYO6sYfosX9emVD49EdHE5LOvpAZusLku40+gvdjGhYSkv7KwuMOvUkRVgeZY/+K+4FQIgFy2KzQ7Qih+9q0RY3ZYyVLTrnvlvXwNBcwRpZBwHrL96AqZo9Lieu12NwLf8iHc0SuyICV3tEIWQOHa7uJ3QnBb3g6BO7ByJdUjdDvNtDJcMakdl7SJiS6Rf0p9sdTCjjsW5IqDXXPv61ZduOjXA6b3wdcp13kmhUsjvQZbEllSTdAZnmeEtLpyulvNA/NeWNYdDVuX59ryVAIiJj3f9MBOgKWeuEFYIy4Iy1HOAFwNXPnGiZFPZhCuE/PWV68DN4onFjp2fGLkawq9cvxoYD9/VNiqr3KckQWCoOpuzCd0="));
        int glCreateProgram = GLES20.glCreateProgram();
        this.f4541l = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, M);
        GLES20.glAttachShader(this.f4541l, M2);
        GLES20.glLinkProgram(this.f4541l);
        this.f4542m = GLES20.glGetAttribLocation(this.f4541l, "vPosition");
        this.f4543n = GLES20.glGetUniformLocation(this.f4541l, "u_MVPMatrix");
        this.f4544o = GLES20.glGetUniformLocation(this.f4541l, "uColor");
        this.f4545p = GLES20.glGetUniformLocation(this.f4541l, "uPhaseFactor");
        this.q = GLES20.glGetUniformLocation(this.f4541l, "uDirection");
        this.f4546r = GLES20.glGetUniformLocation(this.f4541l, "uPixelScale");
        this.f4547s = GLES20.glGetUniformLocation(this.f4541l, "uGlowIntensity");
        this.f4548t = GLES20.glGetUniformLocation(this.f4541l, "uEarthShine");
        this.f4549u = GLES20.glGetUniformLocation(this.f4541l, "uShadowDepth");
        this.f4550v = GLES20.glGetUniformLocation(this.f4541l, "uAlpha");
        this.G = sharedPreferences.getBoolean(context.getString(2131952103), true);
    }
}
