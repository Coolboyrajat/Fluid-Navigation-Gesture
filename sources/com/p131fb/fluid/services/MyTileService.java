package com.p131fb.fluid.services;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import com.p131fb.fluid.p135l.p139p.C1776l;
import com.p131fb.fluid.p135l.p140q.C1785b;
import com.p131fb.fluid.p135l.p142s.C1795a;
import com.p131fb.fluid.p148ui.ActivitySettings;
import com.p131fb.fluid.utils.preferences.C2527h;
import kotlin.C3256e;
import kotlin.p192b0.C3208i;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3379t;
import kotlin.p205x.p207d.C3380u;
import kotlin.p205x.p207d.C3384y;
import p190io.objectbox.android.C3148R;

@SuppressLint({"Override"})
@TargetApi(24)
/* renamed from: com.fb.fluid.services.MyTileService */
public final class MyTileService extends TileService {

    /* renamed from: g */
    static final /* synthetic */ C3208i[] f5114g;

    /* renamed from: f */
    private final C3256e f5115f = C3258g.m11969a(new C1799a(this));

    /* renamed from: com.fb.fluid.services.MyTileService$a */
    static final class C1799a extends C3371l implements C3349a<C2527h> {

        /* renamed from: g */
        final /* synthetic */ MyTileService f5116g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1799a(MyTileService myTileService) {
            super(0);
            this.f5116g = myTileService;
        }

        public final C2527h invoke() {
            Context baseContext = this.f5116g.getBaseContext();
            C3370k.m12223a((Object) baseContext, "baseContext");
            return new C2527h(baseContext);
        }
    }

    static {
        C3380u uVar = new C3380u(C3384y.m12254a(MyTileService.class), "preferences", "getPreferences()Lcom/fb/fluid/utils/preferences/SharedPrefHelper;");
        C3384y.m12259a((C3379t) uVar);
        f5114g = new C3208i[]{uVar};
    }

    /* renamed from: a */
    private final C2527h m7562a() {
        C3256e eVar = this.f5115f;
        C3208i iVar = f5114g[0];
        return (C2527h) eVar.getValue();
    }

    /* renamed from: b */
    private final void m7563b() {
        try {
            Tile qsTile = getQsTile();
            if (qsTile != null) {
                qsTile.setIcon(Icon.createWithResource(getBaseContext(), C3148R.C3149drawable.ic_main_fng));
                qsTile.setLabel(getString(C3148R.string.tile_toggle_fluid));
                qsTile.setContentDescription(getString(C3148R.string.tile_toggle_fluid));
                qsTile.setState(m7562a().mo7498K() ? 2 : 1);
                qsTile.updateTile();
            }
        } catch (Exception e) {
            C1776l.m7478a("tile.e: " + e.getMessage(), (String) null, 1, (Object) null);
        }
    }

    public void onClick() {
        if (!(C1785b.C1786a.m7502a(C1785b.f5090a, this, (String) null, (String) null, 6, (Object) null) && C1795a.f5111a.mo6584a(this))) {
            startActivity(new Intent(getBaseContext(), ActivitySettings.class));
            return;
        }
        m7562a().mo7515d(true ^ m7562a().mo7498K());
        m7563b();
    }

    public void onStartListening() {
        m7563b();
    }

    public void onStopListening() {
    }

    public void onTileAdded() {
    }

    public void onTileRemoved() {
    }
}
