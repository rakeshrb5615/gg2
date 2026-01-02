package n;

import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public class c0 {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f4099d = {16843067, 16843068};

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4100a = 2;

    /* renamed from: b  reason: collision with root package name */
    public View f4101b;

    /* renamed from: c  reason: collision with root package name */
    public Object f4102c;

    public /* synthetic */ c0() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((k2.c) ((l6.c) this.f4102c).f3791b).getClass();
        if (keyListener instanceof i1.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new i1.e(keyListener);
    }

    public void b(AttributeSet attributeSet, int i) {
        switch (this.f4100a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f4101b;
                b8.g p8 = b8.g.p(absSeekBar.getContext(), attributeSet, f4099d, i);
                Drawable j = p8.j(0);
                if (j != null) {
                    if (j instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) j;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i9 = 0; i9 < numberOfFrames; i9++) {
                            Drawable e9 = e(animationDrawable.getFrame(i9), true);
                            e9.setLevel(10000);
                            animationDrawable2.addFrame(e9, animationDrawable.getDuration(i9));
                        }
                        animationDrawable2.setLevel(10000);
                        j = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(j);
                }
                Drawable j8 = p8.j(1);
                if (j8 != null) {
                    absSeekBar.setProgressDrawable(e(j8, false));
                }
                p8.r();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f4101b).getContext().obtainStyledAttributes(attributeSet, g.a.i, i, 0);
                try {
                    boolean z9 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    d(z9);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public i1.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        l6.c cVar = (l6.c) this.f4102c;
        if (inputConnection == null) {
            cVar.getClass();
            inputConnection = null;
        } else {
            k2.c cVar2 = (k2.c) cVar.f3791b;
            cVar2.getClass();
            if (!(inputConnection instanceof i1.b)) {
                inputConnection = new i1.b((EditText) cVar2.f3363b, inputConnection, editorInfo);
            }
        }
        return (i1.b) inputConnection;
    }

    public void d(boolean z9) {
        i1.i iVar = (i1.i) ((k2.c) ((l6.c) this.f4102c).f3791b).f3364c;
        if (iVar.f2273c != z9) {
            if (iVar.f2272b != null) {
                g1.i a10 = g1.i.a();
                i1.h hVar = iVar.f2272b;
                a10.getClass();
                p0.e.d(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a10.f1648a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a10.f1649b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f2273c = z9;
            if (z9) {
                i1.i.a(iVar.f2271a, g1.i.a().b());
            }
        }
    }

    public Drawable e(Drawable drawable, boolean z9) {
        if (drawable instanceof i0.a) {
            ((i0.b) ((i0.a) drawable)).getClass();
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = e(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i9 = 0; i9 < numberOfLayers; i9++) {
                layerDrawable2.setId(i9, layerDrawable.getId(i9));
                layerDrawable2.setLayerGravity(i9, layerDrawable.getLayerGravity(i9));
                layerDrawable2.setLayerWidth(i9, layerDrawable.getLayerWidth(i9));
                layerDrawable2.setLayerHeight(i9, layerDrawable.getLayerHeight(i9));
                layerDrawable2.setLayerInsetLeft(i9, layerDrawable.getLayerInsetLeft(i9));
                layerDrawable2.setLayerInsetRight(i9, layerDrawable.getLayerInsetRight(i9));
                layerDrawable2.setLayerInsetTop(i9, layerDrawable.getLayerInsetTop(i9));
                layerDrawable2.setLayerInsetBottom(i9, layerDrawable.getLayerInsetBottom(i9));
                layerDrawable2.setLayerInsetStart(i9, layerDrawable.getLayerInsetStart(i9));
                layerDrawable2.setLayerInsetEnd(i9, layerDrawable.getLayerInsetEnd(i9));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.f4102c) == null) {
                this.f4102c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z9 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    public c0(AbsSeekBar absSeekBar) {
        this.f4101b = absSeekBar;
    }

    public c0(EditText editText) {
        this.f4101b = editText;
        this.f4102c = new l6.c(editText);
    }
}
