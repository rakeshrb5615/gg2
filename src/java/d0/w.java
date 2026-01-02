package d0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class w implements Handler.Callback, ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1051a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f1052b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f1053c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public HashSet f1054d = new HashSet();

    public w(Context context) {
        this.f1051a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f1052b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(v vVar) {
        boolean z9;
        ArrayDeque arrayDeque = vVar.f1049d;
        ComponentName componentName = vVar.f1046a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (vVar.f1047b) {
            z9 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f1051a;
            boolean bindService = context.bindService(component, this, 33);
            vVar.f1047b = bindService;
            if (bindService) {
                vVar.f1050e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z9 = vVar.f1047b;
        }
        if (!z9 || vVar.f1048c == null) {
            b(vVar);
            return;
        }
        while (true) {
            t tVar = (t) arrayDeque.peek();
            if (tVar == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + tVar);
                }
                tVar.a(vVar.f1048c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e9) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e9);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(vVar);
    }

    public final void b(v vVar) {
        ComponentName componentName = vVar.f1046a;
        ArrayDeque arrayDeque = vVar.f1049d;
        Handler handler = this.f1052b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = vVar.f1050e;
        int i9 = i + 1;
        vVar.f1050e = i9;
        if (i9 <= 6) {
            int i10 = (1 << i) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i10 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i10);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + vVar.f1050e + " retries");
        arrayDeque.clear();
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [b.a, java.lang.Object] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        b.c cVar = null;
        if (i == 0) {
            t tVar = (t) message.obj;
            String string = Settings.Secure.getString(this.f1051a.getContentResolver(), "enabled_notification_listeners");
            synchronized (x.f1055b) {
                if (string != null) {
                    try {
                        if (!string.equals(x.f1056c)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            x.f1057d = hashSet2;
                            x.f1056c = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = x.f1057d;
            }
            if (!hashSet.equals(this.f1054d)) {
                this.f1054d = hashSet;
                List<ResolveInfo> queryIntentServices = this.f1051a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName2 = (ComponentName) it.next();
                    if (!this.f1053c.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f1053c.put(componentName2, new v(componentName2));
                    }
                }
                Iterator it2 = this.f1053c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        v vVar = (v) entry.getValue();
                        if (vVar.f1047b) {
                            this.f1051a.unbindService(this);
                            vVar.f1047b = false;
                        }
                        vVar.f1048c = null;
                        it2.remove();
                    }
                }
            }
            for (v vVar2 : this.f1053c.values()) {
                vVar2.f1049d.add(tVar);
                a(vVar2);
            }
        } else if (i == 1) {
            u uVar = (u) message.obj;
            ComponentName componentName3 = uVar.f1044a;
            IBinder iBinder = uVar.f1045b;
            v vVar3 = (v) this.f1053c.get(componentName3);
            if (vVar3 != null) {
                int i9 = b.b.f680a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(b.c.f681g);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof b.c)) {
                        ?? obj = new Object();
                        obj.f679a = iBinder;
                        cVar = obj;
                    } else {
                        cVar = (b.c) queryLocalInterface;
                    }
                }
                vVar3.f1048c = cVar;
                vVar3.f1050e = 0;
                a(vVar3);
                return true;
            }
        } else if (i == 2) {
            v vVar4 = (v) this.f1053c.get((ComponentName) message.obj);
            if (vVar4 != null) {
                if (vVar4.f1047b) {
                    this.f1051a.unbindService(this);
                    vVar4.f1047b = false;
                }
                vVar4.f1048c = null;
                return true;
            }
        } else if (i != 3) {
            return false;
        } else {
            v vVar5 = (v) this.f1053c.get((ComponentName) message.obj);
            if (vVar5 != null) {
                a(vVar5);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f1052b.obtainMessage(1, new u(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f1052b.obtainMessage(2, componentName).sendToTarget();
    }
}
