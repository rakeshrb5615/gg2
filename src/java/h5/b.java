package h5;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final x1.d f2211a = new Object();

    public static Task a(Task task, Task task2) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        a aVar = new a(taskCompletionSource, new AtomicBoolean(false), cancellationTokenSource, 0);
        x1.d dVar = f2211a;
        task.continueWithTask(dVar, aVar);
        task2.continueWithTask(dVar, aVar);
        return taskCompletionSource.getTask();
    }
}
