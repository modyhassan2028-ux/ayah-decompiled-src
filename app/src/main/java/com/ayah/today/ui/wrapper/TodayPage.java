package com.ayah.feature.today.ui.wrapper;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import p035d3.u;
import p035d3.v;
import p057f4.c;
import p059f6.b;
import p074h0.d;
import p080h6.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class TodayPage extends Hilt_TodayPage {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f13902v = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b f13903t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c f13904u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TodayPage(Context context) {
        super(context);
        j.e(context, "context");
        if (!isInEditMode() && !this.f13901s) {
            this.f13901s = true;
            v vVar = (v) ((p080h6.b) c());
            u uVar = vVar.f15683a;
            this.f13903t = new b(u.a());
            this.f13904u = vVar.f15685c.a();
        }
        int i10 = 0;
        ComposeView composeView = new ComposeView(context, null, 6, i10);
        composeView.setContent(new d(2045234246, new a(this, context, i10), true));
        addView(composeView, new FrameLayout.LayoutParams(-1, -1));
    }

    public final b getPresenter() {
        b bVar = this.f13903t;
        if (bVar != null) {
            return bVar;
        }
        j.k("presenter");
        throw null;
    }

    public final c getQuranShareUtil() {
        c cVar = this.f13904u;
        if (cVar != null) {
            return cVar;
        }
        j.k("quranShareUtil");
        throw null;
    }

    public final void setPresenter(b bVar) {
        j.e(bVar, "<set-?>");
        this.f13903t = bVar;
    }

    public final void setQuranShareUtil(c cVar) {
        j.e(cVar, "<set-?>");
        this.f13904u = cVar;
    }
}
