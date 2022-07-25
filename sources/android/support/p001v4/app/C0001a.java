package android.support.p001v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: android.support.v4.app.a */
public interface C0001a extends IInterface {

    /* renamed from: android.support.v4.app.a$a */
    public static abstract class C0002a extends Binder implements C0001a {

        /* renamed from: android.support.v4.app.a$a$a */
        private static class C0003a implements C0001a {

            /* renamed from: a */
            private IBinder f0a;

            C0003a(IBinder iBinder) {
                this.f0a = iBinder;
            }

            /* renamed from: a */
            public void mo1a(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    this.f0a.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo2a(String str, int i, String str2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    this.f0a.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo3a(String str, int i, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f0a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f0a;
            }
        }

        /* renamed from: a */
        public static C0001a m4a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0001a)) ? new C0003a(iBinder) : (C0001a) queryLocalInterface;
        }
    }

    /* renamed from: a */
    void mo1a(String str);

    /* renamed from: a */
    void mo2a(String str, int i, String str2);

    /* renamed from: a */
    void mo3a(String str, int i, String str2, Notification notification);
}
