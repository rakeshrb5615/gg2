package j6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class n implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final URL f3271a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Future f3272b;

    /* renamed from: c  reason: collision with root package name */
    public Task f3273c;

    public n(URL url) {
        this.f3271a = url;
    }

    public final Bitmap c() {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.f3271a;
        if (isLoggable) {
            Log.i("FirebaseMessaging", "Starting download of: " + url);
        }
        URLConnection openConnection = url.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] T = q4.b.T(new d(inputStream));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + T.length + " bytes from " + url);
                }
                if (T.length <= 1048576) {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(T, 0, T.length);
                    if (decodeByteArray == null) {
                        throw new IOException("Failed to decode image: " + url);
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Successfully downloaded image: " + url);
                    }
                    return decodeByteArray;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3272b.cancel(true);
    }
}
