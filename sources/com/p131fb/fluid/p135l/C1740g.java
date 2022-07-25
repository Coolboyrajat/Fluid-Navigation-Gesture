package com.p131fb.fluid.p135l;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import com.p131fb.fluid.p135l.p139p.C1776l;
import kotlin.p205x.p207d.C3370k;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.l.g */
public final class C1740g {

    /* renamed from: a */
    private MediaPlayer f5045a;

    /* renamed from: b */
    private float f5046b;

    /* renamed from: c */
    private final Context f5047c;

    public C1740g(Context context) {
        C3370k.m12227b(context, "context");
        this.f5047c = context;
    }

    /* renamed from: a */
    public final void mo6484a() {
        try {
            MediaPlayer mediaPlayer = this.f5045a;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            this.f5045a = null;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo6485a(int i) {
        this.f5046b = i > 0 ? ((float) i) / 7.0f : 0.0f;
        try {
            MediaPlayer mediaPlayer = this.f5045a;
            if (mediaPlayer != null) {
                mediaPlayer.setVolume(this.f5046b, this.f5046b);
            }
        } catch (Exception e) {
            C1776l.m7478a("setLevel.e: " + e.getMessage(), (String) null, 1, (Object) null);
        }
    }

    /* renamed from: b */
    public final void mo6486b() {
        mo6484a();
        try {
            Context context = this.f5047c;
            AudioAttributes.Builder legacyStreamType = new AudioAttributes.Builder().setUsage(10).setLegacyStreamType(1);
            MediaPlayer mediaPlayer = this.f5045a;
            if (mediaPlayer != null) {
                mediaPlayer.setVolume(this.f5046b, this.f5046b);
            }
            this.f5045a = MediaPlayer.create(context, C3148R.raw.pop, legacyStreamType.build(), 0);
        } catch (Exception unused) {
            this.f5045a = null;
        }
    }

    /* renamed from: c */
    public final void mo6487c() {
        MediaPlayer mediaPlayer;
        try {
            if (this.f5046b > ((float) 0) && (mediaPlayer = this.f5045a) != null) {
                mediaPlayer.start();
            }
        } catch (Exception unused) {
        }
    }
}
