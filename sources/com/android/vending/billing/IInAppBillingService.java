package com.android.vending.billing;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

public interface IInAppBillingService extends IInterface {

    public static abstract class Stub extends Binder implements IInAppBillingService {

        private static class Proxy implements IInAppBillingService {

            /* renamed from: a */
            private IBinder f4899a;

            Proxy(IBinder iBinder) {
                this.f4899a = iBinder;
            }

            /* renamed from: a */
            public int mo6329a(int i, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f4899a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public Bundle mo6330a(int i, String str, String str2, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4899a.transact(902, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public Bundle mo6331a(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle2 != null) {
                        obtain.writeInt(1);
                        bundle2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4899a.transact(901, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public Bundle mo6332a(int i, String str, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.f4899a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public Bundle mo6333a(int i, String str, String str2, String str3, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4899a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public Bundle mo6334a(int i, String str, String str2, String str3, String str4) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    this.f4899a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public Bundle mo6335a(int i, String str, String str2, String str3, String str4, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4899a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public Bundle mo6336a(int i, String str, List<String> list, String str2, String str3, String str4) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeStringList(list);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    this.f4899a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4899a;
            }

            /* renamed from: b */
            public int mo6337b(int i, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f4899a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public Bundle mo6339b(int i, String str, String str2, String str3, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4899a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public Bundle mo6341c(int i, String str, String str2, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4899a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public Bundle mo6343d(int i, String str, String str2, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4899a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.android.vending.billing.IInAppBillingService");
        }

        /* renamed from: a */
        public static IInAppBillingService m7189a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IInAppBillingService)) ? new Proxy(iBinder) : (IInAppBillingService) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v30, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v34, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v41, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: android.os.Bundle} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r12, android.os.Parcel r13, android.os.Parcel r14, int r15) {
            /*
                r11 = this;
                r0 = 801(0x321, float:1.122E-42)
                r1 = 0
                r2 = 0
                r3 = 1
                java.lang.String r4 = "com.android.vending.billing.IInAppBillingService"
                if (r12 == r0) goto L_0x0294
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r12 == r0) goto L_0x0290
                r0 = 901(0x385, float:1.263E-42)
                if (r12 == r0) goto L_0x024b
                r0 = 902(0x386, float:1.264E-42)
                if (r12 == r0) goto L_0x0219
                switch(r12) {
                    case 1: goto L_0x0204;
                    case 2: goto L_0x01d2;
                    case 3: goto L_0x01a6;
                    case 4: goto L_0x017f;
                    case 5: goto L_0x016a;
                    case 6: goto L_0x0155;
                    case 7: goto L_0x0125;
                    case 8: goto L_0x00e9;
                    case 9: goto L_0x00b1;
                    case 10: goto L_0x0088;
                    case 11: goto L_0x0050;
                    case 12: goto L_0x001e;
                    default: goto L_0x0019;
                }
            L_0x0019:
                boolean r12 = super.onTransact(r12, r13, r14, r15)
                return r12
            L_0x001e:
                r13.enforceInterface(r4)
                int r12 = r13.readInt()
                java.lang.String r15 = r13.readString()
                java.lang.String r0 = r13.readString()
                int r4 = r13.readInt()
                if (r4 == 0) goto L_0x003c
                android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
                java.lang.Object r13 = r1.createFromParcel(r13)
                r1 = r13
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x003c:
                android.os.Bundle r12 = r11.mo6343d(r12, r15, r0, r1)
                r14.writeNoException()
                if (r12 == 0) goto L_0x004c
                r14.writeInt(r3)
                r12.writeToParcel(r14, r3)
                goto L_0x004f
            L_0x004c:
                r14.writeInt(r2)
            L_0x004f:
                return r3
            L_0x0050:
                r13.enforceInterface(r4)
                int r5 = r13.readInt()
                java.lang.String r6 = r13.readString()
                java.lang.String r7 = r13.readString()
                java.lang.String r8 = r13.readString()
                int r12 = r13.readInt()
                if (r12 == 0) goto L_0x0072
                android.os.Parcelable$Creator r12 = android.os.Bundle.CREATOR
                java.lang.Object r12 = r12.createFromParcel(r13)
                r1 = r12
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0072:
                r9 = r1
                r4 = r11
                android.os.Bundle r12 = r4.mo6333a((int) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (android.os.Bundle) r9)
                r14.writeNoException()
                if (r12 == 0) goto L_0x0084
                r14.writeInt(r3)
                r12.writeToParcel(r14, r3)
                goto L_0x0087
            L_0x0084:
                r14.writeInt(r2)
            L_0x0087:
                return r3
            L_0x0088:
                r13.enforceInterface(r4)
                int r12 = r13.readInt()
                java.lang.String r15 = r13.readString()
                java.lang.String r0 = r13.readString()
                int r2 = r13.readInt()
                if (r2 == 0) goto L_0x00a6
                android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
                java.lang.Object r13 = r1.createFromParcel(r13)
                r1 = r13
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x00a6:
                int r12 = r11.mo6338b(r12, r15, r0, r1)
            L_0x00aa:
                r14.writeNoException()
                r14.writeInt(r12)
                return r3
            L_0x00b1:
                r13.enforceInterface(r4)
                int r5 = r13.readInt()
                java.lang.String r6 = r13.readString()
                java.lang.String r7 = r13.readString()
                java.lang.String r8 = r13.readString()
                int r12 = r13.readInt()
                if (r12 == 0) goto L_0x00d3
                android.os.Parcelable$Creator r12 = android.os.Bundle.CREATOR
                java.lang.Object r12 = r12.createFromParcel(r13)
                r1 = r12
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x00d3:
                r9 = r1
                r4 = r11
                android.os.Bundle r12 = r4.mo6339b(r5, r6, r7, r8, r9)
                r14.writeNoException()
                if (r12 == 0) goto L_0x00e5
                r14.writeInt(r3)
                r12.writeToParcel(r14, r3)
                goto L_0x00e8
            L_0x00e5:
                r14.writeInt(r2)
            L_0x00e8:
                return r3
            L_0x00e9:
                r13.enforceInterface(r4)
                int r5 = r13.readInt()
                java.lang.String r6 = r13.readString()
                java.lang.String r7 = r13.readString()
                java.lang.String r8 = r13.readString()
                java.lang.String r9 = r13.readString()
                int r12 = r13.readInt()
                if (r12 == 0) goto L_0x010f
                android.os.Parcelable$Creator r12 = android.os.Bundle.CREATOR
                java.lang.Object r12 = r12.createFromParcel(r13)
                r1 = r12
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x010f:
                r10 = r1
                r4 = r11
                android.os.Bundle r12 = r4.mo6335a((int) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (android.os.Bundle) r10)
                r14.writeNoException()
                if (r12 == 0) goto L_0x0121
                r14.writeInt(r3)
                r12.writeToParcel(r14, r3)
                goto L_0x0124
            L_0x0121:
                r14.writeInt(r2)
            L_0x0124:
                return r3
            L_0x0125:
                r13.enforceInterface(r4)
                int r5 = r13.readInt()
                java.lang.String r6 = r13.readString()
                java.util.ArrayList r7 = r13.createStringArrayList()
                java.lang.String r8 = r13.readString()
                java.lang.String r9 = r13.readString()
                java.lang.String r10 = r13.readString()
                r4 = r11
                android.os.Bundle r12 = r4.mo6336a((int) r5, (java.lang.String) r6, (java.util.List<java.lang.String>) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10)
                r14.writeNoException()
                if (r12 == 0) goto L_0x0151
                r14.writeInt(r3)
                r12.writeToParcel(r14, r3)
                goto L_0x0154
            L_0x0151:
                r14.writeInt(r2)
            L_0x0154:
                return r3
            L_0x0155:
                r13.enforceInterface(r4)
                int r12 = r13.readInt()
                java.lang.String r15 = r13.readString()
                java.lang.String r13 = r13.readString()
                int r12 = r11.mo6340c(r12, r15, r13)
                goto L_0x00aa
            L_0x016a:
                r13.enforceInterface(r4)
                int r12 = r13.readInt()
                java.lang.String r15 = r13.readString()
                java.lang.String r13 = r13.readString()
                int r12 = r11.mo6337b(r12, r15, r13)
                goto L_0x00aa
            L_0x017f:
                r13.enforceInterface(r4)
                int r12 = r13.readInt()
                java.lang.String r15 = r13.readString()
                java.lang.String r0 = r13.readString()
                java.lang.String r13 = r13.readString()
                android.os.Bundle r12 = r11.mo6332a((int) r12, (java.lang.String) r15, (java.lang.String) r0, (java.lang.String) r13)
                r14.writeNoException()
                if (r12 == 0) goto L_0x01a2
                r14.writeInt(r3)
                r12.writeToParcel(r14, r3)
                goto L_0x01a5
            L_0x01a2:
                r14.writeInt(r2)
            L_0x01a5:
                return r3
            L_0x01a6:
                r13.enforceInterface(r4)
                int r5 = r13.readInt()
                java.lang.String r6 = r13.readString()
                java.lang.String r7 = r13.readString()
                java.lang.String r8 = r13.readString()
                java.lang.String r9 = r13.readString()
                r4 = r11
                android.os.Bundle r12 = r4.mo6334a((int) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9)
                r14.writeNoException()
                if (r12 == 0) goto L_0x01ce
                r14.writeInt(r3)
                r12.writeToParcel(r14, r3)
                goto L_0x01d1
            L_0x01ce:
                r14.writeInt(r2)
            L_0x01d1:
                return r3
            L_0x01d2:
                r13.enforceInterface(r4)
                int r12 = r13.readInt()
                java.lang.String r15 = r13.readString()
                java.lang.String r0 = r13.readString()
                int r4 = r13.readInt()
                if (r4 == 0) goto L_0x01f0
                android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
                java.lang.Object r13 = r1.createFromParcel(r13)
                r1 = r13
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x01f0:
                android.os.Bundle r12 = r11.mo6341c(r12, r15, r0, r1)
                r14.writeNoException()
                if (r12 == 0) goto L_0x0200
                r14.writeInt(r3)
                r12.writeToParcel(r14, r3)
                goto L_0x0203
            L_0x0200:
                r14.writeInt(r2)
            L_0x0203:
                return r3
            L_0x0204:
                r13.enforceInterface(r4)
                int r12 = r13.readInt()
                java.lang.String r15 = r13.readString()
                java.lang.String r13 = r13.readString()
                int r12 = r11.mo6329a(r12, r15, r13)
                goto L_0x00aa
            L_0x0219:
                r13.enforceInterface(r4)
                int r12 = r13.readInt()
                java.lang.String r15 = r13.readString()
                java.lang.String r0 = r13.readString()
                int r4 = r13.readInt()
                if (r4 == 0) goto L_0x0237
                android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
                java.lang.Object r13 = r1.createFromParcel(r13)
                r1 = r13
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0237:
                android.os.Bundle r12 = r11.mo6330a((int) r12, (java.lang.String) r15, (java.lang.String) r0, (android.os.Bundle) r1)
                r14.writeNoException()
                if (r12 == 0) goto L_0x0247
                r14.writeInt(r3)
                r12.writeToParcel(r14, r3)
                goto L_0x024a
            L_0x0247:
                r14.writeInt(r2)
            L_0x024a:
                return r3
            L_0x024b:
                r13.enforceInterface(r4)
                int r5 = r13.readInt()
                java.lang.String r6 = r13.readString()
                java.lang.String r7 = r13.readString()
                int r12 = r13.readInt()
                if (r12 == 0) goto L_0x026a
                android.os.Parcelable$Creator r12 = android.os.Bundle.CREATOR
                java.lang.Object r12 = r12.createFromParcel(r13)
                android.os.Bundle r12 = (android.os.Bundle) r12
                r8 = r12
                goto L_0x026b
            L_0x026a:
                r8 = r1
            L_0x026b:
                int r12 = r13.readInt()
                if (r12 == 0) goto L_0x027a
                android.os.Parcelable$Creator r12 = android.os.Bundle.CREATOR
                java.lang.Object r12 = r12.createFromParcel(r13)
                r1 = r12
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x027a:
                r9 = r1
                r4 = r11
                android.os.Bundle r12 = r4.mo6331a((int) r5, (java.lang.String) r6, (java.lang.String) r7, (android.os.Bundle) r8, (android.os.Bundle) r9)
                r14.writeNoException()
                if (r12 == 0) goto L_0x028c
                r14.writeInt(r3)
                r12.writeToParcel(r14, r3)
                goto L_0x028f
            L_0x028c:
                r14.writeInt(r2)
            L_0x028f:
                return r3
            L_0x0290:
                r14.writeString(r4)
                return r3
            L_0x0294:
                r13.enforceInterface(r4)
                int r5 = r13.readInt()
                java.lang.String r6 = r13.readString()
                java.lang.String r7 = r13.readString()
                java.lang.String r8 = r13.readString()
                int r12 = r13.readInt()
                if (r12 == 0) goto L_0x02b6
                android.os.Parcelable$Creator r12 = android.os.Bundle.CREATOR
                java.lang.Object r12 = r12.createFromParcel(r13)
                r1 = r12
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x02b6:
                r9 = r1
                r4 = r11
                android.os.Bundle r12 = r4.mo6342c(r5, r6, r7, r8, r9)
                r14.writeNoException()
                if (r12 == 0) goto L_0x02c8
                r14.writeInt(r3)
                r12.writeToParcel(r14, r3)
                goto L_0x02cb
            L_0x02c8:
                r14.writeInt(r2)
            L_0x02cb:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.vending.billing.IInAppBillingService.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    int mo6329a(int i, String str, String str2);

    /* renamed from: a */
    Bundle mo6330a(int i, String str, String str2, Bundle bundle);

    /* renamed from: a */
    Bundle mo6331a(int i, String str, String str2, Bundle bundle, Bundle bundle2);

    /* renamed from: a */
    Bundle mo6332a(int i, String str, String str2, String str3);

    /* renamed from: a */
    Bundle mo6333a(int i, String str, String str2, String str3, Bundle bundle);

    /* renamed from: a */
    Bundle mo6334a(int i, String str, String str2, String str3, String str4);

    /* renamed from: a */
    Bundle mo6335a(int i, String str, String str2, String str3, String str4, Bundle bundle);

    /* renamed from: a */
    Bundle mo6336a(int i, String str, List<String> list, String str2, String str3, String str4);

    /* renamed from: b */
    int mo6337b(int i, String str, String str2);

    /* renamed from: b */
    int mo6338b(int i, String str, String str2, Bundle bundle);

    /* renamed from: b */
    Bundle mo6339b(int i, String str, String str2, String str3, Bundle bundle);

    /* renamed from: c */
    int mo6340c(int i, String str, String str2);

    /* renamed from: c */
    Bundle mo6341c(int i, String str, String str2, Bundle bundle);

    /* renamed from: c */
    Bundle mo6342c(int i, String str, String str2, String str3, Bundle bundle);

    /* renamed from: d */
    Bundle mo6343d(int i, String str, String str2, Bundle bundle);
}
