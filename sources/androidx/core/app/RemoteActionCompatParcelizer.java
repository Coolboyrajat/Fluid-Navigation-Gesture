package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.C0631a;
import androidx.versionedparcelable.C0633c;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(C0631a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1414a = (IconCompat) aVar.mo3642a(remoteActionCompat.f1414a, 1);
        remoteActionCompat.f1415b = aVar.mo3644a(remoteActionCompat.f1415b, 2);
        remoteActionCompat.f1416c = aVar.mo3644a(remoteActionCompat.f1416c, 3);
        remoteActionCompat.f1417d = (PendingIntent) aVar.mo3641a(remoteActionCompat.f1417d, 4);
        remoteActionCompat.f1418e = aVar.mo3656a(remoteActionCompat.f1418e, 5);
        remoteActionCompat.f1419f = aVar.mo3656a(remoteActionCompat.f1419f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, C0631a aVar) {
        aVar.mo3653a(false, false);
        aVar.mo3662b((C0633c) remoteActionCompat.f1414a, 1);
        aVar.mo3663b(remoteActionCompat.f1415b, 2);
        aVar.mo3663b(remoteActionCompat.f1416c, 3);
        aVar.mo3661b((Parcelable) remoteActionCompat.f1417d, 4);
        aVar.mo3665b(remoteActionCompat.f1418e, 5);
        aVar.mo3665b(remoteActionCompat.f1419f, 6);
    }
}
