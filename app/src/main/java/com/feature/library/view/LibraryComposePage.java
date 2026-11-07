package com.ayah.feature.library.view;

import C4.g;
import K9.AbstractC0405x;
import N9.D;
import N9.E;
import N9.U;
import N9.k0;
import O9.k;
import P9.d;
import U6.C0532j;
import Z0.B;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.ayah.MainActivity;
import p035d3.u;
import p035d3.v;
import p106k4.a;
import p107k5.e;
import p150o9.i;
import p174r3.c;
import p174r3.l;
import p218w3.f;
import p218w3.j;
import p218w3.n;

/* JADX INFO: loaded from: classes.dex */
public final class LibraryComposePage extends Hilt_LibraryComposePage {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f13804x = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f13805t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public a f13806u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public e f13807v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p046e4.e f13808w;

    /* JADX WARN: Multi-variable type inference failed */
    public LibraryComposePage(MainActivity mainActivity, int i10) {
        super(mainActivity);
        if (!isInEditMode() && !this.f13803s) {
            this.f13803s = true;
            v vVar = (v) ((p116l5.d) c());
            vVar.getClass();
            this.f13806u = new a();
            u uVar = vVar.f15683a;
            this.f13807v = new e((f) uVar.f15680x.get(), u.a(), (c) uVar.f15667k.get(), (n) vVar.f15684b.f15629d.get(), (l) uVar.f15674r.get());
            p035d3.l lVar = vVar.f15685c;
            this.f13808w = new p046e4.e(lVar.a(), new X4.c(new C0532j(26)), new B(9, new C0532j(26)), new L5.c((j) lVar.f15618b.f15681y.get(), (T3.a) lVar.f15621e.get()));
        }
        this.f13805t = AbstractC0405x.d();
        k0 k0Var = getLibraryPagePresenter().f19030f;
        Integer numValueOf = Integer.valueOf(i10);
        k0Var.getClass();
        k0Var.n(null, numValueOf);
        e libraryPagePresenter = getLibraryPagePresenter();
        C4.e eVar = new C4.e(16, new U(libraryPagePresenter.f19030f));
        D d5 = new D((p150o9.c) null, libraryPagePresenter, 2);
        int i11 = E.f6087a;
        g gVar = new g(new k(d5, eVar, i.f20380r, -2, M9.a.f5830r), libraryPagePresenter, 18);
        int i12 = 0;
        ComposeView composeView = new ComposeView(mainActivity, 0 == true ? 1 : 0, 6, i12);
        composeView.setContent(new p074h0.d(576248484, new p116l5.a(this, gVar, mainActivity, i12), true));
        addView(composeView, new FrameLayout.LayoutParams(-1, -1));
    }

    public final a getAyahTextFormatter() {
        a aVar = this.f13806u;
        if (aVar != null) {
            return aVar;
        }
        p251z9.j.k("ayahTextFormatter");
        throw null;
    }

    public final e getLibraryPagePresenter() {
        e eVar = this.f13807v;
        if (eVar != null) {
            return eVar;
        }
        p251z9.j.k("libraryPagePresenter");
        throw null;
    }

    public final p046e4.e getShareUtil() {
        p046e4.e eVar = this.f13808w;
        if (eVar != null) {
            return eVar;
        }
        p251z9.j.k("shareUtil");
        throw null;
    }

    public final void setAyahTextFormatter(a aVar) {
        p251z9.j.e(aVar, "<set-?>");
        this.f13806u = aVar;
    }

    public final void setLibraryPagePresenter(e eVar) {
        p251z9.j.e(eVar, "<set-?>");
        this.f13807v = eVar;
    }

    public final void setShareUtil(p046e4.e eVar) {
        p251z9.j.e(eVar, "<set-?>");
        this.f13808w = eVar;
    }
}
