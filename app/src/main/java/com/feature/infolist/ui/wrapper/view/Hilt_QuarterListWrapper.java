package com.ayah.feature.infolist.ui.wrapper.view;

import K4.d;
import android.content.Context;
import p025c4.a;
import p030c9.f;
import p035d3.u;
import p035d3.v;
import p051e9.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class Hilt_QuarterListWrapper extends BaseListWrapper implements b {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public f f13784x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f13785y;

    public Hilt_QuarterListWrapper(Context context) {
        super(context);
        if (isInEditMode() || this.f13785y) {
            return;
        }
        this.f13785y = true;
        QuarterListWrapper quarterListWrapper = (QuarterListWrapper) this;
        u uVar = ((v) ((R4.b) c())).f15683a;
        quarterListWrapper.f13782v = (d) uVar.Q.get();
        quarterListWrapper.f13783w = (a) uVar.f15645D.get();
    }

    @Override // p051e9.b
    public final Object c() {
        if (this.f13784x == null) {
            this.f13784x = new f(this);
        }
        return this.f13784x.c();
    }
}
