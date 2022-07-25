package p054c.p055a.p056a.p060q;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.color.view.ColorCircleView;
import kotlin.p205x.p207d.C3370k;

/* renamed from: c.a.a.q.b */
public final class C1063b extends RecyclerView.C0524d0 implements View.OnClickListener {

    /* renamed from: A */
    private final C1062a f3731A;

    /* renamed from: y */
    private final ColorCircleView f3732y;

    /* renamed from: z */
    private final ImageView f3733z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1063b(View view, C1062a aVar) {
        super(view);
        C3370k.m12227b(view, "itemView");
        C3370k.m12227b(aVar, "adapter");
        this.f3731A = aVar;
        view.setOnClickListener(this);
        this.f3732y = (ColorCircleView) view.findViewById(C1078j.color_view);
        View findViewById = view.findViewById(C1078j.icon);
        C3370k.m12223a((Object) findViewById, "itemView.findViewById(R.id.icon)");
        this.f3733z = (ImageView) findViewById;
    }

    /* renamed from: B */
    public final ColorCircleView mo3763B() {
        return this.f3732y;
    }

    /* renamed from: C */
    public final ImageView mo5131C() {
        return this.f3733z;
    }

    public void onClick(View view) {
        C3370k.m12227b(view, "view");
        this.f3731A.mo5128d(mo3061f());
    }
}
