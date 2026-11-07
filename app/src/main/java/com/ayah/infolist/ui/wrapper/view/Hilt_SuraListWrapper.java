package com.ayah.feature.infolist.ui.wrapper.view;

import K4.d;
import R4.c;
import android.content.Context;
import p025c4.a;
import p030c9.f;
import p035d3.u;
import p035d3.v;
import p051e9.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class Hilt_SuraListWrapper extends BaseListWrapper implements b {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public f f13786x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f13787y;

    public Hilt_SuraListWrapper(Context context) {
        super(context);
        if (isInEditMode() || this.f13787y) {
            return;
        }
        this.f13787y = true;
        SuraListWrapper suraListWrapper = (SuraListWrapper) this;
        u uVar = ((v) ((c) c())).f15683a;
        suraListWrapper.f13782v = (d) uVar.Q.get();
        suraListWrapper.f13783w = (a) uVar.f15645D.get();
    }

    @Override // p051e9.b
    public final Object c() {
        if (this.f13786x == null) {
            this.f13786x = new f(this);
        }
        return this.f13786x.c();
    }
}
