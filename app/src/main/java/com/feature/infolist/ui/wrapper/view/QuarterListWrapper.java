package com.ayah.feature.infolist.ui.wrapper.view;

import A.C0040q0;
import K0.C0362p;
import K4.c;
import K4.d;
import N9.AbstractC0419l;
import O4.b;
import android.content.Context;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class QuarterListWrapper extends Hilt_QuarterListWrapper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuarterListWrapper(Context context) {
        super(context);
        j.e(context, "context");
        setLayoutDirection(1);
        b(new b(context, new C0362p(2, getPresenter(), d.class, "jumpToAyah", "jumpToAyah(II)V", 0, 0, 5), new C0362p(2, getPresenter(), d.class, "jumpToAyah", "jumpToAyah(II)V", 0, 0, 6)));
    }

    @Override // com.ayah.feature.infolist.ui.wrapper.view.BaseListWrapper
    public final Object a(C0040q0 c0040q0) {
        return AbstractC0419l.q(getPresenter().a(), new K4.b(2, null, 0), c0040q0);
    }

    @Override // com.ayah.feature.infolist.ui.wrapper.view.BaseListWrapper
    public final H2.j d() {
        d presenter = getPresenter();
        return new H2.j(presenter.a(), presenter.f5240d, new c(3, null, 0));
    }
}
