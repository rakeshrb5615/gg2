package i2;

import android.opengl.GLSurfaceView;
import android.view.Choreographer;
import com.chilllive.chillwallpaperproject.MainActivity;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class j0 implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MainActivity f2389a;

    public j0(MainActivity mainActivity) {
        this.f2389a = mainActivity;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        GLSurfaceView gLSurfaceView = this.f2389a.f976n;
        if (gLSurfaceView != null) {
            gLSurfaceView.requestRender();
        }
        Choreographer.getInstance().postFrameCallback(this);
    }
}
