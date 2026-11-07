package com.ayah.feature.infolist.ui.wrapper.compose;

import android.widget.FrameLayout;
import p030c9.f;
import p051e9.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class Hilt_SuraListWrapper extends FrameLayout implements b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f f13772r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13773s;

    @Override // p051e9.b
    public final Object c() {
        if (this.f13772r == null) {
            this.f13772r = new f(this);
        }
        return this.f13772r.c();
    }
}
