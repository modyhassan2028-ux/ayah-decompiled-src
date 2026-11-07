package com.ayah.feature.ayahmenu.ui.wrapper;

import F4.d;
import I4.h;
import K9.AbstractC0405x;
import N9.AbstractC0419l;
import N9.C0424q;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.ayah.MainActivity;
import p035d3.u;
import p035d3.v;
import p124m3.j;
import p144o3.a;
import p189t3.b;
import p198u3.e;
import p198u3.f;
import p198u3.l;
import p218w3.c;

/* JADX INFO: loaded from: classes.dex */
public final class AyahMenuWrapper extends Hilt_AyahMenuWrapper {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f13763v = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j f13764t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public d f13765u;

    /* JADX WARN: Multi-variable type inference failed */
    public AyahMenuWrapper(MainActivity mainActivity, j jVar) {
        super(mainActivity);
        if (!isInEditMode() && !this.f13767s) {
            this.f13767s = true;
            v vVar = (v) ((h) c());
            u uVar = vVar.f15683a;
            p198u3.d dVar = (p198u3.d) uVar.f15678v.get();
            e eVar = (e) uVar.f15654M.get();
            p218w3.j jVar2 = (p218w3.j) uVar.f15681y.get();
            f fVar = (f) uVar.f15652K.get();
            b bVar = (b) uVar.f15657P.get();
            F4.f fVar2 = new F4.f(u.a());
            F4.f fVar3 = new F4.f((p218w3.f) uVar.f15680x.get());
            u uVar2 = vVar.f15683a;
            this.f13765u = new d(dVar, eVar, jVar2, fVar, bVar, fVar2, fVar3, new O3.d((p198u3.d) uVar2.f15678v.get(), u.a(), (c) uVar2.f15642A.get()), (l) uVar.f15649H.get(), (p144o3.e) uVar.f15682z.get(), (a) uVar.f15647F.get());
        }
        this.f13764t = jVar;
        P9.d dVarD = AbstractC0405x.d();
        int i10 = 0;
        ComposeView composeView = new ComposeView(mainActivity, null, 6, i10);
        composeView.setContent(new p074h0.d(-463884463, new I4.a(i10, this, mainActivity), true));
        addView(composeView, new FrameLayout.LayoutParams(-1, -2));
        AbstractC0419l.u(new C0424q(getPresenter().f2388p, new B2.d(this, 0 == true ? 1 : 0, 5), 2), dVarD);
    }

    public final d getPresenter() {
        d dVar = this.f13765u;
        if (dVar != null) {
            return dVar;
        }
        p251z9.j.k("presenter");
        throw null;
    }

    public final void setPresenter(d dVar) {
        p251z9.j.e(dVar, "<set-?>");
        this.f13765u = dVar;
    }
}
