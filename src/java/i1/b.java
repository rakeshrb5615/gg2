package i1;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import j6.s;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final EditText f2258a;

    /* renamed from: b  reason: collision with root package name */
    public final v3.f f2259b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v0, types: [v3.f, java.lang.Object] */
    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        ?? obj = new Object();
        this.f2258a = editText;
        this.f2259b = obj;
        if (g1.i.f1647k != null) {
            g1.i a10 = g1.i.a();
            if (a10.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            c5.b bVar = a10.f1652e;
            bVar.getClass();
            Bundle bundle = editorInfo.extras;
            h1.b bVar2 = (h1.b) ((s) bVar.f931c).f3282b;
            int b10 = bVar2.b(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", b10 != 0 ? ((ByteBuffer) bVar2.f2147d).getInt(b10 + bVar2.f2144a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i9) {
        Editable editableText = this.f2258a.getEditableText();
        this.f2259b.getClass();
        return v3.f.m(this, editableText, i, i9, false) || super.deleteSurroundingText(i, i9);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i9) {
        Editable editableText = this.f2258a.getEditableText();
        this.f2259b.getClass();
        return v3.f.m(this, editableText, i, i9, true) || super.deleteSurroundingTextInCodePoints(i, i9);
    }
}
