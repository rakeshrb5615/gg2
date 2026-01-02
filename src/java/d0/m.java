package d0;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class m extends q {

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f1020b;

    /* renamed from: c  reason: collision with root package name */
    public IconCompat f1021c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1022d;

    @Override // d0.q
    public final void a(j6.s sVar) {
        Bitmap bitmap;
        Context context = (Context) sVar.f3282b;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) sVar.f3283c).setBigContentTitle(null);
        IconCompat iconCompat = this.f1020b;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                l.a(bigContentTitle, iconCompat.e(context));
            } else if (iconCompat.c() == 1) {
                IconCompat iconCompat2 = this.f1020b;
                int i = iconCompat2.a;
                if (i == -1) {
                    Object obj = iconCompat2.b;
                    bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    bitmap = (Bitmap) iconCompat2.b;
                } else if (i != 5) {
                    throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                } else {
                    Bitmap bitmap2 = (Bitmap) iconCompat2.b;
                    int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                    Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint(3);
                    float f9 = min;
                    float f10 = 0.5f * f9;
                    float f11 = 0.9166667f * f10;
                    float f12 = 0.010416667f * f9;
                    paint.setColor(0);
                    paint.setShadowLayer(f12, 0.0f, f9 * 0.020833334f, 1023410176);
                    canvas.drawCircle(f10, f10, f11, paint);
                    paint.setShadowLayer(f12, 0.0f, 0.0f, 503316480);
                    canvas.drawCircle(f10, f10, f11, paint);
                    paint.clearShadowLayer();
                    paint.setColor(-16777216);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                    Matrix matrix = new Matrix();
                    matrix.setTranslate((-(bitmap2.getWidth() - min)) / 2.0f, (-(bitmap2.getHeight() - min)) / 2.0f);
                    bitmapShader.setLocalMatrix(matrix);
                    paint.setShader(bitmapShader);
                    canvas.drawCircle(f10, f10, f11, paint);
                    canvas.setBitmap(null);
                    bitmap = createBitmap;
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmap);
            }
        }
        if (this.f1022d) {
            IconCompat iconCompat3 = this.f1021c;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                k.a(bigContentTitle, iconCompat3.e(context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            l.c(bigContentTitle, false);
            l.b(bigContentTitle, null);
        }
    }

    @Override // d0.q
    public final String b() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
